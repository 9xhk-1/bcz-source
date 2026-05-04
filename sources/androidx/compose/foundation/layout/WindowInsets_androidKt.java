package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.graphics.Insets;
import kotlin.DeprecationLevel;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class WindowInsets_androidKt {
    @m80.k
    public static final ValueInsets ValueInsets(@m80.k Insets insets, @m80.k String str) {
        return new ValueInsets(toInsetsValues(insets), str);
    }

    @w00.j(name = "getAreNavigationBarsVisible")
    @Composable
    @ExperimentalLayoutApi
    public static final boolean getAreNavigationBarsVisible(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(710310464, i11, -1, "androidx.compose.foundation.layout.<get-areNavigationBarsVisible> (WindowInsets.android.kt:324)");
        }
        boolean isVisible = WindowInsetsHolder.Companion.current(composer, 6).getNavigationBars().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return isVisible;
    }

    @w00.j(name = "getAreStatusBarsVisible")
    @Composable
    @ExperimentalLayoutApi
    public static final boolean getAreStatusBarsVisible(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1613283456, i11, -1, "androidx.compose.foundation.layout.<get-areStatusBarsVisible> (WindowInsets.android.kt:312)");
        }
        boolean isVisible = WindowInsetsHolder.Companion.current(composer, 6).getStatusBars().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return isVisible;
    }

    @w00.j(name = "getAreSystemBarsVisible")
    @Composable
    @ExperimentalLayoutApi
    public static final boolean getAreSystemBarsVisible(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1985490720, i11, -1, "androidx.compose.foundation.layout.<get-areSystemBarsVisible> (WindowInsets.android.kt:336)");
        }
        boolean isVisible = WindowInsetsHolder.Companion.current(composer, 6).getSystemBars().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return isVisible;
    }

    @w00.j(name = "getCaptionBar")
    @Composable
    @m80.k
    public static final WindowInsets getCaptionBar(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1832025528, i11, -1, "androidx.compose.foundation.layout.<get-captionBar> (WindowInsets.android.kt:136)");
        }
        AndroidWindowInsets captionBar = WindowInsetsHolder.Companion.current(composer, 6).getCaptionBar();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return captionBar;
    }

    @w00.j(name = "getCaptionBarIgnoringVisibility")
    @ExperimentalLayoutApi
    @m80.k
    @Composable
    public static final WindowInsets getCaptionBarIgnoringVisibility(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1731251574, i11, -1, "androidx.compose.foundation.layout.<get-captionBarIgnoringVisibility> (WindowInsets.android.kt:225)");
        }
        ValueInsets captionBarIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 6).getCaptionBarIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return captionBarIgnoringVisibility;
    }

    public static final boolean getConsumeWindowInsets(@m80.k AbstractComposeView abstractComposeView) {
        Object tag = abstractComposeView.getTag(androidx.compose.ui.R.id.consume_window_insets_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @w00.j(name = "getDisplayCutout")
    @Composable
    @m80.k
    public static final WindowInsets getDisplayCutout(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1324817724, i11, -1, "androidx.compose.foundation.layout.<get-displayCutout> (WindowInsets.android.kt:143)");
        }
        AndroidWindowInsets displayCutout = WindowInsetsHolder.Companion.current(composer, 6).getDisplayCutout();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return displayCutout;
    }

    @w00.j(name = "getIme")
    @Composable
    @m80.k
    public static final WindowInsets getIme(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1466917860, i11, -1, "androidx.compose.foundation.layout.<get-ime> (WindowInsets.android.kt:155)");
        }
        AndroidWindowInsets ime = WindowInsetsHolder.Companion.current(composer, 6).getIme();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ime;
    }

    @w00.j(name = "getImeAnimationSource")
    @ExperimentalLayoutApi
    @m80.k
    @Composable
    public static final WindowInsets getImeAnimationSource(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1126064918, i11, -1, "androidx.compose.foundation.layout.<get-imeAnimationSource> (WindowInsets.android.kt:361)");
        }
        ValueInsets imeAnimationSource = WindowInsetsHolder.Companion.current(composer, 6).getImeAnimationSource();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imeAnimationSource;
    }

    @w00.j(name = "getImeAnimationTarget")
    @ExperimentalLayoutApi
    @m80.k
    @Composable
    public static final WindowInsets getImeAnimationTarget(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-466319786, i11, -1, "androidx.compose.foundation.layout.<get-imeAnimationTarget> (WindowInsets.android.kt:375)");
        }
        ValueInsets imeAnimationTarget = WindowInsetsHolder.Companion.current(composer, 6).getImeAnimationTarget();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imeAnimationTarget;
    }

    @w00.j(name = "getMandatorySystemGestures")
    @Composable
    @m80.k
    public static final WindowInsets getMandatorySystemGestures(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1369492988, i11, -1, "androidx.compose.foundation.layout.<get-mandatorySystemGestures> (WindowInsets.android.kt:164)");
        }
        AndroidWindowInsets mandatorySystemGestures = WindowInsetsHolder.Companion.current(composer, 6).getMandatorySystemGestures();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mandatorySystemGestures;
    }

    @w00.j(name = "getNavigationBars")
    @Composable
    @m80.k
    public static final WindowInsets getNavigationBars(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1596175702, i11, -1, "androidx.compose.foundation.layout.<get-navigationBars> (WindowInsets.android.kt:171)");
        }
        AndroidWindowInsets navigationBars = WindowInsetsHolder.Companion.current(composer, 6).getNavigationBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBars;
    }

    @w00.j(name = "getNavigationBarsIgnoringVisibility")
    @ExperimentalLayoutApi
    @m80.k
    @Composable
    public static final WindowInsets getNavigationBarsIgnoringVisibility(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1990981160, i11, -1, "androidx.compose.foundation.layout.<get-navigationBarsIgnoringVisibility> (WindowInsets.android.kt:238)");
        }
        ValueInsets navigationBarsIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 6).getNavigationBarsIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return navigationBarsIgnoringVisibility;
    }

    @w00.j(name = "getSafeContent")
    @Composable
    @m80.k
    public static final WindowInsets getSafeContent(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026663876, i11, -1, "androidx.compose.foundation.layout.<get-safeContent> (WindowInsets.android.kt:213)");
        }
        WindowInsets safeContent = WindowInsetsHolder.Companion.current(composer, 6).getSafeContent();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return safeContent;
    }

    @w00.j(name = "getSafeDrawing")
    @Composable
    @m80.k
    public static final WindowInsets getSafeDrawing(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-49441252, i11, -1, "androidx.compose.foundation.layout.<get-safeDrawing> (WindowInsets.android.kt:198)");
        }
        WindowInsets safeDrawing = WindowInsetsHolder.Companion.current(composer, 6).getSafeDrawing();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return safeDrawing;
    }

    @w00.j(name = "getSafeGestures")
    @Composable
    @m80.k
    public static final WindowInsets getSafeGestures(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1594247780, i11, -1, "androidx.compose.foundation.layout.<get-safeGestures> (WindowInsets.android.kt:206)");
        }
        WindowInsets safeGestures = WindowInsetsHolder.Companion.current(composer, 6).getSafeGestures();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return safeGestures;
    }

    @w00.j(name = "getStatusBars")
    @Composable
    @m80.k
    public static final WindowInsets getStatusBars(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-675090670, i11, -1, "androidx.compose.foundation.layout.<get-statusBars> (WindowInsets.android.kt:175)");
        }
        AndroidWindowInsets statusBars = WindowInsetsHolder.Companion.current(composer, 6).getStatusBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return statusBars;
    }

    @w00.j(name = "getStatusBarsIgnoringVisibility")
    @ExperimentalLayoutApi
    @m80.k
    @Composable
    public static final WindowInsets getStatusBarsIgnoringVisibility(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(594020756, i11, -1, "androidx.compose.foundation.layout.<get-statusBarsIgnoringVisibility> (WindowInsets.android.kt:250)");
        }
        ValueInsets statusBarsIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 6).getStatusBarsIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return statusBarsIgnoringVisibility;
    }

    @w00.j(name = "getSystemBars")
    @Composable
    @m80.k
    public static final WindowInsets getSystemBars(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-282936756, i11, -1, "androidx.compose.foundation.layout.<get-systemBars> (WindowInsets.android.kt:179)");
        }
        AndroidWindowInsets systemBars = WindowInsetsHolder.Companion.current(composer, 6).getSystemBars();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return systemBars;
    }

    @w00.j(name = "getSystemBarsIgnoringVisibility")
    @ExperimentalLayoutApi
    @m80.k
    @Composable
    public static final WindowInsets getSystemBarsIgnoringVisibility(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1564566798, i11, -1, "androidx.compose.foundation.layout.<get-systemBarsIgnoringVisibility> (WindowInsets.android.kt:263)");
        }
        ValueInsets systemBarsIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 6).getSystemBarsIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return systemBarsIgnoringVisibility;
    }

    @w00.j(name = "getSystemGestures")
    @Composable
    @m80.k
    public static final WindowInsets getSystemGestures(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(989216224, i11, -1, "androidx.compose.foundation.layout.<get-systemGestures> (WindowInsets.android.kt:183)");
        }
        AndroidWindowInsets systemGestures = WindowInsetsHolder.Companion.current(composer, 6).getSystemGestures();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return systemGestures;
    }

    @w00.j(name = "getTappableElement")
    @Composable
    @m80.k
    public static final WindowInsets getTappableElement(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994205284, i11, -1, "androidx.compose.foundation.layout.<get-tappableElement> (WindowInsets.android.kt:187)");
        }
        AndroidWindowInsets tappableElement = WindowInsetsHolder.Companion.current(composer, 6).getTappableElement();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tappableElement;
    }

    @w00.j(name = "getTappableElementIgnoringVisibility")
    @ExperimentalLayoutApi
    @m80.k
    @Composable
    public static final WindowInsets getTappableElementIgnoringVisibility(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1488788292, i11, -1, "androidx.compose.foundation.layout.<get-tappableElementIgnoringVisibility> (WindowInsets.android.kt:276)");
        }
        ValueInsets tappableElementIgnoringVisibility = WindowInsetsHolder.Companion.current(composer, 6).getTappableElementIgnoringVisibility();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return tappableElementIgnoringVisibility;
    }

    @w00.j(name = "getWaterfall")
    @Composable
    @m80.k
    public static final WindowInsets getWaterfall(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1943241020, i11, -1, "androidx.compose.foundation.layout.<get-waterfall> (WindowInsets.android.kt:191)");
        }
        ValueInsets waterfall = WindowInsetsHolder.Companion.current(composer, 6).getWaterfall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return waterfall;
    }

    @w00.j(name = "isCaptionBarVisible")
    @Composable
    @ExperimentalLayoutApi
    public static final boolean isCaptionBarVisible(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-501076620, i11, -1, "androidx.compose.foundation.layout.<get-isCaptionBarVisible> (WindowInsets.android.kt:288)");
        }
        boolean isVisible = WindowInsetsHolder.Companion.current(composer, 6).getCaptionBar().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return isVisible;
    }

    @w00.j(name = "isImeVisible")
    @Composable
    @ExperimentalLayoutApi
    public static final boolean isImeVisible(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1873571424, i11, -1, "androidx.compose.foundation.layout.<get-isImeVisible> (WindowInsets.android.kt:300)");
        }
        boolean isVisible = WindowInsetsHolder.Companion.current(composer, 6).getIme().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return isVisible;
    }

    @w00.j(name = "isTappableElementVisible")
    @Composable
    @ExperimentalLayoutApi
    public static final boolean isTappableElementVisible(@m80.k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1737201120, i11, -1, "androidx.compose.foundation.layout.<get-isTappableElementVisible> (WindowInsets.android.kt:347)");
        }
        boolean isVisible = WindowInsetsHolder.Companion.current(composer, 6).getTappableElement().isVisible();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return isVisible;
    }

    public static final void setConsumeWindowInsets(@m80.k AbstractComposeView abstractComposeView, boolean z11) {
        abstractComposeView.setTag(androidx.compose.ui.R.id.consume_window_insets_tag, Boolean.valueOf(z11));
    }

    @m80.k
    public static final InsetsValues toInsetsValues(@m80.k Insets insets) {
        return new InsetsValues(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final /* synthetic */ boolean getConsumeWindowInsets(ComposeView composeView) {
        Object tag = composeView.getTag(androidx.compose.ui.R.id.consume_window_insets_tag);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getAreNavigationBarsVisible$annotations(WindowInsets.Companion companion) {
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getAreStatusBarsVisible$annotations(WindowInsets.Companion companion) {
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getAreSystemBarsVisible$annotations(WindowInsets.Companion companion) {
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getCaptionBarIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Please use AbstractComposeView.consumeWindowInsets")
    public static /* synthetic */ void getConsumeWindowInsets$annotations(ComposeView composeView) {
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getImeAnimationSource$annotations(WindowInsets.Companion companion) {
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getImeAnimationTarget$annotations(WindowInsets.Companion companion) {
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getNavigationBarsIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getStatusBarsIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getSystemBarsIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void getTappableElementIgnoringVisibility$annotations(WindowInsets.Companion companion) {
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void isCaptionBarVisible$annotations(WindowInsets.Companion companion) {
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void isImeVisible$annotations(WindowInsets.Companion companion) {
    }

    @ExperimentalLayoutApi
    public static /* synthetic */ void isTappableElementVisible$annotations(WindowInsets.Companion companion) {
    }
}
