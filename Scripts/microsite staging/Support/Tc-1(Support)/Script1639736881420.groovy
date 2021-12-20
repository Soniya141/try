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
import com.kms.katalon.entity.global.GlobalVariableEntity as GlobalVariableEntity
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('microsite staging/Login/Tc-1(Login)'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/ngx-dropzone_Click here to upload receipt.P_a88ee9'))

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/button_SUPPORT'))

WebUI.setText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input_Support_mat-input-4'), 'Testing')

WebUI.setText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/input__mat-input-5'), 'Testing123@gmail.com')

WebUI.setText(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/textarea__mat-input-6'), 'Testing')

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/span__mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/micro staging/Page_Olay Holiday Program/button_SUBMIT (3)'))
WebUI.verifyTextPresent('Your message has been sent, thank you. We will contact in the next 48hrs', true)
WebUI.takeScreenshot()

