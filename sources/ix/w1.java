package ix;

import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import ix.i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRanges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ranges.kt\nio/ktor/http/RangesKt\n+ 2 Text.kt\nio/ktor/util/TextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n37#2,3:120\n37#2,3:126\n1557#3:123\n1628#3,2:124\n1630#3:129\n1557#3:130\n1628#3,3:131\n827#3:134\n855#3,2:135\n1053#3:137\n1797#3,3:138\n*S KotlinDebug\n*F\n+ 1 Ranges.kt\nio/ktor/http/RangesKt\n*L\n61#1:120,3\n66#1:126,3\n62#1:123\n62#1:124,2\n62#1:129\n85#1:130\n85#1:131,3\n91#1:134\n91#1:135,2\n95#1:137\n95#1:138,3\n*E\n"})
/* loaded from: classes8.dex */
public final class w1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 Ranges.kt\nio/ktor/http/RangesKt\n*L\n1#1,102:1\n95#2:103\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((g10.o) t11).d()), Long.valueOf(((g10.o) t12).d()));
        }
    }

    @m80.k
    public static final List<g10.o> a(@m80.k List<g10.o> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        List<g10.o> z52 = a00.r0.z5(list, new a());
        ArrayList arrayList = new ArrayList(list.size());
        for (g10.o oVar : z52) {
            if (arrayList.isEmpty()) {
                arrayList.add(oVar);
            } else if (((g10.o) a00.r0.u3(arrayList)).f() < oVar.d() - 1) {
                arrayList.add(oVar);
            } else {
                g10.o oVar2 = (g10.o) a00.r0.u3(arrayList);
                arrayList.set(a00.h0.L(arrayList), new g10.o(oVar2.d(), Math.max(oVar2.f(), oVar.f())));
            }
        }
        g10.o[] oVarArr = new g10.o[list.size()];
        Iterator it = arrayList.iterator();
        kotlin.jvm.internal.g0.o(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.g0.o(next, "next(...)");
            g10.o oVar3 = (g10.o) next;
            int size = list.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                if (xy.o1.a(oVar3, list.get(i11))) {
                    oVarArr[i11] = oVar3;
                    break;
                }
                i11++;
            }
        }
        return a00.a0.lb(oVarArr);
    }

    @m80.l
    public static final y1 b(@m80.k String rangeSpec) {
        int J3;
        Pair a11;
        Object aVar;
        kotlin.jvm.internal.g0.p(rangeSpec, "rangeSpec");
        try {
            J3 = u30.k0.J3(rangeSpec, ContainerUtils.KEY_VALUE_DELIMITER, 0, false, 6, null);
        } catch (Throwable unused) {
        }
        if (J3 == -1) {
            return null;
        }
        String substring = rangeSpec.substring(0, J3);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        String substring2 = rangeSpec.substring(J3 + 1);
        kotlin.jvm.internal.g0.o(substring2, "substring(...)");
        Pair a12 = yz.h1.a(substring, substring2);
        String str = (String) a12.component1();
        List<String> n52 = u30.k0.n5((String) a12.component2(), new char[]{','}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(a00.i0.d0(n52, 10));
        for (String str2 : n52) {
            if (u30.f0.J2(str2, Constants.ACCEPT_TIME_SEPARATOR_SERVER, false, 2, null)) {
                aVar = new i.b(Long.parseLong(u30.k0.x4(str2, Constants.ACCEPT_TIME_SEPARATOR_SERVER)));
            } else {
                int J32 = u30.k0.J3(str2, Constants.ACCEPT_TIME_SEPARATOR_SERVER, 0, false, 6, null);
                if (J32 == -1) {
                    a11 = yz.h1.a("", "");
                } else {
                    String substring3 = str2.substring(0, J32);
                    kotlin.jvm.internal.g0.o(substring3, "substring(...)");
                    String substring4 = str2.substring(J32 + 1);
                    kotlin.jvm.internal.g0.o(substring4, "substring(...)");
                    a11 = yz.h1.a(substring3, substring4);
                }
                String str3 = (String) a11.component1();
                String str4 = (String) a11.component2();
                aVar = str4.length() > 0 ? new i.a(Long.parseLong(str3), Long.parseLong(str4)) : new i.c(Long.parseLong(str3));
            }
            arrayList.add(aVar);
        }
        if (!arrayList.isEmpty() && str.length() != 0) {
            y1 y1Var = new y1(str, arrayList);
            if (y1.i(y1Var, null, 1, null)) {
                return y1Var;
            }
        }
        return null;
    }

    @m80.k
    public static final List<g10.o> c(@m80.k List<? extends i> list, long j11) {
        g10.o f22;
        kotlin.jvm.internal.g0.p(list, "<this>");
        List<? extends i> list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        for (i iVar : list2) {
            if (iVar instanceof i.a) {
                i.a aVar = (i.a) iVar;
                f22 = new g10.o(aVar.e(), g10.u.C(aVar.f(), j11 - 1));
            } else if (iVar instanceof i.c) {
                f22 = g10.u.f2(((i.c) iVar).d(), j11);
            } else {
                if (!(iVar instanceof i.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                f22 = g10.u.f2(g10.u.v(j11 - ((i.b) iVar).d(), 0L), j11);
            }
            arrayList.add(f22);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((g10.o) obj).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
