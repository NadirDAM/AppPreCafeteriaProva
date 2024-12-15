package com.example.appprecafeteriaprova

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.appprecafeteriaprova.databinding.FragmentBegudaBinding

class BegudaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        print("sharedViewModel.menu")
        print(SharedViewModel.menu.value)
        val binding = FragmentBegudaBinding.inflate(inflater)
        val preu : Int = 10
        binding.textView.setText(preu.toString() + "€")
        binding.button.setOnClickListener{
            if (binding.editTextBeguda.text.isNotEmpty() && binding.editTextQuantitatBeguda.text.isNotEmpty()) {
                SharedViewModel.updateUser("beguda", binding.editTextBeguda.text.toString(),  binding.editTextQuantitatBeguda.text.toString().toInt(), preu)
                findNavController().navigate(R.id.action_begudaFragment_to_totalFragment, null)
            }
        }

        return binding.root
    }
}