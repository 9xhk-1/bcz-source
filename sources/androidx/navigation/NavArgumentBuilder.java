package androidx.navigation;

import androidx.navigation.NavArgument;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@NavDestinationDsl
/* loaded from: classes3.dex */
public final class NavArgumentBuilder {

    @l
    private NavType<?> _type;

    @k
    private final NavArgument.Builder builder = new NavArgument.Builder();

    @l
    private Object defaultValue;
    private boolean nullable;
    private boolean unknownDefaultValuePresent;

    @k
    public final NavArgument build() {
        return this.builder.build();
    }

    @l
    public final Object getDefaultValue() {
        return this.defaultValue;
    }

    public final boolean getNullable() {
        return this.nullable;
    }

    @k
    public final NavType<?> getType() {
        NavType<?> navType = this._type;
        if (navType != null) {
            return navType;
        }
        throw new IllegalStateException("NavType has not been set on this builder.");
    }

    public final boolean getUnknownDefaultValuePresent$navigation_common_release() {
        return this.unknownDefaultValuePresent;
    }

    public final void setDefaultValue(@l Object obj) {
        this.defaultValue = obj;
        this.builder.setDefaultValue(obj);
    }

    public final void setNullable(boolean z11) {
        this.nullable = z11;
        this.builder.setIsNullable(z11);
    }

    public final void setType(@k NavType<?> value) {
        g0.p(value, "value");
        this._type = value;
        this.builder.setType(value);
    }

    public final void setUnknownDefaultValuePresent$navigation_common_release(boolean z11) {
        this.unknownDefaultValuePresent = z11;
        this.builder.setUnknownDefaultValuePresent$navigation_common_release(z11);
    }
}
