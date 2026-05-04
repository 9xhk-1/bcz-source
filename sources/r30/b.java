package r30;

import a00.q;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import q30.m;
import w00.j;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "StreamsKt")
/* loaded from: classes8.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,731:1\n31#2:732\n*E\n"})
    public static final class a<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Stream f82912a;

        public a(Stream stream) {
            this.f82912a = stream;
        }

        @Override // q30.m
        public Iterator<T> iterator() {
            Iterator<T> it = this.f82912a.iterator();
            g0.o(it, "iterator(...)");
            return it;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,731:1\n39#2:732\n*E\n"})
    /* renamed from: r30.b$b, reason: collision with other inner class name */
    public static final class C1028b implements m<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ IntStream f82913a;

        public C1028b(IntStream intStream) {
            this.f82913a = intStream;
        }

        @Override // q30.m
        public Iterator<Integer> iterator() {
            Iterator<Integer> it = this.f82913a.iterator();
            g0.o(it, "iterator(...)");
            return it;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,731:1\n47#2:732\n*E\n"})
    public static final class c implements m<Long> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LongStream f82914a;

        public c(LongStream longStream) {
            this.f82914a = longStream;
        }

        @Override // q30.m
        public Iterator<Long> iterator() {
            Iterator<Long> it = this.f82914a.iterator();
            g0.o(it, "iterator(...)");
            return it;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,731:1\n55#2:732\n*E\n"})
    public static final class d implements m<Double> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DoubleStream f82915a;

        public d(DoubleStream doubleStream) {
            this.f82915a = doubleStream;
        }

        @Override // q30.m
        public Iterator<Double> iterator() {
            Iterator<Double> it = this.f82915a.iterator();
            g0.o(it, "iterator(...)");
            return it;
        }
    }

    @y0(version = "1.2")
    @k
    public static final m<Double> b(@k DoubleStream doubleStream) {
        g0.p(doubleStream, "<this>");
        return new d(doubleStream);
    }

    @y0(version = "1.2")
    @k
    public static final m<Integer> c(@k IntStream intStream) {
        g0.p(intStream, "<this>");
        return new C1028b(intStream);
    }

    @y0(version = "1.2")
    @k
    public static final m<Long> d(@k LongStream longStream) {
        g0.p(longStream, "<this>");
        return new c(longStream);
    }

    @y0(version = "1.2")
    @k
    public static final <T> m<T> e(@k Stream<T> stream) {
        g0.p(stream, "<this>");
        return new a(stream);
    }

    @y0(version = "1.2")
    @k
    public static final <T> Stream<T> f(@k final m<? extends T> mVar) {
        g0.p(mVar, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: r30.a
            @Override // java.util.function.Supplier
            public final Object get() {
                Spliterator g11;
                g11 = b.g(m.this);
                return g11;
            }
        }, 16, false);
        g0.o(stream, "stream(...)");
        return stream;
    }

    public static final Spliterator g(m mVar) {
        return Spliterators.spliteratorUnknownSize(mVar.iterator(), 16);
    }

    @y0(version = "1.2")
    @k
    public static final List<Double> h(@k DoubleStream doubleStream) {
        g0.p(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        g0.o(array, "toArray(...)");
        return q.p(array);
    }

    @y0(version = "1.2")
    @k
    public static final List<Integer> i(@k IntStream intStream) {
        g0.p(intStream, "<this>");
        int[] array = intStream.toArray();
        g0.o(array, "toArray(...)");
        return q.r(array);
    }

    @y0(version = "1.2")
    @k
    public static final List<Long> j(@k LongStream longStream) {
        g0.p(longStream, "<this>");
        long[] array = longStream.toArray();
        g0.o(array, "toArray(...)");
        return q.s(array);
    }

    @y0(version = "1.2")
    @k
    public static final <T> List<T> k(@k Stream<T> stream) {
        g0.p(stream, "<this>");
        Object collect = stream.collect(Collectors.toList());
        g0.o(collect, "collect(...)");
        return (List) collect;
    }
}
