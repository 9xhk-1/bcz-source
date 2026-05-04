package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.f9;
import com.google.common.collect.r9;
import com.google.common.collect.s9;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@p5
@u3
@go.b
/* loaded from: classes7.dex */
public final class r9 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<R, C, V> {

        /* renamed from: a, reason: collision with root package name */
        public final List<c<R, C, V>> f33817a;

        /* renamed from: b, reason: collision with root package name */
        public final f9<R, C, c<R, C, V>> f33818b;

        public b() {
            this.f33817a = new ArrayList();
            this.f33818b = HashBasedTable.create();
        }

        public b<R, C, V> a(b<R, C, V> other, BinaryOperator<V> merger) {
            for (c<R, C, V> cVar : other.f33817a) {
                b(cVar.b(), cVar.a(), cVar.getValue(), merger);
            }
            return this;
        }

        public void b(R row, C column, V value, BinaryOperator<V> merger) {
            c<R, C, V> cVar = this.f33818b.get(row, column);
            if (cVar != null) {
                cVar.c(value, merger);
                return;
            }
            c<R, C, V> cVar2 = new c<>(row, column, value);
            this.f33817a.add(cVar2);
            this.f33818b.put(row, column, cVar2);
        }

        public ImmutableTable<R, C, V> c() {
            return ImmutableTable.copyOf(this.f33817a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @p5
    public static final class c<R, C, V> extends s9.b<R, C, V> {

        /* renamed from: a, reason: collision with root package name */
        public final R f33819a;

        /* renamed from: b, reason: collision with root package name */
        public final C f33820b;

        /* renamed from: c, reason: collision with root package name */
        public V f33821c;

        public c(R r11, C c11, V v11) {
            this.f33819a = (R) Preconditions.checkNotNull(r11, "row");
            this.f33820b = (C) Preconditions.checkNotNull(c11, "column");
            this.f33821c = (V) Preconditions.checkNotNull(v11, "value");
        }

        @Override // com.google.common.collect.f9.a
        public C a() {
            return this.f33820b;
        }

        @Override // com.google.common.collect.f9.a
        public R b() {
            return this.f33819a;
        }

        public void c(V v11, BinaryOperator<V> binaryOperator) {
            Preconditions.checkNotNull(v11, "value");
            this.f33821c = (V) Preconditions.checkNotNull(binaryOperator.apply(this.f33821c, v11), "mergeFunction.apply");
        }

        @Override // com.google.common.collect.f9.a
        public V getValue() {
            return this.f33821c;
        }
    }

    public static /* synthetic */ Object b(Object obj, Object obj2) {
        throw new IllegalStateException("Conflicting values " + obj + " and " + obj2);
    }

    public static /* synthetic */ b f() {
        return new b();
    }

    public static /* synthetic */ f9 g(BinaryOperator binaryOperator, f9 f9Var, f9 f9Var2) {
        for (f9.a aVar : f9Var2.cellSet()) {
            i(f9Var, aVar.b(), aVar.a(), aVar.getValue(), binaryOperator);
        }
        return f9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, C, V> void i(f9<R, C, V> table, @t7 R row, @t7 C column, V value, BinaryOperator<V> mergeFunction) {
        Preconditions.checkNotNull(value);
        V v11 = table.get(row, column);
        if (v11 == null) {
            table.put(row, column, value);
            return;
        }
        Object apply = mergeFunction.apply(v11, value);
        if (apply == null) {
            table.remove(row, column);
        } else {
            table.put(row, column, apply);
        }
    }

    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> j(final Function<? super T, ? extends R> rowFunction, final Function<? super T, ? extends C> columnFunction, final Function<? super T, ? extends V> valueFunction) {
        Preconditions.checkNotNull(rowFunction, "rowFunction");
        Preconditions.checkNotNull(columnFunction, "columnFunction");
        Preconditions.checkNotNull(valueFunction, "valueFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.o9
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableTable.a();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.p9
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableTable.a) obj).g(rowFunction.apply(obj2), columnFunction.apply(obj2), valueFunction.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.q9
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableTable.a) obj).c((ImmutableTable.a) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.h9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableTable.a) obj).a();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> k(final Function<? super T, ? extends R> rowFunction, final Function<? super T, ? extends C> columnFunction, final Function<? super T, ? extends V> valueFunction, final BinaryOperator<V> mergeFunction) {
        Preconditions.checkNotNull(rowFunction, "rowFunction");
        Preconditions.checkNotNull(columnFunction, "columnFunction");
        Preconditions.checkNotNull(valueFunction, "valueFunction");
        Preconditions.checkNotNull(mergeFunction, "mergeFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.k9
            @Override // java.util.function.Supplier
            public final Object get() {
                return r9.f();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.l9
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                r9.b bVar = (r9.b) obj;
                bVar.b(rowFunction.apply(obj2), columnFunction.apply(obj2), valueFunction.apply(obj2), mergeFunction);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.m9
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                r9.b a11;
                a11 = ((r9.b) obj).a((r9.b) obj2, mergeFunction);
                return a11;
            }
        }, new Function() { // from class: com.google.common.collect.n9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ImmutableTable c11;
                c11 = ((r9.b) obj).c();
                return c11;
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, R, C, V, I extends f9<R, C, V>> Collector<T, ?, I> l(final Function<? super T, ? extends R> rowFunction, final Function<? super T, ? extends C> columnFunction, final Function<? super T, ? extends V> valueFunction, final BinaryOperator<V> mergeFunction, Supplier<I> tableSupplier) {
        Preconditions.checkNotNull(rowFunction);
        Preconditions.checkNotNull(columnFunction);
        Preconditions.checkNotNull(valueFunction);
        Preconditions.checkNotNull(mergeFunction);
        Preconditions.checkNotNull(tableSupplier);
        return Collector.of(tableSupplier, new BiConsumer() { // from class: com.google.common.collect.i9
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                f9 f9Var = (f9) obj;
                r9.i(f9Var, rowFunction.apply(obj2), columnFunction.apply(obj2), valueFunction.apply(obj2), mergeFunction);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.j9
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return r9.g(mergeFunction, (f9) obj, (f9) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, R, C, V, I extends f9<R, C, V>> Collector<T, ?, I> m(Function<? super T, ? extends R> rowFunction, Function<? super T, ? extends C> columnFunction, Function<? super T, ? extends V> valueFunction, Supplier<I> tableSupplier) {
        return l(rowFunction, columnFunction, valueFunction, new BinaryOperator() { // from class: com.google.common.collect.g9
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return r9.b(obj, obj2);
            }
        }, tableSupplier);
    }
}
