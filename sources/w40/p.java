package w40;

import a00.h0;
import a00.i0;
import a00.m0;
import a00.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Parser.kt\nkotlinx/datetime/internal/format/parser/ParserKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n1833#2,8:228\n1563#2:236\n1634#2,3:237\n1374#2:240\n1460#2,2:241\n1462#2,3:244\n2746#2,3:247\n1563#2:250\n1634#2,3:251\n1#3:243\n*S KotlinDebug\n*F\n+ 1 Parser.kt\nkotlinx/datetime/internal/format/parser/ParserKt\n*L\n124#1:228,8\n49#1:236\n49#1:237,3\n75#1:240\n75#1:241,2\n75#1:244,3\n92#1:247,3\n99#1:250\n99#1:251,3\n*E\n"})
/* loaded from: classes8.dex */
public final class p {
    @m80.k
    public static final <T> t<T> c(@m80.k List<? extends t<? super T>> list) {
        g0.p(list, "<this>");
        t tVar = new t(h0.J(), h0.J());
        if (!list.isEmpty()) {
            ListIterator<? extends t<? super T>> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                tVar = d(listIterator.previous(), tVar);
            }
        }
        return e(tVar, h0.J());
    }

    public static final <T> t<T> d(t<? super T> tVar, t<? super T> tVar2) {
        if (tVar.a().isEmpty()) {
            return new t<>(r0.I4(tVar.b(), tVar2.b()), tVar2.a());
        }
        List<q<? super T>> b11 = tVar.b();
        List<t<? super T>> a11 = tVar.a();
        ArrayList arrayList = new ArrayList(i0.d0(a11, 10));
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            arrayList.add(d((t) it.next(), tVar2));
        }
        return new t<>(b11, arrayList);
    }

    public static final <T> t<T> e(t<? super T> tVar, List<e0<T>> list) {
        List l11;
        ArrayList arrayList = new ArrayList();
        List d62 = r0.d6(list);
        List list2 = null;
        for (q<? super T> qVar : tVar.b()) {
            if (qVar instanceof k) {
                if (list2 != null) {
                    list2.addAll(((k) qVar).h());
                } else {
                    list2 = r0.d6(((k) qVar).h());
                }
            } else if (qVar instanceof e0) {
                d62.add(qVar);
            } else {
                if (list2 != null) {
                    arrayList.add(new k(list2));
                    list2 = null;
                }
                arrayList.add(qVar);
            }
        }
        List<t<? super T>> a11 = tVar.a();
        List arrayList2 = new ArrayList();
        Iterator<T> it = a11.iterator();
        while (it.hasNext()) {
            t e11 = e((t) it.next(), d62);
            if (e11.b().isEmpty()) {
                List a12 = e11.a();
                if (a12.isEmpty()) {
                    a12 = a00.g0.l(e11);
                }
                l11 = a12;
            } else {
                l11 = a00.g0.l(e11);
            }
            m0.s0(arrayList2, l11);
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = a00.g0.l(new t(d62, h0.J()));
        }
        List list3 = arrayList2;
        if (list2 == null) {
            return new t<>(arrayList, list3);
        }
        List<t> list4 = list3;
        if (!(list4 instanceof Collection) || !list4.isEmpty()) {
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                q qVar2 = (q) r0.L2(((t) it2.next()).b());
                if (qVar2 != null && (qVar2 instanceof k)) {
                    ArrayList arrayList3 = new ArrayList(i0.d0(list4, 10));
                    for (t tVar2 : list4) {
                        q qVar3 = (q) r0.L2(tVar2.b());
                        arrayList3.add(qVar3 instanceof k ? new t(r0.I4(a00.g0.l(new k(r0.I4(list2, ((k) qVar3).h()))), r0.g2(tVar2.b(), 1)), tVar2.a()) : qVar3 == null ? new t(a00.g0.l(new k(list2)), tVar2.a()) : new t(r0.I4(a00.g0.l(new k(list2)), tVar2.b()), tVar2.a()));
                    }
                    return new t<>(arrayList, arrayList3);
                }
            }
        }
        arrayList.add(new k(list2));
        return new t<>(arrayList, list3);
    }

    public static final String f(List<l> list) {
        if (list.size() != 1) {
            String sb2 = ((StringBuilder) r0.p3(list, new StringBuilder(list.size() * 33), j2.O, "Errors: ", null, 0, null, new x00.l() { // from class: w40.o
                @Override // x00.l
                public final Object invoke(Object obj) {
                    CharSequence g11;
                    g11 = p.g((l) obj);
                    return g11;
                }
            }, 56, null)).toString();
            g0.o(sb2, "toString(...)");
            return sb2;
        }
        return "Position " + list.get(0).b() + ": " + list.get(0).a().invoke();
    }

    public static final CharSequence g(l it) {
        g0.p(it, "it");
        return "position " + it.b() + ": '" + it.a().invoke() + '\'';
    }
}
