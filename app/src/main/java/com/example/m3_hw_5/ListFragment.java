package com.example.m3_hw_5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    private ArrayList<ChatModel> chatModels;
    RecyclerView myrecycler_view;
    Button aadButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        myrecycler_view = view.findViewById(R.id.chat_rv);
        chatModels = new ArrayList<>();
        setChats();
    }

    private void setChats() {
        chatModels.add(new ChatModel(R.drawable.go, "Google", "Основатели: Ларри Пейдж и др."));
        chatModels.add(new ChatModel(R.drawable.li, "Like", "Основатель: David Li Xueling"));
        chatModels.add(new ChatModel(R.drawable.net, "Netflix", "Основана:Ридом Хастингсом и др."));
        chatModels.add(new ChatModel(R.drawable.sn, "Snapchat", "Автор: Эван Шпигель и др."));
        chatModels.add(new ChatModel(R.drawable.od, "Однокласники", "Автор:Альберт Михайлович"));
        chatModels.add(new ChatModel(R.drawable.yan, "Яндекс", "Основатели:Основатели:Елена Савельевна и др"));
        chatModels.add(new ChatModel(R.drawable.tw, "Twitter", "Основатели: Джек Дорси и др."));
        chatModels.add(new ChatModel(R.drawable.you, "YouTube", "Основатели: Джавед Карим и др."));
        chatModels.add(new ChatModel(R.drawable.gis, "2 гис", "Основатели: Александр Сысоев и др."));
        ChatAdapter yy = new ChatAdapter(chatModels);
        myrecycler_view.setAdapter(yy);
    }
}