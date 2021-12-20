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

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/button_Faq'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/button_Faq'), 'FAQ')

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/mat-panel-title_How long do I have to submi_b881c2'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/mat-panel-title_How long do I have to submi_b881c2'), 
    Q1)

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/p_All products must be purchased between 11_3c9c7f'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/p_All products must be purchased between 11_3c9c7f'), 
    A1)

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/mat-panel-title_What do I do if I am having_78c932'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/mat-panel-title_What do I do if I am having_78c932'), 
    Q2)

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/a_support box'))

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/p_You can submit any questions you may have_306d87'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/p_You can submit any questions you may have_306d87'), 
    A2)

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/mat-panel-title_What are the participating _a616ec'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/mat-panel-title_What are the participating _a616ec'), 
    Q3)

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/p_Click here to see the full list of partic_fc02c1'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/p_Click here to see the full list of partic_fc02c1'), 
    A3)

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/mat-panel-title_How many times can I submit_4db6e3'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/mat-panel-title_How many times can I submit_4db6e3'), 
    Q4)

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/p_You can only submit a valid receipt once,_f6b9b0'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/p_You can only submit a valid receipt once,_f6b9b0'), 
    A4)

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/mat-panel-title_How many rewards can I get'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/mat-panel-title_How many rewards can I get'), 
    Q5)

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/p_There is a limit of one reward per email address'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/p_There is a limit of one reward per email address'), 
    A5)

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/mat-panel-title_Do I have to purchase all 2_69426f'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/mat-panel-title_Do I have to purchase all 2_69426f'), 
    Q6)

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/p_No, you can purchase 25 over more than on_64477c'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/p_No, you can purchase 25 over more than on_64477c'), 
    A6)

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/mat-panel-title_What do I do if I have addi_73fec4'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/mat-panel-title_What do I do if I have addi_73fec4'), 
    Q7)

WebUI.click(findTestObject('Object Repository/assert/Page_Olay Holiday Program/p_Review the Terms and Conditions for the o_2dd1e8'))

WebUI.verifyElementText(findTestObject('Object Repository/assert/Page_Olay Holiday Program/p_Review the Terms and Conditions for the o_2dd1e8'), 
    A7)

