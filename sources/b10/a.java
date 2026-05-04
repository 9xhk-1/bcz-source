package b10;

import a00.h0;
import a00.v1;
import a00.w1;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.c;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import q30.m;
import q30.x;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @y0(version = "1.8")
    @k
    @j2(markerClass = {c.class})
    public static final <T> m<T> a(@k Optional<? extends T> optional) {
        g0.p(optional, "<this>");
        return optional.isPresent() ? x.B(optional.get()) : x.l();
    }

    @y0(version = "1.8")
    @j2(markerClass = {c.class})
    public static final <T> T b(@k Optional<? extends T> optional, T t11) {
        g0.p(optional, "<this>");
        return optional.isPresent() ? optional.get() : t11;
    }

    @y0(version = "1.8")
    @j2(markerClass = {c.class})
    public static final <T> T c(@k Optional<? extends T> optional, @k x00.a<? extends T> defaultValue) {
        g0.p(optional, "<this>");
        g0.p(defaultValue, "defaultValue");
        return optional.isPresent() ? optional.get() : defaultValue.invoke();
    }

    @l
    @y0(version = "1.8")
    @j2(markerClass = {c.class})
    public static final <T> T d(@k Optional<T> optional) {
        g0.p(optional, "<this>");
        return optional.orElse(null);
    }

    @y0(version = "1.8")
    @k
    @j2(markerClass = {c.class})
    public static final <T, C extends Collection<? super T>> C e(@k Optional<T> optional, @k C destination) {
        g0.p(optional, "<this>");
        g0.p(destination, "destination");
        if (optional.isPresent()) {
            T t11 = optional.get();
            g0.o(t11, "get(...)");
            destination.add(t11);
        }
        return destination;
    }

    @y0(version = "1.8")
    @k
    @j2(markerClass = {c.class})
    public static final <T> List<T> f(@k Optional<? extends T> optional) {
        g0.p(optional, "<this>");
        return optional.isPresent() ? a00.g0.l(optional.get()) : h0.J();
    }

    @y0(version = "1.8")
    @k
    @j2(markerClass = {c.class})
    public static final <T> Set<T> g(@k Optional<? extends T> optional) {
        g0.p(optional, "<this>");
        return optional.isPresent() ? v1.f(optional.get()) : w1.k();
    }
}
