package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWindowInsetsPadding.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,247:1\n240#1,7:249\n240#1,7:257\n240#1,7:265\n240#1,7:273\n240#1,7:281\n240#1,7:289\n240#1,7:297\n240#1,7:305\n240#1,7:313\n240#1,7:321\n240#1,7:329\n240#1,7:337\n110#2:248\n110#2:256\n110#2:264\n110#2:272\n110#2:280\n110#2:288\n110#2:296\n110#2:304\n110#2:312\n110#2:320\n110#2:328\n110#2:336\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.android.kt\nandroidx/compose/foundation/layout/WindowInsetsPadding_androidKt\n*L\n41#1:249,7\n58#1:257,7\n75#1:265,7\n92#1:273,7\n109#1:281,7\n126#1:289,7\n143#1:297,7\n160#1:305,7\n177#1:313,7\n194#1:321,7\n211#1:329,7\n230#1:337,7\n41#1:248\n58#1:256\n75#1:264\n92#1:272\n109#1:280\n126#1:288\n143#1:296\n160#1:304\n177#1:312\n194#1:320\n211#1:328\n230#1:336\n*E\n"})
/* loaded from: classes.dex */
public final class WindowInsetsPadding_androidKt {
    @m80.k
    public static final Modifier captionBarPadding(@m80.k Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$captionBarPadding$$inlined$debugInspectorInfo$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("captionBarPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$captionBarPadding$$inlined$windowInsetsPadding$1
            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 6);
                boolean changed = composer.changed(current);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(current.getCaptionBar());
                    composer.updateRememberedValue(rememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @m80.k
    public static final Modifier displayCutoutPadding(@m80.k Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$debugInspectorInfo$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("displayCutoutPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1
            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 6);
                boolean changed = composer.changed(current);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(current.getDisplayCutout());
                    composer.updateRememberedValue(rememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @m80.k
    public static final Modifier imePadding(@m80.k Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$imePadding$$inlined$debugInspectorInfo$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("imePadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1
            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 6);
                boolean changed = composer.changed(current);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(current.getIme());
                    composer.updateRememberedValue(rememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @m80.k
    public static final Modifier mandatorySystemGesturesPadding(@m80.k Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$debugInspectorInfo$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("mandatorySystemGesturesPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$windowInsetsPadding$1
            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 6);
                boolean changed = composer.changed(current);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(current.getMandatorySystemGestures());
                    composer.updateRememberedValue(rememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @m80.k
    public static final Modifier navigationBarsPadding(@m80.k Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("navigationBarsPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1
            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 6);
                boolean changed = composer.changed(current);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(current.getNavigationBars());
                    composer.updateRememberedValue(rememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @m80.k
    public static final Modifier safeContentPadding(@m80.k Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeContentPadding$$inlined$debugInspectorInfo$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("safeContentPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeContentPadding$$inlined$windowInsetsPadding$1
            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 6);
                boolean changed = composer.changed(current);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(current.getSafeContent());
                    composer.updateRememberedValue(rememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @m80.k
    public static final Modifier safeDrawingPadding(@m80.k Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$debugInspectorInfo$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("safeDrawingPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$windowInsetsPadding$1
            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 6);
                boolean changed = composer.changed(current);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(current.getSafeDrawing());
                    composer.updateRememberedValue(rememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @m80.k
    public static final Modifier safeGesturesPadding(@m80.k Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$debugInspectorInfo$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("safeGesturesPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$windowInsetsPadding$1
            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 6);
                boolean changed = composer.changed(current);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(current.getSafeGestures());
                    composer.updateRememberedValue(rememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @m80.k
    public static final Modifier statusBarsPadding(@m80.k Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("statusBarsPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1
            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 6);
                boolean changed = composer.changed(current);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(current.getStatusBars());
                    composer.updateRememberedValue(rememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @m80.k
    public static final Modifier systemBarsPadding(@m80.k Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$debugInspectorInfo$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("systemBarsPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$windowInsetsPadding$1
            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 6);
                boolean changed = composer.changed(current);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(current.getSystemBars());
                    composer.updateRememberedValue(rememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @m80.k
    public static final Modifier systemGesturesPadding(@m80.k Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$debugInspectorInfo$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("systemGesturesPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$windowInsetsPadding$1
            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 6);
                boolean changed = composer.changed(current);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(current.getSystemGestures());
                    composer.updateRememberedValue(rememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @m80.k
    public static final Modifier waterfallPadding(@m80.k Modifier modifier) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$waterfallPadding$$inlined$debugInspectorInfo$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("waterfallPadding");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$waterfallPadding$$inlined$windowInsetsPadding$1
            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 6);
                boolean changed = composer.changed(current);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(current.getWaterfall());
                    composer.updateRememberedValue(rememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }

    @Stable
    private static final Modifier windowInsetsPadding(Modifier modifier, l<? super InspectorInfo, g2> lVar, final l<? super WindowInsetsHolder, ? extends WindowInsets> lVar2) {
        return ComposedModifierKt.composed(modifier, lVar, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPadding_androidKt$windowInsetsPadding$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(359872873);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(359872873, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:240)");
                }
                WindowInsetsHolder current = WindowInsetsHolder.Companion.current(composer, 6);
                boolean changed = composer.changed(current);
                l<WindowInsetsHolder, WindowInsets> lVar3 = lVar2;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(lVar3.invoke(current));
                    composer.updateRememberedValue(rememberedValue);
                }
                InsetsPaddingModifier insetsPaddingModifier = (InsetsPaddingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return insetsPaddingModifier;
            }
        });
    }
}
