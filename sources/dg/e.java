package dg;

import dg.d;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e {
    @l
    public static final <T> T a(@k d<? extends T> dVar) {
        g0.p(dVar, "<this>");
        if (!(dVar instanceof d.c)) {
            return null;
        }
        d.c cVar = (d.c) dVar;
        if (cVar.d() != null) {
            return (T) cVar.d();
        }
        return null;
    }

    public static final boolean b(@k d<?> dVar) {
        g0.p(dVar, "<this>");
        return dVar instanceof d.a;
    }

    public static final boolean c(@k d<?> dVar) {
        g0.p(dVar, "<this>");
        return (dVar instanceof d.c) && ((d.c) dVar).d() != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final <T> d<T> d(@k d<? extends T> dVar, @k x00.l<? super Throwable, g2> failure) {
        g0.p(dVar, "<this>");
        g0.p(failure, "failure");
        if (b(dVar)) {
            failure.invoke(((d.a) dVar).d());
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final <T> d<T> e(@k d<? extends T> dVar, @k x00.l<? super T, g2> success) {
        g0.p(dVar, "<this>");
        g0.p(success, "success");
        if (c(dVar)) {
            success.invoke((Object) ((d.c) dVar).d());
        }
        return dVar;
    }
}
