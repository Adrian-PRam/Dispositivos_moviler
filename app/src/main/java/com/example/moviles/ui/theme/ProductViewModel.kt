package com.example.moviles.ui.theme

import com.example.moviles.R


class ProductViewModel {
    fun getProducts() :List<ProductModel>{
        var productList = mutableListOf<ProductModel>()
        productList.add(ProductModel(imagen = R.drawable.reyes,
            nombre = "Macbook Pro:",
            calificacion = 4.8f,
            precio = 12998,
            diaDeLlegada = "viernes"))

        productList.add(ProductModel(imagen = R.drawable.facebook_icons,
            nombre = "Aspiradora",
            calificacion = 4.8f,
            precio = 1000,
            diaDeLlegada = "jueves"))

        productList.add(ProductModel(imagen = R.drawable.plus_icon_1,
            nombre = "Laptop chida",
            calificacion = 3.7f,
            precio = 60000,
            diaDeLlegada = "lunes"))

        productList.add(ProductModel(imagen = R.drawable.retry,
            nombre = "Producto cool",
            calificacion = 4.3f,
            precio = 50000,
            diaDeLlegada = "miercoles"))

        productList.add(ProductModel(imagen = R.drawable.messenger,
            nombre = "Messenger",
            calificacion = 4.1f,
            precio = 1900,
            diaDeLlegada = "sabado"))

        productList.add(ProductModel(imagen = R.drawable.reyes,
            nombre = "Television",
            calificacion = 3.5f,
            precio = 1090,
            diaDeLlegada = "jueves"))

        productList.add(ProductModel(imagen = R.drawable.menu_icon,
            nombre = "Celular epico",
            calificacion = 5.0f,
            precio = 19090,
            diaDeLlegada = "martes"))

        return productList
    }



}