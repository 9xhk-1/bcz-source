package e30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n105#1,9:134\n105#1,9:143\n105#1,9:152\n774#2:161\n865#2,2:162\n*S KotlinDebug\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes\n*L\n74#1:134,9\n78#1:143,9\n82#1:152,9\n99#1:161\n99#1:162,2\n*E\n"})
/* loaded from: classes8.dex */
public final class r1 extends l30.e<p1<?>, p1<?>> implements Iterable<p1<?>>, y00.a {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f48652b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final r1 f48653c = new r1((List<? extends p1<?>>) a00.h0.J());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public static final class a extends l30.z<p1<?>, p1<?>> {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @Override // l30.z
        public int b(@m80.k ConcurrentHashMap<String, Integer> concurrentHashMap, @m80.k String key, @m80.k x00.l<? super String, Integer> compute) {
            int intValue;
            kotlin.jvm.internal.g0.p(concurrentHashMap, "<this>");
            kotlin.jvm.internal.g0.p(key, "key");
            kotlin.jvm.internal.g0.p(compute, "compute");
            Integer num = concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(key);
                    if (num2 != null) {
                        intValue = num2.intValue();
                    } else {
                        Integer invoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(invoke.intValue()));
                        intValue = invoke.intValue();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return intValue;
        }

        @m80.k
        public final r1 i(@m80.k List<? extends p1<?>> attributes) {
            kotlin.jvm.internal.g0.p(attributes, "attributes");
            return attributes.isEmpty() ? j() : new r1(attributes, null);
        }

        @m80.k
        public final r1 j() {
            return r1.f48653c;
        }

        public a() {
        }
    }

    public /* synthetic */ r1(List list, kotlin.jvm.internal.v vVar) {
        this((List<? extends p1<?>>) list);
    }

    @Override // l30.a
    @m80.k
    public l30.z<p1<?>, p1<?>> b() {
        return f48652b;
    }

    @m80.k
    public final r1 h(@m80.k r1 other) {
        kotlin.jvm.internal.g0.p(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f48652b.g().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            p1<?> p1Var = a().get(intValue);
            p1<?> p1Var2 = other.a().get(intValue);
            o30.a.a(arrayList, p1Var == null ? p1Var2 != null ? p1Var2.a(p1Var) : null : p1Var.a(p1Var2));
        }
        return f48652b.i(arrayList);
    }

    public final boolean j(@m80.k p1<?> attribute) {
        kotlin.jvm.internal.g0.p(attribute, "attribute");
        return a().get(f48652b.d(attribute.b())) != null;
    }

    @m80.k
    public final r1 k(@m80.k r1 other) {
        kotlin.jvm.internal.g0.p(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = f48652b.g().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            p1<?> p1Var = a().get(intValue);
            p1<?> p1Var2 = other.a().get(intValue);
            o30.a.a(arrayList, p1Var == null ? p1Var2 != null ? p1Var2.c(p1Var) : null : p1Var.c(p1Var2));
        }
        return f48652b.i(arrayList);
    }

    @m80.k
    public final r1 l(@m80.k p1<?> attribute) {
        kotlin.jvm.internal.g0.p(attribute, "attribute");
        if (j(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new r1(attribute);
        }
        return f48652b.i(a00.r0.J4(a00.r0.a6(this), attribute));
    }

    @m80.k
    public final r1 m(@m80.k p1<?> attribute) {
        kotlin.jvm.internal.g0.p(attribute, "attribute");
        if (!isEmpty()) {
            l30.c<p1<?>> a11 = a();
            ArrayList arrayList = new ArrayList();
            for (p1<?> p1Var : a11) {
                if (!kotlin.jvm.internal.g0.g(p1Var, attribute)) {
                    arrayList.add(p1Var);
                }
            }
            if (arrayList.size() != a().a()) {
                return f48652b.i(arrayList);
            }
        }
        return this;
    }

    public r1(List<? extends p1<?>> list) {
        for (p1<?> p1Var : list) {
            d(p1Var.b(), p1Var);
        }
    }

    public r1(p1<?> p1Var) {
        this((List<? extends p1<?>>) a00.g0.l(p1Var));
    }
}
