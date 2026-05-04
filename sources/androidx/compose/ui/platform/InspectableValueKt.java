package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import kotlin.DeprecationLevel;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class InspectableValueKt {

    @m80.k
    private static final x00.l<InspectorInfo, g2> NoInspectorInfo = new x00.l<InspectorInfo, g2>() { // from class: androidx.compose.ui.platform.InspectableValueKt$NoInspectorInfo$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InspectorInfo inspectorInfo) {
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
            invoke2(inspectorInfo);
            return g2.f100423a;
        }
    };
    private static boolean isDebugInspectorInfoEnabled;

    @m80.k
    public static final x00.l<InspectorInfo, g2> debugInspectorInfo(@m80.k final x00.l<? super InspectorInfo, g2> lVar) {
        return isDebugInspectorInfoEnabled() ? new x00.l<InspectorInfo, g2>() { // from class: androidx.compose.ui.platform.InspectableValueKt$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                lVar.invoke(inspectorInfo);
            }
        } : getNoInspectorInfo();
    }

    @m80.k
    public static final x00.l<InspectorInfo, g2> getNoInspectorInfo() {
        return NoInspectorInfo;
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "This API will create more invalidations of your modifier than necessary, so it's use is discouraged. Implementing the inspectableProperties method on ModifierNodeElement is the recommended zero-cost alternative to exposing properties on a Modifier to tooling.")
    @m80.k
    public static final Modifier inspectable(@m80.k Modifier modifier, @m80.k x00.l<? super InspectorInfo, g2> lVar, @m80.k x00.l<? super Modifier, ? extends Modifier> lVar2) {
        return inspectableWrapper(modifier, lVar, lVar2.invoke(Modifier.Companion));
    }

    @yz.v0
    @m80.k
    public static final Modifier inspectableWrapper(@m80.k Modifier modifier, @m80.k x00.l<? super InspectorInfo, g2> lVar, @m80.k Modifier modifier2) {
        InspectableModifier inspectableModifier = new InspectableModifier(lVar);
        return modifier.then(inspectableModifier).then(modifier2).then(inspectableModifier.getEnd());
    }

    public static final boolean isDebugInspectorInfoEnabled() {
        return isDebugInspectorInfoEnabled;
    }

    public static final void setDebugInspectorInfoEnabled(boolean z11) {
        isDebugInspectorInfoEnabled = z11;
    }
}
