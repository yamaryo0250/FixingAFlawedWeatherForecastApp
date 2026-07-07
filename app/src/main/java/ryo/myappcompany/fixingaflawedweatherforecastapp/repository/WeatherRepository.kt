package ryo.myappcompany.fixingaflawedweatherforecastapp.repository

import ryo.myappcompany.fixingaflawedweatherforecastapp.domain.WeatherInfo

/**
 * 天気情報リポジトリinterface
 */
interface WeatherRepository {

    /**
     * 天気情報取得
     *
     * @param cityId 都市ID
     *
     * @return 天気情報
     */
    suspend fun fetchWeatherData(cityId: String): WeatherInfo
}