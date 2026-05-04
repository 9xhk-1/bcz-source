package jr;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import com.huawei.multimedia.liteav.audiokit.interfaces.HwAudioKaraokeFeatureKit;
import com.tencent.liteav.basic.log.TXCLog;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f64613b = "HwAudioKit.FeatureKitManager";

    /* renamed from: c, reason: collision with root package name */
    public static final Object f64614c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f64615d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final Object f64616e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f64617f = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final String f64618g = "com.huawei.multimedia.audioengine";

    /* renamed from: h, reason: collision with root package name */
    public static final int f64619h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static b f64620i;

    /* renamed from: a, reason: collision with root package name */
    public c f64621a = null;

    public static b d() {
        b bVar;
        synchronized (f64615d) {
            try {
                if (f64620i == null) {
                    f64620i = new b();
                }
                bVar = f64620i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public void a(Context context, ServiceConnection serviceConnection, String str) {
        synchronized (f64616e) {
            try {
                if (context == null) {
                    return;
                }
                Intent intent = new Intent();
                intent.setClassName(f64618g, str);
                try {
                    TXCLog.i(f64613b, "bindService");
                    context.bindService(intent, serviceConnection, 1);
                } catch (SecurityException e11) {
                    TXCLog.e(f64613b, "bindService, SecurityException, %s", e11.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public <T extends a> T b(int i11, Context context) {
        TXCLog.i(f64613b, "createFeatureKit, type = %d", Integer.valueOf(i11));
        if (context == null) {
            return null;
        }
        if (i11 != 1) {
            TXCLog.i(f64613b, "createFeatureKit, type error");
            return null;
        }
        HwAudioKaraokeFeatureKit hwAudioKaraokeFeatureKit = new HwAudioKaraokeFeatureKit(context);
        hwAudioKaraokeFeatureKit.o(context);
        return hwAudioKaraokeFeatureKit;
    }

    public c c() {
        return this.f64621a;
    }

    public boolean e(Context context) {
        if (context == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return true;
        }
        try {
            if (packageManager.getPackageInfo(f64618g, 0) != null) {
                return true;
            }
            TXCLog.i(f64613b, "packageInfo is null");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            TXCLog.e(f64613b, "isAudioKitSupport ,NameNotFoundException");
            return false;
        }
    }

    public void f(int i11) {
        TXCLog.i(f64613b, "onCallBack, result = %d", Integer.valueOf(i11));
        synchronized (f64614c) {
            try {
                if (c() != null) {
                    c().onResult(i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(c cVar) {
        this.f64621a = cVar;
    }

    public void h(Context context, ServiceConnection serviceConnection) {
        TXCLog.i(f64613b, "unbindService");
        synchronized (f64617f) {
            if (context != null) {
                try {
                    context.unbindService(serviceConnection);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
