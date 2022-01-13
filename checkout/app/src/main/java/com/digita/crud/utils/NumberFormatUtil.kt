package com.digita.crud.utils

import java.text.NumberFormat
import java.util.*

object NumberFormatUtil {
    fun rupiah(number: Int?): String? {
        val localeID =  Locale("in", "ID")
        val numberFormat = NumberFormat.getCurrencyInstance(localeID)
        return numberFormat.format(number).toString()
    }
}