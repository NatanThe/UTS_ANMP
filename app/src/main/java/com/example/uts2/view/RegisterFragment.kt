package com.example.uts2.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.uts2.R
import com.example.uts2.databinding.FragmentRegisterBinding
import com.example.uts2.model.User
import com.example.uts2.viewmodel.UserViewModel

class RegisterFragment : Fragment(), BackLoginClick {
    private lateinit var viewModel: UserViewModel
    private lateinit var binding: FragmentRegisterBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel =
            ViewModelProvider(this).get(UserViewModel::class.java)
        binding.backListener = this
        binding.btnCreateAccount.setOnClickListener {
            if (binding.txtNewUsername.text.toString() != ""
                && binding.txtEmail.text.toString() != ""
                && binding.txtNewPassword.text.toString() != ""
            )
            {
                val user = User(binding.txtNewUsername.text.toString(), binding.txtEmail.text.toString(), binding.txtNewPassword.text.toString())
                val list = listOf(user)
                viewModel.addUser(list)
                Toast.makeText(it.context, "Data added", Toast.LENGTH_LONG).show()
                Navigation.findNavController(it).popBackStack()
            }
            else
            {
                Toast.makeText(it.context, "You should fill in all the fields", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBackLoginClick(v: View) {
        Navigation.findNavController(v).popBackStack()
    }
}