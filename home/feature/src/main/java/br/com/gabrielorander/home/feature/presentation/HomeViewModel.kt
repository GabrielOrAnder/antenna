package br.com.gabrielorander.home.feature.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.gabrielorander.home.feature.domain.HomeRepository
import br.com.gabrielorander.network.data.model.ShowResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val homeRepository: HomeRepository
): ViewModel() {
    private val _shows = MutableStateFlow(HomeState())
    val shows = _shows.asStateFlow()

    fun fetchShows() = viewModelScope.launch {
        try {
            val showsResponse = homeRepository.fetchShows()
            Log.i("RESPONSE", showsResponse.toString())
        } catch (e: Exception) {
            _shows.value = HomeState(error = e.message ?: "An unexpected error occurred")
        }
    }


    data class HomeState(
        val shows: List<ShowResponse> = emptyList(),
        val isLoading: Boolean = false,
        val error: String = ""
    )
}