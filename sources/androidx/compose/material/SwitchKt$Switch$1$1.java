package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import l00.a;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.SwitchKt$Switch$1$1", f = "Switch.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SwitchKt$Switch$1$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;
    final /* synthetic */ State<Boolean> $currentChecked$delegate;
    final /* synthetic */ State<l<Boolean, g2>> $currentOnCheckedChange$delegate;
    final /* synthetic */ MutableState<Boolean> $forceAnimationCheck$delegate;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.material.SwitchKt$Switch$1$1$2", f = "Switch.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.SwitchKt$Switch$1$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<Boolean, c<? super g2>, Object> {
        final /* synthetic */ State<Boolean> $currentChecked$delegate;
        final /* synthetic */ State<l<Boolean, g2>> $currentOnCheckedChange$delegate;
        final /* synthetic */ MutableState<Boolean> $forceAnimationCheck$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(State<Boolean> state, State<? extends l<? super Boolean, g2>> state2, MutableState<Boolean> mutableState, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$currentChecked$delegate = state;
            this.$currentOnCheckedChange$delegate = state2;
            this.$forceAnimationCheck$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, cVar);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, c<? super g2> cVar) {
            return invoke(bool.booleanValue(), cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean Switch$lambda$8;
            l Switch$lambda$7;
            boolean Switch$lambda$3;
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            boolean z11 = this.Z$0;
            Switch$lambda$8 = SwitchKt.Switch$lambda$8(this.$currentChecked$delegate);
            if (Switch$lambda$8 != z11) {
                Switch$lambda$7 = SwitchKt.Switch$lambda$7(this.$currentOnCheckedChange$delegate);
                if (Switch$lambda$7 != null) {
                    Switch$lambda$7.invoke(a.a(z11));
                }
                MutableState<Boolean> mutableState = this.$forceAnimationCheck$delegate;
                Switch$lambda$3 = SwitchKt.Switch$lambda$3(mutableState);
                SwitchKt.Switch$lambda$4(mutableState, !Switch$lambda$3);
            }
            return g2.f100423a;
        }

        public final Object invoke(boolean z11, c<? super g2> cVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z11), cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwitchKt$Switch$1$1(AnchoredDraggableState<Boolean> anchoredDraggableState, State<Boolean> state, State<? extends l<? super Boolean, g2>> state2, MutableState<Boolean> mutableState, c<? super SwitchKt$Switch$1$1> cVar) {
        super(2, cVar);
        this.$anchoredDraggableState = anchoredDraggableState;
        this.$currentChecked$delegate = state;
        this.$currentOnCheckedChange$delegate = state2;
        this.$forceAnimationCheck$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new SwitchKt$Switch$1$1(this.$anchoredDraggableState, this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((SwitchKt$Switch$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final AnchoredDraggableState<Boolean> anchoredDraggableState = this.$anchoredDraggableState;
            i snapshotFlow = SnapshotStateKt.snapshotFlow(new x00.a<Boolean>() { // from class: androidx.compose.material.SwitchKt$Switch$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Boolean invoke() {
                    return anchoredDraggableState.getCurrentValue();
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, null);
            this.label = 1;
            if (k.C(snapshotFlow, anonymousClass2, this) == l11) {
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
