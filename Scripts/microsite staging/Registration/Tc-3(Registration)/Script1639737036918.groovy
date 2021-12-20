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

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/button_SUBMIT (14)'))
WebUI.waitForPageLoad(2)

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_Please enter your first name'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_Please enter your first name'), 
    'Please enter your first name')

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_Please enter your last name'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_Please enter your last name'), 
    'Please enter your last name')

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_Please enter your email'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_Please enter your email'), 
    'Please enter your email')

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_Please confirm the email'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_Please confirm the email'), 
    'Please confirm the email')

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_Password is required'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_Password is required'), 
    'Password is required')

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_Confirm password is required'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_Confirm password is required'), 
    'Confirm password is required')

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_Please enter your address'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_Please enter your address'), 
    'Please enter your address')

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_Please enter valid city'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_Please enter valid city'), 
    'Please enter valid city')

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_Please enter valid state'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_Please enter valid state'), 
    'Please enter valid state')

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_Please enter valid Zip Code'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/mat-error_Please enter valid Zip Code'), 
    'Please enter valid Zip Code')

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/p_Please agree with the above'))

WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/p_Please agree with the above'), 
    'Please agree with the above')

//WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_First Name Please enter your first name_af0647'))

//WebUI.verifyElementText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/div_First Name Please enter your first name_af0647'), 
    //'First Name* Please enter your first name Last Name* Please enter your last name Email* Please enter your email Confirm Email* Please confirm the email Password*visibility_off Password is required Confirm Password* Confirm password is required help Address* Please enter your address City* Please enter valid city State* Please enter valid state Zipcode* Please enter valid Zip Code  By registering, I agree to the Program Terms , P&G Terms and Conditions and Privacy Policy. *Please agree with the abovePlease check the captchaSUBMITAlready a member? Log in here')
WebUI.takeScreenshot()
