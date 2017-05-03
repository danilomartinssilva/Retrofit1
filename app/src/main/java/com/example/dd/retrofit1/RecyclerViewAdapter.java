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
        holder.id.setText(item.get(position).getId());
        holder.kolichestvo_vakansii.setText(item.get(position).getKolichestvo_vakansii());
        holder.kategoriia_personala.setText(item.get(position).getKategoriia_personala());
    }

    @Override
    public int getItemCount() {
        Log.d("123", "getItemCount");
        return item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, id,kategoriia_personala,kolichestvo_vakansii;

        public ViewHolder(View itemView) {
            super(itemView);
            Log.d("123", "ViewHolder");

            name = (TextView) itemView.findViewById(R.id.name);
            kolichestvo_vakansii = (TextView) itemView.findViewById(R.id.kolichestvo_vakansii);
            kategoriia_personala = (TextView) itemView.findViewById(R.id.kategoriia_personala);
            id = (TextView) itemView.findViewById(R.id.id);

//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                }
//            });
        }


    }
}
