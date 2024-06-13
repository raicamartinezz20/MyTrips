package br.senai.sp.jandira.mytrips.dao

import android.content.Context
import androidx.compose.material.ripple.rememberRipple
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.mytrips.model.Usuario


@Database(entities = [Usuario::class], version = 1)
 abstract class ContaDb : RoomDatabase() {
     abstract  fun contaDao(): ContaDao

     companion object{
         private lateinit var instancia: ContaDb

         fun getBancoDeDados(context: Context): ContaDb{
             instancia = Room
                 .databaseBuilder(
                     context,
                     ContaDb::class.java,
                     "db_contas"
                 )
                 .allowMainThreadQueries()
                 .fallbackToDestructiveMigration()
                 .build()

             return instancia
         }
     }

}