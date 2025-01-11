package com.geeks.hw3_m3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.geeks.hw3_m3.databinding.FragmentDewtailBinding;


public class DewtailFragment extends Fragment {

    private FragmentDewtailBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDewtailBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       if (getArguments() != null){
           String name =  getArguments().getString("key_name");
           String image =  getArguments().getString("key_image");
           String desc =  getArguments().getString("key_desc");
           binding.tvAnimalName.setText(name);
           binding.tvAnimalDesc.setText(desc);
           Glide.with(binding.ivAnimal).load(image).into(binding.ivAnimal);
       }
    }
}