package com.example.interfaz_usuario

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var txtOpen: TextView
    private lateinit var txtSave: TextView
    private lateinit var txtSaveas: TextView
    private lateinit var txtImport: TextView
    private lateinit var txtExport: TextView
    private lateinit var txtQuit: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.table_activity_2)

        txtOpen = findViewById(R.id.text_open)
        txtSave = findViewById(R.id.text_save)
        txtSaveas = findViewById(R.id.text_save_as)
        txtImport = findViewById(R.id.text_import)
        txtExport = findViewById(R.id.text_export)
        txtQuit = findViewById(R.id.text_quit)

        initEvent()
    }

    private fun initEvent() {
        txtOpen.setOnClickListener {
            Toast.makeText(this, "Jose maria esta abriendo una pantalla...", Toast.LENGTH_LONG)
                .show()
        }
        txtSave.setOnClickListener {
            Toast.makeText(this, "Jose maria esta guardando...", Toast.LENGTH_LONG).show()
        }
        txtSaveas.setOnClickListener {
            Toast.makeText(this, "Jose maria esta guardando como...", Toast.LENGTH_LONG).show()
        }
        txtImport.setOnClickListener {
            Toast.makeText(
                this,
                "Jose maria esta importando un archivo desde...",
                Toast.LENGTH_LONG
            ).show()
        }
        txtExport.setOnClickListener {
            Toast.makeText(this, "Exportando como jose maria...", Toast.LENGTH_LONG).show()
        }
        txtQuit.setOnClickListener {
            Toast.makeText(this, "Jose maria ha cerrado el chiringuito", Toast.LENGTH_LONG).show()
        }
    }
}