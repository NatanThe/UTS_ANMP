package com.example.uts2.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.uts2.databinding.GameListItemBinding
import com.example.uts2.model.Game

class GameListAdapter(val gameList:ArrayList<Game>)
    : RecyclerView.Adapter<GameListAdapter.GameViewHolder>()
{
    class GameViewHolder(var binding: GameListItemBinding)
        :RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val binding = GameListItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)
        return GameViewHolder(binding)

    }

    override fun getItemCount(): Int {
        return gameList.size
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        holder.binding.txtGameId.text = gameList[position].id
        holder.binding.txtSummaryGame.text = gameList[position].summary

    }


}
