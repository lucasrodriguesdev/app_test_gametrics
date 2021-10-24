package com.example.gametrics

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.gametrics.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false
        )

        binding.tvForgotPassword.setOnClickListener { v: View ->
            binding.userConteiner.visibility = View.GONE
            binding.passwordConteiner.visibility = View.GONE
            binding.btnLogin.visibility = View.GONE
            binding.tvForgotPassword.visibility = View.GONE



            binding.tvLoginMessagePassword.visibility = View.VISIBLE
            binding.emailConteiner.visibility = View.VISIBLE
            binding.btnRecover.visibility = View.VISIBLE

        }

        return binding.root
    }
}
