import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.14.20.48/cia_0158/')

WebUI.setText(findTestObject('Object Repository/Page_CIA  Login/input_Sign In_uname'), 'orisys05')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CIA  Login/input_Sign In_pass'), 'tzH6RvlfSTg=')

WebUI.sendKeys(findTestObject('Object Repository/Page_CIA  Login/input_Sign In_pass'), Keys.chord(Keys.ENTER))

WebUI.rightClick(findTestObject('Object Repository/Page_CIA/a_Pengajuan1'))

WebUI.click(findTestObject('Object Repository/Page_CIA/a_Pengajuan1'))

WebUI.click(findTestObject('Object Repository/Page_CIA/a_New1'))

WebUI.click(findTestObject('Object Repository/Page_CIA/a_Perorangan1'))

WebUI.click(findTestObject('Object Repository/Page_CIA/input_Individu  Perorangan_nik_akta_dhnbi'))

WebUI.setText(findTestObject('Object Repository/Page_CIA/input_Individu  Perorangan_nik_akta_dhnbi'), '2506240000000004')

WebUI.click(findTestObject('Object Repository/Page_CIA/button_Individu  Perorangan_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_CIA/button_Yes, I am sure'))

WebUI.click(findTestObject('Object Repository/Page_CIA/button_OK'))

WebUI.setText(findTestObject('Object Repository/Page_CIA/input__nama'), 'JOKO')

WebUI.click(findTestObject('Object Repository/Page_CIA/span_-- Pilih --'))

WebUI.setText(findTestObject(null), 'LAKI')

WebUI.click(findTestObject(null))

WebUI.click(findTestObject('Object Repository/Page_CIA/button_Save'))

WebUI.click(findTestObject('Object Repository/Page_CIA/button_Yes, I am sure'))

WebUI.click(findTestObject('Object Repository/Page_CIA/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_CIA/a_Log Out'))

