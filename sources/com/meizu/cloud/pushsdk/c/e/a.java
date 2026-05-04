package com.meizu.cloud.pushsdk.c.e;

import com.meizu.cloud.pushsdk.c.c.e;
import com.meizu.cloud.pushsdk.c.c.i;
import com.meizu.cloud.pushsdk.c.c.k;
import java.io.File;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f39627a;

    public static k a(com.meizu.cloud.pushsdk.c.a.b bVar) throws com.meizu.cloud.pushsdk.c.b.a {
        try {
            i.a a11 = new i.a().a(bVar.e());
            a(a11, bVar);
            int d11 = bVar.d();
            if (d11 == 0) {
                a11 = a11.a();
            } else if (d11 == 1) {
                a11 = a11.a(bVar.m());
            } else if (d11 == 2) {
                a11 = a11.c(bVar.m());
            } else if (d11 == 3) {
                a11 = a11.b(bVar.m());
            } else if (d11 == 4) {
                a11 = a11.b();
            } else if (d11 == 5) {
                a11 = a11.d(bVar.m());
            }
            i c11 = a11.c();
            bVar.a(new e());
            return bVar.l().a(c11);
        } catch (IOException e11) {
            throw new com.meizu.cloud.pushsdk.c.b.a(e11);
        }
    }

    public static k b(com.meizu.cloud.pushsdk.c.a.b bVar) throws com.meizu.cloud.pushsdk.c.b.a {
        try {
            i.a a11 = new i.a().a(bVar.e());
            a(a11, bVar);
            i c11 = a11.a().c();
            bVar.a(new e());
            k a12 = bVar.l().a(c11);
            com.meizu.cloud.pushsdk.c.h.b.a(a12, bVar.j(), bVar.k());
            return a12;
        } catch (IOException e11) {
            try {
                File file = new File(bVar.j() + File.separator + bVar.k());
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            throw new com.meizu.cloud.pushsdk.c.b.a(e11);
        }
    }

    public static k c(com.meizu.cloud.pushsdk.c.a.b bVar) throws com.meizu.cloud.pushsdk.c.b.a {
        try {
            i.a a11 = new i.a().a(bVar.e());
            a(a11, bVar);
            i c11 = a11.a(new b(bVar.n(), bVar.i())).c();
            bVar.a(new e());
            return bVar.l().a(c11);
        } catch (IOException e11) {
            throw new com.meizu.cloud.pushsdk.c.b.a(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.meizu.cloud.pushsdk.c.c.i.a r3, com.meizu.cloud.pushsdk.c.a.b r4) {
        /*
            java.lang.String r0 = r4.h()
            java.lang.String r1 = "User-Agent"
            if (r0 == 0) goto L10
            java.lang.String r0 = r4.h()
        Lc:
            r3.a(r1, r0)
            goto L1a
        L10:
            java.lang.String r0 = com.meizu.cloud.pushsdk.c.e.a.f39627a
            if (r0 == 0) goto L1a
            r4.a(r0)
            java.lang.String r0 = com.meizu.cloud.pushsdk.c.e.a.f39627a
            goto Lc
        L1a:
            com.meizu.cloud.pushsdk.c.c.c r0 = r4.o()
            if (r0 == 0) goto L3a
            r3.a(r0)
            java.lang.String r2 = r4.h()
            if (r2 == 0) goto L3a
            java.util.Set r0 = r0.b()
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L3a
            java.lang.String r4 = r4.h()
            r3.a(r1, r4)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.c.e.a.a(com.meizu.cloud.pushsdk.c.c.i$a, com.meizu.cloud.pushsdk.c.a.b):void");
    }
}
