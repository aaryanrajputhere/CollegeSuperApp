package com.example.collegesuperapp.ui.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.collegesuperapp.databinding.FragmentEventsBinding
import android.app.Dialog
import android.content.Intent
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.collegesuperapp.R

class EventsFragment : Fragment() {

    private var _binding: FragmentEventsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val eventsViewModel =
            ViewModelProvider(this).get(EventsViewModel::class.java)

        _binding = FragmentEventsBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val detailsButton: Button = root.findViewById(R.id.detailsButton)

        // Set click listener for the button
        detailsButton.setOnClickListener {
            // Open the new activity when the button is clicked
            val intent = Intent(activity, EventDetails::class.java)
            startActivity(intent)
        }

        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}