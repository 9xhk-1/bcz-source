package e1;

import android.graphics.PointF;
import com.airbnb.lottie.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f48278a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.m<PointF, PointF> f48279b;

    /* renamed from: c, reason: collision with root package name */
    public final d1.f f48280c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f48281d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f48282e;

    public b(String str, d1.m<PointF, PointF> mVar, d1.f fVar, boolean z11, boolean z12) {
        this.f48278a = str;
        this.f48279b = mVar;
        this.f48280c = fVar;
        this.f48281d = z11;
        this.f48282e = z12;
    }

    @Override // e1.c
    public y0.c a(o0 o0Var, com.airbnb.lottie.model.layer.a aVar) {
        return new y0.f(o0Var, aVar, this);
    }

    public String b() {
        return this.f48278a;
    }

    public d1.m<PointF, PointF> c() {
        return this.f48279b;
    }

    public d1.f d() {
        return this.f48280c;
    }

    public boolean e() {
        return this.f48282e;
    }

    public boolean f() {
        return this.f48281d;
    }
}
