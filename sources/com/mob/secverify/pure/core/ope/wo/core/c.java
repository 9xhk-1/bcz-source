package com.mob.secverify.pure.core.ope.wo.core;

import android.content.Context;
import com.mob.secverify.pure.core.ope.wo.c.e;
import com.mob.secverify.pure.core.ope.wo.core.WoExecutor;
import com.mob.secverify.pure.core.ope.wo.listener.ResultListener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f41088a;

    public static c a() {
        if (f41088a == null) {
            synchronized (c.class) {
                try {
                    if (f41088a == null) {
                        f41088a = new c();
                    }
                } finally {
                }
            }
        }
        return f41088a;
    }

    private void b(Context context, String str, String str2) {
        try {
            Class<?> loadClass = a.a().loadClass(new String(e.b("Y29tLnVuaWNvbS54aWFvd28ubG9naW5jb3JlLlVuaUF1dGhIZWxwZXI=")));
            loadClass.getMethod("init", Context.class, String.class).invoke(loadClass.getMethod("getInstance", null).invoke(loadClass, null), context, str, str2);
        } catch (Exception unused) {
            a.d(context);
        }
    }

    public void a(Context context, String str, String str2) {
        try {
            if (a(context)) {
                b(context, str, str2);
            } else {
                a.d(context);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045 A[Catch: all -> 0x0032, Exception -> 0x0034, TRY_LEAVE, TryCatch #2 {Exception -> 0x0034, blocks: (B:3:0x0002, B:7:0x002e, B:8:0x0039, B:10:0x0045, B:21:0x0036, B:22:0x001d, B:25:0x0024), top: B:2:0x0002, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036 A[Catch: all -> 0x0032, Exception -> 0x0034, TryCatch #2 {Exception -> 0x0034, blocks: (B:3:0x0002, B:7:0x002e, B:8:0x0039, B:10:0x0045, B:21:0x0036, B:22:0x001d, B:25:0x0024), top: B:2:0x0002, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e A[Catch: all -> 0x0032, Exception -> 0x0034, TryCatch #2 {Exception -> 0x0034, blocks: (B:3:0x0002, B:7:0x002e, B:8:0x0039, B:10:0x0045, B:21:0x0036, B:22:0x001d, B:25:0x0024), top: B:2:0x0002, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(android.content.Context r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r1 = com.mob.secverify.pure.core.ope.wo.core.a.b(r9)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            byte[] r2 = com.mob.secverify.pure.core.ope.wo.core.a.a(r1)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            java.lang.String r3 = com.mob.secverify.pure.core.ope.wo.core.a.a(r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            byte[] r4 = com.mob.secverify.pure.core.ope.wo.c.e.a()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            java.lang.String r5 = "2.0.0A0000B0101"
            boolean r6 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r7 = 1
            if (r6 == 0) goto L1d
        L1b:
            r3 = r0
            goto L2c
        L1d:
            int r6 = r8.a(r5, r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            if (r6 == r7) goto L24
            goto L1b
        L24:
            int r3 = r5.compareTo(r3)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            if (r3 <= 0) goto L2b
            goto L1b
        L2b:
            r3 = r7
        L2c:
            if (r3 != 0) goto L36
            com.mob.secverify.pure.core.ope.wo.core.a.a(r9, r4)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            goto L39
        L32:
            r9 = move-exception
            goto L61
        L34:
            r9 = move-exception
            goto L53
        L36:
            com.mob.secverify.pure.core.ope.wo.core.a.b(r9, r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
        L39:
            java.lang.String r2 = com.mob.secverify.pure.core.ope.wo.core.a.a(r9)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            com.mob.secverify.pure.core.ope.wo.core.a.a(r9, r2)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            com.mob.secverify.pure.core.ope.wo.core.a.c(r9)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            if (r3 != 0) goto L48
            com.mob.secverify.pure.core.ope.wo.core.a.d(r9)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
        L48:
            if (r1 == 0) goto L52
            r1.close()     // Catch: java.io.IOException -> L4e
            return r7
        L4e:
            r9 = move-exception
            r9.printStackTrace()
        L52:
            return r7
        L53:
            r9.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L60
            r1.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r9 = move-exception
            r9.printStackTrace()
        L60:
            return r0
        L61:
            if (r1 == 0) goto L6b
            r1.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r0 = move-exception
            r0.printStackTrace()
        L6b:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.secverify.pure.core.ope.wo.core.c.a(android.content.Context):boolean");
    }

    public void a(Context context, int i11, int i12, final ResultListener resultListener) {
        new WoExecutor().a(context, i11, i12, new WoExecutor.Callback() { // from class: com.mob.secverify.pure.core.ope.wo.core.c.1
            @Override // com.mob.secverify.pure.core.ope.wo.core.WoExecutor.Callback
            public void onResult(String str) {
                resultListener.onResult(str);
            }
        });
    }

    private int a(String str, String str2) {
        try {
            byte[] bytes = str.getBytes();
            byte[] bytes2 = str2.getBytes();
            for (int i11 = 0; i11 < 5; i11++) {
                int i12 = i11 + 5;
                if (bytes[i12] != bytes2[i12]) {
                    return 0;
                }
            }
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }
}
