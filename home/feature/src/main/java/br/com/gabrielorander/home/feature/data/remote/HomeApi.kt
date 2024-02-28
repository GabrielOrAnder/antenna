package br.com.gabrielorander.home.feature.data.remote

import br.com.gabrielorander.network.data.model.ShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface HomeApi {
    @GET("/shows")
    suspend fun getShows(): Response<List<ShowResponse>>
//
//    @GET("/shows/{showId}?embed=seasons")
//    suspend fun getShowWithSeasons(@Path("showId") showId: Int): DetailedShowResponse
//
//    @GET("/search/shows")
//    suspend fun getShowByName(@Query("q") tvShowName: String): List<SearchShowResponse>
//
//    @GET("/seasons/{seasonId}/episodes")
//    suspend fun getSeasonEpisodes(@Path("seasonId") seasonId: Int): List<SimpleEpisodeResponse>
//
//    @GET("/episodes/{episodeId}")
//    suspend fun getEpisodeDetail(@Path("episodeId") episodeId: Int): EpisodeResponse

}