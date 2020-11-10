package com.zdan.navigationgraphsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.zdan.navigationgraphsample.databinding.FragmentHomeBinding

class HomeFragment: Fragment(R.layout.fragment_home) {

    // safe way to receive binding
    private var _binding: FragmentHomeBinding? = null
    private val binding : FragmentHomeBinding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // binding view
        _binding = FragmentHomeBinding.bind(view)
        // accessing views from binding
        binding.apply {

            buttonLogin.setOnClickListener {
                // calling action is runtime safe
                val action = HomeFragmentDirections.actionHomeFragmentToLoginFragment()
                findNavController().navigate(action)
            }
        }

    }
}