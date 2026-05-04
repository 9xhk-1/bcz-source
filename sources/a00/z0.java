package a00;

import a00.a0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
/* loaded from: classes8.dex */
public class z0 extends y0 {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @yz.y0(version = "1.1")
    @m80.k
    public static final <T, K, R> Map<K, R> c(@m80.k w0<T, ? extends K> w0Var, @m80.k x00.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b11 = w0Var.b();
        while (b11.hasNext()) {
            ?? next = b11.next();
            Object a11 = w0Var.a(next);
            a0.d dVar = (Object) linkedHashMap.get(a11);
            linkedHashMap.put(a11, operation.invoke(a11, dVar, next, Boolean.valueOf(dVar == null && !linkedHashMap.containsKey(a11))));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @yz.y0(version = "1.1")
    @m80.k
    public static final <T, K, R, M extends Map<? super K, R>> M d(@m80.k w0<T, ? extends K> w0Var, @m80.k M destination, @m80.k x00.r<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<T> b11 = w0Var.b();
        while (b11.hasNext()) {
            ?? next = b11.next();
            Object a11 = w0Var.a(next);
            a0.d dVar = (Object) destination.get(a11);
            destination.put(a11, operation.invoke(a11, dVar, next, Boolean.valueOf(dVar == null && !destination.containsKey(a11))));
        }
        return destination;
    }

    @yz.y0(version = "1.1")
    @m80.k
    public static final <T, K, M extends Map<? super K, Integer>> M e(@m80.k w0<T, ? extends K> w0Var, @m80.k M destination) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        Iterator<T> b11 = w0Var.b();
        while (b11.hasNext()) {
            K a11 = w0Var.a(b11.next());
            Object obj = destination.get(a11);
            if (obj == null && !destination.containsKey(a11)) {
                obj = 0;
            }
            destination.put(a11, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @yz.y0(version = "1.1")
    @m80.k
    public static final <T, K, R> Map<K, R> f(@m80.k w0<T, ? extends K> w0Var, R r11, @m80.k x00.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b11 = w0Var.b();
        while (b11.hasNext()) {
            ?? next = b11.next();
            K a11 = w0Var.a(next);
            a0.e eVar = (Object) linkedHashMap.get(a11);
            if (eVar == null && !linkedHashMap.containsKey(a11)) {
                eVar = (Object) r11;
            }
            linkedHashMap.put(a11, operation.invoke(eVar, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @yz.y0(version = "1.1")
    @m80.k
    public static final <T, K, R> Map<K, R> g(@m80.k w0<T, ? extends K> w0Var, @m80.k x00.p<? super K, ? super T, ? extends R> initialValueSelector, @m80.k x00.q<? super K, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        kotlin.jvm.internal.g0.p(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.g0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b11 = w0Var.b();
        while (b11.hasNext()) {
            ?? next = b11.next();
            Object a11 = w0Var.a(next);
            R r11 = (Object) linkedHashMap.get(a11);
            if (r11 == null && !linkedHashMap.containsKey(a11)) {
                r11 = initialValueSelector.invoke(a11, next);
            }
            linkedHashMap.put(a11, operation.invoke(a11, r11, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @yz.y0(version = "1.1")
    @m80.k
    public static final <T, K, R, M extends Map<? super K, R>> M h(@m80.k w0<T, ? extends K> w0Var, @m80.k M destination, R r11, @m80.k x00.p<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<T> b11 = w0Var.b();
        while (b11.hasNext()) {
            ?? next = b11.next();
            K a11 = w0Var.a(next);
            a0.e eVar = (Object) destination.get(a11);
            if (eVar == null && !destination.containsKey(a11)) {
                eVar = (Object) r11;
            }
            destination.put(a11, operation.invoke(eVar, next));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @yz.y0(version = "1.1")
    @m80.k
    public static final <T, K, R, M extends Map<? super K, R>> M i(@m80.k w0<T, ? extends K> w0Var, @m80.k M destination, @m80.k x00.p<? super K, ? super T, ? extends R> initialValueSelector, @m80.k x00.q<? super K, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator<T> b11 = w0Var.b();
        while (b11.hasNext()) {
            ?? next = b11.next();
            Object a11 = w0Var.a(next);
            R r11 = (Object) destination.get(a11);
            if (r11 == null && !destination.containsKey(a11)) {
                r11 = initialValueSelector.invoke(a11, next);
            }
            destination.put(a11, operation.invoke(a11, r11, next));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.1")
    @m80.k
    public static final <S, T extends S, K> Map<K, S> j(@m80.k w0<T, ? extends K> w0Var, @m80.k x00.q<? super K, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator b11 = w0Var.b();
        while (b11.hasNext()) {
            S s11 = (Object) b11.next();
            Object a11 = w0Var.a(s11);
            a0.d dVar = (Object) linkedHashMap.get(a11);
            if (!(dVar == null && !linkedHashMap.containsKey(a11))) {
                s11 = operation.invoke(a11, dVar, s11);
            }
            linkedHashMap.put(a11, s11);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.y0(version = "1.1")
    @m80.k
    public static final <S, T extends S, K, M extends Map<? super K, S>> M k(@m80.k w0<T, ? extends K> w0Var, @m80.k M destination, @m80.k x00.q<? super K, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(operation, "operation");
        Iterator b11 = w0Var.b();
        while (b11.hasNext()) {
            S s11 = (Object) b11.next();
            Object a11 = w0Var.a(s11);
            a0.d dVar = (Object) destination.get(a11);
            if (!(dVar == null && !destination.containsKey(a11))) {
                s11 = operation.invoke(a11, dVar, s11);
            }
            destination.put(a11, s11);
        }
        return destination;
    }
}
