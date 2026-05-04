package hw;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.sina.weibo.sdk.web.WebActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebActivity f59792a;

    public c(WebActivity webActivity) {
        this.f59792a = webActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i11) {
        super.onProgressChanged(webView, i11);
        this.f59792a.f41594e.setProgress(i11);
        if (i11 == 100) {
            this.f59792a.f41594e.setVisibility(4);
        } else {
            this.f59792a.f41594e.setVisibility(0);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
    }
}
