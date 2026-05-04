package rj;

import a00.w1;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import c40.h1;
import c40.m0;
import com.baicizhan.main.activity.errorfb.WordErrorFeedbackActivity;
import com.baicizhan.main.word_book.data.FavoriteInfo;
import ij.e0;
import ij.q;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@VisibleForTesting
@u0({"SMAP\nWordFavoriteService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFavoriteService.kt\ncom/baicizhan/main/word_book/service/FavoriteControllerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,433:1\n1563#2:434\n1634#2,3:435\n1617#2,9:438\n1869#2:447\n1870#2:449\n1626#2:450\n774#2:452\n865#2,2:453\n1563#2:455\n1634#2,3:456\n1011#2,2:459\n1563#2:461\n1634#2,3:462\n1#3:448\n1#3:451\n*S KotlinDebug\n*F\n+ 1 WordFavoriteService.kt\ncom/baicizhan/main/word_book/service/FavoriteControllerImpl\n*L\n303#1:434\n303#1:435,3\n316#1:438,9\n316#1:447\n316#1:449\n316#1:450\n333#1:452\n333#1:453,2\n333#1:455\n333#1:456,3\n345#1:459,2\n354#1:461\n354#1:462,3\n316#1:448\n*E\n"})
/* loaded from: classes5.dex */
public final class a implements ij.e, ij.g {

    /* renamed from: c, reason: collision with root package name */
    public static final int f84160c = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final q f84161a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final m0 f84162b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.service.FavoriteControllerImpl", f = "WordFavoriteService.kt", i = {0, 0}, l = {354}, m = "addFavorites-0E7RQCE", n = {xd.a.f98002r, "bookIds"}, s = {"L$0", "L$1"}, v = 1)
    /* renamed from: rj.a$a, reason: collision with other inner class name */
    public static final class C1051a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f84163a;

        /* renamed from: b, reason: collision with root package name */
        public Object f84164b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84165c;

        /* renamed from: e, reason: collision with root package name */
        public int f84167e;

        public C1051a(j00.c<? super C1051a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f84165c = obj;
            this.f84167e |= Integer.MIN_VALUE;
            Object q02 = a.this.q0(null, null, this);
            return q02 == kotlin.coroutines.intrinsics.b.l() ? q02 : Result.m6307boximpl(q02);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.service.FavoriteControllerImpl$asLiveData$1", f = "WordFavoriteService.kt", i = {0, 1, 2, 3, 3}, l = {357, 359, 359, 361}, m = "invokeSuspend", n = {"$this$liveData", "$this$liveData", "$this$liveData", "$this$liveData", "e"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1"}, v = 1)
    public static final class b<T> extends SuspendLambda implements p<LiveDataScope<dg.d<? extends T>>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f84168a;

        /* renamed from: b, reason: collision with root package name */
        public int f84169b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84170c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.l<j00.c<? super T>, Object> f84171d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.l<? super j00.c<? super T>, ? extends Object> lVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f84171d = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f84171d, cVar);
            bVar.f84170c = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(LiveDataScope<dg.d<T>> liveDataScope, j00.c<? super g2> cVar) {
            return ((b) create(liveDataScope, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        
            if (r2.emit(r5, r7) != r1) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
        
            if (r0.emit(r2, r7) != r1) goto L32;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f84170c
                androidx.lifecycle.LiveDataScope r0 = (androidx.lifecycle.LiveDataScope) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r7.f84169b
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L3a
                if (r2 == r6) goto L36
                if (r2 == r5) goto L2e
                if (r2 == r4) goto L28
                if (r2 != r3) goto L20
                java.lang.Object r0 = r7.f84168a
                java.lang.Exception r0 = (java.lang.Exception) r0
                kotlin.e.n(r8)
                goto L87
            L20:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L28:
                kotlin.e.n(r8)     // Catch: java.lang.Exception -> L2c
                goto L87
            L2c:
                r8 = move-exception
                goto L6d
            L2e:
                java.lang.Object r2 = r7.f84168a
                androidx.lifecycle.LiveDataScope r2 = (androidx.lifecycle.LiveDataScope) r2
                kotlin.e.n(r8)     // Catch: java.lang.Exception -> L2c
                goto L5a
            L36:
                kotlin.e.n(r8)
                goto L4a
            L3a:
                kotlin.e.n(r8)
                dg.d$b r8 = dg.d.b.f47960b
                r7.f84170c = r0
                r7.f84169b = r6
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L4a
                goto L86
            L4a:
                x00.l<j00.c<? super T>, java.lang.Object> r8 = r7.f84171d     // Catch: java.lang.Exception -> L2c
                r7.f84170c = r0     // Catch: java.lang.Exception -> L2c
                r7.f84168a = r0     // Catch: java.lang.Exception -> L2c
                r7.f84169b = r5     // Catch: java.lang.Exception -> L2c
                java.lang.Object r8 = r8.invoke(r7)     // Catch: java.lang.Exception -> L2c
                if (r8 != r1) goto L59
                goto L86
            L59:
                r2 = r0
            L5a:
                dg.d$c r5 = new dg.d$c     // Catch: java.lang.Exception -> L2c
                r5.<init>(r8)     // Catch: java.lang.Exception -> L2c
                r7.f84170c = r0     // Catch: java.lang.Exception -> L2c
                r8 = 0
                r7.f84168a = r8     // Catch: java.lang.Exception -> L2c
                r7.f84169b = r4     // Catch: java.lang.Exception -> L2c
                java.lang.Object r8 = r2.emit(r5, r7)     // Catch: java.lang.Exception -> L2c
                if (r8 != r1) goto L87
                goto L86
            L6d:
                dg.d$a r2 = new dg.d$a
                r2.<init>(r8)
                java.lang.Object r4 = l00.k.a(r0)
                r7.f84170c = r4
                java.lang.Object r8 = l00.k.a(r8)
                r7.f84168a = r8
                r7.f84169b = r3
                java.lang.Object r8 = r0.emit(r2, r7)
                if (r8 != r1) goto L87
            L86:
                return r1
            L87:
                yz.g2 r8 = yz.g2.f100423a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: rj.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.service.FavoriteControllerImpl$favorite$1", f = "WordFavoriteService.kt", i = {0, 1, 2, 2, 2}, l = {422, 424, 427}, m = "invokeSuspend", n = {"$this$liveData", "$this$liveData", "$this$liveData", "$this$invokeSuspend_u24lambda_u240", "$i$a$-with-FavoriteControllerImpl$favorite$1$1"}, s = {"L$0", "L$0", "L$0", "L$1", "I$0"}, v = 1)
    public static final class c extends SuspendLambda implements p<LiveDataScope<Throwable>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f84172a;

        /* renamed from: b, reason: collision with root package name */
        public int f84173b;

        /* renamed from: c, reason: collision with root package name */
        public int f84174c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f84175d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f84176e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ a f84177f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e0[] f84178g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ List<Long> f84179h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z11, a aVar, e0[] e0VarArr, List<Long> list, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f84176e = z11;
            this.f84177f = aVar;
            this.f84178g = e0VarArr;
            this.f84179h = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(this.f84176e, this.f84177f, this.f84178g, this.f84179h, cVar);
            cVar2.f84175d = obj;
            return cVar2;
        }

        @Override // x00.p
        public final Object invoke(LiveDataScope<Throwable> liveDataScope, j00.c<? super g2> cVar) {
            return ((c) create(liveDataScope, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
        
            if (r0.emit(r2, r8) != r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b0, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0053, code lost:
        
            if (r9 == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
        
            if (r9 == r1) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f84175d
                androidx.lifecycle.LiveDataScope r0 = (androidx.lifecycle.LiveDataScope) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r8.f84174c
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2d
                if (r2 == r5) goto L23
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1b
                kotlin.e.n(r9)
                goto Lb1
            L1b:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L23:
                kotlin.e.n(r9)
                kotlin.Result r9 = (kotlin.Result) r9
                java.lang.Object r9 = r9.m6317unboximpl()
                goto L71
            L2d:
                kotlin.e.n(r9)
                java.lang.String r9 = "favorite multiples"
                java.lang.Object[] r2 = new java.lang.Object[r6]
                java.lang.String r7 = "WordFavoriteService"
                qb.c.i(r7, r9, r2)
                boolean r9 = r8.f84176e
                if (r9 != 0) goto L56
                rj.a r9 = r8.f84177f
                ij.e0[] r2 = r8.f84178g
                r2 = r2[r6]
                java.util.List<java.lang.Long> r4 = r8.f84179h
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Set r4 = a00.r0.f6(r4)
                r8.f84175d = r0
                r8.f84174c = r5
                java.lang.Object r9 = rj.a.p0(r9, r2, r4, r8)
                if (r9 != r1) goto L71
                goto Lb0
            L56:
                rj.a r9 = r8.f84177f
                ij.e0[] r2 = r8.f84178g
                java.util.List r2 = a00.a0.dz(r2)
                java.util.List<java.lang.Long> r5 = r8.f84179h
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Set r5 = a00.r0.f6(r5)
                r8.f84175d = r0
                r8.f84174c = r4
                java.lang.Object r9 = rj.a.o0(r9, r2, r5, r8)
                if (r9 != r1) goto L71
                goto Lb0
            L71:
                boolean r2 = kotlin.Result.m6315isSuccessimpl(r9)
                if (r2 == 0) goto L8d
                java.lang.Boolean r2 = l00.a.a(r6)
                boolean r4 = kotlin.Result.m6314isFailureimpl(r9)
                if (r4 == 0) goto L82
                goto L83
            L82:
                r2 = r9
            L83:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L8d
                r2 = 0
                goto L9a
            L8d:
                java.lang.Throwable r2 = kotlin.Result.m6311exceptionOrNullimpl(r9)
                if (r2 != 0) goto L9a
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r4 = "failed"
                r2.<init>(r4)
            L9a:
                java.lang.Object r4 = l00.k.a(r0)
                r8.f84175d = r4
                java.lang.Object r9 = l00.k.a(r9)
                r8.f84172a = r9
                r8.f84173b = r6
                r8.f84174c = r3
                java.lang.Object r9 = r0.emit(r2, r8)
                if (r9 != r1) goto Lb1
            Lb0:
                return r1
            Lb1:
                yz.g2 r9 = yz.g2.f100423a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: rj.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.service.FavoriteControllerImpl", f = "WordFavoriteService.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {303, 312, TypedValues.AttributesType.TYPE_EASING, 328}, m = "getFavoriteInfo", n = {"$this$getFavoriteInfo_u24lambda_u240", "universalId", "$i$a$-apply-FavoriteControllerImpl$getFavoriteInfo$2", "$this$getFavoriteInfo_u24lambda_u240", "universalId", "$i$a$-apply-FavoriteControllerImpl$getFavoriteInfo$2", "$this$getFavoriteInfo_u24lambda_u240", "books", "$this$mapNotNull$iv", "$this$mapNotNullTo$iv$iv", "destination$iv$iv", "$this$forEach$iv$iv$iv", "element$iv$iv$iv", "element$iv$iv", "universalId", "$i$a$-apply-FavoriteControllerImpl$getFavoriteInfo$2", "$i$f$mapNotNull", "$i$f$mapNotNullTo", "$i$f$forEach", "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv", "id", "$i$a$-mapNotNull-FavoriteControllerImpl$getFavoriteInfo$2$favorites$1", "$this$getFavoriteInfo_u24lambda_u240", "books", "favorites", "universalId", "$i$a$-apply-FavoriteControllerImpl$getFavoriteInfo$2"}, s = {"L$1", "J$0", "I$0", "L$1", "J$0", "I$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$8", "L$9", "J$0", "I$0", "I$1", "I$2", "I$3", "I$4", "J$1", "I$5", "L$1", "L$2", "L$3", "J$0", "I$0"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f84180a;

        /* renamed from: b, reason: collision with root package name */
        public long f84181b;

        /* renamed from: c, reason: collision with root package name */
        public Object f84182c;

        /* renamed from: d, reason: collision with root package name */
        public Object f84183d;

        /* renamed from: e, reason: collision with root package name */
        public Object f84184e;

        /* renamed from: f, reason: collision with root package name */
        public Object f84185f;

        /* renamed from: g, reason: collision with root package name */
        public Object f84186g;

        /* renamed from: h, reason: collision with root package name */
        public Object f84187h;

        /* renamed from: i, reason: collision with root package name */
        public Object f84188i;

        /* renamed from: j, reason: collision with root package name */
        public Object f84189j;

        /* renamed from: k, reason: collision with root package name */
        public Object f84190k;

        /* renamed from: l, reason: collision with root package name */
        public Object f84191l;

        /* renamed from: m, reason: collision with root package name */
        public int f84192m;

        /* renamed from: n, reason: collision with root package name */
        public int f84193n;

        /* renamed from: o, reason: collision with root package name */
        public int f84194o;

        /* renamed from: p, reason: collision with root package name */
        public int f84195p;

        /* renamed from: q, reason: collision with root package name */
        public int f84196q;

        /* renamed from: r, reason: collision with root package name */
        public int f84197r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f84198s;

        /* renamed from: u, reason: collision with root package name */
        public int f84200u;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f84198s = obj;
            this.f84200u |= Integer.MIN_VALUE;
            return a.this.o(0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 WordFavoriteService.kt\ncom/baicizhan/main/word_book/service/FavoriteControllerImpl\n*L\n1#1,328:1\n346#2:329\n*E\n"})
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Long.valueOf(((FavoriteInfo) t11).i()), Long.valueOf(((FavoriteInfo) t12).i()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.service.FavoriteControllerImpl$getFavoriteInfoList$1", f = "WordFavoriteService.kt", i = {}, l = {366}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.l<j00.c<? super List<? extends FavoriteInfo>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84201a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f84203c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j11, j00.c<? super f> cVar) {
            super(1, cVar);
            this.f84203c = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return a.this.new f(this.f84203c, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super List<FavoriteInfo>> cVar) {
            return ((f) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f84201a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            a aVar = a.this;
            long j11 = this.f84203c;
            this.f84201a = 1;
            Object o11 = aVar.o(j11, this);
            return o11 == l11 ? l11 : o11;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super List<? extends FavoriteInfo>> cVar) {
            return invoke2((j00.c<? super List<FavoriteInfo>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.service.FavoriteControllerImpl$tryToFavorite$1", f = "WordFavoriteService.kt", i = {0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 8, 8, 9, 9, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 12, 12}, l = {373, 375, 381, 383, 386, 389, 391, 394, 401, 403, 407, 409, 414}, m = "invokeSuspend", n = {"$this$liveData", "$this$liveData", WordErrorFeedbackActivity.f18460k, "$this$liveData", WordErrorFeedbackActivity.f18460k, "info", "pre", "$this$liveData", WordErrorFeedbackActivity.f18460k, "info", "pre", "it", "$i$a$-onSuccess-FavoriteControllerImpl$tryToFavorite$1$1", "$this$liveData", WordErrorFeedbackActivity.f18460k, "info", "e", "pre", "$i$a$-onFailure-FavoriteControllerImpl$tryToFavorite$1$2", "$this$liveData", WordErrorFeedbackActivity.f18460k, "info", "pre", "$this$liveData", WordErrorFeedbackActivity.f18460k, "info", "pre", "it", "$i$a$-onSuccess-FavoriteControllerImpl$tryToFavorite$1$3", "$this$liveData", WordErrorFeedbackActivity.f18460k, "info", "e", "pre", "$i$a$-onFailure-FavoriteControllerImpl$tryToFavorite$1$4", "$this$liveData", WordErrorFeedbackActivity.f18460k, "$this$liveData", WordErrorFeedbackActivity.f18460k, "$this$liveData", WordErrorFeedbackActivity.f18460k, "$this$invokeSuspend_u24lambda_u244", "$i$a$-with-FavoriteControllerImpl$tryToFavorite$1$5", "it", "$i$a$-onSuccess-FavoriteControllerImpl$tryToFavorite$1$5$1", "$this$liveData", WordErrorFeedbackActivity.f18460k, "$this$invokeSuspend_u24lambda_u244", "e", "$i$a$-with-FavoriteControllerImpl$tryToFavorite$1$5", "$i$a$-onFailure-FavoriteControllerImpl$tryToFavorite$1$5$2", "$this$liveData", "e"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0", "Z$1", "I$0", "L$0", "L$1", "L$2", "L$4", "Z$0", "I$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0", "Z$1", "I$0", "L$0", "L$1", "L$2", "L$4", "Z$0", "I$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "I$0", "Z$0", "I$1", "L$0", "L$1", "L$2", "L$4", "I$0", "I$1", "L$0", "L$1"}, v = 1)
    public static final class g extends SuspendLambda implements p<LiveDataScope<pj.b>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f84204a;

        /* renamed from: b, reason: collision with root package name */
        public Object f84205b;

        /* renamed from: c, reason: collision with root package name */
        public Object f84206c;

        /* renamed from: d, reason: collision with root package name */
        public Object f84207d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f84208e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f84209f;

        /* renamed from: g, reason: collision with root package name */
        public int f84210g;

        /* renamed from: h, reason: collision with root package name */
        public int f84211h;

        /* renamed from: i, reason: collision with root package name */
        public int f84212i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f84213j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f84214k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e0[] f84215l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f84216m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z11, e0[] e0VarArr, a aVar, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f84214k = z11;
            this.f84215l = e0VarArr;
            this.f84216m = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            g gVar = new g(this.f84214k, this.f84215l, this.f84216m, cVar);
            gVar.f84213j = obj;
            return gVar;
        }

        @Override // x00.p
        public final Object invoke(LiveDataScope<pj.b> liveDataScope, j00.c<? super g2> cVar) {
            return ((g) create(liveDataScope, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:118:0x03b4, code lost:
        
            if (r0.emit(r2, r12) != r1) goto L125;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x035b A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:11:0x002f, B:12:0x0385, B:14:0x0041, B:16:0x0355, B:18:0x035b, B:23:0x004a, B:24:0x005d, B:26:0x0315, B:28:0x031b, B:34:0x0058, B:36:0x006e, B:37:0x028c, B:39:0x0294, B:42:0x02bf, B:44:0x007d, B:46:0x0255, B:48:0x025b, B:52:0x0099, B:54:0x00aa, B:55:0x01f0, B:57:0x01f8, B:61:0x00b9, B:63:0x01b7, B:65:0x01bd, B:69:0x00cb, B:70:0x014d, B:71:0x00d0, B:72:0x012c, B:74:0x0135, B:77:0x0151, B:79:0x0157, B:81:0x017f, B:83:0x0187, B:84:0x0198, B:88:0x0194, B:89:0x0222, B:93:0x02c4, B:95:0x02cf, B:98:0x02f1, B:102:0x00d7, B:106:0x0104, B:108:0x010a, B:109:0x0120, B:113:0x0389, B:114:0x0390), top: B:2:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x031b A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:11:0x002f, B:12:0x0385, B:14:0x0041, B:16:0x0355, B:18:0x035b, B:23:0x004a, B:24:0x005d, B:26:0x0315, B:28:0x031b, B:34:0x0058, B:36:0x006e, B:37:0x028c, B:39:0x0294, B:42:0x02bf, B:44:0x007d, B:46:0x0255, B:48:0x025b, B:52:0x0099, B:54:0x00aa, B:55:0x01f0, B:57:0x01f8, B:61:0x00b9, B:63:0x01b7, B:65:0x01bd, B:69:0x00cb, B:70:0x014d, B:71:0x00d0, B:72:0x012c, B:74:0x0135, B:77:0x0151, B:79:0x0157, B:81:0x017f, B:83:0x0187, B:84:0x0198, B:88:0x0194, B:89:0x0222, B:93:0x02c4, B:95:0x02cf, B:98:0x02f1, B:102:0x00d7, B:106:0x0104, B:108:0x010a, B:109:0x0120, B:113:0x0389, B:114:0x0390), top: B:2:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0353  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0294 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:11:0x002f, B:12:0x0385, B:14:0x0041, B:16:0x0355, B:18:0x035b, B:23:0x004a, B:24:0x005d, B:26:0x0315, B:28:0x031b, B:34:0x0058, B:36:0x006e, B:37:0x028c, B:39:0x0294, B:42:0x02bf, B:44:0x007d, B:46:0x0255, B:48:0x025b, B:52:0x0099, B:54:0x00aa, B:55:0x01f0, B:57:0x01f8, B:61:0x00b9, B:63:0x01b7, B:65:0x01bd, B:69:0x00cb, B:70:0x014d, B:71:0x00d0, B:72:0x012c, B:74:0x0135, B:77:0x0151, B:79:0x0157, B:81:0x017f, B:83:0x0187, B:84:0x0198, B:88:0x0194, B:89:0x0222, B:93:0x02c4, B:95:0x02cf, B:98:0x02f1, B:102:0x00d7, B:106:0x0104, B:108:0x010a, B:109:0x0120, B:113:0x0389, B:114:0x0390), top: B:2:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x025b A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:11:0x002f, B:12:0x0385, B:14:0x0041, B:16:0x0355, B:18:0x035b, B:23:0x004a, B:24:0x005d, B:26:0x0315, B:28:0x031b, B:34:0x0058, B:36:0x006e, B:37:0x028c, B:39:0x0294, B:42:0x02bf, B:44:0x007d, B:46:0x0255, B:48:0x025b, B:52:0x0099, B:54:0x00aa, B:55:0x01f0, B:57:0x01f8, B:61:0x00b9, B:63:0x01b7, B:65:0x01bd, B:69:0x00cb, B:70:0x014d, B:71:0x00d0, B:72:0x012c, B:74:0x0135, B:77:0x0151, B:79:0x0157, B:81:0x017f, B:83:0x0187, B:84:0x0198, B:88:0x0194, B:89:0x0222, B:93:0x02c4, B:95:0x02cf, B:98:0x02f1, B:102:0x00d7, B:106:0x0104, B:108:0x010a, B:109:0x0120, B:113:0x0389, B:114:0x0390), top: B:2:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01f8 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:11:0x002f, B:12:0x0385, B:14:0x0041, B:16:0x0355, B:18:0x035b, B:23:0x004a, B:24:0x005d, B:26:0x0315, B:28:0x031b, B:34:0x0058, B:36:0x006e, B:37:0x028c, B:39:0x0294, B:42:0x02bf, B:44:0x007d, B:46:0x0255, B:48:0x025b, B:52:0x0099, B:54:0x00aa, B:55:0x01f0, B:57:0x01f8, B:61:0x00b9, B:63:0x01b7, B:65:0x01bd, B:69:0x00cb, B:70:0x014d, B:71:0x00d0, B:72:0x012c, B:74:0x0135, B:77:0x0151, B:79:0x0157, B:81:0x017f, B:83:0x0187, B:84:0x0198, B:88:0x0194, B:89:0x0222, B:93:0x02c4, B:95:0x02cf, B:98:0x02f1, B:102:0x00d7, B:106:0x0104, B:108:0x010a, B:109:0x0120, B:113:0x0389, B:114:0x0390), top: B:2:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01bd A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:11:0x002f, B:12:0x0385, B:14:0x0041, B:16:0x0355, B:18:0x035b, B:23:0x004a, B:24:0x005d, B:26:0x0315, B:28:0x031b, B:34:0x0058, B:36:0x006e, B:37:0x028c, B:39:0x0294, B:42:0x02bf, B:44:0x007d, B:46:0x0255, B:48:0x025b, B:52:0x0099, B:54:0x00aa, B:55:0x01f0, B:57:0x01f8, B:61:0x00b9, B:63:0x01b7, B:65:0x01bd, B:69:0x00cb, B:70:0x014d, B:71:0x00d0, B:72:0x012c, B:74:0x0135, B:77:0x0151, B:79:0x0157, B:81:0x017f, B:83:0x0187, B:84:0x0198, B:88:0x0194, B:89:0x0222, B:93:0x02c4, B:95:0x02cf, B:98:0x02f1, B:102:0x00d7, B:106:0x0104, B:108:0x010a, B:109:0x0120, B:113:0x0389, B:114:0x0390), top: B:2:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0135 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:11:0x002f, B:12:0x0385, B:14:0x0041, B:16:0x0355, B:18:0x035b, B:23:0x004a, B:24:0x005d, B:26:0x0315, B:28:0x031b, B:34:0x0058, B:36:0x006e, B:37:0x028c, B:39:0x0294, B:42:0x02bf, B:44:0x007d, B:46:0x0255, B:48:0x025b, B:52:0x0099, B:54:0x00aa, B:55:0x01f0, B:57:0x01f8, B:61:0x00b9, B:63:0x01b7, B:65:0x01bd, B:69:0x00cb, B:70:0x014d, B:71:0x00d0, B:72:0x012c, B:74:0x0135, B:77:0x0151, B:79:0x0157, B:81:0x017f, B:83:0x0187, B:84:0x0198, B:88:0x0194, B:89:0x0222, B:93:0x02c4, B:95:0x02cf, B:98:0x02f1, B:102:0x00d7, B:106:0x0104, B:108:0x010a, B:109:0x0120, B:113:0x0389, B:114:0x0390), top: B:2:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0151 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:11:0x002f, B:12:0x0385, B:14:0x0041, B:16:0x0355, B:18:0x035b, B:23:0x004a, B:24:0x005d, B:26:0x0315, B:28:0x031b, B:34:0x0058, B:36:0x006e, B:37:0x028c, B:39:0x0294, B:42:0x02bf, B:44:0x007d, B:46:0x0255, B:48:0x025b, B:52:0x0099, B:54:0x00aa, B:55:0x01f0, B:57:0x01f8, B:61:0x00b9, B:63:0x01b7, B:65:0x01bd, B:69:0x00cb, B:70:0x014d, B:71:0x00d0, B:72:0x012c, B:74:0x0135, B:77:0x0151, B:79:0x0157, B:81:0x017f, B:83:0x0187, B:84:0x0198, B:88:0x0194, B:89:0x0222, B:93:0x02c4, B:95:0x02cf, B:98:0x02f1, B:102:0x00d7, B:106:0x0104, B:108:0x010a, B:109:0x0120, B:113:0x0389, B:114:0x0390), top: B:2:0x0011 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 986
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: rj.a.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.service.FavoriteControllerImpl", f = "WordFavoriteService.kt", i = {0, 0}, l = {351}, m = "updateFavorites-0E7RQCE", n = {"word", "bookIds"}, s = {"L$0", "L$1"}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f84217a;

        /* renamed from: b, reason: collision with root package name */
        public Object f84218b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84219c;

        /* renamed from: e, reason: collision with root package name */
        public int f84221e;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f84219c = obj;
            this.f84221e |= Integer.MIN_VALUE;
            Object t02 = a.this.t0(null, null, this);
            return t02 == kotlin.coroutines.intrinsics.b.l() ? t02 : Result.m6307boximpl(t02);
        }
    }

    public a(@k q wordBookManager, @k m0 coroutineDispatcher) {
        g0.p(wordBookManager, "wordBookManager");
        g0.p(coroutineDispatcher, "coroutineDispatcher");
        this.f84161a = wordBookManager;
        this.f84162b = coroutineDispatcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object r0(a aVar, List list, Set set, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            set = w1.k();
        }
        return aVar.q0(list, set, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object u0(a aVar, e0 e0Var, Set set, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            set = w1.k();
        }
        return aVar.t0(e0Var, set, cVar);
    }

    @Override // ij.m
    @k
    public Set<Integer> C() {
        return this.f84161a.C();
    }

    @Override // ij.e
    @k
    public LiveData<Throwable> F(boolean z11, @k List<Long> bookIds, @k e0... words) {
        g0.p(bookIds, "bookIds");
        g0.p(words, "words");
        return CoroutineLiveDataKt.liveData$default(this.f84162b, 0L, new c(z11, this, words, bookIds, null), 2, (Object) null);
    }

    @Override // ij.e
    @k
    public LiveData<pj.b> M(boolean z11, @k e0... words) {
        g0.p(words, "words");
        return CoroutineLiveDataKt.liveData$default(this.f84162b, 0L, new g(z11, words, this, null), 2, (Object) null);
    }

    @Override // ij.t
    @k
    public q O() {
        return this.f84161a;
    }

    @Override // ij.e
    @k
    public LiveData<dg.d<List<FavoriteInfo>>> d0(long j11) {
        return s0(new f(j11, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0284, code lost:
    
        if (r3 != null) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:8:0x002c, B:94:0x00ce], limit reached: 103 */
    /* JADX WARN: Path cross not found for [B:94:0x00ce, B:8:0x002c], limit reached: 103 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119 A[LOOP:3: B:89:0x0113->B:91:0x0119, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ce  */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01e7 -> B:53:0x01f4). Please report as a decompilation issue!!! */
    @Override // ij.e
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(long r31, @m80.k j00.c<? super java.util.List<com.baicizhan.main.word_book.data.FavoriteInfo>> r33) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rj.a.o(long, j00.c):java.lang.Object");
    }

    @Override // ij.m
    public void q(@k ij.h topics) {
        g0.p(topics, "topics");
        this.f84161a.q(topics);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q0(java.util.List<ij.e0> r10, java.util.Set<java.lang.Long> r11, j00.c<? super kotlin.Result<java.lang.Boolean>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof rj.a.C1051a
            if (r0 == 0) goto L13
            r0 = r12
            rj.a$a r0 = (rj.a.C1051a) r0
            int r1 = r0.f84167e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f84167e = r1
            goto L18
        L13:
            rj.a$a r0 = new rj.a$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f84165c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f84167e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r10 = r0.f84164b
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r10 = r0.f84163a
            java.util.List r10 = (java.util.List) r10
            kotlin.e.n(r12)
            kotlin.Result r12 = (kotlin.Result) r12
            java.lang.Object r10 = r12.m6317unboximpl()
            return r10
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            kotlin.e.n(r12)
            ij.q r12 = r9.f84161a
            r2 = r10
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = a00.i0.d0(r2, r5)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L56:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r2.next()
            ij.e0 r5 = (ij.e0) r5
            r6 = 0
            r8 = 0
            ij.c0 r5 = ij.c.f(r5, r6, r3, r8)
            r4.add(r5)
            goto L56
        L6d:
            java.lang.Object r10 = l00.k.a(r10)
            r0.f84163a = r10
            java.lang.Object r10 = l00.k.a(r11)
            r0.f84164b = r10
            r0.f84167e = r3
            java.lang.Object r10 = r12.i(r11, r4, r0)
            if (r10 != r1) goto L82
            return r1
        L82:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rj.a.q0(java.util.List, java.util.Set, j00.c):java.lang.Object");
    }

    @Override // ij.m
    public void reset() {
        this.f84161a.reset();
    }

    public final <T> LiveData<dg.d<T>> s0(x00.l<? super j00.c<? super T>, ? extends Object> lVar) {
        return CoroutineLiveDataKt.liveData$default(this.f84162b, 0L, new b(lVar, null), 2, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t0(ij.e0 r7, java.util.Set<java.lang.Long> r8, j00.c<? super kotlin.Result<java.lang.Boolean>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof rj.a.h
            if (r0 == 0) goto L13
            r0 = r9
            rj.a$h r0 = (rj.a.h) r0
            int r1 = r0.f84221e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f84221e = r1
            goto L18
        L13:
            rj.a$h r0 = new rj.a$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f84219c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f84221e
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.f84218b
            java.util.Set r7 = (java.util.Set) r7
            java.lang.Object r7 = r0.f84217a
            ij.e0 r7 = (ij.e0) r7
            kotlin.e.n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r7 = r9.m6317unboximpl()
            return r7
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.e.n(r9)
            ij.q r9 = r6.f84161a
            r4 = 0
            r2 = 0
            ij.c0 r2 = ij.c.f(r7, r4, r3, r2)
            java.lang.Object r7 = l00.k.a(r7)
            r0.f84217a = r7
            java.lang.Object r7 = l00.k.a(r8)
            r0.f84218b = r7
            r0.f84221e = r3
            java.lang.Object r7 = r9.c0(r2, r8, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rj.a.t0(ij.e0, java.util.Set, j00.c):java.lang.Object");
    }

    @Override // ij.g
    @l
    public Object u(@k j00.c<? super g2> cVar) {
        return this.f84161a.u(cVar);
    }

    public /* synthetic */ a(q qVar, m0 m0Var, int i11, v vVar) {
        this(qVar, (i11 & 2) != 0 ? h1.c() : m0Var);
    }
}
