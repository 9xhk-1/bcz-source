package nb;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f75038a = Build.VERSION.RELEASE;

    /* renamed from: b, reason: collision with root package name */
    public static final String f75039b = Build.MODEL + " - " + Build.MANUFACTURER;

    /* renamed from: c, reason: collision with root package name */
    public static String f75040c = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f75041d = "";

    /* renamed from: e, reason: collision with root package name */
    public static String f75042e = "";

    public static final String a() {
        return f75040c;
    }

    public static final String b() {
        return f75042e;
    }

    public static final String c() {
        return f75041d;
    }

    public static final synchronized void d() {
        synchronized (a.class) {
            try {
                PackageInfo packageInfo = pb.a.a().getPackageManager().getPackageInfo(pb.a.a().getPackageName(), 0);
                String str = packageInfo.versionName;
                int i11 = packageInfo.versionCode;
                f75040c = str + " - " + i11;
                f75041d = str;
                f75042e += i11;
            } catch (PackageManager.NameNotFoundException e11) {
                e11.printStackTrace();
            }
        }
    }
}
