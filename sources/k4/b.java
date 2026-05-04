package k4;

import a00.h0;
import a00.i0;
import a00.r0;
import com.baicizhan.app.api.service.model.game.RewardType;
import com.baicizhan.app.biz.game.model.RewardPackageType;
import h5.e0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.random.Random;
import m3.v0;
import m80.k;
import oa0.r;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nRandomRewardGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RandomRewardGenerator.kt\ncom/baicizhan/app/biz/game/impl/debug/RandomRewardGenerator\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1563#2:92\n1634#2,3:93\n774#2:96\n865#2,2:97\n774#2:99\n865#2,2:100\n1563#2:102\n1634#2,3:103\n*S KotlinDebug\n*F\n+ 1 RandomRewardGenerator.kt\ncom/baicizhan/app/biz/game/impl/debug/RandomRewardGenerator\n*L\n25#1:92\n25#1:93,3\n59#1:96\n59#1:97,2\n67#1:99\n67#1:100,2\n78#1:102\n78#1:103,3\n*E\n"})
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65807a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f65808b;

        static {
            int[] iArr = new int[RewardPackageType.values().length];
            try {
                iArr[RewardPackageType.WordsRound.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RewardPackageType.MileStone.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RewardPackageType.SentenceRound.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65807a = iArr;
            int[] iArr2 = new int[RewardType.values().length];
            try {
                iArr2[RewardType.Coin.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RewardType.EnergyEn.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[RewardType.EnergyJp.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[RewardType.BuddyTravelSnacks.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[RewardType.Hammer.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[RewardType.PowerEn.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[RewardType.PowerJp.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[RewardType.RankScore.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            f65808b = iArr2;
        }
    }

    @k
    public final String a(@k RewardPackageType packageType, @k List<v0> rewards) {
        String str;
        String str2;
        g0.p(packageType, "packageType");
        g0.p(rewards, "rewards");
        int i11 = a.f65807a[packageType.ordinal()];
        if (i11 == 1) {
            str = "单词关卡奖励";
        } else if (i11 == 2) {
            str = "里程碑奖励";
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "句子关卡奖励";
        }
        List<v0> list = rewards;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        for (v0 v0Var : list) {
            switch (a.f65808b[v0Var.j().ordinal()]) {
                case 1:
                    str2 = "铜板";
                    break;
                case 2:
                    str2 = "英语能量";
                    break;
                case 3:
                    str2 = "日语能量";
                    break;
                case 4:
                    str2 = "buddy零食";
                    break;
                case 5:
                    str2 = "锤子";
                    break;
                case 6:
                    str2 = "英语体力";
                    break;
                case 7:
                    str2 = "日语体力";
                    break;
                case 8:
                    str2 = "排行积分";
                    break;
                default:
                    str2 = "未知奖励";
                    break;
            }
            arrayList.add(str2 + " x" + v0Var.f());
        }
        return str + "已添加：" + r0.r3(arrayList, j2.O, null, null, 0, null, null, 62, null);
    }

    @k
    public final e0 b(@k RewardPackageType packageType) {
        g0.p(packageType, "packageType");
        return new e0(packageType, c(packageType));
    }

    public final List<v0> c(RewardPackageType rewardPackageType) {
        ArrayList arrayList;
        int nextInt;
        List Q = h0.Q(RewardType.Coin, RewardType.EnergyEn, RewardType.EnergyJp, RewardType.BuddyTravelSnacks, RewardType.Hammer, RewardType.PowerEn, RewardType.PowerJp, RewardType.RankScore);
        int i11 = a.f65807a[rewardPackageType.ordinal()];
        if (i11 == 1 || i11 == 2) {
            arrayList = new ArrayList();
            for (Object obj : Q) {
                RewardType rewardType = (RewardType) obj;
                if (rewardType != RewardType.Hammer && rewardType != RewardType.EnergyJp && rewardType != RewardType.PowerJp) {
                    arrayList.add(obj);
                }
            }
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList = new ArrayList();
            for (Object obj2 : Q) {
                RewardType rewardType2 = (RewardType) obj2;
                if (rewardType2 != RewardType.BuddyTravelSnacks && rewardType2 != RewardType.EnergyEn && rewardType2 != RewardType.PowerEn) {
                    arrayList.add(obj2);
                }
            }
        }
        List<RewardType> O5 = r0.O5(a00.g0.m(arrayList), Random.Default.nextInt(2, Math.min(5, arrayList.size() + 1)));
        ArrayList arrayList2 = new ArrayList(i0.d0(O5, 10));
        for (RewardType rewardType3 : O5) {
            switch (a.f65808b[rewardType3.ordinal()]) {
                case 1:
                    nextInt = Random.Default.nextInt(100, 1000);
                    break;
                case 2:
                case 3:
                    nextInt = Random.Default.nextInt(10, 50);
                    break;
                case 4:
                case 5:
                    nextInt = Random.Default.nextInt(1, 5);
                    break;
                case 6:
                case 7:
                    nextInt = Random.Default.nextInt(5, 20);
                    break;
                case 8:
                    nextInt = Random.Default.nextInt(50, 200);
                    break;
                default:
                    nextInt = Random.Default.nextInt(1, 10);
                    break;
            }
            arrayList2.add(new v0(rewardType3, nextInt, (String) null, 4, (v) null));
        }
        return arrayList2;
    }
}
