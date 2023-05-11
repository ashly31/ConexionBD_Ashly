package com.example.conexionbd_ashly

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Usuario {
    @PrimaryKey
    var usuario: String
    var nombre: String? = null
    var contraseña: String? = null

    constructor(nombre: String, usuario: String, contraseña: String) {
        this.nombre = nombre
        this.usuario = usuario
        this.contraseña = contraseña
    }
}