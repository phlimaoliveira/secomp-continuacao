package com.example.fox.androidxisecomp.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fox on 12/11/2015.
 */
public class Adapter extends BaseAdapter {

    private ArrayList<Noticia> mData = new ArrayList<Noticia>();
    private LayoutInflater mInflater;

    public Adapter(Context context) {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void addItem(Noticia item) {
        mData.add(item);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Noticia getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holderNoticia;

        if (convertView == null) {
            holderNoticia = new ViewHolder();

            // Instância os elementos do ViewHolder

            convertView.setTag(holderNoticia);
        } else {
            holderNoticia = (ViewHolder) convertView.getTag();
        }

        // Seta os elementos da noticia no ViewHolder

        return convertView;
    }

    public static class ViewHolder {

    }

}
