package yr;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f100288a = "f";

    public static String a(String str) {
        Context a11 = c.a();
        if (a11 == null) {
            return "";
        }
        try {
            return a11.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e11) {
            h.d(f100288a, "getVersion NameNotFoundException : " + e11.getMessage());
            return "";
        } catch (Exception e12) {
            h.d(f100288a, "getVersion: " + e12.getMessage());
            return "";
        } catch (Throwable unused) {
            h.d(f100288a, "throwable");
            return "";
        }
    }

    public static int b(String str) {
        Context a11 = c.a();
        if (a11 == null) {
            return 0;
        }
        try {
            return a11.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            h.d(f100288a, "getVersion NameNotFoundException");
            return 0;
        } catch (Exception e11) {
            h.d(f100288a, "getVersion: " + e11.getMessage());
            return 0;
        }
    }
}
