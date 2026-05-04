package androidx.constraintlayout.compose;

import a00.r0;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Density;
import java.util.ArrayList;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@StabilityInferred(parameters = 0)
@u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2303:1\n1#2:2304\n*E\n"})
/* loaded from: classes2.dex */
public final class ConstraintLayoutScope extends ConstraintLayoutBaseScope {
    public static final int $stable = 8;
    private final int ChildrenStartIndex;
    private int childId;

    @k
    private final ArrayList<ConstrainedLayoutReference> childrenRefs;
    private boolean isAnimateChanges;

    @l
    private ConstrainedLayoutReferences referencesObject;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainAsModifier\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,2303:1\n135#2:2304\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutScope$ConstrainAsModifier\n*L\n995#1:2304\n*E\n"})
    @Stable
    public static final class ConstrainAsModifier extends InspectorValueInfo implements ParentDataModifier {

        @k
        private final x00.l<ConstrainScope, g2> constrainBlock;

        @k
        private final ConstrainedLayoutReference ref;

        /* JADX WARN: Multi-variable type inference failed */
        public ConstrainAsModifier(@k final ConstrainedLayoutReference constrainedLayoutReference, @k final x00.l<? super ConstrainScope, g2> lVar) {
            super(InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, g2>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                    invoke2(inspectorInfo);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k InspectorInfo inspectorInfo) {
                    inspectorInfo.setName("constrainAs");
                    inspectorInfo.getProperties().set("ref", ConstrainedLayoutReference.this);
                    inspectorInfo.getProperties().set("constrainBlock", lVar);
                }
            } : InspectableValueKt.getNoInspectorInfo());
            this.ref = constrainedLayoutReference;
            this.constrainBlock = lVar;
        }

        public boolean equals(@l Object obj) {
            x00.l<ConstrainScope, g2> lVar = this.constrainBlock;
            ConstrainAsModifier constrainAsModifier = obj instanceof ConstrainAsModifier ? (ConstrainAsModifier) obj : null;
            return lVar == (constrainAsModifier != null ? constrainAsModifier.constrainBlock : null);
        }

        public int hashCode() {
            return this.constrainBlock.hashCode();
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        @k
        public ConstraintLayoutParentData modifyParentData(@k Density density, @l Object obj) {
            return new ConstraintLayoutParentData(this.ref, this.constrainBlock);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class ConstrainedLayoutReferences {
        public ConstrainedLayoutReferences() {
        }

        @k
        public final ConstrainedLayoutReference component1() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component10() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component11() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component12() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component13() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component14() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component15() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component16() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component2() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component3() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component4() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component5() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component6() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component7() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component8() {
            return ConstraintLayoutScope.this.createRef();
        }

        @k
        public final ConstrainedLayoutReference component9() {
            return ConstraintLayoutScope.this.createRef();
        }
    }

    @v0
    public ConstraintLayoutScope() {
        super(null);
        this.childId = this.ChildrenStartIndex;
        this.childrenRefs = new ArrayList<>();
    }

    @Stable
    @k
    public final Modifier constrainAs(@k Modifier modifier, @k ConstrainedLayoutReference constrainedLayoutReference, @k x00.l<? super ConstrainScope, g2> lVar) {
        if (this.isAnimateChanges) {
            lVar.invoke(new ConstrainScope(constrainedLayoutReference.getId$constraintlayout_compose_release(), asCLContainer$constraintlayout_compose_release(constrainedLayoutReference)));
        }
        return modifier.then(new ConstrainAsModifier(constrainedLayoutReference, lVar));
    }

    @k
    public final ConstrainedLayoutReference createRef() {
        ArrayList<ConstrainedLayoutReference> arrayList = this.childrenRefs;
        int i11 = this.childId;
        this.childId = i11 + 1;
        ConstrainedLayoutReference constrainedLayoutReference = (ConstrainedLayoutReference) r0.b3(arrayList, i11);
        if (constrainedLayoutReference != null) {
            return constrainedLayoutReference;
        }
        ConstrainedLayoutReference constrainedLayoutReference2 = new ConstrainedLayoutReference(Integer.valueOf(this.childId));
        this.childrenRefs.add(constrainedLayoutReference2);
        return constrainedLayoutReference2;
    }

    @Stable
    @k
    public final ConstrainedLayoutReferences createRefs() {
        ConstrainedLayoutReferences constrainedLayoutReferences = this.referencesObject;
        if (constrainedLayoutReferences != null) {
            return constrainedLayoutReferences;
        }
        ConstrainedLayoutReferences constrainedLayoutReferences2 = new ConstrainedLayoutReferences();
        this.referencesObject = constrainedLayoutReferences2;
        return constrainedLayoutReferences2;
    }

    public final boolean isAnimateChanges() {
        return this.isAnimateChanges;
    }

    @Override // androidx.constraintlayout.compose.ConstraintLayoutBaseScope
    public void reset() {
        super.reset();
        this.childId = this.ChildrenStartIndex;
    }

    public final void setAnimateChanges(boolean z11) {
        this.isAnimateChanges = z11;
    }

    @v0
    public static /* synthetic */ void isAnimateChanges$annotations() {
    }
}
