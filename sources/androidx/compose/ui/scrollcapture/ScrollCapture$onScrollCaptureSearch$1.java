package androidx.compose.ui.scrollcapture;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.AdaptedFunctionReference;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public /* synthetic */ class ScrollCapture$onScrollCaptureSearch$1 extends AdaptedFunctionReference implements l<ScrollCaptureCandidate, g2> {
    public ScrollCapture$onScrollCaptureSearch$1(Object obj) {
        super(1, obj, MutableVector.class, "add", "add(Ljava/lang/Object;)Z", 8);
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ g2 invoke(ScrollCaptureCandidate scrollCaptureCandidate) {
        invoke2(scrollCaptureCandidate);
        return g2.f100423a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ScrollCaptureCandidate scrollCaptureCandidate) {
        ((MutableVector) this.receiver).add(scrollCaptureCandidate);
    }
}
