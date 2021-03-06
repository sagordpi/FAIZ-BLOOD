package com.redappsbd.faizblood.faizblood;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;


class MyAppWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(Uri.parse(url).getHost().endsWith("expertitbd.com")) {
            return false;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;

    }



    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        view.clearCache(true);
    }


}
