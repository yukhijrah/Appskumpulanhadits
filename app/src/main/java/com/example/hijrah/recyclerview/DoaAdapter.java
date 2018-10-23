package com.example.hijrah.recyclerview;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Hijrah on 10/21/2018.
 */

public class DoaAdapter extends RecyclerView.Adapter<DoaAdapter.ViewHolder> {

    //Array
    private List<LauncherActivity.ListItem> listItems;
    private Context context;

    public DoaAdapter(List<LauncherActivity.ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //
        LauncherActivity.ListItem listItem = listItems.get(position);

        holder.txtNamaDoa.setText(listItem.getNama);
        holder.txtArtiDoa.setText(listItem.getArti);
        holder.txtArtiDoa.setText(listItem.getSurah);

    }

    @Override
    public int getItemCount() {
        //
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView txtNamaDoa;
        public TextView txtArtiDoa;

        public ViewHolder(View itemView) {
            super(itemView);

            txtNamaDoa = (TextView) itemView.findViewById(R.id.txt_nama_doa);
            txtArtiDoa = (TextView) itemView.findViewById(R.id.txt_arti_doa);
        }
    }
}
