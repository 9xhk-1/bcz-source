package com.airbnb.lottie.model.content;

import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.o0;
import d1.b;
import d1.d;
import d1.f;
import e1.c;
import java.util.List;
import y0.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10042a;

    /* renamed from: b, reason: collision with root package name */
    public final GradientType f10043b;

    /* renamed from: c, reason: collision with root package name */
    public final d1.c f10044c;

    /* renamed from: d, reason: collision with root package name */
    public final d f10045d;

    /* renamed from: e, reason: collision with root package name */
    public final f f10046e;

    /* renamed from: f, reason: collision with root package name */
    public final f f10047f;

    /* renamed from: g, reason: collision with root package name */
    public final b f10048g;

    /* renamed from: h, reason: collision with root package name */
    public final ShapeStroke.LineCapType f10049h;

    /* renamed from: i, reason: collision with root package name */
    public final ShapeStroke.LineJoinType f10050i;

    /* renamed from: j, reason: collision with root package name */
    public final float f10051j;

    /* renamed from: k, reason: collision with root package name */
    public final List<b> f10052k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public final b f10053l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f10054m;

    public a(String str, GradientType gradientType, d1.c cVar, d dVar, f fVar, f fVar2, b bVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f11, List<b> list, @Nullable b bVar2, boolean z11) {
        this.f10042a = str;
        this.f10043b = gradientType;
        this.f10044c = cVar;
        this.f10045d = dVar;
        this.f10046e = fVar;
        this.f10047f = fVar2;
        this.f10048g = bVar;
        this.f10049h = lineCapType;
        this.f10050i = lineJoinType;
        this.f10051j = f11;
        this.f10052k = list;
        this.f10053l = bVar2;
        this.f10054m = z11;
    }

    @Override // e1.c
    public y0.c a(o0 o0Var, com.airbnb.lottie.model.layer.a aVar) {
        return new i(o0Var, aVar, this);
    }

    public ShapeStroke.LineCapType b() {
        return this.f10049h;
    }

    @Nullable
    public b c() {
        return this.f10053l;
    }

    public f d() {
        return this.f10047f;
    }

    public d1.c e() {
        return this.f10044c;
    }

    public GradientType f() {
        return this.f10043b;
    }

    public ShapeStroke.LineJoinType g() {
        return this.f10050i;
    }

    public List<b> h() {
        return this.f10052k;
    }

    public float i() {
        return this.f10051j;
    }

    public String j() {
        return this.f10042a;
    }

    public d k() {
        return this.f10045d;
    }

    public f l() {
        return this.f10046e;
    }

    public b m() {
        return this.f10048g;
    }

    public boolean n() {
        return this.f10054m;
    }
}
