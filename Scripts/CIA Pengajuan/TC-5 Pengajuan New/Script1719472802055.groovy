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

WebUI.setText(findTestObject('Object Repository/Form Pengajuan/Page_CIA  Login/input_Sign In_uname'), 'orisys05')

WebUI.setEncryptedText(findTestObject('Object Repository/Form Pengajuan/Page_CIA  Login/input_Sign In_pass'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Form Pengajuan/Page_CIA  Login/button_Sign In'))

WebUI.click(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Menu Pengajuan'))

WebUI.click(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Menu History iDeb New'))

WebUI.click(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Button Act'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('Object Repository/Form Pengajuan/Page_CIA/input__nama'), 'BUMM')

WebUI.click(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Spann Jenis k'))

WebUI.setText(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set text Jenis K'), 'Laki')

WebUI.sendKeys(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set text Jenis K'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/TArea Alamat'), 'JL. Kenari No100 RT/RW 10/12')

WebUI.setText(findTestObject('Page_CIA/input__kota_deb'), 'JAKARTA')

WebUI.setText(findTestObject('Page_CIA/input__kode_pos_deb'), '34001')

WebUI.setText(findTestObject('Page_CIA/input__npwp'), '03789087651567861')

WebUI.setText(findTestObject('Page_CIA/input__tgl_lahir_akta'), '25061999')

WebUI.setText(findTestObject('Page_CIA/input__tempat_lahir'), 'JAKARTA')

WebUI.setText(findTestObject('Page_CIA/input__nama_ibu_deb'), 'TSATMA')

WebUI.setText(findTestObject('Page_CIA/input__debitur_phone_number'), '08912636912')

WebUI.click(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Span Jenis Kred'))

WebUI.setText(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set text Jenis Kred'), 'Modal Kerja')

WebUI.sendKeys(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set text Jenis Kred'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Span Sektor E'))

WebUI.setText(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set Text Sektor E'), 'Konstruksi')

WebUI.sendKeys(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set Text Sektor E'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Span KBLI'))

WebUI.setText(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set Text KBLI'), 'Konstruksi')

WebUI.sendKeys(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set Text KBLI'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Span KKUB'))

WebUI.setText(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set text KKUB'), 'Pengelolaan SDA')

WebUI.sendKeys(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set text KKUB'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Span Bentuk F'))

WebUI.setText(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set text Span Bentuk F'), 'Produktif')

WebUI.sendKeys(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set text Span Bentuk F'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Span Segmentasi'))

WebUI.setText(findTestObject('Page_CIA/set text segmentasi'), 'UKM')

WebUI.sendKeys(findTestObject('Page_CIA/set text segmentasi'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Span Tujuan Pengajuan'))

WebUI.setText(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set text Tujuan Pengajuan'), 'Penilaian Calon')

WebUI.sendKeys(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set text Tujuan Pengajuan'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Page_CIA/textarea_Catatan Pengajuan_catatan_crm'), 'OKE BANGET')

WebUI.click(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Span Bidang usaha'))

WebUI.setText(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set text Bidang usaha'), 'Manufacturing')

WebUI.sendKeys(findTestObject('Form Pengajuan/Page CIA Draft/Input Form/Set text Bidang usaha'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_CIA/label_Tunai'))

WebUI.click(findTestObject('Page_CIA/button_Save'))

WebUI.click(findTestObject('Page_CIA/button_Yes, I am sure'))

WebUI.click(findTestObject('Page_CIA/button_OK'))

WebUI.closeBrowser()

