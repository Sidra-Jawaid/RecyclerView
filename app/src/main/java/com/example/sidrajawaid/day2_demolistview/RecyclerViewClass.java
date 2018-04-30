package com.example.sidrajawaid.day2_demolistview;

import android.content.Context;
import android.service.quicksettings.Tile;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sidrajawaid.day2_demolistview.R;

import java.util.ArrayList;

public class RecyclerViewClass extends RecyclerView.Adapter {
    ArrayList<ModelClass> modelClassArrayList;
    Context context;

    public RecyclerViewClass(ArrayList<ModelClass> modelClass_ArrayList, Context context) {
        this.modelClassArrayList = modelClass_ArrayList;
        this.context = context;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        switch (viewType)
        {
            case ModelClass.RECTANGLE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rectangle, parent, false);
                return new RectangleViewHolder(view);
            case ModelClass.TILE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tile, parent, false);
                return new TileViewHolder(view);
            case ModelClass.BANNER:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.banner, parent, false);
                return new BannerViewHolder(view);
        }
        return null;
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ModelClass modelClass=modelClassArrayList.get(position);
        if(modelClass!=null)
        {
            switch (modelClass.TYPE)
            {
                case ModelClass.RECTANGLE:
                    ((RectangleViewHolder) holder).rectangle_discount_imageview.setImageResource(modelClass.IMAGE);
                    break;
                case ModelClass.TILE:
                    ((TileViewHolder) holder).tile_item1_imageview.setImageResource(modelClass.IMAGE);

                    break;
                case ModelClass.BANNER:
                    ((BannerViewHolder) holder).banner_discount_imageview.setImageResource(modelClass.IMAGE);
                    ((BannerViewHolder) holder).banner_discount_textview.setText(modelClass.TEXT);
                    break;

            }
        }
    }
    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }

    public int getItemViewType(int position) {
        switch (modelClassArrayList.get(position).TYPE) {
            case 0:
                return ModelClass.RECTANGLE;

            case 1:
                return ModelClass.TILE;
            case 2:
                return ModelClass.BANNER;
           case 3:
                return ModelClass.RECTANGLE;

            case 4:
                return ModelClass.TILE;
            case 5:
                return ModelClass.BANNER;
        }
        return -1;
    }
    public class RectangleViewHolder extends RecyclerView.ViewHolder{
        ImageView rectangle_discount_imageview;
        CardView cardView;


        public RectangleViewHolder(View itemView) {
            super(itemView);
            this.cardView=(CardView)itemView.findViewById(R.id.rectanglecardview);
            this.rectangle_discount_imageview=(ImageView)itemView.findViewById(R.id.discountimage);

        }

    }
    public class TileViewHolder extends RecyclerView.ViewHolder{
        ImageView tile_item1_imageview;


        public TileViewHolder(View itemView) {
            super(itemView);
            this.tile_item1_imageview=(ImageView)itemView.findViewById(R.id.tile1);


        }

    }
    public class BannerViewHolder extends RecyclerView.ViewHolder{
        ImageView banner_discount_imageview;
        TextView banner_discount_textview;

        public BannerViewHolder(View itemView) {
            super(itemView);
            this.banner_discount_imageview=(ImageView)itemView.findViewById(R.id.promotionimage);
            this.banner_discount_textview=(TextView)itemView.findViewById(R.id.promotiontext);
        }
    }
}
