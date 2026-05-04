package z40;

import kotlin.jvm.internal.g0;
import m80.k;
import u30.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {
    @kotlin.c
    @k
    public static final c a(@k String str, @k i format) {
        g0.p(str, "<this>");
        g0.p(format, "format");
        return c.f100824c.b(u30.h.s(str, format));
    }

    public static /* synthetic */ c b(String str, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = i.f91627d.a();
        }
        return a(str, iVar);
    }

    @kotlin.c
    @k
    public static final String c(@k c cVar, int i11, int i12, @k i format) {
        g0.p(cVar, "<this>");
        g0.p(format, "format");
        return u30.h.b0(cVar.f(), i11, i12, format);
    }

    @kotlin.c
    @k
    public static final String d(@k c cVar, @k i format) {
        g0.p(cVar, "<this>");
        g0.p(format, "format");
        return u30.h.b0(cVar.f(), 0, cVar.f().length, format);
    }

    public static /* synthetic */ String e(c cVar, int i11, int i12, i iVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = cVar.g();
        }
        if ((i13 & 4) != 0) {
            iVar = i.f91627d.a();
        }
        return c(cVar, i11, i12, iVar);
    }

    public static /* synthetic */ String f(c cVar, i iVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = i.f91627d.a();
        }
        return d(cVar, iVar);
    }
}
