package com.vsnmobil.valrt.fragment;

import android.os.Bundle;
//import
import android.support.v4.app.Fragment;
//import
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
//import
import android.view.View;
//import
import android.view.ViewGroup;
//import
import android.widget.ImageView;
//import
import android.widget.TextView;
//import
import com.vsnmobil.valrt.R;
/**
 * SlideTwoFragment.java
 * To show the tour image in the slider view.
 */
public class SlideTwoFragment extends Fragment {
    /** The title text view. */
    private TextView titleTextView;
    /** The contect text view. */
    private TextView contectTextView;
    /** The tour image view. */
    private ImageView tourImageView;
    /* (non-Javadoc)
     * @see android.support.v4.app.Fragment#onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tour_slide, container, false);
        titleTextView = (TextView) view.findViewById(R.id.tour_title_textview);
        contectTextView = (TextView) view.findViewById(R.id.tour_content_textview);
        tourImageView = (ImageView) view.findViewById(R.id.tour_image_imageview);
        tourImageView.setImageDrawable(getResources().getDrawable(R.drawable.bg_tour_image_two));
        titleTextView.setText(getString(R.string.slide2_title));
        contectTextView.setText(getString(R.string.slide2_content));
        contectTextView.setMovementMethod(new ScrollingMovementMethod());
        return view;
    }
}
