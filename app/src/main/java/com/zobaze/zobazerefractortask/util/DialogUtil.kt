package com.zobaze.zobazerefractortask.util

import android.app.AlertDialog
import android.content.Context

object DialogUtil {

    fun showMessageDialogWithTryButton(context: Context, title: String, message: String, listener: ()-> Unit) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton("Try") { dialog, _ ->
            dialog.dismiss()
            listener()
        }
        val dialog = builder.create()
        dialog.show()
    }
}