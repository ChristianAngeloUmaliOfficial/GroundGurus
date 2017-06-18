package learning.groundgurus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lvDevList;
    private Developers[] devList = new Developers[]{
            new Developers("Kim Jason Juliane", "Mobile Dev"),
            new Developers("Jerome Nocom", "Web Dev")
    };
    private DeveloperDetailAdapter developerDetailAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvDevList = (ListView) findViewById(R.id.lv_dev_details);

        developerDetailAdapter = new DeveloperDetailAdapter(this, R.layout.list_developers, devList);
        lvDevList.setAdapter(developerDetailAdapter);

        developerDetailAdapter.notifyDataSetChanged();

    }
}
