package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import c40.l2;
import c40.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.CoroutineStart;
import l00.f;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,918:1\n681#1:961\n682#1,4:965\n686#1:978\n689#1,3:988\n1101#2:919\n1083#2,2:920\n1101#2:923\n1083#2,2:924\n27#3:922\n32#3,2:940\n32#3,2:962\n32#3,2:1028\n57#4:926\n61#4:931\n60#5:927\n85#5:930\n70#5:932\n90#5:935\n53#5,3:937\n22#6:928\n22#6:933\n54#7:929\n59#7:934\n33#8:936\n144#9:942\n423#9,9:943\n447#9,9:952\n144#9:964\n423#9,9:969\n447#9,9:979\n641#9,2:1030\n87#10,2:991\n34#10,6:993\n89#10:999\n87#10,2:1000\n34#10,6:1002\n89#10:1008\n439#10,3:1009\n34#10,4:1012\n39#10:1017\n442#10:1018\n1#11:1016\n314#12,9:1019\n323#12,2:1032\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n*L\n698#1:961\n698#1:965,4\n698#1:978\n698#1:988,3\n549#1:919\n549#1:920,2\n559#1:923\n559#1:924,2\n551#1:922\n681#1:940,2\n698#1:962,2\n772#1:1028,2\n579#1:926\n580#1:931\n579#1:927\n579#1:930\n580#1:932\n580#1:935\n581#1:937,3\n579#1:928\n580#1:933\n579#1:929\n580#1:934\n581#1:936\n681#1:942\n685#1:943,9\n686#1:952,9\n698#1:964\n698#1:969,9\n698#1:979,9\n773#1:1030,2\n728#1:991,2\n728#1:993,6\n728#1:999\n738#1:1000,2\n738#1:1002,6\n738#1:1008\n742#1:1009,3\n742#1:1012,4\n742#1:1017\n742#1:1018\n742#1:1016\n770#1:1019,9\n770#1:1032,2\n*E\n"})
/* loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {
    public static final int $stable = 0;

    @l
    private p<? super PointerInputScope, ? super j00.c<? super g2>, ? extends Object> _deprecatedPointerInputHandler;

    @k
    private PointerInputEventHandler _pointerInputEventHandler;
    private long boundsSize;

    @k
    private PointerEvent currentEvent;

    @k
    private final MutableVector<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;

    @l
    private Object key1;

    @l
    private Object key2;

    @l
    private Object[] keys;

    @l
    private PointerEvent lastPointerEvent;

    @k
    private final MutableVector<PointerEventHandlerCoroutine<?>> pointerHandlers;

    @k
    private final Object pointerHandlersLock;

    @l
    private l2 pointerInputJob;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,918:1\n32#2,2:919\n646#3,2:921\n314#4,11:923\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n*L\n846#1:919,2\n846#1:921,2\n851#1:923,11\n*E\n"})
    public final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, j00.c<R> {
        private final /* synthetic */ SuspendingPointerInputModifierNodeImpl $$delegate_0;

        @k
        private final j00.c<R> completion;

        @l
        private n<? super PointerEvent> pointerAwaiter;

        @k
        private PointerEventPass awaitPass = PointerEventPass.Main;

        @k
        private final d context = EmptyCoroutineContext.INSTANCE;

        /* JADX WARN: Multi-variable type inference failed */
        public PointerEventHandlerCoroutine(@k j00.c<? super R> cVar) {
            this.completion = cVar;
            this.$$delegate_0 = SuspendingPointerInputModifierNodeImpl.this;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @l
        public Object awaitPointerEvent(@k PointerEventPass pointerEventPass, @k j00.c<? super PointerEvent> cVar) {
            c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
            pVar.y();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = pVar;
            Object F = pVar.F();
            if (F == kotlin.coroutines.intrinsics.b.l()) {
                f.c(cVar);
            }
            return F;
        }

        public final void cancel(@l Throwable th2) {
            n<? super PointerEvent> nVar = this.pointerAwaiter;
            if (nVar != null) {
                nVar.a(th2);
            }
            this.pointerAwaiter = null;
        }

        @Override // j00.c
        @k
        public d getContext() {
            return this.context;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @k
        public PointerEvent getCurrentEvent() {
            return SuspendingPointerInputModifierNodeImpl.this.currentEvent;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo3640getExtendedTouchPaddingNHjbRc() {
            return SuspendingPointerInputModifierNodeImpl.this.mo367getExtendedTouchPaddingNHjbRc();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getSize-YbymL2g */
        public long mo3641getSizeYbymL2g() {
            return SuspendingPointerInputModifierNodeImpl.this.boundsSize;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @k
        public ViewConfiguration getViewConfiguration() {
            return SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        public final void offerPointerEvent(@k PointerEvent pointerEvent, @k PointerEventPass pointerEventPass) {
            n<? super PointerEvent> nVar;
            if (pointerEventPass != this.awaitPass || (nVar = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m6308constructorimpl(pointerEvent));
        }

        @Override // j00.c
        public void resumeWith(@k Object obj) {
            Object obj2 = SuspendingPointerInputModifierNodeImpl.this.pointerHandlersLock;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (obj2) {
                suspendingPointerInputModifierNodeImpl.pointerHandlers.remove(this);
                g2 g2Var = g2.f100423a;
            }
            this.completion.resumeWith(obj);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: roundToPx--R2X_6o */
        public int mo370roundToPxR2X_6o(long j11) {
            return this.$$delegate_0.mo370roundToPxR2X_6o(j11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: roundToPx-0680j_4 */
        public int mo371roundToPx0680j_4(float f11) {
            return this.$$delegate_0.mo371roundToPx0680j_4(f11);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        @Stable
        /* renamed from: toDp-GaN1DYA */
        public float mo372toDpGaN1DYA(long j11) {
            return this.$$delegate_0.mo372toDpGaN1DYA(j11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo373toDpu2uoSUM(float f11) {
            return this.$$delegate_0.mo373toDpu2uoSUM(f11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDpSize-k-rfVVM */
        public long mo375toDpSizekrfVVM(long j11) {
            return this.$$delegate_0.mo375toDpSizekrfVVM(j11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toPx--R2X_6o */
        public float mo376toPxR2X_6o(long j11) {
            return this.$$delegate_0.mo376toPxR2X_6o(j11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toPx-0680j_4 */
        public float mo377toPx0680j_4(float f11) {
            return this.$$delegate_0.mo377toPx0680j_4(f11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        @k
        public Rect toRect(@k DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSize-XkaWNTQ */
        public long mo378toSizeXkaWNTQ(long j11) {
            return this.$$delegate_0.mo378toSizeXkaWNTQ(j11);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        @Stable
        /* renamed from: toSp-0xMU5do */
        public long mo379toSp0xMU5do(float f11) {
            return this.$$delegate_0.mo379toSp0xMU5do(f11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo380toSpkPz2Gy4(float f11) {
            return this.$$delegate_0.mo380toSpkPz2Gy4(f11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [c40.l2] */
        /* JADX WARN: Type inference failed for: r11v3, types: [c40.l2] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object withTimeout(long r11, @m80.k x00.p<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super j00.c<? super T>, ? extends java.lang.Object> r13, @m80.k j00.c<? super T> r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                if (r0 == 0) goto L13
                r0 = r14
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r10, r14)
            L18:
                java.lang.Object r14 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r11 = r0.L$0
                c40.l2 r11 = (c40.l2) r11
                kotlin.e.n(r14)     // Catch: java.lang.Throwable -> L2d
                goto L76
            L2d:
                r0 = move-exception
                r12 = r0
                goto L7c
            L30:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L38:
                kotlin.e.n(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L57
                c40.n<? super androidx.compose.ui.input.pointer.PointerEvent> r14 = r10.pointerAwaiter
                if (r14 == 0) goto L57
                kotlin.Result$a r2 = kotlin.Result.Companion
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r11)
                java.lang.Object r2 = kotlin.e.a(r2)
                java.lang.Object r2 = kotlin.Result.m6308constructorimpl(r2)
                r14.resumeWith(r2)
            L57:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r14 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this
                c40.r0 r4 = r14.getCoroutineScope()
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r7 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                c40.l2 r11 = c40.i.e(r4, r5, r6, r7, r8, r9)
                r0.L$0 = r11     // Catch: java.lang.Throwable -> L2d
                r0.label = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2d
                if (r14 != r1) goto L76
                return r1
            L76:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r12 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                r11.cancel(r12)
                return r14
            L7c:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r13 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                r11.cancel(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeout(long, x00.p, j00.c):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object withTimeoutOrNull(long r5, @m80.k x00.p<? super androidx.compose.ui.input.pointer.AwaitPointerEventScope, ? super j00.c<? super T>, ? extends java.lang.Object> r7, @m80.k j00.c<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e.n(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3e
                return r8
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.e.n(r8)
                r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3e
                java.lang.Object r5 = r4.withTimeout(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3e
                if (r5 != r1) goto L3d
                return r1
            L3d:
                return r5
            L3e:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeoutOrNull(long, x00.p, j00.c):java.lang.Object");
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo374toDpu2uoSUM(int i11) {
            return this.$$delegate_0.mo374toDpu2uoSUM(i11);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo381toSpkPz2Gy4(int i11) {
            return this.$$delegate_0.mo381toSpkPz2Gy4(i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SuspendingPointerInputModifierNodeImpl(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : obj, (i11 & 2) != 0 ? null : obj2, (i11 & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        synchronized (this.pointerHandlersLock) {
            MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = this.dispatchingPointerHandlers;
            mutableVector.addAll(mutableVector.getSize(), this.pointerHandlers);
        }
        try {
            int i11 = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i11 == 1 || i11 == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i12 = 0; i12 < size; i12++) {
                    pointerEventHandlerCoroutineArr[i12].offerPointerEvent(pointerEvent, pointerEventPass);
                }
            } else if (i11 == 3) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize() - 1;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr2 = mutableVector3.content;
                if (size2 < pointerEventHandlerCoroutineArr2.length) {
                    while (size2 >= 0) {
                        pointerEventHandlerCoroutineArr2[size2].offerPointerEvent(pointerEvent, pointerEventPass);
                        size2--;
                    }
                }
            }
        } finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    private final void forEachCurrentPointerHandler(PointerEventPass pointerEventPass, x00.l<? super PointerEventHandlerCoroutine<?>, g2> lVar) {
        synchronized (this.pointerHandlersLock) {
            try {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = this.dispatchingPointerHandlers;
                mutableVector.addAll(mutableVector.getSize(), this.pointerHandlers);
                d0.d(1);
            } catch (Throwable th2) {
                d0.d(1);
                d0.c(1);
                throw th2;
            }
        }
        d0.c(1);
        try {
            int i11 = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i11 == 1 || i11 == 2) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr = mutableVector2.content;
                int size = mutableVector2.getSize();
                for (int i12 = 0; i12 < size; i12++) {
                    lVar.invoke(pointerEventHandlerCoroutineArr[i12]);
                }
            } else if (i11 == 3) {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize() - 1;
                PointerEventHandlerCoroutine<?>[] pointerEventHandlerCoroutineArr2 = mutableVector3.content;
                if (size2 < pointerEventHandlerCoroutineArr2.length) {
                    while (size2 >= 0) {
                        lVar.invoke(pointerEventHandlerCoroutineArr2[size2]);
                        size2--;
                    }
                }
            }
        } finally {
            d0.d(1);
            this.dispatchingPointerHandlers.clear();
            d0.c(1);
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    @l
    public <R> Object awaitPointerEventScope(@k p<? super AwaitPointerEventScope, ? super j00.c<? super R>, ? extends Object> pVar, @k j00.c<? super R> cVar) {
        c40.p pVar2 = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar2.y();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(pVar2);
        synchronized (this.pointerHandlersLock) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            j00.c<g2> c11 = j00.d.c(pVar, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            Result.a aVar = Result.Companion;
            c11.resumeWith(Result.m6308constructorimpl(g2.f100423a));
        }
        pVar2.p(new x00.l<Throwable, g2>() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                invoke2(th2);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                pointerEventHandlerCoroutine.cancel(th2);
            }
        });
        Object F = pVar2.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            f.c(cVar);
        }
        return F;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo367getExtendedTouchPaddingNHjbRc() {
        long mo378toSizeXkaWNTQ = mo378toSizeXkaWNTQ(getViewConfiguration().mo4041getMinimumTouchTargetSizeMYxV2XQ());
        long mo368getSizeYbymL2g = mo368getSizeYbymL2g();
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (mo378toSizeXkaWNTQ >> 32)) - ((int) (mo368getSizeYbymL2g >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (mo378toSizeXkaWNTQ & 4294967295L)) - ((int) (mo368getSizeYbymL2g & 4294967295L))) / 2.0f;
        return Size.m2328constructorimpl((Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L));
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    @k
    public PointerInputEventHandler getPointerInputEventHandler() {
        return this._pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    @k
    public p<PointerInputScope, j00.c<? super g2>, Object> getPointerInputHandler() {
        p pVar = this._deprecatedPointerInputHandler;
        return pVar == null ? new SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1(null) : pVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: getSize-YbymL2g */
    public long mo368getSizeYbymL2g() {
        return this.boundsSize;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    @k
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (changes.get(i11).getPressed()) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    PointerInputChange pointerInputChange = changes2.get(i12);
                    arrayList.add(new PointerInputChange(pointerInputChange.m3730getIdJ3iCeTQ(), pointerInputChange.getUptimeMillis(), pointerInputChange.m3732getPositionF1C5BW0(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.m3732getPositionF1C5BW0(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), pointerInputChange.m3735getTypeT8wyACA(), 0L, 1024, (v) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.currentEvent = pointerEvent2;
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo205onPointerEventH0pRuoY(@k PointerEvent pointerEvent, @k PointerEventPass pointerEventPass, long j11) {
        l2 f11;
        this.boundsSize = j11;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            f11 = c40.k.f(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1, null);
            this.pointerInputJob = f11;
        }
        dispatchPointerEvent(pointerEvent, pointerEventPass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z11 = true;
                break;
            } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i11))) {
                break;
            } else {
                i11++;
            }
        }
        if (z11) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void resetPointerInputHandler() {
        l2 l2Var = this.pointerInputJob;
        if (l2Var != null) {
            l2Var.cancel(new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z11) {
        this.interceptOutOfBoundsChildEvents = z11;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputEventHandler(@k PointerInputEventHandler pointerInputEventHandler) {
        resetPointerInputHandler();
        this._deprecatedPointerInputHandler = null;
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputHandler(@k p<? super PointerInputScope, ? super j00.c<? super g2>, ? extends Object> pVar) {
        resetPointerInputHandler();
        this._deprecatedPointerInputHandler = pVar;
    }

    public final void update$ui_release(@l Object obj, @l Object obj2, @l Object[] objArr, @k PointerInputEventHandler pointerInputEventHandler) {
        boolean z11 = !g0.g(this.key1, obj);
        this.key1 = obj;
        if (!g0.g(this.key2, obj2)) {
            z11 = true;
        }
        this.key2 = obj2;
        Object[] objArr2 = this.keys;
        if (objArr2 != null && objArr == null) {
            z11 = true;
        }
        if (objArr2 == null && objArr != null) {
            z11 = true;
        }
        if (objArr2 != null && objArr != null && !Arrays.equals(objArr, objArr2)) {
            z11 = true;
        }
        this.keys = objArr;
        if (getPointerInputEventHandler().getClass() == pointerInputEventHandler.getClass() ? z11 : true) {
            resetPointerInputHandler();
        }
        this._pointerInputEventHandler = pointerInputEventHandler;
    }

    public SuspendingPointerInputModifierNodeImpl(@l Object obj, @l Object obj2, @l Object[] objArr, @k PointerInputEventHandler pointerInputEventHandler) {
        PointerEvent pointerEvent;
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this._pointerInputEventHandler = pointerInputEventHandler;
        pointerEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        this.currentEvent = pointerEvent;
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.pointerHandlers = mutableVector;
        this.pointerHandlersLock = mutableVector;
        this.dispatchingPointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.Companion.m5291getZeroYbymL2g();
    }

    @yz.n(message = "Exists to maintain compatibility with previous API shape")
    public SuspendingPointerInputModifierNodeImpl(@l Object obj, @l Object obj2, @l Object[] objArr, @k p<? super PointerInputScope, ? super j00.c<? super g2>, ? extends Object> pVar) {
        this(obj, obj2, objArr, new PointerInputEventHandler() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, j00.c<? super g2> cVar) {
                return g2.f100423a;
            }
        });
        this._deprecatedPointerInputHandler = pVar;
    }

    @yz.n(message = "Super property deprecated")
    public static /* synthetic */ void getPointerInputHandler$annotations() {
    }
}
