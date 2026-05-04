package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composer;
import androidx.constraintlayout.compose.MotionLayoutScope;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface MotionItemsProvider {
    int count();

    @k
    p<Composer, Integer, g2> getContent(int i11);

    @k
    p<Composer, Integer, g2> getContent(int i11, @k androidx.compose.runtime.State<MotionLayoutScope.MotionProperties> state);

    boolean hasItemsWithProperties();
}
