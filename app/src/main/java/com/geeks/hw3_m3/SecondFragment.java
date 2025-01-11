package com.geeks.hw3_m3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.geeks.hw3_m3.databinding.FragmentSecondBinding;

import java.io.Serializable;


public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentSecondBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments()!=null){
            Serializable user = getArguments().getSerializable("key123");
            String text  = "Name: " + ((User)user).getName() + "\n" +
                            "Email: " + ((User)user).getEmail() + "\n" +
                                "Passowrd: " + ((User)user).getPassword();
            binding.textView.setText(text);
        }
        binding.textView.setMessage(binding.textView   , "Hello");
        binding.textView1.setMessage(binding.textView1   , "Hello");
        binding.textView2.setMessage(binding.textView2   , "Hello");
        binding.textView3.setMessage(binding.textView3, "Hello");



    }
}

