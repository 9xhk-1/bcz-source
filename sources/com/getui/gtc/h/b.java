package com.getui.gtc.h;

import com.getui.gtc.base.http.Request;
import com.getui.gtc.base.http.Response;
import com.getui.gtc.e.c;
import com.getui.gtc.entity.a;
import java.io.File;

/* loaded from: classes6.dex */
public final class b {
    public static void a(a.C0358a c0358a, String str) throws Exception {
        if (a(c0358a)) {
            throw new RuntimeException("The download request is unusual, too many times in a short time");
        }
        Response execute = d.f30097a.newCall(new Request.Builder().url(c0358a.f30055h).method("GET").logFlags(1).build()).execute();
        if (execute.body() == null) {
            throw new RuntimeException("can not save file, body is null");
        }
        execute.body().file(new File(str));
    }

    private static boolean a(a.C0358a c0358a) {
        com.getui.gtc.e.c cVar;
        com.getui.gtc.e.c cVar2;
        com.getui.gtc.e.c cVar3;
        cVar = c.a.f30027a;
        int c11 = cVar.f30025b.c(c0358a.f30048a);
        cVar2 = c.a.f30027a;
        long b11 = cVar2.f30025b.b(c0358a.f30048a);
        long currentTimeMillis = System.currentTimeMillis();
        boolean z11 = true;
        if (c11 >= 10) {
            c11 = -1;
            b11 = currentTimeMillis;
        } else {
            long j11 = currentTimeMillis - b11;
            if (c11 < 0) {
                if (j11 > 3600000) {
                    b11 = currentTimeMillis;
                    c11 = 0;
                }
            } else if (j11 > 3600000) {
                b11 = currentTimeMillis;
                c11 = 0;
                z11 = false;
            } else {
                c11++;
                z11 = false;
            }
        }
        cVar3 = c.a.f30027a;
        cVar3.f30025b.a(c0358a.f30048a, b11, c11);
        return z11;
    }
}
