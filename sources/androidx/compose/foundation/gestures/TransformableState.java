package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import j00.c;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface TransformableState {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object transform$default(TransformableState transformableState, MutatePriority mutatePriority, p pVar, c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transform");
        }
        if ((i11 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return transformableState.transform(mutatePriority, pVar, cVar);
    }

    boolean isTransformInProgress();

    @l
    Object transform(@k MutatePriority mutatePriority, @k p<? super TransformScope, ? super c<? super g2>, ? extends Object> pVar, @k c<? super g2> cVar);
}
