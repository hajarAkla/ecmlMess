package at.vcity.androidim;

import android.app.Activity;

public class Messenger extends Activity{
 
	 public UsersDAO usersdb = new UsersDAO(this) ;
	 
	 public void start(){
		 usersdb.open();
	 }
}
