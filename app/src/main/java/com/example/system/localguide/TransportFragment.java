package com.example.system.localguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class TransportFragment  extends Fragment{


    public TransportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.words_list, container, false);
        // Created an array of lists
        ArrayList<List> lists = new ArrayList<List>();
        lists.add(new List("Local Train", R.string.train, R.drawable.train));
        lists.add(new List("BEST Buses", R.string.bus, R.drawable.bus));
        lists.add(new List("Jetty", R.string.jetty, R.drawable.jetty));

        // Find the root view so we can add child views to it
        ListAdapter adapter = new ListAdapter(getActivity(), lists);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
