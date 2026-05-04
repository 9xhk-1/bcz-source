package lx;

import a00.a0;
import a00.h0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import lx.c;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c<T> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f71645b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b<T> f71646a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAsciiCharTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsciiCharTree.kt\nio/ktor/http/cio/internals/AsciiCharTree$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,73:1\n1971#2,14:74\n1755#2,3:88\n1485#2:91\n1510#2,3:92\n1513#2,3:102\n774#2:106\n865#2,2:107\n774#2:109\n865#2,2:110\n381#3,7:95\n216#4:105\n217#4:112\n*S KotlinDebug\n*F\n+ 1 AsciiCharTree.kt\nio/ktor/http/cio/internals/AsciiCharTree$Companion\n*L\n44#1:74,14\n47#1:88,3\n63#1:91\n63#1:92,3\n63#1:102,3\n66#1:106\n66#1:107,2\n68#1:109\n68#1:110,2\n63#1:95,7\n63#1:105\n63#1:112\n*E\n"})
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static final int f(CharSequence it) {
            g0.p(it, "it");
            return it.length();
        }

        public static final char g(CharSequence s11, int i11) {
            g0.p(s11, "s");
            return s11.charAt(i11);
        }

        @m80.k
        public final <T extends CharSequence> c<T> c(@m80.k List<? extends T> from) {
            g0.p(from, "from");
            return d(from, new l() { // from class: lx.a
                @Override // x00.l
                public final Object invoke(Object obj) {
                    int f11;
                    f11 = c.a.f((CharSequence) obj);
                    return Integer.valueOf(f11);
                }
            }, new p() { // from class: lx.b
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    char g11;
                    g11 = c.a.g((CharSequence) obj, ((Integer) obj2).intValue());
                    return Character.valueOf(g11);
                }
            });
        }

        @m80.k
        public final <T> c<T> d(@m80.k List<? extends T> from, @m80.k l<? super T, Integer> length, @m80.k p<? super T, ? super Integer, Character> charAt) {
            a0.e eVar;
            g0.p(from, "from");
            g0.p(length, "length");
            g0.p(charAt, "charAt");
            List<? extends T> list = from;
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                T next = it.next();
                if (it.hasNext()) {
                    Integer invoke = length.invoke(next);
                    do {
                        T next2 = it.next();
                        Integer invoke2 = length.invoke(next2);
                        if (invoke.compareTo(invoke2) < 0) {
                            next = next2;
                            invoke = invoke2;
                        }
                    } while (it.hasNext());
                }
                eVar = next;
            } else {
                eVar = null;
            }
            if (eVar == null) {
                throw new NoSuchElementException("Unable to build char tree from an empty list");
            }
            int intValue = length.invoke(eVar).intValue();
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (length.invoke(it2.next()).intValue() == 0) {
                        throw new IllegalArgumentException("There should be no empty entries");
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            e(arrayList, from, intValue, 0, length, charAt);
            arrayList.trimToSize();
            return new c<>(new b((char) 0, h0.J(), arrayList));
        }

        public final <T> void e(List<b<T>> list, List<? extends T> list2, int i11, int i12, l<? super T, Integer> lVar, p<? super T, ? super Integer, Character> pVar) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (T t11 : list2) {
                Character invoke = pVar.invoke(t11, Integer.valueOf(i12));
                invoke.charValue();
                Object obj = linkedHashMap.get(invoke);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(invoke, obj);
                }
                ((List) obj).add(t11);
            }
            p<? super T, ? super Integer, Character> pVar2 = pVar;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                char charValue = ((Character) entry.getKey()).charValue();
                List list3 = (List) entry.getValue();
                int i13 = i12 + 1;
                ArrayList arrayList = new ArrayList();
                a aVar = c.f71645b;
                List list4 = list3;
                ArrayList arrayList2 = new ArrayList();
                for (T t12 : list4) {
                    if (lVar.invoke(t12).intValue() > i13) {
                        arrayList2.add(t12);
                    }
                }
                aVar.e(arrayList, arrayList2, i11, i13, lVar, pVar2);
                arrayList.trimToSize();
                ArrayList arrayList3 = new ArrayList();
                for (T t13 : list4) {
                    if (lVar.invoke(t13).intValue() == i13) {
                        arrayList3.add(t13);
                    }
                }
                list.add(new b<>(charValue, arrayList3, arrayList));
                pVar2 = pVar;
            }
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAsciiCharTree.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsciiCharTree.kt\nio/ktor/http/cio/internals/AsciiCharTree$Node\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n669#2,11:74\n*S KotlinDebug\n*F\n+ 1 AsciiCharTree.kt\nio/ktor/http/cio/internals/AsciiCharTree$Node\n*L\n9#1:74,11\n*E\n"})
    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final char f71647a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<T> f71648b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<b<T>> f71649c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final b<T>[] f71650d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(char c11, @m80.k List<? extends T> exact, @m80.k List<b<T>> children) {
            g0.p(exact, "exact");
            g0.p(children, "children");
            this.f71647a = c11;
            this.f71648b = exact;
            this.f71649c = children;
            b<T>[] bVarArr = new b[256];
            for (int i11 = 0; i11 < 256; i11++) {
                Iterator<T> it = this.f71649c.iterator();
                b<T> bVar = null;
                boolean z11 = false;
                b<T> bVar2 = null;
                while (true) {
                    if (it.hasNext()) {
                        T next = it.next();
                        if (((b) next).f71647a == i11) {
                            if (z11) {
                                break;
                            }
                            z11 = true;
                            bVar2 = next;
                        }
                    } else if (z11) {
                        bVar = bVar2;
                    }
                }
                bVarArr[i11] = bVar;
            }
            this.f71650d = bVarArr;
        }

        @m80.k
        public final b<T>[] a() {
            return this.f71650d;
        }

        public final char b() {
            return this.f71647a;
        }

        @m80.k
        public final List<b<T>> c() {
            return this.f71649c;
        }

        @m80.k
        public final List<T> d() {
            return this.f71648b;
        }
    }

    public c(@m80.k b<T> root) {
        g0.p(root, "root");
        this.f71646a = root;
    }

    public static /* synthetic */ List c(c cVar, CharSequence charSequence, int i11, int i12, boolean z11, p pVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = charSequence.length();
        }
        if ((i13 & 8) != 0) {
            z11 = false;
        }
        return cVar.b(charSequence, i11, i12, z11, pVar);
    }

    @m80.k
    public final b<T> a() {
        return this.f71646a;
    }

    @m80.k
    public final List<T> b(@m80.k CharSequence sequence, int i11, int i12, boolean z11, @m80.k p<? super Character, ? super Integer, Boolean> stopPredicate) {
        g0.p(sequence, "sequence");
        g0.p(stopPredicate, "stopPredicate");
        if (sequence.length() == 0) {
            throw new IllegalArgumentException("Couldn't search in char tree for empty string");
        }
        b<T> bVar = this.f71646a;
        while (i11 < i12) {
            char charAt = sequence.charAt(i11);
            if (stopPredicate.invoke(Character.valueOf(charAt), Integer.valueOf(charAt)).booleanValue()) {
                break;
            }
            b<T> bVar2 = bVar.a()[charAt];
            if (bVar2 == null) {
                bVar = z11 ? bVar.a()[Character.toLowerCase(charAt)] : null;
                if (bVar == null) {
                    return h0.J();
                }
            } else {
                bVar = bVar2;
            }
            i11++;
        }
        return bVar.d();
    }
}
