package bw;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final yv.e f7411b;

    public b(@k yv.e resource) {
        g0.p(resource, "resource");
        this.f7411b = resource;
    }

    public static /* synthetic */ b c(b bVar, yv.e eVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = bVar.f7411b;
        }
        return bVar.b(eVar);
    }

    @k
    public final yv.e a() {
        return this.f7411b;
    }

    @k
    public final b b(@k yv.e resource) {
        g0.p(resource, "resource");
        return new b(resource);
    }

    @k
    public final yv.e d() {
        return this.f7411b;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && g0.g(this.f7411b, ((b) obj).f7411b);
    }

    public int hashCode() {
        return this.f7411b.hashCode();
    }

    @k
    public String toString() {
        return "ImageDescResource(resource=" + this.f7411b + j.f81007d;
    }
}
