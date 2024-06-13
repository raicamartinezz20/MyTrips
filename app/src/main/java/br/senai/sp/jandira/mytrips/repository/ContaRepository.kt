package br.senai.sp.jandira.mytrips.repository

import android.content.Context
import br.senai.sp.jandira.mytrips.dao.ContaDb
import br.senai.sp.jandira.mytrips.model.Usuario

class ContaRepository (context: Context){

    private val db = ContaDb.getBancoDeDados(context).contaDao()


    fun salvar(usuario: Usuario):Long{
        return db.salvar(usuario)
    }

    fun listarTodosOsUsuarios ():List<Usuario>{
        return db.
    }


    fun verificarLogin(email: String, senha: String): Boolean{
        val usuario = db.buscarPeloEmail(email)
        return usuario != null && usuario.senha == senha
    }





}

