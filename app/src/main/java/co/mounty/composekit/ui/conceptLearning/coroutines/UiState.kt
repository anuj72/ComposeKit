package co.mounty.composekit.ui.conceptLearning.coroutines

sealed class UiState {
    data class Success(
        val data:ApiResponse<Any>
    ):UiState()

    data class Error(
        val error:String
    ):UiState()

    data class Loading(
        val msg:String
    ):UiState()
}