package learning.groundgurus;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by User on 6/18/2017.
 */

public class DeveloperDetailAdapter extends ArrayAdapter<Developers> {

    Context context;
    int layoutResourceID;
    Developers developers[];

    public DeveloperDetailAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull Developers[] objects) {
        super(context, resource, objects);

        this.context = context;
        this.layoutResourceID = resource;
        this.developers = objects;

    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Nullable
    @Override
    public Developers getItem(int position) {
        return super.getItem(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(layoutResourceID, parent, false);

        TextView devName = (TextView) convertView.findViewById(R.id.tv_dev_name);
        TextView devOccu = (TextView) convertView.findViewById(R.id.tv_dev_occupation);

        devName.setText(developers[position].getName());
        devOccu.setText(developers[position].getOccupation());

        return convertView;

    }
}
