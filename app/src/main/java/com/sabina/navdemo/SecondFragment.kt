package com.sabina.navdemo

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {

    private var inputMessage: String? = null
    private lateinit var argTxt:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            inputMessage = it.getString(ARG_PARAM1)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentView = inflater.inflate(R.layout.fragment_second, container, false)
        argTxt= fragmentView.findViewById(R.id.argTxt)
        return fragmentView
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param input Parameter 1.
        * @return A new instance of fragment SecondFragment.
         */

        @JvmStatic
        fun newInstance(input: String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, input)
                }
            }
    }

    interface OnFragmentInteractionListener {

        // TODO: Update argument type and name

        fun onFragmentInteraction(uri: Uri)

    }

    override fun onStart() {

        super.onStart()
        arguments?.let {
            var args = SecondFragmentArgs.fromBundle(it)
            argTxt.text = args.inputMessage
        }

    }
}
