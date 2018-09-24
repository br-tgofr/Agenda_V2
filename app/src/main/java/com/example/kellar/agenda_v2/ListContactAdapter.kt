package com.example.kellar.agenda_v2
import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.SurfaceHolder
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView


class ListContactAdapter(var names: MutableList<String>): RecyclerView.Adapter<ListContactAdapter.ViewHolder>(){
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.contact.text = names[position]
    }


    override fun getItemCount(): Int {
        return names.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viwType: Int): ViewHolder {
        var view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item, false)
        return ViewHolder(view)
    }

    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val contact: TextView = view.find<TextView>(R.id.contact_list)
        init {

        }
    }

}