
package loginmodule;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;


public class VerifyUserLoginTest {

    
    public VerifyUserLoginTest() {
    }
    @Test
    public void testVerifyLoginCredentials()throws Exception{
        VerifyUserLogin verifyUser = new VerifyUserLogin();
        ArrayList<String> testCredentialsList = new ArrayList<String>();
        testCredentialsList.add("JohnPaul.despa");
        
        
        Field field = VerifyUserLogin.class.getDeclaredField("credentialsList");
        field.setAccessible(true);
        field.set(verifyUser, testCredentialsList);
        
        
        assertTrue(verifyUser.verifyUserLoginCredentials("JohnPaul","despa"));
        assertFalse(verifyUser.verifyUserLoginCredentials("JohnPaulDespa","johnpaul"));
        
        
    }

    
    
    private boolean verifyUserLoginCredentials(String JohnPaul, String despa) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
