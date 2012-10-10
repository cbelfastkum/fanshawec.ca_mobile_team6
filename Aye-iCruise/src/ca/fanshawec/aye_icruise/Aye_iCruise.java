package ca.fanshawec.aye_icruise;

import android.os.Bundle;
import android.view.Menu;
import org.apache.cordova.*;

public class Aye_iCruise extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_aye_i_cruise, menu);
        return true;
    }
}
