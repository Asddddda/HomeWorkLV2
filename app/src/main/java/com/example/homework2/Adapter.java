package com.example.homework2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyInnerViewHolder> {
    private ArrayList mDataList;

    @NonNull
    @Override
    public MyInnerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //利用LayoutInflater来加载item的布局
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);
        return new MyInnerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyInnerViewHolder myInnerHolder, int i) {
        myInnerHolder.mTextView.setText(mDataList.get(i) + "");

    }

    @Override
    public int getItemCount() {
        if (mDataList != null) {
            return mDataList.size();
        } else {
            return 0;
        }
    }

    public void setData(ArrayList list) {
        mDataList = list;
    }

    public class MyInnerViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        public MyInnerViewHolder(@NonNull View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_item_text);
        }
    }
}