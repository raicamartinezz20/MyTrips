package br.senai.sp.jandira.mytrips.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.senai.sp.jandira.mytrips.model.Usuario


@Dao
interface ContaDao {
  @Insert
  fun salvar(usuario: Usuario):Long

  @Update
  fun atualizar(usuario: Usuario): Int

  @Query("SELECT * FROM tbl_usuarios WHERE email = :email")
  fun buscarPeloEmail(email: String): Usuario?
}



