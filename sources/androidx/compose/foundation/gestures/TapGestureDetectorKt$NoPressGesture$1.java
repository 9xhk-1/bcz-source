package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$NoPressGesture$1 extends SuspendLambda implements q<PressGestureScope, Offset, c<? super g2>, Object> {
    int label;

    public TapGestureDetectorKt$NoPressGesture$1(c<? super TapGestureDetectorKt$NoPressGesture$1> cVar) {
        super(3, cVar);
    }

    @Override // x00.q
    public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, c<? super g2> cVar) {
        return m520invoked4ec7I(pressGestureScope, offset.m2278unboximpl(), cVar);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m520invoked4ec7I(PressGestureScope pressGestureScope, long j11, c<? super g2> cVar) {
        return new TapGestureDetectorKt$NoPressGesture$1(cVar).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        return g2.f100423a;
    }
}
