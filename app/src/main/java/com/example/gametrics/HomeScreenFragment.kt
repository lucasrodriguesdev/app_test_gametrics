package com.example.gametrics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.gametrics.databinding.FragmentHomeScreenBinding

class HomeScreenFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentHomeScreenBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home_screen, container, false
        )

        binding.btnNewbie.setOnClickListener { v: View ->
            v.findNavController().navigate(R.id.action_homeScreenFragment_to_createAccountFragment)
        }

        binding.tvSignin.setOnClickListener { v: View ->
            v.findNavController().navigate(R.id.action_homeScreenFragment_to_loginFragment)
        }

        return binding.root

    }
}