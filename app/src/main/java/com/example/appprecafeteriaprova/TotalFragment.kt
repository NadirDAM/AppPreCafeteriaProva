package com.example.appprecafeteriaprova

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.appprecafeteriaprova.databinding.FragmentPrimerPlatBinding
import com.example.appprecafeteriaprova.databinding.FragmentTotalBinding


class TotalFragment : Fragment() {
    private val sharedViewModel: SharedViewModel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentTotalBinding.inflate(inflater)

        sharedViewModel.menu.observe(viewLifecycleOwner) {
            binding.textViewPrimerPlat.setText(sharedViewModel.obtenirNom("primerPlat") + " - " + sharedViewModel.obtenirTotal("primerPlat").toString() + "€")
            binding.textViewBeguda.setText(sharedViewModel.obtenirNom("beguda") + " - " + sharedViewModel.obtenirTotal("beguda").toString() + "€")
            binding.textViewTotal.setText("Total: " + (sharedViewModel.obtenirTotal("primerPlat") + sharedViewModel.obtenirTotal("beguda")) + "€")

        }

        return binding.root

    }



}