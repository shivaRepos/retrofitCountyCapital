package com.giri.jan23;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import java.util.ArrayList;

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    Context context;
    ArrayList<Country> body;

    public CustomAdapter(Context context, ArrayList<Country> body) {
        this.context = context;
        this.body = body;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textView.setText(""+body.get(position).getName());
        holder.textView1.setText(""+body.get(position).getCapital());
        ArrayAdapter adapter= new ArrayAdapter(context,android.R.layout.simple_list_item_1,
                android.R.id.text1,body.get(position).getBorders());
        holder.spinner.setAdapter(adapter);

        holder.currency.setText(body.get(position).getCurrencies().get(0).getName() + "\n"+
                body.get(position).getCurrencies().get(0).getSymbol());

//        holder.image.setImageURI(Uri.parse(body.get(position).getFlag()));
        Glide.with(context)
                .asBitmap()
                .load(body.get(position).getFlag())
                .into(holder.image);
    }

        @Override
        public int getItemCount() {
        return body.size();
    }

        public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView1,currency;
        Spinner spinner;
        ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.country);
            textView1=itemView.findViewById(R.id.capital);
            currency=itemView.findViewById(R.id.currency);
            spinner=itemView.findViewById(R.id.borders);
            image = itemView.findViewById(R.id.image);
        }
    }
}
