package com.basa.janine.appformobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.basa.janine.appformobile.databinding.FragmentHomeeBinding

class HomeeFragment : Fragment() {

    private lateinit var binding: FragmentHomeeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeeBinding.inflate(inflater, container, false)

        binding.settings.setOnClickListener{
            binding.navigationView.visibility = View.VISIBLE
            binding.toolbar.visibility = View.VISIBLE
        }

        binding.toolbar.setOnClickListener {
            binding.navigationView.visibility = View.INVISIBLE
            binding.toolbar.visibility = View.INVISIBLE
        }

//        binding.navigationView.setNavigationItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.nav_profile -> {
//                    //profile-page
//                }
//                R.id.nav_settings -> {
//                    //settings-page
//                }
//                R.id.nav_logout -> {
//                    //logout-page
//                }
//            }
//        }

        return binding.root
    }

}