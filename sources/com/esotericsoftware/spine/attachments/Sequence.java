package com.esotericsoftware.spine.attachments;

import jl.m;
import ol.f;
import pl.g;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class Sequence {

    /* renamed from: f, reason: collision with root package name */
    public static int f29324f;

    /* renamed from: a, reason: collision with root package name */
    public final int f29325a = h();

    /* renamed from: b, reason: collision with root package name */
    public final o[] f29326b;

    /* renamed from: c, reason: collision with root package name */
    public int f29327c;

    /* renamed from: d, reason: collision with root package name */
    public int f29328d;

    /* renamed from: e, reason: collision with root package name */
    public int f29329e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum SequenceMode {
        hold,
        once,
        loop,
        pingpong,
        onceReverse,
        loopReverse,
        pingpongReverse;

        public static final SequenceMode[] values = values();
    }

    public Sequence(int i11) {
        this.f29326b = new o[i11];
    }

    public static synchronized int h() {
        int i11;
        synchronized (Sequence.class) {
            i11 = f29324f;
            f29324f = i11 + 1;
        }
        return i11;
    }

    public void a(m mVar, f fVar) {
        int g11 = mVar.g();
        if (g11 == -1) {
            g11 = this.f29329e;
        }
        o[] oVarArr = this.f29326b;
        if (g11 >= oVarArr.length) {
            g11 = oVarArr.length - 1;
        }
        o oVar = oVarArr[g11];
        if (fVar.g() != oVar) {
            fVar.a(oVar);
            fVar.b();
        }
    }

    public int b() {
        return this.f29328d;
    }

    public int c() {
        return this.f29325a;
    }

    public String d(String str, int i11) {
        StringBuilder sb2 = new StringBuilder(str.length() + this.f29328d);
        sb2.append(str);
        String num = Integer.toString(this.f29327c + i11);
        for (int length = this.f29328d - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
        return sb2.toString();
    }

    public o[] e() {
        return this.f29326b;
    }

    public int f() {
        return this.f29329e;
    }

    public int g() {
        return this.f29327c;
    }

    public void i(int i11) {
        this.f29328d = i11;
    }

    public void j(int i11) {
        this.f29329e = i11;
    }

    public void k(int i11) {
        this.f29327c = i11;
    }

    public Sequence(Sequence sequence) {
        o[] oVarArr = new o[sequence.f29326b.length];
        this.f29326b = oVarArr;
        g.a(sequence.f29326b, 0, oVarArr, 0, oVarArr.length);
        this.f29327c = sequence.f29327c;
        this.f29328d = sequence.f29328d;
        this.f29329e = sequence.f29329e;
    }
}
