package learning.groundgurus;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by User on 6/18/2017.
 */

public class SubActivity extends AppCompatActivity {

    private TextView mDataReceived;
    private EditText mData;
    private Button mReturnData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        mDataReceived = (TextView) findViewById(R.id.tv_data_received);
        mData = (EditText) findViewById(R.id.et_data_sub);
        mReturnData = (Button) findViewById(R.id.b_return_data);

        Bundle dataReceived = getIntent().getExtras();
        mDataReceived.setText(dataReceived.getString("rc_data"));

        mReturnData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mData.getText().length() > 0) {

                    Intent intent = new Intent();
                    intent.putExtra("rc_data_return", mData.getText().toString());
                    setResult(RESULT_OK, intent);
                    finish();

                }

            }
        });

    }
}
