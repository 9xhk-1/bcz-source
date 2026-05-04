package a40;

import a00.a0;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {
    @m80.k
    public static final <T> a<T> a(int i11) {
        return new a<>(i11);
    }

    public static final int b(@m80.k f fVar, @m80.k x00.l<? super Integer, Integer> function) {
        int i11;
        g0.p(fVar, "<this>");
        g0.p(function, "function");
        do {
            i11 = fVar.i();
        } while (!fVar.b(i11, function.invoke(Integer.valueOf(i11)).intValue()));
        return i11;
    }

    public static final long c(@m80.k h hVar, @m80.k x00.l<? super Long, Long> function) {
        long i11;
        g0.p(hVar, "<this>");
        g0.p(function, "function");
        do {
            i11 = hVar.i();
        } while (!hVar.b(i11, function.invoke(Long.valueOf(i11)).longValue()));
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    public static final <T> T d(@m80.k j<T> jVar, @m80.k x00.l<? super T, ? extends T> function) {
        ?? r02;
        g0.p(jVar, "<this>");
        g0.p(function, "function");
        do {
            r02 = (Object) jVar.d();
        } while (!jVar.a(r02, function.invoke(r02)));
        return r02;
    }

    public static final boolean e(@m80.k b bVar, @m80.k x00.l<? super Boolean, Boolean> function) {
        boolean d11;
        g0.p(bVar, "<this>");
        g0.p(function, "function");
        do {
            d11 = bVar.d();
        } while (!bVar.a(d11, function.invoke(Boolean.valueOf(d11)).booleanValue()));
        return d11;
    }

    @m80.k
    public static final Void f(@m80.k b bVar, @m80.k x00.l<? super Boolean, g2> action) {
        g0.p(bVar, "<this>");
        g0.p(action, "action");
        while (true) {
            action.invoke(Boolean.valueOf(bVar.d()));
        }
    }

    @m80.k
    public static final Void g(@m80.k f fVar, @m80.k x00.l<? super Integer, g2> action) {
        g0.p(fVar, "<this>");
        g0.p(action, "action");
        while (true) {
            action.invoke(Integer.valueOf(fVar.i()));
        }
    }

    @m80.k
    public static final Void h(@m80.k h hVar, @m80.k x00.l<? super Long, g2> action) {
        g0.p(hVar, "<this>");
        g0.p(action, "action");
        while (true) {
            action.invoke(Long.valueOf(hVar.i()));
        }
    }

    @m80.k
    public static final <T> Void i(@m80.k j<T> jVar, @m80.k x00.l<? super T, g2> action) {
        g0.p(jVar, "<this>");
        g0.p(action, "action");
        while (true) {
            action.invoke(jVar.d());
        }
    }

    public static final void j(@m80.k b bVar, @m80.k x00.l<? super Boolean, Boolean> function) {
        boolean d11;
        g0.p(bVar, "<this>");
        g0.p(function, "function");
        do {
            d11 = bVar.d();
        } while (!bVar.a(d11, function.invoke(Boolean.valueOf(d11)).booleanValue()));
    }

    public static final void k(@m80.k f fVar, @m80.k x00.l<? super Integer, Integer> function) {
        int i11;
        g0.p(fVar, "<this>");
        g0.p(function, "function");
        do {
            i11 = fVar.i();
        } while (!fVar.b(i11, function.invoke(Integer.valueOf(i11)).intValue()));
    }

    public static final void l(@m80.k h hVar, @m80.k x00.l<? super Long, Long> function) {
        long i11;
        g0.p(hVar, "<this>");
        g0.p(function, "function");
        do {
            i11 = hVar.i();
        } while (!hVar.b(i11, function.invoke(Long.valueOf(i11)).longValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void m(@m80.k j<T> jVar, @m80.k x00.l<? super T, ? extends T> function) {
        a0.e eVar;
        g0.p(jVar, "<this>");
        g0.p(function, "function");
        do {
            eVar = (Object) jVar.d();
        } while (!jVar.a(eVar, function.invoke(eVar)));
    }

    public static final int n(@m80.k f fVar, @m80.k x00.l<? super Integer, Integer> function) {
        int i11;
        int intValue;
        g0.p(fVar, "<this>");
        g0.p(function, "function");
        do {
            i11 = fVar.i();
            intValue = function.invoke(Integer.valueOf(i11)).intValue();
        } while (!fVar.b(i11, intValue));
        return intValue;
    }

    public static final long o(@m80.k h hVar, @m80.k x00.l<? super Long, Long> function) {
        long i11;
        long longValue;
        g0.p(hVar, "<this>");
        g0.p(function, "function");
        do {
            i11 = hVar.i();
            longValue = function.invoke(Long.valueOf(i11)).longValue();
        } while (!hVar.b(i11, longValue));
        return longValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T p(@m80.k j<T> jVar, @m80.k x00.l<? super T, ? extends T> function) {
        a0.e eVar;
        T invoke;
        g0.p(jVar, "<this>");
        g0.p(function, "function");
        do {
            eVar = (Object) jVar.d();
            invoke = function.invoke(eVar);
        } while (!jVar.a(eVar, invoke));
        return invoke;
    }

    public static final boolean q(@m80.k b bVar, @m80.k x00.l<? super Boolean, Boolean> function) {
        boolean d11;
        boolean booleanValue;
        g0.p(bVar, "<this>");
        g0.p(function, "function");
        do {
            d11 = bVar.d();
            booleanValue = function.invoke(Boolean.valueOf(d11)).booleanValue();
        } while (!bVar.a(d11, booleanValue));
        return booleanValue;
    }
}
