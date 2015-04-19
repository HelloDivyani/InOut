package hackathon.example.paisa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set View to register.xml
        setContentView(R.layout.register_home);
        
        Button btnRegister = (Button) findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
        	 
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(RegisterActivity.this, LoginActivity.class);
                
    

            startActivity(nextScreen);
        }
        }); 
    }
}