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

WebUI.navigateToUrl('https://holidayolay.3tlstaging.com/login')

WebUI.maximizeWindow()

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_Do Not Sell My Personal Information_cdk_96b7fb'))
WebUI.setText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input_Please Enter you Credentials_mat-input-0'), 
    'pg_olayholiday')

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_Do Not Sell My Personal Information_cdk_96b7fb'))
//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_Password'))
WebUI.setText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input_Username_mat-input-1'), '1q2w3e4r!@#')

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/span_Submit'))

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_Email'))

WebUI.setText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input_WELCOME_mat-input-2'), GlobalVariable.Emailid)

WebUI.setText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input__mat-input-3'), GlobalVariable.Pswd)

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/button_SUBMIT (2)'))

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/ngx-dropzone-label_Click here to upload rec_7b6b3a'))
//WebUI.uploadFile(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/ngx-dropzone-label_Click here to upload rec_7b6b3a'), '/home/knoldus/Pictures/katalon.png')


WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/button_SUBMIT_1'))
WebUI.takeScreenshot()
WebUI.closeBrowser()
