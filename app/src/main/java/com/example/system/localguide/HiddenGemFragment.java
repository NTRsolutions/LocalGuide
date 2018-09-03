package com.example.system.localguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HiddenGemFragment extends Fragment {


    public HiddenGemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.words_list, container, false);
        // Created an array of lists
        ArrayList<List> lists = new ArrayList<List>();
        lists.add(new List("Crawford Market", R.string.crawford_market, R.drawable.crawford_market));
        lists.add(new List("Dhobi Ghat", R.string.dhobi_ghat, R.drawable.dhobi_ghat));
        lists.add(new List("Phool Galli", R.string.phool_galli, R.drawable.phool_galli));
        lists.add(new List("Causeway", R.string.causeway, R.drawable.causeway));

        // Find the root view so we can add child views to it
        ListAdapter adapter = new ListAdapter(getActivity(), lists);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);
        return rootView;
    }

}
