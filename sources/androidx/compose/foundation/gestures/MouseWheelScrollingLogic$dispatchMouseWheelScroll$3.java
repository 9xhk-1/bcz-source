package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {253, 266, 283}, m = "invokeSuspend", n = {"$this$userScroll", "requiredAnimation", "$this$userScroll", "requiredAnimation", "durationMillis", "$this$userScroll", "requiredAnimation"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1"})
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 extends SuspendLambda implements p<NestedScrollScope, c<? super g2>, Object> {
    final /* synthetic */ Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> $animationState;
    final /* synthetic */ float $speed;
    final /* synthetic */ Ref.ObjectRef<MouseWheelScrollingLogic.MouseWheelScrollDelta> $targetScrollDelta;
    final /* synthetic */ Ref.FloatRef $targetValue;
    final /* synthetic */ ScrollingLogic $this_dispatchMouseWheelScroll;
    final /* synthetic */ float $threshold;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MouseWheelScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(Ref.FloatRef floatRef, Ref.ObjectRef<AnimationState<Float, AnimationVector1D>> objectRef, Ref.ObjectRef<MouseWheelScrollingLogic.MouseWheelScrollDelta> objectRef2, float f11, MouseWheelScrollingLogic mouseWheelScrollingLogic, float f12, ScrollingLogic scrollingLogic, c<? super MouseWheelScrollingLogic$dispatchMouseWheelScroll$3> cVar) {
        super(2, cVar);
        this.$targetValue = floatRef;
        this.$animationState = objectRef;
        this.$targetScrollDelta = objectRef2;
        this.$threshold = f11;
        this.this$0 = mouseWheelScrollingLogic;
        this.$speed = f12;
        this.$this_dispatchMouseWheelScroll = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, cVar);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = obj;
        return mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
    }

    @Override // x00.p
    public final Object invoke(NestedScrollScope nestedScrollScope, c<? super g2> cVar) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$3) create(nestedScrollScope, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018e  */
    /* JADX WARN: Type inference failed for: r2v12, types: [T, androidx.compose.animation.core.AnimationState] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x014f -> B:7:0x0151). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x015d -> B:9:0x0067). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
