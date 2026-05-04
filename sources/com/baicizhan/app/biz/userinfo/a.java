package com.baicizhan.app.biz.userinfo;

import a00.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.j0;
import k3.k1;
import k3.l2;
import k3.m2;
import k3.n2;
import k3.o2;
import k3.p2;
import k3.q2;
import k3.r2;
import k3.v3;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import v8.i;
import v8.l;
import v8.m;
import v8.n;
import v8.o;
import v8.p;
import z8.c1;
import z8.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDataConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataConvert.kt\ncom/baicizhan/app/biz/userinfo/DataConvertKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,142:1\n1#2:143\n1563#3:144\n1634#3,3:145\n1563#3:158\n1634#3,3:159\n1563#3:164\n1634#3,3:165\n37#4,2:148\n37#4,2:150\n37#4,2:152\n37#4,2:154\n37#4,2:156\n37#4,2:162\n37#4,2:168\n*S KotlinDebug\n*F\n+ 1 DataConvert.kt\ncom/baicizhan/app/biz/userinfo/DataConvertKt\n*L\n91#1:144\n91#1:145,3\n96#1:158\n96#1:159,3\n133#1:164\n133#1:165,3\n91#1:148,2\n92#1:150,2\n93#1:152,2\n94#1:154,2\n95#1:156,2\n96#1:162,2\n133#1:168,2\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    @k
    public static final s7.a a(@k q qVar) {
        g0.p(qVar, "<this>");
        Integer num = qVar.f101889a;
        g0.m(num);
        int intValue = num.intValue();
        String str = qVar.f101890b;
        g0.m(str);
        Long l11 = qVar.f101891c;
        return new s7.a(intValue, str, Integer.valueOf(l11 != null ? (int) l11.longValue() : 0), qVar.f101892d, qVar.f101893e, qVar.f101894f, qVar.f101895g);
    }

    @k
    public static final j0 b(@k s7.a aVar) {
        g0.p(aVar, "<this>");
        return new j0(aVar.m(), aVar.n(), aVar.o(), aVar.j(), aVar.k(), aVar.l(), aVar.p());
    }

    @k
    public static final k1 c(@k i iVar) {
        g0.p(iVar, "<this>");
        String str = iVar.f93303c;
        if (str == null) {
            str = "";
        }
        String str2 = iVar.f93302b;
        return new k1(str, str2 != null ? str2 : "", iVar.f93301a);
    }

    @k
    public static final p2 d(@k o oVar) {
        g0.p(oVar, "<this>");
        return new p2(oVar.f93351a, oVar.f93352b, oVar.f93353c, oVar.f93354d);
    }

    @k
    public static final r2 e(@k v8.q qVar) {
        p2[] p2VarArr;
        g0.p(qVar, "<this>");
        boolean z11 = qVar.f93379a;
        int i11 = qVar.f93380b;
        int i12 = qVar.f93381c;
        int i13 = qVar.f93382d;
        List<o> list = qVar.f93383e;
        p2[] p2VarArr2 = null;
        if (list != null) {
            List<o> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(d((o) it.next()));
            }
            p2VarArr = (p2[]) arrayList.toArray(new p2[0]);
        } else {
            p2VarArr = null;
        }
        List<String> list3 = qVar.f93384f;
        String[] strArr = list3 != null ? (String[]) list3.toArray(new String[0]) : null;
        List<String> list4 = qVar.f93385g;
        String[] strArr2 = list4 != null ? (String[]) list4.toArray(new String[0]) : null;
        List<String> list5 = qVar.f93386h;
        String[] strArr3 = list5 != null ? (String[]) list5.toArray(new String[0]) : null;
        List<String> list6 = qVar.f93387i;
        String[] strArr4 = list6 != null ? (String[]) list6.toArray(new String[0]) : null;
        List<o> list7 = qVar.f93388j;
        if (list7 != null) {
            List<o> list8 = list7;
            ArrayList arrayList2 = new ArrayList(i0.d0(list8, 10));
            Iterator<T> it2 = list8.iterator();
            while (it2.hasNext()) {
                arrayList2.add(d((o) it2.next()));
            }
            p2VarArr2 = (p2[]) arrayList2.toArray(new p2[0]);
        }
        return new r2(z11, i11, i12, i13, p2VarArr, strArr, strArr2, strArr3, strArr4, p2VarArr2);
    }

    @k
    public static final v8.k f(@k l2 l2Var) {
        g0.p(l2Var, "<this>");
        return new v8.k(l2Var.i(), l2Var.j() != null ? Long.valueOf(r2.intValue()) : null, l2Var.g(), l2Var.h());
    }

    @k
    public static final m2 g(@k l lVar) {
        g0.p(lVar, "<this>");
        return new m2(lVar.f93325a, lVar.f93326b);
    }

    @k
    public static final m h(@k n2 n2Var) {
        g0.p(n2Var, "<this>");
        return new m(n2Var.g(), n2Var.h(), n2Var.f());
    }

    @k
    public static final o2 i(@k n nVar) {
        m2[] m2VarArr;
        g0.p(nVar, "<this>");
        boolean z11 = nVar.f93339a;
        int i11 = nVar.f93340b;
        int i12 = nVar.f93341c;
        int i13 = nVar.f93342d;
        List<l> list = nVar.f93343e;
        if (list != null) {
            List<l> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(g((l) it.next()));
            }
            m2VarArr = (m2[]) arrayList.toArray(new m2[0]);
        } else {
            m2VarArr = null;
        }
        return new o2(z11, i11, i12, i13, m2VarArr);
    }

    @k
    public static final p j(@k q2 q2Var) {
        g0.p(q2Var, "<this>");
        return new p(q2Var.o(), q2Var.p(), q2Var.l(), q2Var.q(), q2Var.k(), q2Var.m(), q2Var.r(), q2Var.n());
    }

    @k
    public static final v3 k(@k s7.c cVar) {
        g0.p(cVar, "<this>");
        int g11 = cVar.g();
        s7.a h11 = cVar.h();
        j0 b11 = h11 != null ? b(h11) : null;
        String i11 = cVar.i();
        String j11 = cVar.j();
        if (j11 == null) {
            j11 = "未填写";
        }
        return new v3(g11, b11, i11, j11);
    }

    @k
    public static final s7.c l(@k c1 c1Var) {
        g0.p(c1Var, "<this>");
        Long l11 = c1Var.f101223f;
        int longValue = l11 != null ? (int) (l11.longValue() / 1000) : 0;
        q qVar = c1Var.f101225h;
        s7.a a11 = qVar != null ? a(qVar) : null;
        String str = c1Var.f101224g;
        if (str == null) {
            str = "";
        }
        String str2 = c1Var.f101229l;
        if (str2 == null) {
            str2 = "未知";
        }
        return new s7.c(longValue, a11, str, str2);
    }
}
