package as;

import android.util.Log;
import android.webkit.WebView;
import java.util.concurrent.CountDownLatch;
import zr.o;
import zr.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final String f5476c = "SafeGetUrl";

    /* renamed from: d, reason: collision with root package name */
    public static final long f5477d = 200;

    /* renamed from: a, reason: collision with root package name */
    public String f5478a;

    /* renamed from: b, reason: collision with root package name */
    public WebView f5479b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: as.a$a, reason: collision with other inner class name */
    public class RunnableC0097a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f5480a;

        public RunnableC0097a(CountDownLatch countDownLatch) {
            this.f5480a = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.d(aVar.f5479b.getUrl());
            this.f5480a.countDown();
        }
    }

    public a() {
    }

    public String b() {
        if (this.f5479b == null) {
            return "";
        }
        if (o.a()) {
            return this.f5479b.getUrl();
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        p.a(new RunnableC0097a(countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e11) {
            Log.e(f5476c, "getUrlMethod: InterruptedException " + e11.getMessage(), e11);
        }
        return this.f5478a;
    }

    public WebView c() {
        return this.f5479b;
    }

    public void d(String str) {
        this.f5478a = str;
    }

    public void e(WebView webView) {
        this.f5479b = webView;
    }

    public a(WebView webView) {
        this.f5479b = webView;
    }
}
