package com.zdan.navigationgraphsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.zdan.navigationgraphsample.databinding.FragmentHomeBinding
import com.zdan.navigationgraphsample.databinding.FragmentLoginBinding

class LoginFragment: Fragment(R.layout.fragment_login) {

    private var _binding: FragmentLoginBinding? = null
    private val binding : FragmentLoginBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentLoginBinding.bind(view)

        binding.apply {
            buttonConfirm.setOnClickListener {
                // get values from edit text
                val username = editTextUsername.editableText.toString()
                val password = editTextPassword.editableText.toString()
                // pass values as arguments to next fragment
                val action = LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username, password)
                findNavController().navigate(action)
            }
        }

    }
}