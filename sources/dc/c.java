package dc;

import android.content.Context;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.widget.DisguiseProgressBar;
import com.baicizhan.client.video.activity.TVPlayActivity;
import com.jiongji.andriod.card.R;
import java.util.HashMap;
import kc.r;
import kc.u;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends Fragment implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public static final String f47696e = "TVSubjectFragment";

    /* renamed from: f, reason: collision with root package name */
    public static final String f47697f = "token";

    /* renamed from: a, reason: collision with root package name */
    public WebView f47698a;

    /* renamed from: b, reason: collision with root package name */
    public DisguiseProgressBar f47699b;

    /* renamed from: c, reason: collision with root package name */
    public View f47700c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f47701d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends WebViewClient {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: dc.c$a$a, reason: collision with other inner class name */
        public class C0561a extends r {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ SslErrorHandler f47703a;

            public C0561a(final SslErrorHandler val$handler) {
                this.f47703a = val$handler;
            }

            @Override // kc.r, kc.q
            public void onDialogNegativeClick(@NonNull View view) {
                this.f47703a.cancel();
            }

            @Override // kc.r, kc.q
            public void onDialogPositiveClick(@NonNull View view) {
                this.f47703a.proceed();
            }
        }

        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            c.this.f47699b.b();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            c.this.f47699b.b();
            c.this.f47700c.setVisibility(0);
            c.this.f47698a.setVisibility(8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, final SslErrorHandler handler, SslError error) {
            mc.a.l(c.this, ((u) ((u.a) ((u.a) new u.a(view.getContext()).M("百词斩").V("嘿呀！来到了一个更为安全的网络！不要害怕这里依然是百词斩( •̀ .̫ •́ )✧").F("仍然访问")).p("取消访问")).d()).f0(new C0561a(handler)), "ssl-error");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public Context f47705a;

        public b(Context context) {
            this.f47705a = context;
        }

        @JavascriptInterface
        public void play(final int subjectId) {
            Log.d(c.f47696e, "play " + subjectId);
            Context context = this.f47705a;
            TVPlayActivity.V0(context, context.getString(R.string.video_title_subject), subjectId);
        }
    }

    private void load() {
        this.f47700c.setVisibility(8);
        this.f47698a.setVisibility(0);
        this.f47699b.d();
        UserRecord p11 = x.r().p();
        HashMap hashMap = new HashMap(1);
        if (p11 != null && !TextUtils.isEmpty(p11.getToken())) {
            hashMap.put("token", p11.getToken());
        }
        this.f47698a.loadUrl(ec.a.f49629c, hashMap);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        if (v11.getId() == R.id.empty_view) {
            load();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_tv_subject, container, false);
        this.f47698a = (WebView) inflate.findViewById(R.id.subject_web_view);
        this.f47699b = (DisguiseProgressBar) inflate.findViewById(R.id.subject_progress);
        View findViewById = inflate.findViewById(R.id.empty_view);
        this.f47700c = findViewById;
        findViewById.setOnClickListener(this);
        TextView textView = (TextView) this.f47700c.findViewById(R.id.text);
        this.f47701d = textView;
        textView.setText("专题加载失败，点击重试");
        WebSettings settings = this.f47698a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(1);
        if (rb.d.f(getActivity())) {
            settings.setCacheMode(-1);
        } else {
            settings.setCacheMode(1);
        }
        if (x.r().S()) {
            settings.setMixedContentMode(0);
        }
        this.f47698a.addJavascriptInterface(new b(getActivity()), "Android");
        this.f47698a.setWebViewClient(new a());
        load();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        WebView webView = this.f47698a;
        if (webView != null) {
            webView.destroy();
        }
        this.f47698a = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f47699b.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        WebView webView = this.f47698a;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        WebView webView = this.f47698a;
        if (webView != null) {
            webView.onResume();
        }
    }
}
