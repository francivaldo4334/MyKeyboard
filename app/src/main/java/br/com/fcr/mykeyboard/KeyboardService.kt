package br.com.fcr.mykeyboard

import android.content.SharedPreferences
import android.inputmethodservice.InputMethodService
import android.view.View

class KeyboardService : InputMethodService(), View.OnClickListener{

    override fun onCreateInputView(): View {
        val view = layoutInflater.inflate(R.layout.keyboard_screen,null)
        return view
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}