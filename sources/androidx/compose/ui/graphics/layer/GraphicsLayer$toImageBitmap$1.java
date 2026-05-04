package androidx.compose.ui.graphics.layer;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.graphics.layer.GraphicsLayer", f = "AndroidGraphicsLayer.android.kt", i = {}, l = {878}, m = "toImageBitmap", n = {}, s = {})
/* loaded from: classes.dex */
public final class GraphicsLayer$toImageBitmap$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GraphicsLayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphicsLayer$toImageBitmap$1(GraphicsLayer graphicsLayer, j00.c<? super GraphicsLayer$toImageBitmap$1> cVar) {
        super(cVar);
        this.this$0 = graphicsLayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@m80.k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.toImageBitmap(this);
    }
}
