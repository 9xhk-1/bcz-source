package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DrawResult {
    public static final int $stable = 8;

    @k
    private l<? super ContentDrawScope, g2> block;

    public DrawResult(@k l<? super ContentDrawScope, g2> lVar) {
        this.block = lVar;
    }

    @k
    public final l<ContentDrawScope, g2> getBlock$ui_release() {
        return this.block;
    }

    public final void setBlock$ui_release(@k l<? super ContentDrawScope, g2> lVar) {
        this.block = lVar;
    }
}
