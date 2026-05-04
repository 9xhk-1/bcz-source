package androidx.constraintlayout.compose;

import androidx.compose.runtime.Immutable;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public interface Transition {
    @k
    String getEndConstraintSetId();

    @k
    String getStartConstraintSetId();
}
