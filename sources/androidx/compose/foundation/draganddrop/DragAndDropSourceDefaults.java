package androidx.compose.foundation.draganddrop;

import androidx.compose.runtime.Immutable;
import j00.c;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
public final class DragAndDropSourceDefaults {
    public static final int $stable = 0;

    @k
    public static final DragAndDropSourceDefaults INSTANCE = new DragAndDropSourceDefaults();

    @k
    private static final p<DragAndDropStartDetectorScope, c<? super g2>, Object> DefaultStartDetector = new DragAndDropSourceDefaults$DefaultStartDetector$1(null);

    private DragAndDropSourceDefaults() {
    }

    @k
    public final p<DragAndDropStartDetectorScope, c<? super g2>, Object> getDefaultStartDetector() {
        return DefaultStartDetector;
    }
}
