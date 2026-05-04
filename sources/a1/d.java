package a1;

import androidx.compose.animation.core.InfiniteAnimationPolicyKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import c40.l2;
import c40.n2;
import c40.r0;
import c40.x2;
import com.airbnb.lottie.compose.LottieCancellationBehavior;
import com.jiongji.andriod.card.R;
import g10.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes3.dex */
public final class d implements a1.c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MutableState f1191a = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableState f1192b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableState f1193c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableState f1194d = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableState f1195e = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableState f1196f = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableState f1197g = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableState f1198h = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Long.MIN_VALUE, null, 2, null);

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final State f1199i = SnapshotStateKt.derivedStateOf(new C0004d());

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final State f1200j = SnapshotStateKt.derivedStateOf(new e());

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final MutatorMutex f1201k = new MutatorMutex();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", i = {}, l = {R.styleable.Theme_drawable_test_nodate}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f1202a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f1204c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f1205d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f1206e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ h f1207f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.k f1208g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f1209h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f1210i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ LottieCancellationBehavior f1211j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2$1", f = "LottieAnimatable.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: a1.d$a$a, reason: collision with other inner class name */
        public static final class C0002a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f1212a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LottieCancellationBehavior f1213b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l2 f1214c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ int f1215d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f1216e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ d f1217f;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: a1.d$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0003a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f1218a;

                static {
                    int[] iArr = new int[LottieCancellationBehavior.values().length];
                    iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
                    f1218a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0002a(LottieCancellationBehavior lottieCancellationBehavior, l2 l2Var, int i11, int i12, d dVar, j00.c<? super C0002a> cVar) {
                super(2, cVar);
                this.f1213b = lottieCancellationBehavior;
                this.f1214c = l2Var;
                this.f1215d = i11;
                this.f1216e = i12;
                this.f1217f = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @m80.k
            public final j00.c<g2> create(@m80.l Object obj, @m80.k j00.c<?> cVar) {
                return new C0002a(this.f1213b, this.f1214c, this.f1215d, this.f1216e, this.f1217f, cVar);
            }

            @Override // x00.p
            @m80.l
            public final Object invoke(@m80.k r0 r0Var, @m80.l j00.c<? super g2> cVar) {
                return ((C0002a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:5:0x0041). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @m80.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r3.f1212a
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    kotlin.e.n(r4)
                    goto L41
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    kotlin.e.n(r4)
                L1a:
                    com.airbnb.lottie.compose.LottieCancellationBehavior r4 = r3.f1213b
                    int[] r1 = a1.d.a.C0002a.C0003a.f1218a
                    int r4 = r4.ordinal()
                    r4 = r1[r4]
                    if (r4 != r2) goto L34
                    c40.l2 r4 = r3.f1214c
                    boolean r4 = r4.isActive()
                    if (r4 == 0) goto L31
                    int r4 = r3.f1215d
                    goto L36
                L31:
                    int r4 = r3.f1216e
                    goto L36
                L34:
                    int r4 = r3.f1215d
                L36:
                    a1.d r1 = r3.f1217f
                    r3.f1212a = r2
                    java.lang.Object r4 = a1.d.c(r1, r4, r3)
                    if (r4 != r0) goto L41
                    return r0
                L41:
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 != 0) goto L1a
                    yz.g2 r4 = yz.g2.f100423a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: a1.d.a.C0002a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1219a;

            static {
                int[] iArr = new int[LottieCancellationBehavior.values().length];
                iArr[LottieCancellationBehavior.OnIterationFinish.ordinal()] = 1;
                iArr[LottieCancellationBehavior.Immediately.ordinal()] = 2;
                f1219a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, int i12, float f11, h hVar, com.airbnb.lottie.k kVar, float f12, boolean z11, LottieCancellationBehavior lottieCancellationBehavior, j00.c<? super a> cVar) {
            super(1, cVar);
            this.f1204c = i11;
            this.f1205d = i12;
            this.f1206e = f11;
            this.f1207f = hVar;
            this.f1208g = kVar;
            this.f1209h = f12;
            this.f1210i = z11;
            this.f1211j = lottieCancellationBehavior;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.k
        public final j00.c<g2> create(@m80.k j00.c<?> cVar) {
            return d.this.new a(this.f1204c, this.f1205d, this.f1206e, this.f1207f, this.f1208g, this.f1209h, this.f1210i, this.f1211j, cVar);
        }

        @Override // x00.l
        @m80.l
        public final Object invoke(@m80.l j00.c<? super g2> cVar) {
            return ((a) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            kotlin.coroutines.d dVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f1202a;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    d.this.B(this.f1204c);
                    d.this.C(this.f1205d);
                    d.this.G(this.f1206e);
                    d.this.z(this.f1207f);
                    d.this.A(this.f1208g);
                    d.this.F(this.f1209h);
                    if (!this.f1210i) {
                        d.this.D(Long.MIN_VALUE);
                    }
                    if (this.f1208g == null) {
                        d.this.E(false);
                        return g2.f100423a;
                    }
                    if (Float.isInfinite(this.f1206e)) {
                        d dVar2 = d.this;
                        dVar2.F(dVar2.x());
                        d.this.E(false);
                        d.this.B(this.f1205d);
                        return g2.f100423a;
                    }
                    d.this.E(true);
                    int i12 = b.f1219a[this.f1211j.ordinal()];
                    if (i12 == 1) {
                        dVar = x2.f8011a;
                    } else {
                        if (i12 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVar = EmptyCoroutineContext.INSTANCE;
                    }
                    C0002a c0002a = new C0002a(this.f1211j, n2.A(getContext()), this.f1205d, this.f1204c, d.this, null);
                    this.f1202a = 1;
                    if (c40.i.h(dVar, c0002a, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                n2.z(getContext());
                d.this.E(false);
                return g2.f100423a;
            } catch (Throwable th2) {
                d.this.E(false);
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.l<Long, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1221b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11) {
            super(1);
            this.f1221b = i11;
        }

        @m80.k
        public final Boolean a(long j11) {
            return Boolean.valueOf(d.this.y(this.f1221b, j11));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Boolean invoke(Long l11) {
            return a(l11.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.l<Long, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1223b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i11) {
            super(1);
            this.f1223b = i11;
        }

        @m80.k
        public final Boolean a(long j11) {
            return Boolean.valueOf(d.this.y(this.f1223b, j11));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Boolean invoke(Long l11) {
            return a(l11.longValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: a1.d$d, reason: collision with other inner class name */
    public static final class C0004d extends Lambda implements x00.a<Float> {
        public C0004d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Float invoke() {
            com.airbnb.lottie.k composition = d.this.getComposition();
            float f11 = 0.0f;
            if (composition != null) {
                if (d.this.e() < 0.0f) {
                    h p11 = d.this.p();
                    if (p11 != null) {
                        f11 = p11.b(composition);
                    }
                } else {
                    h p12 = d.this.p();
                    f11 = p12 == null ? 1.0f : p12.a(composition);
                }
            }
            return Float.valueOf(f11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends Lambda implements x00.a<Boolean> {
        public e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(d.this.o() == d.this.d() && d.this.getProgress() == d.this.x());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f1226a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.k f1228c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f1229d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f1230e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f1231f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.airbnb.lottie.k kVar, float f11, int i11, boolean z11, j00.c<? super f> cVar) {
            super(1, cVar);
            this.f1228c = kVar;
            this.f1229d = f11;
            this.f1230e = i11;
            this.f1231f = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.k
        public final j00.c<g2> create(@m80.k j00.c<?> cVar) {
            return d.this.new f(this.f1228c, this.f1229d, this.f1230e, this.f1231f, cVar);
        }

        @Override // x00.l
        @m80.l
        public final Object invoke(@m80.l j00.c<? super g2> cVar) {
            return ((f) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f1226a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            d.this.A(this.f1228c);
            d.this.F(this.f1229d);
            d.this.B(this.f1230e);
            d.this.E(false);
            if (this.f1231f) {
                d.this.D(Long.MIN_VALUE);
            }
            return g2.f100423a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(com.airbnb.lottie.k kVar) {
        this.f1197g.setValue(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(boolean z11) {
        this.f1191a.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(float f11) {
        this.f1192b.setValue(Float.valueOf(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(float f11) {
        this.f1196f.setValue(Float.valueOf(f11));
    }

    public final void B(int i11) {
        this.f1193c.setValue(Integer.valueOf(i11));
    }

    public final void C(int i11) {
        this.f1194d.setValue(Integer.valueOf(i11));
    }

    public final void D(long j11) {
        this.f1198h.setValue(Long.valueOf(j11));
    }

    @Override // a1.g
    public boolean a() {
        return ((Boolean) this.f1200j.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a1.g
    public long b() {
        return ((Number) this.f1198h.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a1.g
    public int d() {
        return ((Number) this.f1194d.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a1.g
    public float e() {
        return ((Number) this.f1196f.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a1.g
    @m80.l
    public com.airbnb.lottie.k getComposition() {
        return (com.airbnb.lottie.k) this.f1197g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a1.g
    public float getProgress() {
        return ((Number) this.f1192b.getValue()).floatValue();
    }

    @Override // a1.c
    @m80.l
    public Object h(@m80.l com.airbnb.lottie.k kVar, float f11, int i11, boolean z11, @m80.k j00.c<? super g2> cVar) {
        Object mutate$default = MutatorMutex.mutate$default(this.f1201k, null, new f(kVar, f11, i11, z11, null), cVar, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.b.l() ? mutate$default : g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a1.g
    public boolean isPlaying() {
        return ((Boolean) this.f1191a.getValue()).booleanValue();
    }

    @Override // a1.c
    @m80.l
    public Object n(@m80.l com.airbnb.lottie.k kVar, int i11, int i12, float f11, @m80.l h hVar, float f12, boolean z11, @m80.k LottieCancellationBehavior lottieCancellationBehavior, boolean z12, @m80.k j00.c<? super g2> cVar) {
        Object mutate$default = MutatorMutex.mutate$default(this.f1201k, null, new a(i11, i12, f11, hVar, kVar, f12, z11, lottieCancellationBehavior, null), cVar, 1, null);
        return mutate$default == kotlin.coroutines.intrinsics.b.l() ? mutate$default : g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a1.g
    public int o() {
        return ((Number) this.f1193c.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a1.g
    @m80.l
    public h p() {
        return (h) this.f1195e.getValue();
    }

    public final Object w(int i11, j00.c<? super Boolean> cVar) {
        return i11 == Integer.MAX_VALUE ? InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(new b(i11), cVar) : MonotonicFrameClockKt.withFrameNanos(new c(i11), cVar);
    }

    public final float x() {
        return ((Number) this.f1199i.getValue()).floatValue();
    }

    public final boolean y(int i11, long j11) {
        com.airbnb.lottie.k composition = getComposition();
        if (composition == null) {
            return true;
        }
        long b11 = b() == Long.MIN_VALUE ? 0L : j11 - b();
        D(j11);
        h p11 = p();
        float b12 = p11 == null ? 0.0f : p11.b(composition);
        h p12 = p();
        float a11 = p12 == null ? 1.0f : p12.a(composition);
        float d11 = ((b11 / 1000000) / composition.d()) * e();
        float progress = e() < 0.0f ? b12 - (getProgress() + d11) : (getProgress() + d11) - a11;
        if (progress < 0.0f) {
            F(u.H(getProgress(), b12, a11) + d11);
        } else {
            float f11 = a11 - b12;
            int i12 = (int) (progress / f11);
            int i13 = i12 + 1;
            if (o() + i13 > i11) {
                F(x());
                B(i11);
                return false;
            }
            B(o() + i13);
            float f12 = progress - (i12 * f11);
            F(e() < 0.0f ? a11 - f12 : b12 + f12);
        }
        return true;
    }

    public final void z(h hVar) {
        this.f1195e.setValue(hVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    @m80.k
    public Float getValue() {
        return Float.valueOf(getProgress());
    }
}
