package com.bignerdranch.android.criminalintent.database

import androidx.room.TypeConverters
import java.util.*

class CrimeTypeConverters {
    @TypeConverters
    fun fromDate(date: Date): Long {
        return date.time
    }

    @TypeConverters
    fun toDate(millisSinceEpoch: Long): Date {
        return Date(millisSinceEpoch)
    }
}