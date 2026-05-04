package ix;

import io.ktor.http.RangeUnits;
import ix.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRangesSpecifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RangesSpecifier.kt\nio/ktor/http/RangesSpecifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1#2:73\n2632#3,3:74\n2341#3,14:77\n1971#3,14:91\n*S KotlinDebug\n*F\n+ 1 RangesSpecifier.kt\nio/ktor/http/RangesSpecifier\n*L\n24#1:74,3\n62#1:77,14\n63#1:91,14\n*E\n"})
/* loaded from: classes8.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f63058a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<i> f63059b;

    /* JADX WARN: Multi-variable type inference failed */
    public y1(@m80.k String unit, @m80.k List<? extends i> ranges) {
        kotlin.jvm.internal.g0.p(unit, "unit");
        kotlin.jvm.internal.g0.p(ranges, "ranges");
        this.f63058a = unit;
        this.f63059b = ranges;
        if (ranges.isEmpty()) {
            throw new IllegalArgumentException("It should be at least one range");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ y1 e(y1 y1Var, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = y1Var.f63058a;
        }
        if ((i11 & 2) != 0) {
            list = y1Var.f63059b;
        }
        return y1Var.d(str, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean i(y1 y1Var, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new x00.l() { // from class: ix.x1
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    boolean j11;
                    j11 = y1.j((String) obj2);
                    return Boolean.valueOf(j11);
                }
            };
        }
        return y1Var.h(lVar);
    }

    public static final boolean j(String it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return kotlin.jvm.internal.g0.g(it, RangeUnits.Bytes.getUnitToken());
    }

    public static /* synthetic */ List m(y1 y1Var, long j11, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 50;
        }
        return y1Var.l(j11, i11);
    }

    @m80.k
    public final String b() {
        return this.f63058a;
    }

    @m80.k
    public final List<i> c() {
        return this.f63059b;
    }

    @m80.k
    public final y1 d(@m80.k String unit, @m80.k List<? extends i> ranges) {
        kotlin.jvm.internal.g0.p(unit, "unit");
        kotlin.jvm.internal.g0.p(ranges, "ranges");
        return new y1(unit, ranges);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return kotlin.jvm.internal.g0.g(this.f63058a, y1Var.f63058a) && kotlin.jvm.internal.g0.g(this.f63059b, y1Var.f63059b);
    }

    @m80.k
    public final List<i> f() {
        return this.f63059b;
    }

    @m80.k
    public final String g() {
        return this.f63058a;
    }

    public final boolean h(@m80.k x00.l<? super String, Boolean> rangeUnitPredicate) {
        kotlin.jvm.internal.g0.p(rangeUnitPredicate, "rangeUnitPredicate");
        if (!rangeUnitPredicate.invoke(this.f63058a).booleanValue()) {
            return false;
        }
        List<i> list = this.f63059b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (i iVar : list) {
            if (iVar instanceof i.a) {
                i.a aVar = (i.a) iVar;
                if (aVar.e() < 0 || aVar.f() < aVar.e()) {
                    return false;
                }
            } else if (iVar instanceof i.c) {
                if (((i.c) iVar).d() < 0) {
                    return false;
                }
            } else {
                if (!(iVar instanceof i.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (((i.b) iVar).d() < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.f63058a.hashCode() * 31) + this.f63059b.hashCode();
    }

    @m80.k
    public final List<g10.o> k(long j11) {
        return w1.a(w1.c(this.f63059b, j11));
    }

    @m80.k
    public final List<g10.o> l(long j11, int i11) {
        return this.f63059b.size() > i11 ? o(n(j11)) : k(j11);
    }

    @m80.l
    public final g10.o n(long j11) {
        Object next;
        List<g10.o> c11 = w1.c(this.f63059b, j11);
        Object obj = null;
        if (c11.isEmpty()) {
            return null;
        }
        List<g10.o> list = c11;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long d11 = ((g10.o) next).d();
                do {
                    Object next2 = it.next();
                    long d12 = ((g10.o) next2).d();
                    if (d11 > d12) {
                        next = next2;
                        d11 = d12;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        kotlin.jvm.internal.g0.m(next);
        long d13 = ((g10.o) next).d();
        Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            obj = it2.next();
            if (it2.hasNext()) {
                long f11 = ((g10.o) obj).f();
                do {
                    Object next3 = it2.next();
                    long f12 = ((g10.o) next3).f();
                    if (f11 < f12) {
                        obj = next3;
                        f11 = f12;
                    }
                } while (it2.hasNext());
            }
        }
        kotlin.jvm.internal.g0.m(obj);
        return new g10.o(d13, g10.u.C(((g10.o) obj).f(), j11 - 1));
    }

    public final <T> List<T> o(T t11) {
        return t11 == null ? a00.h0.J() : a00.g0.l(t11);
    }

    @m80.k
    public String toString() {
        return a00.r0.r3(this.f63059b, ",", this.f63058a + '=', null, 0, null, null, 60, null);
    }

    public /* synthetic */ y1(String str, List list, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? RangeUnits.Bytes.getUnitToken() : str, (List<? extends i>) list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y1(@m80.k RangeUnits unit, @m80.k List<? extends i> ranges) {
        this(unit.getUnitToken(), ranges);
        kotlin.jvm.internal.g0.p(unit, "unit");
        kotlin.jvm.internal.g0.p(ranges, "ranges");
    }
}
