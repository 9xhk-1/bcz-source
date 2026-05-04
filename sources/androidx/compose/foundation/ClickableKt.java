package androidx.compose.foundation;

import a90.c3;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.ScrollableContainerNode;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nClickable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1327:1\n457#1,17:1329\n457#1,17:1348\n457#1,17:1365\n110#2:1328\n110#2:1346\n110#2:1347\n*S KotlinDebug\n*F\n+ 1 Clickable.kt\nandroidx/compose/foundation/ClickableKt\n*L\n191#1:1329,17\n399#1:1348,17\n429#1:1365,17\n113#1:1328\n253#1:1346\n302#1:1347\n*E\n"})
/* loaded from: classes.dex */
public final class ClickableKt {
    @m80.k
    /* renamed from: clickable-O2vRcR0, reason: not valid java name */
    public static final Modifier m266clickableO2vRcR0(@m80.k Modifier modifier, @l MutableInteractionSource mutableInteractionSource, @l final Indication indication, final boolean z11, @l final String str, @l final Role role, @m80.k final x00.a<g2> aVar) {
        Modifier composed$default;
        if (indication instanceof IndicationNodeFactory) {
            composed$default = new ClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, z11, str, role, aVar, null);
        } else if (indication == null) {
            composed$default = new ClickableElement(mutableInteractionSource, null, z11, str, role, aVar, null);
        } else if (mutableInteractionSource != null) {
            composed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new ClickableElement(mutableInteractionSource, null, z11, str, role, aVar, null));
        } else {
            composed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
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
                    Modifier then = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, Indication.this).then(new ClickableElement(mutableInteractionSource2, null, z11, str, role, aVar, null));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return then;
                }
            }, 1, null);
        }
        return modifier.then(composed$default);
    }

    /* renamed from: clickable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m267clickableO2vRcR0$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z11, String str, Role role, x00.a aVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return m266clickableO2vRcR0(modifier, mutableInteractionSource, indication, z11, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : role, aVar);
    }

    @m80.k
    /* renamed from: clickable-XHw0xAI, reason: not valid java name */
    public static final Modifier m268clickableXHw0xAI(@m80.k Modifier modifier, final boolean z11, @l final String str, @l final Role role, @m80.k final x00.a<g2> aVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.ClickableKt$clickable-XHw0xAI$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("clickable");
                inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", aVar);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickable$2
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
                composer.startReplaceGroup(-756081143);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-756081143, i11, -1, "androidx.compose.foundation.clickable.<anonymous> (Clickable.kt:120)");
                }
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(617653824);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(617786442);
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(rememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                    composer.endReplaceGroup();
                }
                Modifier m266clickableO2vRcR0 = ClickableKt.m266clickableO2vRcR0(Modifier.Companion, mutableInteractionSource, indication, z11, str, role, aVar);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return m266clickableO2vRcR0;
            }
        });
    }

    /* renamed from: clickable-XHw0xAI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m269clickableXHw0xAI$default(Modifier modifier, boolean z11, String str, Role role, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            role = null;
        }
        return m268clickableXHw0xAI(modifier, z11, str, role, aVar);
    }

    @m80.k
    public static final Modifier clickableWithIndicationIfNeeded(@m80.k Modifier modifier, @l MutableInteractionSource mutableInteractionSource, @l final Indication indication, @m80.k final p<? super MutableInteractionSource, ? super IndicationNodeFactory, ? extends Modifier> pVar) {
        return modifier.then(indication instanceof IndicationNodeFactory ? pVar.invoke(mutableInteractionSource, indication) : indication == null ? pVar.invoke(mutableInteractionSource, null) : mutableInteractionSource != null ? IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(pVar.invoke(mutableInteractionSource, null)) : ComposedModifierKt.composed$default(Modifier.Companion, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$clickableWithIndicationIfNeeded$1
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
                Modifier then = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, Indication.this).then(pVar.invoke(mutableInteractionSource2, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return then;
            }
        }, 1, null));
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: combinedClickable-XVZzFYc, reason: not valid java name */
    public static final /* synthetic */ Modifier m270combinedClickableXVZzFYc(Modifier modifier, MutableInteractionSource mutableInteractionSource, final Indication indication, final boolean z11, final String str, final Role role, final String str2, final x00.a aVar, final x00.a aVar2, final x00.a aVar3) {
        Modifier composed$default;
        if (indication instanceof IndicationNodeFactory) {
            composed$default = new CombinedClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, z11, str, role, aVar3, str2, aVar, aVar2, true, null);
        } else if (indication == null) {
            composed$default = new CombinedClickableElement(mutableInteractionSource, null, z11, str, role, aVar3, str2, aVar, aVar2, true, null);
        } else if (mutableInteractionSource != null) {
            composed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new CombinedClickableElement(mutableInteractionSource, null, z11, str, role, aVar3, str2, aVar, aVar2, true, null));
        } else {
            composed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-XVZzFYc$$inlined$clickableWithIndicationIfNeeded$1
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
                    Modifier then = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, Indication.this).then(new CombinedClickableElement(mutableInteractionSource2, null, z11, str, role, aVar3, str2, aVar, aVar2, true, null));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return then;
                }
            }, 1, null);
        }
        return modifier.then(composed$default);
    }

    /* renamed from: combinedClickable-XVZzFYc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m271combinedClickableXVZzFYc$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z11, String str, Role role, String str2, x00.a aVar, x00.a aVar2, x00.a aVar3, int i11, Object obj) {
        x00.a aVar4;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        x00.a aVar5;
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        String str3 = (i11 & 8) != 0 ? null : str;
        Role role2 = (i11 & 16) != 0 ? null : role;
        String str4 = (i11 & 32) != 0 ? null : str2;
        x00.a aVar6 = (i11 & 64) != 0 ? null : aVar;
        if ((i11 & 128) != 0) {
            aVar4 = null;
            modifier2 = modifier;
            indication2 = indication;
            aVar5 = aVar3;
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            aVar4 = aVar2;
            modifier2 = modifier;
            mutableInteractionSource2 = mutableInteractionSource;
            indication2 = indication;
            aVar5 = aVar3;
        }
        return m270combinedClickableXVZzFYc(modifier2, mutableInteractionSource2, indication2, z12, str3, role2, str4, aVar6, aVar4, aVar5);
    }

    @m80.k
    /* renamed from: combinedClickable-auXiCPI, reason: not valid java name */
    public static final Modifier m272combinedClickableauXiCPI(@m80.k Modifier modifier, @l MutableInteractionSource mutableInteractionSource, @l final Indication indication, final boolean z11, @l final String str, @l final Role role, @l final String str2, @l final x00.a<g2> aVar, @l final x00.a<g2> aVar2, final boolean z12, @m80.k final x00.a<g2> aVar3) {
        Modifier composed$default;
        if (indication instanceof IndicationNodeFactory) {
            composed$default = new CombinedClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, z11, str, role, aVar3, str2, aVar, aVar2, z12, null);
        } else if (indication == null) {
            composed$default = new CombinedClickableElement(mutableInteractionSource, null, z11, str, role, aVar3, str2, aVar, aVar2, z12, null);
        } else if (mutableInteractionSource != null) {
            composed$default = IndicationKt.indication(Modifier.Companion, mutableInteractionSource, indication).then(new CombinedClickableElement(mutableInteractionSource, null, z11, str, role, aVar3, str2, aVar, aVar2, z12, null));
        } else {
            composed$default = ComposedModifierKt.composed$default(Modifier.Companion, null, new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-auXiCPI$$inlined$clickableWithIndicationIfNeeded$1
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
                    Modifier then = IndicationKt.indication(Modifier.Companion, mutableInteractionSource2, Indication.this).then(new CombinedClickableElement(mutableInteractionSource2, null, z11, str, role, aVar3, str2, aVar, aVar2, z12, null));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return then;
                }
            }, 1, null);
        }
        return modifier.then(composed$default);
    }

    /* renamed from: combinedClickable-auXiCPI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m273combinedClickableauXiCPI$default(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z11, String str, Role role, String str2, x00.a aVar, x00.a aVar2, boolean z12, x00.a aVar3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            role = null;
        }
        if ((i11 & 32) != 0) {
            str2 = null;
        }
        if ((i11 & 64) != 0) {
            aVar = null;
        }
        if ((i11 & 128) != 0) {
            aVar2 = null;
        }
        if ((i11 & 256) != 0) {
            z12 = true;
        }
        return m272combinedClickableauXiCPI(modifier, mutableInteractionSource, indication, z11, str, role, str2, aVar, aVar2, z12, aVar3);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: combinedClickable-cJG_KMw, reason: not valid java name */
    public static final /* synthetic */ Modifier m274combinedClickablecJG_KMw(Modifier modifier, final boolean z11, final String str, final Role role, final String str2, final x00.a aVar, final x00.a aVar2, final x00.a aVar3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-cJG_KMw$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("combinedClickable");
                inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", aVar3);
                inspectorInfo.getProperties().set("onDoubleClick", aVar2);
                inspectorInfo.getProperties().set("onLongClick", aVar);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$4
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
                composer.startReplaceGroup(1969174843);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1969174843, i11, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:312)");
                }
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(-1724200443);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(-1724067825);
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(rememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                    composer.endReplaceGroup();
                }
                Modifier m272combinedClickableauXiCPI = ClickableKt.m272combinedClickableauXiCPI(Modifier.Companion, mutableInteractionSource, indication, z11, str, role, str2, aVar, aVar2, true, aVar3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return m272combinedClickableauXiCPI;
            }
        });
    }

    /* renamed from: combinedClickable-cJG_KMw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m275combinedClickablecJG_KMw$default(Modifier modifier, boolean z11, String str, Role role, String str2, x00.a aVar, x00.a aVar2, x00.a aVar3, int i11, Object obj) {
        x00.a aVar4;
        x00.a aVar5;
        String str3;
        x00.a aVar6;
        String str4;
        Role role2;
        Modifier modifier2;
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            role = null;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        if ((i11 & 16) != 0) {
            aVar = null;
        }
        if ((i11 & 32) != 0) {
            aVar4 = null;
            str3 = str2;
            aVar5 = aVar3;
            str4 = str;
            aVar6 = aVar;
            modifier2 = modifier;
            role2 = role;
        } else {
            aVar4 = aVar2;
            aVar5 = aVar3;
            str3 = str2;
            aVar6 = aVar;
            str4 = str;
            role2 = role;
            modifier2 = modifier;
        }
        return m274combinedClickablecJG_KMw(modifier2, z11, str4, role2, str3, aVar6, aVar4, aVar5);
    }

    @m80.k
    /* renamed from: combinedClickable-f5TDLPQ, reason: not valid java name */
    public static final Modifier m276combinedClickablef5TDLPQ(@m80.k Modifier modifier, final boolean z11, @l final String str, @l final Role role, @l final String str2, @l final x00.a<g2> aVar, @l final x00.a<g2> aVar2, final boolean z12, @m80.k final x00.a<g2> aVar3) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, g2>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-f5TDLPQ$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("combinedClickable");
                inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("onClickLabel", str);
                inspectorInfo.getProperties().set("role", role);
                inspectorInfo.getProperties().set("onClick", aVar3);
                inspectorInfo.getProperties().set("onDoubleClick", aVar2);
                inspectorInfo.getProperties().set("onLongClick", aVar);
                inspectorInfo.getProperties().set("onLongClickLabel", str2);
                inspectorInfo.getProperties().set("hapticFeedbackEnabled", Boolean.valueOf(z12));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable$2
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
                composer.startReplaceGroup(-1534186401);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1534186401, i11, -1, "androidx.compose.foundation.combinedClickable.<anonymous> (Clickable.kt:264)");
                }
                Indication indication = (Indication) composer.consume(IndicationKt.getLocalIndication());
                if (indication instanceof IndicationNodeFactory) {
                    composer.startReplaceGroup(-1726068379);
                    composer.endReplaceGroup();
                    mutableInteractionSource = null;
                } else {
                    composer.startReplaceGroup(-1725935761);
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composer.updateRememberedValue(rememberedValue);
                    }
                    mutableInteractionSource = (MutableInteractionSource) rememberedValue;
                    composer.endReplaceGroup();
                }
                Modifier m272combinedClickableauXiCPI = ClickableKt.m272combinedClickableauXiCPI(Modifier.Companion, mutableInteractionSource, indication, z11, str, role, str2, aVar, aVar2, z12, aVar3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return m272combinedClickableauXiCPI;
            }
        });
    }

    /* renamed from: combinedClickable-f5TDLPQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m277combinedClickablef5TDLPQ$default(Modifier modifier, boolean z11, String str, Role role, String str2, x00.a aVar, x00.a aVar2, boolean z12, x00.a aVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            role = null;
        }
        if ((i11 & 8) != 0) {
            str2 = null;
        }
        if ((i11 & 16) != 0) {
            aVar = null;
        }
        if ((i11 & 32) != 0) {
            aVar2 = null;
        }
        if ((i11 & 64) != 0) {
            z12 = true;
        }
        return m276combinedClickablef5TDLPQ(modifier, z11, str, role, str2, aVar, aVar2, z12, aVar3);
    }

    public static final boolean hasScrollableContainer(@m80.k TraversableNode traversableNode) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        TraversableNodeKt.traverseAncestors(traversableNode, ScrollableContainerNode.TraverseKey, new x00.l<TraversableNode, Boolean>() { // from class: androidx.compose.foundation.ClickableKt$hasScrollableContainer$1
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(TraversableNode traversableNode2) {
                boolean z11;
                Ref.BooleanRef booleanRef2 = Ref.BooleanRef.this;
                if (!booleanRef2.element) {
                    g0.n(traversableNode2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
                    if (!((ScrollableContainerNode) traversableNode2).getEnabled()) {
                        z11 = false;
                        booleanRef2.element = z11;
                        return Boolean.valueOf(!Ref.BooleanRef.this.element);
                    }
                }
                z11 = true;
                booleanRef2.element = z11;
                return Boolean.valueOf(!Ref.BooleanRef.this.element);
            }
        });
        return booleanRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m278isClickZmokQxo(KeyEvent keyEvent) {
        return KeyEventType.m3581equalsimpl0(KeyEvent_androidKt.m3589getTypeZmokQxo(keyEvent), KeyEventType.Companion.m3586getKeyUpCS__XNY()) && m279isEnterZmokQxo(keyEvent);
    }

    /* renamed from: isEnter-ZmokQxo, reason: not valid java name */
    private static final boolean m279isEnterZmokQxo(KeyEvent keyEvent) {
        long m3588getKeyZmokQxo = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3352getDirectionCenterEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3366getEnterEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3458getNumPadEnterEK5gGoQ())) {
            return true;
        }
        return Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion.m3504getSpacebarEK5gGoQ());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPress-ZmokQxo, reason: not valid java name */
    public static final boolean m280isPressZmokQxo(KeyEvent keyEvent) {
        return KeyEventType.m3581equalsimpl0(KeyEvent_androidKt.m3589getTypeZmokQxo(keyEvent), KeyEventType.Companion.m3585getKeyDownCS__XNY()) && m279isEnterZmokQxo(keyEvent);
    }
}
