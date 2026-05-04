package androidx.compose.foundation.selection;

import a90.c3;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nToggleable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,498:1\n110#2:499\n110#2:517\n457#3,17:500\n457#3,17:518\n*S KotlinDebug\n*F\n+ 1 Toggleable.kt\nandroidx/compose/foundation/selection/ToggleableKt\n*L\n67#1:499\n301#1:517\n136#1:500,17\n374#1:518,17\n*E\n"})
/* loaded from: classes.dex */
public final class ToggleableKt {
    @k
    /* renamed from: toggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m992toggleableO2vRcR0(@k Modifier modifier, final boolean z11, @l MutableInteractionSource mutableInteractionSource, @l final Indication indication, final boolean z12, @l final Role role, @k final x00.l<? super Boolean, g2> lVar) {
        return modifier.then(indication instanceof IndicationNodeFactory ? new ToggleableElement(z11, mutableInteractionSource, (IndicationNodeFactory) indication, z12, role, lVar, null) : indication == null ? new ToggleableElement(z11, mutableInteractionSource, null, z12, role, lVar, null) : mutableInteractionSource != null ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new ToggleableElement(z11, mutableInteractionSource, null, z12, role, lVar, null)) : ComposedModifierKt.composed$default(Modifier.Companion, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(-1525724089);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1525724089, i11, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:473)");
                }
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(rememberedValue);
                }
                MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                Modifier then = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, Indication.this).then(new ToggleableElement(z11, mutableInteractionSource2, null, z12, role, lVar, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return then;
            }
        }, 1, null));
    }

    /* renamed from: toggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m993toggleableO2vRcR0$default(Modifier modifier, boolean z11, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z12, Role role, x00.l lVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        boolean z13 = z12;
        if ((i11 & 16) != 0) {
            role = null;
        }
        return m992toggleableO2vRcR0(modifier, z11, mutableInteractionSource, indication, z13, role, lVar);
    }

    @k
    /* renamed from: toggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m994toggleableXHw0xAI(@k Modifier modifier, final boolean z11, final boolean z12, @l final Role role, @k final x00.l<? super Boolean, g2> lVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                inspectorInfo.setName("toggleable");
                inspectorInfo.getProperties().set("value", Boolean.valueOf(z11));
                inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(z12));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onValueChange", lVar);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$2
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
                MutableInteractionSource mutableInteractionSource;
                composer.startReplaceGroup(290332169);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(290332169, i11, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:74)");
                }
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(-2130062114);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(-2129929496);
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(rememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                    composer.endReplaceGroup();
                }
                Modifier m992toggleableO2vRcR0 = ToggleableKt.m992toggleableO2vRcR0(Modifier.Companion, z11, mutableInteractionSource, indication, z12, role, lVar);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return m992toggleableO2vRcR0;
            }
        });
    }

    /* renamed from: toggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m995toggleableXHw0xAI$default(Modifier modifier, boolean z11, boolean z12, Role role, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            role = null;
        }
        return m994toggleableXHw0xAI(modifier, z11, z12, role, lVar);
    }

    @k
    /* renamed from: triStateToggleable-O2vRcR0, reason: not valid java name */
    public static final Modifier m996triStateToggleableO2vRcR0(@k Modifier modifier, @k final ToggleableState toggleableState, @l MutableInteractionSource mutableInteractionSource, @l final Indication indication, final boolean z11, @l final Role role, @k final a<g2> aVar) {
        return modifier.then(indication instanceof IndicationNodeFactory ? new TriStateToggleableElement(toggleableState, mutableInteractionSource, (IndicationNodeFactory) indication, z11, role, aVar, null) : indication == null ? new TriStateToggleableElement(toggleableState, mutableInteractionSource, null, z11, role, aVar, null) : mutableInteractionSource != null ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new TriStateToggleableElement(toggleableState, mutableInteractionSource, null, z11, role, aVar, null)) : ComposedModifierKt.composed$default(Modifier.Companion, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(-1525724089);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1525724089, i11, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:473)");
                }
                Object rememberedValue = composer.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(rememberedValue);
                }
                MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                Modifier then = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, Indication.this).then(new TriStateToggleableElement(toggleableState, mutableInteractionSource2, null, z11, role, aVar, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return then;
            }
        }, 1, null));
    }

    /* renamed from: triStateToggleable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m997triStateToggleableO2vRcR0$default(Modifier modifier, ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z11, Role role, a aVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i11 & 16) != 0) {
            role = null;
        }
        return m996triStateToggleableO2vRcR0(modifier, toggleableState, mutableInteractionSource, indication, z12, role, aVar);
    }

    @k
    /* renamed from: triStateToggleable-XHw0xAI, reason: not valid java name */
    public static final Modifier m998triStateToggleableXHw0xAI(@k Modifier modifier, @k final ToggleableState toggleableState, final boolean z11, @l final Role role, @k final a<g2> aVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                inspectorInfo.setName("triStateToggleable");
                inspectorInfo.getProperties().set("state", ToggleableState.this);
                inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", aVar);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                MutableInteractionSource mutableInteractionSource;
                composer.startReplaceGroup(-1808118329);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1808118329, i11, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:308)");
                }
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(-1060119816);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(-1059987198);
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(rememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                    composer.endReplaceGroup();
                }
                Modifier m996triStateToggleableO2vRcR0 = ToggleableKt.m996triStateToggleableO2vRcR0(Modifier.Companion, ToggleableState.this, mutableInteractionSource, indication, z11, role, aVar);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return m996triStateToggleableO2vRcR0;
            }
        });
    }

    /* renamed from: triStateToggleable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m999triStateToggleableXHw0xAI$default(Modifier modifier, ToggleableState toggleableState, boolean z11, Role role, a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            role = null;
        }
        return m998triStateToggleableXHw0xAI(modifier, toggleableState, z11, role, aVar);
    }
}
