package com.example.android.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by prajakkhruasuwan on 10/22/17.
 */

public class CardAdapter extends ArrayAdapter<Card> {

    private int mColorResourceId;

    public CardAdapter(@NonNull Context context, ArrayList<Card> cards, int colorResourceId) {
        super(context, 0, cards);
        this.mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listCardView = convertView;
        ViewHolder holder;

        // if no view, inflate it
        if (listCardView == null) {
            listCardView = LayoutInflater.from(getContext()).inflate(R.layout.card, parent, false);
            // cache view fields into the holder
            holder = new ViewHolder(listCardView);
            // associate the holder with the view for later lookup
            listCardView.setTag(holder);
        } else {
            holder = (ViewHolder) listCardView.getTag();
        }

        // get item info at the position
        final Card currentCard = getItem(position);

        holder.titleView.setText(currentCard.getmTitle());
        holder.ratingView.setRating((float) currentCard.getmRating());
        holder.descriptionView.setText(currentCard.getmDescription());

        if (currentCard.hasImage()) {
            holder.imageView.setImageResource(currentCard.getmImageResourceId());
        }

        int color = ContextCompat.getColor(getContext(), this.mColorResourceId);
        holder.containerLayout.setBackgroundColor(color);

        return listCardView;
    }

    // somewhere else in your class definition
    static class ViewHolder {
        @BindView(R.id.title)
        TextView titleView;
        @BindView(R.id.rating)
        RatingBar ratingView;
        @BindView(R.id.description)
        TextView descriptionView;
        @BindView(R.id.list_item_icon)
        ImageView imageView;
        @BindView(R.id.card_container)
        RelativeLayout containerLayout;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
