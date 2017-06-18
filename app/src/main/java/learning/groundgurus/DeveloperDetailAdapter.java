package learning.groundgurus;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

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

        Placeholder placeholder = null;
        View view = convertView;

        if (convertView == null) {

            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(layoutResourceID, parent, false);

            placeholder = new Placeholder();

            placeholder.devName = (TextView) convertView.findViewById(R.id.tv_dev_name);
            placeholder.devOccu = (TextView) convertView.findViewById(R.id.tv_dev_occupation);

            view.setTag(placeholder);

        } else {

            placeholder = (Placeholder) view.getTag();

        }

        placeholder.devName.setText(developers[position].getName());
        placeholder.devOccu.setText(developers[position].getOccupation());

        return convertView;

    }

    public class Placeholder {
        TextView devName;
        TextView devOccu;
    }
}
