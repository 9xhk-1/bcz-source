package a1;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c40.r0;
import com.airbnb.lottie.compose.LottieCancellationBehavior;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", i = {}, l = {68, 73}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: a1.a$a, reason: collision with other inner class name */
    public static final class C0001a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f1178a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f1179b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f1180c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f1181d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.k f1182e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f1183f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f1184g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ h f1185h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ LottieCancellationBehavior f1186i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f1187j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0001a(boolean z11, boolean z12, c cVar, com.airbnb.lottie.k kVar, int i11, float f11, h hVar, LottieCancellationBehavior lottieCancellationBehavior, MutableState<Boolean> mutableState, j00.c<? super C0001a> cVar2) {
            super(2, cVar2);
            this.f1179b = z11;
            this.f1180c = z12;
            this.f1181d = cVar;
            this.f1182e = kVar;
            this.f1183f = i11;
            this.f1184g = f11;
            this.f1185h = hVar;
            this.f1186i = lottieCancellationBehavior;
            this.f1187j = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.k
        public final j00.c<g2> create(@m80.l Object obj, @m80.k j00.c<?> cVar) {
            return new C0001a(this.f1179b, this.f1180c, this.f1181d, this.f1182e, this.f1183f, this.f1184g, this.f1185h, this.f1186i, this.f1187j, cVar);
        }

        @Override // x00.p
        @m80.l
        public final Object invoke(@m80.k r0 r0Var, @m80.l j00.c<? super g2> cVar) {
            return ((C0001a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
        
            if (a1.c.a.a(r1, r2, 0, r4, r5, r6, r7, false, r9, false, r14, 258, null) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
        
            if (a1.e.e(r15, r14) == r0) goto L25;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r14.f1178a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r15)
                goto L6b
            L12:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1a:
                kotlin.e.n(r15)
                goto L3c
            L1e:
                kotlin.e.n(r15)
                boolean r15 = r14.f1179b
                if (r15 == 0) goto L3c
                androidx.compose.runtime.MutableState<java.lang.Boolean> r15 = r14.f1187j
                boolean r15 = a1.a.a(r15)
                if (r15 != 0) goto L3c
                boolean r15 = r14.f1180c
                if (r15 == 0) goto L3c
                a1.c r15 = r14.f1181d
                r14.f1178a = r3
                java.lang.Object r15 = a1.e.e(r15, r14)
                if (r15 != r0) goto L3c
                goto L6a
            L3c:
                androidx.compose.runtime.MutableState<java.lang.Boolean> r15 = r14.f1187j
                boolean r1 = r14.f1179b
                a1.a.b(r15, r1)
                boolean r15 = r14.f1179b
                if (r15 != 0) goto L4a
                yz.g2 r15 = yz.g2.f100423a
                return r15
            L4a:
                a1.c r1 = r14.f1181d
                r15 = r2
                com.airbnb.lottie.k r2 = r14.f1182e
                int r4 = r14.f1183f
                float r5 = r14.f1184g
                a1.h r6 = r14.f1185h
                float r7 = r1.getProgress()
                com.airbnb.lottie.compose.LottieCancellationBehavior r9 = r14.f1186i
                r14.f1178a = r15
                r3 = 0
                r8 = 0
                r10 = 0
                r12 = 258(0x102, float:3.62E-43)
                r13 = 0
                r11 = r14
                java.lang.Object r15 = a1.c.a.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r0) goto L6b
            L6a:
                return r0
            L6b:
                yz.g2 r15 = yz.g2.f100423a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: a1.a.C0001a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Composable
    @m80.k
    public static final g c(@m80.l com.airbnb.lottie.k kVar, boolean z11, boolean z12, @m80.l h hVar, float f11, int i11, @m80.l LottieCancellationBehavior lottieCancellationBehavior, boolean z13, @m80.l Composer composer, int i12, int i13) {
        composer.startReplaceableGroup(-180607952);
        boolean z14 = (i13 & 2) != 0 ? true : z11;
        boolean z15 = (i13 & 4) != 0 ? true : z12;
        h hVar2 = (i13 & 8) != 0 ? null : hVar;
        float f12 = (i13 & 16) != 0 ? 1.0f : f11;
        int i14 = (i13 & 32) != 0 ? 1 : i11;
        LottieCancellationBehavior lottieCancellationBehavior2 = (i13 & 64) != 0 ? LottieCancellationBehavior.Immediately : lottieCancellationBehavior;
        boolean z16 = (i13 & 128) != 0 ? false : z13;
        if (i14 <= 0) {
            throw new IllegalArgumentException(("Iterations must be a positive number (" + i14 + ").").toString());
        }
        if (Float.isInfinite(f12) || Float.isNaN(f12)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f12 + '.').toString());
        }
        c d11 = e.d(composer, 0);
        composer.startReplaceableGroup(-3687241);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z14), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        composer.startReplaceableGroup(-180607189);
        if (!z16) {
            f12 /= j1.j.f((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        }
        float f13 = f12;
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(new Object[]{kVar, Boolean.valueOf(z14), hVar2, Float.valueOf(f13), Integer.valueOf(i14)}, (x00.p<? super r0, ? super j00.c<? super g2>, ? extends Object>) new C0001a(z14, z15, d11, kVar, i14, f13, hVar2, lottieCancellationBehavior2, mutableState, null), composer, 8);
        composer.endReplaceableGroup();
        return d11;
    }

    public static final boolean d(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void e(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }
}
