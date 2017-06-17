package learning.groundgurus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 1;

    private TextView mDataReturn;
    private EditText mData;
    private Button mSendData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDataReturn = (TextView) findViewById(R.id.tv_data_return);
        mData = (EditText) findViewById(R.id.et_data_main);
        mSendData = (Button) findViewById(R.id.b_send_data);

        mSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mData.getText().length() > 0){

                    Intent intent = new Intent(v.getContext(), SubActivity.class);
                    intent.putExtra("rc_data", mData.getText().toString());
                    startActivityForResult(intent, REQUEST_CODE);

                }

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK && requestCode == REQUEST_CODE){
            mDataReturn.setText(data.getExtras().getString("rc_data_return"));
        }

    }
}
