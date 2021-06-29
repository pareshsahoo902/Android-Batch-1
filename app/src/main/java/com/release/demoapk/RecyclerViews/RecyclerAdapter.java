package com.release.demoapk.RecyclerViews;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.release.demoapk.R;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private List<Products> products;

    public RecyclerAdapter(List<Products> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new RecyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false));
    }

    @Override
        public void onBindViewHolder(@NonNull  RecyclerAdapter.RecyclerViewHolder holder, int position) {

        Products current_products =  products.get(position);

        holder.title.setText(current_products.getTitle());
        holder.description.setText(current_products.getDescription());
        holder.price.setText("Rs. "+current_products.getPrice()+"/-");

        if(current_products.getDescription().length()>60){
            holder.description.setText(current_products.getDescription().substring(0,59)+"....");
        }



        
        holder.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Added to Cart !"+position, Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{

        public TextView title , description , price, add;
        public ImageView image;

        public RecyclerViewHolder(@NonNull  View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.desc);
            price = itemView.findViewById(R.id.price);
            add = itemView.findViewById(R.id.addBtn);
            image = itemView.findViewById(R.id.image);

        }
    }

}
