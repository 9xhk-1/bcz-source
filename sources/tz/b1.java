package tz;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;

/* loaded from: classes8.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static b1 f91240a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f91241b = new Object();

    public static b1 b() {
        synchronized (f91241b) {
            try {
                if (f91240a == null) {
                    f91240a = new b1();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f91240a;
    }

    public final String a(String str) {
        String a11 = z0.b().a(str);
        if (TextUtils.isEmpty(a11)) {
            return null;
        }
        return a11;
    }

    public boolean c(Context context) {
        String a11 = a(h0.a("Z3NtLnZlcnNpb24uYmFzZWJhbmQ="));
        int i11 = (a11 == null || a11.contains("1.0.0.0")) ? 1 : 0;
        String a12 = a(h0.a("cm8uYnVpbGQuZmxhdm9y"));
        if (a12 == null || a12.contains("vbox") || a12.contains("sdk_gphone") || a12.contains("sdk_phone")) {
            i11++;
        }
        String a13 = a(h0.a("cm8ucHJvZHVjdC5ib2FyZA=="));
        if (a13 == null || a13.contains("android") || a13.contains("goldfish")) {
            i11++;
        }
        String a14 = a(h0.a("cm8uYm9hcmQucGxhdGZvcm0="));
        if (a14 == null || a14.contains("android")) {
            i11++;
        }
        String a15 = a(h0.a("cm8uaGFyZHdhcmU="));
        if (a15 == null) {
            i11++;
        } else if (a15.toLowerCase().contains("ttvm") || a15.toLowerCase().contains("nox")) {
            i11 += 5;
        }
        String[] strArr = {"L3N5c3RlbS9iaW4vZHJvaWQ0eC1wcm9w", "L3N5c3RlbS9saWIvbGlibm94ZC5zbw==", "L3N5c3RlbS9iaW4vdHRWTS1wcm9w", "L3N5c3RlbS9iaW4vYnN0c2h1dGRvd24=", "L3N5c3RlbS9iaW4vbWljcm92aXJ0LXByb3A=", "L3N5c3RlbS9iaW4vbmVtdVZNLXByb3A=", "L3N5c3RlbS9iaW4vYW5kcm9WTS1wcm9w", "L3N5c3RlbS9iaW4vZ2VueW1vdGlvbi12Ym94LXNm"};
        boolean z11 = false;
        for (int i12 = 0; i12 < 8; i12++) {
            if (new File(h0.a(strArr[i12])).exists()) {
                z11 = true;
            }
        }
        if (z11) {
            i11 += 5;
        }
        if (new File(h0.a("L3N5c3RlbS9ldGMvZXhjbHVkZWQtaW5wdXQtZGV2aWNlcy54bWw=")).exists()) {
            i11 = Build.VERSION.SDK_INT < 26 ? i11 + 3 : i11 + 1;
        }
        if (!context.getPackageManager().hasSystemFeature(h0.a("YW5kcm9pZC5oYXJkd2FyZS5ibHVldG9vdGg="))) {
            i11 += 3;
        }
        if (!context.getPackageManager().hasSystemFeature(h0.a("YW5kcm9pZC5oYXJkd2FyZS5jYW1lcmEuZmxhc2g="))) {
            i11 += 3;
        }
        if (((SensorManager) context.getSystemService("sensor")).getSensorList(-1).size() < 9) {
            i11++;
        }
        boolean z12 = i11 >= 5;
        if (z12 && j0.f91313a) {
            j0.b("device is simulator", new Object[0]);
        }
        return z12;
    }
}
