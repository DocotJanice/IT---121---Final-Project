package UML_ClassConvertToCodes;

public class account extends user {

    private boolean userAuthenticated;

    public boolean verifyLogin() {
        if (userAuthenticated==true)
            return true;
        else
            return false;
    }

}
