package login

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class login {

	@Keyword
	def normalLogin() {
		WebUI.setText(findTestObject('Object Repository/1. Login/input_Username'), 'admin')
		WebUI.setText(findTestObject('Object Repository/1. Login/input_Password'), 'Admin123')
		WebUI.click(findTestObject('Object Repository/1. Login/location_InpatientWard'))
		WebUI.click(findTestObject('Object Repository/1. Login/button_Login'))
	}

	@Keyword
	def loginWithoutLocation() {
		WebUI.setText(findTestObject('Object Repository/1. Login/input_Username'), 'admin')
		WebUI.setText(findTestObject('Object Repository/1. Login/input_Password'), 'Admin123')
		WebUI.click(findTestObject('Object Repository/1. Login/button_Login'))
	}
	
	@Keyword
	def loginWithoutPassword() {
		WebUI.setText(findTestObject('Object Repository/1. Login/input_Username'), 'admin')
		WebUI.click(findTestObject('Object Repository/1. Login/location_InpatientWard'))
		WebUI.click(findTestObject('Object Repository/1. Login/button_Login'))
	}
	
	@Keyword
	def loginWithoutUsername() {
		WebUI.setText(findTestObject('Object Repository/1. Login/input_Password'), 'Admin123')
		WebUI.click(findTestObject('Object Repository/1. Login/location_InpatientWard'))
		WebUI.click(findTestObject('Object Repository/1. Login/button_Login'))
	}
	
	@Keyword
	def loginWithInvalidUser() {
		WebUI.setText(findTestObject('Object Repository/1. Login/input_Username'), 'test')
		WebUI.setText(findTestObject('Object Repository/1. Login/input_Password'), 'test123')
		WebUI.click(findTestObject('Object Repository/1. Login/location_InpatientWard'))
		WebUI.click(findTestObject('Object Repository/1. Login/button_Login'))
	}
}
