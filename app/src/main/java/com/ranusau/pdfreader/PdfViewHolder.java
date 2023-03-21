package com.ranusau.pdfreader;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class PdfViewHolder extends RecyclerView.ViewHolder {

    public TextView textView;
    public CardView cardView;

    public PdfViewHolder(@NonNull View itemView) {
        super(itemView);

        textView = itemView.findViewById(R.id.textPdfName);
        cardView = itemView.findViewById(R.id.cardView);


    }
}
