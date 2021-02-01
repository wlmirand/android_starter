package william.miranda.gpsalarm

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import william.miranda.gpsalarm.di.databaseModule
import william.miranda.gpsalarm.di.serviceModule
import william.miranda.gpsalarm.di.viewModelModule

/**
 * Application class
 */
class GpsApplication : Application() {

    /**
     * OnCreate
     */
    override fun onCreate() {
        super.onCreate()

        // Start Koin
        startKoin {
            androidLogger()
            androidContext(this@GpsApplication)
            modules(
                databaseModule,
                serviceModule,
                viewModelModule
            )
        }
    }
}