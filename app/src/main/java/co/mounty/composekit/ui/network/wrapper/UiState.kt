package co.mounty.composekit.ui.network.wrapper

sealed class UiState<out T: Any> {
    object Loading : UiState<Nothing>()
    data class Success<out T : Any>(val data: T) : UiState<T>()
    data class Error(val exception: Exception) : UiState<Nothing>()
}