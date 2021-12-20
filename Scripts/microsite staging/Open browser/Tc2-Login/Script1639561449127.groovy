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

WebUI.callTestCase(findTestCase('microsite staging/Open browser/Tc-1(Open Browser)'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/div_Username'), 'Username')

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/div_Password'), 'Password')
//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_Do Not Sell My Personal Information_cdk_96b7fb'))
WebUI.sendKeys(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input_Please Enter you Credentials_mat-input-0'), 
    GlobalVariable.LoginUsername)

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_Do Not Sell My Personal Information_cdk_96b7fb'))
not_run: WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_Password'))

WebUI.sendKeys(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input_Username_mat-input-1'), GlobalVariable.Loginpswd)

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/button_Submit'))

