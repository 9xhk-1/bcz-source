package com.baicizhan.client.business.webview.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.util.ChannelUtils;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.client.business.webview.CookieConfig;
import com.baicizhan.client.business.webview.JsonParams;
import com.baicizhan.client.business.webview.hijack.WhiteListMgr;
import com.baicizhan.client.business.webview.ui.SimpleWebView;
import com.jiongji.andriod.card.R;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@SuppressLint({"SetJavaScriptEnabled", "JavascriptInterface"})
/* loaded from: classes4.dex */
public final class SimpleWebView extends WebView {
    private float aspectRatio;
    private boolean attachToLoad;

    @m80.k
    private final HashMap<String, String> header;

    @m80.l
    private OnLoadListener onLoadListener;

    @m80.l
    private String urlString;

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String TAG = SimpleWebView.class.getSimpleName();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnLoadListener {
        void onLoaded(boolean z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SimpleWebView(@m80.k Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        if (!this.attachToLoad || (str = this.urlString) == null) {
            return;
        }
        loadUrl(str, this.header);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.aspectRatio < 0.0f) {
            super.onMeasure(i11, i12);
            return;
        }
        int size = View.MeasureSpec.getSize(i11);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.aspectRatio), 1073741824));
    }

    public final void setAspectRatio(float f11) {
        if (f11 >= 0.0f) {
            this.aspectRatio = f11;
            requestLayout();
        }
    }

    public final void setListener(@m80.k OnLoadListener listener) {
        kotlin.jvm.internal.g0.p(listener, "listener");
        this.onLoadListener = listener;
    }

    public final void setUrl(@m80.l String str) {
        if (str == null) {
            return;
        }
        loadUrl(str, this.header);
        this.urlString = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SimpleWebView(@m80.k Context context, @m80.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public SimpleWebView(@m80.k final Context context, @m80.l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        String token;
        kotlin.jvm.internal.g0.p(context, "context");
        this.header = new HashMap<>();
        this.aspectRatio = -1.0f;
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setSupportZoom(true);
        getSettings().setBuiltInZoomControls(true);
        getSettings().setDisplayZoomControls(false);
        int g11 = xb.o.g(context);
        CookieConfig cookieConfig = new CookieConfig();
        UserRecord p11 = q9.x.r().p();
        if (p11 != null && (token = p11.getToken()) != null) {
            try {
                cookieConfig.putCookie("access_token", URLEncoder.encode(token, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                qb.c.d(TAG, "无法对token做UTF-8编码", new Object[0]);
                yz.g2 g2Var = yz.g2.f100423a;
            }
        }
        String a11 = xb.o.a(pb.a.a());
        String o11 = xb.f.o(a11);
        String PHONE_MODEL = nb.a.f75039b;
        kotlin.jvm.internal.g0.o(PHONE_MODEL, "PHONE_MODEL");
        cookieConfig.putCookie("device_name", "android/" + u30.f0.z2(PHONE_MODEL, " ", "", false, 4, null));
        kotlin.jvm.internal.g0.m(o11);
        String substring = o11.substring(o11.length() + (-8), o11.length());
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        cookieConfig.putCookie("bcz_dmid", substring);
        String str = nb.a.f75038a;
        cookieConfig.putCookie("device_version", str);
        cookieConfig.putCookie("device_id", a11);
        cookieConfig.putCookie("app_name", String.valueOf(g11));
        cookieConfig.putCookie("channel", ChannelUtils.getChannel(pb.a.a()));
        cookieConfig.putCookie("client_time", String.valueOf(System.currentTimeMillis() / 1000));
        cookieConfig.setCookie(pb.a.a());
        this.header.put("Cookie", cookieConfig.getCookie());
        WebSettings settings = getSettings();
        kotlin.jvm.internal.w0 w0Var = kotlin.jvm.internal.w0.f67050a;
        String format = String.format(Locale.CHINA, "%s/%s %s/%s %s/%s", Arrays.copyOf(new Object[]{"bcz_app_android", Integer.valueOf(g11), "android_version", str, "device_name", PHONE_MODEL}, 6));
        kotlin.jvm.internal.g0.o(format, "format(...)");
        settings.setUserAgentString(format);
        setWebViewClient(new WebViewClient() { // from class: com.baicizhan.client.business.webview.ui.SimpleWebView.3
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                super.onPageFinished(webView, str2);
                if (webView != null) {
                    final SimpleWebView simpleWebView = SimpleWebView.this;
                    webView.postVisualStateCallback(1L, new WebView.VisualStateCallback() { // from class: com.baicizhan.client.business.webview.ui.SimpleWebView$3$onPageFinished$1
                        @Override // android.webkit.WebView.VisualStateCallback
                        public void onComplete(long j11) {
                            SimpleWebView.OnLoadListener onLoadListener = SimpleWebView.this.onLoadListener;
                            if (onLoadListener != null) {
                                onLoadListener.onLoaded(true);
                            }
                        }
                    });
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                OnLoadListener onLoadListener = SimpleWebView.this.onLoadListener;
                if (onLoadListener != null) {
                    onLoadListener.onLoaded(false);
                }
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                Uri url;
                if (WhiteListMgr.inst().inWhiteList((webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString())) {
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
                qb.c.b(SimpleWebView.TAG, "override url intercept replace: " + SimpleWebView.this.urlString, new Object[0]);
                return new WebResourceResponse("text/plain", "UTF-8", null);
            }
        });
        addJavascriptInterface(new Object() { // from class: com.baicizhan.client.business.webview.ui.SimpleWebView.4
            @JavascriptInterface
            public final void openNativeAction(String intent) {
                kotlin.jvm.internal.g0.p(intent, "intent");
                if (SimpleWebView.this.isAttachedToWindow()) {
                    Context context2 = context;
                    JsonParams.WebActivityIntentI fromJson = JsonParams.WebActivityIntentI.fromJson(intent);
                    if (fromJson == null) {
                        return;
                    }
                    BczWebHelperKt.startNewWebActivity(context2, fromJson);
                }
            }

            @JavascriptInterface
            public final void report(String json) {
                kotlin.jvm.internal.g0.p(json, "json");
                try {
                    List<String> list = (List) BczJson.fromJson(json, new bp.a<List<? extends String>>() { // from class: com.baicizhan.client.business.webview.ui.SimpleWebView$4$report$result$1
                    }.getType());
                    if (CollectionUtils.isEmpty(list)) {
                        qb.c.d(SimpleWebView.TAG, "empty report %s", json);
                    } else {
                        ma.r.g().o(list);
                    }
                } catch (Exception e11) {
                    qb.c.c(SimpleWebView.TAG, json, e11);
                }
            }
        }, "bcz_system");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SimpleWebView, i11, 0);
        kotlin.jvm.internal.g0.o(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.urlString = obtainStyledAttributes.getString(2);
        this.attachToLoad = obtainStyledAttributes.getBoolean(1, false);
        setAspectRatio(obtainStyledAttributes.getFloat(0, -1.0f));
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ SimpleWebView(Context context, AttributeSet attributeSet, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
