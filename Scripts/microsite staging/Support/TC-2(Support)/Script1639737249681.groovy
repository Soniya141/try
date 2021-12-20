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

WebUI.callTestCase(findTestCase('microsite staging/Login/Tc-1(Login)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/button_SUPPORT'))

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/button_SUBMIT (15)'))

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_NAME IS REQUIRED'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_NAME IS REQUIRED'), 
    'NAME IS REQUIRED')

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_EMAIL IS REQUIRED'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_EMAIL IS REQUIRED'), 
    'EMAIL IS REQUIRED')

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_MESSAGE IS REQUIRED'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_MESSAGE IS REQUIRED'), 
    'MESSAGE IS REQUIRED')

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/p_Please agree with the above'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/p_Please agree with the above'), 
    'Please agree with the above')
WebUI.takeScreenshot()
