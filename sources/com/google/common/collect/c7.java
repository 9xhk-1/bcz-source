package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.c7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@p5
@u3
@go.b
/* loaded from: classes7.dex */
public final class c7 {

    /* renamed from: a, reason: collision with root package name */
    public static final Collector<Object, ?, Optional<Object>> f33302a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f33303b;

    /* renamed from: c, reason: collision with root package name */
    public static final Collector<Object, ?, Object> f33304c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final int f33305c = 4;

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public Object f33306a = null;

        /* renamed from: b, reason: collision with root package name */
        public List<Object> f33307b = Collections.EMPTY_LIST;

        public void a(Object o11) {
            Preconditions.checkNotNull(o11);
            if (this.f33306a == null) {
                this.f33306a = o11;
                return;
            }
            if (this.f33307b.isEmpty()) {
                ArrayList arrayList = new ArrayList(4);
                this.f33307b = arrayList;
                arrayList.add(o11);
            } else {
                if (this.f33307b.size() >= 4) {
                    throw e(true);
                }
                this.f33307b.add(o11);
            }
        }

        public a b(a other) {
            if (this.f33306a == null) {
                return other;
            }
            if (other.f33306a != null) {
                if (this.f33307b.isEmpty()) {
                    this.f33307b = new ArrayList();
                }
                this.f33307b.add(other.f33306a);
                this.f33307b.addAll(other.f33307b);
                if (this.f33307b.size() > 4) {
                    List<Object> list = this.f33307b;
                    list.subList(4, list.size()).clear();
                    throw e(true);
                }
            }
            return this;
        }

        public Object c() {
            if (this.f33306a == null) {
                throw new NoSuchElementException();
            }
            if (this.f33307b.isEmpty()) {
                return this.f33306a;
            }
            throw e(false);
        }

        @p5
        public Optional<Object> d() {
            if (this.f33307b.isEmpty()) {
                return Optional.ofNullable(this.f33306a);
            }
            throw e(false);
        }

        public IllegalArgumentException e(boolean overflow) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("expected one element but was: <");
            sb2.append(this.f33306a);
            for (Object obj : this.f33307b) {
                sb2.append(org.junit.jupiter.api.j2.O);
                sb2.append(obj);
            }
            if (overflow) {
                sb2.append(", ...");
            }
            sb2.append(u30.u0.f91710f);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    static {
        Supplier supplier = new Supplier() { // from class: com.google.common.collect.w6
            @Override // java.util.function.Supplier
            public final Object get() {
                return new c7.a();
            }
        };
        BiConsumer biConsumer = new BiConsumer() { // from class: com.google.common.collect.x6
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((c7.a) obj).a(obj2);
            }
        };
        BinaryOperator binaryOperator = new BinaryOperator() { // from class: com.google.common.collect.y6
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((c7.a) obj).b((c7.a) obj2);
            }
        };
        Function function = new Function() { // from class: com.google.common.collect.z6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((c7.a) obj).d();
            }
        };
        Collector.Characteristics characteristics = Collector.Characteristics.UNORDERED;
        f33302a = Collector.of(supplier, biConsumer, binaryOperator, function, characteristics);
        f33303b = new Object();
        f33304c = Collector.of(new Supplier() { // from class: com.google.common.collect.w6
            @Override // java.util.function.Supplier
            public final Object get() {
                return new c7.a();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.a7
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                c7.a((c7.a) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.y6
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((c7.a) obj).b((c7.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.b7
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return c7.b((c7.a) obj);
            }
        }, characteristics);
    }

    public static /* synthetic */ void a(a aVar, Object obj) {
        if (obj == null) {
            obj = f33303b;
        }
        aVar.a(obj);
    }

    public static /* synthetic */ Object b(a aVar) {
        Object c11 = aVar.c();
        if (c11 == f33303b) {
            return null;
        }
        return c11;
    }

    public static <T> Collector<T, ?, T> c() {
        return (Collector<T, ?, T>) f33304c;
    }

    public static <T> Collector<T, ?, Optional<T>> d() {
        return (Collector<T, ?, Optional<T>>) f33302a;
    }
}
