package learning.groundgurus;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by User on 6/28/2017.
 */

public class SidebarFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_sidebar, container, false);

        String listContent[] = new String[]{"Hi", "Hello", "It's me"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(v.getContext(), android.R.layout.simple_list_item_1, listContent);

        final ListView lvMenuList = (ListView) v.findViewById(R.id.lv_sidebar_list);
        lvMenuList.setAdapter(arrayAdapter);

        lvMenuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                SidebarContract sidebarContract = (SidebarContract) view.getContext();
                String menuTitle = lvMenuList.getItemAtPosition(position).toString();

                sidebarContract.onItemClick(menuTitle);

            }
        });

        return v;

    }
}
