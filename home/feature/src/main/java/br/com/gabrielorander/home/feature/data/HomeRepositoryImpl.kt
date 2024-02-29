package br.com.gabrielorander.home.feature.data

import br.com.gabrielorander.home.feature.domain.HomeRepository
import br.com.gabrielorander.network.data.model.ShowResponse
import br.com.gabrielorander.network.data.remote.TVMazeApi

class HomeRepositoryImpl(
    private val api: TVMazeApi
): HomeRepository {
    override suspend fun fetchShows(): List<ShowResponse> {
        val response = api.getShows()
        return response.body() ?: emptyList()
    }
}