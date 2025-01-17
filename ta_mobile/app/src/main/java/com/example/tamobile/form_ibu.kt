package com.example.tamobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [form_ibu.newInstance] factory method to
 * create an instance of this fragment.
 */
class form_ibu : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_form_ibu, container, false)

        // Tombol selanjutnya
        val btnSelanjutnya: ImageButton = view.findViewById(R.id.selanjutnya)
        val btnsebelumnya: ImageButton = view.findViewById(R.id.kembali)

        // Aksi ketika tombol ditekan
        btnSelanjutnya.setOnClickListener {
            // Pindah ke fragment lain
            val nextFragment = form_walimurid() // Ganti dengan fragment tujuan Anda
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, nextFragment) // Ganti dengan ID container Anda
                .addToBackStack(null) // Tambahkan ke backstack jika ingin memungkinkan kembali
                .commit()
        }

        btnsebelumnya.setOnClickListener {
            // Pindah ke fragment lain
            val nextFragment = form_ayah() // Ganti dengan fragment tujuan Anda
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, nextFragment) // Ganti dengan ID container Anda
                .addToBackStack(null) // Tambahkan ke backstack jika ingin memungkinkan kembali
                .commit()
        }





        return view
    }
}