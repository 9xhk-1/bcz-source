package e40;

import c40.a3;
import c40.b2;
import c40.h1;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.TickerMode;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTickerChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TickerChannels.kt\nkotlinx/coroutines/channels/TickerChannelsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
/* loaded from: classes8.dex */
public final class m0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {102, 104, 105}, m = "fixedDelayTicker", n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f49099a;

        /* renamed from: b, reason: collision with root package name */
        public Object f49100b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49101c;

        /* renamed from: d, reason: collision with root package name */
        public int f49102d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f49101c = obj;
            this.f49102d |= Integer.MIN_VALUE;
            return m0.c(0L, 0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {80, 84, 90, 92}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f49103a;

        /* renamed from: b, reason: collision with root package name */
        public long f49104b;

        /* renamed from: c, reason: collision with root package name */
        public Object f49105c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f49106d;

        /* renamed from: e, reason: collision with root package name */
        public int f49107e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f49106d = obj;
            this.f49107e |= Integer.MIN_VALUE;
            return m0.d(0L, 0L, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {68, 69}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements x00.p<i0<? super g2>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f49108a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f49109b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TickerMode f49110c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f49111d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f49112e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f49113a;

            static {
                int[] iArr = new int[TickerMode.values().length];
                try {
                    iArr[TickerMode.FIXED_PERIOD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TickerMode.FIXED_DELAY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f49113a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TickerMode tickerMode, long j11, long j12, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f49110c = tickerMode;
            this.f49111d = j11;
            this.f49112e = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(this.f49110c, this.f49111d, this.f49112e, cVar);
            cVar2.f49109b = obj;
            return cVar2;
        }

        @Override // x00.p
        public final Object invoke(i0<? super g2> i0Var, j00.c<? super g2> cVar) {
            return ((c) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        
            if (e40.m0.c(r4, r6, r8, r10) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
        
            if (e40.m0.d(r1, r3, r11, r10) == r0) goto L20;
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
                int r1 = r10.f49108a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.e.n(r11)
                r6 = r10
                goto L62
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                kotlin.e.n(r11)
                goto L62
            L1f:
                kotlin.e.n(r11)
                java.lang.Object r11 = r10.f49109b
                e40.i0 r11 = (e40.i0) r11
                kotlinx.coroutines.channels.TickerMode r1 = r10.f49110c
                int[] r4 = e40.m0.c.a.f49113a
                int r1 = r1.ordinal()
                r1 = r4[r1]
                if (r1 == r3) goto L4e
                if (r1 != r2) goto L47
                long r4 = r10.f49111d
                long r6 = r10.f49112e
                e40.l0 r8 = r11.getChannel()
                r10.f49108a = r2
                r9 = r10
                java.lang.Object r11 = e40.m0.a(r4, r6, r8, r9)
                r6 = r9
                if (r11 != r0) goto L62
                goto L61
            L47:
                r6 = r10
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            L4e:
                r6 = r10
                long r1 = r6.f49111d
                r5 = r3
                long r3 = r6.f49112e
                e40.l0 r11 = r11.getChannel()
                r6.f49108a = r5
                r5 = r11
                java.lang.Object r11 = e40.m0.b(r1, r3, r5, r6)
                if (r11 != r0) goto L62
            L61:
                return r0
            L62:
                yz.g2 r11 = yz.g2.f100423a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: e40.m0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007d, code lost:
    
        if (c40.a1.b(r6, r0) != r1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (c40.a1.b(r8, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007d -> B:12:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r6, long r8, e40.l0<? super yz.g2> r10, j00.c<? super yz.g2> r11) {
        /*
            boolean r0 = r11 instanceof e40.m0.a
            if (r0 == 0) goto L13
            r0 = r11
            e40.m0$a r0 = (e40.m0.a) r0
            int r1 = r0.f49102d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49102d = r1
            goto L18
        L13:
            e40.m0$a r0 = new e40.m0$a
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f49101c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f49102d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L53
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            long r6 = r0.f49099a
            java.lang.Object r8 = r0.f49100b
            e40.l0 r8 = (e40.l0) r8
            kotlin.e.n(r11)
        L34:
            r10 = r8
            goto L63
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            long r6 = r0.f49099a
            java.lang.Object r8 = r0.f49100b
            e40.l0 r8 = (e40.l0) r8
            kotlin.e.n(r11)
            goto L73
        L48:
            long r6 = r0.f49099a
            java.lang.Object r8 = r0.f49100b
            r10 = r8
            e40.l0 r10 = (e40.l0) r10
            kotlin.e.n(r11)
            goto L63
        L53:
            kotlin.e.n(r11)
            r0.f49100b = r10
            r0.f49099a = r6
            r0.f49102d = r5
            java.lang.Object r8 = c40.a1.b(r8, r0)
            if (r8 != r1) goto L63
            goto L7f
        L63:
            yz.g2 r8 = yz.g2.f100423a
            r0.f49100b = r10
            r0.f49099a = r6
            r0.f49102d = r4
            java.lang.Object r8 = r10.b(r8, r0)
            if (r8 != r1) goto L72
            goto L7f
        L72:
            r8 = r10
        L73:
            r0.f49100b = r8
            r0.f49099a = r6
            r0.f49102d = r3
            java.lang.Object r9 = c40.a1.b(r6, r0)
            if (r9 != r1) goto L34
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.m0.c(long, long, e40.l0, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fa, code lost:
    
        if (c40.a1.b(r4, r1) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0113, code lost:
    
        if (c40.a1.b(r4, r1) != r2) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00fd -> B:15:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0113 -> B:13:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(long r18, long r20, e40.l0<? super yz.g2> r22, j00.c<? super yz.g2> r23) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.m0.d(long, long, e40.l0, j00.c):java.lang.Object");
    }

    @a3
    @m80.k
    public static final k0<g2> e(long j11, long j12, @m80.k kotlin.coroutines.d dVar, @m80.k TickerMode tickerMode) {
        if (j11 < 0) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j11 + " ms").toString());
        }
        if (j12 >= 0) {
            return g0.g(b2.f7824a, h1.g().plus(dVar), 0, new c(tickerMode, j11, j12, null));
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j12 + " ms").toString());
    }

    public static /* synthetic */ k0 f(long j11, long j12, kotlin.coroutines.d dVar, TickerMode tickerMode, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j12 = j11;
        }
        if ((i11 & 4) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 8) != 0) {
            tickerMode = TickerMode.FIXED_PERIOD;
        }
        return e(j11, j12, dVar, tickerMode);
    }
}
