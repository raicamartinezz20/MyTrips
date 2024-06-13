package br.senai.sp.jandira.mytrips.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_usuarios")
data class Usuario(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nome: String = "",
    val telefone: String = "",
    val email: String = "",
    val senha: String = "",
    @ColumnInfo(name = "is_over") val isOver: Boolean = false
)
