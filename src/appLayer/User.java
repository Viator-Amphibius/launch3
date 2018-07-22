package appLayer;

import dataLayer.DB_user;

public class User {
    public boolean isValidUserCredentials(String sName, String sPass)
    {
        DB_user DB_user_Object = new DB_user();
        return DB_user_Object.isValidUserLogin(sName,sPass);

    }
}
