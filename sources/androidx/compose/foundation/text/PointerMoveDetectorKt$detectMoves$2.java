package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c40.r0;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,61:1\n329#2:62\n*S KotlinDebug\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n*L\n40#1:62\n*E\n"})
/* loaded from: classes.dex */
public final class PointerMoveDetectorKt$detectMoves$2 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ l<Offset, g2> $onMove;
    final /* synthetic */ PointerEventPass $pointerEventPass;
    final /* synthetic */ PointerInputScope $this_detectMoves;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", i = {0, 0}, l = {44}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "previousPosition"}, s = {"L$0", "L$1"})
    @u0({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<AwaitPointerEventScope, j00.c<? super g2>, Object> {
        final /* synthetic */ kotlin.coroutines.d $currentContext;
        final /* synthetic */ l<Offset, g2> $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(kotlin.coroutines.d dVar, PointerEventPass pointerEventPass, l<? super Offset, g2> lVar, j00.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$currentContext = dVar;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, j00.c<? super g2> cVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
        /* JADX WARN: Type inference failed for: r8v15, types: [T, androidx.compose.ui.geometry.Offset] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0040 -> B:5:0x0043). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r7.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r3 = r7.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                kotlin.e.n(r8)
                goto L43
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.e.n(r8)
                java.lang.Object r8 = r7.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                r3 = r8
            L2c:
                kotlin.coroutines.d r8 = r7.$currentContext
                boolean r8 = c40.n2.D(r8)
                if (r8 == 0) goto La3
                androidx.compose.ui.input.pointer.PointerEventPass r8 = r7.$pointerEventPass
                r7.L$0 = r3
                r7.L$1 = r1
                r7.label = r2
                java.lang.Object r8 = r3.awaitPointerEvent(r8, r7)
                if (r8 != r0) goto L43
                return r0
            L43:
                androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
                int r4 = r8.m3674getType7fucELk()
                androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                int r6 = r5.m3687getMove7fucELk()
                boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.m3681equalsimpl0(r4, r6)
                if (r6 == 0) goto L57
                r6 = r2
                goto L5f
            L57:
                int r6 = r5.m3685getEnter7fucELk()
                boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.m3681equalsimpl0(r4, r6)
            L5f:
                if (r6 == 0) goto L63
                r4 = r2
                goto L6b
            L63:
                int r5 = r5.m3686getExit7fucELk()
                boolean r4 = androidx.compose.ui.input.pointer.PointerEventType.m3681equalsimpl0(r4, r5)
            L6b:
                if (r4 == 0) goto L2c
                java.util.List r8 = r8.getChanges()
                java.lang.Object r8 = a00.r0.G2(r8)
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                long r4 = r8.m3732getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.m2257boximpl(r4)
                long r4 = r8.m2278unboximpl()
                T r6 = r1.element
                boolean r4 = androidx.compose.ui.geometry.Offset.m2264equalsimpl(r4, r6)
                if (r4 != 0) goto L8c
                goto L8d
            L8c:
                r8 = 0
            L8d:
                if (r8 == 0) goto L2c
                x00.l<androidx.compose.ui.geometry.Offset, yz.g2> r4 = r7.$onMove
                long r5 = r8.m2278unboximpl()
                androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.m2257boximpl(r5)
                r1.element = r8
                androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.m2257boximpl(r5)
                r4.invoke(r8)
                goto L2c
            La3:
                yz.g2 r8 = yz.g2.f100423a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PointerMoveDetectorKt$detectMoves$2(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, l<? super Offset, g2> lVar, j00.c<? super PointerMoveDetectorKt$detectMoves$2> cVar) {
        super(2, cVar);
        this.$this_detectMoves = pointerInputScope;
        this.$pointerEventPass = pointerEventPass;
        this.$onMove = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new PointerMoveDetectorKt$detectMoves$2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((PointerMoveDetectorKt$detectMoves$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            kotlin.coroutines.d context = getContext();
            PointerInputScope pointerInputScope = this.$this_detectMoves;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.$pointerEventPass, this.$onMove, null);
            this.label = 1;
            if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
