package com.software.rmh.walkthroughthebible.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.software.rmh.walkthroughthebible.R;
import com.software.rmh.walkthroughthebible.Views.BookListFragment.OnListFragmentInteractionListener;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a list of Strings and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class MyStringRecyclerViewAdapter extends RecyclerView.Adapter<MyStringRecyclerViewAdapter.ViewHolder> {

	private final List<String> books;
	private final OnListFragmentInteractionListener listener;

	public MyStringRecyclerViewAdapter(List<String> items, OnListFragmentInteractionListener listener) {
		books = items;
		this.listener = listener;
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.fragment_book, parent, false);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(final ViewHolder holder, int position) {

		//holder.textView.setText(books.get(position).content);

		holder.view.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if(null != listener) {
					// Notify the active callbacks interface (the activity, if the
					// fragment is attached to one) that an item has been selected.
					//listener.onListFragmentInteraction(holder.mItem);
				}
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

		@Override
		public String toString() {
			return super.toString() + " '" + textView.getText() + "'";
		}
	}
}
