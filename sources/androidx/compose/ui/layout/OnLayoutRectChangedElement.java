package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class OnLayoutRectChangedElement extends ModifierNodeElement<OnLayoutRectChangedNode> {

    @k
    private final l<RelativeLayoutBounds, g2> callback;
    private final long debounceMillis;
    private final long throttleMillis;

    /* JADX WARN: Multi-variable type inference failed */
    public OnLayoutRectChangedElement(long j11, long j12, @k l<? super RelativeLayoutBounds, g2> lVar) {
        this.throttleMillis = j11;
        this.debounceMillis = j12;
        this.callback = lVar;
    }

    public static /* synthetic */ OnLayoutRectChangedElement copy$default(OnLayoutRectChangedElement onLayoutRectChangedElement, long j11, long j12, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = onLayoutRectChangedElement.throttleMillis;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = onLayoutRectChangedElement.debounceMillis;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            lVar = onLayoutRectChangedElement.callback;
        }
        return onLayoutRectChangedElement.copy(j13, j14, lVar);
    }

    public final long component1() {
        return this.throttleMillis;
    }

    public final long component2() {
        return this.debounceMillis;
    }

    @k
    public final l<RelativeLayoutBounds, g2> component3() {
        return this.callback;
    }

    @k
    public final OnLayoutRectChangedElement copy(long j11, long j12, @k l<? super RelativeLayoutBounds, g2> lVar) {
        return new OnLayoutRectChangedElement(j11, j12, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnLayoutRectChangedElement)) {
            return false;
        }
        OnLayoutRectChangedElement onLayoutRectChangedElement = (OnLayoutRectChangedElement) obj;
        return this.throttleMillis == onLayoutRectChangedElement.throttleMillis && this.debounceMillis == onLayoutRectChangedElement.debounceMillis && g0.g(this.callback, onLayoutRectChangedElement.callback);
    }

    @k
    public final l<RelativeLayoutBounds, g2> getCallback() {
        return this.callback;
    }

    public final long getDebounceMillis() {
        return this.debounceMillis;
    }

    public final long getThrottleMillis() {
        return this.throttleMillis;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((Long.hashCode(this.throttleMillis) * 31) + Long.hashCode(this.debounceMillis)) * 31) + this.callback.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onRectChanged");
        inspectorInfo.getProperties().set("throttleMillis", Long.valueOf(this.throttleMillis));
        inspectorInfo.getProperties().set("debounceMillis", Long.valueOf(this.debounceMillis));
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    @k
    public String toString() {
        return "OnLayoutRectChangedElement(throttleMillis=" + this.throttleMillis + ", debounceMillis=" + this.debounceMillis + ", callback=" + this.callback + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public OnLayoutRectChangedNode create() {
        return new OnLayoutRectChangedNode(this.throttleMillis, this.debounceMillis, this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k OnLayoutRectChangedNode onLayoutRectChangedNode) {
        onLayoutRectChangedNode.setThrottleMillis(this.throttleMillis);
        onLayoutRectChangedNode.setDebounceMillis(this.debounceMillis);
        onLayoutRectChangedNode.setCallback(this.callback);
        onLayoutRectChangedNode.disposeAndRegister();
    }
}
