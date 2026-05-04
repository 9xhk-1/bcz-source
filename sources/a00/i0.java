package a00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class i0 extends h0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n*L\n1#1,70:1\n*E\n"})
    public static final class a<T> implements Iterable<T>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<Iterator<T>> f1107a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.a<? extends Iterator<? extends T>> aVar) {
            this.f1107a = aVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f1107a.invoke();
        }
    }

    @o00.f
    public static final <T> Iterable<T> c0(x00.a<? extends Iterator<? extends T>> iterator) {
        kotlin.jvm.internal.g0.p(iterator, "iterator");
        return new a(iterator);
    }

    @yz.v0
    public static <T> int d0(@m80.k Iterable<? extends T> iterable, int i11) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i11;
    }

    @m80.l
    @yz.v0
    public static final <T> Integer e0(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @m80.k
    public static <T> List<T> f0(@m80.k Iterable<? extends Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList, it.next());
        }
        return arrayList;
    }

    @m80.k
    public static final <T, R> Pair<List<T>, List<R>> g0(@m80.k Iterable<? extends Pair<? extends T, ? extends R>> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        int d02 = d0(iterable, 10);
        ArrayList arrayList = new ArrayList(d02);
        ArrayList arrayList2 = new ArrayList(d02);
        for (Pair<? extends T, ? extends R> pair : iterable) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return yz.h1.a(arrayList, arrayList2);
    }
}
