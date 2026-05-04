package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$scrollTracker$1", f = "ComposeScrollCaptureCallback.android.kt", i = {0}, l = {88}, m = "invokeSuspend", n = {"reverseScrolling"}, s = {"Z$0"})
@u0({"SMAP\nComposeScrollCaptureCallback.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeScrollCaptureCallback.android.kt\nandroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$scrollTracker$1\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,307:1\n89#2,7:308\n30#3:315\n53#4,3:316\n70#4:320\n69#5:319\n22#6:321\n*S KotlinDebug\n*F\n+ 1 ComposeScrollCaptureCallback.android.kt\nandroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback$scrollTracker$1\n*L\n75#1:308,7\n88#1:315\n88#1:316,3\n89#1:320\n89#1:319\n89#1:321\n*E\n"})
/* loaded from: classes2.dex */
public final class ComposeScrollCaptureCallback$scrollTracker$1 extends SuspendLambda implements p<Float, j00.c<? super Float>, Object> {
    /* synthetic */ float F$0;
    boolean Z$0;
    int label;
    final /* synthetic */ ComposeScrollCaptureCallback this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeScrollCaptureCallback$scrollTracker$1(ComposeScrollCaptureCallback composeScrollCaptureCallback, j00.c<? super ComposeScrollCaptureCallback$scrollTracker$1> cVar) {
        super(2, cVar);
        this.this$0 = composeScrollCaptureCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        ComposeScrollCaptureCallback$scrollTracker$1 composeScrollCaptureCallback$scrollTracker$1 = new ComposeScrollCaptureCallback$scrollTracker$1(this.this$0, cVar);
        composeScrollCaptureCallback$scrollTracker$1.F$0 = ((Number) obj).floatValue();
        return composeScrollCaptureCallback$scrollTracker$1;
    }

    public final Object invoke(float f11, j00.c<? super Float> cVar) {
        return ((ComposeScrollCaptureCallback$scrollTracker$1) create(Float.valueOf(f11), cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SemanticsNode semanticsNode;
        SemanticsNode semanticsNode2;
        boolean z11;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            float f11 = this.F$0;
            semanticsNode = this.this$0.node;
            p<Offset, j00.c<? super Offset>, Object> scrollCaptureScrollByAction = ScrollCapture_androidKt.getScrollCaptureScrollByAction(semanticsNode);
            if (scrollCaptureScrollByAction == null) {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
                throw new KotlinNothingValueException();
            }
            semanticsNode2 = this.this$0.node;
            boolean reverseScrolling = ((ScrollAxisRange) semanticsNode2.getUnmergedConfig$ui_release().get(SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())).getReverseScrolling();
            if (reverseScrolling) {
                f11 = -f11;
            }
            Offset m2257boximpl = Offset.m2257boximpl(Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)));
            this.Z$0 = reverseScrolling;
            this.label = 1;
            obj = scrollCaptureScrollByAction.invoke(m2257boximpl, this);
            if (obj == l11) {
                return l11;
            }
            z11 = reverseScrolling;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = this.Z$0;
            kotlin.e.n(obj);
        }
        long m2278unboximpl = ((Offset) obj).m2278unboximpl();
        return l00.a.e(z11 ? -Float.intBitsToFloat((int) (m2278unboximpl & 4294967295L)) : Float.intBitsToFloat((int) (m2278unboximpl & 4294967295L)));
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ Object invoke(Float f11, j00.c<? super Float> cVar) {
        return invoke(f11.floatValue(), cVar);
    }
}
