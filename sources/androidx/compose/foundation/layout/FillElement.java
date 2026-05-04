package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FillElement extends ModifierNodeElement<FillNode> {

    @m80.k
    public static final Companion Companion = new Companion(null);

    @m80.k
    private final Direction direction;
    private final float fraction;

    @m80.k
    private final String inspectorName;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @Stable
        @m80.k
        public final FillElement height(float f11) {
            return new FillElement(Direction.Vertical, f11, "fillMaxHeight");
        }

        @Stable
        @m80.k
        public final FillElement size(float f11) {
            return new FillElement(Direction.Both, f11, "fillMaxSize");
        }

        @Stable
        @m80.k
        public final FillElement width(float f11) {
            return new FillElement(Direction.Horizontal, f11, "fillMaxWidth");
        }

        private Companion() {
        }
    }

    public FillElement(@m80.k Direction direction, float f11, @m80.k String str) {
        this.direction = direction;
        this.fraction = f11;
        this.inspectorName = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.direction == fillElement.direction && this.fraction == fillElement.fraction;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.direction.hashCode() * 31) + Float.hashCode(this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName(this.inspectorName);
        inspectorInfo.getProperties().set("fraction", Float.valueOf(this.fraction));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public FillNode create() {
        return new FillNode(this.direction, this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k FillNode fillNode) {
        fillNode.setDirection(this.direction);
        fillNode.setFraction(this.fraction);
    }
}
