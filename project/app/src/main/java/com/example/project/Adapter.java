package com.example.project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import com.jakewharton.picasso.OkHttp3Downloader;
import com.squareup.picasso.Picasso;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {
    private Context context;
    private List<audio> audioList;

    public Adapter(Context context, List<audio> audioList) {
        this.context = context;
        this.audioList = audioList;
    }

    class viewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView singger;
        public final View mview;
        private AdapterView.OnItemClickListener itemClickListener;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            mview = itemView;
            title = mview.findViewById(R.id.test);
            singger = mview.findViewById(R.id.singger);
            mview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaP(getAdapterPosition());

                }
            });
        }
        private void mediaP(int position) {
            audio au = audioList.get(position);
            Intent intent = new Intent(context,audioMediaP.class);
            Bundle bundle = new Bundle();
            bundle.putString("title", au.getName());
            bundle.putString("singger", au.getSingger());
            bundle.putInt("id",au.getId());
            intent.putExtras(bundle);
            context.startActivity(intent);

        }

    }


    @NonNull
    @Override
    public Adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.audio,viewGroup,false);
        return new Adapter.viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.viewHolder viewHolder, int i) {
        viewHolder.title.setText(audioList.get(i).getName());
        viewHolder.singger.setText(audioList.get(i).getSingger());
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttp3Downloader(context));
        builder.build().load(audioList.get(i).getName());

    }

    @Override
    public int getItemCount() {
        return audioList.size();
    }
}
