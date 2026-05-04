package com.tencent.connect.a;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.open.b.e;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.i;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Class<?> f42706a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Class<?> f42707b = null;

    /* renamed from: c, reason: collision with root package name */
    private static Method f42708c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f42709d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Method f42710e = null;

    /* renamed from: f, reason: collision with root package name */
    private static Method f42711f = null;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f42712g = false;

    public static boolean a(Context context, QQToken qQToken) {
        return i.a(context, qQToken.getAppId()).b("Common_ta_enable");
    }

    public static void b(Context context, QQToken qQToken) {
        try {
            if (a(context, qQToken)) {
                f42711f.invoke(f42706a, Boolean.TRUE);
            } else {
                f42711f.invoke(f42706a, Boolean.FALSE);
            }
        } catch (Exception e11) {
            SLog.e("OpenConfig", "checkStatStatus exception: " + e11.toString());
        }
    }

    public static void c(Context context, QQToken qQToken) {
        String str = "Aqc" + qQToken.getAppId();
        try {
            f42706a = Class.forName("com.tencent.stat.StatConfig");
            Class<?> cls = Class.forName("com.tencent.stat.StatService");
            f42707b = cls;
            f42708c = cls.getMethod("reportQQ", Context.class, String.class);
            f42709d = f42707b.getMethod("trackCustomEvent", Context.class, String.class, String[].class);
            Class<?> cls2 = f42707b;
            Class cls3 = Integer.TYPE;
            f42710e = cls2.getMethod("commitEvents", Context.class, cls3);
            Class<?> cls4 = f42706a;
            Class cls5 = Boolean.TYPE;
            f42711f = cls4.getMethod("setEnableStatService", cls5);
            b(context, qQToken);
            f42706a.getMethod("setAutoExceptionCaught", cls5).invoke(f42706a, Boolean.FALSE);
            f42706a.getMethod("setEnableSmartReporting", cls5).invoke(f42706a, Boolean.TRUE);
            f42706a.getMethod("setSendPeriodMinutes", cls3).invoke(f42706a, 1440);
            Class<?> cls6 = Class.forName("com.tencent.stat.StatReportStrategy");
            f42706a.getMethod("setStatSendStrategy", cls6).invoke(f42706a, cls6.getField("PERIOD").get(null));
            f42707b.getMethod("startStatService", Context.class, String.class, String.class).invoke(f42707b, context, str, Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null));
            f42712g = true;
        } catch (Exception e11) {
            SLog.e("OpenConfig", "start4QQConnect exception: " + e11.toString());
        }
    }

    public static void d(Context context, QQToken qQToken) {
        if (!TextUtils.isEmpty(qQToken.getOpenId())) {
            e.a().a(qQToken.getOpenId(), qQToken.getAppId(), "2", "1", Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, "0", "0", "0");
        }
        if (f42712g) {
            b(context, qQToken);
            if (qQToken.getOpenId() != null) {
                try {
                    f42708c.invoke(f42707b, context, qQToken.getOpenId());
                } catch (Exception e11) {
                    SLog.e("OpenConfig", "reportQQ exception: " + e11.toString());
                }
            }
        }
    }

    public static void a(Context context, QQToken qQToken, String str, String... strArr) {
        if (f42712g) {
            b(context, qQToken);
            try {
                f42709d.invoke(f42707b, context, str, strArr);
            } catch (Exception e11) {
                SLog.e("OpenConfig", "trackCustomEvent exception: " + e11.toString());
            }
        }
    }
}
