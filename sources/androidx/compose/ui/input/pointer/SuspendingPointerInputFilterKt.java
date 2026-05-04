package androidx.compose.ui.input.pointer;

import a00.h0;
import androidx.compose.ui.Modifier;
import kotlin.DeprecationLevel;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SuspendingPointerInputFilterKt {

    @k
    private static final PointerEvent EmptyPointerEvent = new PointerEvent(h0.J());

    @k
    private static final String PointerInputModifierNoParamError = "Modifier.pointerInput must provide one or more 'key' parameters that define the identity of the modifier and determine when its previous input processing coroutine should be cancelled and a new effect launched for the new key.";
    public static final long WITH_TIMEOUT_MICRO_DELAY_MILLIS = 8;

    @n(level = DeprecationLevel.HIDDEN, message = "This function is deprecated. Use 'SuspendingPointerInputModifierNode' with thePointerInputEventHandler instead.", replaceWith = @w0(expression = "SuspendingPointerInputModifierNode { pointerInputEventHandler }", imports = {"androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode"}))
    public static final /* synthetic */ SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(p pVar) {
        return new SuspendingPointerInputModifierNodeImpl((Object) null, (Object) null, (Object[]) null, (p<? super PointerInputScope, ? super j00.c<? super g2>, ? extends Object>) pVar);
    }

    @n(level = DeprecationLevel.ERROR, message = PointerInputModifierNoParamError)
    @k
    public static final Modifier pointerInput(@k Modifier modifier, @k p<? super PointerInputScope, ? super j00.c<? super g2>, ? extends Object> pVar) {
        throw new IllegalStateException(PointerInputModifierNoParamError);
    }

    @k
    public static final SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode(@k PointerInputEventHandler pointerInputEventHandler) {
        return new SuspendingPointerInputModifierNodeImpl((Object) null, (Object) null, (Object[]) null, pointerInputEventHandler);
    }

    @k
    public static final Modifier pointerInput(@k Modifier modifier, @l Object obj, @k PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6, null));
    }

    @k
    public static final Modifier pointerInput(@k Modifier modifier, @l Object obj, @l Object obj2, @k PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(obj, obj2, null, pointerInputEventHandler, 4, null));
    }

    @k
    public static final Modifier pointerInput(@k Modifier modifier, @k Object[] objArr, @k PointerInputEventHandler pointerInputEventHandler) {
        return modifier.then(new SuspendPointerInputElement(null, null, objArr, pointerInputEventHandler, 3, null));
    }

    private static /* synthetic */ void getPointerInputModifierNoParamError$annotations() {
    }
}
