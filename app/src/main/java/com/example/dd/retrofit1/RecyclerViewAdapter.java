package com.example.dd.retrofit1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<User> item;
    private Context context ;

    public RecyclerViewAdapter(Context context, List<User> item ) {
        Log.i("autolog", "RecyclerViewAdapter");
        this.item = item;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.i("autolog", "onCreateViewHolder");
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_view_row, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Log.i("autolog", "onBindViewHolder");
        holder.name.setText(item.get(position).getName());
        holder.hobby.setText(item.get(position).getHobby());
    }

    @Override
    public int getItemCount() {
        Log.i("autolog", "getItemCount");
        return item.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView name, hobby;

        public ViewHolder(View itemView) {
            super(itemView);
            Log.i("autolog", "ViewHolder");

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
