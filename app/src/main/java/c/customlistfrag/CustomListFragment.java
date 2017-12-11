package c.customlistfrag;

/**
 * Created by abhi on 11/12/17.
 */
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jain on 10-12-2017.
 */

public class CustomListFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.list_fragment, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Creating Object of the Data Class and Passing The values to Be Loaded in the View
        data dataObj[] = new data[]{
                new data("Google","Search", R.drawable.google),
                new data("Yahoo","Search", R.drawable.yahoo),
                new data("Twitter","Social Media", R.drawable.twitter),
                new data("Facebook","Social Media", R.drawable.facebook),

        };
//        Setting the array adapter to the list view
        dataadapter adapter= new dataadapter(getActivity(), R.layout.row, dataObj);
        setListAdapter(adapter);
    }

    //    Class data to store the Values/ data to be passed in the UI
    public class data{
        String name, desc;
        Integer img;

        public data(){super();}
        public data(String name, String desc, Integer img){
            super();
            this.name = name;
            this.desc= desc;
            this.img= img;
        }
    }
}
