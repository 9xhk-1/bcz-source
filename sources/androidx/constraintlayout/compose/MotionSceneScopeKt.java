package androidx.constraintlayout.compose;

import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class MotionSceneScopeKt {

    @k
    private static final String UNDEFINED_NAME_PREFIX = "androidx.constraintlayout";

    @ExperimentalMotionApi
    @k
    public static final MotionScene MotionScene(@k l<? super MotionSceneScope, g2> lVar) {
        MotionSceneScope motionSceneScope = new MotionSceneScope();
        lVar.invoke(motionSceneScope);
        return new MotionSceneDslImpl(motionSceneScope.getConstraintSetsByName$constraintlayout_compose_release(), motionSceneScope.getTransitionsByName$constraintlayout_compose_release());
    }
}
