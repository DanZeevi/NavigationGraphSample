package com.zdan.navigationgraphsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.zdan.navigationgraphsample.databinding.FragmentHomeBinding
import com.zdan.navigationgraphsample.databinding.FragmentLoginBinding
import com.zdan.navigationgraphsample.databinding.FragmentWelcomeBinding

class WelcomeFragment: Fragment(R.layout.fragment_welcome) {

    private var _binding: FragmentWelcomeBinding ? = null
    private val binding : FragmentWelcomeBinding
        get() = _binding!!

    private val args: WelcomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val username = args.username
        val password = args.password

        _binding = FragmentWelcomeBinding.bind(view)

        binding.apply {

            // set text according to args
            textViewUsername.text = username
            textViewPassword.text = password

            buttonOk.setOnClickListener {
                val action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
                findNavController().navigate(action)
            }
        }

    }
}