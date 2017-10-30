package com.example.android.tourguide;


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
public class LandmarkFragment extends Fragment {

    public LandmarkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.card_list, container, false);

        final ArrayList<Card> cards = new ArrayList<Card>();

        cards.add(new Card(getString(R.string.landmark_name_0), 4, getString(R.string.landmark_type_0), R.drawable.winchester_mystery_house));
        cards.add(new Card(getString(R.string.landmark_name_1), 4, getString(R.string.landmark_type_1), R.drawable.hp_pavilion));
        cards.add(new Card(getString(R.string.landmark_name_2), 4, getString(R.string.landmark_type_2), R.drawable.cathedral_basilica_of));
        cards.add(new Card(getString(R.string.landmark_name_3), 4.5, getString(R.string.landmark_type_3), R.drawable.willow_glen));
        cards.add(new Card(getString(R.string.landmark_name_4), 4.5, getString(R.string.landmark_type_4), R.drawable.avaya_stadium));
        cards.add(new Card(getString(R.string.landmark_name_5), 4.5, getString(R.string.landmark_type_5), R.drawable.municipal_stadium_san));
        cards.add(new Card(getString(R.string.landmark_name_6), 5, getString(R.string.landmark_type_6), R.drawable.sikh_gurudwara_sahib));
        cards.add(new Card(getString(R.string.landmark_name_7), 4.5, getString(R.string.landmark_type_7), R.drawable.japantown));

        CardAdapter cardAdapter = new CardAdapter(getActivity(), cards, R.color.landmark_category);

        ListView listView = (ListView) rootView.findViewById(R.id.card_list);
        listView.setAdapter(cardAdapter);

        return rootView;
    }

}
