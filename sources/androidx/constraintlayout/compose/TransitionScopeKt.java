package androidx.constraintlayout.compose;

import androidx.media3.extractor.text.ttml.TtmlNode;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class TransitionScopeKt {
    @ExperimentalMotionApi
    @k
    public static final Transition Transition(@k String str, @k String str2, @k l<? super TransitionScope, g2> lVar) {
        TransitionScope transitionScope = new TransitionScope(str, str2);
        lVar.invoke(transitionScope);
        return new TransitionImpl(transitionScope.getObject$constraintlayout_compose_release());
    }

    public static /* synthetic */ Transition Transition$default(String str, String str2, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = TtmlNode.START;
        }
        if ((i11 & 2) != 0) {
            str2 = TtmlNode.END;
        }
        return Transition(str, str2, lVar);
    }
}
