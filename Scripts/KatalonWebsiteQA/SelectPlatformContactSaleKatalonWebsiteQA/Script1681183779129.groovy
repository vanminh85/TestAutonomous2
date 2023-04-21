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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Katalon Software Quality Management Platform/div_Platform'))

WebUI.click(findTestObject('Object Repository/Page_Katalon Software Quality Management Platform/div_Katalon Studio'))

WebUI.click(findTestObject('Object Repository/Page_Katalon Studio  Best Codeless Test Aut_befb43/a_Talk to experts'))

WebUI.setText(findTestObject('Object Repository/Page_Katalon Studio  Best Codeless Test Aut_befb43/input_Contact Us_fullname_contact_us'), 
    'Nguyen Van Minh')

WebUI.setText(findTestObject('Object Repository/Page_Katalon Studio  Best Codeless Test Aut_befb43/input_Contact Us_email_contact_us'), 
    'minh.nguyen@katalon.com')

WebUI.setText(findTestObject('Object Repository/Page_Katalon Studio  Best Codeless Test Aut_befb43/input_Contact Us_number_of_tester_contact_us'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Page_Katalon Studio  Best Codeless Test Aut_befb43/input_Contact Us_interest_in_contact_us'), 
    'Visual Testing')

WebUI.click(findTestObject('Object Repository/Page_Katalon Studio  Best Codeless Test Aut_befb43/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/Page_Katalon Studio  Best Codeless Test Aut_befb43/div_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Katalon Studio  Best Codeless Test Aut_befb43/path'))

WebUI.closeBrowser()

