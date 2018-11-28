package pe.startapps.navigationcomponents.ui.game

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_gamewinner.*
import pe.startapps.navigationcomponents.R
import pe.startapps.navigationcomponents.common.BaseFragment


class GameWinnerFragment : BaseFragment() {

    override fun getLayout(): Int = R.layout.fragment_gamewinner

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnNextMatch?.setOnClickListener {
            findNavController().navigate(R.id.action_gameWinnerFragment_to_leaderBoardFragment)
        }

    }

}