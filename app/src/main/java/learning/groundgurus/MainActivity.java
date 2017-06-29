package learning.groundgurus;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor sharedPreferencesEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getPreferences(Context.MODE_PRIVATE);

        //Saving Data
        sharedPreferencesEditor = sharedPreferences.edit();
        sharedPreferencesEditor
                .putString("name", "Wanda Maximoff")
                .commit();


        //Getting Data
        sharedPreferences.getString("name", ""); //Empty string is default return if data not found

    }
}
