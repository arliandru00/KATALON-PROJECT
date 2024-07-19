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

WebUI.setText(findTestObject('Page_CIA  Login/input_Sign In_uname'), 'Orisys05')

WebUI.setText(findTestObject('Page_CIA  Login/input_Sign In_pass'), '123')

WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA  Login/button_Sign In'))

WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/FORM PENGAJUAN/Page_CIA/a_Pengajuan1'))

WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/a_History iDeb New1'))

WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/td_NO 1'))

WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/a_Dropdown NO 1'))

WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/a_View NO 1'))

//WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/a_Pengajuan1'))
//WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/a_New1'))
//WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/a_Perorangan1'))
//WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Individu  Perorangan_nik_akta_dhnbi'), '2806240000000002')
//WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/i_Individu  Perorangan_fas fa-search'))
//WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/button_Yes, I am sure'))
//WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/FORM PENGAJUAN/button_OK'))
WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input__nama'), 'JELADA A A A A A')

'JENIS KELAMIN\r\n'
WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/span_-- Pilih -- JENIS KELAMIN'))

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field JENIS KELAMIN'), 'LAKI')

WebUI.sendKeys(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field JENIS KELAMIN'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/FORM PENGAJUAN/Page_CIA/textarea__alamat'), 'JL . MELAWAI RAYA JAKARTA SELATAN')

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/FORM PENGAJUAN/Page_CIA/input__kota_deb'), 'JAKARTA SELATAN')

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/FORM PENGAJUAN/Page_CIA/input__kode_pos_deb'), '12345')

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/FORM PENGAJUAN/Page_CIA/input__npwp'), '0617623689126836')

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input__tgl_lahir_akta'), '28062000')

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input__tempat_lahir'), 'JAKARTA')

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input__nama_ibu_deb'), 'LIA')

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input__debitur_phone_number'), '089873172399')

'JENIS KREDIT'
WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/span_-- Pilih -- JENIS KREDIT'))

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field JENIS KREDIT'), 'MODAL KERJA')

WebUI.sendKeys(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field JENIS KREDIT'), Keys.chord(
        Keys.ENTER))

'SEKOM'
WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/span_-- Pilih -- SEKOM'))

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field SEKOM'), 'KONSTRUKSI')

WebUI.sendKeys(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field SEKOM'), Keys.chord(Keys.ENTER))

'KBLI'
WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/span_-- Pilih -- KBLI'))

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field KBLI'), 'KONSTRUKSI')

WebUI.sendKeys(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field KBLI'), Keys.chord(Keys.ENTER))

'KKUB'
WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/span_-- Pilih -- KKUB'))

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field KKUB'), 'BUKAN')

WebUI.sendKeys(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field KKUB'), Keys.chord(Keys.ENTER))

'BENTUK FASILITAS'
WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/span_-- Pilih -- BENTUK FASILITAS'))

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field BENTUK FASILITAS'), 'PRODUKTIF')

WebUI.sendKeys(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field BENTUK FASILITAS'), Keys.chord(
        Keys.ENTER))

'SEGMENTASI'
WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/span_-- Pilih -- SEGMENTASI'))

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field SEGMENTASI'), 'UKM')

WebUI.sendKeys(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field SEGMENTASI'), Keys.chord(
        Keys.ENTER))

'TUJUAN PENGAJUAN'
WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/span_-- Pilih -- TUJUAN PENGAJUAN'))

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field TUJUAN PENGAJUAN'), '01')

WebUI.sendKeys(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field TUJUAN PENGAJUAN'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/textarea_Catatan Pengajuan_catatan_crm CATATAN'), 'PENGAJUAN PERORANGAN')

'BIDANG USAHA'
WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/span_-- Pilih -- BIDANG USAHA'))

WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field BIDANG USAHA'), 'JASA')

WebUI.sendKeys(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field BIDANG USAHA'), Keys.chord(
        Keys.ENTER))

'ERRORRR'
WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/label_Tunai'))

//WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/span_-- Pilih -- FAS KRED'))

//WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_Version_select2-search__field FAS KRED 1'), 'PRK')

//WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_-- Pilih --_plafon_baru 1'), '8000000000')

//WebUI.setText(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/input_-- Pilih --_tenor 1'), '130')

WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/button_Save'))

WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/button_Yes, I am sure'))

WebUI.click(findTestObject('CIA PENGAJUAN - ANDRU/Page_CIA/button_OK'))

