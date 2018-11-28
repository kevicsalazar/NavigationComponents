package pe.startapps.navigationcomponents.ui.game

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_gameover.*
import pe.startapps.navigationcomponents.R
import pe.startapps.navigationcomponents.common.BaseFragment


class GameOverFragment : BaseFragment() {

    override fun getLayout(): Int = R.layout.fragment_gameover

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnTryAgain?.setOnClickListener {
            findNavController().navigate(R.id.action_gameOverFragment_to_leaderBoardFragment)
        }

    }

}