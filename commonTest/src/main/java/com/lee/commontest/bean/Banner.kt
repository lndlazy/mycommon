package com.lee.commontest.bean

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Banner(

    var desc: String,
    var id: Int,
    var imagePath: String,
    var isVisible: Char,
    var order: Int,
    var title: String,
    var type: Char,
    var url: String,

    ) : Parcelable {

    constructor() : this("", -1, "", '0', -1, "", '0', "") {

    }

}