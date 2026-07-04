package ryo.myappcompany.fixingaflawedweatherforecastapp.mapper

import ryo.myappcompany.fixingaflawedweatherforecastapp.domain.WeatherInfo
import ryo.myappcompany.fixingaflawedweatherforecastapp.dto.WeatherResponseDto

class WeatherMapper {
    fun WeatherResponseDto.toDomain(): WeatherInfo {
        val weatherItem = weather.firstOrNull()

        return WeatherInfo(
            weather = weatherItem?.main.orEmpty(),
            description = weatherItem?.description.orEmpty(),
            temperature = main.temp,
            humidity = main.humidity
        )
    }
}
