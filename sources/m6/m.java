package m6;

import a00.h0;
import a00.i0;
import a00.m0;
import a00.r0;
import com.baicizhan.app.api.service.model.game.RewardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m3.v0;
import oa0.r;
import p8.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nExtractGameRewardsUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtractGameRewardsUC.kt\ncom/baicizhan/app/biz/game/uc/reward/ExtractGameRewardsUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n774#2:132\n865#2,2:133\n1374#2:135\n1460#2,5:136\n1869#2,2:141\n1563#2:144\n1634#2,3:145\n774#2:148\n865#2,2:149\n1#3:143\n*S KotlinDebug\n*F\n+ 1 ExtractGameRewardsUC.kt\ncom/baicizhan/app/biz/game/uc/reward/ExtractGameRewardsUC\n*L\n38#1:132\n38#1:133,2\n38#1:135\n38#1:136,5\n40#1:141,2\n110#1:144\n110#1:145,3\n117#1:148\n117#1:149,2\n*E\n"})
/* loaded from: classes3.dex */
public final class m {
    public static final CharSequence g(p8.d it) {
        g0.p(it, "it");
        return "type:" + it.f79732a + ", count:" + it.f79733b;
    }

    public static final CharSequence h(v0 it) {
        g0.p(it, "it");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(it.j());
        sb2.append('(');
        sb2.append(it.f());
        sb2.append(')');
        return sb2.toString();
    }

    public static final CharSequence i(v0 it) {
        g0.p(it, "it");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(it.j());
        sb2.append('(');
        sb2.append(it.f());
        sb2.append(')');
        return sb2.toString();
    }

    public static final CharSequence k(v0 it) {
        g0.p(it, "it");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(it.j());
        sb2.append('(');
        sb2.append(it.f());
        sb2.append(')');
        return sb2.toString();
    }

    public static final CharSequence m(v0 it) {
        g0.p(it, "it");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(it.j());
        sb2.append('(');
        sb2.append(it.f());
        sb2.append(')');
        return sb2.toString();
    }

    public final List<v0> f(p8.r rVar) {
        z6.b bVar = z6.b.f101032b;
        z6.b.d(bVar, n.f72400a, "Extracting valid rewards from award_box - awards count: " + rVar.f80089b.f79674a.size(), null, 4, null);
        List<p8.d> list = rVar.f80089b.f79674a;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Raw awards: ");
            List<p8.d> list2 = list;
            sb2.append(r0.r3(list2, null, null, null, 0, null, new x00.l() { // from class: m6.i
                @Override // x00.l
                public final Object invoke(Object obj) {
                    CharSequence g11;
                    g11 = m.g((p8.d) obj);
                    return g11;
                }
            }, 31, null));
            z6.b.d(bVar, n.f72400a, sb2.toString(), null, 4, null);
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            for (p8.d dVar : list2) {
                arrayList.add(new v0(RewardType.Companion.a(dVar.f79732a), dVar.f79733b, (String) null, 4, (v) null));
            }
            z6.b.d(z6.b.f101032b, n.f72400a, "Mapped rewards: " + r0.r3(arrayList, null, null, null, 0, null, new x00.l() { // from class: m6.j
                @Override // x00.l
                public final Object invoke(Object obj) {
                    CharSequence h11;
                    h11 = m.h((v0) obj);
                    return h11;
                }
            }, 31, null), null, 4, null);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                v0 v0Var = (v0) obj;
                if (v0Var.j() != RewardType.Unknown && v0Var.f() > 0) {
                    arrayList2.add(obj);
                }
            }
            z6.b bVar2 = z6.b.f101032b;
            z6.b.d(bVar2, n.f72400a, "Filtered rewards: " + r0.r3(arrayList2, null, null, null, 0, null, new x00.l() { // from class: m6.k
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    CharSequence i11;
                    i11 = m.i((v0) obj2);
                    return i11;
                }
            }, 31, null), null, 4, null);
            ArrayList arrayList3 = arrayList2.isEmpty() ? null : arrayList2;
            if (arrayList3 != null) {
                z6.b.d(bVar2, n.f72400a, "Final valid rewards: " + arrayList3.size() + " items", null, 4, null);
                return arrayList3;
            }
        }
        List<v0> J = h0.J();
        z6.b.d(z6.b.f101032b, n.f72400a, "No valid rewards found", null, 4, null);
        return J;
    }

    public final List<v0> j(p8.r rVar) {
        ArrayList arrayList = new ArrayList();
        f0 f0Var = rVar.f80088a;
        p8.g0 g0Var = f0Var.f79797d;
        if (g0Var != null) {
            List<p8.c> list = g0Var.f79828c;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((p8.c) obj).f79706a <= g0Var.f79827b) {
                    arrayList2.add(obj);
                }
            }
            ArrayList<p8.d> arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                m0.s0(arrayList3, ((p8.c) it.next()).f79707b);
            }
            for (p8.d dVar : arrayList3) {
                z6.b bVar = z6.b.f101032b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Adding words round reward - ");
                RewardType.a aVar = RewardType.Companion;
                sb2.append(aVar.a(dVar.f79732a));
                sb2.append(": ");
                sb2.append(dVar.f79733b);
                z6.b.d(bVar, n.f72400a, sb2.toString(), null, 4, null);
                arrayList.add(new v0(aVar.a(dVar.f79732a), dVar.f79733b, (String) null, 4, (v) null));
            }
        }
        Integer num = f0Var.f79798e;
        if (num != null) {
            int intValue = num.intValue();
            z6.b.d(z6.b.f101032b, n.f72400a, "Adding words round reward - Coin: " + intValue, null, 4, null);
            arrayList.add(new v0(RewardType.Coin, intValue, (String) null, 4, (v) null));
        }
        z6.b.d(z6.b.f101032b, n.f72400a, "Words round rewards extracted: " + arrayList.size() + " items - " + r0.r3(arrayList, null, null, null, 0, null, new x00.l() { // from class: m6.h
            @Override // x00.l
            public final Object invoke(Object obj2) {
                CharSequence k11;
                k11 = m.k((v0) obj2);
                return k11;
            }
        }, 31, null), null, 4, null);
        return arrayList;
    }

    public final List<v0> l(p8.r rVar) {
        z6.b bVar = z6.b.f101032b;
        z6.b.d(bVar, n.f72400a, "Handling words round reward - study_score: " + rVar.f80088a.f79796c + ", compass: " + rVar.f80088a.f79795b + ", energy_count: " + rVar.f80088a.f79794a, null, 4, null);
        ArrayList arrayList = new ArrayList();
        f0 f0Var = rVar.f80088a;
        Integer valueOf = Integer.valueOf(f0Var.f79796c);
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            z6.b.d(bVar, n.f72400a, "Adding words round reward - RankScore: " + valueOf.intValue(), null, 4, null);
            arrayList.add(new v0(RewardType.RankScore, rVar.f80088a.f79796c, (String) null, 4, (v) null));
        }
        Integer num = f0Var.f79799f;
        if (num != null) {
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                z6.b.d(bVar, n.f72400a, "Adding words round reward - SnacksCount: " + intValue, null, 4, null);
                arrayList.add(new v0(RewardType.BuddyTravelSnacks, intValue, (String) null, 4, (v) null));
            }
        }
        Integer valueOf2 = Integer.valueOf(f0Var.f79794a);
        if ((valueOf2.intValue() > 0 ? valueOf2 : null) != null) {
            z6.b.d(bVar, n.f72400a, "Adding words round reward - EnergyEn: " + rVar.f80088a.f79794a, null, 4, null);
            arrayList.add(new v0(RewardType.EnergyEn, rVar.f80088a.f79794a, (String) null, 4, (v) null));
        }
        z6.b.d(bVar, n.f72400a, "Words round rewards extracted: " + arrayList.size() + " items - " + r0.r3(arrayList, null, null, null, 0, null, new x00.l() { // from class: m6.l
            @Override // x00.l
            public final Object invoke(Object obj) {
                CharSequence m11;
                m11 = m.m((v0) obj);
                return m11;
            }
        }, 31, null), null, 4, null);
        return arrayList;
    }

    @m80.k
    public final Triple<List<v0>, List<v0>, List<v0>> n(@m80.k p8.r rsp) {
        g0.p(rsp, "rsp");
        z6.b bVar = z6.b.f101032b;
        z6.b.j(bVar, n.f72400a, "Starting to extract game rewards from FinishRoundRsp", null, 4, null);
        List<v0> l11 = l(rsp);
        List<v0> j11 = j(rsp);
        List<v0> f11 = f(rsp);
        z6.b.j(bVar, n.f72400a, "Extraction completed - WordsRound: " + l11.size() + ", ValidRewards: " + f11.size(), null, 4, null);
        return new Triple<>(l11, j11, f11);
    }
}
