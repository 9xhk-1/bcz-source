package androidx.constraintlayout.compose;

import a00.a0;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLObject;
import java.util.Arrays;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ConstraintSetScope extends ConstraintLayoutBaseScope {
    public static final int $stable = 8;
    private int generatedCount;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintSetScope$ConstrainedLayoutReferences\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2303:1\n1#2:2304\n*E\n"})
    public final class ConstrainedLayoutReferences {

        @k
        private final Object[] ids;

        public ConstrainedLayoutReferences(@k Object[] objArr) {
            this.ids = objArr;
        }

        @k
        public final ConstrainedLayoutReference component1() {
            Object[] objArr = this.ids;
            return new ConstrainedLayoutReference(a0.Oe(objArr) >= 0 ? objArr[0] : ConstraintSetScope.this.nextId());
        }

        @k
        public final ConstrainedLayoutReference component10() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(9 <= a0.Oe(objArr) ? objArr[9] : constraintSetScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component11() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(10 <= a0.Oe(objArr) ? objArr[10] : constraintSetScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component12() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(11 <= a0.Oe(objArr) ? objArr[11] : constraintSetScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component13() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(12 <= a0.Oe(objArr) ? objArr[12] : constraintSetScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component14() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(13 <= a0.Oe(objArr) ? objArr[13] : constraintSetScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component15() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(14 <= a0.Oe(objArr) ? objArr[14] : constraintSetScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component16() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(15 <= a0.Oe(objArr) ? objArr[15] : constraintSetScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component2() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(1 <= a0.Oe(objArr) ? objArr[1] : constraintSetScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component3() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(2 <= a0.Oe(objArr) ? objArr[2] : constraintSetScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component4() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(3 <= a0.Oe(objArr) ? objArr[3] : constraintSetScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component5() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(4 <= a0.Oe(objArr) ? objArr[4] : constraintSetScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component6() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(5 <= a0.Oe(objArr) ? objArr[5] : constraintSetScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component7() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(6 <= a0.Oe(objArr) ? objArr[6] : constraintSetScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component8() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(7 <= a0.Oe(objArr) ? objArr[7] : constraintSetScope.nextId());
        }

        @k
        public final ConstrainedLayoutReference component9() {
            ConstraintSetScope constraintSetScope = ConstraintSetScope.this;
            Object[] objArr = this.ids;
            return constraintSetScope.createRefFor(8 <= a0.Oe(objArr) ? objArr[8] : constraintSetScope.nextId());
        }
    }

    public ConstraintSetScope(@l CLObject cLObject) {
        super(cLObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String nextId() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("androidx.constraintlayout.id");
        int i11 = this.generatedCount;
        this.generatedCount = i11 + 1;
        sb2.append(i11);
        return sb2.toString();
    }

    @k
    public final ConstrainedLayoutReference createRefFor(@k Object obj) {
        return new ConstrainedLayoutReference(obj);
    }

    @k
    public final ConstrainedLayoutReferences createRefsFor(@k Object... objArr) {
        return new ConstrainedLayoutReferences(Arrays.copyOf(objArr, objArr.length));
    }
}
