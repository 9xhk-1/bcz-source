package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.PointerInputModifierNode;
import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;
import m80.k;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SuspendingPointerInputModifierNode extends PointerInputModifierNode {
    @k
    default PointerInputEventHandler getPointerInputEventHandler() {
        throw new NotImplementedError("An operation is not implemented: pointerInputEventHandler must be implemented (get()).");
    }

    @k
    p<PointerInputScope, j00.c<? super g2>, Object> getPointerInputHandler();

    void resetPointerInputHandler();

    default void setPointerInputEventHandler(@k PointerInputEventHandler pointerInputEventHandler) {
        throw new NotImplementedError("An operation is not implemented: " + ("pointerInputEventHandler must be implemented (set(" + pointerInputEventHandler + "))."));
    }

    void setPointerInputHandler(@k p<? super PointerInputScope, ? super j00.c<? super g2>, ? extends Object> pVar);

    @n(level = DeprecationLevel.ERROR, message = "This property is deprecated. Use 'pointerInputEventHandler' instead.", replaceWith = @w0(expression = "pointerInputEventHandler", imports = {"androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode.pointerInputEventHandler"}))
    static /* synthetic */ void getPointerInputHandler$annotations() {
    }
}
