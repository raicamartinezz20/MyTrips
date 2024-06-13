package br.senai.sp.jandira.mytrips.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.mytrips.R
import br.senai.sp.jandira.mytrips.model.Categoria

class CategoriaRepository {

    @Composable
    fun mostrarTodasAsCategorias(): List<Categoria> {
        val montanha= Categoria()
        montanha.id = 1
        montanha.titulo = "Montain"
        montanha.selecionado = true
        montanha.imagem = painterResource(id = R.drawable.montanha)
        
        val neve = Categoria()
        neve.id = 2
        neve.titulo = "Snow"
        neve.selecionado = false
        neve.imagem = painterResource(id = R.drawable.neve)

        val praia = Categoria()
        praia.id = 3
        praia.titulo = "Beach"
        praia.selecionado = false
        praia.imagem = painterResource(id = R.drawable.praia)

        return listOf(montanha, neve, praia)

    }
}
