package com.example.moviles.persistencia

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlin.text.get

class Preferencias (private val contexto: Context){

    companion object{
        val Context.dataStore: DataStore<Preferences>
        by preferencesDataStore("configuraciones")

        val AGE = intPreferencesKey("age")
        val NAME = stringPreferencesKey("name")
        val HASPET = booleanPreferencesKey("hasPet")
    }

    //modo lectura de la info
    val age: Flow<Int> = contexto.dataStore.data.map { preferences ->
        preferences[AGE] ?: 0
    }

    val name: Flow<String> = contexto.dataStore.data.map { preferences ->
        preferences[NAME] ?: "Sin nombre asignado."
    }

    val hasPet: Flow<Boolean> = contexto.dataStore.data.map { preferences ->
        preferences[HASPET] ?: false
    }

    //Guardar los datos
    suspend fun guardarDatosPersonales(
        edad: Int,
        nombre: String,
        mascota: Boolean
    ){
        contexto.dataStore.edit { settings ->
            settings[AGE] = 25
            settings[NAME] = "Juan Perez Perez"
            settings[HASPET] = false
        }
    }

    suspend fun borrarConfiguracion(){
        contexto.dataStore.edit {
            it.remove(AGE)
            it.remove(NAME)
            it.remove(HASPET)
        }
    }
}

