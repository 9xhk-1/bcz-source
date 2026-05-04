package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class Ruler {
    public static final int $stable = 0;

    public /* synthetic */ Ruler(v vVar) {
        this();
    }

    public abstract float calculateCoordinate$ui_release(float f11, @k LayoutCoordinates layoutCoordinates, @k LayoutCoordinates layoutCoordinates2);

    private Ruler() {
    }
}
