package com.igexin.push.g;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.igexin.push.config.SDKUrlConfig;
import com.tencent.connect.common.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final int f38699a = 10000;

    /* renamed from: b, reason: collision with root package name */
    private static final String f38700b = "ErrorReport";

    /* renamed from: com.igexin.push.g.h$1, reason: invalid class name */
    public static class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f38701a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f38702b;

        public AnonymousClass1(Context context, a aVar) {
            this.f38701a = context;
            this.f38702b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z11 = false;
            try {
                if (h.a()) {
                    com.igexin.push.core.d.d.a().a("s", Long.valueOf(System.currentTimeMillis()));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("action", "upload_BI");
                    jSONObject.put("BIType", Constants.VIA_REPORT_TYPE_CHAT_AUDIO);
                    jSONObject.put("cid", "0");
                    jSONObject.put("BIData", new String(com.igexin.c.a.b.g.c(h.a(this.f38701a).getBytes()), "UTF-8"));
                    byte[] a11 = r.a(SDKUrlConfig.getBiUploadServiceUrl(), com.igexin.c.b.a.b(jSONObject.toString().getBytes()));
                    if (a11 != null) {
                        new String(a11);
                    }
                    z11 = true;
                }
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
                com.igexin.c.a.c.a.a("ErrorReport|report 25 ex = " + th2.toString(), new Object[0]);
            }
            a aVar = this.f38702b;
            if (aVar != null) {
                aVar.a(z11);
            }
        }
    }

    public interface a {
        void a(boolean z11);
    }

    public static String a(Context context) {
        String packageName = context.getPackageName();
        String str = null;
        try {
            ApplicationInfo b11 = n.b(context);
            if (b11 != null && b11.metaData != null) {
                str = d.a(b11);
                if (TextUtils.isEmpty(str)) {
                    str = b11.metaData.getString(com.igexin.push.core.b.f37730b);
                }
                if (TextUtils.isEmpty(str)) {
                    str = b11.metaData.getString("GETUI_APPID");
                }
            }
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
        String str2 = Build.VERSION.SDK;
        String str3 = Build.VERSION.RELEASE;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()));
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append(str);
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append("3.3.7.0");
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append(true);
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append(n.g() == null ? "" : n.g());
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append(n.e());
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append(str2);
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append(str3);
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append(n.a(context));
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append(n.k());
        sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        sb2.append(packageName);
        if (g.f38692d != null) {
            sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
            sb2.append(g.f38692d);
        }
        com.igexin.c.a.c.a.a("ErrorReport|" + sb2.toString(), new Object[0]);
        return sb2.toString();
    }

    private static void a(a aVar, Context context) {
        com.igexin.b.a.a().f37028a.execute(new AnonymousClass1(context, aVar));
    }

    public static boolean a() {
        try {
            return System.currentTimeMillis() - com.igexin.push.core.d.d.a().a("s", new long[0]) > 86400000;
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return false;
        }
    }
}
