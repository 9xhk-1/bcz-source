package ca0;

import ba0.c2;
import ca0.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class h<T> implements v<T> {

    /* renamed from: c, reason: collision with root package name */
    public static final v f8457c = new a();

    /* renamed from: d, reason: collision with root package name */
    public static final y f8458d = y.f("Always included");

    /* renamed from: e, reason: collision with root package name */
    public static final y f8459e = y.f("Element was included by all filters.");

    /* renamed from: b, reason: collision with root package name */
    public final Collection<v<T>> f8460b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements v {
        public static /* synthetic */ boolean n(Object obj) {
            return true;
        }

        @Override // ca0.v
        public y apply(Object obj) {
            return h.f8458d;
        }

        @Override // ca0.v
        public Predicate h() {
            return new Predicate() { // from class: ca0.g
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return h.a.n(obj);
                }
            };
        }
    }

    public h(Collection<? extends v<T>> filters) {
        this.f8460b = new ArrayList(c2.m(filters, "filters must not be empty"));
    }

    public static <T> v<T> r() {
        return f8457c;
    }

    @Override // ca0.v
    public y apply(final T element) {
        return (y) this.f8460b.stream().map(new Function() { // from class: ca0.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                y apply;
                apply = ((v) obj).apply(element);
                return apply;
            }
        }).filter(new Predicate() { // from class: ca0.f
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((y) obj).d();
            }
        }).findFirst().orElse(f8459e);
    }

    @Override // ca0.v
    public Predicate<T> h() {
        return (Predicate) this.f8460b.stream().map(new Function() { // from class: ca0.a
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((v) obj).h();
            }
        }).reduce(new BinaryOperator() { // from class: ca0.b
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((Predicate) obj).and((Predicate) obj2);
            }
        }).get();
    }

    public String toString() {
        return (String) this.f8460b.stream().map(new Function() { // from class: ca0.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String obj2;
                obj2 = ((v) obj).toString();
                return obj2;
            }
        }).map(new Function() { // from class: ca0.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String format;
                format = String.format("(%s)", (String) obj);
                return format;
            }
        }).collect(Collectors.joining(" and "));
    }
}
