package com.mob.commons;

import android.content.Context;
import android.os.Bundle;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DeviceHelper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f40391a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile String f40392b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile InternationalDomain f40393c = null;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f40394d = false;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f40395e = true;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f40396f = false;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f40397g = true;

    /* renamed from: h, reason: collision with root package name */
    public static volatile boolean f40398h = false;

    /* renamed from: i, reason: collision with root package name */
    public static volatile String f40399i;

    /* renamed from: j, reason: collision with root package name */
    private static AtomicBoolean f40400j = new AtomicBoolean(false);

    public static void a(Context context) {
        Bundle bundle;
        try {
            if (!f40400j.compareAndSet(false, true) || (bundle = DeviceHelper.getInstance(context).getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData) == null) {
                return;
            }
            try {
                if (f40391a == null) {
                    f40391a = bundle.getString("Mob-AppKey");
                }
                if (f40392b == null) {
                    f40392b = bundle.getString("Mob-AppSecret");
                }
                if (f40392b == null) {
                    f40392b = bundle.getString("Mob-AppSeret");
                }
            } catch (Throwable unused) {
            }
            try {
                String string = bundle.getString(a("006Jehdb[kHcecdcj"));
                if (string != null) {
                    f40393c = InternationalDomain.domainOf(string);
                }
            } catch (Throwable unused2) {
                f40393c = InternationalDomain.DEFAULT;
            }
            try {
                Object obj = bundle.get("Mob-OdVivoAppId");
                if (obj != null) {
                    f40399i = String.valueOf(obj).trim();
                }
            } catch (Throwable unused3) {
            }
            f40394d = a(bundle, a("009)fgdbebghgb6ccd^ef"), false);
            f40395e = a(bundle, a("0153fgdbebghffOdPde6hNcf*hQefefcecgch"), f40395e);
            f40396f = a(bundle, a("006(fgdbebghfdhd"), false);
            f40397g = a(bundle, "Mob-elog", true);
            f40398h = a(bundle, "Mob-GPP", false);
        } catch (Throwable th2) {
            MobLog.getInstance().d(th2);
        }
    }

    public static boolean a(Bundle bundle, String str, boolean z11) {
        Object obj;
        try {
            obj = bundle.get(str);
        } catch (Throwable unused) {
        }
        if (obj == null) {
            return z11;
        }
        if (obj instanceof String) {
            return a("003'chSh<ef").equalsIgnoreCase(String.valueOf(obj));
        }
        return Boolean.parseBoolean(String.valueOf(obj));
    }

    public static String a(String str) {
        return r.a(str, 98);
    }
}
