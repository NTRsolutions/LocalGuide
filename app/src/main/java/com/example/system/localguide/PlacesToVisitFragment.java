package com.example.system.localguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesToVisitFragment extends Fragment {


    public PlacesToVisitFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.words_list, container, false);
        // Created an array of lists
        ArrayList<List> lists = new ArrayList<List>();
        lists.add(new List("Gateway of India", R.string.gateway_of_india, R.drawable.gateway_of_india));
        lists.add(new List("Taj Hotel", R.string.taj_hotel, R.drawable.taj_hotel));
        lists.add(new List("Bandstand", R.string.bandstand, R.drawable.bandstand));
        lists.add(new List("Marine Drive", R.string.marine_drive, R.drawable.marine_drive));


        // Find the root view so we can add child views to it
        ListAdapter adapter = new ListAdapter(getActivity(), lists);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
