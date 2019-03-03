package com.example.project_recycler_view_byqori;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MarvelAdapter extends RecyclerView.Adapter<MarvelAdapter.ViewHolder> {

    private Context context;
    private ArrayList<MarvelModel> marvelModels;

    public MarvelAdapter(Context context) { this.context = context;
    }

    public ArrayList<MarvelModel> getMarvelList() { return marvelModels;
    }

    public void setMarvelModels(ArrayList<MarvelModel> marvelModels) {
        this.marvelModels = marvelModels;
    }

    @NonNull
    @Override
    public MarvelAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list,viewGroup, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull MarvelAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getMarvelList().get(i).getFotoMarvel()).into(viewHolder.ivFoto);
        viewHolder.tvNama.setText(getMarvelList().get(i).getNamaMarvel());
    }

    @Override
    public int getItemCount() {
        return getMarvelList().size();
    }

    public Context getContext() {
        return context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivFoto;
        private TextView tvNama;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivFoto = itemView.findViewById(R.id.foto);
            tvNama = itemView.findViewById(R.id.tv1);
        }
    }
}
