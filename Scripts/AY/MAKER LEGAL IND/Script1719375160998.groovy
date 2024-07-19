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

WebUI.navigateToUrl('http://10.14.21.164:8080/jw/web/userview/ay_test/cia_ay/_/bwmk_reg')

WebUI.click(findTestObject('ANALISA YURIDIS/Page_C I AParameter BWMK Regional/small_Login'))

WebUI.setText(findTestObject('ANALISA YURIDIS/Page_C I AParameter BWMK Regional/input_Username_j_username'), '09087020')

WebUI.setText(findTestObject('ANALISA YURIDIS/Page_C I AParameter BWMK Regional/input_Password_j_password'), 'ika123')

WebUI.click(findTestObject('ANALISA YURIDIS/Page_C I AParameter BWMK Regional/input_Password_submit'))

WebUI.click(findTestObject('ANALISA YURIDIS/Page_C I AAnalisa Yuridis Status/span_Collateral Legal'))

WebUI.click(findTestObject('ANALISA YURIDIS/Page_C I AAnalisa Yuridis Status/span_Analisa Yuridis Individu'))

WebUI.selectOptionByLabel(findTestObject('Page_C I AAnalisa Yuridis Individu/td_SARA'), 'SIRI', false)

WebUI.click(findTestObject('ANALISA YURIDIS/Page_C I AAnalisa Yuridis Individu/a_Analisa'))

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__pekerjaan'), 'KOMISARIS UTAMA PERTAMANA')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__status_marital'), 'Menikah')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__no_kk'), '35678965432156787')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__no_akta_nikah'), '012')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__nama_pj'), 'Andika Pertama')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__alamat_pj'), 'jl. Mampang prapatan Tendean 14251')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__pekerjaan_pj'), 'DIREKSI')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__nik_akta_pj'), '371876542675898765')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__status_pj'), 'Menikah')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__no_kk_pj'), '371876542675898765')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__no_akta_nikah_pj'), '212')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__npwp_pj'), '07319882891')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__akta_pendirian'), '1120')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__tdp_nib'), '880')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__siup_iu'), '7261827')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__domisili_iu'), 'JAKARTA/DEPOK')

WebUI.setText(findTestObject('Page_C I AReview Analisa Yuridis Individu/input__npwp_iu'), '09239128388212312')

WebUI.click(findTestObject('Page_C I AReview Analisa Yuridis Individu/input_Regional Legal Manager_submit'))

