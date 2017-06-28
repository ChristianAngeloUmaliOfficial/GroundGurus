package learning.groundgurus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SidebarContract {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.ll_container) != null) {

            SidebarFragment sidebarFragment = new SidebarFragment();
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.ll_container, sidebarFragment)
                    .commit();

        }

    }

    @Override
    public void onItemClick(String menuTitle) {

        if (findViewById(R.id.ll_container) != null)
            Toast.makeText(getApplicationContext(), menuTitle + " is selected.", Toast.LENGTH_SHORT).show();
        else {

            MainFragment mainFragment = (MainFragment) getFragmentManager().findFragmentById(R.id.fragment_content);

            MainContentContract mainContentContract = mainFragment;
            mainContentContract.implementChange(menuTitle);

        }

    }
}
