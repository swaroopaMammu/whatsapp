package com.example.whatsapp.chats.ui.view

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.whatsapp.chats.ui.viewmodel.ChatListViewModel
import com.example.whatsapp.databinding.FragmentChatListBinding

class ChatListFragment : Fragment() {

    companion object {
        fun newInstance() = ChatListFragment()
    }
    private lateinit var binding : FragmentChatListBinding
    private val viewModel: ChatListViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentChatListBinding.inflate(inflater,container,false)
        return  binding.root
    }
}