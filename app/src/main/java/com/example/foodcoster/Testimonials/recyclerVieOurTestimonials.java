package com.example.foodcoster.Testimonials;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodcoster.R;
import com.example.foodcoster.Restaurant.RecyclerViewRestaurant;

public class recyclerVieOurTestimonials extends RecyclerView.Adapter<recyclerVieOurTestimonials.myViewHolder> {
    String [] arrpara = {"Larem ispum dolor sit amet. consectetur adipiscing elit sed do eis Larem ispum dolor sit amet. consectetur adipiscing elit sed do eis","Larem ispum dolor sit amet. consectetur adiLarem ispum dolor sit amet. consectetur adipiscing elit sed do eis","Larem ispum dolor sit amet. consectetur adipiscing elit sed do eis",};
  //  int [] starimg = {R.drawable.ic_star_black_24dp+R.drawable.ic_star_black_24dp+R.drawable.ic_star_black_24dp,R.drawable.ic_star_black_24dp+R.drawable.ic_star_black_24dp+R.drawable.ic_star_black_24dp,R.drawable.ic_star_black_24dp+R.drawable.ic_star_black_24dp+R.drawable.ic_star_black_24dp,};
    String [] custname = {"Customer Name","johan Lue","Krishnan Murti"};

    Context context;
    public recyclerVieOurTestimonials(Context context){this.context=context;}


    @NonNull
    @Override
    public recyclerVieOurTestimonials.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater l=LayoutInflater.from (context);
        View v=l.inflate (R.layout.inflater_testimonials,parent,false);
        recyclerVieOurTestimonials.myViewHolder holder=new recyclerVieOurTestimonials.myViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerVieOurTestimonials.myViewHolder holder, int position) {
         holder.para.setText(arrpara[position]);
         holder.custname.setText(custname[position]);
       //  holder.starimg.setImageResource(starimg[position]);
    }

    @Override
    public int getItemCount() {
        return arrpara.length;
    }

    public class myViewHolder extends RecyclerView.ViewHolder {
        TextView para;
        TextView custname;
        ImageView starimg;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            para=itemView.findViewById(R.id.paragraph);
            custname=itemView.findViewById(R.id.custname);
            starimg=itemView.findViewById(R.id.star1);
        }
    }
}
