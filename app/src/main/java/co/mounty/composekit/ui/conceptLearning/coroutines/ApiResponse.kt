package co.mounty.composekit.ui.conceptLearning.coroutines

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ApiResponse<T>(
    @SerializedName("error")
    @Expose
    var error: Boolean,
    @SerializedName("message")
    @Expose
    var message: String,
    @SerializedName("errorDetails")
    @Expose
    var errorDetails: Error?=null,
    @SerializedName("data")
    @Expose
    var data: T
) : Serializable