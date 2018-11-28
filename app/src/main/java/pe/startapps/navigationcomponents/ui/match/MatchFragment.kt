package pe.startapps.navigationcomponents.ui.match

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_match.*
import pe.startapps.navigationcomponents.R
import pe.startapps.navigationcomponents.common.BaseFragment


class MatchFragment : BaseFragment() {

    override fun getLayout(): Int = R.layout.fragment_match

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val args = MatchFragmentArgs.fromBundle(arguments)

        ivFirstPlayer.setImageResource(R.drawable.avatar)
        ivSecondPlayer.setImageResource(args.image)

        btnStart.setOnClickListener {
            findNavController().navigate(R.id.action_matchFragment_to_gameFragment)
        }

    }

}