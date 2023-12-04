package com.sabakarim.fotoedit_pro.filters

import ja.burhanrashid52.photoeditor.PhotoFilter

interface FilterListener {
    fun onFilterSelected(photoFilter: PhotoFilter)
}