package pe.startapps.navigationcomponents.ui.game

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_game.*
import pe.startapps.navigationcomponents.R
import pe.startapps.navigationcomponents.common.BaseFragment


class GameFragment : BaseFragment() {

    override fun getLayout(): Int = R.layout.fragment_game

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnContinue.setOnClickListener {
            checkAndContinue()
        }

    }

    private fun checkAndContinue() {
        if (rbAndroidPie.isChecked) {
            findNavController().navigate(R.id.action_gameFragment_to_gameWinnerFragment)
        } else {
            findNavController().navigate(R.id.action_gameFragment_to_gameOverFragment)
        }
    }

}