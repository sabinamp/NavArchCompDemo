package com.sabina.navdemo

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.sabina.navdemo.ui.main.MainFragment

class MainActivity : AppCompatActivity(), SecondFragment.OnFragmentInteractionListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

    }
    override fun onFragmentInteraction(uri: Uri) {

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.group_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.menu_red -> {
                item.isChecked = !item.isChecked
                return true
            }

            R.id.menu_green -> {

                item.isChecked = !item.isChecked

                return true
            }

            else -> return super.onOptionsItemSelected(item)

        }

    }
}