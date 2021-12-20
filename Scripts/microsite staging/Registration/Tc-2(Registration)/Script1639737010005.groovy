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

WebUI.callTestCase(findTestCase('microsite staging/Open browser/Tc2-Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/a_Not registered yet Click here to start yo_c35e26'))

WebUI.sendKeys(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input_REGISTER_mat-input-4'), 'Testing')

WebUI.sendKeys(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input__mat-input-5'), 'Testing')

WebUI.sendKeys(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input__mat-input-6'), 'testing345@yopmail.com')

WebUI.sendKeys(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input__mat-input-7'), 'testing345@yopmail.com')

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_Password'))

WebUI.sendKeys(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input__mat-input-8'), 'Test@123')

WebUI.sendKeys(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input__mat-input-9'), 'Test@123')

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_help Address'))

WebUI.sendKeys(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input__address'), '9800 Fredericksburg Rd, San Antonio, TX 78288, USA')

WebUI.sendKeys(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input__address'), Keys.chord(Keys.DOWN))

WebUI.sendKeys(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input__address'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/span__mat-checkbox-inner-container'))

WebUI.delay(45)

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/button_SUBMIT (9)'))
WebUI.takeScreenshot()
