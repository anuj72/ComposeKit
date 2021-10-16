package co.mounty.composekit.ui.presentation.mainScreen.profile


import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.mounty.composekit.ui.network.api.FakeApiCallRepository
import co.mounty.composekit.ui.network.wrapper.Result
import co.mounty.composekit.ui.network.wrapper.UiState

import co.mounty.composekit.ui.prefrences.UserSharedPreference
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch


class ComposeProfileVM(
    val myPref: UserSharedPreference? = null,
    val repository: FakeApiCallRepository
) : ViewModel() {
    val uiState = MutableStateFlow<UiState<List<String>>>(UiState.Loading)


}


