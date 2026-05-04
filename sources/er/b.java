package er;

import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f50106b = new b();

    /* renamed from: a, reason: collision with root package name */
    public boolean f50107a;

    public b() {
        try {
            Class.forName("com.huawei.appgallery.log.LogAdaptor");
            this.f50107a = true;
        } catch (ClassNotFoundException unused) {
            this.f50107a = false;
        }
    }

    public void a(String str, String str2) {
        if (this.f50107a) {
            a.f50105a.e(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    public void b(String str, String str2, Throwable th2) {
        if (this.f50107a) {
            a.f50105a.e(str, str2, th2);
        } else {
            Log.e(str, str2, th2);
        }
    }

    public void c(String str, String str2) {
        if (this.f50107a) {
            a.f50105a.i(str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    public void d(String str, String str2) {
        if (this.f50107a) {
            a.f50105a.w(str, str2);
        } else {
            Log.w(str, str2);
        }
    }
}
