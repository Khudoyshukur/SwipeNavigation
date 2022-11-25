package uz.androdev.swipenavigation.chat

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import uz.androdev.swipenavigation.base.BaseSwipeableFragment
import uz.androdev.swipenavigation.databinding.FragmentChatBinding

/**
 * Created by: androdev
 * Date: 24-11-2022
 * Time: 4:45 PM
 * Email: Khudoyshukur.Juraev.001@mail.ru
 */

class ChatFragment : BaseSwipeableFragment<FragmentChatBinding>(FragmentChatBinding::inflate) {
    private val args: ChatFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.title = args.title
        binding.toolbar.setNavigationOnClickListener { findNavController().navigateUp() }
    }
}