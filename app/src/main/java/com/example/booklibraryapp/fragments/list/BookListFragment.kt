package com.example.booklibraryapp.fragments.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.booklibraryapp.R
import com.example.booklibraryapp.databinding.FragmentBookListBinding


class bookListFragment : Fragment() {

    private var _binding: FragmentBookListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentBookListBinding.inflate(inflater, container, false)

        binding.fabAddBook.setOnClickListener {
            findNavController().navigate(R.id.action_bookListFragment_to_addBookFragment)
        }
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}