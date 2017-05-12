package com.example.dd.retrofit1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dd on 03.05.2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<User> item;
    Context context ;

    public RecyclerViewAdapter(Context context, List<User> item ) {
        Log.d("123", "RecyclerViewAdapter");
        this.item = item;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("123", "onCreateViewHolder");
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_row, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.d("123", "onBindViewHolder");
        holder.name.setText(item.get(position).getName());
        holder.hobby.setText(item.get(position).getHobby());
    }

    @Override
    public int getItemCount() {
        Log.d("123", "getItemCount");
        return item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, hobby;

        public ViewHolder(View itemView) {
            super(itemView);
            Log.d("123", "ViewHolder");

            name = (TextView) itemView.findViewById(R.id.name);
            hobby = (TextView) itemView.findViewById(R.id.hobby);

//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                }
//            });
        }


    }
}
