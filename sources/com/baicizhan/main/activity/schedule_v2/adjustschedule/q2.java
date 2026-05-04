package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nRoundPlanProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundPlanProvider.kt\ncom/baicizhan/main/activity/schedule_v2/adjustschedule/RoundPlanProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1563#2:50\n1634#2,3:51\n1563#2:54\n1634#2,3:55\n1563#2:58\n1634#2,3:59\n1#3:62\n*S KotlinDebug\n*F\n+ 1 RoundPlanProvider.kt\ncom/baicizhan/main/activity/schedule_v2/adjustschedule/RoundPlanProvider\n*L\n17#1:50\n17#1:51,3\n24#1:54\n24#1:55,3\n26#1:58\n26#1:59,3\n*E\n"})
/* loaded from: classes4.dex */
public final class q2 {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final a f19182f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f19183g = 8;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final String f19184h = "RoundPlanProvider";

    /* renamed from: a, reason: collision with root package name */
    public final int f19185a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19186b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Map<Integer, Integer> f19187c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final yz.c0 f19188d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final yz.c0 f19189e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public q2(int i11, int i12) {
        this.f19185a = i11;
        this.f19186b = i12;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f19187c = linkedHashMap;
        this.f19188d = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.o2
            @Override // x00.a
            public final Object invoke() {
                List m11;
                m11 = q2.m(q2.this);
                return m11;
            }
        });
        this.f19189e = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.adjustschedule.p2
            @Override // x00.a
            public final Object invoke() {
                List f11;
                f11 = q2.f(q2.this);
                return f11;
            }
        });
        g10.l lVar = new g10.l(1, (i12 / i11) + (i12 % i11 > 0 ? 1 : 0));
        ArrayList arrayList = new ArrayList(a00.i0.d0(lVar, 10));
        Iterator<Integer> it = lVar.iterator();
        while (it.hasNext()) {
            int nextInt = ((a00.d1) it).nextInt();
            Integer valueOf = Integer.valueOf(nextInt);
            int i13 = this.f19185a * nextInt;
            int i14 = this.f19186b;
            arrayList.add(yz.h1.a(valueOf, Integer.valueOf((i14 / i13) + (i14 % i13 > 0 ? 1 : 0))));
        }
        a00.l1.w0(linkedHashMap, arrayList);
    }

    public static final List f(q2 q2Var) {
        return a00.r0.v5(a00.o0.w1(q2Var.f19187c.values()));
    }

    public static final List m(q2 q2Var) {
        return a00.r0.v5(a00.r0.a6(q2Var.f19187c.keySet()));
    }

    public final int c(int i11) {
        return g().get(i11).intValue();
    }

    public final int d(int i11) {
        return a00.r0.i3(g(), this.f19187c.get(Integer.valueOf(i11 + 1)));
    }

    @m80.k
    public final List<String> e(@m80.k String format) {
        kotlin.jvm.internal.g0.p(format, "format");
        SortedSet<Integer> w12 = a00.o0.w1(this.f19187c.values());
        ArrayList arrayList = new ArrayList(a00.i0.d0(w12, 10));
        for (Integer num : w12) {
            kotlin.jvm.internal.w0 w0Var = kotlin.jvm.internal.w0.f67050a;
            String format2 = String.format(format, Arrays.copyOf(new Object[]{num}, 1));
            kotlin.jvm.internal.g0.o(format2, "format(...)");
            arrayList.add(format2);
        }
        return arrayList;
    }

    public final List<Integer> g() {
        return (List) this.f19189e.getValue();
    }

    public final List<Integer> h() {
        return (List) this.f19188d.getValue();
    }

    public final int i(int i11) {
        return h().indexOf(Integer.valueOf(i11));
    }

    public final int j(int i11) {
        return h().get(i11).intValue();
    }

    public final int k(int i11) {
        Iterator<T> it = this.f19187c.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry entry = (Map.Entry) it.next();
        int intValue = ((Number) entry.getValue()).intValue() == g().get(i11).intValue() ? ((Number) entry.getKey()).intValue() : 0;
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            int intValue2 = ((Number) entry2.getValue()).intValue() == g().get(i11).intValue() ? ((Number) entry2.getKey()).intValue() : 0;
            if (intValue < intValue2) {
                intValue = intValue2;
            }
        }
        qb.c.b(f19184h, "roundIndexByDayIndex: round " + intValue + " by " + i11, new Object[0]);
        return Math.max(0, intValue - 1);
    }

    @m80.k
    public final List<String> l(@m80.k String format) {
        kotlin.jvm.internal.g0.p(format, "format");
        Set<Integer> keySet = this.f19187c.keySet();
        ArrayList arrayList = new ArrayList(a00.i0.d0(keySet, 10));
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            kotlin.jvm.internal.w0 w0Var = kotlin.jvm.internal.w0.f67050a;
            String format2 = String.format(format, Arrays.copyOf(new Object[]{Integer.valueOf(intValue)}, 1));
            kotlin.jvm.internal.g0.o(format2, "format(...)");
            arrayList.add(format2);
        }
        return arrayList;
    }
}
