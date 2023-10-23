package com.example.book_infromation.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.book_infromation.ModelClass;
import com.example.book_infromation.R;
import com.example.book_infromation.activites.FitnessActivity;
import com.example.book_infromation.activites.MotivationActivity;
import com.example.book_infromation.activites.YogaActivity;

import java.util.ArrayList;

public class AdapateClass extends RecyclerView.Adapter<AdapateClass.CardViewHolder> {
    private ArrayList<ModelClass> mode1List;
    private Context context;

    public AdapateClass(ArrayList<ModelClass> mode1List, Context context) {
        this.mode1List = mode1List;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
       ModelClass model=mode1List.get(position);
       holder.textViewsplash.setText(model.getCategoryName());
       holder.imageViewsplash.setImageResource(context.getResources().getIdentifier(model.getImageName(),"drawable",context.getPackageName()));

       holder.cardView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               if(position==0){
                Intent intent=new Intent(context, YogaActivity.class);
                context.startActivity(intent);
               }
               if(position==1){
                   Intent intent=new Intent(context, FitnessActivity.class);
                   context.startActivity(intent);

               }
               if(position==2){
                   Intent intent=new Intent(context, MotivationActivity.class);
                   context.startActivity(intent);
               }
           }
       });
    }

    @Override
    public int getItemCount() {
        return mode1List.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageViewsplash;
        private TextView textViewsplash;
        private CardView cardView;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewsplash=itemView.findViewById(R.id.imageViewSplash);
            textViewsplash=itemView.findViewById(R.id.textViewSplash);
            cardView=itemView.findViewById(R.id.carView);
        }
    }
}
