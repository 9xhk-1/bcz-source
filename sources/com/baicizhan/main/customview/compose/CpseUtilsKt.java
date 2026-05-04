package com.baicizhan.main.customview.compose;

import a90.c3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
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
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCpseUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CpseUtils.kt\ncom/baicizhan/main/customview/compose/CpseUtilsKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,79:1\n110#2:80\n1247#3,6:81\n*S KotlinDebug\n*F\n+ 1 CpseUtils.kt\ncom/baicizhan/main/customview/compose/CpseUtilsKt\n*L\n35#1:80\n49#1:81,6\n*E\n"})
/* loaded from: classes4.dex */
public final class CpseUtilsKt {
    @yz.n(message = "This is buggy... Use protectedClickable instead!")
    @m80.k
    public static final Modifier d(@m80.k Modifier onDebounceClick, @m80.k final MutableInteractionSource interactionSource, @m80.l final Indication indication, final boolean z11, @m80.l final String str, @m80.l final Role role, @m80.k final x00.a<g2> onClick) {
        g0.p(onDebounceClick, "$this$onDebounceClick");
        g0.p(interactionSource, "interactionSource");
        g0.p(onClick, "onClick");
        return ComposedModifierKt.composed(onDebounceClick, InspectableValueKt.isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, g2>() { // from class: com.baicizhan.main.customview.compose.CpseUtilsKt$onDebounceClick-O2vRcR0$$inlined$debugInspectorInfo$1
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
                inspectorInfo.getProperties().set("onClick", onClick);
                inspectorInfo.getProperties().set("indication", indication);
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new x00.q() { // from class: com.baicizhan.main.customview.compose.e0
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier f11;
                f11 = CpseUtilsKt.f(MutableInteractionSource.this, indication, z11, str, role, onClick, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return f11;
            }
        });
    }

    public static /* synthetic */ Modifier e(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z11, String str, Role role, x00.a aVar, int i11, Object obj) {
        Role role2;
        x00.a aVar2;
        boolean z12;
        String str2;
        MutableInteractionSource mutableInteractionSource2;
        if ((i11 & 1) != 0) {
            mutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
        }
        if ((i11 & 2) != 0) {
            indication = null;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            str = null;
        }
        if ((i11 & 16) != 0) {
            role2 = null;
            z12 = z11;
            aVar2 = aVar;
            mutableInteractionSource2 = mutableInteractionSource;
            str2 = str;
        } else {
            role2 = role;
            aVar2 = aVar;
            z12 = z11;
            str2 = str;
            mutableInteractionSource2 = mutableInteractionSource;
        }
        return d(modifier, mutableInteractionSource2, indication, z12, str2, role2, aVar2);
    }

    @Composable
    public static final Modifier f(MutableInteractionSource mutableInteractionSource, Indication indication, boolean z11, String str, Role role, final x00.a aVar, Modifier composed, Composer composer, int i11) {
        g0.p(composed, "$this$composed");
        composer.startReplaceGroup(916742705);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(916742705, i11, -1, "com.baicizhan.main.customview.compose.onDebounceClick.<anonymous> (CpseUtils.kt:45)");
        }
        Modifier.Companion companion = Modifier.Companion;
        boolean changed = composer.changed(aVar);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.a() { // from class: com.baicizhan.main.customview.compose.d0
                @Override // x00.a
                public final Object invoke() {
                    g2 g11;
                    g11 = CpseUtilsKt.g(x00.a.this);
                    return g11;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier m266clickableO2vRcR0 = ClickableKt.m266clickableO2vRcR0(companion, mutableInteractionSource, indication, z11, str, role, (x00.a) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m266clickableO2vRcR0;
    }

    public static final g2 g(final x00.a aVar) {
        q.f20303a.c(new x00.a() { // from class: com.baicizhan.main.customview.compose.f0
            @Override // x00.a
            public final Object invoke() {
                g2 h11;
                h11 = CpseUtilsKt.h(x00.a.this);
                return h11;
            }
        });
        return g2.f100423a;
    }

    public static final g2 h(x00.a aVar) {
        aVar.invoke();
        return g2.f100423a;
    }
}
