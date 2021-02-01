package william.miranda.gpsalarm.di

import androidx.room.Room
import org.koin.dsl.module
import william.miranda.gpsalarm.service.db.GpsDatabase

/**
 * Database Name
 */
private const val DATABASE_NAME = "gps-alarm"

/**
 * Koin Module for Database
 */
val databaseModule = module {

    //Top level definition
    single {
        Room.databaseBuilder(
            get(),
            GpsDatabase::class.java,
            DATABASE_NAME
        ).build()
    }

    //DAOs
    single { get<GpsDatabase>().placeDao() }
}