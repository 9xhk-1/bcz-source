package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import java.util.List;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 NavController.kt\nandroidx/navigation/NavControllerKt\n+ 4 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,780:1\n1225#2,3:781\n1228#2,3:786\n1225#2,3:789\n1228#2,3:794\n1225#2,3:797\n1228#2,3:802\n1225#2,3:805\n1228#2,3:810\n1225#2,3:813\n1228#2,3:818\n1225#2,6:823\n1225#2,6:829\n1225#2,6:835\n1225#2,6:841\n1225#2,6:847\n1225#2,6:853\n1225#2,6:859\n1225#2,6:865\n1225#2,6:871\n1225#2,6:877\n1225#2,6:883\n1225#2,6:889\n1225#2,6:895\n1225#2,6:901\n1225#2,6:907\n2892#3:784\n2892#3:792\n2892#3:800\n2909#3:808\n2926#3:816\n59#4:785\n59#4:793\n59#4:801\n77#4:809\n95#4:817\n77#5:821\n146#6:822\n146#6:913\n81#7:914\n81#7:918\n107#7,2:919\n81#7:921\n81#7:922\n79#8:915\n112#8,2:916\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt\n*L\n94#1:781,3\n94#1:786,3\n146#1:789,3\n146#1:794,3\n214#1:797,3\n214#1:802,3\n286#1:805,3\n286#1:810,3\n358#1:813,3\n358#1:818,3\n512#1:823,6\n513#1:829,6\n514#1:835,6\n541#1:841,6\n552#1:847,6\n562#1:853,6\n565#1:859,6\n579#1:865,6\n595#1:871,6\n603#1:877,6\n609#1:883,6\n619#1:889,6\n624#1:895,6\n657#1:901,6\n710#1:907,6\n95#1:784\n147#1:792\n215#1:800\n287#1:808\n359#1:816\n95#1:785\n147#1:793\n215#1:801\n287#1:809\n359#1:817\n493#1:821\n507#1:822\n729#1:913\n510#1:914\n513#1:918\n513#1:919,2\n549#1:921\n552#1:922\n512#1:915\n512#1:916,2\n*E\n"})
/* loaded from: classes3.dex */
public final class NavHostKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0068  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r19, final java.lang.String r20, androidx.compose.ui.Modifier r21, java.lang.String r22, final x00.l r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, java.lang.String, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean NavHost$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavHost$lambda$12(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$15(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$17(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$6(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition createEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getEnterTransition$navigation_compose_release();
            if (enterTransition$navigation_compose_release2 != null) {
                return enterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (enterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return enterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition createExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getExitTransition$navigation_compose_release();
            if (exitTransition$navigation_compose_release2 != null) {
                return exitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (exitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return exitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition createPopEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopEnterTransition$navigation_compose_release();
            if (popEnterTransition$navigation_compose_release2 != null) {
                return popEnterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popEnterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return popEnterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition createPopExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopExitTransition$navigation_compose_release();
            if (popExitTransition$navigation_compose_release2 != null) {
                return popExitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popExitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return popExitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SizeTransform createSizeTransform(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getSizeTransform$navigation_compose_release();
            if (sizeTransform$navigation_compose_release2 != null) {
                return sizeTransform$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (sizeTransform$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getSizeTransform$navigation_compose_release()) == null) {
            return null;
        }
        return sizeTransform$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports sizeTransform")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r25, final java.lang.String r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.Alignment r28, java.lang.String r29, x00.l r30, x00.l r31, x00.l r32, x00.l r33, final x00.l r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, java.lang.String, x00.l, x00.l, x00.l, x00.l, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01af  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(@m80.k final androidx.navigation.NavHostController r27, @m80.k final java.lang.String r28, @m80.l androidx.compose.ui.Modifier r29, @m80.l androidx.compose.ui.Alignment r30, @m80.l java.lang.String r31, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r32, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r33, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r34, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r35, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.SizeTransform> r36, @m80.k final x00.l<? super androidx.navigation.NavGraphBuilder, yz.g2> r37, @m80.l androidx.compose.runtime.Composer r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, java.lang.String, x00.l, x00.l, x00.l, x00.l, x00.l, x00.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(@m80.k final androidx.navigation.NavHostController r29, @m80.k final h10.d<?> r30, @m80.l androidx.compose.ui.Modifier r31, @m80.l androidx.compose.ui.Alignment r32, @m80.l h10.d<?> r33, @m80.l java.util.Map<h10.r, androidx.navigation.NavType<?>> r34, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r35, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r36, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r37, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r38, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.SizeTransform> r39, @m80.k final x00.l<? super androidx.navigation.NavGraphBuilder, yz.g2> r40, @m80.l androidx.compose.runtime.Composer r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, h10.d, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, h10.d, java.util.Map, x00.l, x00.l, x00.l, x00.l, x00.l, x00.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e9  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(@m80.k final androidx.navigation.NavHostController r29, @m80.k final java.lang.Object r30, @m80.l androidx.compose.ui.Modifier r31, @m80.l androidx.compose.ui.Alignment r32, @m80.l h10.d<?> r33, @m80.l java.util.Map<h10.r, androidx.navigation.NavType<?>> r34, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r35, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r36, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r37, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r38, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.SizeTransform> r39, @m80.k final x00.l<? super androidx.navigation.NavGraphBuilder, yz.g2> r40, @m80.l androidx.compose.runtime.Composer r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, h10.d, java.util.Map, x00.l, x00.l, x00.l, x00.l, x00.l, x00.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r17, final androidx.navigation.NavGraph r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            r4 = r21
            r0 = -957014592(0xffffffffc6f51dc0, float:-31374.875)
            r1 = r20
            androidx.compose.runtime.Composer r14 = r1.startRestartGroup(r0)
            r1 = r22 & 1
            if (r1 == 0) goto L15
            r1 = r4 | 6
            r2 = r1
            r1 = r17
            goto L29
        L15:
            r1 = r4 & 6
            if (r1 != 0) goto L26
            r1 = r17
            boolean r2 = r14.changedInstance(r1)
            if (r2 == 0) goto L23
            r2 = 4
            goto L24
        L23:
            r2 = 2
        L24:
            r2 = r2 | r4
            goto L29
        L26:
            r1 = r17
            r2 = r4
        L29:
            r3 = r22 & 2
            if (r3 == 0) goto L32
            r2 = r2 | 48
            r6 = r18
            goto L44
        L32:
            r3 = r4 & 48
            r6 = r18
            if (r3 != 0) goto L44
            boolean r3 = r14.changedInstance(r6)
            if (r3 == 0) goto L41
            r3 = 32
            goto L43
        L41:
            r3 = 16
        L43:
            r2 = r2 | r3
        L44:
            r3 = r22 & 4
            if (r3 == 0) goto L4d
            r2 = r2 | 384(0x180, float:5.38E-43)
        L4a:
            r5 = r19
            goto L5f
        L4d:
            r5 = r4 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L4a
            r5 = r19
            boolean r7 = r14.changed(r5)
            if (r7 == 0) goto L5c
            r7 = 256(0x100, float:3.59E-43)
            goto L5e
        L5c:
            r7 = 128(0x80, float:1.794E-43)
        L5e:
            r2 = r2 | r7
        L5f:
            r7 = r2 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L71
            boolean r7 = r14.getSkipping()
            if (r7 != 0) goto L6c
            goto L71
        L6c:
            r14.skipToGroupEnd()
            r3 = r5
            goto L9c
        L71:
            if (r3 == 0) goto L77
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.Companion
            r7 = r3
            goto L78
        L77:
            r7 = r5
        L78:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L84
            r3 = -1
            java.lang.String r5 = "androidx.navigation.compose.NavHost (NavHost.kt:392)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r2, r3, r5)
        L84:
            r15 = r2 & 1022(0x3fe, float:1.432E-42)
            r16 = 504(0x1f8, float:7.06E-43)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r5 = r1
            NavHost(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L9b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L9b:
            r3 = r7
        L9c:
            androidx.compose.runtime.ScopeUpdateScope r6 = r14.endRestartGroup()
            if (r6 == 0) goto Lb0
            androidx.navigation.compose.NavHostKt$NavHost$19 r0 = new androidx.navigation.compose.NavHostKt$NavHost$19
            r1 = r17
            r2 = r18
            r5 = r22
            r0.<init>()
            r6.updateScope(r0)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0082  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @android.annotation.SuppressLint({"StateFlowValueCalledInComposition"})
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports sizeTransform")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void NavHost(final androidx.navigation.NavHostController r23, final androidx.navigation.NavGraph r24, androidx.compose.ui.Modifier r25, androidx.compose.ui.Alignment r26, x00.l r27, x00.l r28, x00.l r29, x00.l r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, x00.l, x00.l, x00.l, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c4  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @android.annotation.SuppressLint({"StateFlowValueCalledInComposition"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavHost(@m80.k final androidx.navigation.NavHostController r32, @m80.k final androidx.navigation.NavGraph r33, @m80.l androidx.compose.ui.Modifier r34, @m80.l androidx.compose.ui.Alignment r35, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r36, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r37, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.EnterTransition> r38, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.ExitTransition> r39, @m80.l x00.l<androidx.compose.animation.AnimatedContentTransitionScope<androidx.navigation.NavBackStackEntry>, androidx.compose.animation.SizeTransform> r40, @m80.l androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 1455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt.NavHost(androidx.navigation.NavHostController, androidx.navigation.NavGraph, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, x00.l, x00.l, x00.l, x00.l, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
