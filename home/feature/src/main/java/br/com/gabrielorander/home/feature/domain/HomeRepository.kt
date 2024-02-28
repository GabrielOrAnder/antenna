package br.com.gabrielorander.home.feature.domain

import br.com.gabrielorander.network.data.model.ShowResponse

interface HomeRepository {
    suspend fun fetchShows(): List<ShowResponse>
}