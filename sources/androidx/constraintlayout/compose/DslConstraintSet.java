package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.parser.CLObject;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class DslConstraintSet implements DerivedConstraintSet {
    public static final int $stable = 0;

    @k
    private final l<ConstraintSetScope, g2> description;

    @m80.l
    private final ConstraintSet extendFrom;

    @k
    private final ConstraintSetScope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public DslConstraintSet(@k l<? super ConstraintSetScope, g2> lVar, @m80.l ConstraintSet constraintSet) {
        ConstraintSetScope constraintSetScope;
        this.description = lVar;
        CLObject cLObject = null;
        DslConstraintSet dslConstraintSet = constraintSet instanceof DslConstraintSet ? (DslConstraintSet) constraintSet : null;
        if (dslConstraintSet != null && (constraintSetScope = dslConstraintSet.scope) != null) {
            cLObject = constraintSetScope.getContainerObject();
        }
        ConstraintSetScope constraintSetScope2 = new ConstraintSetScope(cLObject);
        lVar.invoke(constraintSetScope2);
        this.scope = constraintSetScope2;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    public void applyToState(@k State state) {
        this.scope.applyTo(state);
    }

    public boolean equals(@m80.l Object obj) {
        if (obj instanceof DslConstraintSet) {
            return g0.g(this.scope, ((DslConstraintSet) obj).scope);
        }
        return false;
    }

    @k
    public final l<ConstraintSetScope, g2> getDescription() {
        return this.description;
    }

    @Override // androidx.constraintlayout.compose.DerivedConstraintSet
    @m80.l
    public ConstraintSet getExtendFrom() {
        return this.extendFrom;
    }

    @k
    public final ConstraintSetScope getScope$constraintlayout_compose_release() {
        return this.scope;
    }

    public int hashCode() {
        return this.scope.hashCode();
    }

    public /* synthetic */ DslConstraintSet(l lVar, ConstraintSet constraintSet, int i11, v vVar) {
        this(lVar, (i11 & 2) != 0 ? null : constraintSet);
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    @k
    public ConstraintSet override(@k String str, float f11) {
        return this;
    }
}
