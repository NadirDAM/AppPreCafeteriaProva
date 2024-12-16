package com.example.appprecafeteriaprova

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.appprecafeteriaprova.databinding.FragmentBegudaBinding
import com.example.appprecafeteriaprova.databinding.FragmentPrimerPlatBinding


class PrimerPlatFragment : Fragment() {
    private val sharedViewModel: SharedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentPrimerPlatBinding.inflate(inflater)
        val preu : Int = 10
        binding.textView.setText(preu.toString() + "€")
        binding.button.setOnClickListener{

            if (binding.editTextPrimerPlat.text.isNotEmpty() && binding.editTextQuantitatPrimerPlat.text.isNotEmpty()) {
                sharedViewModel.updateUser("primerPlat", binding.editTextPrimerPlat.text.toString(),  binding.editTextQuantitatPrimerPlat.text.toString().toInt(), preu)
                findNavController().navigate(R.id.action_primerPlatFragment_to_begudaFragment, null)
            }
        }

        return binding.root
    }
}