 /*
 * This test case check all the validation messages of invalid attempts.
 */ import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Pre-requisite/OpenUrl'), [('SecureUrl') : 'https://dev62.calvarycch.org'], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://dev62.calvarycch.org/home/test_index/')

//Check if user click on login button without typing username/password
WebUI.click(findTestObject('Page_CCCH Worship - Login/input'))

WebUI.verifyTextPresent('Invalid Username/Password', true, FailureHandling.STOP_ON_FAILURE)

//Check if user enter incorrect username/password
WebUI.navigateToUrl('https://dev62.calvarycch.org/home/test_index/')

WebUI.setText(findTestObject('Page_CCCH Worship - Login/input_UsernamePassword_usernam'), 'testabc')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CCCH Worship - Login/input_UsernamePassword_passwor'), 'OpaYHdXBOkw=')

WebUI.click(findTestObject('Page_CCCH Worship - Login/input'))

WebUI.verifyTextPresent('Invalid Username/Password', true, FailureHandling.STOP_ON_FAILURE)

//Check if user enter correct username and incorrect password
WebUI.navigateToUrl('https://dev62.calvarycch.org/home/test_index/')

WebUI.setText(findTestObject('Page_CCCH Worship - Login/input_UsernamePassword_usernam'), 'testworship')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CCCH Worship - Login/input_UsernamePassword_passwor'), 'OpaYHdXBOkw=')

WebUI.click(findTestObject('Page_CCCH Worship - Login/input'))

WebUI.verifyTextPresent('Invalid Username/Password', true, FailureHandling.STOP_ON_FAILURE)

// Check if user enter special character in input fields
WebUI.navigateToUrl('https://dev62.calvarycch.org/home/test_index/')

WebUI.setText(findTestObject('Page_CCCH Worship - Login/input_UsernamePassword_usernam'), '!@#$^&')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CCCH Worship - Login/input_UsernamePassword_passwor'), '2ihRrRfSAwg=')

WebUI.click(findTestObject('Page_CCCH Worship - Login/input'))

WebUI.verifyTextPresent('Invalid Username/Password', true, FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pre-requisite/CloseBrowser'), [:], FailureHandling.STOP_ON_FAILURE)

