package com.baicizhan.main.wordlistv2.repo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.wordlistv2.repo.db.WordListResourceRecord;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nIWordListResRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IWordListResRepo.kt\ncom/baicizhan/main/wordlistv2/repo/WordResRepoImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n49#2:57\n51#2:61\n46#3:58\n51#3:60\n105#4:59\n1563#5:62\n1634#5,3:63\n*S KotlinDebug\n*F\n+ 1 IWordListResRepo.kt\ncom/baicizhan/main/wordlistv2/repo/WordResRepoImpl\n*L\n30#1:57\n30#1:61\n30#1:58\n30#1:60\n30#1:59\n33#1:62\n33#1:63,3\n*E\n"})
/* loaded from: classes5.dex */
public final class WordResRepoImpl implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final int f27949c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final wj.b f27950a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final nc.a f27951b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wordlistv2.repo.WordResRepoImpl", f = "IWordListResRepo.kt", i = {0, 0}, l = {32}, m = "loadRecords", n = {"bookId", "hasCache"}, s = {"I$0", "Z$0"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f27956a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f27957b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f27958c;

        /* renamed from: e, reason: collision with root package name */
        public int f27960e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f27958c = obj;
            this.f27960e |= Integer.MIN_VALUE;
            return WordResRepoImpl.this.b(0, this);
        }
    }

    @Inject
    public WordResRepoImpl(@m80.k wj.b resDap, @w @m80.k nc.a kv2) {
        g0.p(resDap, "resDap");
        g0.p(kv2, "kv");
        this.f27950a = resDap;
        this.f27951b = kv2;
    }

    @Override // com.baicizhan.main.wordlistv2.repo.d
    @m80.l
    public Object a(int i11, @m80.k List<Integer> list, @m80.k j00.c<? super List<WordListResourceRecord>> cVar) {
        return this.f27950a.a(i11, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007b A[LOOP:0: B:11:0x0075->B:13:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.baicizhan.main.wordlistv2.repo.d
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(final int r6, @m80.k j00.c<? super java.util.List<com.baicizhan.main.wordlistv2.repo.db.WordListResourceRecord>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.baicizhan.main.wordlistv2.repo.WordResRepoImpl.a
            if (r0 == 0) goto L13
            r0 = r7
            com.baicizhan.main.wordlistv2.repo.WordResRepoImpl$a r0 = (com.baicizhan.main.wordlistv2.repo.WordResRepoImpl.a) r0
            int r1 = r0.f27960e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27960e = r1
            goto L18
        L13:
            com.baicizhan.main.wordlistv2.repo.WordResRepoImpl$a r0 = new com.baicizhan.main.wordlistv2.repo.WordResRepoImpl$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27958c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f27960e
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r6 = r0.f27956a
            kotlin.e.n(r7)
            goto L5d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.e.n(r7)
            nc.a r7 = r5.f27951b
            java.lang.String r2 = com.baicizhan.main.wordlistv2.repo.e.a(r6)
            r4 = 0
            boolean r7 = r7.getBoolean(r2, r4)
            if (r7 != 0) goto L98
            com.baicizhan.client.business.thrift.m r2 = com.baicizhan.client.business.thrift.m.f16659a
            java.lang.String r4 = "/rpc/resource_api"
            kotlinx.coroutines.flow.i r2 = r2.b(r4)
            com.baicizhan.main.wordlistv2.repo.WordResRepoImpl$loadRecords$$inlined$map$1 r4 = new com.baicizhan.main.wordlistv2.repo.WordResRepoImpl$loadRecords$$inlined$map$1
            r4.<init>()
            r0.f27956a = r6
            r0.f27957b = r7
            r0.f27960e = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.k.w0(r4, r0)
            if (r7 != r1) goto L5d
            return r1
        L5d:
            java.util.List r7 = (java.util.List) r7
            wj.b r0 = r5.f27950a
            kotlin.jvm.internal.g0.m(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = a00.i0.d0(r7, r2)
            r1.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L75:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L8c
            java.lang.Object r2 = r7.next()
            com.baicizhan.online.resource_api.WordListWordMetaV2 r2 = (com.baicizhan.online.resource_api.WordListWordMetaV2) r2
            kotlin.jvm.internal.g0.m(r2)
            com.baicizhan.main.wordlistv2.repo.db.WordListResourceRecord r2 = com.baicizhan.main.wordlistv2.repo.e.b(r2)
            r1.add(r2)
            goto L75
        L8c:
            r0.c(r1)
            nc.a r7 = r5.f27951b
            java.lang.String r0 = com.baicizhan.main.wordlistv2.repo.e.a(r6)
            r7.j(r0, r3)
        L98:
            wj.b r7 = r5.f27950a
            java.util.List r6 = r7.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wordlistv2.repo.WordResRepoImpl.b(int, j00.c):java.lang.Object");
    }
}
