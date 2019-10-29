package com.example.recyclerview;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class KeluargaAdapter extends RecyclerView.Adapter<KeluargaAdapter.KeluargaViewHolder> {

        private ArrayList<Keluarga> dataList;

        public KeluargaAdapter(ArrayList<Keluarga> dataList) {
            this.dataList = dataList;
        }

        @NonNull
        @Override
        public KeluargaAdapter.KeluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.item_keluarga,parent,false);
            return new KeluargaViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull KeluargaViewHolder holder, int position) {
            holder.tvNama.setText(dataList.get(position).getNama());
            holder.tvStatus.setText(dataList.get(position).getStatus());
            holder.tvImage.setImageDrawable(dataList.get(position).getFoto());

        }

        @Override
        public int getItemCount() {
            return (dataList != null) ? dataList.size() : 0;
        }

        public class KeluargaViewHolder extends RecyclerView.ViewHolder {
            private TextView tvNama, tvStatus;
            private ImageView tvImage;
            public KeluargaViewHolder(@NonNull View itemView) {
                super(itemView);
                tvNama = itemView.findViewById(R.id.tv_nama);
                tvStatus = itemView.findViewById(R.id.tv_status);
                tvImage=(ImageView) itemView.findViewById(R.id.tv_foto);
            }
        }
    }
