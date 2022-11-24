package uz.androdev.swipenavigation.chats

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.androdev.swipenavigation.databinding.ItemChatBinding

/**
 * Created by: androdev
 * Date: 24-11-2022
 * Time: 4:26 PM
 * Email: Khudoyshukur.Juraev.001@mail.ru
 */

class ChatsAdapter(
    private val onChatClicked: (Chat) -> Unit
) : ListAdapter<Chat, ChatsAdapter.ViewHolder>(Chat.DIFF_UTIL) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemChatBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val chat = getItem(position) ?: return
        holder.bind(chat, onChatClicked)
    }

    class ViewHolder(private val binding: ItemChatBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(chat: Chat, onChatClicked: (Chat) -> Unit) = with(chat) {
            binding.title.text = title
            binding.subtitle.text = subtitle
            binding.avatar.setImageResource(img)

            binding.root.setOnClickListener { onChatClicked(chat) }
        }
    }
}