package com.kriti.ggiandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MusicList extends AppCompatActivity {

    ListView listView;
    String[] titles = {"Poppin'", "You Can't Sit With Us", "Take My Breath", "Love Line", "Sink"};
    String[] artists = {"ONF", "Sunmi", "The Weeknd", "Tinashe", "Zhu Zhengting"};
    int[] artworks = {R.drawable.onf, R.drawable.sunmi, R.drawable.the_weeknd, R.drawable.tinashe,
    R.drawable.zhengting};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);

        listView = findViewById(R.id.musicListView);

        MyAdapter adapter = new MyAdapter();
        listView.setAdapter(adapter);
    }

    class MyAdapter extends BaseAdapter
    {
        @Override
        public int getCount() {
            return titles.length;
        }

        @Override
        public Object getItem(int i) {
            return titles[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null)
            {
                view = getLayoutInflater().inflate(R.layout.music_layout, viewGroup, false);
            }

            ImageView imageView = view.findViewById(R.id.customImageView);
            TextView titleView = view.findViewById(R.id.customTitleView);
            TextView artistView = view.findViewById(R.id.customArtistView);

            imageView.setImageResource(artworks[i]);
            titleView.setText(titles[i]);
            artistView.setText(artists[i]);

            return view;
        }
    }
}