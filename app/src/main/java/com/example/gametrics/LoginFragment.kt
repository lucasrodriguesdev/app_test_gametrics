package com.example.gametrics

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.gametrics.databinding.FragmentLoginBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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

        val callUser = RetrofitInitializer().userService().list()
        callUser.enqueue(object: Callback<List<User>?> {
            override fun onResponse(call: Call<List<User>?>?,
                                    response: Response<List<User>?>?) {
                response?.body()?.let {
                    val listUser: List<User> = it
                    Log.i("lucas", listUser.toString())
                }
            }
            override fun onFailure(call: Call<List<User>?>?,
                                   t: Throwable?) {
            }
        })

        return binding.root
    }
}
