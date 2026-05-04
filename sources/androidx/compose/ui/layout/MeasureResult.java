package androidx.compose.ui.layout;

import java.util.Map;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface MeasureResult {
    @k
    Map<AlignmentLine, Integer> getAlignmentLines();

    int getHeight();

    @l
    default x00.l<RulerScope, g2> getRulers() {
        return null;
    }

    int getWidth();

    void placeChildren();
}
