package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class VNode {
    public static final int $stable = 8;

    @l
    private x00.l<? super VNode, g2> invalidateListener;

    public /* synthetic */ VNode(v vVar) {
        this();
    }

    public abstract void draw(@k DrawScope drawScope);

    @l
    public x00.l<VNode, g2> getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    public final void invalidate() {
        x00.l<VNode, g2> invalidateListener$ui_release = getInvalidateListener$ui_release();
        if (invalidateListener$ui_release != null) {
            invalidateListener$ui_release.invoke(this);
        }
    }

    public void setInvalidateListener$ui_release(@l x00.l<? super VNode, g2> lVar) {
        this.invalidateListener = lVar;
    }

    private VNode() {
    }
}
