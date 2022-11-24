package uz.androdev.swipenavigation.chats

import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.DiffUtil
import uz.androdev.swipenavigation.R

/**
 * Created by: androdev
 * Date: 24-11-2022
 * Time: 4:26 PM
 * Email: Khudoyshukur.Juraev.001@mail.ru
 */

data class Chat(
    val id: Long,
    val title: String,
    val subtitle: String,
    @DrawableRes val img: Int
) {
    companion object {
        val DIFF_UTIL = object : DiffUtil.ItemCallback<Chat>() {
            override fun areItemsTheSame(oldItem: Chat, newItem: Chat): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Chat, newItem: Chat): Boolean {
                return oldItem == newItem
            }
        }
    }
}

val fakeChats = listOf(
    Chat(
        id = 1,
        title = "Elon Musk",
        subtitle = "Hi! How are you? Are you still working as a software engineer?",
        img = R.drawable.img_elon_musk
    ),
    Chat(
        id = 2,
        title = "Bill Gates",
        subtitle = "The following year, a Lakeside teacher enlisted Gates and Evans to automate the school's class-scheduling system, providing them computer time and royalties in return",
        img = R.drawable.img_bill_gates
    ),
)