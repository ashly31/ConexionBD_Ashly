package com.example.conexionbd_ashly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.room.Room
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val room = Room.databaseBuilder(this, DBPruebas::class.java, "usuario").build()

        lifecycleScope.launch{
            //INSERTAR INFO
            room.daoUsuario().agregarUsuario(Usuario("Ashly Mora", "chars31", "1234"))
            room.daoUsuario().agregarUsuario(Usuario("Aura Mora", "auli81", "12345"))
            room.daoUsuario().agregarUsuario(Usuario("Ash Castillo", "acastle04", "123456"))

            //LEER: OBTENER INFO
            var usuarios = room.daoUsuario().obtenerUsuarios()
            for (item in usuarios) {
                println("${item.nombre}, ${item.usuario}, ${item.contraseña}")
            }

            //ACTUALIZAR INFO
          //  room.daoUsuario().actualizarUsuario("Charline Mora", "Chars31", "12345")
         //   println("Se actualizó el registro")
         //   usuarios = room.daoUsuario().obtenerUsuarios()
         //   for (item in usuarios) {
          //      println("${item.nombre}, ${item.usuario}, ${item.contraseña}") }

            //BORRAR INFO
          //  room.daoUsuario().borrarUsuario("auli81")
          //  println("Se borró el registro")
         //   usuarios = room.daoUsuario().obtenerUsuarios()
          //  for (item in usuarios){
          //      println("${item.nombre}, ${item.usuario}, ${item.contraseña}") }
        }
    }
}