package com.geeks.hw3_m3;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.geeks.hw3_m3.databinding.ItemAnimalBinding;

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private ItemAnimalBinding binding;


    public AnimalViewHolder(ItemAnimalBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    void bind(Animal animal){
    binding.tvAnimalName.setText(animal.getName());
        Glide.with(binding.ivAnimal).load(animal.getImage()).into(binding.ivAnimal);
    }
}
