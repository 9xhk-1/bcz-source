package z0;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import z0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c implements a.b {

    /* renamed from: h, reason: collision with root package name */
    public static final double f100490h = 0.017453292519943295d;

    /* renamed from: a, reason: collision with root package name */
    public final a.b f100491a;

    /* renamed from: b, reason: collision with root package name */
    public final z0.a<Integer, Integer> f100492b;

    /* renamed from: c, reason: collision with root package name */
    public final z0.a<Float, Float> f100493c;

    /* renamed from: d, reason: collision with root package name */
    public final z0.a<Float, Float> f100494d;

    /* renamed from: e, reason: collision with root package name */
    public final z0.a<Float, Float> f100495e;

    /* renamed from: f, reason: collision with root package name */
    public final z0.a<Float, Float> f100496f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f100497g = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends k1.j<Float> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k1.j f100498d;

        public a(k1.j jVar) {
            this.f100498d = jVar;
        }

        @Override // k1.j
        @Nullable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Float a(k1.b<Float> bVar) {
            Float f11 = (Float) this.f100498d.a(bVar);
            if (f11 == null) {
                return null;
            }
            return Float.valueOf(f11.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, com.airbnb.lottie.model.layer.a aVar, h1.j jVar) {
        this.f100491a = bVar;
        z0.a<Integer, Integer> k11 = jVar.a().k();
        this.f100492b = k11;
        k11.a(this);
        aVar.i(k11);
        z0.a<Float, Float> k12 = jVar.d().k();
        this.f100493c = k12;
        k12.a(this);
        aVar.i(k12);
        z0.a<Float, Float> k13 = jVar.b().k();
        this.f100494d = k13;
        k13.a(this);
        aVar.i(k13);
        z0.a<Float, Float> k14 = jVar.c().k();
        this.f100495e = k14;
        k14.a(this);
        aVar.i(k14);
        z0.a<Float, Float> k15 = jVar.e().k();
        this.f100496f = k15;
        k15.a(this);
        aVar.i(k15);
    }

    public void a(Paint paint) {
        if (this.f100497g) {
            this.f100497g = false;
            double floatValue = this.f100494d.h().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.f100495e.h().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.f100492b.h().intValue();
            paint.setShadowLayer(this.f100496f.h().floatValue(), sin, cos, Color.argb(Math.round(this.f100493c.h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    public void b(@Nullable k1.j<Integer> jVar) {
        this.f100492b.n(jVar);
    }

    public void c(@Nullable k1.j<Float> jVar) {
        this.f100494d.n(jVar);
    }

    public void d(@Nullable k1.j<Float> jVar) {
        this.f100495e.n(jVar);
    }

    @Override // z0.a.b
    public void e() {
        this.f100497g = true;
        this.f100491a.e();
    }

    public void f(@Nullable k1.j<Float> jVar) {
        if (jVar == null) {
            this.f100493c.n(null);
        } else {
            this.f100493c.n(new a(jVar));
        }
    }

    public void g(@Nullable k1.j<Float> jVar) {
        this.f100496f.n(jVar);
    }
}
