package william.miranda.gpsalarm.service.db

import androidx.room.Database
import androidx.room.RoomDatabase
import william.miranda.gpsalarm.model.Place

/**
 * Database definition
 */
@Database(
    version = 1,
    entities = [
        Place::class
    ]
)
abstract class GpsDatabase : RoomDatabase() {
    abstract fun placeDao(): PlaceDao
}