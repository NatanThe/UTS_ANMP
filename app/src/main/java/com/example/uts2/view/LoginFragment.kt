package com.example.uts2.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.uts2.databinding.FragmentLoginBinding
import com.example.uts2.model.User
import com.example.uts2.viewmodel.UserViewModel

class LoginFragment : Fragment(), RegistClick, LoginClick {
    private lateinit var viewModel: UserViewModel
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(UserViewModel::class.java)

        // Create a User object and bind it to the layout
        binding.user = User(username = "", email = "", password = "")

        // Set the click listeners
        binding.loginListener = this
        binding.registListener = this
    }

    override fun onLoginClick(v: View, obj: User) {
        if (obj.username.isNotEmpty() && obj.password.isNotEmpty()) {
            viewModel.login(obj.username, obj.password)
            Toast.makeText(v.context, "Welcome", Toast.LENGTH_LONG).show()
            val action = LoginFragmentDirections.actionLoginFragmentToMainFragment()
            Navigation.findNavController(v).navigate(action)
        } else {
            Toast.makeText(v.context, "You should fill in all the fields", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onRegistClick(v: View) {
        val action = LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
        Navigation.findNavController(v).navigate(action)
    }
}