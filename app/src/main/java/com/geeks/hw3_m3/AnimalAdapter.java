package com.geeks.hw3_m3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.geeks.hw3_m3.databinding.ItemAnimalBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    private ItemAnimalBinding binding;
    private ArrayList<Animal> animals;
    onItemClikck onItemClikck ;

    public AnimalAdapter(ArrayList<Animal> animals, com.geeks.hw3_m3.onItemClikck onItemClikck) {
        this.animals = animals;
        this.onItemClikck = onItemClikck;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemAnimalBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false );
        return new AnimalViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
    holder.bind(animals.get(position));
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onItemClikck.onClick(position);
        }
    });
    }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}
