package ja.burhanrashid52.photoeditor

import android.graphics.Bitmap

/**
 * @author [Hamza Iqbal](https://github.com/burhanrashid52)
 * @version 0.1.2
 * @since 5/21/2018
 */
interface OnSaveBitmap {
    fun onBitmapReady(saveBitmap: Bitmap)
}