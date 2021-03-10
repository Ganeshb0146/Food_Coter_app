package com.example.foodcoster.Category;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodcoster.R;

public class RecyclerViewCategory extends RecyclerView.Adapter<RecyclerViewCategory.myViewHolder>{
    String arrCategorynames[]={"Snaks","Chinese","Grill","Grevy","cat5","cat6","cat7"};
    int arrImgs[]={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_home_24,};
    Context context;
    public RecyclerViewCategory(Context context){
        this.context=context;
    }
    @NonNull
    @Override

    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater l=LayoutInflater.from (context);
        View v=l.inflate (R.layout.inflater_category,parent,false);
        myViewHolder holder=new myViewHolder (v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.tvCat.setText (arrCategorynames[position]);
        holder.imgimgs.setImageResource (arrImgs[position]);
    }

    @Override
    public int getItemCount() {
        return arrCategorynames.length;
    }

    class myViewHolder extends RecyclerView.ViewHolder {
        ImageView imgimgs;
        TextView tvCat;
        public myViewHolder(@NonNull View itemView) {
            super (itemView);
            imgimgs=itemView.findViewById (R.id.imgImgs);
            tvCat=itemView.findViewById (R.id.tvCat);
        }
    }
}
