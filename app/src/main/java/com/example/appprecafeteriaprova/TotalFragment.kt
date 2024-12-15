package com.example.appprecafeteriaprova

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.appprecafeteriaprova.databinding.FragmentPrimerPlatBinding
import com.example.appprecafeteriaprova.databinding.FragmentTotalBinding


class TotalFragment : Fragment() {
    private val sharedViewModel: SharedViewModel by viewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentTotalBinding.inflate(inflater)

        binding.textViewPrimerPlat.setText(SharedViewModel.obtenirNom("primerPlat") + " - " + SharedViewModel.obtenirTotal("primerPlat").toString() + "€")
        binding.textViewBeguda.setText(SharedViewModel.obtenirNom("beguda") + " - " + SharedViewModel.obtenirTotal("beguda").toString() + "€")
        binding.textViewTotal.setText("Total: " + (SharedViewModel.obtenirTotal("primerPlat") + SharedViewModel.obtenirTotal("beguda")) + "€")

        return binding.root

    }



}