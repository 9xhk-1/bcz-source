package androidx.compose.ui.node;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import m80.k;
import x00.p;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@v0
/* loaded from: classes2.dex */
public interface ComposeUiNode {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @k
        private static final x00.a<ComposeUiNode> Constructor = LayoutNode.Companion.getConstructor$ui_release();

        @k
        private static final x00.a<ComposeUiNode> VirtualConstructor = new x00.a<LayoutNode>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$VirtualConstructor$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final LayoutNode invoke() {
                return new LayoutNode(true, 0, 2, null);
            }
        };

        @k
        private static final p<ComposeUiNode, Modifier, g2> SetModifier = new p<ComposeUiNode, Modifier, g2>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1
            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(ComposeUiNode composeUiNode, Modifier modifier) {
                invoke2(composeUiNode, modifier);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, Modifier modifier) {
                composeUiNode.setModifier(modifier);
            }
        };

        @k
        private static final p<ComposeUiNode, Density, g2> SetDensity = new p<ComposeUiNode, Density, g2>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetDensity$1
            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(ComposeUiNode composeUiNode, Density density) {
                invoke2(composeUiNode, density);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, Density density) {
                composeUiNode.setDensity(density);
            }
        };

        @k
        private static final p<ComposeUiNode, CompositionLocalMap, g2> SetResolvedCompositionLocals = new p<ComposeUiNode, CompositionLocalMap, g2>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetResolvedCompositionLocals$1
            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(ComposeUiNode composeUiNode, CompositionLocalMap compositionLocalMap) {
                invoke2(composeUiNode, compositionLocalMap);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, CompositionLocalMap compositionLocalMap) {
                composeUiNode.setCompositionLocalMap(compositionLocalMap);
            }
        };

        @k
        private static final p<ComposeUiNode, MeasurePolicy, g2> SetMeasurePolicy = new p<ComposeUiNode, MeasurePolicy, g2>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1
            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
                invoke2(composeUiNode, measurePolicy);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
                composeUiNode.setMeasurePolicy(measurePolicy);
            }
        };

        @k
        private static final p<ComposeUiNode, LayoutDirection, g2> SetLayoutDirection = new p<ComposeUiNode, LayoutDirection, g2>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1
            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                invoke2(composeUiNode, layoutDirection);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
                composeUiNode.setLayoutDirection(layoutDirection);
            }
        };

        @k
        private static final p<ComposeUiNode, ViewConfiguration, g2> SetViewConfiguration = new p<ComposeUiNode, ViewConfiguration, g2>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1
            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
                invoke2(composeUiNode, viewConfiguration);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
                composeUiNode.setViewConfiguration(viewConfiguration);
            }
        };

        @k
        private static final p<ComposeUiNode, Integer, g2> SetCompositeKeyHash = new p<ComposeUiNode, Integer, g2>() { // from class: androidx.compose.ui.node.ComposeUiNode$Companion$SetCompositeKeyHash$1
            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(ComposeUiNode composeUiNode, Integer num) {
                invoke(composeUiNode, num.intValue());
                return g2.f100423a;
            }

            public final void invoke(ComposeUiNode composeUiNode, int i11) {
                composeUiNode.setCompositeKeyHash(i11);
            }
        };

        private Companion() {
        }

        @k
        public final x00.a<ComposeUiNode> getConstructor() {
            return Constructor;
        }

        @k
        public final p<ComposeUiNode, Integer, g2> getSetCompositeKeyHash() {
            return SetCompositeKeyHash;
        }

        @k
        public final p<ComposeUiNode, Density, g2> getSetDensity() {
            return SetDensity;
        }

        @k
        public final p<ComposeUiNode, LayoutDirection, g2> getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        @k
        public final p<ComposeUiNode, MeasurePolicy, g2> getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        @k
        public final p<ComposeUiNode, Modifier, g2> getSetModifier() {
            return SetModifier;
        }

        @k
        public final p<ComposeUiNode, CompositionLocalMap, g2> getSetResolvedCompositionLocals() {
            return SetResolvedCompositionLocals;
        }

        @k
        public final p<ComposeUiNode, ViewConfiguration, g2> getSetViewConfiguration() {
            return SetViewConfiguration;
        }

        @k
        public final x00.a<ComposeUiNode> getVirtualConstructor() {
            return VirtualConstructor;
        }
    }

    int getCompositeKeyHash();

    @k
    CompositionLocalMap getCompositionLocalMap();

    @k
    Density getDensity();

    @k
    LayoutDirection getLayoutDirection();

    @k
    MeasurePolicy getMeasurePolicy();

    @k
    Modifier getModifier();

    @k
    ViewConfiguration getViewConfiguration();

    void setCompositeKeyHash(int i11);

    void setCompositionLocalMap(@k CompositionLocalMap compositionLocalMap);

    void setDensity(@k Density density);

    void setLayoutDirection(@k LayoutDirection layoutDirection);

    void setMeasurePolicy(@k MeasurePolicy measurePolicy);

    void setModifier(@k Modifier modifier);

    void setViewConfiguration(@k ViewConfiguration viewConfiguration);
}
