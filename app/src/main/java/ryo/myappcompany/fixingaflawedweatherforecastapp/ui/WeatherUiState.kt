package ryo.myappcompany.fixingaflawedweatherforecastapp.ui

sealed interface WeatherUiState {
    data class Success(val weatherArray: String) : WeatherUiState
    object Error : WeatherUiState
    object Loading : WeatherUiState
}
