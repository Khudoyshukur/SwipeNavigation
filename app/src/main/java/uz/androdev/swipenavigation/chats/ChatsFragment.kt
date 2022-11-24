package uz.androdev.swipenavigation.chats

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import uz.androdev.swipenavigation.base.BaseFragment
import uz.androdev.swipenavigation.databinding.FragmentChatsBinding

/**
 * Created by: androdev
 * Date: 24-11-2022
 * Time: 4:25 PM
 * Email: Khudoyshukur.Juraev.001@mail.ru
 */

class ChatsFragment : BaseFragment<FragmentChatsBinding>(FragmentChatsBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ChatsAdapter(
            onChatClicked = {
                findNavController().navigate(
                    ChatsFragmentDirections.actionChatsFragmentToChatFragment(it.title)
                )
            }
        ).also {
            it.submitList(fakeChats)
        }
        binding.rvChats.adapter = adapter
        binding.rvChats.layoutManager = LinearLayoutManager(
            requireContext(), LinearLayoutManager.VERTICAL, false
        )
        binding.rvChats.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                DividerItemDecoration.VERTICAL
            )
        )
    }
}