package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class bs {
    public static String a() {
        return Build.VERSION.RELEASE + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Build.VERSION.INCREMENTAL;
    }

    public static String a(Context context) {
        String a11 = bv.a(context).a("sp_client_report_status", "sp_client_report_key", "");
        if (!TextUtils.isEmpty(a11)) {
            return a11;
        }
        String a12 = bo.a(20);
        bv.a(context).m5764a("sp_client_report_status", "sp_client_report_key", a12);
        return a12;
    }

    public static void a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.xmsf.push.XMSF_UPLOAD_ACTIVE");
        intent.putExtra("pkgname", context.getPackageName());
        intent.putExtra(za.a.f102442j, "category_client_report_data");
        intent.putExtra("name", "quality_support");
        intent.putExtra("data", str);
        context.sendBroadcast(intent, "com.xiaomi.xmsf.permission.USE_XMSF_UPLOAD");
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ee, code lost:
    
        if (r7 == null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bs.a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static void a(Context context, List<String> list) {
        if (list == null || list.size() <= 0 || !m5760a(context)) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                a(context, str);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5760a(Context context) {
        return context.getApplicationContext().getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode >= 108;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m5761a(Context context, String str) {
        File file = new File(str);
        long maxFileLength = com.xiaomi.clientreport.manager.a.a(context).m5644a().getMaxFileLength();
        if (!file.exists()) {
            y.m6304a(file);
            return true;
        }
        try {
            return file.length() <= maxFileLength;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return false;
        }
    }

    @TargetApi(9)
    public static byte[] a(String str) {
        byte[] copyOf = Arrays.copyOf(bl.m5755a(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static File[] m5762a(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir(str);
        if (externalFilesDir != null) {
            return externalFilesDir.listFiles(new bu());
        }
        return null;
    }
}
