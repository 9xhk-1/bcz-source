package androidx.compose.ui.input.pointer;

import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0 implements PointerInputEventHandler, b0 {
    private final /* synthetic */ p<Object, j00.c<Object>, Object> function;

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(p<Object, ? super j00.c<Object>, ? extends Object> pVar) {
        this.function = pVar;
    }

    public final boolean equals(@l Object obj) {
        if ((obj instanceof PointerInputEventHandler) && (obj instanceof b0)) {
            return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.b0
    @k
    public final w<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(PointerInputScope pointerInputScope, j00.c cVar) {
        return this.function.invoke(pointerInputScope, cVar);
    }
}
