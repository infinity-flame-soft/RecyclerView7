package com.example.joy.recyclerview7;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joy on 12/3/17.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>   {

    private List<MobileModel> list=new ArrayList<>();
    private Context context;

    public CustomAdapter(List<MobileModel> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.card_view,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

       MobileModel mobileModel=list.get(position);

       holder.textView.setText(mobileModel.name);
       holder.imageView.setImageResource(mobileModel.logo);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView;
        TextView textView;


        public MyViewHolder(View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.textView);
            imageView=itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            //Toast.makeText(context,"CLICKED !!",Toast.LENGTH_SHORT).show();

            MobileModel mobileModel=list.get(getAdapterPosition());
            Intent intent=new Intent(context,DetailsActivity.class);

            intent.putExtra("name",mobileModel.name);
            intent.putExtra("des",mobileModel.description);
            intent.putExtra("logo",mobileModel.logo);

            context.startActivity(intent);

        }
    }



}
