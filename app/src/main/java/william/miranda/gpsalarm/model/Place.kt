package william.miranda.gpsalarm.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * POJO for a Place and its Settings
 */
@Entity
data class Place(
    @PrimaryKey(autoGenerate = true) val id: Long,
    val name: String,
    val latitude: Double,
    val longitude: Double
)