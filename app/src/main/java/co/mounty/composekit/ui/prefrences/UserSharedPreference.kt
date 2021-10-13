package co.mounty.composekit.ui.prefrences

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences



class UserSharedPreference(internal var context: Context?=null) {
    private var sharedPreferences: SharedPreferences =
    context?.getSharedPreferences("userInfo", Context.MODE_PRIVATE)!!
    private var token: String? = null
    private var id: String? = null
    private var applicationId: String? = null
    private var profileId: String? = null
    private var type: String? = null
    private var name: String? = null
    private var isApproved: String? = null
    private var isOnBoarded: String? = null
    private var isProfileComplete: String? = null
    private var cacheId: String? = null
    private var cacheType: String? = null
    private var advType: String? = null
    private var langType: String? = null



    fun setlangType(langType : String) {
        sharedPreferences.edit().putString("langType", langType).commit()
    }
    fun getlangType(): String? {
        langType = sharedPreferences.getString("langType", "")
        return  langType
    }



    fun setadvType(advType : String) {
        sharedPreferences.edit().putString("advType", advType).commit()
    }
    fun getadvType(): String? {
        advType = sharedPreferences.getString("advType", "")
        return  advType
    }

    fun setName(name : String) {
        sharedPreferences.edit().putString("name", name).commit()
    }
    fun getName(): String? {
        name = sharedPreferences.getString("name", "")
        return  name
    }

    fun setCacheType(cacheType : String) {
        sharedPreferences.edit().putString("cacheType", cacheType).commit()
    }
    fun getCacheType(): String? {
        cacheType = sharedPreferences.getString("cacheType", "")
        return  cacheType
    }


    fun setCacheId(cacheId : String) {
        sharedPreferences.edit().putString("cacheId", cacheId).commit()
    }
    fun getCacheId(): String? {
        cacheId = sharedPreferences.getString("cacheId", "")
        return  cacheId
    }




    fun setToken(token : String) {
        sharedPreferences.edit().putString("token", token).commit()
    }
    fun getToken(): String? {
        token = sharedPreferences.getString("token", "")
        return  token
    }

     fun setId(id : String) {
         sharedPreferences.edit().putString("id", id).commit()
     }
     fun getId(): String? {
         id = sharedPreferences.getString("id", "")
         return  id
     }

     fun setApplicationId(applicationId : String) {
         sharedPreferences.edit().putString("applicationId", applicationId).commit()
     }
     fun getApplicationId(): String? {
         applicationId = sharedPreferences.getString("applicationId", "")
         return  applicationId
     }

     fun setProfileId(profileId : String) {
         sharedPreferences.edit().putString("profileId", profileId).commit()
     }
     fun getProfileId(): String? {
         profileId = sharedPreferences.getString("profileId", "")
         return  profileId
     }


     fun setType(type : String) {
         sharedPreferences.edit().putString("type", type).commit()
     }
     fun getType(): String? {
         type = sharedPreferences.getString("type", "")
         return  type
     }

    fun setIsOnboarded(isOnBoarded : String) {
        sharedPreferences.edit().putString("isOnBoarded", isOnBoarded).commit()
    }
    fun getIsOnboarded(): String? {
        isOnBoarded = sharedPreferences.getString("isOnBoarded", "")
        return  isOnBoarded
    }

    fun setIsProfileComplete(isProfileComplete : String) {
        sharedPreferences.edit().putString("isProfileComplete", isProfileComplete).commit()
    }
    fun getIsProfileComplete(): String? {
        isProfileComplete = sharedPreferences.getString("isProfileComplete", "")
        return  isProfileComplete
    }



    fun setIsApproved(isApproved : String?) {
     sharedPreferences.edit().putString("isApproved", isApproved).commit()
     }
     fun getIsApproved(): String? {
         isApproved = sharedPreferences.getString("isApproved", "")
         return  isApproved
     }



}
