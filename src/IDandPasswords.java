import java.util.HashMap;

public class IDandPasswords {
	HashMap<String,String> logininfo=new HashMap<String,String>();
	
	IDandPasswords() {
		logininfo.put("Asd", "jelszo123");
		logininfo.put("Haha", "pw100");
		logininfo.put("TheUser", "passw01");
		logininfo.put("a", "1");
	}
	
	protected HashMap getLoginInfo(){
		return logininfo;
	}
}
