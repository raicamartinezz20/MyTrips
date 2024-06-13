package br.senai.sp.jandira.mytrips.model

import androidx.compose.ui.graphics.painter.Painter
import java.time.LocalDate

data class Viagem(
    var id: Int = 0,
    var destino: String ="",
    var descricao: String = "",
    var DataChegada: LocalDate = LocalDate.now(), // Retornar a data de agora
    var DataPartida: LocalDate = LocalDate.now(), // Retornar a data de agora
    var imagem: Painter? = null  //Para obedecer quando precisar usar o nulo, coloca em duvida que pode estar nulo ou nao (caso tenha ou nao imagem)
)
