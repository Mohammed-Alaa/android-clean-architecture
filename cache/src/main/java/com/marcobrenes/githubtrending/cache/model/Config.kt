package com.marcobrenes.githubtrending.cache.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.marcobrenes.githubtrending.cache.db.ConfigConstants.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class Config(
        @PrimaryKey(autoGenerate = true)
        var id: Int = -1,
        val lastCacheTime: Long
)