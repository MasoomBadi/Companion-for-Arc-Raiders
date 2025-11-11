package com.phoenix.companionforarcraiders.core.util

/**
 * A sealed class representing the result of an operation
 * Used throughout the app for consistent error handling and loading states
 *
 * @param T The type of data being returned
 */
sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}
