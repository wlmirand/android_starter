package william.miranda.gpsalarm.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import william.miranda.gpsalarm.databinding.AdapterPlaceBinding
import william.miranda.gpsalarm.model.Place

/**
 * Diff for the Places
 */
private val diffCallback = object : DiffUtil.ItemCallback<Place>() {
    override fun areItemsTheSame(oldItem: Place, newItem: Place) = oldItem.id == newItem.id
    override fun areContentsTheSame(oldItem: Place, newItem: Place) = oldItem.id == newItem.id
}

/**
 * Adapter to display Places
 */
class PlaceAdapter(
    private val data: MutableList<Place> = mutableListOf()
) : ListAdapter<Place, PlaceAdapter.PlaceViewHolder>(diffCallback) {

    /**
     * OnCreateViewHolder
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        return PlaceViewHolder(
            AdapterPlaceBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    /**
     * OnBindViewHolder
     */
    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) =
        holder.bind(data[position])

    /**
     * Size
     */
    override fun getItemCount() = data.size

    /**
     * Update the entire dataset
     */
    fun swap(newData: List<Place>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

    /**
     * Class for the ViewHolder
     */
    inner class PlaceViewHolder(
        private val binding: AdapterPlaceBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        /**
         * Bind the item
         */
        internal fun bind(place: Place) {
            binding.name.text = place.name
        }

    }
}