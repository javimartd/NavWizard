package com.javimartd.navwizard.ui.navigation.type

import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavType
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json

inline fun <reified T: Parcelable> NavType.Companion.parcelableTypeOf() = object: NavType<T>(isNullableAllowed = false) {
    override fun get(bundle: Bundle, key: String): T? {
        return bundle.getParcelable(key) as T?
    }

    override fun parseValue(value: String): T {
        return  Json.decodeFromString(Uri.decode(value))
    }

    override fun put(bundle: Bundle, key: String, value: T) {
        bundle.putParcelable(key, value)
    }
}