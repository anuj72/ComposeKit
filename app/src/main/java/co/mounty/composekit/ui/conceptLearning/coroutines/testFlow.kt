package co.mounty.composekit.ui.conceptLearning.coroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*


fun main(){
    // cold flow
   // cold flow is the flow that triggered the same code every time it get collected
   val coldFlow= flowOf(1,2,3).map { it+1 }
   // coldFlow.collect every time return 2,3,4
     CoroutineScope(Dispatchers.Main).launch {
         coldFlow.onCompletion {

         }.collect {

         }
     }
    //hot flow
  //  hot streams is a flow whose active instance exist independently of the presence of collector
    //type 1.stateflow 2.sharedFlow


    //state flow

    //repeteonlifecycle for state management

    //flow to state flow by stateIn
    var uiState= MutableStateFlow(UiState.Success(ApiResponse(false,"",null,"")))

     CoroutineScope(Dispatchers.Main).launch {
         uiState.emit(UiState.Success(ApiResponse(false,"hello",null,"ssssssssss")))

     }

    uiState.value=(UiState.Success(ApiResponse(false,"hello",null,"ssssssssss")))



     //mutable sharedflow can have multiple collectors
     var stateFlow= MutableSharedFlow<String>(replay = 2)
    CoroutineScope(Dispatchers.Main).launch {
        stateFlow.emit("Hello World")
    }
    CoroutineScope(Dispatchers.Main).launch {
        stateFlow.collect{

        }
    }
}

