package androidx.compose.material;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.SliderKt", f = "Slider.kt", i = {0}, l = {TypedValues.Custom.TYPE_STRING}, m = "awaitSlop-8vUncbI", n = {"initialDelta"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class SliderKt$awaitSlop$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public SliderKt$awaitSlop$1(c<? super SliderKt$awaitSlop$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object m1762awaitSlop8vUncbI;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m1762awaitSlop8vUncbI = SliderKt.m1762awaitSlop8vUncbI(null, 0L, 0, this);
        return m1762awaitSlop8vUncbI;
    }
}
