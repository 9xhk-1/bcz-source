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
public final class HorizontalChainScope {
    public static final int $stable = 0;

    @k
    private final VerticalAnchorable absoluteLeft;

    @k
    private final VerticalAnchorable absoluteRight;

    @k
    private final VerticalAnchorable end;

    /* renamed from: id, reason: collision with root package name */
    @k
    private final Object f4242id;

    @k
    private final ConstrainedLayoutReference parent = new ConstrainedLayoutReference(q.a.f13044u);

    @k
    private final VerticalAnchorable start;

    public HorizontalChainScope(@k Object obj, @k CLObject cLObject) {
        this.f4242id = obj;
        this.start = new ChainVerticalAnchorable(cLObject, -2);
        this.absoluteLeft = new ChainVerticalAnchorable(cLObject, 0);
        this.end = new ChainVerticalAnchorable(cLObject, -1);
        this.absoluteRight = new ChainVerticalAnchorable(cLObject, 1);
    }

    @k
    public final VerticalAnchorable getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    @k
    public final VerticalAnchorable getAbsoluteRight() {
        return this.absoluteRight;
    }

    @k
    public final VerticalAnchorable getEnd() {
        return this.end;
    }

    @k
    public final Object getId$constraintlayout_compose_release() {
        return this.f4242id;
    }

    @k
    public final ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    @k
    public final VerticalAnchorable getStart() {
        return this.start;
    }
}
