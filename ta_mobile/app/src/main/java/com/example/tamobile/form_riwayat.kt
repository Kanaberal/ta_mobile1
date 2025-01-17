package com.example.tamobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [form_riwayat.newInstance] factory method to
 * create an instance of this fragment.
 */
class form_riwayat : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_form_riwayat, container, false)

        // Tombol selanjutnya
        val btnSelanjutnya: ImageButton = view.findViewById(R.id.selanjutnya)
        val btnsebelumnya: ImageButton = view.findViewById(R.id.kembali)

        // Aksi ketika tombol ditekan
        btnSelanjutnya.setOnClickListener {
            // Pindah ke fragment lain
            val nextFragment = form_ayah() // Ganti dengan fragment tujuan Anda
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, nextFragment) // Ganti dengan ID container Anda
                .addToBackStack(null) // Tambahkan ke backstack jika ingin memungkinkan kembali
                .commit()
        }

        btnsebelumnya.setOnClickListener {
            // Pindah ke fragment lain
            val nextFragment = form_kesehatan() // Ganti dengan fragment tujuan Anda
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, nextFragment) // Ganti dengan ID container Anda
                .addToBackStack(null) // Tambahkan ke backstack jika ingin memungkinkan kembali
                .commit()
        }

        // Spinner Setup
        val spinner: Spinner = view.findViewById(R.id.spinner_diterima_dikelas)
        val items = listOf("Diterima di kelas","X", "XI", "XII") // Spinner items
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
        val spinner2: Spinner = view.findViewById(R.id.spinner_program_keahlian)
        val items2 = listOf("","", "") // Spinner items
        val adapter2 = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, items2)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter2

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

        // Spinner Setup
        val spinner3: Spinner = view.findViewById(R.id.spinner_paket_keahlian)
        val items3 = listOf("","", "") // Spinner items
        val adapter3 = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, items3)
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner3.adapter = adapter3

        // Handle Spinner Selection
        spinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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
        val spinner4: Spinner = view.findViewById(R.id.spinner_bidang_keahlian)
        val items4 = listOf("" ) // Spinner items
        val adapter4 = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, items4)
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner4.adapter = adapter4

        // Handle Spinner Selection
        spinner3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
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