package androidx.compose.foundation.gestures;

import androidx.compose.runtime.SnapshotStateKt;
import c40.l2;
import c40.r0;
import c40.s0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l00.d;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", i = {}, l = {1545}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$restartable$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ p<I, c<? super g2>, Object> $block;
    final /* synthetic */ a<I> $inputs;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements j {
        final /* synthetic */ r0 $$this$coroutineScope;
        final /* synthetic */ p<I, c<? super g2>, Object> $block;
        final /* synthetic */ Ref.ObjectRef<l2> $previousDrag;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", i = {}, l = {1552}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
            final /* synthetic */ r0 $$this$coroutineScope;
            final /* synthetic */ p<I, c<? super g2>, Object> $block;
            final /* synthetic */ I $latestInputs;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(p<? super I, ? super c<? super g2>, ? extends Object> pVar, I i11, r0 r0Var, c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.$block = pVar;
                this.$latestInputs = i11;
                this.$$this$coroutineScope = r0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<g2> create(Object obj, c<?> cVar) {
                return new AnonymousClass2(this.$block, this.$latestInputs, this.$$this$coroutineScope, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, c<? super g2> cVar) {
                return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = b.l();
                int i11 = this.label;
                if (i11 == 0) {
                    e.n(obj);
                    p<I, c<? super g2>, Object> pVar = this.$block;
                    I i12 = this.$latestInputs;
                    this.label = 1;
                    if (pVar.invoke(i12, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                }
                s0.d(this.$$this$coroutineScope, new AnchoredDragFinishedSignal());
                return g2.f100423a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Ref.ObjectRef<l2> objectRef, r0 r0Var, p<? super I, ? super c<? super g2>, ? extends Object> pVar) {
            this.$previousDrag = objectRef;
            this.$$this$coroutineScope = r0Var;
            this.$block = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(I r8, j00.c<? super yz.g2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                if (r0 == 0) goto L13
                r0 = r9
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$emit$1
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3b
                if (r2 != r3) goto L33
                java.lang.Object r8 = r0.L$2
                c40.l2 r8 = (c40.l2) r8
                java.lang.Object r8 = r0.L$1
                java.lang.Object r0 = r0.L$0
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1) r0
                kotlin.e.n(r9)
                goto L5e
            L33:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3b:
                kotlin.e.n(r9)
                kotlin.jvm.internal.Ref$ObjectRef<c40.l2> r9 = r7.$previousDrag
                T r9 = r9.element
                c40.l2 r9 = (c40.l2) r9
                if (r9 == 0) goto L5d
                androidx.compose.foundation.gestures.AnchoredDragFinishedSignal r2 = new androidx.compose.foundation.gestures.AnchoredDragFinishedSignal
                r2.<init>()
                r9.cancel(r2)
                r0.L$0 = r7
                r0.L$1 = r8
                r0.L$2 = r9
                r0.label = r3
                java.lang.Object r9 = r9.K0(r0)
                if (r9 != r1) goto L5d
                return r1
            L5d:
                r0 = r7
            L5e:
                kotlin.jvm.internal.Ref$ObjectRef<c40.l2> r9 = r0.$previousDrag
                c40.r0 r1 = r0.$$this$coroutineScope
                kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2 r4 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2$1$2
                x00.p<I, j00.c<? super yz.g2>, java.lang.Object> r0 = r0.$block
                r2 = 0
                r4.<init>(r0, r8, r1, r2)
                r5 = 1
                r6 = 0
                c40.l2 r8 = c40.i.e(r1, r2, r3, r4, r5, r6)
                r9.element = r8
                yz.g2 r8 = yz.g2.f100423a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2.AnonymousClass1.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableKt$restartable$2(a<? extends I> aVar, p<? super I, ? super c<? super g2>, ? extends Object> pVar, c<? super AnchoredDraggableKt$restartable$2> cVar) {
        super(2, cVar);
        this.$inputs = aVar;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        AnchoredDraggableKt$restartable$2 anchoredDraggableKt$restartable$2 = new AnchoredDraggableKt$restartable$2(this.$inputs, this.$block, cVar);
        anchoredDraggableKt$restartable$2.L$0 = obj;
        return anchoredDraggableKt$restartable$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((AnchoredDraggableKt$restartable$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            r0 r0Var = (r0) this.L$0;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            i snapshotFlow = SnapshotStateKt.snapshotFlow(this.$inputs);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, r0Var, this.$block);
            this.label = 1;
            if (snapshotFlow.collect(anonymousClass1, this) == l11) {
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
