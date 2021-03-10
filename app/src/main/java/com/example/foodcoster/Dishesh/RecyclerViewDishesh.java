package com.example.foodcoster.Dishesh;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodcoster.Category.RecyclerViewCategory;
import com.example.foodcoster.R;

public class RecyclerViewDishesh extends RecyclerView.Adapter<RecyclerViewDishesh.myViewHolder>{
    String arrCategorynames[]={"Hari Vadapav Center","Pizza Center","New Fresh Food","cat4","cat5","cat6","cat7"};
    int arrImgs[]={R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_home_24,R.drawable.ic_baseline_home_24,};
    String arrDishType [] = {"Snacks","Thali","Bivrages",};
    String arrdish [] = {"Vadapav","pizza","sandwich"};
    Context context;
   public RecyclerViewDishesh(Context context){
        this.context=context;
    }
    @NonNull
    @Override

    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater l=LayoutInflater.from (context);
        View v=l.inflate (R.layout.inflater_dishesh,parent,false);
        myViewHolder holder=new myViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.tvTv.setText(arrCategorynames[position]);
        holder.tvDishType.setText(arrDishType[position]);
        holder.dish.setText(arrdish[position]);
    }

    @Override
    public int getItemCount() {
        return arrCategorynames.length;
    }

    class myViewHolder extends RecyclerView.ViewHolder {
       TextView tvTv,tvDishType,dish;
        public myViewHolder(@NonNull View itemView) {
            super (itemView);
            tvTv=itemView.findViewById(R.id.tvTV);
            tvDishType=itemView.findViewById(R.id.tvDishType);
            dish=itemView.findViewById(R.id.dish);

        }
    }
}
