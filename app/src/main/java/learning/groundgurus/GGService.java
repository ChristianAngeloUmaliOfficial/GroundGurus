package learning.groundgurus;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Wanda on 7/20/2017.
 */

public interface GGService {

    @GET("user/{id}/")
    Call<User> getUser(@Path("id") String user_id);

}
