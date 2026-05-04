package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.state.ConstraintSetParser;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@v0
/* loaded from: classes2.dex */
public final class RawConstraintSet implements ConstraintSet {
    public static final int $stable = 0;

    @k
    private final CLObject clObject;

    @k
    private final ConstraintSetParser.LayoutVariables layoutVariables = new ConstraintSetParser.LayoutVariables();

    public RawConstraintSet(@k CLObject cLObject) {
        this.clObject = cLObject;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(@k State state, @k List<? extends Measurable> list) {
        ConstraintSetParser.populateState(this.clObject, state, this.layoutVariables);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g0.g(RawConstraintSet.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        g0.n(obj, "null cannot be cast to non-null type androidx.constraintlayout.compose.RawConstraintSet");
        return g0.g(this.clObject, ((RawConstraintSet) obj).clObject);
    }

    public int hashCode() {
        return this.clObject.hashCode();
    }
}
