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
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSelectable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n1#1,265:1\n110#2:266\n457#3,17:267\n*S KotlinDebug\n*F\n+ 1 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n69#1:266\n142#1:267,17\n*E\n"})
/* loaded from: classes.dex */
public final class SelectableKt {
    @k
    /* renamed from: selectable-O2vRcR0, reason: not valid java name */
    public static final Modifier m987selectableO2vRcR0(@k Modifier modifier, final boolean z11, @l MutableInteractionSource mutableInteractionSource, @l final Indication indication, final boolean z12, @l final Role role, @k final a<g2> aVar) {
        return modifier.then(indication instanceof IndicationNodeFactory ? new SelectableElement(z11, mutableInteractionSource, (IndicationNodeFactory) indication, z12, role, aVar, null) : indication == null ? new SelectableElement(z11, mutableInteractionSource, null, z12, role, aVar, null) : mutableInteractionSource != null ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new SelectableElement(z11, mutableInteractionSource, null, z12, role, aVar, null)) : ComposedModifierKt.composed$default(Modifier.Companion, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
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
                Modifier then = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, Indication.this).then(new SelectableElement(z11, mutableInteractionSource2, null, z12, role, aVar, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return then;
            }
        }, 1, null));
    }

    /* renamed from: selectable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m988selectableO2vRcR0$default(Modifier modifier, boolean z11, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z12, Role role, a aVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        boolean z13 = z12;
        if ((i11 & 16) != 0) {
            role = null;
        }
        return m987selectableO2vRcR0(modifier, z11, mutableInteractionSource, indication, z13, role, aVar);
    }

    @k
    /* renamed from: selectable-XHw0xAI, reason: not valid java name */
    public static final Modifier m989selectableXHw0xAI(@k Modifier modifier, final boolean z11, final boolean z12, @l final Role role, @k final a<g2> aVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-XHw0xAI$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("selectable");
                inspectorInfo.getProperties().set("selected", Boolean.valueOf(z11));
                inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(z12));
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", aVar);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable$2
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
                composer.startReplaceGroup(-2124609672);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2124609672, i11, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:76)");
                }
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(-1412174474);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(-1412041856);
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(rememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                    composer.endReplaceGroup();
                }
                Modifier m987selectableO2vRcR0 = SelectableKt.m987selectableO2vRcR0(Modifier.Companion, z11, mutableInteractionSource, indication, z12, role, aVar);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return m987selectableO2vRcR0;
            }
        });
    }

    /* renamed from: selectable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m990selectableXHw0xAI$default(Modifier modifier, boolean z11, boolean z12, Role role, a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = true;
        }
        if ((i11 & 4) != 0) {
            role = null;
        }
        return m989selectableXHw0xAI(modifier, z11, z12, role, aVar);
    }
}
