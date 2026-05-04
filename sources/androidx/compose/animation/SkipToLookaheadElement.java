package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SkipToLookaheadElement extends ModifierNodeElement<SkipToLookaheadNode> {
    public static final int $stable = 0;

    @k
    private final x00.a<Boolean> isEnabled;

    @l
    private final ScaleToBoundsImpl scaleToBounds;

    /* JADX WARN: Multi-variable type inference failed */
    public SkipToLookaheadElement() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkipToLookaheadElement copy$default(SkipToLookaheadElement skipToLookaheadElement, ScaleToBoundsImpl scaleToBoundsImpl, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            scaleToBoundsImpl = skipToLookaheadElement.scaleToBounds;
        }
        if ((i11 & 2) != 0) {
            aVar = skipToLookaheadElement.isEnabled;
        }
        return skipToLookaheadElement.copy(scaleToBoundsImpl, aVar);
    }

    @l
    public final ScaleToBoundsImpl component1() {
        return this.scaleToBounds;
    }

    @k
    public final x00.a<Boolean> component2() {
        return this.isEnabled;
    }

    @k
    public final SkipToLookaheadElement copy(@l ScaleToBoundsImpl scaleToBoundsImpl, @k x00.a<Boolean> aVar) {
        return new SkipToLookaheadElement(scaleToBoundsImpl, aVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkipToLookaheadElement)) {
            return false;
        }
        SkipToLookaheadElement skipToLookaheadElement = (SkipToLookaheadElement) obj;
        return g0.g(this.scaleToBounds, skipToLookaheadElement.scaleToBounds) && g0.g(this.isEnabled, skipToLookaheadElement.isEnabled);
    }

    @l
    public final ScaleToBoundsImpl getScaleToBounds() {
        return this.scaleToBounds;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        ScaleToBoundsImpl scaleToBoundsImpl = this.scaleToBounds;
        return ((scaleToBoundsImpl == null ? 0 : scaleToBoundsImpl.hashCode()) * 31) + this.isEnabled.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("skipToLookahead");
        inspectorInfo.getProperties().set("scaleToBounds", this.scaleToBounds);
        inspectorInfo.getProperties().set("isEnabled", this.isEnabled);
    }

    @k
    public final x00.a<Boolean> isEnabled() {
        return this.isEnabled;
    }

    @k
    public String toString() {
        return "SkipToLookaheadElement(scaleToBounds=" + this.scaleToBounds + ", isEnabled=" + this.isEnabled + ')';
    }

    public /* synthetic */ SkipToLookaheadElement(ScaleToBoundsImpl scaleToBoundsImpl, x00.a aVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : scaleToBoundsImpl, (i11 & 2) != 0 ? SkipToLookaheadNodeKt.DefaultEnabled : aVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public SkipToLookaheadNode create() {
        return new SkipToLookaheadNode(this.scaleToBounds, this.isEnabled);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k SkipToLookaheadNode skipToLookaheadNode) {
        skipToLookaheadNode.setScaleToBounds(this.scaleToBounds);
        skipToLookaheadNode.setEnabled(this.isEnabled);
    }

    public SkipToLookaheadElement(@l ScaleToBoundsImpl scaleToBoundsImpl, @k x00.a<Boolean> aVar) {
        this.scaleToBounds = scaleToBoundsImpl;
        this.isEnabled = aVar;
    }
}
