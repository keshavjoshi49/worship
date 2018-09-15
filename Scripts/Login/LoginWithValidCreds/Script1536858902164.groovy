 /*
 * This test case verifies that if a user login with valid username/password then user should successfully logged in.
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

//initalize browser and and navigate to application
WebUI.openBrowser('')
WebUI.navigateToUrl(url)

//Pass valid credentials and click on login.
WebUI.setText(findTestObject('Object Repository/Page_CCCH Worship - Login/input_UsernamePassword_usernam'), userName)

WebUI.setText(findTestObject('Object Repository/Page_CCCH Worship - Login/input_UsernamePassword_passwor'), password)

WebUI.click(findTestObject('Object Repository/Page_CCCH Worship - Login/input'))

// After successful login check for the title appearing 
String title= WebUI.getWindowTitle()
WebUI.verifyMatch(title, 'CCCH Worship - Home', true, FailureHandling.STOP_ON_FAILURE)
WebUI.closeBrowser()

