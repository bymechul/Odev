package com.example.odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.odev.databinding.FragmentDtyBinding
import kotlinx.android.synthetic.main.fragment_liste.*
import kotlinx.android.synthetic.main.fragment_dty.view.*
class DTYFragment : Fragment() {
    private var _binding: FragmentDtyBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDtyBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttoon.setOnClickListener {
            findNavController().navigate(R.id.action_SFragment_to_FFragment)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}