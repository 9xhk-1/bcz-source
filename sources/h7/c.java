package h7;

import a00.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k3.b3;
import k3.c0;
import k3.d0;
import k3.i;
import k3.k3;
import k3.s3;
import k3.t3;
import k3.u3;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import z8.l1;
import z8.n1;
import z8.p0;
import z8.q0;
import z8.r0;
import z8.s0;
import z8.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Convert.kt\ncom/baicizhan/app/biz/study4ini/ConvertKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n37#2,2:180\n37#2,2:186\n37#2,2:189\n37#2,2:191\n37#2,2:197\n37#2,2:203\n1563#3:182\n1634#3,3:183\n1563#3:193\n1634#3,3:194\n1563#3:199\n1634#3,3:200\n1#4:188\n*S KotlinDebug\n*F\n+ 1 Convert.kt\ncom/baicizhan/app/biz/study4ini/ConvertKt\n*L\n126#1:180,2\n131#1:186,2\n150#1:189,2\n151#1:191,2\n153#1:197,2\n166#1:203,2\n129#1:182\n129#1:183,3\n152#1:193\n152#1:194,3\n164#1:199\n164#1:200,3\n*E\n"})
/* loaded from: classes3.dex */
public final class c {
    @m80.k
    public static final k3.i a(@m80.k p0 p0Var, @m80.l g8.k kVar, @m80.k com.baicizhan.app.biz.leaning.c schedule, boolean z11) {
        g0.p(p0Var, "<this>");
        g0.p(schedule, "schedule");
        String o11 = schedule.o();
        String n11 = schedule.n();
        int m11 = schedule.m();
        q0 q0Var = p0Var.f101871a;
        k3 k3Var = new k3(o11, n11, m11, q0Var.f101906b, q0Var.f101905a, q0Var.f101907c, false);
        r0 r0Var = p0Var.f101872b;
        if (r0Var.f101956f) {
            return new i.a(k3Var, r0Var.f101955e);
        }
        if (r0Var.f101957g) {
            if (z11) {
                return new i.C0755i(k3Var, g(p0Var.f101874d, r0Var.f101953c, r0Var.f101954d), kVar != null ? d(kVar) : null, p0Var.f101872b.f101955e);
            }
            k3.d d11 = kVar != null ? d(kVar) : null;
            y yVar = p0Var.f101874d;
            r0 r0Var2 = p0Var.f101872b;
            return new i.c(k3Var, g(yVar, r0Var2.f101953c, r0Var2.f101954d), d11, p0Var.f101872b.f101955e);
        }
        if (r0Var.f101958h) {
            return new i.C0755i(k3Var, g(p0Var.f101874d, r0Var.f101953c, r0Var.f101954d), kVar != null ? d(kVar) : null, p0Var.f101872b.f101955e);
        }
        b3 g11 = g(p0Var.f101873c, r0Var.f101951a, r0Var.f101952b);
        y yVar2 = p0Var.f101874d;
        r0 r0Var3 = p0Var.f101872b;
        return new i.e(k3Var, g11, g(yVar2, r0Var3.f101953c, r0Var3.f101954d), kVar != null ? d(kVar) : null, p0Var.f101872b.f101955e);
    }

    @m80.k
    public static final k3.i b(@m80.k s0 s0Var, @m80.l g8.k kVar, @m80.k com.baicizhan.app.biz.leaning.c schedule, boolean z11) {
        g0.p(s0Var, "<this>");
        g0.p(schedule, "schedule");
        p0 p0Var = s0Var.f102002b;
        if (p0Var != null) {
            if (s0Var.f102001a != 0) {
                p0Var = null;
            }
            if (p0Var != null) {
                return a(p0Var, kVar, schedule, z11);
            }
        }
        return new i.f(c60.c.f8170q);
    }

    @m80.k
    public static final s3 c(@m80.k r3.a aVar) {
        g0.p(aVar, "<this>");
        return new s3(aVar.s(), aVar.n());
    }

    @m80.k
    public static final k3.d d(@m80.k g8.k kVar) {
        g0.p(kVar, "<this>");
        String str = kVar.f53304b;
        String str2 = kVar.f53306d;
        String str3 = kVar.f53308f;
        if (str3 == null) {
            str3 = "null";
        }
        return new k3.d(str, str2, str3);
    }

    @m80.k
    public static final c0 e(@m80.k z8.k kVar) {
        String[] strArr;
        g0.p(kVar, "<this>");
        String str = kVar.f101685a;
        String[] strArr2 = (String[]) kVar.f101686b.toArray(new String[0]);
        String[] strArr3 = (String[]) kVar.f101687c.toArray(new String[0]);
        List<Long> list = kVar.f101688d;
        if (list != null) {
            List<Long> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Number) it.next()).longValue()));
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        } else {
            strArr = null;
        }
        return new c0(str, strArr2, strArr3, strArr, kVar.f101689e, kVar.f101690f, kVar.f101691g, kVar.f101692h, kVar.f101693i);
    }

    @m80.k
    public static final d0 f(@m80.k z8.l lVar) {
        g0.p(lVar, "<this>");
        List<z8.k> list = lVar.f101725a;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(e((z8.k) it.next()));
        }
        return new d0((c0[]) arrayList.toArray(new c0[0]), lVar.f101726b, lVar.f101727c, lVar.f101728d);
    }

    @m80.k
    public static final b3 g(@m80.k y yVar, int i11, int i12) {
        g0.p(yVar, "<this>");
        return new b3(i11, i12, new k3.c(yVar.f102273a, yVar.f102274b, yVar.f102275c));
    }

    @m80.k
    public static final t3 h(@m80.k l1 l1Var) {
        g0.p(l1Var, "<this>");
        return new t3(l1Var.f101745a, l1Var.f101746b, l1Var.f101747c, (int) (l1Var.f101748d / 1000));
    }

    @m80.k
    public static final u3 i(@m80.k n1 n1Var) {
        g0.p(n1Var, "<this>");
        String str = n1Var.f101809a;
        String str2 = n1Var.f101810b;
        String str3 = n1Var.f101811c;
        String str4 = n1Var.f101812d;
        int i11 = 0;
        String[] strArr = (String[]) n1Var.f101813e.toArray(new String[0]);
        String str5 = n1Var.f101814f;
        int i12 = n1Var.f101815g;
        List<l1> list = n1Var.f101816h;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h((l1) it.next()));
        }
        t3[] t3VarArr = (t3[]) arrayList.toArray(new t3[0]);
        String str6 = n1Var.f101818j;
        String str7 = n1Var.f101819k;
        Integer num = n1Var.f101820l;
        if (num != null) {
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null) {
                i11 = num.intValue();
            }
        }
        return new u3(str, str2, str3, str4, strArr, str5, i12, t3VarArr, str6, str7, i11);
    }
}
