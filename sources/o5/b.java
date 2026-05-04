package o5;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import c4.o;
import c40.i;
import c40.r0;
import com.baicizhan.app.biz.game.repo.gameversion.ResourceId;
import f4.b4;
import f4.i4;
import f4.v;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import oa0.r;
import p8.a1;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {o5.a.class})
@u0({"SMAP\nVersionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VersionProvider.kt\ncom/baicizhan/app/biz/game/repo/gameversion/VersionProviderImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n1#2:140\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements o5.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h4.c f75857a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.gameversion.VersionProviderImpl$getVersionInfo$2", f = "VersionProvider.kt", i = {}, l = {31, 33}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super Pair<? extends Long, ? extends Long>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75858a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f75860c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ResourceId f75861d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j11, ResourceId resourceId, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f75860c = j11;
            this.f75861d = resourceId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new a(this.f75860c, this.f75861d, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super Pair<Long, Long>> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        
            if (r7 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f75858a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r7)
                goto L54
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                kotlin.e.n(r7)
                goto L30
            L1e:
                kotlin.e.n(r7)
                o5.b r7 = o5.b.this
                h4.c r7 = o5.b.g(r7)
                r6.f75858a = r3
                java.lang.Object r7 = r7.a(r6)
                if (r7 != r0) goto L30
                goto L53
            L30:
                f4.v r7 = (f4.v) r7
                f4.i4 r7 = r7.q()
                long r3 = r6.f75860c
                java.util.Map r1 = o5.c.a()
                com.baicizhan.app.biz.game.repo.gameversion.ResourceId r5 = r6.f75861d
                java.lang.Object r1 = r1.get(r5)
                kotlin.jvm.internal.g0.m(r1)
                java.lang.String r1 = (java.lang.String) r1
                j.j r7 = r7.U(r3, r1)
                r6.f75858a = r2
                java.lang.Object r7 = k.e.f(r7, r6)
                if (r7 != r0) goto L54
            L53:
                return r0
            L54:
                f4.b4 r7 = (f4.b4) r7
                if (r7 == 0) goto L6e
                kotlin.Pair r0 = new kotlin.Pair
                long r1 = r7.j()
                java.lang.Long r1 = l00.a.g(r1)
                long r2 = r7.k()
                java.lang.Long r7 = l00.a.g(r2)
                r0.<init>(r1, r7)
                return r0
            L6e:
                kotlin.Pair r7 = new kotlin.Pair
                r0 = 0
                java.lang.Long r2 = l00.a.g(r0)
                java.lang.Long r0 = l00.a.g(r0)
                r7.<init>(r2, r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Pair<? extends Long, ? extends Long>> cVar) {
            return invoke2(r0Var, (j00.c<? super Pair<Long, Long>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.gameversion.VersionProviderImpl", f = "VersionProvider.kt", i = {0, 0, 1, 1}, l = {101, 104}, m = "hasLocalVersion", n = {"resourceId", "bookId", "resourceId", "bookId"}, s = {"L$0", "J$0", "L$0", "J$0"}, v = 1)
    /* renamed from: o5.b$b, reason: collision with other inner class name */
    public static final class C0926b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f75862a;

        /* renamed from: b, reason: collision with root package name */
        public Object f75863b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f75864c;

        /* renamed from: e, reason: collision with root package name */
        public int f75866e;

        public C0926b(j00.c<? super C0926b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f75864c = obj;
            this.f75866e |= Integer.MIN_VALUE;
            return b.this.f(0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.gameversion.VersionProviderImpl", f = "VersionProvider.kt", i = {0, 1}, l = {108, 110}, m = "invalidate", n = {"resourceId", "resourceId"}, s = {"L$0", "L$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f75867a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f75868b;

        /* renamed from: d, reason: collision with root package name */
        public int f75870d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f75868b = obj;
            this.f75870d |= Integer.MIN_VALUE;
            return b.this.e(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.gameversion.VersionProviderImpl$needUpdate$2", f = "VersionProvider.kt", i = {}, l = {84, 86}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements p<r0, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f75871a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f75873c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ResourceId f75874d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j11, ResourceId resourceId, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f75873c = j11;
            this.f75874d = resourceId;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new d(this.f75873c, this.f75874d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super Boolean> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        
            if (r11 == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x002d, code lost:
        
            if (r11 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f75871a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r11)
                goto L54
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.e.n(r11)
                goto L30
            L1e:
                kotlin.e.n(r11)
                o5.b r11 = o5.b.this
                h4.c r11 = o5.b.g(r11)
                r10.f75871a = r3
                java.lang.Object r11 = r11.a(r10)
                if (r11 != r0) goto L30
                goto L53
            L30:
                f4.v r11 = (f4.v) r11
                f4.i4 r11 = r11.q()
                long r4 = r10.f75873c
                java.util.Map r1 = o5.c.a()
                com.baicizhan.app.biz.game.repo.gameversion.ResourceId r6 = r10.f75874d
                java.lang.Object r1 = r1.get(r6)
                kotlin.jvm.internal.g0.m(r1)
                java.lang.String r1 = (java.lang.String) r1
                j.j r11 = r11.U(r4, r1)
                r10.f75871a = r2
                java.lang.Object r11 = k.e.f(r11, r10)
                if (r11 != r0) goto L54
            L53:
                return r0
            L54:
                f4.b4 r11 = (f4.b4) r11
                java.lang.String r0 = ", resourceId = "
                java.lang.String r1 = "needUpdate: bookId = "
                if (r11 != 0) goto L89
                z6.b r4 = z6.b.f101032b
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r1)
                long r1 = r10.f75873c
                r11.append(r1)
                r11.append(r0)
                com.baicizhan.app.biz.game.repo.gameversion.ResourceId r0 = r10.f75874d
                r11.append(r0)
                java.lang.String r0 = ", record is null"
                r11.append(r0)
                java.lang.String r6 = r11.toString()
                r8 = 4
                r9 = 0
                java.lang.String r5 = "VersionProvider"
                r7 = 0
                z6.b.j(r4, r5, r6, r7, r8, r9)
                java.lang.Boolean r11 = l00.a.a(r3)
                return r11
            L89:
                z6.b r4 = z6.b.f101032b
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                long r5 = r10.f75873c
                r2.append(r5)
                r2.append(r0)
                com.baicizhan.app.biz.game.repo.gameversion.ResourceId r0 = r10.f75874d
                r2.append(r0)
                java.lang.String r0 = ", "
                r2.append(r0)
                long r0 = r11.j()
                r2.append(r0)
                java.lang.String r0 = " -- "
                r2.append(r0)
                long r5 = r11.k()
                r2.append(r5)
                r2.append(r0)
                long r0 = r11.j()
                long r5 = r11.k()
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                r1 = 0
                if (r0 >= 0) goto Lca
                r0 = r3
                goto Lcb
            Lca:
                r0 = r1
            Lcb:
                r2.append(r0)
                java.lang.String r6 = r2.toString()
                r8 = 4
                r9 = 0
                java.lang.String r5 = "VersionProvider"
                r7 = 0
                z6.b.j(r4, r5, r6, r7, r8, r9)
                long r4 = r11.j()
                long r6 = r11.k()
                int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r11 >= 0) goto Le7
                goto Le8
            Le7:
                r3 = r1
            Le8:
                java.lang.Boolean r11 = l00.a.a(r3)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.gameversion.VersionProviderImpl", f = "VersionProvider.kt", i = {0, 0, 1, 1}, l = {118, 120}, m = "queryOrCreateVersionInfo", n = {"resourceId", "bookId", "resourceId", "bookId"}, s = {"L$0", "J$0", "L$0", "J$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f75875a;

        /* renamed from: b, reason: collision with root package name */
        public Object f75876b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f75877c;

        /* renamed from: e, reason: collision with root package name */
        public int f75879e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f75877c = obj;
            this.f75879e |= Integer.MIN_VALUE;
            return b.this.i(0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.gameversion.VersionProviderImpl$updateLocal$2", f = "VersionProvider.kt", i = {1, 1, 2, 2, 2}, l = {71, 72, 76}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-VersionProviderImpl$updateLocal$2$1", "$this$invokeSuspend_u24lambda_u240", TypedValues.AttributesType.S_TARGET, "$i$a$-apply-VersionProviderImpl$updateLocal$2$1"}, s = {"L$1", "I$0", "L$1", "L$2", "I$0"}, v = 1)
    public static final class f extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f75880a;

        /* renamed from: b, reason: collision with root package name */
        public Object f75881b;

        /* renamed from: c, reason: collision with root package name */
        public Object f75882c;

        /* renamed from: d, reason: collision with root package name */
        public long f75883d;

        /* renamed from: e, reason: collision with root package name */
        public int f75884e;

        /* renamed from: f, reason: collision with root package name */
        public int f75885f;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f75887h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ResourceId f75888i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f75889j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j11, ResourceId resourceId, long j12, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f75887h = j11;
            this.f75888i = resourceId;
            this.f75889j = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new f(this.f75887h, this.f75888i, this.f75889j, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x00a0, code lost:
        
            if (r6.R(r5, r18) != r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        
            if (r2 == r1) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f75885f
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L41
                if (r2 == r5) goto L3b
                if (r2 == r4) goto L28
                if (r2 != r3) goto L20
                java.lang.Object r1 = r0.f75882c
                f4.b4 r1 = (f4.b4) r1
                java.lang.Object r1 = r0.f75881b
                f4.v r1 = (f4.v) r1
                kotlin.e.n(r19)
                goto La3
            L20:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L28:
                int r2 = r0.f75884e
                long r4 = r0.f75883d
                java.lang.Object r6 = r0.f75881b
                f4.v r6 = (f4.v) r6
                java.lang.Object r7 = r0.f75880a
                kotlin.e.n(r19)
                r11 = r4
                r17 = r6
                r4 = r19
                goto L75
            L3b:
                kotlin.e.n(r19)
                r2 = r19
                goto L53
            L41:
                kotlin.e.n(r19)
                o5.b r2 = o5.b.this
                h4.c r2 = o5.b.g(r2)
                r0.f75885f = r5
                java.lang.Object r2 = r2.a(r0)
                if (r2 != r1) goto L53
                goto La2
            L53:
                o5.b r5 = o5.b.this
                long r6 = r0.f75887h
                com.baicizhan.app.biz.game.repo.gameversion.ResourceId r8 = r0.f75888i
                long r9 = r0.f75889j
                r11 = r2
                f4.v r11 = (f4.v) r11
                r0.f75880a = r2
                r0.f75881b = r11
                r0.f75883d = r9
                r12 = 0
                r0.f75884e = r12
                r0.f75885f = r4
                java.lang.Object r4 = o5.b.h(r5, r6, r8, r0)
                if (r4 != r1) goto L70
                goto La2
            L70:
                r7 = r2
                r17 = r11
                r2 = r12
                r11 = r9
            L75:
                r5 = r4
                f4.b4 r5 = (f4.b4) r5
                r15 = 7
                r16 = 0
                r4 = r7
                r6 = 0
                r8 = 0
                r10 = 0
                r13 = r11
                f4.b4 r5 = f4.b4.g(r5, r6, r8, r10, r11, r13, r15, r16)
                f4.i4 r6 = r17.q()
                r0.f75880a = r4
                java.lang.Object r4 = l00.k.a(r17)
                r0.f75881b = r4
                java.lang.Object r4 = l00.k.a(r5)
                r0.f75882c = r4
                r0.f75884e = r2
                r0.f75885f = r3
                java.lang.Object r2 = r6.R(r5, r0)
                if (r2 != r1) goto La3
            La2:
                return r1
            La3:
                yz.g2 r1 = yz.g2.f100423a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.b.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.repo.gameversion.VersionProviderImpl$updateRemotes$2", f = "VersionProvider.kt", i = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5}, l = {43, 45, 48, 51, 54, 58}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-VersionProviderImpl$updateRemotes$2$1", "$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-VersionProviderImpl$updateRemotes$2$1", "$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-VersionProviderImpl$updateRemotes$2$1", "$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-VersionProviderImpl$updateRemotes$2$1", "$this$invokeSuspend_u24lambda_u240", "versions", "$i$a$-apply-VersionProviderImpl$updateRemotes$2$1"}, s = {"L$3", "I$0", "L$3", "I$0", "L$3", "I$0", "L$2", "I$0", "L$1", "L$2", "I$0"}, v = 1)
    public static final class g extends SuspendLambda implements p<r0, j00.c<? super v>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f75890a;

        /* renamed from: b, reason: collision with root package name */
        public Object f75891b;

        /* renamed from: c, reason: collision with root package name */
        public Object f75892c;

        /* renamed from: d, reason: collision with root package name */
        public Object f75893d;

        /* renamed from: e, reason: collision with root package name */
        public Object f75894e;

        /* renamed from: f, reason: collision with root package name */
        public Object f75895f;

        /* renamed from: g, reason: collision with root package name */
        public long f75896g;

        /* renamed from: h, reason: collision with root package name */
        public int f75897h;

        /* renamed from: i, reason: collision with root package name */
        public int f75898i;

        /* renamed from: j, reason: collision with root package name */
        public int f75899j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f75901l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a1 f75902m;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.game.repo.gameversion.VersionProviderImpl$updateRemotes$2$1$1", f = "VersionProvider.kt", i = {0, 0, 0, 0, 0}, l = {60}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-VersionProviderImpl$updateRemotes$2$1$1$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
        @u0({"SMAP\nVersionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VersionProvider.kt\ncom/baicizhan/app/biz/game/repo/gameversion/VersionProviderImpl$updateRemotes$2$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,139:1\n1869#2,2:140\n*S KotlinDebug\n*F\n+ 1 VersionProvider.kt\ncom/baicizhan/app/biz/game/repo/gameversion/VersionProviderImpl$updateRemotes$2$1$1\n*L\n59#1:140,2\n*E\n"})
        public static final class a extends SuspendLambda implements p<j.r, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f75903a;

            /* renamed from: b, reason: collision with root package name */
            public Object f75904b;

            /* renamed from: c, reason: collision with root package name */
            public Object f75905c;

            /* renamed from: d, reason: collision with root package name */
            public Object f75906d;

            /* renamed from: e, reason: collision with root package name */
            public Object f75907e;

            /* renamed from: f, reason: collision with root package name */
            public int f75908f;

            /* renamed from: g, reason: collision with root package name */
            public int f75909g;

            /* renamed from: h, reason: collision with root package name */
            public int f75910h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ List<b4> f75911i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ v f75912j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<b4> list, v vVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f75911i = list;
                this.f75912j = vVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f75911i, this.f75912j, cVar);
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j.r rVar, j00.c<? super g2> cVar) {
                return ((a) create(rVar, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                Iterable iterable;
                v vVar;
                int i11;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i12 = this.f75910h;
                if (i12 == 0) {
                    kotlin.e.n(obj);
                    List<b4> list = this.f75911i;
                    v vVar2 = this.f75912j;
                    it = list.iterator();
                    iterable = list;
                    vVar = vVar2;
                    i11 = 0;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = this.f75908f;
                    it = (Iterator) this.f75905c;
                    vVar = (v) this.f75904b;
                    iterable = (Iterable) this.f75903a;
                    kotlin.e.n(obj);
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    b4 b4Var = (b4) next;
                    i4 q11 = vVar.q();
                    this.f75903a = l00.k.a(iterable);
                    this.f75904b = vVar;
                    this.f75905c = it;
                    this.f75906d = l00.k.a(next);
                    this.f75907e = l00.k.a(b4Var);
                    this.f75908f = i11;
                    this.f75909g = 0;
                    this.f75910h = 1;
                    if (q11.R(b4Var, this) == l11) {
                        return l11;
                    }
                }
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j11, a1 a1Var, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f75901l = j11;
            this.f75902m = a1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return b.this.new g(this.f75901l, this.f75902m, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super v> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
        
            if (r0 == r6) goto L39;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x020b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x01ca  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0137  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                Method dump skipped, instructions count: 542
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o5.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(@k h4.c bczDb) {
        g0.p(bczDb, "bczDb");
        this.f75857a = bczDb;
    }

    @Override // o5.a
    @l
    public Object a(long j11, @k ResourceId resourceId, @k j00.c<? super Boolean> cVar) {
        return i.h(o.b(), new d(j11, resourceId, null), cVar);
    }

    @Override // o5.a
    @l
    public Object b(long j11, @k ResourceId resourceId, long j12, @k j00.c<? super g2> cVar) {
        z6.b.j(z6.b.f101032b, o5.c.f75913a, "updateLocal: bookId = " + j11 + ", resourceId = " + resourceId + ", version = " + j12, null, 4, null);
        Object h11 = i.h(o.b(), new f(j11, resourceId, j12, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    @Override // o5.a
    @l
    public Object c(long j11, @k ResourceId resourceId, @k j00.c<? super Pair<Long, Long>> cVar) {
        return i.h(o.b(), new a(j11, resourceId, null), cVar);
    }

    @Override // o5.a
    @l
    public Object d(@k a1 a1Var, @k j00.c<? super g2> cVar) {
        long j11 = a1Var.f79659f;
        z6.b.j(z6.b.f101032b, o5.c.f75913a, "updateRemotes: bookId = " + j11, null, 4, null);
        Object h11 = i.h(o.b(), new g(j11, a1Var, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r10 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // o5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@m80.k com.baicizhan.app.biz.game.repo.gameversion.ResourceId r9, @m80.k j00.c<? super yz.g2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof o5.b.c
            if (r0 == 0) goto L13
            r0 = r10
            o5.b$c r0 = (o5.b.c) r0
            int r1 = r0.f75870d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75870d = r1
            goto L18
        L13:
            o5.b$c r0 = new o5.b$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f75868b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f75870d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f75867a
            com.baicizhan.app.biz.game.repo.gameversion.ResourceId r9 = (com.baicizhan.app.biz.game.repo.gameversion.ResourceId) r9
            kotlin.e.n(r10)
            goto L70
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.f75867a
            com.baicizhan.app.biz.game.repo.gameversion.ResourceId r9 = (com.baicizhan.app.biz.game.repo.gameversion.ResourceId) r9
            kotlin.e.n(r10)
            goto L50
        L40:
            kotlin.e.n(r10)
            h4.c r10 = r8.f75857a
            r0.f75867a = r9
            r0.f75870d = r4
            java.lang.Object r10 = r10.a(r0)
            if (r10 != r1) goto L50
            goto L6f
        L50:
            f4.v r10 = (f4.v) r10
            f4.i4 r10 = r10.q()
            java.util.Map r2 = o5.c.a()
            java.lang.Object r2 = r2.get(r9)
            kotlin.jvm.internal.g0.m(r2)
            java.lang.String r2 = (java.lang.String) r2
            r0.f75867a = r9
            r0.f75870d = r3
            r3 = -1
            java.lang.Object r10 = r10.X(r3, r2, r0)
            if (r10 != r1) goto L70
        L6f:
            return r1
        L70:
            java.lang.Number r10 = (java.lang.Number) r10
            long r0 = r10.longValue()
            z6.b r2 = z6.b.f101032b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r3 = "invalidate: resourceId = "
            r10.append(r3)
            r10.append(r9)
            java.lang.String r9 = ", row = "
            r10.append(r9)
            r10.append(r0)
            java.lang.String r4 = r10.toString()
            r6 = 4
            r7 = 0
            java.lang.String r3 = "VersionProvider"
            r5 = 0
            z6.b.j(r2, r3, r4, r5, r6, r7)
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.b.e(com.baicizhan.app.biz.game.repo.gameversion.ResourceId, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // o5.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(long r6, @m80.k com.baicizhan.app.biz.game.repo.gameversion.ResourceId r8, @m80.k j00.c<? super java.lang.Boolean> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof o5.b.C0926b
            if (r0 == 0) goto L13
            r0 = r9
            o5.b$b r0 = (o5.b.C0926b) r0
            int r1 = r0.f75866e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75866e = r1
            goto L18
        L13:
            o5.b$b r0 = new o5.b$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f75864c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f75866e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f75863b
            com.baicizhan.app.biz.game.repo.gameversion.ResourceId r6 = (com.baicizhan.app.biz.game.repo.gameversion.ResourceId) r6
            kotlin.e.n(r9)
            goto L7c
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            long r6 = r0.f75862a
            java.lang.Object r8 = r0.f75863b
            com.baicizhan.app.biz.game.repo.gameversion.ResourceId r8 = (com.baicizhan.app.biz.game.repo.gameversion.ResourceId) r8
            kotlin.e.n(r9)
            goto L54
        L42:
            kotlin.e.n(r9)
            h4.c r9 = r5.f75857a
            r0.f75863b = r8
            r0.f75862a = r6
            r0.f75866e = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L54
            goto L7b
        L54:
            f4.v r9 = (f4.v) r9
            f4.i4 r9 = r9.q()
            java.util.Map r2 = o5.c.a()
            java.lang.Object r2 = r2.get(r8)
            kotlin.jvm.internal.g0.m(r2)
            java.lang.String r2 = (java.lang.String) r2
            j.j r9 = r9.U(r6, r2)
            java.lang.Object r8 = l00.k.a(r8)
            r0.f75863b = r8
            r0.f75862a = r6
            r0.f75866e = r3
            java.lang.Object r9 = k.e.f(r9, r0)
            if (r9 != r1) goto L7c
        L7b:
            return r1
        L7c:
            f4.b4 r9 = (f4.b4) r9
            r6 = 0
            if (r9 == 0) goto L8c
            long r7 = r9.j()
            r0 = -1
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 == 0) goto L8c
            goto L8d
        L8c:
            r4 = r6
        L8d:
            java.lang.Boolean r6 = l00.a.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.b.f(long, com.baicizhan.app.biz.game.repo.gameversion.ResourceId, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(long r13, com.baicizhan.app.biz.game.repo.gameversion.ResourceId r15, j00.c<? super f4.b4> r16) {
        /*
            r12 = this;
            r0 = r16
            boolean r1 = r0 instanceof o5.b.e
            if (r1 == 0) goto L15
            r1 = r0
            o5.b$e r1 = (o5.b.e) r1
            int r2 = r1.f75879e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f75879e = r2
            goto L1a
        L15:
            o5.b$e r1 = new o5.b$e
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f75877c
            java.lang.Object r2 = kotlin.coroutines.intrinsics.b.l()
            int r3 = r1.f75879e
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L47
            if (r3 == r5) goto L3d
            if (r3 != r4) goto L35
            long r2 = r1.f75875a
            java.lang.Object r1 = r1.f75876b
            com.baicizhan.app.biz.game.repo.gameversion.ResourceId r1 = (com.baicizhan.app.biz.game.repo.gameversion.ResourceId) r1
            kotlin.e.n(r0)
            r5 = r2
            goto L80
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            long r5 = r1.f75875a
            java.lang.Object r3 = r1.f75876b
            com.baicizhan.app.biz.game.repo.gameversion.ResourceId r3 = (com.baicizhan.app.biz.game.repo.gameversion.ResourceId) r3
            kotlin.e.n(r0)
            goto L5b
        L47:
            kotlin.e.n(r0)
            h4.c r0 = r12.f75857a
            r3 = r15
            r1.f75876b = r3
            r1.f75875a = r13
            r1.f75879e = r5
            java.lang.Object r0 = r0.a(r1)
            if (r0 != r2) goto L5a
            goto L7e
        L5a:
            r5 = r13
        L5b:
            f4.v r0 = (f4.v) r0
            f4.i4 r0 = r0.q()
            java.util.Map r7 = o5.c.a()
            java.lang.Object r7 = r7.get(r3)
            kotlin.jvm.internal.g0.m(r7)
            java.lang.String r7 = (java.lang.String) r7
            j.j r0 = r0.U(r5, r7)
            r1.f75876b = r3
            r1.f75875a = r5
            r1.f75879e = r4
            java.lang.Object r0 = k.e.f(r0, r1)
            if (r0 != r2) goto L7f
        L7e:
            return r2
        L7f:
            r1 = r3
        L80:
            f4.b4 r0 = (f4.b4) r0
            if (r0 != 0) goto L9e
            f4.b4 r2 = new f4.b4
            java.util.Map r0 = o5.c.a()
            java.lang.Object r0 = r0.get(r1)
            kotlin.jvm.internal.g0.m(r0)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            r8 = -1
            r10 = 0
            r3 = 0
            r2.<init>(r3, r5, r7, r8, r10)
            return r2
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.b.i(long, com.baicizhan.app.biz.game.repo.gameversion.ResourceId, j00.c):java.lang.Object");
    }
}
