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

WebUI.navigateToUrl('https://www.flipkart.com/')

WebUI.setText(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/input__18u87m _3WuvDp'), 
    '720790930')

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/button_Request OTP'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/span_'))

WebUI.click(findTestObject('Object Repository/Page_Online Shopping Site for Mobiles, Elec_b3f752/img__2puWtW _3a3qyb'))

WebUI.click(findTestObject('Object Repository/Page_Mobile Phones Online at Best Prices in India/svg'))

WebUI.click(findTestObject('Object Repository/Page_Mobile Phones Online at Best Prices in India/svg'))

WebUI.click(findTestObject('Object Repository/Page_Mobile Phones Online at Best Prices in India/svg'))

WebUI.click(findTestObject('Object Repository/Page_Mobile Phones Online at Best Prices in India/svg'))

WebUI.click(findTestObject('Object Repository/Page_Mobile Phones Online at Best Prices in India/svg'))

WebUI.click(findTestObject('Object Repository/Page_Mobile Phones Online at Best Prices in India/img__396cs4'))

WebUI.switchToWindowTitle('Realme C53 (Champion Gold, 64 GB) (6 GB RAM)')

WebUI.click(findTestObject('Object Repository/Page_Realme C53 (Champion Gold, 64 GB) (6 GB RAM)/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart  Flipkart.com/div_Grocery'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart  Flipkart.com/button_Shop now'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Grocery Store - Buy Groceries_f794ff/img__2xm1JU'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Grocery Store - Buy Groceries_f794ff/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Grocery Store - Buy Groceries_f794ff/button_'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Grocery Store - Buy Groceries_f794ff/div_Select city'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Grocery Store - Buy Groceries_f794ff/svg__2Dwidy'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Grocery Store - Buy Groceries_f794ff/svg__2Dwidy'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Grocery Store - Buy Groceries_f794ff/div_Select city Verify Delivery Pincode Onl_aa50b1'))

WebUI.click(findTestObject('Object Repository/Page_Flipkart Grocery Store - Buy Groceries_f794ff/div_Select city Verify Delivery Pincode Onl_aa50b1'))

WebUI.closeBrowser()

