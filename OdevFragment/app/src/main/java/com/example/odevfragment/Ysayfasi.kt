package com.example.odevfragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.odevfragment.databinding.FragmentYsayfasiBinding

class Ysayfasi : Fragment() {
    private lateinit var binding: FragmentYsayfasiBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentYsayfasiBinding.inflate(inflater,container,false)
        val geriTusu=object: OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Log.e("detay sayfa", "geri tuşu çalıştı")
                isEnabled = false
                Navigation.findNavController(requireView()).navigate(R.id.go_main)
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,geriTusu)

        return binding.root
    }



}