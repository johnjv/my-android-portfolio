package com.justinvarghesejohn.myportfolio;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /* Called when a user clicks an app button, generates a string based on app name */
    public void displayToast(View view) {
        Log.d("ONCLICK", "Button clicked");
        Context context = getApplicationContext();
        Button btn = (Button)view;
        String appName = btn.getText().toString();
        Resources res = getResources();
        String message = String.format(res.getString(R.string.onclick_message), appName);
        Log.d("ONCLICK", message);
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
