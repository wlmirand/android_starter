package william.miranda.gpsalarm.service.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import william.miranda.gpsalarm.model.Place

/**
 * DAO for Places
 */
@Dao
interface PlaceDao {

    @Query("SELECT * FROM place")
    fun getAll(): Flow<List<Place>>

    @Insert
    fun insert(place: Place)

    @Delete
    fun delete(place: Place)
}