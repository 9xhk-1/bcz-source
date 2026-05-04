package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.o0;
import d1.b;
import d1.m;
import e1.c;
import y0.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class PolystarShape implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10013a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f10014b;

    /* renamed from: c, reason: collision with root package name */
    public final b f10015c;

    /* renamed from: d, reason: collision with root package name */
    public final m<PointF, PointF> f10016d;

    /* renamed from: e, reason: collision with root package name */
    public final b f10017e;

    /* renamed from: f, reason: collision with root package name */
    public final b f10018f;

    /* renamed from: g, reason: collision with root package name */
    public final b f10019g;

    /* renamed from: h, reason: collision with root package name */
    public final b f10020h;

    /* renamed from: i, reason: collision with root package name */
    public final b f10021i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f10022j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10023k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i11) {
            this.value = i11;
        }

        public static Type forValue(int i11) {
            for (Type type : values()) {
                if (type.value == i11) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, b bVar, m<PointF, PointF> mVar, b bVar2, b bVar3, b bVar4, b bVar5, b bVar6, boolean z11, boolean z12) {
        this.f10013a = str;
        this.f10014b = type;
        this.f10015c = bVar;
        this.f10016d = mVar;
        this.f10017e = bVar2;
        this.f10018f = bVar3;
        this.f10019g = bVar4;
        this.f10020h = bVar5;
        this.f10021i = bVar6;
        this.f10022j = z11;
        this.f10023k = z12;
    }

    @Override // e1.c
    public y0.c a(o0 o0Var, com.airbnb.lottie.model.layer.a aVar) {
        return new o(o0Var, aVar, this);
    }

    public b b() {
        return this.f10018f;
    }

    public b c() {
        return this.f10020h;
    }

    public String d() {
        return this.f10013a;
    }

    public b e() {
        return this.f10019g;
    }

    public b f() {
        return this.f10021i;
    }

    public b g() {
        return this.f10015c;
    }

    public m<PointF, PointF> h() {
        return this.f10016d;
    }

    public b i() {
        return this.f10017e;
    }

    public Type j() {
        return this.f10014b;
    }

    public boolean k() {
        return this.f10022j;
    }

    public boolean l() {
        return this.f10023k;
    }
}
