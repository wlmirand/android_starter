package william.miranda.gpsalarm.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import william.miranda.gpsalarm.service.db.PlaceDao

/**
 * ViewModel for the HomeFragment
 */
class HomeViewModel(
    placeDao: PlaceDao
) : ViewModel() {

    /**
     * Expose all Places as LiveData
     */
    val places = placeDao.getAll().asLiveData()

}