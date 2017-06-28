package learning.groundgurus;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by User on 6/28/2017.
 */

public class MainFragment extends Fragment implements MainContentContract {

    TextView tvContent;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_content, container, false);
        tvContent = (TextView) v.findViewById(R.id.tv_content_desc);
        return v;
    }


    @Override
    public void implementChange(String menuTitle) {

        tvContent.setText(menuTitle);

    }
}
