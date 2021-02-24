package com.sabina.navdemo.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.NavDirections
import androidx.navigation.Navigation
import com.sabina.navdemo.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }
    private lateinit var button: Button

    private lateinit var viewModel: MainViewModel
    private lateinit var userText: EditText

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view= inflater.inflate(R.layout.main_fragment, container, false)
        button = view.findViewById(R.id.button)
        userText= view.findViewById(R.id.userText)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        button.setOnClickListener {
            val actionMainToSecond =  MainFragmentDirections.mainToSecond(userText.text.toString())
            // get a reference to the navigation controller and calls the navigate() method on it, arg- the resource ID of the navigation action
            Navigation.findNavController(it).navigate( actionMainToSecond)
         }


        /*
         the Navigation class also includes a method createNavigateOnClickListener() which provides a more efficient way of setting up a listener and navigating to a destination.
          The same result can be achieved, therefore, using the following single line of code to initiate the transition:
         button.setOnClickListener(Navigation.createNavigateOnClickListener( R.id.mainToSecond, null))
         */
    }

}