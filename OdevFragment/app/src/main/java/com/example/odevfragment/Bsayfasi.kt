package com.example.odevfragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.odevfragment.databinding.FragmentBsayfasiBinding
import com.example.odevfragment.databinding.FragmentYsayfasiBinding

class Bsayfasi : Fragment() {
    private lateinit var binding: FragmentBsayfasiBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBsayfasiBinding.inflate(inflater,container,false)
        binding.buttonGoY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.go_Y_and)
        }

        val geriTusu=object: OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Log.e("detay sayfa","geri tusu calıstı")
                isEnabled=true
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,geriTusu)
        return binding.root
    }


}