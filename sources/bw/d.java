package bw;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d implements a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f7412b;

    public d(@k String url) {
        g0.p(url, "url");
        this.f7412b = url;
    }

    public static /* synthetic */ d c(d dVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = dVar.f7412b;
        }
        return dVar.b(str);
    }

    @k
    public final String a() {
        return this.f7412b;
    }

    @k
    public final d b(@k String url) {
        g0.p(url, "url");
        return new d(url);
    }

    @k
    public final String d() {
        return this.f7412b;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && g0.g(this.f7412b, ((d) obj).f7412b);
    }

    public int hashCode() {
        return this.f7412b.hashCode();
    }

    @k
    public String toString() {
        return "ImageDescUrl(url=" + this.f7412b + j.f81007d;
    }
}
