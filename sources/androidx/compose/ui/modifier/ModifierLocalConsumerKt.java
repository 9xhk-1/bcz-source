package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nModifierLocalConsumer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,73:1\n110#2:74\n*S KotlinDebug\n*F\n+ 1 ModifierLocalConsumer.kt\nandroidx/compose/ui/modifier/ModifierLocalConsumerKt\n*L\n49#1:74\n*E\n"})
/* loaded from: classes.dex */
public final class ModifierLocalConsumerKt {
    @Stable
    @k
    public static final Modifier modifierLocalConsumer(@k Modifier modifier, @k final l<? super ModifierLocalReadScope, g2> lVar) {
        return modifier.then(new ModifierLocalConsumerImpl(lVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.ui.modifier.ModifierLocalConsumerKt$modifierLocalConsumer$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("modifierLocalConsumer");
                inspectorInfo.getProperties().set("consumer", l.this);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
