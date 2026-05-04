package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.layout.Measurable;
import java.util.List;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public interface DerivedConstraintSet extends ConstraintSet {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static void applyTo(@k DerivedConstraintSet derivedConstraintSet, @k androidx.constraintlayout.core.state.Transition transition, int i11) {
            DerivedConstraintSet.super.applyTo(transition, i11);
        }

        @Deprecated
        public static boolean isDirty(@k DerivedConstraintSet derivedConstraintSet, @k List<? extends Measurable> list) {
            return DerivedConstraintSet.super.isDirty(list);
        }

        @Deprecated
        @k
        public static ConstraintSet override(@k DerivedConstraintSet derivedConstraintSet, @k String str, float f11) {
            return DerivedConstraintSet.super.override(str, f11);
        }

        @Deprecated
        public static void applyTo(@k DerivedConstraintSet derivedConstraintSet, @k State state, @k List<? extends Measurable> list) {
            DerivedConstraintSet.super.applyTo(state, list);
        }
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    default void applyTo(@k State state, @k List<? extends Measurable> list) {
        ConstraintSet extendFrom = getExtendFrom();
        if (extendFrom != null) {
            extendFrom.applyTo(state, list);
        }
        applyToState(state);
    }

    void applyToState(@k State state);

    @l
    ConstraintSet getExtendFrom();
}
