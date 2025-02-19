package com.example.uts2.viewmodel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.uts2.databinding.FragmentMainBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(
            inflater,
            container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGame.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToGameListFragment()
            Navigation.findNavController(it).navigate(action)

        }
        binding.btnMember.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToMemberFragment()
            Navigation.findNavController(it).navigate(action)

        }
        binding.btnSchedule.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToScheduleFragment()
            Navigation.findNavController(it).navigate(action)

        }
    }

}