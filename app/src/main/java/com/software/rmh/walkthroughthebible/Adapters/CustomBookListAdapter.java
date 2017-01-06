package com.software.rmh.walkthroughthebible.Adapters;

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
public class CustomBookListAdapter extends RecyclerView.Adapter<CustomBookListAdapter.ViewHolder> {

	private final List<String> books;

	public CustomBookListAdapter(List<String> items) {
		books = items;
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.fragment_book, parent, false);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(ViewHolder holder, int position) {

		holder.textView.setText(books.get(position));
	}

	@Override
	public int getItemCount() {
		return books.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
		private final TextView textView;

		private ViewHolder(View view) {
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
