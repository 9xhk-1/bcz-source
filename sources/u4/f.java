package u4;

import a00.h0;
import a00.r0;
import h5.a1;
import h5.o0;
import h5.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l3.a0;
import l3.g2;
import l3.z;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSidePromotionReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SidePromotionReducer.kt\ncom/baicizhan/app/biz/game/impl/home/base/SidePromotionReducerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n808#2,11:112\n808#2,11:123\n808#2,11:134\n808#2,11:145\n*S KotlinDebug\n*F\n+ 1 SidePromotionReducer.kt\ncom/baicizhan/app/biz/game/impl/home/base/SidePromotionReducerKt\n*L\n95#1:112,11\n96#1:123,11\n97#1:134,11\n98#1:145,11\n*E\n"})
/* loaded from: classes3.dex */
public final class f {
    @k
    public static final a0 a(@k o0 rank, @k g2 rankClick, @k g2 taskClick, @k a1 winning, @l u8.e eVar) {
        g0.p(rank, "rank");
        g0.p(rankClick, "rankClick");
        g0.p(taskClick, "taskClick");
        g0.p(winning, "winning");
        return new a0(b(b.k(winning, taskClick), b.j(rank, rankClick), eVar != null ? b.i(eVar) : null, null));
    }

    public static final List<z> b(z.d dVar, z.c cVar, z.b bVar, z.a aVar) {
        return h0.S(dVar, cVar, aVar, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<Object> c(List<? extends z> list) {
        z[] zVarArr = new z[4];
        List<? extends z> list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof z.c) {
                arrayList.add(obj);
            }
        }
        zVarArr[0] = r0.L2(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof z.d) {
                arrayList2.add(obj2);
            }
        }
        zVarArr[1] = r0.L2(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            if (obj3 instanceof z.b) {
                arrayList3.add(obj3);
            }
        }
        zVarArr[2] = r0.L2(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list2) {
            if (obj4 instanceof z.a) {
                arrayList4.add(obj4);
            }
        }
        zVarArr[3] = r0.L2(arrayList4);
        return h0.Q(zVarArr);
    }

    @k
    public static final List<z> d(@k List<? extends z> old, @k w lavaQuest, @k g2 uiAction) {
        g0.p(old, "old");
        g0.p(lavaQuest, "lavaQuest");
        g0.p(uiAction, "uiAction");
        z.a h11 = b.h(lavaQuest, uiAction);
        List<Object> c11 = c(old);
        Object obj = c11.get(0);
        Object obj2 = c11.get(1);
        Object obj3 = c11.get(2);
        c11.get(3);
        return b((z.d) obj2, (z.c) obj, (z.b) obj3, h11);
    }

    @k
    public static final List<z> e(@k List<? extends z> old, @k o0 rank, @k g2 rankClick) {
        g0.p(old, "old");
        g0.p(rank, "rank");
        g0.p(rankClick, "rankClick");
        z.c j11 = b.j(rank, rankClick);
        List<Object> c11 = c(old);
        c11.get(0);
        return b((z.d) c11.get(1), j11, (z.b) c11.get(2), (z.a) c11.get(3));
    }

    @k
    public static final List<z> f(@k List<? extends z> old, @k a1 pop, @k g2 uiAction) {
        g0.p(old, "old");
        g0.p(pop, "pop");
        g0.p(uiAction, "uiAction");
        z.d k11 = b.k(pop, uiAction);
        List<Object> c11 = c(old);
        Object obj = c11.get(0);
        c11.get(1);
        return b(k11, (z.c) obj, (z.b) c11.get(2), (z.a) c11.get(3));
    }

    @k
    public static final List<z> g(@k List<? extends z> old, @l u8.e eVar) {
        g0.p(old, "old");
        z.b i11 = eVar != null ? b.i(eVar) : null;
        List<Object> c11 = c(old);
        Object obj = c11.get(0);
        Object obj2 = c11.get(1);
        c11.get(2);
        return b((z.d) obj2, (z.c) obj, i11, (z.a) c11.get(3));
    }
}
