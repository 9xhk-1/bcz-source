package t7;

import a00.h0;
import a00.r0;
import com.tencent.liteav.TXLiteAVCode;
import java.util.List;
import k3.l4;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import q30.k0;
import w30.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWordListServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListServiceImpl.kt\ncom/baicizhan/app/biz/wordlist/WordListServiceImplKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,152:1\n37#2,2:153\n*S KotlinDebug\n*F\n+ 1 WordListServiceImpl.kt\ncom/baicizhan/app/biz/wordlist/WordListServiceImplKt\n*L\n106#1:153,2\n*E\n"})
/* loaded from: classes3.dex */
public final class p {
    @m80.k
    public static final l4[] b() {
        final List<l4> d11 = d();
        return (l4[]) k0.I3(k0.N1(r0.E1(new g10.l(1, 10000)), new x00.l() { // from class: t7.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                l4 c11;
                c11 = p.c(d11, ((Integer) obj).intValue());
                return c11;
            }
        })).toArray(new l4[0]);
    }

    public static final l4 c(List list, int i11) {
        Random.Default r02 = Random.Default;
        r02.nextInt(3);
        l4 l4Var = (l4) list.get(i11 % 3);
        int nextInt = r02.nextInt(0, 150);
        int p11 = l4Var.p() + r02.nextInt(TXLiteAVCode.ERR_SERVER_INFO_UNPACKING_ERROR, 100000);
        int nextInt2 = r02.nextInt(-100, 100);
        int nextInt3 = r02.nextInt(1, 7);
        return l4.l(l4Var, i11, null, null, null, nextInt, p11, r02.nextBoolean(), nextInt2, r02.nextBoolean(), nextInt3, 14, null);
    }

    @m80.k
    public static final List<l4> d() {
        b.C1273b c1273b = b.C1273b.f94770b;
        long j11 = 1000;
        return h0.Q(new l4(7851, "representative", "n. 代表；代理；立法代表；  adj. 典型的，有代表性的；代理的；选举制的", "https://vol.bczcdn.com/r/us_representative_20231226101449333_4c777ea7407bb95ad975.mp3", 1, (int) (c1273b.a().toEpochMilliseconds() / j11), true, 1, true, 1), new l4(7851, "sort", "v. 把……分类，整理，挑选；修理；使明确；交往，协调；  n. 种类，类别；某一种人；分类；排序；特征；方法；品种", "https://vol.bczcdn.com/r/us_sort_20231101113442393_70261fa351fef4c842b7.mp3", 1, (int) (c1273b.a().toEpochMilliseconds() / j11), true, 1, true, 1), new l4(7851, "representative", "n. 脚底，鞋底，袜底；比目鱼；  adj. 唯一的；独有的；单独的；  v. 给（鞋）换底", "https://vol.bczcdn.com/r/us_sole_20231220103022249_73dddf7d7f08d750df31.mp3", 1, (int) (c1273b.a().toEpochMilliseconds() / j11), true, 1, true, 1));
    }
}
