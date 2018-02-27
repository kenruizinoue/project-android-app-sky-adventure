package com.apps.yecotec.skyadventure.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.yecotec.skyadventure.R;
import com.apps.yecotec.skyadventure.models.Traveler;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by kenruizinoue on 2/27/18.
 */

public class TravelerAdapter extends RecyclerView.Adapter<TravelerAdapter.TravelerAdapterViewHolder> {

    private Context mContext;
    private List<Traveler> travelers;

    public TravelerAdapter(Context context, List<Traveler> travelers) {
        mContext = context;
        this.travelers = travelers;
    }

    @Override
    public TravelerAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.item_traveler;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);

        TravelerAdapterViewHolder viewHolder = new TravelerAdapterViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TravelerAdapterViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return travelers.size();
    }

    class TravelerAdapterViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.traveler_image) ImageView travelerImage;
        @BindView(R.id.traveler_name) TextView travelerName;
        @BindView(R.id.traveler_description) TextView travelerDescription;

        public TravelerAdapterViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        void bind(int position) {
            travelerImage.setImageDrawable(getDrawableById(travelers.get(position).travelerImage));
            travelerName.setText(travelers.get(position).travelerName);
            travelerDescription.setText(travelers.get(position).travelerDescription);
        }

        public Drawable getDrawableById(int id) {
            switch (id) {
                case 1:
                    return mContext.getResources().getDrawable(R.drawable.traveler_asset_1);
                case 2:
                    return mContext.getResources().getDrawable(R.drawable.traveler_asset_2);
                case 3:
                    return mContext.getResources().getDrawable(R.drawable.traveler_asset_3);
                case 4:
                    return mContext.getResources().getDrawable(R.drawable.traveler_asset_4);
                default:
                    return mContext.getResources().getDrawable(R.drawable.traveler_asset_1);
            }
        }

    }
}
