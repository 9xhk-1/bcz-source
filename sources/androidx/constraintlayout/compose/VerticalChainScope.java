package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.parser.CLObject;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@Stable
/* loaded from: classes2.dex */
public final class VerticalChainScope {
    public static final int $stable = 0;

    @k
    private final HorizontalAnchorable bottom;

    /* renamed from: id, reason: collision with root package name */
    @k
    private final Object f4246id;

    @k
    private final ConstrainedLayoutReference parent = new ConstrainedLayoutReference(q.a.f13044u);

    @k
    private final HorizontalAnchorable top;

    public VerticalChainScope(@k Object obj, @k CLObject cLObject) {
        this.f4246id = obj;
        this.top = new ChainHorizontalAnchorable(cLObject, 0);
        this.bottom = new ChainHorizontalAnchorable(cLObject, 1);
    }

    @k
    public final HorizontalAnchorable getBottom() {
        return this.bottom;
    }

    @k
    public final Object getId$constraintlayout_compose_release() {
        return this.f4246id;
    }

    @k
    public final ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    @k
    public final HorizontalAnchorable getTop() {
        return this.top;
    }
}
