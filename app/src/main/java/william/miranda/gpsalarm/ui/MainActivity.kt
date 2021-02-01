package william.miranda.gpsalarm.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import william.miranda.gpsalarm.R
import william.miranda.gpsalarm.databinding.ActivityMainBinding

/**
 * Main Activity
 */
class MainActivity : AppCompatActivity() {

    /**
     * Layout Binding
     */
    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    /**
     * NavController
     */
    private val navController: NavController by lazy { findNavController(R.id.nav_host_fragment) }

    /**
     * OnCreate
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Setup ActionBar and Navigation
        setSupportActionBar(binding.toolbar)
        NavigationUI.setupWithNavController(binding.toolbar, navController)
    }
}