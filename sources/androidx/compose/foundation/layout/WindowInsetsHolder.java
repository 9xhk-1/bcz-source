package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import m80.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class WindowInsetsHolder {
    private static boolean testInsets;
    private int accessCount;

    @m80.k
    private final AndroidWindowInsets captionBar;

    @m80.k
    private final ValueInsets captionBarIgnoringVisibility;
    private final boolean consumes;

    @m80.k
    private final AndroidWindowInsets displayCutout;

    @m80.k
    private final AndroidWindowInsets ime;

    @m80.k
    private final ValueInsets imeAnimationSource;

    @m80.k
    private final ValueInsets imeAnimationTarget;

    @m80.k
    private final InsetsListener insetsListener;

    @m80.k
    private final AndroidWindowInsets mandatorySystemGestures;

    @m80.k
    private final AndroidWindowInsets navigationBars;

    @m80.k
    private final ValueInsets navigationBarsIgnoringVisibility;

    @m80.k
    private final WindowInsets safeContent;

    @m80.k
    private final WindowInsets safeDrawing;

    @m80.k
    private final WindowInsets safeGestures;

    @m80.k
    private final AndroidWindowInsets statusBars;

    @m80.k
    private final ValueInsets statusBarsIgnoringVisibility;

    @m80.k
    private final AndroidWindowInsets systemBars;

    @m80.k
    private final ValueInsets systemBarsIgnoringVisibility;

    @m80.k
    private final AndroidWindowInsets systemGestures;

    @m80.k
    private final AndroidWindowInsets tappableElement;

    @m80.k
    private final ValueInsets tappableElementIgnoringVisibility;

    @m80.k
    private final ValueInsets waterfall;

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @m80.k
    private static final WeakHashMap<View, WindowInsetsHolder> viewMap = new WeakHashMap<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nWindowInsets.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,729:1\n75#2:730\n1247#3,6:731\n372#4,7:737\n1#5:744\n*S KotlinDebug\n*F\n+ 1 WindowInsets.android.kt\nandroidx/compose/foundation/layout/WindowInsetsHolder$Companion\n*L\n580#1:730\n583#1:731,6\n595#1:737,7\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private final WindowInsetsHolder getOrCreateFor(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.viewMap) {
                try {
                    WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        WindowInsetsHolder windowInsetsHolder2 = new WindowInsetsHolder(null, view, false ? 1 : 0);
                        weakHashMap.put(view, windowInsetsHolder2);
                        obj2 = windowInsetsHolder2;
                    }
                    windowInsetsHolder = (WindowInsetsHolder) obj2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return windowInsetsHolder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidWindowInsets systemInsets(WindowInsetsCompat windowInsetsCompat, int i11, String str) {
            AndroidWindowInsets androidWindowInsets = new AndroidWindowInsets(i11, str);
            if (windowInsetsCompat != null) {
                androidWindowInsets.update$foundation_layout_release(windowInsetsCompat, i11);
            }
            return androidWindowInsets;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ValueInsets valueInsetsIgnoringVisibility(WindowInsetsCompat windowInsetsCompat, int i11, String str) {
            Insets insets;
            if (windowInsetsCompat == null || (insets = windowInsetsCompat.getInsetsIgnoringVisibility(i11)) == null) {
                insets = Insets.NONE;
            }
            return WindowInsets_androidKt.ValueInsets(insets, str);
        }

        @Composable
        @m80.k
        public final WindowInsetsHolder current(@l Composer composer, int i11) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1366542614, i11, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:578)");
            }
            final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            final WindowInsetsHolder orCreateFor = getOrCreateFor(view);
            boolean changedInstance = composer.changedInstance(orCreateFor) | composer.changedInstance(view);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        WindowInsetsHolder.this.incrementAccessors(view);
                        final WindowInsetsHolder windowInsetsHolder = WindowInsetsHolder.this;
                        final View view2 = view;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                WindowInsetsHolder.this.decrementAccessors(view2);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            EffectsKt.DisposableEffect(orCreateFor, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return orCreateFor;
        }

        @o
        public final void setUseTestInsets(boolean z11) {
            WindowInsetsHolder.testInsets = z11;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view, v vVar) {
        this(windowInsetsCompat, view);
    }

    public static /* synthetic */ void update$default(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        windowInsetsHolder.update(windowInsetsCompat, i11);
    }

    public final void decrementAccessors(@m80.k View view) {
        int i11 = this.accessCount - 1;
        this.accessCount = i11;
        if (i11 == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, null);
            ViewCompat.setWindowInsetsAnimationCallback(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    @m80.k
    public final AndroidWindowInsets getCaptionBar() {
        return this.captionBar;
    }

    @m80.k
    public final ValueInsets getCaptionBarIgnoringVisibility() {
        return this.captionBarIgnoringVisibility;
    }

    public final boolean getConsumes() {
        return this.consumes;
    }

    @m80.k
    public final AndroidWindowInsets getDisplayCutout() {
        return this.displayCutout;
    }

    @m80.k
    public final AndroidWindowInsets getIme() {
        return this.ime;
    }

    @m80.k
    public final ValueInsets getImeAnimationSource() {
        return this.imeAnimationSource;
    }

    @m80.k
    public final ValueInsets getImeAnimationTarget() {
        return this.imeAnimationTarget;
    }

    @m80.k
    public final AndroidWindowInsets getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    @m80.k
    public final AndroidWindowInsets getNavigationBars() {
        return this.navigationBars;
    }

    @m80.k
    public final ValueInsets getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    @m80.k
    public final WindowInsets getSafeContent() {
        return this.safeContent;
    }

    @m80.k
    public final WindowInsets getSafeDrawing() {
        return this.safeDrawing;
    }

    @m80.k
    public final WindowInsets getSafeGestures() {
        return this.safeGestures;
    }

    @m80.k
    public final AndroidWindowInsets getStatusBars() {
        return this.statusBars;
    }

    @m80.k
    public final ValueInsets getStatusBarsIgnoringVisibility() {
        return this.statusBarsIgnoringVisibility;
    }

    @m80.k
    public final AndroidWindowInsets getSystemBars() {
        return this.systemBars;
    }

    @m80.k
    public final ValueInsets getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    @m80.k
    public final AndroidWindowInsets getSystemGestures() {
        return this.systemGestures;
    }

    @m80.k
    public final AndroidWindowInsets getTappableElement() {
        return this.tappableElement;
    }

    @m80.k
    public final ValueInsets getTappableElementIgnoringVisibility() {
        return this.tappableElementIgnoringVisibility;
    }

    @m80.k
    public final ValueInsets getWaterfall() {
        return this.waterfall;
    }

    public final void incrementAccessors(@m80.k View view) {
        if (this.accessCount == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            ViewCompat.setWindowInsetsAnimationCallback(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void update(@m80.k WindowInsetsCompat windowInsetsCompat, int i11) {
        if (testInsets) {
            android.view.WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            g0.m(windowInsets);
            windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        }
        this.captionBar.update$foundation_layout_release(windowInsetsCompat, i11);
        this.ime.update$foundation_layout_release(windowInsetsCompat, i11);
        this.displayCutout.update$foundation_layout_release(windowInsetsCompat, i11);
        this.navigationBars.update$foundation_layout_release(windowInsetsCompat, i11);
        this.statusBars.update$foundation_layout_release(windowInsetsCompat, i11);
        this.systemBars.update$foundation_layout_release(windowInsetsCompat, i11);
        this.systemGestures.update$foundation_layout_release(windowInsetsCompat, i11);
        this.tappableElement.update$foundation_layout_release(windowInsetsCompat, i11);
        this.mandatorySystemGestures.update$foundation_layout_release(windowInsetsCompat, i11);
        if (i11 == 0) {
            this.captionBarIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.captionBar())));
            this.navigationBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.navigationBars())));
            this.statusBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.statusBars())));
            this.systemBarsIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.systemBars())));
            this.tappableElementIgnoringVisibility.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(WindowInsetsCompat.Type.tappableElement())));
            DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
            if (displayCutout != null) {
                this.waterfall.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(displayCutout.getWaterfallInsets()));
            }
        }
        Snapshot.Companion.sendApplyNotifications();
    }

    public final void updateImeAnimationSource(@m80.k WindowInsetsCompat windowInsetsCompat) {
        this.imeAnimationSource.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime())));
    }

    public final void updateImeAnimationTarget(@m80.k WindowInsetsCompat windowInsetsCompat) {
        this.imeAnimationTarget.setValue$foundation_layout_release(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime())));
    }

    private WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view) {
        DisplayCutoutCompat displayCutout;
        Insets waterfallInsets;
        Companion companion = Companion;
        this.captionBar = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBar");
        AndroidWindowInsets systemInsets = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.displayCutout(), "displayCutout");
        this.displayCutout = systemInsets;
        AndroidWindowInsets systemInsets2 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "ime");
        this.ime = systemInsets2;
        AndroidWindowInsets systemInsets3 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.mandatorySystemGestures(), "mandatorySystemGestures");
        this.mandatorySystemGestures = systemInsets3;
        this.navigationBars = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBars");
        this.statusBars = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBars");
        AndroidWindowInsets systemInsets4 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBars");
        this.systemBars = systemInsets4;
        AndroidWindowInsets systemInsets5 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.systemGestures(), "systemGestures");
        this.systemGestures = systemInsets5;
        AndroidWindowInsets systemInsets6 = companion.systemInsets(windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElement");
        this.tappableElement = systemInsets6;
        ValueInsets ValueInsets = WindowInsets_androidKt.ValueInsets((windowInsetsCompat == null || (displayCutout = windowInsetsCompat.getDisplayCutout()) == null || (waterfallInsets = displayCutout.getWaterfallInsets()) == null) ? Insets.NONE : waterfallInsets, "waterfall");
        this.waterfall = ValueInsets;
        WindowInsets union = WindowInsetsKt.union(WindowInsetsKt.union(systemInsets4, systemInsets2), systemInsets);
        this.safeDrawing = union;
        WindowInsets union2 = WindowInsetsKt.union(WindowInsetsKt.union(WindowInsetsKt.union(systemInsets6, systemInsets3), systemInsets5), ValueInsets);
        this.safeGestures = union2;
        this.safeContent = WindowInsetsKt.union(union, union2);
        this.captionBarIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.captionBar(), "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.navigationBars(), "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.statusBars(), "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.systemBars(), "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.tappableElement(), "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "imeAnimationTarget");
        this.imeAnimationSource = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, WindowInsetsCompat.Type.ime(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(androidx.compose.ui.R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : true;
        this.insetsListener = new InsetsListener(this);
    }
}
