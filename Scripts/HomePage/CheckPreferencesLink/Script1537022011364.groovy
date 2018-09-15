/*
 * This test cases validates the Preferences Pop up
 */
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

// Initailize browser and navigate to application
WebUI.openBrowser('')

WebUI.navigateToUrl(url)

// Login to application
WebUI.setText(findTestObject('Page_CCCH Worship - Login/input_UsernamePassword_usernam'), userName)
WebUI.setText(findTestObject('Object Repository/Page_CCCH Worship - Login/input_UsernamePassword_passwor'), password)
WebUI.click(findTestObject('Page_CCCH Worship - Login/input'))

//Check the presence of Preferences popup.
WebUI.mouseOver (findTestObject('Page_CCCH Worship - Home/div_Preferences'))
WebUI.click(findTestObject('Page_CCCH Worship - Home/a_My Information'),FailureHandling.STOP_ON_FAILURE)
WebUI.closeBrowser()



