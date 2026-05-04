package androidx.compose.runtime;

import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface PausableComposition extends ReusableComposition {
    @k
    PausedComposition setPausableContent(@k p<? super Composer, ? super Integer, g2> pVar);

    @k
    PausedComposition setPausableContentWithReuse(@k p<? super Composer, ? super Integer, g2> pVar);
}
