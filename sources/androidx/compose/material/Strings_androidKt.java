package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,41:1\n75#2:42\n75#2:43\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n*L\n27#1:42\n28#1:43\n*E\n"})
/* loaded from: classes.dex */
public final class Strings_androidKt {
    @Composable
    @k
    /* renamed from: getString-4foXLRw, reason: not valid java name */
    public static final String m1783getString4foXLRw(int i11, @l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-726638443, i12, -1, "androidx.compose.material.getString (Strings.android.kt:25)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.Companion;
        String string = Strings.m1771equalsimpl0(i11, companion.m1779getNavigationMenuUdPEhr4()) ? resources.getString(androidx.compose.ui.R.string.navigation_menu) : Strings.m1771equalsimpl0(i11, companion.m1775getCloseDrawerUdPEhr4()) ? resources.getString(androidx.compose.ui.R.string.close_drawer) : Strings.m1771equalsimpl0(i11, companion.m1776getCloseSheetUdPEhr4()) ? resources.getString(androidx.compose.ui.R.string.close_sheet) : Strings.m1771equalsimpl0(i11, companion.m1777getDefaultErrorMessageUdPEhr4()) ? resources.getString(androidx.compose.ui.R.string.default_error_message) : Strings.m1771equalsimpl0(i11, companion.m1778getExposedDropdownMenuUdPEhr4()) ? resources.getString(androidx.compose.ui.R.string.dropdown_menu) : Strings.m1771equalsimpl0(i11, companion.m1781getSliderRangeStartUdPEhr4()) ? resources.getString(androidx.compose.ui.R.string.range_start) : Strings.m1771equalsimpl0(i11, companion.m1780getSliderRangeEndUdPEhr4()) ? resources.getString(androidx.compose.ui.R.string.range_end) : Strings.m1771equalsimpl0(i11, companion.m1782getSnackbarPaneTitleUdPEhr4()) ? resources.getString(R.string.mc2_snackbar_pane_title) : "";
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }
}
