package com.example.tamobile

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navigationView: NavigationView = findViewById(R.id.navigation_view)
        val drawerButton: ImageButton = findViewById(R.id.drawer)

        // Load the FragmentHome as the default fragment when MainActivity starts
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, FragmentHome()) // Replace with your Home Fragment class
                .commit()
        }

        // Set up ImageButton click listener to open/close the navigation drawer
        drawerButton.setOnClickListener {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START)
            } else {
                drawerLayout.openDrawer(GravityCompat.START)
            }
        }

        // Set up Navigation Drawer item click listener
        navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.nav_home -> {
                    // Load the Home Fragment
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, FragmentHome())
                        .addToBackStack(null)
                        .commit()
                }
                R.id.nav_tambah_data -> {
                    // Load the BiodataFragment
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, BiodataFragment())
                        .addToBackStack(null)
                        .commit()
                }
                R.id.nav_angkatan_kelas -> {
                    // Load the DataSiswa Fragment
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, data_siswa()) // Replace with your class
                        .addToBackStack(null)
                        .commit()
                }
                R.id.nav_data_siswa -> {
                    // Load the DataSiswa2 Fragment
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, data_siswa2()) // Replace with your class
                        .addToBackStack(null)
                        .commit()
                }
                // Handle other menu items here
            }

            // Close the drawer after handling the item click
            drawerLayout.closeDrawer(GravityCompat.START)
            true
        }
    }
}
