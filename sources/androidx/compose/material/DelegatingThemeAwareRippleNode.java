package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ripple.kt\nandroidx/compose/material/DelegatingThemeAwareRippleNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,397:1\n1#2:398\n*E\n"})
/* loaded from: classes.dex */
final class DelegatingThemeAwareRippleNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, ObserverModifierNode {
    private final boolean bounded;

    @k
    private final ColorProducer color;

    @k
    private final InteractionSource interactionSource;
    private final float radius;

    @l
    private DelegatableNode rippleNode;

    public /* synthetic */ DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z11, float f11, ColorProducer colorProducer, v vVar) {
        this(interactionSource, z11, f11, colorProducer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachNewRipple() {
        this.rippleNode = delegate(androidx.compose.material.ripple.RippleKt.m1875createRippleModifierNodeTDGSqEk(this.interactionSource, this.bounded, this.radius, new ColorProducer() { // from class: androidx.compose.material.DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1
            @Override // androidx.compose.ui.graphics.ColorProducer
            /* renamed from: invoke-0d7_KjU, reason: not valid java name */
            public final long mo1642invoke0d7_KjU() {
                ColorProducer colorProducer;
                colorProducer = DelegatingThemeAwareRippleNode.this.color;
                long mo1642invoke0d7_KjU = colorProducer.mo1642invoke0d7_KjU();
                if (mo1642invoke0d7_KjU != 16) {
                    return mo1642invoke0d7_KjU;
                }
                RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(DelegatingThemeAwareRippleNode.this, RippleKt.getLocalRippleConfiguration());
                return (rippleConfiguration == null || rippleConfiguration.m1744getColor0d7_KjU() == 16) ? RippleDefaults.INSTANCE.m1746rippleColor5vOe2sY(((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(DelegatingThemeAwareRippleNode.this, ContentColorKt.getLocalContentColor())).m2519unboximpl(), ((Colors) CompositionLocalConsumerModifierNodeKt.currentValueOf(DelegatingThemeAwareRippleNode.this, ColorsKt.getLocalColors())).isLight()) : rippleConfiguration.m1744getColor0d7_KjU();
            }
        }, new a<RippleAlpha>() { // from class: androidx.compose.material.DelegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final RippleAlpha invoke() {
                RippleAlpha rippleAlpha;
                RippleConfiguration rippleConfiguration = (RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(DelegatingThemeAwareRippleNode.this, RippleKt.getLocalRippleConfiguration());
                return (rippleConfiguration == null || (rippleAlpha = rippleConfiguration.getRippleAlpha()) == null) ? RippleDefaults.INSTANCE.m1745rippleAlphaDxMtmZc(((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(DelegatingThemeAwareRippleNode.this, ContentColorKt.getLocalContentColor())).m2519unboximpl(), ((Colors) CompositionLocalConsumerModifierNodeKt.currentValueOf(DelegatingThemeAwareRippleNode.this, ColorsKt.getLocalColors())).isLight()) : rippleAlpha;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeRipple() {
        DelegatableNode delegatableNode = this.rippleNode;
        if (delegatableNode != null) {
            undelegate(delegatableNode);
        }
        this.rippleNode = null;
    }

    private final void updateConfiguration() {
        ObserverModifierNodeKt.observeReads(this, new a<g2>() { // from class: androidx.compose.material.DelegatingThemeAwareRippleNode$updateConfiguration$1
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DelegatableNode delegatableNode;
                if (((RippleConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(DelegatingThemeAwareRippleNode.this, RippleKt.getLocalRippleConfiguration())) == null) {
                    DelegatingThemeAwareRippleNode.this.removeRipple();
                    return;
                }
                delegatableNode = DelegatingThemeAwareRippleNode.this.rippleNode;
                if (delegatableNode == null) {
                    DelegatingThemeAwareRippleNode.this.attachNewRipple();
                }
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateConfiguration();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateConfiguration();
    }

    private DelegatingThemeAwareRippleNode(InteractionSource interactionSource, boolean z11, float f11, ColorProducer colorProducer) {
        this.interactionSource = interactionSource;
        this.bounded = z11;
        this.radius = f11;
        this.color = colorProducer;
    }
}
