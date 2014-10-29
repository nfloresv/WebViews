package com.flores.nico.webviews;

import android.content.Context;
import android.webkit.JavascriptInterface;

/**
 * Created by nicoflores on 26-10-14.
 */
public class WebViewsInterface {
    GalleryActivity gallery;

    public WebViewsInterface (GalleryActivity galleryActivity) {
        this.gallery = galleryActivity;
    }

    @JavascriptInterface
    public void finishActivity() {
        gallery.finish();
    }
}
