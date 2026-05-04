package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class OnLayoutRectChangedNode extends Modifier.Node {

    @k
    private l<? super RelativeLayoutBounds, g2> callback;
    private long debounceMillis;

    @m80.l
    private DelegatableNode.RegistrationHandle handle;
    private long throttleMillis;

    public OnLayoutRectChangedNode(long j11, long j12, @k l<? super RelativeLayoutBounds, g2> lVar) {
        this.throttleMillis = j11;
        this.debounceMillis = j12;
        this.callback = lVar;
    }

    public final void disposeAndRegister() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, this.throttleMillis, this.debounceMillis, this.callback);
    }

    @k
    public final l<RelativeLayoutBounds, g2> getCallback() {
        return this.callback;
    }

    public final long getDebounceMillis() {
        return this.debounceMillis;
    }

    @m80.l
    public final DelegatableNode.RegistrationHandle getHandle() {
        return this.handle;
    }

    public final long getThrottleMillis() {
        return this.throttleMillis;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        disposeAndRegister();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
    }

    public final void setCallback(@k l<? super RelativeLayoutBounds, g2> lVar) {
        this.callback = lVar;
    }

    public final void setDebounceMillis(long j11) {
        this.debounceMillis = j11;
    }

    public final void setHandle(@m80.l DelegatableNode.RegistrationHandle registrationHandle) {
        this.handle = registrationHandle;
    }

    public final void setThrottleMillis(long j11) {
        this.throttleMillis = j11;
    }
}
