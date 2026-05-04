package aw;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final xv.a f5491b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final xv.a f5492c;

    public g(@k xv.a lightColor, @k xv.a darkColor) {
        g0.p(lightColor, "lightColor");
        g0.p(darkColor, "darkColor");
        this.f5491b = lightColor;
        this.f5492c = darkColor;
    }

    @k
    public final xv.a a() {
        return this.f5492c;
    }

    @k
    public final xv.a b() {
        return this.f5491b;
    }
}
