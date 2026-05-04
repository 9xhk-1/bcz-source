package com.esotericsoftware.spine.android;

import android.graphics.Canvas;
import android.graphics.Point;
import androidx.annotation.Nullable;
import com.esotericsoftware.spine.Skeleton;
import com.esotericsoftware.spine.android.b;
import kl.i;
import ml.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f29308a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public d f29309b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public d f29310c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public ml.c f29311d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public ml.b f29312e;

    /* renamed from: f, reason: collision with root package name */
    public kl.b f29313f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29314g = true;

    /* renamed from: h, reason: collision with root package name */
    public double f29315h = 0.0d;

    /* renamed from: i, reason: collision with root package name */
    public double f29316i = 0.0d;

    /* renamed from: j, reason: collision with root package name */
    public double f29317j = 1.0d;

    /* renamed from: k, reason: collision with root package name */
    public double f29318k = 1.0d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final d f29319a;

        /* renamed from: b, reason: collision with root package name */
        public d f29320b;

        /* renamed from: c, reason: collision with root package name */
        public d f29321c;

        /* renamed from: d, reason: collision with root package name */
        public ml.c f29322d;

        /* renamed from: e, reason: collision with root package name */
        public ml.b f29323e;

        public a(d dVar) {
            this.f29319a = dVar;
        }

        public c a() {
            c cVar = new c(this.f29319a);
            cVar.f29309b = this.f29320b;
            cVar.f29310c = this.f29321c;
            cVar.f29311d = this.f29322d;
            cVar.f29312e = this.f29323e;
            return cVar;
        }

        public a b(ml.b bVar) {
            this.f29323e = bVar;
            return this;
        }

        public a c(d dVar) {
            this.f29321c = dVar;
            return this;
        }

        public a d(ml.c cVar) {
            this.f29322d = cVar;
            return this;
        }

        public a e(d dVar) {
            this.f29320b = dVar;
            return this;
        }
    }

    public c(d dVar) {
        this.f29308a = dVar;
    }

    public void e(Canvas canvas, com.badlogic.gdx.utils.a<b.C0343b> aVar) {
        ml.b bVar = this.f29312e;
        if (bVar != null) {
            bVar.a(this, canvas, aVar);
        }
    }

    public void f() {
        d dVar = this.f29310c;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    public void g(Canvas canvas) {
        ml.c cVar = this.f29311d;
        if (cVar != null) {
            cVar.a(this, canvas);
        }
    }

    public void h() {
        d dVar = this.f29309b;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    public com.esotericsoftware.spine.a i() {
        kl.b bVar = this.f29313f;
        if (bVar != null) {
            return bVar.d();
        }
        throw new RuntimeException("Controller is not initialized yet.");
    }

    public jl.a j() {
        kl.b bVar = this.f29313f;
        if (bVar != null) {
            return bVar.e();
        }
        throw new RuntimeException("Controller is not initialized yet.");
    }

    public i k() {
        kl.b bVar = this.f29313f;
        if (bVar != null) {
            return bVar.f();
        }
        throw new RuntimeException("Controller is not initialized yet.");
    }

    public kl.b l() {
        kl.b bVar = this.f29313f;
        if (bVar != null) {
            return bVar;
        }
        throw new RuntimeException("Controller is not initialized yet.");
    }

    public Skeleton m() {
        kl.b bVar = this.f29313f;
        if (bVar != null) {
            return bVar.g();
        }
        throw new RuntimeException("Controller is not initialized yet.");
    }

    public jl.i n() {
        kl.b bVar = this.f29313f;
        if (bVar != null) {
            return bVar.h();
        }
        throw new RuntimeException("Controller is not initialized yet.");
    }

    public void o(kl.b bVar) {
        this.f29313f = bVar;
        d dVar = this.f29308a;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    public boolean p() {
        return this.f29313f != null;
    }

    public boolean q() {
        return this.f29314g;
    }

    public void r() {
        if (this.f29314g) {
            this.f29314g = false;
        }
    }

    public void s() {
        if (this.f29314g) {
            return;
        }
        this.f29314g = true;
    }

    public void t(double d11, double d12, double d13, double d14) {
        this.f29315h = d11;
        this.f29316i = d12;
        this.f29317j = d13;
        this.f29318k = d14;
    }

    public void u(@Nullable ml.b bVar) {
        this.f29312e = bVar;
    }

    public void v(@Nullable d dVar) {
        this.f29310c = dVar;
    }

    public void w(@Nullable ml.c cVar) {
        this.f29311d = cVar;
    }

    public void x(@Nullable d dVar) {
        this.f29309b = dVar;
    }

    public Point y(Point point) {
        return new Point((int) ((point.x / this.f29317j) - this.f29315h), (int) ((point.y / this.f29318k) - this.f29316i));
    }
}
