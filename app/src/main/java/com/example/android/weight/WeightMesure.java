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

/**
 * {@link WeightMesure} represents a single Android platform release.
 * Each object has 3 properties: name, version number, and image resource ID.
 */
public class WeightMesure {

    // weight of person on the mesure date
    private float mWeigtMesure;

    // date when the mesure is taking
    private String mDateMesure;

    // Drawable resource ID
    private int mImageResourceId;

    /*
    * Create a new WeightMesure object.
    *
    * @param vWeight is the weight of person
    * @param vDate is the to the date when the weight is taken
    * @param image is drawable reference ID that corresponds to the Android version
    * */
    public WeightMesure(float vWeight, String vDate, int imageResourceId)
    {
        mWeigtMesure = vWeight;
        mDateMesure = vDate;
        mImageResourceId = imageResourceId;
    }


    public String getmDateMesure() {

        return mDateMesure;
    }

    public String getmWeigtMesure() {
        return String.valueOf(mWeigtMesure);
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmDateMesure(String mDateMesure) {
        this.mDateMesure = mDateMesure;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public void setmWeigtMesure(float mWeigtMesure) {
        this.mWeigtMesure = mWeigtMesure;
    }
}
