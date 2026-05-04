package y0;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.t0;
import java.util.List;
import z0.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o implements n, a.b, k {

    /* renamed from: p, reason: collision with root package name */
    public static final float f98876p = 0.47829f;

    /* renamed from: q, reason: collision with root package name */
    public static final float f98877q = 0.25f;

    /* renamed from: b, reason: collision with root package name */
    public final String f98879b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f98880c;

    /* renamed from: d, reason: collision with root package name */
    public final PolystarShape.Type f98881d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f98882e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f98883f;

    /* renamed from: g, reason: collision with root package name */
    public final z0.a<?, Float> f98884g;

    /* renamed from: h, reason: collision with root package name */
    public final z0.a<?, PointF> f98885h;

    /* renamed from: i, reason: collision with root package name */
    public final z0.a<?, Float> f98886i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public final z0.a<?, Float> f98887j;

    /* renamed from: k, reason: collision with root package name */
    public final z0.a<?, Float> f98888k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public final z0.a<?, Float> f98889l;

    /* renamed from: m, reason: collision with root package name */
    public final z0.a<?, Float> f98890m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f98892o;

    /* renamed from: a, reason: collision with root package name */
    public final Path f98878a = new Path();

    /* renamed from: n, reason: collision with root package name */
    public final b f98891n = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98893a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f98893a = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98893a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public o(o0 o0Var, com.airbnb.lottie.model.layer.a aVar, PolystarShape polystarShape) {
        this.f98880c = o0Var;
        this.f98879b = polystarShape.d();
        PolystarShape.Type j11 = polystarShape.j();
        this.f98881d = j11;
        this.f98882e = polystarShape.k();
        this.f98883f = polystarShape.l();
        z0.a<Float, Float> k11 = polystarShape.g().k();
        this.f98884g = k11;
        z0.a<PointF, PointF> k12 = polystarShape.h().k();
        this.f98885h = k12;
        z0.a<Float, Float> k13 = polystarShape.i().k();
        this.f98886i = k13;
        z0.a<Float, Float> k14 = polystarShape.e().k();
        this.f98888k = k14;
        z0.a<Float, Float> k15 = polystarShape.f().k();
        this.f98890m = k15;
        PolystarShape.Type type = PolystarShape.Type.STAR;
        if (j11 == type) {
            this.f98887j = polystarShape.b().k();
            this.f98889l = polystarShape.c().k();
        } else {
            this.f98887j = null;
            this.f98889l = null;
        }
        aVar.i(k11);
        aVar.i(k12);
        aVar.i(k13);
        aVar.i(k14);
        aVar.i(k15);
        if (j11 == type) {
            aVar.i(this.f98887j);
            aVar.i(this.f98889l);
        }
        k11.a(this);
        k12.a(this);
        k13.a(this);
        k14.a(this);
        k15.a(this);
        if (j11 == type) {
            this.f98887j.a(this);
            this.f98889l.a(this);
        }
    }

    private void j() {
        this.f98892o = false;
        this.f98880c.invalidateSelf();
    }

    @Override // c1.e
    public <T> void b(T t11, @Nullable k1.j<T> jVar) {
        z0.a<?, Float> aVar;
        z0.a<?, Float> aVar2;
        if (t11 == t0.f10213w) {
            this.f98884g.n(jVar);
            return;
        }
        if (t11 == t0.f10214x) {
            this.f98886i.n(jVar);
            return;
        }
        if (t11 == t0.f10204n) {
            this.f98885h.n(jVar);
            return;
        }
        if (t11 == t0.f10215y && (aVar2 = this.f98887j) != null) {
            aVar2.n(jVar);
            return;
        }
        if (t11 == t0.f10216z) {
            this.f98888k.n(jVar);
            return;
        }
        if (t11 == t0.A && (aVar = this.f98889l) != null) {
            aVar.n(jVar);
        } else if (t11 == t0.B) {
            this.f98890m.n(jVar);
        }
    }

    public final void c() {
        double d11;
        int floor = (int) Math.floor(this.f98884g.h().floatValue());
        double radians = Math.toRadians((this.f98886i == null ? 0.0d : r2.h().floatValue()) - 90.0d);
        double d12 = floor;
        float floatValue = this.f98890m.h().floatValue() / 100.0f;
        float floatValue2 = this.f98888k.h().floatValue();
        double d13 = floatValue2;
        float cos = (float) (Math.cos(radians) * d13);
        float sin = (float) (Math.sin(radians) * d13);
        this.f98878a.moveTo(cos, sin);
        double d14 = (float) (6.283185307179586d / d12);
        double d15 = radians + d14;
        double ceil = Math.ceil(d12);
        int i11 = 0;
        while (i11 < ceil) {
            float cos2 = (float) (Math.cos(d15) * d13);
            int i12 = i11;
            double d16 = d15;
            float sin2 = (float) (d13 * Math.sin(d15));
            if (floatValue != 0.0f) {
                d11 = ceil;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f11 = floatValue2 * floatValue * 0.25f;
                this.f98878a.cubicTo(cos - (f11 * cos3), sin - (f11 * sin3), cos2 + (((float) Math.cos(atan22)) * f11), sin2 + (f11 * ((float) Math.sin(atan22))), cos2, sin2);
                cos = cos2;
                sin = sin2;
            } else {
                sin = sin2;
                d11 = ceil;
                cos = cos2;
                this.f98878a.lineTo(cos, sin);
            }
            d15 = d16 + d14;
            i11 = i12 + 1;
            ceil = d11;
        }
        PointF h11 = this.f98885h.h();
        this.f98878a.offset(h11.x, h11.y);
        this.f98878a.close();
    }

    @Override // z0.a.b
    public void e() {
        j();
    }

    @Override // y0.c
    public void f(List<c> list, List<c> list2) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c cVar = list.get(i11);
            if (cVar instanceof v) {
                v vVar = (v) cVar;
                if (vVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f98891n.a(vVar);
                    vVar.b(this);
                }
            }
        }
    }

    @Override // y0.c
    public String getName() {
        return this.f98879b;
    }

    @Override // y0.n
    public Path getPath() {
        if (this.f98892o) {
            return this.f98878a;
        }
        this.f98878a.reset();
        if (this.f98882e) {
            this.f98892o = true;
            return this.f98878a;
        }
        int i11 = a.f98893a[this.f98881d.ordinal()];
        if (i11 == 1) {
            i();
        } else if (i11 == 2) {
            c();
        }
        this.f98878a.close();
        this.f98891n.b(this.f98878a);
        this.f98892o = true;
        return this.f98878a;
    }

    @Override // c1.e
    public void h(c1.d dVar, int i11, List<c1.d> list, c1.d dVar2) {
        j1.i.m(dVar, i11, list, dVar2, this);
    }

    public final void i() {
        float f11;
        float f12;
        int i11;
        float cos;
        float sin;
        float f13;
        float f14;
        double d11;
        float f15;
        int i12;
        float f16;
        double d12;
        float f17;
        float f18;
        double d13;
        float f19;
        float f21;
        float floatValue = this.f98884g.h().floatValue();
        double radians = Math.toRadians((this.f98886i == null ? 0.0d : r2.h().floatValue()) - 90.0d);
        double d14 = floatValue;
        float f22 = (float) (6.283185307179586d / d14);
        if (this.f98883f) {
            f22 *= -1.0f;
        }
        float f23 = f22 / 2.0f;
        float f24 = floatValue - ((int) floatValue);
        int i13 = (f24 > 0.0f ? 1 : (f24 == 0.0f ? 0 : -1));
        if (i13 != 0) {
            radians += (1.0f - f24) * f23;
        }
        float floatValue2 = this.f98888k.h().floatValue();
        float floatValue3 = this.f98887j.h().floatValue();
        z0.a<?, Float> aVar = this.f98889l;
        float floatValue4 = aVar != null ? aVar.h().floatValue() / 100.0f : 0.0f;
        z0.a<?, Float> aVar2 = this.f98890m;
        float floatValue5 = aVar2 != null ? aVar2.h().floatValue() / 100.0f : 0.0f;
        if (i13 != 0) {
            f15 = ((floatValue2 - floatValue3) * f24) + floatValue3;
            f12 = 0.0f;
            i11 = i13;
            double d15 = f15;
            f11 = 2.0f;
            float cos2 = (float) (d15 * Math.cos(radians));
            sin = (float) (d15 * Math.sin(radians));
            this.f98878a.moveTo(cos2, sin);
            d11 = radians + ((f22 * f24) / 2.0f);
            f13 = f24;
            cos = cos2;
            f14 = f23;
        } else {
            f11 = 2.0f;
            f12 = 0.0f;
            i11 = i13;
            double d16 = floatValue2;
            cos = (float) (Math.cos(radians) * d16);
            sin = (float) (d16 * Math.sin(radians));
            this.f98878a.moveTo(cos, sin);
            f13 = f24;
            f14 = f23;
            d11 = radians + f14;
            f15 = 0.0f;
        }
        double ceil = Math.ceil(d14) * 2.0d;
        int i14 = 0;
        boolean z11 = false;
        double d17 = d11;
        float f25 = sin;
        float f26 = cos;
        double d18 = d17;
        while (true) {
            double d19 = i14;
            if (d19 >= ceil) {
                PointF h11 = this.f98885h.h();
                this.f98878a.offset(h11.x, h11.y);
                this.f98878a.close();
                return;
            }
            float f27 = z11 ? floatValue2 : floatValue3;
            if (f15 == f12 || d19 != ceil - 2.0d) {
                i12 = i14;
                f16 = f14;
            } else {
                i12 = i14;
                f16 = (f22 * f13) / f11;
            }
            if (f15 == f12 || d19 != ceil - 1.0d) {
                d12 = d19;
                f17 = f27;
            } else {
                d12 = d19;
                f17 = f15;
            }
            double d21 = f17;
            float cos3 = (float) (d21 * Math.cos(d18));
            float f28 = f22;
            float sin2 = (float) (d21 * Math.sin(d18));
            if (floatValue4 == f12 && floatValue5 == f12) {
                this.f98878a.lineTo(cos3, sin2);
                f21 = cos3;
                f19 = sin2;
                f18 = f14;
                d13 = d18;
            } else {
                f18 = f14;
                d13 = d18;
                double atan2 = (float) (Math.atan2(f25, f26) - 1.5707963267948966d);
                float cos4 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                float f29 = f26;
                float f31 = f25;
                f19 = sin2;
                double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                float cos5 = (float) Math.cos(atan22);
                float sin4 = (float) Math.sin(atan22);
                float f32 = z11 ? floatValue4 : floatValue5;
                float f33 = z11 ? floatValue5 : floatValue4;
                float f34 = (z11 ? floatValue3 : floatValue2) * f32 * 0.47829f;
                float f35 = cos4 * f34;
                float f36 = f34 * sin3;
                float f37 = (z11 ? floatValue2 : floatValue3) * f33 * 0.47829f;
                float f38 = cos5 * f37;
                float f39 = f37 * sin4;
                if (i11 != 0) {
                    if (i12 == 0) {
                        f35 *= f13;
                        f36 *= f13;
                    } else if (d12 == ceil - 1.0d) {
                        f38 *= f13;
                        f39 *= f13;
                    }
                }
                f21 = cos3;
                this.f98878a.cubicTo(f29 - f35, f31 - f36, cos3 + f38, f19 + f39, f21, f19);
            }
            d18 = d13 + f16;
            z11 = !z11;
            i14 = i12 + 1;
            f14 = f18;
            f26 = f21;
            f25 = f19;
            f22 = f28;
        }
    }
}
