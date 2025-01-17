package com.example.tamobile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment

class BiodataFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_biodata_siswa, container, false)

        // Tombol selanjutnya
        val btnSelanjutnya: ImageButton = view.findViewById(R.id.selanjutnya)

        // Aksi ketika tombol ditekan
        btnSelanjutnya.setOnClickListener {
            // Pindah ke fragment lain
            val nextFragment = form_alamat() // Ganti dengan fragment tujuan Anda
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, nextFragment) // Ganti dengan ID container Anda
                .addToBackStack(null) // Tambahkan ke backstack jika ingin memungkinkan kembali
                .commit()
        }

        // Spinner Setup
        val spinner: Spinner = view.findViewById(R.id.spinner_jenis_kelamin)
        val items = listOf("Pilih gender","Laki - Laki", "Perempuan") // Spinner items
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        // Handle Spinner Selection
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                if (position == 0) {
                    // Hint selected, do nothing
                } else {
                    // Perform your actions based on selection
                    val selectedItem = parent.getItemAtPosition(position).toString()
                    Toast.makeText(requireContext(), "Selected: $selectedItem", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }
        }

        // Spinner Setup
        val spinner2: Spinner = view.findViewById(R.id.spinner_agama)
        val items2 = listOf("Pilih agama", "Islam", "Kristen Prostestan", "Kristen Katolik", "Hindu", "Buddha", "Konghucu" ) // Spinner items
        val adapter2 = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, items2)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner2.adapter = adapter2

        // Handle Spinner Selection
        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                if (position == 0) {
                    // Hint selected, do nothing
                } else {
                    // Perform your actions based on selection
                    val selectedItem = parent.getItemAtPosition(position).toString()
                    Toast.makeText(requireContext(), "Selected: $selectedItem", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }
        }



        return view
    }
}
