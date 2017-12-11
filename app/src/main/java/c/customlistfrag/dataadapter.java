package c.customlistfrag;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

//  DataAdapter class the sub class to ArrayAdapter
public class dataadapter extends ArrayAdapter<CustomListFragment.data> {


    TextView nameTxtView, desTxtView;
    ImageView iconImgView;

    @NonNull
    Context context;
    int resource;
    @NonNull
    CustomListFragment.data[] objects= null;

    //    Constructor to the DataAdpter Class
    public dataadapter(@NonNull Context context, int resource, @NonNull CustomListFragment.data[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    //    getView Method
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row;

//        Getting LayoutInflater class and Inflating Layout
        LayoutInflater inflater= ((Activity)context).getLayoutInflater();

        row = inflater.inflate(resource, parent,false);

        nameTxtView = (TextView)row.findViewById(R.id.nameTxtView);
        desTxtView= (TextView)row.findViewById(R.id.descriptionTxtView);
        iconImgView= (ImageView)row.findViewById(R.id.imageImgView);
//            creating a object of data class "i"
//        to get the position in view in order to set the data accordingly
        CustomListFragment.data i = objects[position];
        nameTxtView.setText(i.name);
        desTxtView.setText(i.desc);
        iconImgView.setImageResource(i.img);

        return row;
    }

}