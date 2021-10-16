package co.mounty.composekit.ui.presentation.mainScreen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.mounty.composekit.ui.network.api.FakeApiCallRepository
import co.mounty.composekit.ui.network.wrapper.Result
import co.mounty.composekit.ui.network.wrapper.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class ComposeHomeVM(
    private val repository: FakeApiCallRepository
):ViewModel() {

    val uiState = MutableStateFlow<UiState<List<String>>>(UiState.Loading)
    init {
        getMyData()
    }

    private fun getMyData() {
        viewModelScope.launch {
            val result = repository.apiCall()
            uiState.value = when (result) {
                is Result.Success -> UiState.Success(result.data)
                is Result.Error -> UiState.Error(result.exception)
            }
        }
    }
}