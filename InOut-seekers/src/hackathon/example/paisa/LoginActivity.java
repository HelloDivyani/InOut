package hackathon.example.paisa;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Scanner;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_home);
        
       
Button login = (Button) findViewById(R.id.login);
login.setOnClickListener(new View.OnClickListener() {
	 
    public void onClick(View arg0) {
        //Starting a new Intent
        Intent nextScreen = new Intent(LoginActivity.this, Profile.class);
        


    startActivity(nextScreen);
}
}); 
    }
}