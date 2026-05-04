package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.hk;
import com.xiaomi.push.hl;
import com.xiaomi.push.hr;
import com.xiaomi.push.ig;
import com.xiaomi.push.ir;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes8.dex */
public class bz {

    /* renamed from: a, reason: collision with root package name */
    private static String f46346a;

    /* renamed from: a, reason: collision with other field name */
    private static SimpleDateFormat f993a;

    /* renamed from: a, reason: collision with other field name */
    private static AtomicLong f994a = new AtomicLong(0);

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ef.l.f49767x);
        f993a = simpleDateFormat;
        f46346a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    private static ig a(String str, String str2, hk hkVar) {
        return new ig("-1", false).d(str).b(str2).a(com.xiaomi.push.y.a(ir.a(hkVar))).c(hr.UploadTinyData.f538a);
    }

    public static synchronized String a() {
        String str;
        synchronized (bz.class) {
            try {
                String format = f993a.format(Long.valueOf(System.currentTimeMillis()));
                if (!TextUtils.equals(f46346a, format)) {
                    f994a.set(0L);
                    f46346a = format;
                }
                str = format + Constants.ACCEPT_TIME_SEPARATOR_SERVER + f994a.incrementAndGet();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.xiaomi.push.ig> a(java.util.List<com.xiaomi.push.hl> r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r0 = 0
            if (r11 != 0) goto L9
            java.lang.String r11 = "requests can not be null in TinyDataHelper.transToThriftObj()."
        L5:
            com.xiaomi.channel.commonutils.logger.b.d(r11)
            return r0
        L9:
            int r1 = r11.size()
            if (r1 != 0) goto L12
            java.lang.String r11 = "requests.length is 0 in TinyDataHelper.transToThriftObj()."
            goto L5
        L12:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.xiaomi.push.hk r2 = new com.xiaomi.push.hk
            r2.<init>()
            r3 = 0
            r4 = r3
            r5 = r4
        L1f:
            int r6 = r11.size()
            if (r4 >= r6) goto Laa
            java.lang.Object r6 = r11.get(r4)
            com.xiaomi.push.hl r6 = (com.xiaomi.push.hl) r6
            if (r6 != 0) goto L2f
            goto La6
        L2f:
            java.util.Map r7 = r6.m6014a()
            if (r7 == 0) goto L6e
            java.util.Map r7 = r6.m6014a()
            java.lang.String r8 = "item_size"
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L6e
            java.util.Map r7 = r6.m6014a()
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L56
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L56
            goto L57
        L56:
            r7 = r3
        L57:
            java.util.Map r9 = r6.m6014a()
            int r9 = r9.size()
            r10 = 1
            if (r9 != r10) goto L66
            r6.a(r0)
            goto L6f
        L66:
            java.util.Map r9 = r6.m6014a()
            r9.remove(r8)
            goto L6f
        L6e:
            r7 = r3
        L6f:
            if (r7 > 0) goto L76
            byte[] r7 = com.xiaomi.push.ir.a(r6)
            int r7 = r7.length
        L76:
            if (r7 <= r14) goto L91
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "TinyData is too big, ignore upload request item:"
            r7.append(r8)
            java.lang.String r6 = r6.d()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.xiaomi.channel.commonutils.logger.b.d(r6)
            goto La6
        L91:
            int r8 = r5 + r7
            if (r8 <= r14) goto La2
            com.xiaomi.push.ig r2 = a(r12, r13, r2)
            r1.add(r2)
            com.xiaomi.push.hk r2 = new com.xiaomi.push.hk
            r2.<init>()
            r5 = r3
        La2:
            r2.a(r6)
            int r5 = r5 + r7
        La6:
            int r4 = r4 + 1
            goto L1f
        Laa:
            int r11 = r2.a()
            if (r11 == 0) goto Lb7
            com.xiaomi.push.ig r11 = a(r12, r13, r2)
            r1.add(r11)
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.bz.a(java.util.List, java.lang.String, java.lang.String, int):java.util.ArrayList");
    }

    public static void a(Context context, String str, String str2, long j11, String str3) {
        hl hlVar = new hl();
        hlVar.d(str);
        hlVar.c(str2);
        hlVar.a(j11);
        hlVar.b(str3);
        hlVar.a("push_sdk_channel");
        hlVar.g(context.getPackageName());
        hlVar.e(context.getPackageName());
        hlVar.a(true);
        hlVar.b(System.currentTimeMillis());
        hlVar.f(a());
        ca.a(context, hlVar);
    }

    public static boolean a(hl hlVar, boolean z11) {
        String str;
        if (hlVar == null) {
            str = "item is null, verfiy ClientUploadDataItem failed.";
        } else if (!z11 && TextUtils.isEmpty(hlVar.f510a)) {
            str = "item.channel is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(hlVar.f517d)) {
            str = "item.category is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(hlVar.f516c)) {
            str = "item.name is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (!com.xiaomi.push.bo.m5757a(hlVar.f517d)) {
            str = "item.category can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else if (com.xiaomi.push.bo.m5757a(hlVar.f516c)) {
            String str2 = hlVar.f515b;
            if (str2 == null || str2.length() <= 10240) {
                return false;
            }
            str = "item.data is too large(" + hlVar.f515b.length() + "), max size for data is " + com.badlogic.gdx.graphics.f.D2 + " , verfiy ClientUploadDataItem failed.";
        } else {
            str = "item.name can only contain ascii char, verfiy ClientUploadDataItem failed.";
        }
        com.xiaomi.channel.commonutils.logger.b.m5639a(str);
        return true;
    }

    public static boolean a(String str) {
        return !com.xiaomi.push.s.m6187b() || Constants.HYBRID_PACKAGE_NAME.equals(str);
    }
}
