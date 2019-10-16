package com.example.recwithfrag;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;


class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    Fragment f;
    private MyListData[] listdata;
    public MyAdapter(MyListData[] myListData) {

        this.listdata=myListData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(viewGroup.getContext());
        View listitem=layoutInflater.inflate(R.layout.testset,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(listitem);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {
        final MyListData myListData = listdata[i];
        viewHolder.imageView.setImageResource(listdata[i].getSdf());
        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (i) {
                    case 0:
                        f=new f1();
                        break;
                    case 1:
                        f=new f2();
                        break;
                    case 2:
                        f=new f3();
                        break;
                }

                ((FragmentActivity)v.getContext()).getSupportFragmentManager().beginTransaction().addToBackStack(null)
                        .replace(R.id.fr1,f).commit();


            }
        });

    }

    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        RecyclerView recyclerView;

        @SuppressLint("WrongViewCast")
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView=(ImageView)itemView.findViewById(R.id.img1);
            this.recyclerView=(RecyclerView)itemView.findViewById(R.id.fr1);
        }
    }

}
