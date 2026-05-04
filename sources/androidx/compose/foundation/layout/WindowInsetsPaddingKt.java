package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalKt;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWindowInsetsPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,623:1\n110#2:624\n110#2:625\n110#2:626\n110#2:627\n*S KotlinDebug\n*F\n+ 1 WindowInsetsPadding.kt\nandroidx/compose/foundation/layout/WindowInsetsPaddingKt\n*L\n75#1:624\n96#1:625\n120#1:626\n137#1:627\n*E\n"})
/* loaded from: classes.dex */
public final class WindowInsetsPaddingKt {

    @m80.k
    private static final ProvidableModifierLocal<WindowInsets> ModifierLocalConsumedWindowInsets = ModifierLocalKt.modifierLocalOf(new x00.a<WindowInsets>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$ModifierLocalConsumedWindowInsets$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final WindowInsets invoke() {
            return WindowInsetsKt.WindowInsets(0, 0, 0, 0);
        }
    });

    @Stable
    @m80.k
    public static final Modifier consumeWindowInsets(@m80.k Modifier modifier, @m80.k final WindowInsets windowInsets) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("consumeWindowInsets");
                inspectorInfo.getProperties().set("insets", WindowInsets.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumeWindowInsets$2
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(788931215);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(788931215, i11, -1, "androidx.compose.foundation.layout.consumeWindowInsets.<anonymous> (WindowInsetsPadding.kt:100)");
                }
                boolean changed = composer.changed(WindowInsets.this);
                WindowInsets windowInsets2 = WindowInsets.this;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new UnionInsetsConsumingModifier(windowInsets2);
                    composer.updateRememberedValue(rememberedValue);
                }
                UnionInsetsConsumingModifier unionInsetsConsumingModifier = (UnionInsetsConsumingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return unionInsetsConsumingModifier;
            }
        });
    }

    @m80.k
    public static final ProvidableModifierLocal<WindowInsets> getModifierLocalConsumedWindowInsets() {
        return ModifierLocalConsumedWindowInsets;
    }

    @Stable
    @m80.k
    public static final Modifier onConsumedWindowInsetsChanged(@m80.k Modifier modifier, @m80.k final l<? super WindowInsets, g2> lVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("onConsumedWindowInsetsChanged");
                inspectorInfo.getProperties().set("block", l.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$onConsumedWindowInsetsChanged$2
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
                composer.startReplaceGroup(-1608161351);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1608161351, i11, -1, "androidx.compose.foundation.layout.onConsumedWindowInsetsChanged.<anonymous> (WindowInsetsPadding.kt:141)");
                }
                boolean changed = composer.changed(lVar);
                l<WindowInsets, g2> lVar2 = lVar;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new ConsumedInsetsModifier(lVar2);
                    composer.updateRememberedValue(rememberedValue);
                }
                ConsumedInsetsModifier consumedInsetsModifier = (ConsumedInsetsModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return consumedInsetsModifier;
            }
        });
    }

    @m80.k
    public static final Modifier recalculateWindowInsets(@m80.k Modifier modifier) {
        return modifier.then(RecalculateWindowInsetsModifierElement.INSTANCE);
    }

    @Stable
    @m80.k
    public static final Modifier windowInsetsPadding(@m80.k Modifier modifier, @m80.k final WindowInsets windowInsets) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$windowInsetsPadding$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("windowInsetsPadding");
                inspectorInfo.getProperties().set("insets", WindowInsets.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$windowInsetsPadding$2
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(-1415685722);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1415685722, i11, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.kt:79)");
                }
                boolean changed = composer.changed(WindowInsets.this);
                WindowInsets windowInsets2 = WindowInsets.this;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new InsetsPaddingModifier(windowInsets2);
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
    @m80.k
    public static final Modifier consumeWindowInsets(@m80.k Modifier modifier, @m80.k final PaddingValues paddingValues) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumeWindowInsets$$inlined$debugInspectorInfo$2
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("consumeWindowInsets");
                inspectorInfo.getProperties().set("paddingValues", PaddingValues.this);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.layout.WindowInsetsPaddingKt$consumeWindowInsets$4
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(114694318);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(114694318, i11, -1, "androidx.compose.foundation.layout.consumeWindowInsets.<anonymous> (WindowInsetsPadding.kt:124)");
                }
                boolean changed = composer.changed(PaddingValues.this);
                PaddingValues paddingValues2 = PaddingValues.this;
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new PaddingValuesConsumingModifier(paddingValues2);
                    composer.updateRememberedValue(rememberedValue);
                }
                PaddingValuesConsumingModifier paddingValuesConsumingModifier = (PaddingValuesConsumingModifier) rememberedValue;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return paddingValuesConsumingModifier;
            }
        });
    }
}
