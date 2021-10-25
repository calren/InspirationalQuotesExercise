package com.caren.dailyinspirationalquote.network

import com.squareup.moshi.Json

/**
 * https://premium.zenquotes.io/zenquotes-documentation/#api-response
 
 
[
 {
	"q": "Lack of emotion causes lack of progress and lack of motivation.",
	"a": "Tony Robbins",
	"i": "https://zenquotes.io/img/tony-robbins.jpg",
	"c": "63",
	"h": "<blockquote>&ldquo;Lack of emotion causes lack of progress and lack of motivation.&rdquo; &mdash; <footer>Tony Robbins</footer></blockquote>"
 }
] 
 */
data class Quote(

    @Json(name = "q")
    val quote: String?,

    @Json(name = "a")
    val author: String?,

    @Json(name = "h")
    val preformattedHTML: String?,
)
