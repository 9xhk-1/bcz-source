package com.airbnb.lottie.model.content;

import com.airbnb.lottie.o0;
import com.alipay.sdk.m.u.i;
import d1.b;
import e1.c;
import y0.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ShapeTrimPath implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10036a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f10037b;

    /* renamed from: c, reason: collision with root package name */
    public final b f10038c;

    /* renamed from: d, reason: collision with root package name */
    public final b f10039d;

    /* renamed from: e, reason: collision with root package name */
    public final b f10040e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10041f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i11) {
            if (i11 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i11 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i11);
        }
    }

    public ShapeTrimPath(String str, Type type, b bVar, b bVar2, b bVar3, boolean z11) {
        this.f10036a = str;
        this.f10037b = type;
        this.f10038c = bVar;
        this.f10039d = bVar2;
        this.f10040e = bVar3;
        this.f10041f = z11;
    }

    @Override // e1.c
    public y0.c a(o0 o0Var, com.airbnb.lottie.model.layer.a aVar) {
        return new v(aVar, this);
    }

    public b b() {
        return this.f10039d;
    }

    public String c() {
        return this.f10036a;
    }

    public b d() {
        return this.f10040e;
    }

    public b e() {
        return this.f10038c;
    }

    public Type f() {
        return this.f10037b;
    }

    public boolean g() {
        return this.f10041f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f10038c + ", end: " + this.f10039d + ", offset: " + this.f10040e + i.f11099d;
    }
}
