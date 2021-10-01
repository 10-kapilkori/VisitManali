package com.task.visitmanali.model;

import com.task.visitmanali.R;

public class Places {
    public static String[] placeTitle = {"Hadimba Temple", "Solang Valley", "The Manali Gompa", "Van Vihar", "Bhrigu Lake", "Rohtang Pass", "Gauri Shankar Temple", "Chandrakhani Pass"};
    public static String[] placeLocation = {"Old Manali", "Burwa, Manali", "Old Manali Road, Manali", "Dhungri Village, Manali", "Kullu District, Manali", "Leh – Manali Highway", "Naggar Castle Road", "Near Malana Village"};
    public static int[] placeImg = {R.drawable.hadimba_temple, R.drawable.solang_valley, R.drawable.the_manali_gompa, R.drawable.van_vihar, R.drawable.bhrigu_lake, R.drawable.rohtang_pass, R.drawable.gauri_shankar_temple, R.drawable.chandrakhani_pass};


    public static String[] getPlaceTitle() {
        return placeTitle;
    }

    public static String[] getPlaceLocation() {
        return placeLocation;
    }

    public static int[] getPlaceImg() {
        return placeImg;
    }
}
