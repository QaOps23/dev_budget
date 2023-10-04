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

WebUI.openBrowser("https://dev-mhub.mantis.id/signin")

WebUI.setText(findTestObject('Object Repository/login/username'), "collection.development.budget@mandalafinance.com")
WebUI.setText(findTestObject('Object Repository/login/password'), "Password09")
WebUI.click(findTestObject('Object Repository/login/tombol_login'))


WebUI.click(findTestObject('Object Repository/nav_bar/finance'))
WebUI.click(findTestObject('Object Repository/nav_bar/budget'))
WebUI.click(findTestObject('Object Repository/nav_bar/Proses_anggaran'))
WebUI.click(findTestObject('Object Repository/nav_bar/input_anggaran'))

WebUI.click(findTestObject('Object Repository/input/proses', [('row'): 1]))

WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):1]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):1]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):2]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):2]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):3]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):3]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):4]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):4]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):5]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):5]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):6]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):6]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):7]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):7]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):8]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):8]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):9]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):9]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):10]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):10]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):11]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):11]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):12]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):12]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):13]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):13]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):14]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):14]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):15]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):15]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):16]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):16]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):17]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):17]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):18]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):18]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):19]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):19]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):20]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):20]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):21]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):21]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):22]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):22]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):23]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):23]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):24]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):24]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/input_var1',[('var'):25]))
WebUI.sendKeys(findTestObject('Object Repository/input/input_var1',[('var'):25]),"20")
WebUI.click(findTestObject('Object Repository/input/flex'))
WebUI.click(findTestObject('Object Repository/input/flex_lanjut'))

WebUI.click(findTestObject('Object Repository/input/simpan_draf'))