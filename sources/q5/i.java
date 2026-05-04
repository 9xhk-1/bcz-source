package q5;

import a00.g0;
import a00.h0;
import a00.i0;
import a00.l1;
import a00.m0;
import com.baicizhan.app.biz.game.model.IpAvatarState;
import h5.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIpResourceRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IpResourceRepo.kt\ncom/baicizhan/app/biz/game/repo/ipavatar/IpResourceRepoKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,130:1\n1374#2:131\n1460#2,2:132\n1563#2:134\n1634#2,3:135\n1462#2,3:138\n1504#2:141\n1534#2,3:142\n1537#2,3:152\n382#3,7:145\n*S KotlinDebug\n*F\n+ 1 IpResourceRepo.kt\ncom/baicizhan/app/biz/game/repo/ipavatar/IpResourceRepoKt\n*L\n129#1:131\n129#1:132,2\n129#1:134\n129#1:135,3\n129#1:138,3\n130#1:141\n130#1:142,3\n130#1:152,3\n130#1:145,7\n*E\n"})
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final List<u> f81767a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Map<Integer, String> f81768b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Map<IpAvatarState, List<String>> f81769c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Map<Integer, List<String>> f81770d;

    static {
        List<u> Q = h0.Q(new u("NewPenguin_FirstMeeting", h0.Q("取件码：XianXueYiZu", "内有贵重物品，先学1组才能开启"), h0.Q("取件码：XianXueYiZu", "内有贵重物品，先学1组才能开启"), h0.J()), new u(com.baicizhan.app.biz.game.uc.ipavatar.b.f14792a, h0.J(), h0.Q("一口一个，毫不费力！", "爆米花吹走了，但鹅总有办法。", "生命在于吃胖！"), h0.Q(4, 5)), new u("NewPenguin_Toilet", h0.J(), h0.Q("多来戳戳，鹅会超开心！", "这届蚊子，胆子真肥。", "肚太公钓鱼——愿者上钩！"), h0.Q(6, 7)), new u("NewPenguin_Read", h0.J(), h0.Q("鹅深度感受了知识的重量。", "Zzz...咦？", "沉迷学习...鹅的脑子在飞速进化。"), h0.Q(8, 9)), new u("NewPenguin_SadCry", h0.Q("18点，还没学习，鹅就哭得大声点", "鹅哭了，谁家好人18点还没学习呀555"), h0.Q("18点，还没学习，鹅就哭得大声点", "鹅哭了，谁家好人18点还没学习呀555"), h0.J()), new u("NewPenguin_Expect", h0.Q("哟吼吼，饼干够了，出行吧！", "饼干充足，come on baby let's go！"), h0.Q("哟吼吼，饼干够了，出行吧！", "饼干充足，come on baby let's go！"), h0.J()), new u("NewPenguin_Go1", g0.l("让鹅想想，这次带什么好东西呢？"), g0.l("让鹅想想，这次带什么好东西呢？"), h0.J()), new u("NewPenguin_Gift", h0.Q("学习辛苦了，送一点鹅mazing，请收下", "千里送鹅毛，快点收下"), h0.Q("学习辛苦了，送一点鹅mazing，请收下", "千里送鹅毛，快点收下"), h0.J()));
        f81767a = Q;
        f81768b = l1.W(h1.a(1, "ip_avatar_area_forest"), h1.a(2, "ip_avatar_area_ocean"));
        f81769c = l1.W(h1.a(IpAvatarState.UnOwned, g0.l("NewPenguin_FirstMeeting")), h1.a(IpAvatarState.InHome, h0.Q(com.baicizhan.app.biz.game.uc.ipavatar.b.f14792a, "NewPenguin_Toilet", "NewPenguin_Read")), h1.a(IpAvatarState.InHomeNoStreak, g0.l("NewPenguin_SadCry")), h1.a(IpAvatarState.InHomeReady, g0.l("NewPenguin_Expect")), h1.a(IpAvatarState.Traveling, g0.l("NewPenguin_Go1")), h1.a(IpAvatarState.RewardPending, g0.l("NewPenguin_Gift")));
        ArrayList<Pair> arrayList = new ArrayList();
        for (u uVar : Q) {
            List<Integer> g11 = uVar.g();
            ArrayList arrayList2 = new ArrayList(i0.d0(g11, 10));
            Iterator<T> it = g11.iterator();
            while (it.hasNext()) {
                arrayList2.add(h1.a(Integer.valueOf(((Number) it.next()).intValue()), uVar.i()));
            }
            m0.s0(arrayList, arrayList2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            Integer valueOf = Integer.valueOf(((Number) pair.getFirst()).intValue());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add((String) pair.getSecond());
        }
        f81770d = linkedHashMap;
    }
}
