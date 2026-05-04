package com.xiaomi.push;

/* loaded from: classes8.dex */
public class jg {

    /* renamed from: a, reason: collision with root package name */
    private static int f46168a = Integer.MAX_VALUE;

    public static void a(jd jdVar, byte b11) {
        a(jdVar, b11, f46168a);
    }

    public static void a(jd jdVar, byte b11, int i11) {
        if (i11 <= 0) {
            throw new ix("Maximum skip depth exceeded");
        }
        int i12 = 0;
        switch (b11) {
            case 2:
                jdVar.mo6167a();
                return;
            case 3:
                jdVar.a();
                return;
            case 4:
                jdVar.mo6154a();
                return;
            case 5:
            case 7:
            case 9:
            default:
                return;
            case 6:
                jdVar.mo6164a();
                return;
            case 8:
                jdVar.mo6155a();
                return;
            case 10:
                jdVar.mo6156a();
                return;
            case 11:
                jdVar.mo6163a();
                return;
            case 12:
                jdVar.mo6161a();
                while (true) {
                    byte b12 = jdVar.mo6157a().f46162a;
                    if (b12 == 0) {
                        jdVar.f();
                        return;
                    } else {
                        a(jdVar, b12, i11 - 1);
                        jdVar.g();
                    }
                }
            case 13:
                jc mo6159a = jdVar.mo6159a();
                while (i12 < mo6159a.f845a) {
                    int i13 = i11 - 1;
                    a(jdVar, mo6159a.f46164a, i13);
                    a(jdVar, mo6159a.f46165b, i13);
                    i12++;
                }
                jdVar.h();
                return;
            case 14:
                jh mo6160a = jdVar.mo6160a();
                while (i12 < mo6160a.f846a) {
                    a(jdVar, mo6160a.f46169a, i11 - 1);
                    i12++;
                }
                jdVar.j();
                return;
            case 15:
                jb mo6158a = jdVar.mo6158a();
                while (i12 < mo6158a.f844a) {
                    a(jdVar, mo6158a.f46163a, i11 - 1);
                    i12++;
                }
                jdVar.i();
                return;
        }
    }
}
