package com.example.ucp2_pertemuan9

import androidx.lifecycle.ViewModel
import com.example.ucp2_pertemuan9.data.FormUIState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.text.NumberFormat

class ContactViewModel : ViewModel() {
    private val _stateUI = MutableStateFlow(FormUIState())
    val stateUI: StateFlow<FormUIState> = _stateUI.asStateFlow()

    fun setContact(listData: MutableList<String>) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = listData[0],
                nim = listData[1],
                konsentrasi = listData[3],
                judulskripsi= listData[4]
            )
        }
    }
}
