package com.example.moviles.mercadolibre

import com.example.actividad1am.R

val listaCategorias = listOf(
    Categoria("Tecnología", R.drawable.tecnologia),
    Categoria("Ropa y moda", R.drawable.ropa),
    Categoria("Videojuegos", R.drawable.gaming),
    Categoria("Electrodomésticos", R.drawable.electro)
)

val listaTecnologia = listOf(
    Producto("Audífonos Bluetooth", 899.0, R.drawable.audifonos, true),
    Producto("Mouse Gamer", 650.0, R.drawable.mouse, false),
    Producto("Teclado Mecánico", 1200.0, R.drawable.teclado, true),
    Producto("Monitor 24\"", 3200.0, R.drawable.monitor, false),
    Producto("Webcam HD", 750.0, R.drawable.webcam, false)
)

val listaRopa = listOf(
    Producto("Playera básica", 199.0, R.drawable.playera, true),
    Producto("Jeans", 799.0, R.drawable.jeans, false),
    Producto("Sudadera", 599.0, R.drawable.sudadera, true),
    Producto("Tenis deportivos", 1200.0, R.drawable.tenis, false),
    Producto("Gorra", 250.0, R.drawable.gorra, true)
)

val listaGaming = listOf(
    Producto("Control inalámbrico", 1200.0, R.drawable.control, true),
    Producto("Silla gamer", 3500.0, R.drawable.silla_gamer, false),
    Producto("Headset gamer", 900.0, R.drawable.headset, true),
    Producto("Consola", 9000.0, R.drawable.consola, false),
    Producto("Juego físico", 1200.0, R.drawable.juego, true)
)

val listaElectro = listOf(
    Producto("Refrigerador", 15000.0, R.drawable.refri, false),
    Producto("Microondas", 2500.0, R.drawable.micro, true),
    Producto("Licuadora", 900.0, R.drawable.licuadora, false),
    Producto("Lavadora", 12000.0, R.drawable.lavadora, false),
    Producto("Aspiradora", 3000.0, R.drawable.aspiradora, true)
)