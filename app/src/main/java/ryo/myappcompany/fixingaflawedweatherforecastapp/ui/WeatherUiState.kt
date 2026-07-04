package ryo.myappcompany.fixingaflawedweatherforecastapp.ui

/**
 * 天気情報の取得状態を管理するクラス
 */
sealed interface WeatherUiState {

    /**
     * 取得成功
     *
     * @param weatherArray 取得天気情報の配列
     */
    data class Success(val weatherArray: String) : WeatherUiState

    /**
     * 取得失敗
     */
    object Error : WeatherUiState

    /**
     * 取得中
     */
    object Loading : WeatherUiState
}
