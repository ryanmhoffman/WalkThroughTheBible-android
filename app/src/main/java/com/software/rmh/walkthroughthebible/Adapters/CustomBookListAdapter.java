package com.software.rmh.walkthroughthebible.Adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

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
	public void onBindViewHolder(final ViewHolder holder, int position) {

		Log.d("ArrayList", books.get(position));
		holder.textView.setText(books.get(position));

		holder.view.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(v.getContext(), "Clicked " + holder.getAdapterPosition(), Toast.LENGTH_SHORT).show();
			}
		});
	}

	@Override
	public int getItemCount() {
		return books.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		private final TextView textView;
		private final View view;

		private ViewHolder(View view) {
			super(view);
			this.view = view;
			textView = (TextView) view.findViewById(R.id.content);
		}

	}
}
