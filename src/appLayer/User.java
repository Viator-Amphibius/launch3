package appLayer;

public class User {
    public boolean isValidUserCredentials(String sName, String sPass)
    {
        if(sName.equals("moon") && sPass.equals("1234"))
            return true;
        else
            return false;
//Check!
    }
}
