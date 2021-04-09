package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affiramation

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object
 */

class ItemAdapter(private val context: Context,private val dataset: List<Affiramation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHoldert>() {
    //provid a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation
    class ItemViewHoldert(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }
/*
create new views (invoked by the layout manager
 */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHoldert {
    //creat a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHoldert(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHoldert, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResoueceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }
/*
Return the size of your dataset (invoked by the layout manager
 */
    override fun getItemCount()= dataset.size
}
