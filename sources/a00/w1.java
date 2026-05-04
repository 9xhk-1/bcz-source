package a00;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class w1 extends v1 {
    @yz.y0(version = "1.6")
    @o00.f
    public static final <E> Set<E> i(int i11, @yz.b x00.l<? super Set<E>, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        Set e11 = v1.e(i11);
        builderAction.invoke(e11);
        return v1.a(e11);
    }

    @yz.y0(version = "1.6")
    @o00.f
    public static final <E> Set<E> j(@yz.b x00.l<? super Set<E>, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        Set d11 = v1.d();
        builderAction.invoke(d11);
        return v1.a(d11);
    }

    @m80.k
    public static <T> Set<T> k() {
        return EmptySet.INSTANCE;
    }

    @yz.y0(version = "1.1")
    @o00.f
    public static final <T> HashSet<T> l() {
        return new HashSet<>();
    }

    @m80.k
    public static final <T> HashSet<T> m(@m80.k T... elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return (HashSet) a0.Iy(elements, new HashSet(k1.j(elements.length)));
    }

    @yz.y0(version = "1.1")
    @o00.f
    public static final <T> LinkedHashSet<T> n() {
        return new LinkedHashSet<>();
    }

    @m80.k
    public static <T> LinkedHashSet<T> o(@m80.k T... elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return (LinkedHashSet) a0.Iy(elements, new LinkedHashSet(k1.j(elements.length)));
    }

    @yz.y0(version = "1.1")
    @o00.f
    public static final <T> Set<T> p() {
        return new LinkedHashSet();
    }

    @m80.k
    public static <T> Set<T> q(@m80.k T... elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return (Set) a0.Iy(elements, new LinkedHashSet(k1.j(elements.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T> Set<T> r(@m80.k Set<? extends T> set) {
        kotlin.jvm.internal.g0.p(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : v1.f(set.iterator().next()) : k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o00.f
    public static final <T> Set<T> s(Set<? extends T> set) {
        return set == 0 ? k() : set;
    }

    @o00.f
    public static final <T> Set<T> t() {
        return k();
    }

    @m80.k
    public static <T> Set<T> u(@m80.k T... elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return a0.Fz(elements);
    }

    @yz.y0(version = "1.4")
    @m80.k
    public static final <T> Set<T> v(@m80.l T t11) {
        return t11 != null ? v1.f(t11) : k();
    }

    @yz.y0(version = "1.4")
    @m80.k
    public static final <T> Set<T> w(@m80.k T... elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return (Set) a0.mb(elements, new LinkedHashSet());
    }
}
