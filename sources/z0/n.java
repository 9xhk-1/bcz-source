package z0;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Collections;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class n extends a<PointF, PointF> {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f100515i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f100516j;

    /* renamed from: k, reason: collision with root package name */
    public final a<Float, Float> f100517k;

    /* renamed from: l, reason: collision with root package name */
    public final a<Float, Float> f100518l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public k1.j<Float> f100519m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public k1.j<Float> f100520n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.EMPTY_LIST);
        this.f100515i = new PointF();
        this.f100516j = new PointF();
        this.f100517k = aVar;
        this.f100518l = aVar2;
        m(f());
    }

    @Override // z0.a
    public void m(float f11) {
        this.f100517k.m(f11);
        this.f100518l.m(f11);
        this.f100515i.set(this.f100517k.h().floatValue(), this.f100518l.h().floatValue());
        for (int i11 = 0; i11 < this.f100476a.size(); i11++) {
            this.f100476a.get(i11).e();
        }
    }

    @Override // z0.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override // z0.a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF i(k1.a<PointF> aVar, float f11) {
        float f12;
        Float f13;
        k1.a<Float> b11;
        k1.a<Float> b12;
        Float f14 = null;
        if (this.f100519m == null || (b12 = this.f100517k.b()) == null) {
            f12 = f11;
            f13 = null;
        } else {
            float d11 = this.f100517k.d();
            Float f15 = b12.f64882h;
            k1.j<Float> jVar = this.f100519m;
            float f16 = b12.f64881g;
            f12 = f11;
            f13 = jVar.b(f16, f15 == null ? f16 : f15.floatValue(), b12.f64876b, b12.f64877c, f11, f11, d11);
        }
        if (this.f100520n != null && (b11 = this.f100518l.b()) != null) {
            float d12 = this.f100518l.d();
            Float f17 = b11.f64882h;
            k1.j<Float> jVar2 = this.f100520n;
            float f18 = b11.f64881g;
            f14 = jVar2.b(f18, f17 == null ? f18 : f17.floatValue(), b11.f64876b, b11.f64877c, f12, f12, d12);
        }
        if (f13 == null) {
            this.f100516j.set(this.f100515i.x, 0.0f);
        } else {
            this.f100516j.set(f13.floatValue(), 0.0f);
        }
        if (f14 == null) {
            PointF pointF = this.f100516j;
            pointF.set(pointF.x, this.f100515i.y);
        } else {
            PointF pointF2 = this.f100516j;
            pointF2.set(pointF2.x, f14.floatValue());
        }
        return this.f100516j;
    }

    public void r(@Nullable k1.j<Float> jVar) {
        k1.j<Float> jVar2 = this.f100519m;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f100519m = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }

    public void s(@Nullable k1.j<Float> jVar) {
        k1.j<Float> jVar2 = this.f100520n;
        if (jVar2 != null) {
            jVar2.c(null);
        }
        this.f100520n = jVar;
        if (jVar != null) {
            jVar.c(this);
        }
    }
}
