package com.android.flickphoto.ui.display


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs

import com.android.flickphoto.R
import com.android.flickphoto.databinding.FragmentDisplayPhotoBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

/**
 * A simple [Fragment] subclass.
 */
class DisplayPhotoFragment : Fragment() {
    private val args by navArgs<DisplayPhotoFragmentArgs>()
    private val displayViewModel:DisplayPhotoViewModel by viewModel {
        parametersOf(args.photo)
    }
    private lateinit var binding:FragmentDisplayPhotoBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_display_photo,container,false)
        binding.viewModel = displayViewModel
        // Inflate the layout for this fragment
        return binding.root
    }


}