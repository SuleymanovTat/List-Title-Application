package ru.suleymanovtat.listtitleapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class HeaderAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;
    private ArrayList<Сontact> сontacts;

    HeaderAdapter(ArrayList<Сontact> сontacts) {
        this.сontacts = сontacts;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM) {
            return new VHItem(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type_item, parent, false));
        } else if (viewType == TYPE_HEADER) {
            return new VHHeader(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_type_header, parent, false));
        }
        throw new RuntimeException("there is no type that matches the type " + viewType + " + make sure your using types correctly");
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Сontact contact = getItem(position);
        if (holder instanceof VHItem) {
            //cast holder to VHItem and set data
            ((VHItem) holder).tvName.setText(contact.getName());
            ((VHItem) holder).tvPhone.setText(contact.getPhone());

        } else if (holder instanceof VHHeader) {
            //cast holder to VHHeader and set data for header.
            ((VHHeader) holder).header.setText(contact.getTitle());
        }
    }

    @Override
    public int getItemCount() {
        return сontacts.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (сontacts.get(position).isHeader()) {
            return TYPE_HEADER;
        }
        return TYPE_ITEM;
    }

    private Сontact getItem(int position) {
        return сontacts.get(position);
    }

    class VHItem extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvPhone;

        VHItem(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvPhone = itemView.findViewById(R.id.tvPhone);
        }
    }

    class VHHeader extends RecyclerView.ViewHolder {
        TextView header;

        VHHeader(View itemView) {
            super(itemView);
            header = itemView.findViewById(R.id.header);
        }
    }
}