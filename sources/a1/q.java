package a1;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import e40.u;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e40.o<g2> f1366a = e40.r.d(1, BufferOverflow.DROP_OLDEST, null, 4, null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableState f1367b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.airbnb.lottie.compose.LottieRetrySignal", f = "LottieRetrySignal.kt", i = {0}, l = {45}, m = "awaitRetry", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f1368a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f1369b;

        /* renamed from: d, reason: collision with root package name */
        public int f1371d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f1369b = obj;
            this.f1371d |= Integer.MIN_VALUE;
            return q.this.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a1.q.a
            if (r0 == 0) goto L13
            r0 = r6
            a1.q$a r0 = (a1.q.a) r0
            int r1 = r0.f1371d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1371d = r1
            goto L18
        L13:
            a1.q$a r0 = new a1.q$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1369b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f1371d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.f1368a
            a1.q r0 = (a1.q) r0
            kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L2e
            goto L4c
        L2e:
            r6 = move-exception
            goto L54
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            kotlin.e.n(r6)
            r5.d(r4)     // Catch: java.lang.Throwable -> L52
            e40.o<yz.g2> r6 = r5.f1366a     // Catch: java.lang.Throwable -> L52
            r0.f1368a = r5     // Catch: java.lang.Throwable -> L52
            r0.f1371d = r4     // Catch: java.lang.Throwable -> L52
            java.lang.Object r6 = r6.H(r0)     // Catch: java.lang.Throwable -> L52
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r5
        L4c:
            r0.d(r3)
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L52:
            r6 = move-exception
            r0 = r5
        L54:
            r0.d(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.q.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.f1367b.getValue()).booleanValue();
    }

    public final void c() {
        u.m0(this.f1366a, g2.f100423a);
    }

    public final void d(boolean z11) {
        this.f1367b.setValue(Boolean.valueOf(z11));
    }
}
