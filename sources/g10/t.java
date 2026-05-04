package g10;

import kotlin.jvm.internal.g0;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class t {
    public static final void a(boolean z11, @m80.k Number step) {
        g0.p(step, "step");
        if (z11) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + '.');
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lg10/g<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @y0(version = "1.3")
    @o00.f
    public static final boolean b(g gVar, Object obj) {
        g0.p(gVar, "<this>");
        return obj != null && gVar.contains((Comparable) obj);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lg10/r<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    @y0(version = "1.9")
    @o00.f
    @j2(markerClass = {kotlin.c.class})
    public static final boolean c(r rVar, Object obj) {
        g0.p(rVar, "<this>");
        return obj != null && rVar.contains((Comparable) obj);
    }

    @y0(version = "1.1")
    @m80.k
    public static final f<Double> d(double d11, double d12) {
        return new d(d11, d12);
    }

    @y0(version = "1.1")
    @m80.k
    public static f<Float> e(float f11, float f12) {
        return new e(f11, f12);
    }

    @m80.k
    public static final <T extends Comparable<? super T>> g<T> f(@m80.k T t11, @m80.k T that) {
        g0.p(t11, "<this>");
        g0.p(that, "that");
        return new i(t11, that);
    }

    @y0(version = "1.9")
    @m80.k
    @j2(markerClass = {kotlin.c.class})
    public static final r<Double> g(double d11, double d12) {
        return new p(d11, d12);
    }

    @y0(version = "1.9")
    @m80.k
    @j2(markerClass = {kotlin.c.class})
    public static final r<Float> h(float f11, float f12) {
        return new q(f11, f12);
    }

    @y0(version = "1.9")
    @m80.k
    @j2(markerClass = {kotlin.c.class})
    public static final <T extends Comparable<? super T>> r<T> i(@m80.k T t11, @m80.k T that) {
        g0.p(t11, "<this>");
        g0.p(that, "that");
        return new h(t11, that);
    }
}
