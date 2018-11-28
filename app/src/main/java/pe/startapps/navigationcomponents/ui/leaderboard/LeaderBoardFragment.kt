package pe.startapps.navigationcomponents.ui.leaderboard

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_leaderboard.*
import pe.startapps.navigationcomponents.R
import pe.startapps.navigationcomponents.common.BaseFragment
import pe.startapps.navigationcomponents.model.Item

class LeaderBoardFragment : BaseFragment() {

    override fun getLayout(): Int = R.layout.fragment_leaderboard

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = LeaderBoardAdapter(getList()) {

            val directions = LeaderBoardFragmentDirections
                    .actionLeaderBoardFragmentToMatchFragment(it.image)

            findNavController().navigate(directions)
        }

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter

    }

    private fun getList(): List<Item> {
        return listOf(
                Item("Item 01", "", R.drawable.avatar_01),
                Item("Item 02", "", R.drawable.avatar_02),
                Item("Item 03", "", R.drawable.avatar_03),
                Item("Item 04", "", R.drawable.avatar_04),
                Item("Item 05", "", R.drawable.avatar_05),
                Item("Item 06", "", R.drawable.avatar_06),
                Item("Item 07", "", R.drawable.avatar_07),
                Item("Item 08", "", R.drawable.avatar_08),
                Item("Item 09", "", R.drawable.avatar_09),
                Item("Item 10", "", R.drawable.avatar_10)
        )
    }

}