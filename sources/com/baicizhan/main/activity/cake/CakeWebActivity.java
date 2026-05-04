package com.baicizhan.main.activity.cake;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import ch.m;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.client.business.webview.DakaConfig;
import com.baicizhan.client.business.webview.OpenWebViewOption;
import com.baicizhan.client.business.webview.args.Arguments;
import com.baicizhan.client.business.webview.ui.BczWebActivity;
import com.baicizhan.client.business.webview.ui.BczWebView;
import com.baicizhan.client.business.webview.ui.WebWorker;
import com.baicizhan.main.activity.cake.CakeWebActivity;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.main.web.BczWebWorker;
import com.jiongji.andriod.card.R;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Pair;
import ma.l;
import ma.t;
import ma.v;
import pg.l0;
import q9.x;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class CakeWebActivity extends BczWebActivity {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18301a = "CakeWebTag";

    /* renamed from: b, reason: collision with root package name */
    public static final String f18302b = "bcz_pageJump";

    public static void N0(Context context, String url, boolean learning) {
        if (learning) {
            x.r().e0();
            x.r().w0(true);
        }
        Pair<String, OpenWebViewOption> parseUrlToWeb = BczWebHelperKt.parseUrlToWeb(url);
        Bundle arguments = new Arguments().getArguments();
        arguments.putString("title", "");
        arguments.putString(Arguments.ARG_DEFAULT_URL, parseUrlToWeb.getFirst());
        if (parseUrlToWeb.getSecond() != null) {
            arguments.putParcelable(Arguments.ARG_NEW_WEB_OPTION, parseUrlToWeb.getSecond());
        }
        arguments.putInt(Arguments.ARG_URL_STRATEGY, 0);
        arguments.putBoolean(Arguments.ARG_NEED_CACHE, true);
        if (learning) {
            arguments.putSerializable(Arguments.ARG_WEB_WORKER, new BczWebWorker());
        }
        Intent intent = new Intent(context, (Class<?>) CakeWebActivity.class);
        intent.putExtras(arguments);
        context.startActivity(intent);
        ((Activity) context).overridePendingTransition(R.anim.business_push_left_in, R.anim.business_push_left_out);
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebActivity, com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void addJavascriptInterfaces(WebView webView) {
        super.addJavascriptInterfaces(webView);
        webView.addJavascriptInterface(new a((BczWebView) webView), "bcz_pageJump");
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebActivity, com.baicizhan.client.business.webview.ui.Hilt_BczWebActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int color = getResources().getColor(R.color.main_color_common_background);
        this.mBinding.f56143f.setBackgroundColor(color);
        if (Build.VERSION.SDK_INT >= 27) {
            getWindow().setNavigationBarColor(color);
        } else {
            getWindow().addFlags(C.BUFFER_FLAG_FIRST_SAMPLE);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public BczWebView f18303a;

        public a(BczWebView webView) {
            this.f18303a = webView;
        }

        public final void b(final String type) {
            this.f18303a.post(new Runnable() { // from class: kd.a
                @Override // java.lang.Runnable
                public final void run() {
                    CakeWebActivity.a.this.c(type);
                }
            });
        }

        public final /* synthetic */ void c(String str) {
            try {
                WebWorker webWorker = ((BczWebActivity) CakeWebActivity.this).mArguments.getWebWorker();
                if (webWorker == null) {
                    c.q(CakeWebActivity.f18301a, "worker null! are you sure this page should support daka?", new Object[0]);
                    return;
                }
                webWorker.handle(str, CakeWebActivity.this);
                this.f18303a.loadUrl(String.format(Locale.getDefault(), "javascript:%s.requestDakaSuccess()", "bcz_pageJump"));
                CakeWebActivity.this.finish();
            } catch (Exception e11) {
                c.c(CakeWebActivity.f18301a, "", e11);
            }
        }

        public final void d() {
            HashMap hashMap = new HashMap();
            boolean isReviewing = new l0().d().getStatus().isReviewing();
            e.C0296e c0296e = e.C0296e.f19310d;
            e a11 = m.f8648a.a();
            String str = ma.a.F;
            if (c0296e != a11) {
                l.a(t.f73003b, ma.a.F);
                return;
            }
            hashMap.put("plan_type", isReviewing ? v.f73038i : v.f73037h);
            if (isReviewing) {
                str = ma.a.D;
            }
            l.e(t.f73003b, str, hashMap);
        }

        @JavascriptInterface
        public void requestDaka() {
            b(WebWorker.JUMPER_KEY_REQUEST_PUNCH_CARD);
            d();
        }

        @JavascriptInterface
        public void requestDaka(String config) {
            try {
                DakaConfig dakaConfig = (DakaConfig) BczJson.fromJson(config, DakaConfig.class);
                b((dakaConfig == null || !dakaConfig.getSkipCalendar()) ? WebWorker.JUMPER_KEY_REQUEST_PUNCH_CARD : WebWorker.JUMPER_KEY_REQUEST_PUNCH_CARD_SHARE);
            } catch (Exception e11) {
                c.c(CakeWebActivity.f18301a, "", e11);
            }
            d();
        }
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebActivity, com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onSetTitle(String title) {
    }
}
