package com.stas.spinner

class ColorList {

    private val blackHex = "000000"
    private val whiteHex = "FFFFFF"

    val defaultColor : ColorObject = basicColors()[0]

    fun colorPosition(colorObject: ColorObject) : Int{
        for (color in basicColors().indices){
            if(colorObject == basicColors()[color]){
                return color
            }

        }
        return 0
    }

    fun basicColors() : List<ColorObject>{
        return listOf(
            ColorObject("Black", blackHex,whiteHex),
            ColorObject("Silver", "C0C0C0",blackHex),
            ColorObject("Grey", "808080",whiteHex),
            ColorObject("Maroon", "800000",whiteHex),
            ColorObject("Red", "FF0000",whiteHex),
            ColorObject("Green", "080000",whiteHex),
        )
    }
}