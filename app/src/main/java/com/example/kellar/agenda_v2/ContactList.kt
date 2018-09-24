package com.example.kellar.agenda_v2
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_contact_list_adapter.*


class ContactList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list_adapter)
        contact_list_recyclerview.layoutManager = LinearLayoutManager(this)
        contact_list_recyclerview.setHasFixedSize(true)
        contact_list_recyclerview.adapter = ListContactAdapter(mutableListOf("Tiago", "Andreia", "Dayene"))
    }

}





/*
abstract class ContactListAdapter(private val list: List<ListContactAdapter>,
                                  private val context: Context) : Adapter<ContactListAdapter.ViewHolder>() {

    override fun onBindViewHolder(list: List<ListContactAdapter>) {
        val list = list
    }

    override fun onCreateViewHolder(p0: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    }
}
*/

