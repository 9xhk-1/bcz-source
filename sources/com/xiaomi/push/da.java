package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes8.dex */
public class da {
    public static int a(Context context, int i11) {
        int a11 = ha.a(context);
        if (-1 == a11) {
            return -1;
        }
        return (i11 * (a11 == 0 ? 13 : 11)) / 10;
    }

    public static int a(hh hhVar) {
        return em.a(hhVar.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (com.xiaomi.push.ex.a(r2) != (-1)) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        return com.xiaomi.push.ex.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (com.xiaomi.push.ex.a(r2) != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(com.xiaomi.push.is r2, com.xiaomi.push.hh r3) {
        /*
            int[] r0 = com.xiaomi.push.db.f45373a
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = -1
            switch(r0) {
                case 1: goto Lad;
                case 2: goto Lad;
                case 3: goto Lad;
                case 4: goto Lad;
                case 5: goto Lad;
                case 6: goto Lad;
                case 7: goto Lad;
                case 8: goto Lad;
                case 9: goto Lad;
                case 10: goto Lad;
                case 11: goto L50;
                case 12: goto Ld;
                default: goto Lc;
            }
        Lc:
            return r1
        Ld:
            int r3 = r3.a()
            int r3 = com.xiaomi.push.em.a(r3)
            if (r2 == 0) goto L4f
            boolean r0 = r2 instanceof com.xiaomi.push.ic     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L32
            com.xiaomi.push.ic r2 = (com.xiaomi.push.ic) r2     // Catch: java.lang.Exception -> L49
            java.lang.String r2 = r2.b()     // Catch: java.lang.Exception -> L49
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L49
            if (r0 != 0) goto L4f
            int r0 = com.xiaomi.push.ex.a(r2)     // Catch: java.lang.Exception -> L49
            if (r0 == r1) goto L4f
        L2d:
            int r2 = com.xiaomi.push.ex.a(r2)     // Catch: java.lang.Exception -> L49
            return r2
        L32:
            boolean r0 = r2 instanceof com.xiaomi.push.ib     // Catch: java.lang.Exception -> L49
            if (r0 == 0) goto L4f
            com.xiaomi.push.ib r2 = (com.xiaomi.push.ib) r2     // Catch: java.lang.Exception -> L49
            java.lang.String r2 = r2.a()     // Catch: java.lang.Exception -> L49
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L49
            if (r0 != 0) goto L4f
            int r0 = com.xiaomi.push.ex.a(r2)     // Catch: java.lang.Exception -> L49
            if (r0 == r1) goto L4f
            goto L2d
        L49:
            java.lang.String r2 = "PERF_ERROR : parse Command type error"
        L4b:
            com.xiaomi.channel.commonutils.logger.b.d(r2)
            goto Lac
        L4f:
            return r3
        L50:
            int r3 = r3.a()
            int r3 = com.xiaomi.push.em.a(r3)
            if (r2 == 0) goto Lac
            boolean r0 = r2 instanceof com.xiaomi.push.hy     // Catch: java.lang.Exception -> La9
            if (r0 == 0) goto L7b
            com.xiaomi.push.hy r2 = (com.xiaomi.push.hy) r2     // Catch: java.lang.Exception -> La9
            java.lang.String r2 = r2.f623d     // Catch: java.lang.Exception -> La9
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> La9
            if (r0 != 0) goto Lac
            com.xiaomi.push.hr r0 = com.xiaomi.push.em.m5912a(r2)     // Catch: java.lang.Exception -> La9
            int r0 = com.xiaomi.push.em.a(r0)     // Catch: java.lang.Exception -> La9
            if (r0 == r1) goto Lac
            com.xiaomi.push.hr r2 = com.xiaomi.push.em.m5912a(r2)     // Catch: java.lang.Exception -> La9
            int r2 = com.xiaomi.push.em.a(r2)     // Catch: java.lang.Exception -> La9
            return r2
        L7b:
            boolean r0 = r2 instanceof com.xiaomi.push.ig     // Catch: java.lang.Exception -> La9
            if (r0 == 0) goto Lac
            com.xiaomi.push.ig r2 = (com.xiaomi.push.ig) r2     // Catch: java.lang.Exception -> La9
            java.lang.String r2 = r2.f685d     // Catch: java.lang.Exception -> La9
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> La9
            if (r0 != 0) goto Lac
            com.xiaomi.push.hr r0 = com.xiaomi.push.em.m5912a(r2)     // Catch: java.lang.Exception -> La9
            int r0 = com.xiaomi.push.em.a(r0)     // Catch: java.lang.Exception -> La9
            if (r0 == r1) goto L9b
            com.xiaomi.push.hr r0 = com.xiaomi.push.em.m5912a(r2)     // Catch: java.lang.Exception -> La9
            int r3 = com.xiaomi.push.em.a(r0)     // Catch: java.lang.Exception -> La9
        L9b:
            com.xiaomi.push.hr r0 = com.xiaomi.push.hr.UploadTinyData     // Catch: java.lang.Exception -> La9
            com.xiaomi.push.hr r2 = com.xiaomi.push.em.m5912a(r2)     // Catch: java.lang.Exception -> La9
            boolean r2 = r0.equals(r2)     // Catch: java.lang.Exception -> La9
            if (r2 == 0) goto La8
            return r1
        La8:
            return r3
        La9:
            java.lang.String r2 = "PERF_ERROR : parse Notification type error"
            goto L4b
        Lac:
            return r3
        Lad:
            int r2 = r3.a()
            int r2 = com.xiaomi.push.em.a(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.da.a(com.xiaomi.push.is, com.xiaomi.push.hh):int");
    }

    public static void a(String str, Context context, int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        int a11 = a(context, i12);
        if (i11 != em.a(hr.UploadTinyData)) {
            en.a(context.getApplicationContext()).a(str, i11, 1L, a11);
        }
    }

    public static void a(String str, Context context, id idVar, int i11) {
        hh a11;
        if (context == null || idVar == null || (a11 = idVar.a()) == null) {
            return;
        }
        int a12 = a(a11);
        if (i11 <= 0) {
            byte[] a13 = ir.a(idVar);
            i11 = a13 != null ? a13.length : 0;
        }
        a(str, context, a12, i11);
    }

    public static void a(String str, Context context, is isVar, hh hhVar, int i11) {
        a(str, context, a(isVar, hhVar), i11);
    }

    public static void a(String str, Context context, byte[] bArr) {
        if (context == null || bArr == null || bArr.length <= 0) {
            return;
        }
        id idVar = new id();
        try {
            ir.a(idVar, bArr);
            a(str, context, idVar, bArr.length);
        } catch (ix unused) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("fail to convert bytes to container");
        }
    }
}
