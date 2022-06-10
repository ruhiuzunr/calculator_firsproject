package com.example.calculator_firsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.calculator_firsproject.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        binding.button0.setOnClickListener(view -> {
            binding.textViewToplam.append("0");

        });
        binding.button1.setOnClickListener(view -> {
            binding.textViewToplam.append("1");

        });
        binding.button2.setOnClickListener(view -> {
            binding.textViewToplam.append("2");

        });
        binding.button3.setOnClickListener(view -> {
            binding.textViewToplam.append("3");

        });
        binding.button4.setOnClickListener(view -> {
            binding.textViewToplam.append("4");

        });
        binding.button5.setOnClickListener(view -> {
            binding.textViewToplam.append("5");

        });
        binding.button6.setOnClickListener(view -> {
            binding.textViewToplam.append("6");

        });
        binding.button7.setOnClickListener(view -> {
            binding.textViewToplam.append("7");

        });
        binding.button8.setOnClickListener(view -> {
            binding.textViewToplam.append("8");

        });
        binding.button9.setOnClickListener(view -> {
            binding.textViewToplam.append("9");

        });
        binding.buttonTopla.setOnClickListener(view -> {
            binding.textViewToplam.append("+");

        });
        binding.buttonEsittir.setOnClickListener(view -> {
            String tüm_sayilar = binding.textViewToplam.getText().toString();
            String [] My_array = tüm_sayilar.split("\\+");
            int result = 0;
            for(int i = 0; i<My_array.length; i++){
                result += Integer.parseInt(My_array[i]);
            }
            binding.textViewToplam.setText(String.valueOf(result));

        });
        binding.buttonClear.setOnClickListener(view -> {
            binding.textViewToplam.setText("");
        });
        




    }
}