package d4;

import a00.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.t3;
import k3.w;
import k3.x;
import k3.y;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import z8.d;
import z8.e;
import z8.l1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Convert.kt\ncom/baicizhan/app/biz/dakacalendar/ConvertKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,49:1\n1563#2:50\n1634#2,3:51\n37#3,2:54\n*S KotlinDebug\n*F\n+ 1 Convert.kt\ncom/baicizhan/app/biz/dakacalendar/ConvertKt\n*L\n23#1:50\n23#1:51,3\n23#1:54,2\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    @k
    public static final w a(@k z8.c cVar, @k o7.c cdnRepo) {
        x[] xVarArr;
        g0.p(cVar, "<this>");
        g0.p(cdnRepo, "cdnRepo");
        int i11 = cVar.f101198a;
        String str = cVar.f101199b;
        Integer num = cVar.f101200c;
        List<d> list = cVar.f101201d;
        if (list != null) {
            List<d> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(b((d) it.next(), cdnRepo));
            }
            xVarArr = (x[]) arrayList.toArray(new x[0]);
        } else {
            xVarArr = null;
        }
        return new w(i11, str, num, xVarArr, cVar.f101202e, cVar.f101203f);
    }

    @k
    public static final x b(@k d dVar, @k o7.c cdnRepo) {
        g0.p(dVar, "<this>");
        g0.p(cdnRepo, "cdnRepo");
        return new x(dVar.f101403a, dVar.f101404b, dVar.f101405c, dVar.f101406d, cdnRepo.a(dVar.f101407e), dVar.f101408f);
    }

    @k
    public static final y c(@k e eVar) {
        g0.p(eVar, "<this>");
        return new y(eVar.f101461a, eVar.f101462b, eVar.f101463c, eVar.f101464d, eVar.f101465e, eVar.f101466f);
    }

    @k
    public static final t3 d(@k l1 l1Var) {
        g0.p(l1Var, "<this>");
        return new t3(l1Var.f101745a, l1Var.f101746b, l1Var.f101747c, (int) l1Var.f101748d);
    }

    @k
    public static final l1 e(@k t3 t3Var) {
        g0.p(t3Var, "<this>");
        return new l1(t3Var.j(), t3Var.h(), t3Var.g(), t3Var.i());
    }
}
