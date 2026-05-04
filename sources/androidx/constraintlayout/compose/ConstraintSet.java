package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.layout.Measurable;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public interface ConstraintSet {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static void applyTo(@k ConstraintSet constraintSet, @k androidx.constraintlayout.core.state.Transition transition, int i11) {
            ConstraintSet.super.applyTo(transition, i11);
        }

        @Deprecated
        public static boolean isDirty(@k ConstraintSet constraintSet, @k List<? extends Measurable> list) {
            return ConstraintSet.super.isDirty(list);
        }

        @Deprecated
        @k
        public static ConstraintSet override(@k ConstraintSet constraintSet, @k String str, float f11) {
            return ConstraintSet.super.override(str, f11);
        }
    }

    void applyTo(@k State state, @k List<? extends Measurable> list);

    default void applyTo(@k androidx.constraintlayout.core.state.Transition transition, int i11) {
    }

    default boolean isDirty(@k List<? extends Measurable> list) {
        return true;
    }

    @k
    default ConstraintSet override(@k String str, float f11) {
        return this;
    }
}
