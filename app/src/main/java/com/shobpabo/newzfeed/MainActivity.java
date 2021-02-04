package com.shobpabo.newzfeed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.monstertechno.adblocker.AdBlockerWebView;
import com.monstertechno.adblocker.util.AdBlocker;

public class MainActivity extends AppCompatActivity {



    Button startbt;
    RelativeLayout rl1;
    RelativeLayout rl2;
    ImageView prothomalo;
    ImageView bdprotidin;
    ImageView kalerkontho;
    ImageView manobjomin;
    ImageView ittefaq;
    ImageView amadersomoy;
    ImageView jugantor;
    ImageView janakontho;
    ImageView sangbad;
    ImageView jaijaidin;
    ImageView manobkontho;
    ImageView vorerkagoj;




    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired time passed between two back presses.
    private long mBackPressed;

   //Bangla
    WebView webMain;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        startbt = findViewById(R.id.startBT);
        rl1 = findViewById(R.id.rL1);
        rl2 = findViewById(R.id.rL2);
        //bangla
        prothomalo = findViewById(R.id.prothomaloBT);
        bdprotidin = findViewById(R.id.bdproBT);
        kalerkontho = findViewById(R.id.kalerBT);
        manobjomin = findViewById(R.id.mzaminBT);
        manobkontho = findViewById(R.id.manobkanthaBT);
        jaijaidin = findViewById(R.id.jaijaidinBT);
        jugantor = findViewById(R.id.juganttorBT);
        janakontho = findViewById(R.id.janakanthoBT);
        sangbad = findViewById(R.id.sangbadBT);
        vorerkagoj = findViewById(R.id.bhorerkagojBT);
        ittefaq = findViewById(R.id.ittefaqBT);
        amadersomoy = findViewById(R.id.amadersomoyBT);


         webMain = findViewById(R.id.wprothoAlo);







        new AdBlockerWebView.init(this).initializeWebView(webMain);
        WebSettings webSettings = webMain.getSettings();

        webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
        webSettings.setSupportMultipleWindows(false);
        //webSettings.setJavaScriptEnabled(true);

        webMain.setWebViewClient(new Browser_home());
        webMain.loadUrl("https://www.prothomalo.com/");

        startbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rl1.setVisibility(View.GONE);
                rl2.setVisibility(View.VISIBLE);

            }
        });





        prothomalo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webMain.setWebViewClient(new Browser_home());
                webMain.loadUrl("https://www.prothomalo.com/");

            }
        });

        bdprotidin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webMain.setWebViewClient(new Browser_home());
                webMain.loadUrl("https://www.bd-pratidin.com/");

            }
        });

        kalerkontho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AdBlockerWebView.init(MainActivity.this).initializeWebView(webMain);
                WebSettings webSettings = webMain.getSettings();
                webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                webSettings.setSupportMultipleWindows(false);
                webMain.setWebViewClient(new Browser_home());
                webMain.loadUrl("https://www.kalerkantho.com/");

            }
        });
        manobkontho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AdBlockerWebView.init(MainActivity.this).initializeWebView(webMain);
                WebSettings webSettings = webMain.getSettings();
                webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                webSettings.setSupportMultipleWindows(false);
                webMain.setWebViewClient(new Browser_home());
                webMain.loadUrl("https://www.manobkantha.com.bd/");

            }
        });
        manobjomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AdBlockerWebView.init(MainActivity.this).initializeWebView(webMain);
                WebSettings webSettings = webMain.getSettings();
                webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                webSettings.setSupportMultipleWindows(false);
                webMain.setWebViewClient(new Browser_home());
                webMain.loadUrl("https://mzamin.com/");

            }
        });
        jugantor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AdBlockerWebView.init(MainActivity.this).initializeWebView(webMain);
                WebSettings webSettings = webMain.getSettings();
                webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                webSettings.setSupportMultipleWindows(false);
                webMain.setWebViewClient(new Browser_home());
                webMain.loadUrl("https://www.jugantor.com/");

            }
        });
        ittefaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AdBlockerWebView.init(MainActivity.this).initializeWebView(webMain);
                WebSettings webSettings = webMain.getSettings();
                webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                webSettings.setSupportMultipleWindows(false);
                webMain.setWebViewClient(new Browser_home());
                webMain.loadUrl("https://www.ittefaq.com.bd/national");

            }
        });
        jaijaidin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AdBlockerWebView.init(MainActivity.this).initializeWebView(webMain);
                WebSettings webSettings = webMain.getSettings();
                webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                webSettings.setSupportMultipleWindows(false);
                webMain.setWebViewClient(new Browser_home());
                webMain.loadUrl("https://www.jaijaidinbd.com/");

            }
        });
        janakontho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AdBlockerWebView.init(MainActivity.this).initializeWebView(webMain);
                WebSettings webSettings = webMain.getSettings();
                webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                webSettings.setSupportMultipleWindows(false);
                webMain.setWebViewClient(new Browser_home());
                webMain.loadUrl("https://www.dailyjanakantha.com/");

            }
        });

        sangbad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AdBlockerWebView.init(MainActivity.this).initializeWebView(webMain);
                WebSettings webSettings = webMain.getSettings();
                webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                webSettings.setSupportMultipleWindows(false);
                webMain.setWebViewClient(new Browser_home());
                webMain.loadUrl("http://epaper.thesangbad.net/");

            }
        });
        amadersomoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AdBlockerWebView.init(MainActivity.this).initializeWebView(webMain);
                WebSettings webSettings = webMain.getSettings();
                webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                webSettings.setSupportMultipleWindows(false);
                webMain.setWebViewClient(new Browser_home());
                webMain.loadUrl("https://epaper.dainikamadershomoy.com/");

            }
        });
        vorerkagoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AdBlockerWebView.init(MainActivity.this).initializeWebView(webMain);
                WebSettings webSettings = webMain.getSettings();
                webSettings.setJavaScriptCanOpenWindowsAutomatically(false);
                webSettings.setSupportMultipleWindows(false);
                webMain.setWebViewClient(new Browser_home());
                webMain.loadUrl("https://www.bhorerkagoj.com/");

            }
        });
    }

    private class Browser_home extends WebViewClient {

        Browser_home() {}

        @SuppressWarnings("deprecation")
        @Override
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {

            return AdBlockerWebView.blockAds(view,url) ? AdBlocker.createEmptyResource() :
                    super.shouldInterceptRequest(view, url);

        }

    }


    @Override
    public void onBackPressed() {
        if(webMain.canGoBack()){
            webMain.goBack();
        }
        else {

            if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
                super.onBackPressed();


                return;
            } else {
                Toast.makeText(getBaseContext(), "Tap back again to exit", Toast.LENGTH_SHORT).show();

            }
            mBackPressed = System.currentTimeMillis();

        }
    }
}
