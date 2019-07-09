package ru.skillbranch.devintensive.extensions

fun String.truncate(len: Int = 16): String {
    val result = this.trim()
    return if (result.length <= len + 1) result else "${result.take(len).trimEnd()}..."
}
