package com.ranusau.pdfreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.List;

public class PdfAdapter extends RecyclerView.Adapter<PdfViewHolder> {

    private Context context;
    private List<File> pdfFile;

    public PdfAdapter(Context context, List<File> pdfFile) {
        this.context = context;
        this.pdfFile = pdfFile;
    }

    @NonNull
    @Override
    public PdfViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PdfViewHolder(LayoutInflater.from(context).inflate(R.layout.element_holder,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PdfViewHolder holder, int position) {
        holder.textView.setText(pdfFile.get(position).getName());
        holder.textView.setSelected(true);
    }

    @Override
    public int getItemCount() {
        return pdfFile.size();
    }
}
