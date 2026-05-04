package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class DrawModifierKt {
    @k
    public static final CacheDrawModifierNode CacheDrawModifierNode(@k l<? super CacheDrawScope, DrawResult> lVar) {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), lVar);
    }

    @k
    public static final Modifier drawBehind(@k Modifier modifier, @k l<? super DrawScope, g2> lVar) {
        return modifier.then(new DrawBehindElement(lVar));
    }

    @k
    public static final Modifier drawWithCache(@k Modifier modifier, @k l<? super CacheDrawScope, DrawResult> lVar) {
        return modifier.then(new DrawWithCacheElement(lVar));
    }

    @k
    public static final Modifier drawWithContent(@k Modifier modifier, @k l<? super ContentDrawScope, g2> lVar) {
        return modifier.then(new DrawWithContentElement(lVar));
    }
}
