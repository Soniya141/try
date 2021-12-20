package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object UrlProd
     
    /**
     * <p></p>
     */
    public static Object Username
     
    /**
     * <p></p>
     */
    public static Object Password
     
    /**
     * <p></p>
     */
    public static Object Name
     
    /**
     * <p></p>
     */
    public static Object urlstaging
     
    /**
     * <p></p>
     */
    public static Object Emailid
     
    /**
     * <p></p>
     */
    public static Object Pswd
     
    /**
     * <p></p>
     */
    public static Object LoginUsername
     
    /**
     * <p></p>
     */
    public static Object Loginpswd
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            UrlProd = selectedVariables['UrlProd']
            Username = selectedVariables['Username']
            Password = selectedVariables['Password']
            Name = selectedVariables['Name']
            urlstaging = selectedVariables['urlstaging']
            Emailid = selectedVariables['Emailid']
            Pswd = selectedVariables['Pswd']
            LoginUsername = selectedVariables['LoginUsername']
            Loginpswd = selectedVariables['Loginpswd']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
