package com.software.rmh.walkthroughthebible.Adapters;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.software.rmh.walkthroughthebible.R;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a list of Strings.
 */

public class CustomBiblesAdapter extends RecyclerView.Adapter<CustomBiblesAdapter.CustomViewHolder> {

	private final List<String> bibles;

	public CustomBiblesAdapter(List<String> bibles){
		this.bibles = bibles;
	}

	@Override
	public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.fragment_book, parent, false);
		return new CustomViewHolder(view);
	}

	@Override
	public void onBindViewHolder(CustomViewHolder holder, int position) {

		holder.textView.setText(bibles.get(position));
		if(position == 1){
			holder.textView.setTextColor(ContextCompat.getColor(holder.textView.getContext(), android.R.color.darker_gray));
		}
	}

	@Override
	public int getItemCount() {
		return bibles.size();
	}

	public class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
		private final TextView textView;

		private CustomViewHolder(View view) {
			super(view);
			view.setOnClickListener(this);
			textView = (TextView) view.findViewById(R.id.content);
		}

		@Override
		public void onClick(View view) {
			// Intent to start new Activity to read the select book with the map.
		}
	}

}
