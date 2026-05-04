package androidx.compose.ui.graphics.layer;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.graphics.layer.LayerSnapshotV22", f = "LayerSnapshot.android.kt", i = {0, 0, 0, 0}, l = {225}, m = "toBitmap", n = {"graphicsLayer", "looper", "reader", "$completion$iv"}, s = {"L$0", "L$1", "L$3", "L$4"})
/* loaded from: classes.dex */
public final class LayerSnapshotV22$toBitmap$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LayerSnapshotV22 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayerSnapshotV22$toBitmap$1(LayerSnapshotV22 layerSnapshotV22, j00.c<? super LayerSnapshotV22$toBitmap$1> cVar) {
        super(cVar);
        this.this$0 = layerSnapshotV22;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@m80.k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.toBitmap(null, this);
    }
}
