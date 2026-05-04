package com.igexin.push.d;

import android.content.Context;
import com.igexin.c.a.b.g;

/* loaded from: classes7.dex */
public final class a implements com.igexin.c.a.d.a.b<String, Integer, com.igexin.c.a.b.d, com.igexin.c.a.b.f> {

    /* renamed from: b, reason: collision with root package name */
    private static final byte f38375b = 1;

    /* renamed from: c, reason: collision with root package name */
    private static final byte f38376c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final byte f38377d = 3;

    /* renamed from: a, reason: collision with root package name */
    public Context f38378a;

    public a(Context context) {
        this.f38378a = context;
    }

    /* renamed from: b, reason: avoid collision after fix types in other method */
    private static byte b2(com.igexin.c.a.b.f fVar) {
        String[] a11 = g.a(fVar.f37162b);
        if (a11[0].equals("socket")) {
            return (byte) 3;
        }
        return a11[0].equals("http") ? (byte) 2 : (byte) 0;
    }

    @Override // com.igexin.c.a.d.a.b
    public final /* synthetic */ byte a(com.igexin.c.a.b.f fVar) {
        String[] a11 = g.a(fVar.f37162b);
        if (a11[0].equals("socket")) {
            return (byte) 3;
        }
        return a11[0].equals("http") ? (byte) 2 : (byte) 0;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static com.igexin.c.a.b.f a2(String str, com.igexin.c.a.b.d dVar) {
        if (str.startsWith("socket") && com.igexin.push.core.e.f38037n) {
            return new com.igexin.c.a.b.a.a.f(str, dVar);
        }
        return null;
    }

    @Override // com.igexin.c.a.d.a.b
    public final /* synthetic */ boolean b(com.igexin.c.a.b.f fVar) {
        com.igexin.c.a.b.f fVar2 = fVar;
        return fVar2.f37162b.startsWith("socket") || fVar2.f37162b.startsWith("submitTcpException");
    }

    @Override // com.igexin.c.a.d.a.b
    public final /* synthetic */ com.igexin.c.a.b.f a(String str, com.igexin.c.a.b.d dVar) {
        String str2 = str;
        com.igexin.c.a.b.d dVar2 = dVar;
        if (str2.startsWith("socket") && com.igexin.push.core.e.f38037n) {
            return new com.igexin.c.a.b.a.a.f(str2, dVar2);
        }
        return null;
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static boolean a2(com.igexin.c.a.b.f fVar) {
        return fVar.f37162b.startsWith("socket") || fVar.f37162b.startsWith("submitTcpException");
    }
}
