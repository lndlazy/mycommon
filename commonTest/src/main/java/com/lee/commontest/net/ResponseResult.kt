package com.lee.commontest.net

import android.os.Parcel
import android.os.Parcelable
//import kotlinx.android.parcel.Parcelize
//import kotlinx.parcelize.IgnoredOnParcel

//import kotlinx.android.parcel.Parcelize

//import android.os.Parcelable
//import kotlinx.android.parcel.Parcelize

//import c

//@Parcelize
data class ResponseResult<T>(
//    @SerializedName("errorCode")
//    var errorCode: Int = -1,
//    @SerializedName("errorMsg")
//    var errorMsg: String? = "",
//    @SerializedName("data")
//    var data: T? = null
    var errorCode: Int = -1,
    var errorMsg: String? = "",
    var data: T? = null

)  {

    constructor(source: Parcel) : this(-1, "", null) {
    }

}