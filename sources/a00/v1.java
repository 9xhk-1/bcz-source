package a00;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.builders.SetBuilder;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class v1 {
    @yz.y0(version = "1.3")
    @yz.v0
    @m80.k
    public static <E> Set<E> a(@m80.k Set<E> builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        return ((SetBuilder) builder).build();
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @o00.f
    public static final <E> Set<E> b(int i11, x00.l<? super Set<E>, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        Set e11 = e(i11);
        builderAction.invoke(e11);
        return a(e11);
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @o00.f
    public static final <E> Set<E> c(x00.l<? super Set<E>, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        Set d11 = d();
        builderAction.invoke(d11);
        return a(d11);
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @m80.k
    public static <E> Set<E> d() {
        return new SetBuilder();
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @m80.k
    public static <E> Set<E> e(int i11) {
        return new SetBuilder(i11);
    }

    @m80.k
    public static <T> Set<T> f(T t11) {
        Set<T> singleton = Collections.singleton(t11);
        kotlin.jvm.internal.g0.o(singleton, "singleton(...)");
        return singleton;
    }

    @m80.k
    public static <T> TreeSet<T> g(@m80.k Comparator<? super T> comparator, @m80.k T... elements) {
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return (TreeSet) a0.Iy(elements, new TreeSet(comparator));
    }

    @m80.k
    public static <T> TreeSet<T> h(@m80.k T... elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return (TreeSet) a0.Iy(elements, new TreeSet());
    }
}
