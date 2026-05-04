package l6;

import a00.h0;
import a00.i0;
import c40.r0;
import c40.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import org.junit.jupiter.api.j2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t f70217a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v5.d f70218b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final v5.e f70219c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.resource.DownloadMediaResourceUC", f = "DownloadMediaResourceUC.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {36, 45}, m = "invoke", n = {"models", "bookId", "mode", "maxConcurrency", "models", "unReadyResources", "semaphore", "bookId", "mode", "maxConcurrency"}, s = {"L$0", "J$0", "I$0", "I$1", "L$0", "L$1", "L$2", "J$0", "I$0", "I$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f70220a;

        /* renamed from: b, reason: collision with root package name */
        public int f70221b;

        /* renamed from: c, reason: collision with root package name */
        public int f70222c;

        /* renamed from: d, reason: collision with root package name */
        public Object f70223d;

        /* renamed from: e, reason: collision with root package name */
        public Object f70224e;

        /* renamed from: f, reason: collision with root package name */
        public Object f70225f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f70226g;

        /* renamed from: i, reason: collision with root package name */
        public int f70228i;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f70226g = obj;
            this.f70228i |= Integer.MIN_VALUE;
            return k.this.c(0L, 0, null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.resource.DownloadMediaResourceUC$invoke$2", f = "DownloadMediaResourceUC.kt", i = {0, 0}, l = {62}, m = "invokeSuspend", n = {"$this$coroutineScope", "downloadTasks"}, s = {"L$0", "L$1"}, v = 1)
    @u0({"SMAP\nDownloadMediaResourceUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadMediaResourceUC.kt\ncom/baicizhan/app/biz/game/uc/resource/DownloadMediaResourceUC$invoke$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1563#2:74\n1634#2,3:75\n1788#2,4:78\n*S KotlinDebug\n*F\n+ 1 DownloadMediaResourceUC.kt\ncom/baicizhan/app/biz/game/uc/resource/DownloadMediaResourceUC$invoke$2\n*L\n47#1:74\n47#1:75,3\n63#1:78,4\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f70229a;

        /* renamed from: b, reason: collision with root package name */
        public int f70230b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f70231c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<String> f70232d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f70233e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ n40.h f70234f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ k f70235g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.uc.resource.DownloadMediaResourceUC$invoke$2$downloadTasks$1$1", f = "DownloadMediaResourceUC.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {74, 52, 53}, m = "invokeSuspend", n = {"$this$async", "$this$withPermit$iv", "$i$f$withPermit", "$this$async", "$this$withPermit$iv", "$this$invokeSuspend_u24lambda_u240_u240", "$i$f$withPermit", "$i$a$-withPermit-DownloadMediaResourceUC$invoke$2$downloadTasks$1$1$1", "$i$a$-runCatching-DownloadMediaResourceUC$invoke$2$downloadTasks$1$1$1$1", "$this$async", "$this$withPermit$iv", "$this$invokeSuspend_u24lambda_u240_u240", "localFilePath", "$i$f$withPermit", "$i$a$-withPermit-DownloadMediaResourceUC$invoke$2$downloadTasks$1$1$1", "$i$a$-runCatching-DownloadMediaResourceUC$invoke$2$downloadTasks$1$1$1$1"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$4", "I$0", "I$1", "I$2", "L$0", "L$1", "L$3", "L$4", "I$0", "I$1", "I$2"}, v = 1)
        @u0({"SMAP\nDownloadMediaResourceUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadMediaResourceUC.kt\ncom/baicizhan/app/biz/game/uc/resource/DownloadMediaResourceUC$invoke$2$downloadTasks$1$1\n+ 2 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt\n*L\n1#1,73:1\n81#2,6:74\n*S KotlinDebug\n*F\n+ 1 DownloadMediaResourceUC.kt\ncom/baicizhan/app/biz/game/uc/resource/DownloadMediaResourceUC$invoke$2$downloadTasks$1$1\n*L\n49#1:74,6\n*E\n"})
        public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends g2>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f70236a;

            /* renamed from: b, reason: collision with root package name */
            public Object f70237b;

            /* renamed from: c, reason: collision with root package name */
            public Object f70238c;

            /* renamed from: d, reason: collision with root package name */
            public Object f70239d;

            /* renamed from: e, reason: collision with root package name */
            public int f70240e;

            /* renamed from: f, reason: collision with root package name */
            public int f70241f;

            /* renamed from: g, reason: collision with root package name */
            public int f70242g;

            /* renamed from: h, reason: collision with root package name */
            public int f70243h;

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ Object f70244i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ n40.h f70245j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ k f70246k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f70247l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(n40.h hVar, k kVar, String str, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f70245j = hVar;
                this.f70246k = kVar;
                this.f70247l = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                a aVar = new a(this.f70245j, this.f70246k, this.f70247l, cVar);
                aVar.f70244i = obj;
                return aVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<g2>> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(1:(1:(1:(9:6|7|8|9|10|(1:12)|13|14|15)(2:26|27))(8:28|29|30|31|32|33|(7:36|9|10|(0)|13|14|15)|35))(1:44))(3:52|(1:54)|35)|45|46|(4:48|32|33|(0))|35|(1:(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00f3, code lost:
            
                r1 = r12;
                r12 = r0;
                r0 = r5;
             */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0106 A[Catch: all -> 0x011f, TryCatch #4 {all -> 0x011f, blocks: (B:10:0x0100, B:12:0x0106, B:13:0x0121, B:25:0x00f6), top: B:24:0x00f6 }] */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 301
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: l6.k.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends g2>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<g2>>) cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<String> list, long j11, n40.h hVar, k kVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f70232d = list;
            this.f70233e = j11;
            this.f70234f = hVar;
            this.f70235g = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f70232d, this.f70233e, this.f70234f, this.f70235g, cVar);
            bVar.f70231c = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x0 b11;
            r0 r0Var = (r0) this.f70231c;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f70230b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                List<String> list = this.f70232d;
                n40.h hVar = this.f70234f;
                k kVar = this.f70235g;
                ArrayList arrayList = new ArrayList(i0.d0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    b11 = c40.k.b(r0Var, null, null, new a(hVar, kVar, (String) it.next(), null), 3, null);
                    arrayList.add(b11);
                }
                this.f70231c = l00.k.a(r0Var);
                this.f70229a = l00.k.a(arrayList);
                this.f70230b = 1;
                obj = c40.f.a(arrayList, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            List list2 = (List) obj;
            int i12 = 0;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (Result.m6314isFailureimpl(((Result) it2.next()).m6317unboximpl()) && (i12 = i12 + 1) < 0) {
                        h0.a0();
                    }
                }
            }
            z6.b.j(z6.b.f101032b, l.f70248a, "download finish: " + this.f70233e + j2.O + this.f70232d.size() + " resources, " + i12 + " failures", null, 4, null);
            if (i12 <= 0) {
                return g2.f100423a;
            }
            throw new Exception("download failed：" + i12 + '/' + this.f70232d.size());
        }
    }

    public k(@m80.k t getUnReadyResourceUrlUC, @m80.k v5.d downloadRepo, @m80.k v5.e mediaFileRepo) {
        g0.p(getUnReadyResourceUrlUC, "getUnReadyResourceUrlUC");
        g0.p(downloadRepo, "downloadRepo");
        g0.p(mediaFileRepo, "mediaFileRepo");
        this.f70217a = getUnReadyResourceUrlUC;
        this.f70218b = downloadRepo;
        this.f70219c = mediaFileRepo;
    }

    public static /* synthetic */ Object d(k kVar, long j11, int i11, List list, int i12, j00.c cVar, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            i12 = 15;
        }
        return kVar.c(j11, i11, list, i12, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if (c40.s0.g(r7, r2) == r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r1 == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r15, int r17, @m80.k java.util.List<l3.i0> r18, int r19, @m80.k j00.c<? super yz.g2> r20) {
        /*
            r14 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof l6.k.a
            if (r2 == 0) goto L17
            r2 = r1
            l6.k$a r2 = (l6.k.a) r2
            int r3 = r2.f70228i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f70228i = r3
            goto L1c
        L17:
            l6.k$a r2 = new l6.k$a
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f70226g
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.l()
            int r4 = r2.f70228i
            r5 = 1
            r6 = 2
            if (r4 == 0) goto L57
            if (r4 == r5) goto L45
            if (r4 != r6) goto L3d
            java.lang.Object r0 = r2.f70225f
            n40.h r0 = (n40.h) r0
            java.lang.Object r0 = r2.f70224e
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r2.f70223d
            java.util.List r0 = (java.util.List) r0
            kotlin.e.n(r1)
            goto Lb0
        L3d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L45:
            int r0 = r2.f70222c
            int r4 = r2.f70221b
            long r7 = r2.f70220a
            java.lang.Object r5 = r2.f70223d
            java.util.List r5 = (java.util.List) r5
            kotlin.e.n(r1)
            r9 = r4
            r4 = r0
            r0 = r9
        L55:
            r9 = r7
            goto L76
        L57:
            kotlin.e.n(r1)
            l6.t r1 = r14.f70217a
            java.lang.Object r4 = l00.k.a(r18)
            r2.f70223d = r4
            r7 = r15
            r2.f70220a = r7
            r2.f70221b = r0
            r4 = r19
            r2.f70222c = r4
            r2.f70228i = r5
            r5 = r18
            java.lang.Object r1 = r1.a(r0, r5, r2)
            if (r1 != r3) goto L55
            goto Laf
        L76:
            r8 = r1
            java.util.List r8 = (java.util.List) r8
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L82
            yz.g2 r0 = yz.g2.f100423a
            return r0
        L82:
            r1 = 0
            r7 = 0
            n40.h r11 = n40.l.b(r4, r1, r6, r7)
            l6.k$b r7 = new l6.k$b
            r13 = 0
            r12 = r14
            r7.<init>(r8, r9, r11, r12, r13)
            java.lang.Object r1 = l00.k.a(r5)
            r2.f70223d = r1
            java.lang.Object r1 = l00.k.a(r8)
            r2.f70224e = r1
            java.lang.Object r1 = l00.k.a(r11)
            r2.f70225f = r1
            r2.f70220a = r9
            r2.f70221b = r0
            r2.f70222c = r4
            r2.f70228i = r6
            java.lang.Object r0 = c40.s0.g(r7, r2)
            if (r0 != r3) goto Lb0
        Laf:
            return r3
        Lb0:
            yz.g2 r0 = yz.g2.f100423a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.k.c(long, int, java.util.List, int, j00.c):java.lang.Object");
    }
}
