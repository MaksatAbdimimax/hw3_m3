package com.geeks.hw3_m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geeks.hw3_m3.databinding.FragmentNewBinding;

import java.util.ArrayList;


public class NewFragment extends Fragment implements onItemClikck{

    private FragmentNewBinding binding ;
    private ArrayList<Animal> animals = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNewBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initAdapter();
        loadData();
    /*
        if (getArguments()!= null){
            int counter  = getArguments().getInt("key_counter");
            binding.textView.setText(String.valueOf(counter));
        }*/

    }

    private void loadData() {
        animals.add(new Animal("Rex","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRHjtOYuK2n_CZoxQs9zxK96N1_qMiv3ZWSYQ&s" , "Ty daldur"));
        animals.add(new Animal("Sharik","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQquq5TxpfbeJuwJES9YRfXPFoGFExuS6ykg&s" , "Ty eshek"));
        animals.add(new Animal("Ak tosh","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTc4uLvZd63xWbugIay7kB9pYM670xtSJ-K-A&s" , "Ty took"));
        animals.add(new Animal("Bobik","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTBrj9ZFU1QWGXMJ4zNOp2O9virT56d2r_5Sg&s" , "Ty loh"));
        animals.add(new Animal("Dog","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTL4fr5ldqQ1Ky2R_lKbWs4ncAkbZ5-zKQz4A&s" , "Ty petuh"));
        animals.add(new Animal("Ak tosh","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTc4uLvZd63xWbugIay7kB9pYM670xtSJ-K-A&s" , "Ty olen"));


    }

    private void initAdapter(){
        AnimalAdapter adapter = new AnimalAdapter(animals, this);
        binding.rvAnimals.setAdapter(adapter);
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putString("key_name", animals.get(position).getName());
        bundle.putString("key_image", animals.get(position).getImage());
        bundle.putString("key_desc", animals.get(position).getDesc());
        DewtailFragment dewtailFragment = new DewtailFragment();
        dewtailFragment.setArguments(bundle);
       requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view,dewtailFragment).addToBackStack(null).commit();
    }
}