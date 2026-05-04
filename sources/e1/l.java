package e1;

import com.airbnb.lottie.o0;
import y0.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f48319a;

    /* renamed from: b, reason: collision with root package name */
    public final int f48320b;

    /* renamed from: c, reason: collision with root package name */
    public final d1.h f48321c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f48322d;

    public l(String str, int i11, d1.h hVar, boolean z11) {
        this.f48319a = str;
        this.f48320b = i11;
        this.f48321c = hVar;
        this.f48322d = z11;
    }

    @Override // e1.c
    public y0.c a(o0 o0Var, com.airbnb.lottie.model.layer.a aVar) {
        return new s(o0Var, aVar, this);
    }

    public String b() {
        return this.f48319a;
    }

    public d1.h c() {
        return this.f48321c;
    }

    public boolean d() {
        return this.f48322d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f48319a + ", index=" + this.f48320b + l50.b.f69928j;
    }
}
