package hackathon.example.paisa;

import hackathon.example.paisa.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.support.v7.app.ActionBarActivity;

public class Settings extends ActionBarActivity {

	/** Called when the activity is first created. */
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_home);
	Button bank = (Button) findViewById(R.id.bank);
    bank.setOnClickListener(new View.OnClickListener() {
    	 
        public void onClick(View arg0) {
            //Starting a new Intent
            Intent nextScreen = new Intent(Settings.this, Settings_Bank.class);
            


        startActivity(nextScreen);
    }
    }); 
	
	
	Button wallet = (Button) findViewById(R.id.wallet);
    wallet.setOnClickListener(new View.OnClickListener() {
    	 
        public void onClick(View arg0) {
            //Starting a new Intent
            Intent nextScreen = new Intent(Settings.this, Settings_Wallet.class);
            


        startActivity(nextScreen);
    }
    }); 

	Button save = (Button) findViewById(R.id.save);
    wallet.setOnClickListener(new View.OnClickListener() {
	
	              

	              public void onClick(View arg0) {
	
	 
	
	                 Toast.makeText(getApplicationContext(),"You have been registered to Paisa", Toast.LENGTH_LONG).show();
	
	              }
	
	        });
	
	    }

}
