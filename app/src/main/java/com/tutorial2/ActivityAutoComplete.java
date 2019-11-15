package com.tutorial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class ActivityAutoComplete extends AppCompatActivity {
    AutoCompleteTextView autocmplt;
    // Pembuatan array
    String[] arr = {"Aditia Got Cha", "Kulsum", "Daffa Ahmad", "Edgard Jeremiah", "Farid", "Felix", "Haidar", "Raihan", "Rakha"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.control_autocomplete);
        autocmplt = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
/* Membuat adapter yang berfungsi sebagai jembatan antara sebuah data set (dalam hal ini array) dengan view
Adapter akan mengambil data dari data set lalu membuatkan view sesuai dengan data tersebut */
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                // Bagian ini mengatur view untuk
                // menampilkan data dari data set (array : arr)
                (this, android.R.layout.select_dialog_item, arr);
/* Threshold merupakan fungsi untuk mengatur jumlah huruf yang harus diketikkan sebelum suggestion words untuk autocompleteditampilkan.
Dalam kasus ini kita minta minimum 2 huruf */
        autocmplt.setThreshold(2);
        // Mengatur adapter yag digunakan
        autocmplt.setAdapter(adapter);
    }

}
