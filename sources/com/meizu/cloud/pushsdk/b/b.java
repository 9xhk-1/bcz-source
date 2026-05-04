package com.meizu.cloud.pushsdk.b;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
class b implements f {

    /* renamed from: j, reason: collision with root package name */
    private ThreadPoolExecutor f39365j;

    /* renamed from: d, reason: collision with root package name */
    private long f39359d = 60;

    /* renamed from: e, reason: collision with root package name */
    private int f39360e = 10;

    /* renamed from: i, reason: collision with root package name */
    private boolean f39364i = false;

    /* renamed from: a, reason: collision with root package name */
    private final SimpleDateFormat f39356a = new SimpleDateFormat("MM-dd HH:mm:ss");

    /* renamed from: b, reason: collision with root package name */
    private final List<a> f39357b = Collections.synchronizedList(new ArrayList());

    /* renamed from: c, reason: collision with root package name */
    private final Handler f39358c = new Handler(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    private String f39362g = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/pushSdk/defaultLog";

    /* renamed from: f, reason: collision with root package name */
    private final e f39361f = new e();

    /* renamed from: h, reason: collision with root package name */
    private final String f39363h = String.valueOf(Process.myPid());

    public class a {

        /* renamed from: a, reason: collision with root package name */
        final String f39372a;

        /* renamed from: b, reason: collision with root package name */
        final String f39373b;

        /* renamed from: c, reason: collision with root package name */
        final String f39374c;

        public a(String str, String str2, String str3) {
            this.f39372a = b.this.f39356a.format(new Date()) + " " + b.this.f39363h + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Thread.currentThread().getId() + " " + str + "/";
            this.f39373b = str2;
            this.f39374c = str3;
        }
    }

    public b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new j().a("log-pool-%d").a());
        this.f39365j = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    private void a(a aVar) {
        try {
            this.f39357b.add(aVar);
        } catch (Exception e11) {
            Log.e("Logger", "add logInfo error " + e11.getMessage());
        }
    }

    private void b() {
        if (this.f39357b.size() == 0) {
            this.f39358c.postDelayed(new Runnable() { // from class: com.meizu.cloud.pushsdk.b.b.1
                @Override // java.lang.Runnable
                public void run() {
                    b.this.a(true);
                }
            }, this.f39359d * 1000);
        }
    }

    private void c() {
        if (this.f39357b.size() == this.f39360e) {
            a(true);
        }
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void d(String str, String str2) {
        if (this.f39364i) {
            Log.e(str, str2);
        }
        synchronized (this.f39357b) {
            b();
            a(new a(ExifInterface.LONGITUDE_EAST, str, str2));
            c();
        }
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void a(String str) {
        this.f39362g = str;
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void b(String str, String str2) {
        if (this.f39364i) {
            Log.i(str, str2);
        }
        synchronized (this.f39357b) {
            b();
            a(new a("I", str, str2));
            c();
        }
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void c(String str, String str2) {
        if (this.f39364i) {
            Log.w(str, str2);
        }
        synchronized (this.f39357b) {
            b();
            a(new a(ExifInterface.LONGITUDE_WEST, str, str2));
            c();
        }
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void a(String str, String str2) {
        if (this.f39364i) {
            Log.d(str, str2);
        }
        synchronized (this.f39357b) {
            b();
            a(new a("D", str, str2));
            c();
        }
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void b(boolean z11) {
        this.f39364i = z11;
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void a(String str, String str2, Throwable th2) {
        if (this.f39364i) {
            Log.e(str, str2, th2);
        }
        synchronized (this.f39357b) {
            b();
            a(new a(ExifInterface.LONGITUDE_EAST, str, str2 + "\n" + Log.getStackTraceString(th2)));
            c();
        }
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public void a(boolean z11) {
        ThreadPoolExecutor threadPoolExecutor;
        Runnable runnable = new Runnable() { // from class: com.meizu.cloud.pushsdk.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                ArrayList<a> arrayList;
                synchronized (b.this.f39357b) {
                    b.this.f39358c.removeCallbacksAndMessages(null);
                    arrayList = new ArrayList(b.this.f39357b);
                    b.this.f39357b.clear();
                    try {
                    } catch (Exception unused) {
                        return;
                    }
                }
                try {
                    b.this.f39361f.a(b.this.f39362g);
                    for (a aVar : arrayList) {
                        b.this.f39361f.a(aVar.f39372a, aVar.f39373b, aVar.f39374c);
                    }
                    b.this.f39361f.a();
                } catch (Exception unused2) {
                    b.this.f39361f.a();
                } catch (Throwable th2) {
                    try {
                        b.this.f39361f.a();
                    } catch (Exception unused3) {
                    }
                    throw th2;
                }
            }
        };
        if (!z11 || (threadPoolExecutor = this.f39365j) == null) {
            runnable.run();
        } else {
            threadPoolExecutor.execute(runnable);
        }
    }

    @Override // com.meizu.cloud.pushsdk.b.f
    public boolean a() {
        return this.f39364i;
    }
}
