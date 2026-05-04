package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ModifierInfo {
    public static final int $stable = 8;

    @k
    private final LayoutCoordinates coordinates;

    @l
    private final Object extra;

    @k
    private final Modifier modifier;

    public ModifierInfo(@k Modifier modifier, @k LayoutCoordinates layoutCoordinates, @l Object obj) {
        this.modifier = modifier;
        this.coordinates = layoutCoordinates;
        this.extra = obj;
    }

    @k
    public final LayoutCoordinates getCoordinates() {
        return this.coordinates;
    }

    @l
    public final Object getExtra() {
        return this.extra;
    }

    @k
    public final Modifier getModifier() {
        return this.modifier;
    }

    @k
    public String toString() {
        return "ModifierInfo(" + this.modifier + j2.O + this.coordinates + j2.O + this.extra + ')';
    }

    public /* synthetic */ ModifierInfo(Modifier modifier, LayoutCoordinates layoutCoordinates, Object obj, int i11, v vVar) {
        this(modifier, layoutCoordinates, (i11 & 4) != 0 ? null : obj);
    }
}
