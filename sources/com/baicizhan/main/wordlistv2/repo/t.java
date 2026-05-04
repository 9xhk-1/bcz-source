package com.baicizhan.main.wordlistv2.repo;

import a00.h0;
import a00.r0;
import com.baicizhan.main.wordlistv2.c1;
import com.tencent.liteav.TXLiteAVCode;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import q30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWordListRepoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordListRepoImpl.kt\ncom/baicizhan/main/wordlistv2/repo/WordListRepoImplKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,149:1\n37#2,2:150\n*S KotlinDebug\n*F\n+ 1 WordListRepoImpl.kt\ncom/baicizhan/main/wordlistv2/repo/WordListRepoImplKt\n*L\n105#1:150,2\n*E\n"})
/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f28048a = "IWordListRepo";

    @m80.k
    public static final c1[] b() {
        final List<c1> d11 = d();
        return (c1[]) k0.I3(k0.N1(r0.E1(new g10.l(1, 10000)), new x00.l() { // from class: com.baicizhan.main.wordlistv2.repo.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                c1 c11;
                c11 = t.c(d11, ((Integer) obj).intValue());
                return c11;
            }
        })).toArray(new c1[0]);
    }

    public static final c1 c(List list, int i11) {
        c1 c1Var = (c1) list.get(i11 % 3);
        Random.Default r02 = Random.Default;
        return c1.n(c1Var, i11, null, null, null, r02.nextInt(0, 150), c1Var.s() + r02.nextInt(TXLiteAVCode.ERR_SERVER_INFO_UNPACKING_ERROR, 100000), r02.nextBoolean(), r02.nextInt(-100, 100), r02.nextBoolean(), r02.nextInt(1, 7), false, false, 3086, null);
    }

    @m80.k
    public static final List<c1> d() {
        return h0.Q(new c1(7851, "representative", "n. 代表；代理；立法代表；  adj. 典型的，有代表性的；代理的；选举制的", "https://vol.bczcdn.com/r/us_representative_20231226101449333_4c777ea7407bb95ad975.mp3", 1, System.currentTimeMillis(), true, 1, true, 1, false, false, 3072, null), new c1(7851, "sort", "v. 把……分类，整理，挑选；修理；使明确；交往，协调；  n. 种类，类别；某一种人；分类；排序；特征；方法；品种", "https://vol.bczcdn.com/r/us_sort_20231101113442393_70261fa351fef4c842b7.mp3", 1, System.currentTimeMillis(), true, 1, true, 1, false, false, 3072, null), new c1(7851, "representative", "n. 脚底，鞋底，袜底；比目鱼；  adj. 唯一的；独有的；单独的；  v. 给（鞋）换底", "https://vol.bczcdn.com/r/us_sole_20231220103022249_73dddf7d7f08d750df31.mp3", 1, System.currentTimeMillis(), true, 1, true, 1, false, false, 3072, null));
    }
}
