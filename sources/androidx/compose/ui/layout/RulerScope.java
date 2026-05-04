package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Density;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@MeasureScopeMarker
/* loaded from: classes.dex */
public interface RulerScope extends Density {
    @k
    LayoutCoordinates getCoordinates();

    void provides(@k Ruler ruler, float f11);

    void providesRelative(@k VerticalRuler verticalRuler, float f11);
}
