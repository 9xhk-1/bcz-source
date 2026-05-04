package androidx.compose.ui.platform;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class CompositionLocalsKt {

    @m80.k
    private static final ProvidableCompositionLocal<AccessibilityManager> LocalAccessibilityManager = CompositionLocalKt.staticCompositionLocalOf(new x00.a<AccessibilityManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAccessibilityManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final AccessibilityManager invoke() {
            return null;
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<Autofill> LocalAutofill = CompositionLocalKt.staticCompositionLocalOf(new x00.a<Autofill>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofill$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Autofill invoke() {
            return null;
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<AutofillTree> LocalAutofillTree = CompositionLocalKt.staticCompositionLocalOf(new x00.a<AutofillTree>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillTree$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final AutofillTree invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalAutofillTree");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<AutofillManager> LocalAutofillManager = CompositionLocalKt.staticCompositionLocalOf(new x00.a<AutofillManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalAutofillManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final AutofillManager invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalAutofillManager");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<ClipboardManager> LocalClipboardManager = CompositionLocalKt.staticCompositionLocalOf(new x00.a<ClipboardManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboardManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final ClipboardManager invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalClipboardManager");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<Clipboard> LocalClipboard = CompositionLocalKt.staticCompositionLocalOf(new x00.a<Clipboard>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalClipboard$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Clipboard invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalClipboard");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<GraphicsContext> LocalGraphicsContext = CompositionLocalKt.staticCompositionLocalOf(new x00.a<GraphicsContext>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalGraphicsContext$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final GraphicsContext invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalGraphicsContext");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<Density> LocalDensity = CompositionLocalKt.staticCompositionLocalOf(new x00.a<Density>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalDensity$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Density invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalDensity");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<FocusManager> LocalFocusManager = CompositionLocalKt.staticCompositionLocalOf(new x00.a<FocusManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFocusManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final FocusManager invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalFocusManager");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<Font.ResourceLoader> LocalFontLoader = CompositionLocalKt.staticCompositionLocalOf(new x00.a<Font.ResourceLoader>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontLoader$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Font.ResourceLoader invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalFontLoader");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<FontFamily.Resolver> LocalFontFamilyResolver = CompositionLocalKt.staticCompositionLocalOf(new x00.a<FontFamily.Resolver>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalFontFamilyResolver$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final FontFamily.Resolver invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalFontFamilyResolver");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<HapticFeedback> LocalHapticFeedback = CompositionLocalKt.staticCompositionLocalOf(new x00.a<HapticFeedback>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalHapticFeedback$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final HapticFeedback invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalHapticFeedback");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<InputModeManager> LocalInputModeManager = CompositionLocalKt.staticCompositionLocalOf(new x00.a<InputModeManager>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalInputModeManager$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final InputModeManager invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalInputManager");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<LayoutDirection> LocalLayoutDirection = CompositionLocalKt.staticCompositionLocalOf(new x00.a<LayoutDirection>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalLayoutDirection$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final LayoutDirection invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalLayoutDirection");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<TextInputService> LocalTextInputService = CompositionLocalKt.staticCompositionLocalOf(new x00.a<TextInputService>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextInputService$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final TextInputService invoke() {
            return null;
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<SoftwareKeyboardController> LocalSoftwareKeyboardController = CompositionLocalKt.staticCompositionLocalOf(new x00.a<SoftwareKeyboardController>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalSoftwareKeyboardController$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final SoftwareKeyboardController invoke() {
            return null;
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<TextToolbar> LocalTextToolbar = CompositionLocalKt.staticCompositionLocalOf(new x00.a<TextToolbar>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalTextToolbar$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final TextToolbar invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalTextToolbar");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<UriHandler> LocalUriHandler = CompositionLocalKt.staticCompositionLocalOf(new x00.a<UriHandler>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalUriHandler$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final UriHandler invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalUriHandler");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<ViewConfiguration> LocalViewConfiguration = CompositionLocalKt.staticCompositionLocalOf(new x00.a<ViewConfiguration>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalViewConfiguration$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final ViewConfiguration invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalViewConfiguration");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<WindowInfo> LocalWindowInfo = CompositionLocalKt.staticCompositionLocalOf(new x00.a<WindowInfo>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalWindowInfo$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final WindowInfo invoke() {
            CompositionLocalsKt.noLocalProvidedFor("LocalWindowInfo");
            throw new KotlinNothingValueException();
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<PointerIconService> LocalPointerIconService = CompositionLocalKt.staticCompositionLocalOf(new x00.a<PointerIconService>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalPointerIconService$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final PointerIconService invoke() {
            return null;
        }
    });

    @m80.k
    private static final ProvidableCompositionLocal<Boolean> LocalProvidableScrollCaptureInProgress = CompositionLocalKt.compositionLocalOf$default(null, new x00.a<Boolean>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalProvidableScrollCaptureInProgress$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }, 1, null);

    @m80.k
    private static final ProvidableCompositionLocal<Boolean> LocalCursorBlinkEnabled = CompositionLocalKt.staticCompositionLocalOf(new x00.a<Boolean>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$LocalCursorBlinkEnabled$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    });

    @Composable
    @ExperimentalComposeUiApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideCommonCompositionLocals(@m80.k final Owner owner, @m80.k final UriHandler uriHandler, @m80.k final x00.p<? super Composer, ? super Integer, g2> pVar, @m80.l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(874662829);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? startRestartGroup.changed(owner) : startRestartGroup.changedInstance(owner) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? startRestartGroup.changed(uriHandler) : startRestartGroup.changedInstance(uriHandler) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(874662829, i12, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:214)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalAccessibilityManager.provides(owner.getAccessibilityManager()), LocalAutofill.provides(owner.getAutofill()), LocalAutofillManager.provides(owner.getAutofillManager()), LocalAutofillTree.provides(owner.getAutofillTree()), LocalClipboardManager.provides(owner.getClipboardManager()), LocalClipboard.provides(owner.getClipboard()), LocalDensity.provides(owner.getDensity()), LocalFocusManager.provides(owner.getFocusOwner()), LocalFontLoader.providesDefault(owner.getFontLoader()), LocalFontFamilyResolver.providesDefault(owner.getFontFamilyResolver()), LocalHapticFeedback.provides(owner.getHapticFeedBack()), LocalInputModeManager.provides(owner.getInputModeManager()), LocalLayoutDirection.provides(owner.getLayoutDirection()), LocalTextInputService.provides(owner.getTextInputService()), LocalSoftwareKeyboardController.provides(owner.getSoftwareKeyboardController()), LocalTextToolbar.provides(owner.getTextToolbar()), LocalUriHandler.provides(uriHandler), LocalViewConfiguration.provides(owner.getViewConfiguration()), LocalWindowInfo.provides(owner.getWindowInfo()), LocalPointerIconService.provides(owner.getPointerIconService()), LocalGraphicsContext.provides(owner.getGraphicsContext())}, pVar, startRestartGroup, ((i12 >> 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p<Composer, Integer, g2>() { // from class: androidx.compose.ui.platform.CompositionLocalsKt$ProvideCommonCompositionLocals$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i13) {
                    CompositionLocalsKt.ProvideCommonCompositionLocals(Owner.this, uriHandler, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @m80.k
    public static final ProvidableCompositionLocal<AccessibilityManager> getLocalAccessibilityManager() {
        return LocalAccessibilityManager;
    }

    @m80.k
    public static final ProvidableCompositionLocal<Autofill> getLocalAutofill() {
        return LocalAutofill;
    }

    @m80.k
    public static final ProvidableCompositionLocal<AutofillManager> getLocalAutofillManager() {
        return LocalAutofillManager;
    }

    @m80.k
    public static final ProvidableCompositionLocal<AutofillTree> getLocalAutofillTree() {
        return LocalAutofillTree;
    }

    @m80.k
    public static final ProvidableCompositionLocal<Clipboard> getLocalClipboard() {
        return LocalClipboard;
    }

    @m80.k
    public static final ProvidableCompositionLocal<ClipboardManager> getLocalClipboardManager() {
        return LocalClipboardManager;
    }

    @m80.k
    public static final ProvidableCompositionLocal<Boolean> getLocalCursorBlinkEnabled() {
        return LocalCursorBlinkEnabled;
    }

    @m80.k
    public static final ProvidableCompositionLocal<Density> getLocalDensity() {
        return LocalDensity;
    }

    @m80.k
    public static final ProvidableCompositionLocal<FocusManager> getLocalFocusManager() {
        return LocalFocusManager;
    }

    @m80.k
    public static final ProvidableCompositionLocal<FontFamily.Resolver> getLocalFontFamilyResolver() {
        return LocalFontFamilyResolver;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @m80.k
    public static final ProvidableCompositionLocal<Font.ResourceLoader> getLocalFontLoader() {
        return LocalFontLoader;
    }

    @m80.k
    public static final ProvidableCompositionLocal<GraphicsContext> getLocalGraphicsContext() {
        return LocalGraphicsContext;
    }

    @m80.k
    public static final ProvidableCompositionLocal<HapticFeedback> getLocalHapticFeedback() {
        return LocalHapticFeedback;
    }

    @m80.k
    public static final ProvidableCompositionLocal<InputModeManager> getLocalInputModeManager() {
        return LocalInputModeManager;
    }

    @m80.k
    public static final ProvidableCompositionLocal<LayoutDirection> getLocalLayoutDirection() {
        return LocalLayoutDirection;
    }

    @m80.k
    public static final ProvidableCompositionLocal<PointerIconService> getLocalPointerIconService() {
        return LocalPointerIconService;
    }

    @m80.k
    public static final ProvidableCompositionLocal<Boolean> getLocalProvidableScrollCaptureInProgress() {
        return LocalProvidableScrollCaptureInProgress;
    }

    @m80.k
    public static final CompositionLocal<Boolean> getLocalScrollCaptureInProgress() {
        return LocalProvidableScrollCaptureInProgress;
    }

    @m80.k
    public static final ProvidableCompositionLocal<SoftwareKeyboardController> getLocalSoftwareKeyboardController() {
        return LocalSoftwareKeyboardController;
    }

    @m80.k
    public static final ProvidableCompositionLocal<TextInputService> getLocalTextInputService() {
        return LocalTextInputService;
    }

    @m80.k
    public static final ProvidableCompositionLocal<TextToolbar> getLocalTextToolbar() {
        return LocalTextToolbar;
    }

    @m80.k
    public static final ProvidableCompositionLocal<UriHandler> getLocalUriHandler() {
        return LocalUriHandler;
    }

    @m80.k
    public static final ProvidableCompositionLocal<ViewConfiguration> getLocalViewConfiguration() {
        return LocalViewConfiguration;
    }

    @m80.k
    public static final ProvidableCompositionLocal<WindowInfo> getLocalWindowInfo() {
        return LocalWindowInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void noLocalProvidedFor(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @yz.n(message = "\n        Use the new semantics-based Autofill APIs androidx.compose.ui.autofill.ContentType and\n        androidx.compose.ui.autofill.ContentDataType instead.\n        ")
    public static /* synthetic */ void getLocalAutofill$annotations() {
    }

    @yz.n(message = "\n        Use the new semantics-based Autofill APIs androidx.compose.ui.autofill.ContentType and\n        androidx.compose.ui.autofill.ContentDataType instead.\n        ")
    public static /* synthetic */ void getLocalAutofillTree$annotations() {
    }

    @yz.n(message = "Use LocalClipboard instead which supports suspend functions", replaceWith = @yz.w0(expression = "LocalClipboard", imports = {"androidx.compose.ui.platform.LocalClipboard"}))
    public static /* synthetic */ void getLocalClipboardManager$annotations() {
    }

    @yz.n(message = "LocalFontLoader is replaced with LocalFontFamilyResolver", replaceWith = @yz.w0(expression = "LocalFontFamilyResolver", imports = {}))
    public static /* synthetic */ void getLocalFontLoader$annotations() {
    }

    @yz.n(message = "Use PlatformTextInputModifierNode instead.")
    public static /* synthetic */ void getLocalTextInputService$annotations() {
    }
}
