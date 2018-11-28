package pe.startapps.navigationcomponents.ui.leaderboard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_item.view.*
import pe.startapps.navigationcomponents.R
import pe.startapps.navigationcomponents.model.Item


class LeaderBoardAdapter(val list: List<Item>, val f: (Item) -> Unit) : RecyclerView.Adapter<LeaderBoardAdapter.ViewHolder>() {

    override fun getItemCount() = list.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position], f)
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(item: Item, f: (Item) -> Unit) {
            itemView.tag = item
            itemView.tvTitle.text = item.title
            itemView.tvSubtitle.text = item.subtitle
            itemView.ivAvatar.setImageResource(item.image)
            itemView.setOnClickListener {
                f.invoke(it.tag as Item)
            }
        }

    }


}