package e1;

import android.graphics.PointF;
import com.airbnb.lottie.o0;
import y0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f48295a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.m<PointF, PointF> f48296b;

    /* renamed from: c, reason: collision with root package name */
    public final d1.m<PointF, PointF> f48297c;

    /* renamed from: d, reason: collision with root package name */
    public final d1.b f48298d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f48299e;

    public f(String str, d1.m<PointF, PointF> mVar, d1.m<PointF, PointF> mVar2, d1.b bVar, boolean z11) {
        this.f48295a = str;
        this.f48296b = mVar;
        this.f48297c = mVar2;
        this.f48298d = bVar;
        this.f48299e = z11;
    }

    @Override // e1.c
    public y0.c a(o0 o0Var, com.airbnb.lottie.model.layer.a aVar) {
        return new p(o0Var, aVar, this);
    }

    public d1.b b() {
        return this.f48298d;
    }

    public String c() {
        return this.f48295a;
    }

    public d1.m<PointF, PointF> d() {
        return this.f48296b;
    }

    public d1.m<PointF, PointF> e() {
        return this.f48297c;
    }

    public boolean f() {
        return this.f48299e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f48296b + ", size=" + this.f48297c + l50.b.f69928j;
    }
}
