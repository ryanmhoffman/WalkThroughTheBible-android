package com.software.rmh.walkthroughthebible.Adapters;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.software.rmh.walkthroughthebible.Controllers.BookActivity;
import com.software.rmh.walkthroughthebible.Models.Book;
import com.software.rmh.walkthroughthebible.R;

import java.util.ArrayList;

/**
 * {@link RecyclerView.Adapter} that can display a list of Strings.
 */
public class CustomBookListAdapter extends RecyclerView.Adapter<CustomBookListAdapter.ViewHolder> {

	private final ArrayList<Book> books;

	public CustomBookListAdapter(ArrayList<Book> items) {
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

		holder.textView.setText(books.get(position).getName());
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
			Intent intent = new Intent(view.getContext(), BookActivity.class);
			Bundle bundle = new Bundle();
			bundle.putStringArrayList("ARRAYLIST", books);
			bundle.putInt("BOOK_POSITION", getAdapterPosition());
			intent.putExtras(bundle);
			view.getContext().startActivity(intent);
		}
	}
}
