package com.iqonic.usonlinestore.utils.oauthInterceptor

interface TimestampService {
    val timestampInSeconds: String
    val nonce: String
}