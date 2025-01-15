package com.example.uts2.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.uts2.databinding.GameListItemBinding
import com.example.uts2.model.Games

class GameListAdapter(val gameList:ArrayList<Games>)
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
        holder.binding.txtGameId.text = gameList[position].title
        holder.binding.txtSummaryGame.text = gameList[position].short_desc

        holder.binding.btnTeam.setOnClickListener {
            val action = GameListFragmentDirections.actionGameListFragmentToItemMemberFrag()
            Navigation.findNavController(it).navigate(action)
        }


    }

    fun updateGameList(newStudentList: ArrayList<Games>) {
        gameList.clear()
        gameList.addAll(newStudentList)
        notifyDataSetChanged()
    }



}
