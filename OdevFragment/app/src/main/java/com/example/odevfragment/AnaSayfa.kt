package com.example.odevfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odevfragment.databinding.FragmentAnaSayfaBinding


class AnaSayfa : Fragment() {
    private lateinit var binding: FragmentAnaSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAnaSayfaBinding.inflate(inflater,container,false)
        binding.buttonGoA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.go_A)


        }
        binding.buttonGoX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.go_X)
        }


            return binding.root
    }


}