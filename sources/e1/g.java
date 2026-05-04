package e1;

import androidx.annotation.Nullable;
import com.airbnb.lottie.o0;
import y0.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f48300a;

    /* renamed from: b, reason: collision with root package name */
    public final d1.b f48301b;

    /* renamed from: c, reason: collision with root package name */
    public final d1.b f48302c;

    /* renamed from: d, reason: collision with root package name */
    public final d1.l f48303d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f48304e;

    public g(String str, d1.b bVar, d1.b bVar2, d1.l lVar, boolean z11) {
        this.f48300a = str;
        this.f48301b = bVar;
        this.f48302c = bVar2;
        this.f48303d = lVar;
        this.f48304e = z11;
    }

    @Override // e1.c
    @Nullable
    public y0.c a(o0 o0Var, com.airbnb.lottie.model.layer.a aVar) {
        return new q(o0Var, aVar, this);
    }

    public d1.b b() {
        return this.f48301b;
    }

    public String c() {
        return this.f48300a;
    }

    public d1.b d() {
        return this.f48302c;
    }

    public d1.l e() {
        return this.f48303d;
    }

    public boolean f() {
        return this.f48304e;
    }
}
