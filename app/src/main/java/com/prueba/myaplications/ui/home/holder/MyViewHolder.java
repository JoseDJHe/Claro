package com.prueba.myaplications.ui.home.holder;

import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.prueba.myaplications.databinding.CellTextIntemBinding;

public class MyViewHolder extends RecyclerView.ViewHolder{

    public CellTextIntemBinding binding;
    //ViewDataBinding binding;

    public MyViewHolder(CellTextIntemBinding cellTextIntemBinding) {
        super(cellTextIntemBinding.getRoot());

        this.binding = cellTextIntemBinding;

        //binding.tvCell
        //cellTextIntemBinding.
    }
}