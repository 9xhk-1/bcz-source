package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import com.baicizhan.client.business.dataset.provider.a;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nModifierLocalProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,69:1\n110#2:70\n*S KotlinDebug\n*F\n+ 1 ModifierLocalProvider.kt\nandroidx/compose/ui/modifier/ModifierLocalProviderKt\n*L\n58#1:70\n*E\n"})
/* loaded from: classes.dex */
public final class ModifierLocalProviderKt {
    @k
    public static final <T> Modifier modifierLocalProvider(@k Modifier modifier, @k final ProvidableModifierLocal<T> providableModifierLocal, @k final a<? extends T> aVar) {
        return modifier.then(new ModifierLocalProviderKt$modifierLocalProvider$1(providableModifierLocal, aVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.ui.modifier.ModifierLocalProviderKt$modifierLocalProvider$$inlined$debugInspectorInfo$1
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
                inspectorInfo.setName("modifierLocalProvider");
                inspectorInfo.getProperties().set(a.d.C0245a.f16161a, ProvidableModifierLocal.this);
                inspectorInfo.getProperties().set("value", aVar);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }
}
