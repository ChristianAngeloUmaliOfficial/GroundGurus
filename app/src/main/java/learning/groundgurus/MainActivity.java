package learning.groundgurus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String status = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        status = "Activity Created";
        displayStatus();

    }

    @Override
    protected void onStart() {
        super.onStart();

        status = "Activity Started";
        displayStatus();

    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        status = "Restoring Instance State";
        displayStatus();

    }

    @Override
    protected void onResume() {
        super.onResume();

        status = "Activity Resumed";
        displayStatus();

    }

    @Override
    protected void onPause() {
        super.onPause();

        status = "Activity Paused";
        displayStatus();

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        status = "Saving Instance State";
        displayStatus();

    }

    @Override
    protected void onStop() {
        super.onStop();

        status = "Activity Stopped";
        displayStatus();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        status = "Activity Destroyed";
        displayStatus();

    }

    private void displayStatus(){
        Toast.makeText(getApplicationContext(), status, Toast.LENGTH_SHORT).show();
        Log.d(this.getClass().getCanonicalName(), status);
    }
}
