package br.com.gabrielorander.home.feature.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.gabrielorander.home.feature.domain.HomeRepository
import br.com.gabrielorander.network.data.model.ShowResponse
import kotlinx.coroutines.launch

class HomeViewModel(
    private val homeRepository: HomeRepository
): ViewModel() {
    private val _shows = mutableStateOf(HomeState())
    val shows = _shows

    fun fetchShows() = viewModelScope.launch {
        try {
            _shows.value = HomeState(isLoading = true)
            val shows = homeRepository.fetchShows()
            _shows.value = HomeState(shows = shows)
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