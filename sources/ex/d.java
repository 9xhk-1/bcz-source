package ex;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final gz.a f50186a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f50187b;

    public d(@k gz.a expectedType, @k Object response) {
        g0.p(expectedType, "expectedType");
        g0.p(response, "response");
        this.f50186a = expectedType;
        this.f50187b = response;
    }

    public static /* synthetic */ d d(d dVar, gz.a aVar, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            aVar = dVar.f50186a;
        }
        if ((i11 & 2) != 0) {
            obj = dVar.f50187b;
        }
        return dVar.c(aVar, obj);
    }

    @k
    public final gz.a a() {
        return this.f50186a;
    }

    @k
    public final Object b() {
        return this.f50187b;
    }

    @k
    public final d c(@k gz.a expectedType, @k Object response) {
        g0.p(expectedType, "expectedType");
        g0.p(response, "response");
        return new d(expectedType, response);
    }

    @k
    public final gz.a e() {
        return this.f50186a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return g0.g(this.f50186a, dVar.f50186a) && g0.g(this.f50187b, dVar.f50187b);
    }

    @k
    public final Object f() {
        return this.f50187b;
    }

    public int hashCode() {
        return (this.f50186a.hashCode() * 31) + this.f50187b.hashCode();
    }

    @k
    public String toString() {
        return "HttpResponseContainer(expectedType=" + this.f50186a + ", response=" + this.f50187b + ')';
    }
}
