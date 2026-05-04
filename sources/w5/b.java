package w5;

import a00.h0;
import a00.i0;
import a00.k1;
import a00.l1;
import a00.r0;
import com.baicizhan.app.api.service.model.game.RewardType;
import g10.u;
import h5.e0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.o0;
import kotlinx.coroutines.flow.y;
import l00.d;
import m3.v0;
import m80.k;
import m80.l;
import n40.g;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {w5.a.class})
@u0({"SMAP\nRewardRepoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RewardRepoImpl.kt\ncom/baicizhan/app/biz/game/repo/reward/RewardRepoImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n116#2,11:98\n116#2,8:109\n125#2,2:120\n827#3:117\n855#3,2:118\n3301#3,10:122\n1208#3,2:132\n1236#3,4:134\n1869#3,2:138\n*S KotlinDebug\n*F\n+ 1 RewardRepoImpl.kt\ncom/baicizhan/app/biz/game/repo/reward/RewardRepoImpl\n*L\n36#1:98,11\n47#1:109,8\n47#1:120,2\n52#1:117\n52#1:118,2\n67#1:122,10\n85#1:132,2\n85#1:134,4\n87#1:138,2\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements w5.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.baicizhan.app.biz.auth.r f95302a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final y<List<e0>> f95303b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<Long, List<e0>> f95304c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final n40.a f95305d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.repo.reward.RewardRepoImpl", f = "RewardRepoImpl.kt", i = {0, 0, 0, 0, 1, 1}, l = {103, 42}, m = "addRewardPackage", n = {"rewardPackage", "userId", "$this$withLock_u24default$iv", "$i$f$withLock", "rewardPackage", "userId"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f95306a;

        /* renamed from: b, reason: collision with root package name */
        public Object f95307b;

        /* renamed from: c, reason: collision with root package name */
        public Object f95308c;

        /* renamed from: d, reason: collision with root package name */
        public int f95309d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f95310e;

        /* renamed from: g, reason: collision with root package name */
        public int f95312g;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f95310e = obj;
            this.f95312g |= Integer.MIN_VALUE;
            return b.this.b(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.baicizhan.app.biz.game.repo.reward.RewardRepoImpl", f = "RewardRepoImpl.kt", i = {0, 0, 0, 0, 1, 1}, l = {103, 59}, m = "clampRewardPackage", n = {"rewardType", "userId", "$this$withLock_u24default$iv", "$i$f$withLock", "rewardType", "userId"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1"}, v = 1)
    /* renamed from: w5.b$b, reason: collision with other inner class name */
    public static final class C1280b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f95313a;

        /* renamed from: b, reason: collision with root package name */
        public Object f95314b;

        /* renamed from: c, reason: collision with root package name */
        public Object f95315c;

        /* renamed from: d, reason: collision with root package name */
        public int f95316d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f95317e;

        /* renamed from: g, reason: collision with root package name */
        public int f95319g;

        public C1280b(j00.c<? super C1280b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f95317e = obj;
            this.f95319g |= Integer.MIN_VALUE;
            return b.this.d(null, this);
        }
    }

    public b(@k com.baicizhan.app.biz.auth.r tokenProvider) {
        g0.p(tokenProvider, "tokenProvider");
        this.f95302a = tokenProvider;
        this.f95303b = o0.a(h0.J());
        this.f95304c = new LinkedHashMap();
        this.f95305d = g.b(false, 1, null);
    }

    @Override // w5.a
    @l
    public Object a(@k j00.c<? super List<e0>> cVar) {
        List a62;
        Map<Long, List<e0>> map = this.f95304c;
        Long b11 = this.f95302a.b();
        List<e0> list = map.get(b11 != null ? l00.a.g(b11.longValue()) : null);
        return (list == null || (a62 = r0.a6(list)) == null) ? h0.J() : a62;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0106, code lost:
    
        if (r2.emit(r7, r3) != r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0108, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0098, code lost:
    
        if (r2.lock(null, r3) == r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a5 A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:18:0x009b, B:20:0x00a5, B:21:0x00ad), top: B:17:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // w5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k h5.e0 r18, @m80.k j00.c<? super yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.b.b(h5.e0, j00.c):java.lang.Object");
    }

    @Override // w5.a
    @l
    public Object c(@k j00.c<? super i<? extends List<e0>>> cVar) {
        return this.f95303b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x012f, code lost:
    
        if (r0.emit(r4, r2) == r3) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:18:0x007f, B:20:0x0089, B:23:0x009a, B:24:0x00b7, B:26:0x00bd, B:29:0x00cb, B:36:0x00cf, B:44:0x0095), top: B:17:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:18:0x007f, B:20:0x0089, B:23:0x009a, B:24:0x00b7, B:26:0x00bd, B:29:0x00cb, B:36:0x00cf, B:44:0x0095), top: B:17:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // w5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k com.baicizhan.app.biz.game.model.RewardPackageType r18, @m80.k j00.c<? super yz.g2> r19) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.b.d(com.baicizhan.app.biz.game.model.RewardPackageType, j00.c):java.lang.Object");
    }

    public final List<v0> e(List<v0> list, List<v0> list2) {
        List<v0> list3 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(i0.d0(list3, 10)), 16));
        for (Object obj : list3) {
            linkedHashMap.put(((v0) obj).j(), obj);
        }
        Map J0 = l1.J0(linkedHashMap);
        for (v0 v0Var : list2) {
            v0 v0Var2 = (v0) J0.get(v0Var.j());
            RewardType j11 = v0Var.j();
            if (v0Var2 != null) {
                v0 e11 = v0.e(v0Var2, null, v0Var.f() + v0Var2.f(), null, 5, null);
                if (e11 != null) {
                    v0Var = e11;
                }
            }
            J0.put(j11, v0Var);
        }
        return r0.a6(J0.values());
    }

    public final List<e0> f(List<e0> list, e0 e0Var) {
        e0 e0Var2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((e0) obj).f() == e0Var.f()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.component1();
        List list3 = (List) pair.component2();
        e0 e0Var3 = (e0) r0.L2(list2);
        if (e0Var3 == null || (e0Var2 = e0.d(e0Var3, null, e(e0Var3.e(), e0Var.e()), 1, null)) == null) {
            e0Var2 = e0Var;
        }
        z6.b.j(z6.b.f101032b, c.f95320a, "mergeRewardPackages: " + e0Var.f() + " merged", null, 4, null);
        return r0.J4(list3, e0Var2);
    }
}
