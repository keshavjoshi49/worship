 /*
 * This case validates the Home page links and ensure the correct page is opening.
 */ import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Pre-requisite/OpenUrl'), [('SecureUrl') : 'https://dev62.calvarycch.org'], FailureHandling.STOP_ON_FAILURE)

//Pass valid credentials and click on login.
WebUI.setText(findTestObject('Page_CCCH Worship - Login/input_UsernamePassword_usernam'), 'testworship')

WebUI.setEncryptedText(findTestObject('Page_CCCH Worship - Login/input_UsernamePassword_passwor'), '8SQVv/p9jVTHLrggi8kCzw==')

WebUI.click(findTestObject('Page_CCCH Worship - Login/input'))

WebUI.verifyTextPresent('Home', true)

//Click links of the page to ensure the correct page is opening.
WebUI.click(findTestObject('Page_CCCH Worship - Home/div_Home'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_CCCH Worship - Home/div_Schedule'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_CCCH Worship - Home/div_summary'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_CCCH Worship - Home/div_Profiles'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_CCCH Worship - Home/div_Vblog'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_CCCH Worship - Home/div_Preferences'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_CCCH Worship - Home/div_Logout'))

WebUI.closeBrowser()

