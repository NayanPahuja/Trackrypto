package com.example.trackrypto.models

data class CryptoCurrency(
    val auditInfoList: List<AuditInfo>,
    val circulatingSupply: Double,
    val cmcRank: Double,
    val dateAdded: String,
    val id: Double,
    val isActive: Double,
    val isAudited: Boolean,
    val lastUpdated: String,
    val marketPairCount: Double,
    val maxSupply: Double,
    val name: String,
    val platform: Platform,
    val quotes: List<Quote>,
    val selfReportedCirculatingSupply: Double,
    val slug: String,
    val symbol: String,
    val tags: List<String>,
    val totalSupply: Double
)