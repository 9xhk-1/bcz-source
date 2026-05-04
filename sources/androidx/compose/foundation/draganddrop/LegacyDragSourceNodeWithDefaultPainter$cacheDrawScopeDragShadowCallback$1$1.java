package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import kotlin.jvm.internal.FunctionReferenceImpl;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class LegacyDragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1 extends FunctionReferenceImpl implements l<CacheDrawScope, DrawResult> {
    public LegacyDragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(Object obj) {
        super(1, obj, CacheDrawScopeDragShadowCallback.class, "cachePicture", "cachePicture(Landroidx/compose/ui/draw/CacheDrawScope;)Landroidx/compose/ui/draw/DrawResult;", 0);
    }

    @Override // x00.l
    public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
        return ((CacheDrawScopeDragShadowCallback) this.receiver).cachePicture(cacheDrawScope);
    }
}
