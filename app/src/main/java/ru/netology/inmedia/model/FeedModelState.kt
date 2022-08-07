package ru.netology.inmedia.model

data class FeedModelState(
    val loading: Boolean = false,
    val error: Boolean = false,
    val refreshing: Boolean = false,
    val serverError: Boolean = false
)