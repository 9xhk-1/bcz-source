package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface BasicTooltipState {
    static /* synthetic */ Object show$default(BasicTooltipState basicTooltipState, MutatePriority mutatePriority, j00.c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
        if ((i11 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return basicTooltipState.show(mutatePriority, cVar);
    }

    void dismiss();

    boolean isPersistent();

    boolean isVisible();

    void onDispose();

    @l
    Object show(@m80.k MutatePriority mutatePriority, @m80.k j00.c<? super g2> cVar);
}
