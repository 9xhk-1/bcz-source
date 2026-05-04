package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.platform.PlatformTextInputSession;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", f = "LegacyAdaptingPlatformTextInputModifierNode.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {
    final /* synthetic */ x00.p<PlatformTextInputSession, j00.c<?>, Object> $block;
    int label;
    final /* synthetic */ LegacyAdaptingPlatformTextInputModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode, x00.p<? super PlatformTextInputSession, ? super j00.c<?>, ? extends Object> pVar, j00.c<? super LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1> cVar) {
        super(2, cVar);
        this.this$0 = legacyAdaptingPlatformTextInputModifierNode;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(this.this$0, this.$block, cVar);
    }

    @Override // x00.p
    public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
        return ((LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode = this.this$0;
            x00.p<PlatformTextInputSession, j00.c<?>, Object> pVar = this.$block;
            this.label = 1;
            if (PlatformTextInputModifierNodeKt.establishTextInputSession(legacyAdaptingPlatformTextInputModifierNode, pVar, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
