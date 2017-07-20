package learning.groundgurus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userData = (TextView) findViewById(R.id.tv_data);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api-gg.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GGService service = retrofit.create(GGService.class);
        service.getUser("Lsk31cnKsaj4").enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {

                userData.setText("User ID: " + response.body().getData().getUser_id() + "\nEmail: " +
                        response.body().getData().getEmail() + "\nName: " + response.body().getData().getName());

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

}
