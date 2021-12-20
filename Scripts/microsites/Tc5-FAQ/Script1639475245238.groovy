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

WebUI.navigateToUrl(GlobalVariable.Url)


WebUI.setText(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/input_WELCOME_mat-input-0'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/input__mat-input-1'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/button_SUBMIT'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/span_SUPPORT_hamburger-box'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/button_Faq'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-panel-title_How long do I have to submi_b881c2'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-panel-title_How long do I have to submi_b881c2',20))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-panel-title_What do I do if I am having_78c932'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-expansion-panel-header_What do I do if _2d7366'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-panel-title_What are the participating _a616ec'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-expansion-panel-header_What are the par_378e45'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-panel-title_How many times can I submit_4db6e3'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-expansion-panel_How many times can I su_4ab4bc'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-panel-title_How many times can I submit_4db6e3'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-panel-title_How many rewards can I get'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-panel-title_How many rewards can I get'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-panel-title_Do I have to purchase all 2_69426f'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-expansion-panel-header_Do I have to pur_03bd7f'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-panel-title_What do I do if I have addi_73fec4'))

WebUI.click(findTestObject('Object Repository/Microsite Prod/Page_Olay Holiday Program/mat-expansion-panel-header_What do I do if _bd2204'))

WebUI.closeBrowser()

