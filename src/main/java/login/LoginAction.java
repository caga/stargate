package login;
import com.opensymphony.xwork2.ActionSupport;
import dataj.Dao;
public class LoginAction extends ActionSupport{
	private static final long serialVersionUID = 8931372307689530559L;
	private User duser;
	private Dao dao=new Dao();
	private String kapc;
	private boolean kontrol;
	public String execute() throws Exception{
		kontrol=duser.getName().equals("cagatay") & duser.getPassword().equals("peace");
		System.out.println(duser.getName()+"   "+duser.getPassword());
		System.out.println("sifre kontrol: "+kontrol);
		System.out.println("Kapça: "+kapc);
		dao.run(duser);
		dao.toString();
		System.out.println(duser.getName());
		if(kontrol)
			return "success";
		return "fail";
	}

	public User getDuser() {
	return duser;
	}

	public void setDuser(User user) {
		this.duser = user;
	}

	public void setKapc(String kapca) {
		this.kapc = kapca;
	}

	public String getKapc() {
		return kapc;
	}
	public String toString(){
		return (duser.getName());
	}
}

