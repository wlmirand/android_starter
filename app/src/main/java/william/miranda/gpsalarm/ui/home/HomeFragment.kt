package william.miranda.gpsalarm.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import org.koin.androidx.viewmodel.ext.android.viewModel
import william.miranda.gpsalarm.databinding.FragmentHomeBinding

/**
 * Home Fragment
 */
class HomeFragment : Fragment() {

    /**
     * Layout Binding
     */
    private lateinit var binding: FragmentHomeBinding

    /**
     * ViewModel
     */
    private val viewModel: HomeViewModel by viewModel()

    /**
     * Adapter for the Places
     */
    private val adapter: PlaceAdapter by lazy { PlaceAdapter() }

    /**
     * OnCreate View
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    /**
     * OnViewCreated
     */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        //Prepare the RecyclerView
        binding.recyclerView.apply {
            adapter = this@HomeFragment.adapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        //Setup the Floating Action Button to navigate
        binding.fab.setOnClickListener { findNavController().navigate(HomeFragmentDirections.toAddPlaceFragment()) }

        //Observe the Data
        viewModel.places.observe(viewLifecycleOwner) {
            adapter.swap(it)
        }
    }
}