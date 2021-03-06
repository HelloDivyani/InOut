package hackathon.example.paisa;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.MenuItem;
import android.content.Intent;


public class HomeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
        	 
            public void onClick(View arg0) {
                //Starting a new Intent
                Intent nextScreen = new Intent(HomeActivity.this, LoginActivity.class);
                
    

            startActivity(nextScreen);
        }
        });   
            Button register = (Button) findViewById(R.id.register);
            register.setOnClickListener(new View.OnClickListener() {
            	 
                public void onClick(View arg0) {
                    //Starting a new Intent
                    Intent nextScreen2 = new Intent(HomeActivity.this, RegisterActivity.class);
                    
        

                startActivity(nextScreen2);
                }
    });
        
}
        
    
        
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    
   
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
