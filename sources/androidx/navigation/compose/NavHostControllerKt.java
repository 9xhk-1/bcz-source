package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import java.util.Arrays;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavHostController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostController.kt\nandroidx/navigation/compose/NavHostControllerKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,83:1\n77#2:84\n1225#3,6:85\n*S KotlinDebug\n*F\n+ 1 NavHostController.kt\nandroidx/navigation/compose/NavHostControllerKt\n*L\n59#1:84\n60#1:85,6\n*E\n"})
/* loaded from: classes3.dex */
public final class NavHostControllerKt {
    private static final Saver<NavHostController, ?> NavControllerSaver(final Context context) {
        return SaverKt.Saver(new p<SaverScope, NavHostController, Bundle>() { // from class: androidx.navigation.compose.NavHostControllerKt$NavControllerSaver$1
            @Override // x00.p
            public final Bundle invoke(SaverScope saverScope, NavHostController navHostController) {
                return navHostController.saveState();
            }
        }, new l<Bundle, NavHostController>() { // from class: androidx.navigation.compose.NavHostControllerKt$NavControllerSaver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final NavHostController invoke(Bundle bundle) {
                NavHostController createNavController;
                createNavController = NavHostControllerKt.createNavController(context);
                createNavController.restoreState(bundle);
                return createNavController;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavHostController createNavController(Context context) {
        NavHostController navHostController = new NavHostController(context);
        navHostController.getNavigatorProvider().addNavigator(new ComposeNavGraphNavigator(navHostController.getNavigatorProvider()));
        navHostController.getNavigatorProvider().addNavigator(new ComposeNavigator());
        navHostController.getNavigatorProvider().addNavigator(new DialogNavigator());
        return navHostController;
    }

    @Composable
    @k
    public static final State<NavBackStackEntry> currentBackStackEntryAsState(@k NavController navController, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-120375203, i11, -1, "androidx.navigation.compose.currentBackStackEntryAsState (NavHostController.kt:41)");
        }
        State<NavBackStackEntry> collectAsState = SnapshotStateKt.collectAsState(navController.getCurrentBackStackEntryFlow(), null, null, composer, 48, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return collectAsState;
    }

    @Composable
    @k
    public static final NavHostController rememberNavController(@k Navigator<? extends NavDestination>[] navigatorArr, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-312215566, i11, -1, "androidx.navigation.compose.rememberNavController (NavHostController.kt:57)");
        }
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Object[] copyOf = Arrays.copyOf(navigatorArr, navigatorArr.length);
        Saver<NavHostController, ?> NavControllerSaver = NavControllerSaver(context);
        boolean changedInstance = composer.changedInstance(context);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.a<NavHostController>() { // from class: androidx.navigation.compose.NavHostControllerKt$rememberNavController$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final NavHostController invoke() {
                    NavHostController createNavController;
                    createNavController = NavHostControllerKt.createNavController(context);
                    return createNavController;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        NavHostController navHostController = (NavHostController) RememberSaveableKt.m2066rememberSaveable(copyOf, (Saver) NavControllerSaver, (String) null, (x00.a) rememberedValue, composer, 0, 4);
        for (Navigator<? extends NavDestination> navigator : navigatorArr) {
            navHostController.getNavigatorProvider().addNavigator(navigator);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navHostController;
    }
}
