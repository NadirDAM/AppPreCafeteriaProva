package com.example.appprecafeteriaprova

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.appprecafeteriaprova.databinding.FragmentBegudaBinding
import com.example.appprecafeteriaprova.databinding.FragmentPrimerPlatBinding


class PrimerPlatFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentPrimerPlatBinding.inflate(inflater)

        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_primerPlatFragment_to_begudaFragment, null)
        }

        return binding.root
    }
}