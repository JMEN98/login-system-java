import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){
        logininfo.put("jack","paul");

    }

    protected HashMap getLoginInfo(){
        return  logininfo;
    }
}
