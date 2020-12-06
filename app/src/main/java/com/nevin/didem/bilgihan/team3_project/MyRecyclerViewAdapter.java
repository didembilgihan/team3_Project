package com.nevin.didem.bilgihan.team3_project;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyRecyclerViewItemHolder> {
    private Context context;
    private ArrayList<Book> recyclerItemValues;

    DatabaseHelper dbHelper;
    public MyRecyclerViewAdapter(Context context, ArrayList<Book> values){
        this.context = context;
        this.recyclerItemValues = values;
        dbHelper = new DatabaseHelper(context);
    }

    @NonNull
    @Override
    public MyRecyclerViewItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflator = LayoutInflater.from(viewGroup.getContext());

        View itemView = inflator.inflate(R.layout.recycler_item, viewGroup, false);

        MyRecyclerViewItemHolder mViewHolder = new MyRecyclerViewItemHolder(itemView);
        return mViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewItemHolder myRecyclerViewItemHolder, int i) {

        final Book bookItem = recyclerItemValues.get(i);

        myRecyclerViewItemHolder.tvItemName.setText(bookItem.getName());
        myRecyclerViewItemHolder.tvItemCategory.setText(bookItem.getCategory());
        myRecyclerViewItemHolder.imgItemBookImage.setImageResource(R.drawable.img1);

        
    }

    @Override
    public int getItemCount() {
        return recyclerItemValues.size();
    }

     class MyRecyclerViewItemHolder extends  RecyclerView.ViewHolder{
        TextView tvItemName, tvItemCategory;
        ImageView imgItemBookImage;
        ConstraintLayout parentLayout;
        public MyRecyclerViewItemHolder(@NonNull View itemView) {
            super(itemView);
            tvItemName = itemView.findViewById(R.id.tvItemBookName);
            tvItemCategory = itemView.findViewById(R.id.tvItemBookCategory);
            imgItemBookImage = itemView.findViewById(R.id.imgItemBookmage);
            parentLayout = itemView.findViewById(R.id.itemConstLayout);
        }
    }

}
