package com.stas.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import com.stas.spinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    lateinit var selectedColor : ColorObject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadColorSpinner()
    }

    private fun loadColorSpinner() {
        selectedColor = ColorList().defaultColor
        binding.colorSpinner.apply {
            adapter = ColorSpinnerAdapter(applicationContext,ColorList().basicColors())
            setSelection(ColorList().colorPosition(selectedColor),false)
            onItemSelectedListener = object : AdapterView.OnItemSelectedListener,
                AdapterView.OnItemClickListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    p1: View?,
                    position: Int,
                    id: Long
                ) {
                    selectedColor = ColorList().basicColors()[position]
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {}
                override fun onItemClick(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {

                }
            }
        }

    }
}