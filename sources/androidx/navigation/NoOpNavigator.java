package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.navigation.Navigator;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Navigator.Name("NoOp")
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class NoOpNavigator extends Navigator<NavDestination> {
    @Override // androidx.navigation.Navigator
    @k
    public NavDestination createDestination() {
        return new NavDestination(this);
    }

    @Override // androidx.navigation.Navigator
    @k
    public NavDestination navigate(@k NavDestination destination, @l Bundle bundle, @l NavOptions navOptions, @l Navigator.Extras extras) {
        g0.p(destination, "destination");
        return destination;
    }

    @Override // androidx.navigation.Navigator
    public boolean popBackStack() {
        return true;
    }
}
