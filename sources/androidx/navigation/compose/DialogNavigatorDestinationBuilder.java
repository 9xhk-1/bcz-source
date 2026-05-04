package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.window.DialogProperties;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.NavType;
import androidx.navigation.compose.DialogNavigator;
import h10.d;
import h10.r;
import java.util.Map;
import m80.k;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@NavDestinationDsl
/* loaded from: classes3.dex */
public final class DialogNavigatorDestinationBuilder extends NavDestinationBuilder<DialogNavigator.Destination> {
    public static final int $stable = 0;

    @k
    private final q<NavBackStackEntry, Composer, Integer, g2> content;

    @k
    private final DialogNavigator dialogNavigator;

    @k
    private final DialogProperties dialogProperties;

    /* JADX WARN: Multi-variable type inference failed */
    public DialogNavigatorDestinationBuilder(@k DialogNavigator dialogNavigator, @k String str, @k DialogProperties dialogProperties, @k q<? super NavBackStackEntry, ? super Composer, ? super Integer, g2> qVar) {
        super(dialogNavigator, str);
        this.dialogNavigator = dialogNavigator;
        this.dialogProperties = dialogProperties;
        this.content = qVar;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @k
    public DialogNavigator.Destination instantiateDestination() {
        return new DialogNavigator.Destination(this.dialogNavigator, this.dialogProperties, this.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialogNavigatorDestinationBuilder(@k DialogNavigator dialogNavigator, @k d<?> dVar, @k Map<r, NavType<?>> map, @k DialogProperties dialogProperties, @k q<? super NavBackStackEntry, ? super Composer, ? super Integer, g2> qVar) {
        super(dialogNavigator, dVar, map);
        this.dialogNavigator = dialogNavigator;
        this.dialogProperties = dialogProperties;
        this.content = qVar;
    }
}
