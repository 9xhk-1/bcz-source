package kotlin.time;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.time.n;
import w30.s;
import yz.g2;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nmeasureTime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n1#1,139:1\n63#1,3:140\n135#1,3:143\n*S KotlinDebug\n*F\n+ 1 measureTime.kt\nkotlin/time/MeasureTimeKt\n*L\n24#1:140,3\n95#1:143,3\n*E\n"})
/* loaded from: classes8.dex */
public final class k {
    @y0(version = "1.9")
    @j2(markerClass = {w30.h.class})
    public static final long a(@m80.k n.b bVar, @m80.k x00.a<g2> block) {
        g0.p(bVar, "<this>");
        g0.p(block, "block");
        long b11 = bVar.b();
        block.invoke();
        return n.b.a.i(b11);
    }

    @y0(version = "1.9")
    @j2(markerClass = {w30.h.class})
    public static final long b(@m80.k n nVar, @m80.k x00.a<g2> block) {
        g0.p(nVar, "<this>");
        g0.p(block, "block");
        m a11 = nVar.a();
        block.invoke();
        return a11.a();
    }

    @y0(version = "1.9")
    @j2(markerClass = {w30.h.class})
    public static final long c(@m80.k x00.a<g2> block) {
        g0.p(block, "block");
        long b11 = n.b.f67794b.b();
        block.invoke();
        return n.b.a.i(b11);
    }

    @y0(version = "1.9")
    @m80.k
    @j2(markerClass = {w30.h.class})
    public static final <T> s<T> d(@m80.k n.b bVar, @m80.k x00.a<? extends T> block) {
        g0.p(bVar, "<this>");
        g0.p(block, "block");
        return new s<>(block.invoke(), n.b.a.i(bVar.b()), null);
    }

    @y0(version = "1.9")
    @m80.k
    @j2(markerClass = {w30.h.class})
    public static final <T> s<T> e(@m80.k n nVar, @m80.k x00.a<? extends T> block) {
        g0.p(nVar, "<this>");
        g0.p(block, "block");
        return new s<>(block.invoke(), nVar.a().a(), null);
    }

    @y0(version = "1.9")
    @m80.k
    @j2(markerClass = {w30.h.class})
    public static final <T> s<T> f(@m80.k x00.a<? extends T> block) {
        g0.p(block, "block");
        return new s<>(block.invoke(), n.b.a.i(n.b.f67794b.b()), null);
    }
}
