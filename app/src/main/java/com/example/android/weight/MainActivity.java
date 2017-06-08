/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.weight;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * {@link MainActivity} shows a list of Android platform releases.
 * For each release, display the name, version number, and image.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an ArrayList of WeightMesure objects
        ArrayList<WeightMesure> weightMesures = new ArrayList<WeightMesure>();
        weightMesures.add(new WeightMesure(67.8f, DateFormat.getDateInstance().format(new Date()), R.drawable.donut));
        weightMesures.add(new WeightMesure(67.9f, DateFormat.getDateInstance().format(new Date()), R.drawable.eclair));
        weightMesures.add(new WeightMesure(67.8f, DateFormat.getDateInstance().format(new Date()), R.drawable.donut));
        weightMesures.add(new WeightMesure(67.9f, DateFormat.getDateInstance().format(new Date()), R.drawable.eclair));
        weightMesures.add(new WeightMesure(67.8f, DateFormat.getDateInstance().format(new Date()), R.drawable.donut));
        weightMesures.add(new WeightMesure(67.9f, DateFormat.getDateInstance().format(new Date()), R.drawable.eclair));
        weightMesures.add(new WeightMesure(67.8f, DateFormat.getDateInstance().format(new Date()), R.drawable.donut));
        weightMesures.add(new WeightMesure(67.9f, DateFormat.getDateInstance().format(new Date()), R.drawable.eclair));
        weightMesures.add(new WeightMesure(67.8f, DateFormat.getDateInstance().format(new Date()), R.drawable.donut));
        weightMesures.add(new WeightMesure(67.9f, DateFormat.getDateInstance().format(new Date()), R.drawable.eclair));
        weightMesures.add(new WeightMesure(67.8f, DateFormat.getDateInstance().format(new Date()), R.drawable.donut));
        weightMesures.add(new WeightMesure(67.9f, DateFormat.getDateInstance().format(new Date()), R.drawable.eclair));
        weightMesures.add(new WeightMesure(67.8f, DateFormat.getDateInstance().format(new Date()), R.drawable.donut));
        weightMesures.add(new WeightMesure(67.9f, DateFormat.getDateInstance().format(new Date()), R.drawable.eclair));

        // Create an {@link WeightMesureAdapter}, whose data source is a list of
        // {@link WeightMesure}s. The adapter knows how to create list item views for each item
        // in the list.
        WeightMesureAdapter flavorAdapter = new WeightMesureAdapter(this, weightMesures);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_weight);
        listView.setAdapter(flavorAdapter);
    }
}
