package com.baicizhan.client.video.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.widget.FullscreenVideoLayout;
import com.baicizhan.client.video.data.WordTVInfo;
import com.baicizhan.online.bs_words.BBVideoStatArg;
import com.baicizhan.online.bs_words.BSWords;
import com.huawei.hms.framework.common.ContainerUtils;
import com.jiongji.andriod.card.R;
import i9.o;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.j2;
import q9.x;
import va.f;
import va.i;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class TVPlayActivity extends BaseAppCompatActivity implements View.OnClickListener, i.e {
    public static final String A = "video_topic_id";
    public static final String B = "token";
    public static final String C = "enable_share";
    public static final String D = "new_page";
    public static final String E = "init_word_topic_id";
    public static final int F = 12;

    /* renamed from: p, reason: collision with root package name */
    public static final String f17729p = "TVPlayActivity";

    /* renamed from: q, reason: collision with root package name */
    public static final String f17730q = "extra_title";

    /* renamed from: r, reason: collision with root package name */
    public static final String f17731r = "extra_list_type";

    /* renamed from: s, reason: collision with root package name */
    public static final String f17732s = "extra_play_list";

    /* renamed from: t, reason: collision with root package name */
    public static final String f17733t = "extra_init_word";

    /* renamed from: u, reason: collision with root package name */
    public static final int f17734u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f17735v = 1;

    /* renamed from: w, reason: collision with root package name */
    public static final int f17736w = 2;

    /* renamed from: x, reason: collision with root package name */
    public static final String f17737x = "http://www.baicizhan.com/tv/play_list?";

    /* renamed from: y, reason: collision with root package name */
    public static final String f17738y = "http://www.baicizhan.com/tv/topic_play_list?";

    /* renamed from: z, reason: collision with root package name */
    public static final String f17739z = "word_topic_ids";

    /* renamed from: a, reason: collision with root package name */
    public FullscreenVideoLayout f17740a;

    /* renamed from: b, reason: collision with root package name */
    public WebView f17741b;

    /* renamed from: c, reason: collision with root package name */
    public View f17742c;

    /* renamed from: d, reason: collision with root package name */
    public f f17743d;

    /* renamed from: e, reason: collision with root package name */
    public int f17744e;

    /* renamed from: h, reason: collision with root package name */
    public String f17747h;

    /* renamed from: i, reason: collision with root package name */
    public String f17748i;

    /* renamed from: j, reason: collision with root package name */
    public String f17749j;

    /* renamed from: k, reason: collision with root package name */
    public String f17750k;

    /* renamed from: l, reason: collision with root package name */
    public String f17751l;

    /* renamed from: n, reason: collision with root package name */
    public dc.a f17753n;

    /* renamed from: o, reason: collision with root package name */
    public i f17754o;

    /* renamed from: f, reason: collision with root package name */
    public int[] f17745f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f17746g = 0;

    /* renamed from: m, reason: collision with root package name */
    public List<BBVideoStatArg> f17752m = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements p<BSWords.Client, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f17755a;

        public a(final List val$args) {
            this.f17755a = val$args;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(BSWords.Client client) {
            try {
                client.submit_video_stat(this.f17755a);
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements MediaPlayer.OnCompletionListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp2) {
            Log.d(TVPlayActivity.f17729p, "onCompletion " + TVPlayActivity.this.f17747h);
            TVPlayActivity.this.f17741b.loadUrl("javascript:play_callback()");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<TVPlayActivity> f17758a;

        public c(TVPlayActivity activity) {
            this.f17758a = new WeakReference<>(activity);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            TVPlayActivity tVPlayActivity = this.f17758a.get();
            if (tVPlayActivity == null) {
                return;
            }
            if (tVPlayActivity.f17743d != null) {
                tVPlayActivity.f17743d.dismiss();
            }
            if (tVPlayActivity.f17742c.getVisibility() == 8) {
                tVPlayActivity.f17741b.setVisibility(0);
            }
            view.loadUrl("javascript:begin_play()");
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            TVPlayActivity tVPlayActivity = this.f17758a.get();
            if (tVPlayActivity == null) {
                return;
            }
            tVPlayActivity.f17742c.setVisibility(0);
            tVPlayActivity.f17741b.setVisibility(8);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<TVPlayActivity> f17759a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TVPlayActivity f17760a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f17761b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f17762c;

            public a(final TVPlayActivity val$activity, final int val$topicId, final String val$url) {
                this.f17760a = val$activity;
                this.f17761b = val$topicId;
                this.f17762c = val$url;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17760a.Y0(this.f17761b, this.f17762c);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TVPlayActivity f17764a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f17765b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f17766c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f17767d;

            public b(final TVPlayActivity val$activity, final String val$url, final String val$titleDesc, final String val$title) {
                this.f17764a = val$activity;
                this.f17765b = val$url;
                this.f17766c = val$titleDesc;
                this.f17767d = val$title;
            }

            @Override // java.lang.Runnable
            public void run() {
                TVPlayActivity tVPlayActivity = this.f17764a;
                tVPlayActivity.a1(this.f17765b, tVPlayActivity.f17748i, this.f17766c, this.f17767d);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ TVPlayActivity f17769a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f17770b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f17771c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f17772d;

            public c(final TVPlayActivity val$activity, final String val$name, final String val$id, final String val$uid) {
                this.f17769a = val$activity;
                this.f17770b = val$name;
                this.f17771c = val$id;
                this.f17772d = val$uid;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f17769a.f17749j = this.f17770b;
                this.f17769a.f17750k = this.f17771c;
                this.f17769a.f17751l = this.f17772d;
                this.f17769a.f17754o = i.y("回复 " + this.f17769a.f17749j);
                this.f17769a.f17754o.show(this.f17769a.getSupportFragmentManager(), "comment");
            }
        }

        public d(TVPlayActivity activity) {
            this.f17759a = new WeakReference<>(activity);
        }

        @JavascriptInterface
        public void play(final int topicId, final String url) {
            TVPlayActivity tVPlayActivity = this.f17759a.get();
            if (tVPlayActivity != null) {
                tVPlayActivity.runOnUiThread(new a(tVPlayActivity, topicId, url));
            }
        }

        @JavascriptInterface
        public void reply(final String name, final String id2, final String uid) {
            TVPlayActivity tVPlayActivity = this.f17759a.get();
            if (tVPlayActivity != null) {
                Log.d(TVPlayActivity.f17729p, "reply name: " + name + ", id: " + id2 + ", uid: " + uid);
                tVPlayActivity.runOnUiThread(new c(tVPlayActivity, name, id2, uid));
            }
        }

        @JavascriptInterface
        public void share(final String url, final String titleDesc, final String title) {
            TVPlayActivity tVPlayActivity = this.f17759a.get();
            if (tVPlayActivity != null) {
                Log.d(TVPlayActivity.f17729p, "share " + url + j2.O + tVPlayActivity.f17748i + j2.O + titleDesc + j2.O + title);
                tVPlayActivity.runOnUiThread(new b(tVPlayActivity, url, titleDesc, title));
            }
        }
    }

    public static void V0(Context context, String title, int subjectId) {
        Intent intent = new Intent(context, (Class<?>) TVPlayActivity.class);
        intent.putExtra(f17730q, title);
        intent.putExtra(f17731r, 2);
        intent.putExtra(f17732s, new int[]{subjectId});
        context.startActivity(intent);
    }

    public static void W0(Context context, String title, List<WordTVInfo> wordTVInfos, int startIndex) {
        int[] iArr = new int[12];
        int i11 = 0;
        int i12 = startIndex;
        int i13 = 0;
        while (i12 < wordTVInfos.size() && i13 < 12) {
            iArr[i13] = wordTVInfos.get(i12).l();
            i12++;
            i13++;
        }
        int i14 = 0;
        while (i14 < startIndex && i13 < 12) {
            iArr[i13] = wordTVInfos.get(i14).l();
            i14++;
            i13++;
        }
        if (wordTVInfos.size() > startIndex && startIndex >= 0) {
            i11 = wordTVInfos.get(startIndex).l();
        }
        Intent intent = new Intent(context, (Class<?>) TVPlayActivity.class);
        intent.putExtra(f17730q, title);
        intent.putExtra(f17731r, 1);
        intent.putExtra(f17732s, iArr);
        intent.putExtra(f17733t, i11);
        context.startActivity(intent);
    }

    public final void X0() {
        this.f17742c.setVisibility(8);
        this.f17741b.setVisibility(4);
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.f17744e;
        if (i11 == 1) {
            sb2.append(f17737x);
            sb2.append(f17739z);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(Integer.toString(this.f17745f[0]));
            for (int i12 = 1; i12 < this.f17745f.length; i12++) {
                sb2.append(",");
                sb2.append(Integer.toString(this.f17745f[i12]));
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("Invalid list type");
            }
            sb2.append(f17738y);
            sb2.append(A);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(Integer.toString(this.f17745f[0]));
        }
        sb2.append("&");
        sb2.append(E);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(this.f17746g);
        sb2.append("&");
        sb2.append("token");
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(x.r().p().getToken());
        sb2.append("&");
        sb2.append(C);
        sb2.append("=false");
        sb2.append("&");
        sb2.append(D);
        sb2.append("=true");
        String sb3 = sb2.toString();
        Log.d(f17729p, "loadBoard " + sb3);
        this.f17741b.loadUrl(sb3);
    }

    @Override // va.i.e
    public void Y(String comment) {
        if (TextUtils.isEmpty(comment)) {
            Z0();
            return;
        }
        if (!TextUtils.isEmpty(this.f17749j)) {
            comment = "回复 " + this.f17749j + ": " + comment;
        }
        this.f17741b.loadUrl("javascript:remark_android('" + this.f17750k + "', '" + this.f17751l + "', '" + comment + "')");
        Z0();
    }

    public final void Y0(int topicId, String videoUrl) {
        Log.d(f17729p, "playOne " + videoUrl);
        b1();
        this.f17747h = videoUrl;
        try {
            this.f17748i = new URL(this.f17747h).getFile();
        } catch (MalformedURLException unused) {
            this.f17748i = null;
        }
        this.f17740a.setOnCompletionListener(null);
        if (topicId > 0) {
            o.A(this, topicId);
        }
        try {
            if (this.f17740a.d()) {
                this.f17740a.p();
            }
            this.f17740a.j();
            this.f17740a.setVideoURI(Uri.parse(videoUrl));
            this.f17740a.setOnCompletionListener(new b());
        } catch (Exception e11) {
            Log.d(f17729p, Log.getStackTraceString(e11));
        }
    }

    public final void Z0() {
        this.f17751l = null;
        this.f17750k = null;
        this.f17749j = null;
    }

    public final void a1(String url, String videoName, String titleDesc, String title) {
        FullscreenVideoLayout fullscreenVideoLayout = this.f17740a;
        if (fullscreenVideoLayout != null) {
            fullscreenVideoLayout.h();
        }
        dc.a t11 = dc.a.t(url, videoName, titleDesc, title);
        this.f17753n = t11;
        t11.show(getSupportFragmentManager(), "ShareDialogFragment");
    }

    public final void b1() {
        FullscreenVideoLayout fullscreenVideoLayout = this.f17740a;
        if (fullscreenVideoLayout == null || !fullscreenVideoLayout.d()) {
            return;
        }
        int duration = this.f17740a.getDuration();
        int currentPosition = this.f17740a.getCurrentPosition();
        if (currentPosition <= 0 || duration <= 0 || currentPosition > duration || this.f17748i == null) {
            return;
        }
        float f11 = ((currentPosition * 100) / duration) / 100.0f;
        BBVideoStatArg bBVideoStatArg = new BBVideoStatArg();
        bBVideoStatArg.setVideo_name(this.f17748i);
        bBVideoStatArg.setDone_rate(f11);
        this.f17752m.add(bBVideoStatArg);
    }

    @Override // va.i.e
    public void c0() {
        Z0();
    }

    public final void c1(final List<BBVideoStatArg> args) {
        if (args.size() > 0) {
            Log.d(f17729p, "submitStat size " + args.size());
            com.baicizhan.client.business.thrift.p.b("/rpc/words").w5(bc0.c.e()).c3(new a(args)).p5();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity
    public boolean enableCustomSystemBar() {
        return false;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.business_push_right_out);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f17740a.t()) {
            this.f17740a.b();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int id2 = v11.getId();
        if (id2 == R.id.home) {
            finish();
        } else if (id2 == R.id.empty_view) {
            f fVar = new f(this);
            this.f17743d = fVar;
            fVar.show();
            X0();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        if (getResources().getConfiguration().orientation == 2) {
            getWindow().setFlags(1024, 1024);
        } else if (getResources().getConfiguration().orientation == 1) {
            getWindow().clearFlags(1024);
        }
        super.onConfigurationChanged(newConfig);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        int[] iArr;
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.business_push_left_in, 0);
        setContentView(R.layout.activity_tv_play);
        if (x.r().c(this)) {
            finish();
            return;
        }
        if (savedInstanceState == null || !savedInstanceState.containsKey(f17732s)) {
            Intent intent = getIntent();
            intent.getStringExtra(f17730q);
            this.f17744e = intent.getIntExtra(f17731r, 0);
            this.f17745f = intent.getIntArrayExtra(f17732s);
            this.f17746g = intent.getIntExtra(f17733t, 0);
        } else {
            savedInstanceState.getString(f17730q);
            this.f17744e = savedInstanceState.getInt(f17731r, 0);
            this.f17745f = savedInstanceState.getIntArray(f17732s);
            this.f17746g = savedInstanceState.getInt(f17733t);
        }
        if (this.f17744e == 0 || (iArr = this.f17745f) == null || iArr.length == 0) {
            finish();
            return;
        }
        int f11 = (xb.i.f(this) * 9) / 16;
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.video_view_container);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = f11;
        frameLayout.setLayoutParams(layoutParams);
        FullscreenVideoLayout fullscreenVideoLayout = (FullscreenVideoLayout) findViewById(R.id.video_view);
        this.f17740a = fullscreenVideoLayout;
        fullscreenVideoLayout.setActivity(this);
        this.f17740a.setShouldAutoplay(true);
        WebView webView = (WebView) findViewById(R.id.board_web_view);
        this.f17741b = webView;
        WebSettings settings = webView.getSettings();
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        this.f17741b.addJavascriptInterface(new d(this), "Android");
        View findViewById = findViewById(R.id.empty_view);
        this.f17742c = findViewById;
        findViewById.setOnClickListener(this);
        X0();
        this.f17741b.setWebViewClient(new c(this));
        findViewById(R.id.home).setOnClickListener(this);
        getWindow().addFlags(128);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b1();
        c1(this.f17752m);
        this.f17752m.clear();
        WebView webView = this.f17741b;
        if (webView != null) {
            webView.destroy();
        }
        if (isFinishing()) {
            return;
        }
        dc.a aVar = this.f17753n;
        if (aVar != null) {
            aVar.dismiss();
        }
        i iVar = this.f17754o;
        if (iVar != null) {
            iVar.dismiss();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        FullscreenVideoLayout fullscreenVideoLayout = this.f17740a;
        if (fullscreenVideoLayout != null) {
            fullscreenVideoLayout.h();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        FullscreenVideoLayout fullscreenVideoLayout = this.f17740a;
        if (fullscreenVideoLayout != null) {
            fullscreenVideoLayout.u();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (outState != null) {
            outState.putInt(f17731r, this.f17744e);
            int[] iArr = this.f17745f;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            outState.putIntArray(f17732s, iArr);
        }
    }
}
