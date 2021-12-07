package com.prueba.myaplications.ui.home.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

import com.prueba.myaplications.R;
import com.prueba.myaplications.databinding.CellTextIntemBinding;
import com.prueba.myaplications.ui.home.holder.MyViewHolder;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private final List<String> items;

    public MyAdapter(List<String> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CellTextIntemBinding cellTextIntemBinding = CellTextIntemBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new MyViewHolder(cellTextIntemBinding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //String text = String.format(Locale.ENGLISH, "%s %d", items.get(position), position);

        //An example of how to use the bindings
        //holder.binding.tvTest.setText(text);
        holder.binding.tvCell.setText("");
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
