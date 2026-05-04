package z10;

import a00.l1;
import java.util.Map;
import kotlin.jvm.internal.g0;
import n10.o;
import n20.b;
import y10.e0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d f100605a = new d();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final n20.f f100606b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final n20.f f100607c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final n20.f f100608d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final Map<n20.c, n20.c> f100609e;

    static {
        n20.f f11 = n20.f.f("message");
        g0.o(f11, "identifier(...)");
        f100606b = f11;
        n20.f f12 = n20.f.f("allowedTargets");
        g0.o(f12, "identifier(...)");
        f100607c = f12;
        n20.f f13 = n20.f.f("value");
        g0.o(f13, "identifier(...)");
        f100608d = f13;
        f100609e = l1.W(h1.a(o.a.H, e0.f99033d), h1.a(o.a.L, e0.f99035f), h1.a(o.a.P, e0.f99038i));
    }

    public static /* synthetic */ q10.c f(d dVar, f20.a aVar, b20.k kVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return dVar.e(aVar, kVar, z11);
    }

    @m80.l
    public final q10.c a(@m80.k n20.c kotlinName, @m80.k f20.d annotationOwner, @m80.k b20.k c11) {
        f20.a i11;
        g0.p(kotlinName, "kotlinName");
        g0.p(annotationOwner, "annotationOwner");
        g0.p(c11, "c");
        if (g0.g(kotlinName, o.a.f74077y)) {
            n20.c DEPRECATED_ANNOTATION = e0.f99037h;
            g0.o(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            f20.a i12 = annotationOwner.i(DEPRECATED_ANNOTATION);
            if (i12 != null || annotationOwner.x()) {
                return new h(i12, c11);
            }
        }
        n20.c cVar = f100609e.get(kotlinName);
        if (cVar == null || (i11 = annotationOwner.i(cVar)) == null) {
            return null;
        }
        return f(f100605a, i11, c11, false, 4, null);
    }

    @m80.k
    public final n20.f b() {
        return f100606b;
    }

    @m80.k
    public final n20.f c() {
        return f100608d;
    }

    @m80.k
    public final n20.f d() {
        return f100607c;
    }

    @m80.l
    public final q10.c e(@m80.k f20.a annotation, @m80.k b20.k c11, boolean z11) {
        g0.p(annotation, "annotation");
        g0.p(c11, "c");
        n20.b a11 = annotation.a();
        b.a aVar = n20.b.f74280d;
        n20.c TARGET_ANNOTATION = e0.f99033d;
        g0.o(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        if (g0.g(a11, aVar.c(TARGET_ANNOTATION))) {
            return new n(annotation, c11);
        }
        n20.c RETENTION_ANNOTATION = e0.f99035f;
        g0.o(RETENTION_ANNOTATION, "RETENTION_ANNOTATION");
        if (g0.g(a11, aVar.c(RETENTION_ANNOTATION))) {
            return new l(annotation, c11);
        }
        n20.c DOCUMENTED_ANNOTATION = e0.f99038i;
        g0.o(DOCUMENTED_ANNOTATION, "DOCUMENTED_ANNOTATION");
        if (g0.g(a11, aVar.c(DOCUMENTED_ANNOTATION))) {
            return new c(c11, annotation, o.a.P);
        }
        n20.c DEPRECATED_ANNOTATION = e0.f99037h;
        g0.o(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
        if (g0.g(a11, aVar.c(DEPRECATED_ANNOTATION))) {
            return null;
        }
        return new c20.j(c11, annotation, z11);
    }
}
