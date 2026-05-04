package androidx.compose.material.ripple;

import androidx.collection.MutableScatterMap;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DrawModifierNodeKt;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nCommonRipple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleNode\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n357#2,4:174\n329#2,6:178\n339#2,3:185\n342#2,9:189\n361#2:198\n357#2,4:199\n329#2,6:203\n339#2,3:210\n342#2,2:214\n345#2,6:217\n361#2:223\n1399#3:184\n1270#3:188\n1399#3:209\n1270#3:213\n1#4:216\n*S KotlinDebug\n*F\n+ 1 CommonRipple.kt\nandroidx/compose/material/ripple/CommonRippleNode\n*L\n75#1:174,4\n75#1:178,6\n75#1:185,3\n75#1:189,9\n75#1:198\n98#1:199,4\n98#1:203,6\n98#1:210,3\n98#1:214,2\n98#1:217,6\n98#1:223\n75#1:184\n75#1:188\n98#1:209\n98#1:213\n*E\n"})
/* loaded from: classes.dex */
public final class CommonRippleNode extends RippleNode {
    public static final int $stable = 8;

    @k
    private final MutableScatterMap<PressInteraction.Press, RippleAnimation> ripples;

    public /* synthetic */ CommonRippleNode(InteractionSource interactionSource, boolean z11, float f11, ColorProducer colorProducer, x00.a aVar, v vVar) {
        this(interactionSource, z11, f11, colorProducer, aVar);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* renamed from: addRipple-12SF9DM */
    public void mo1865addRipple12SF9DM(@k PressInteraction.Press press, long j11, float f11) {
        MutableScatterMap<PressInteraction.Press, RippleAnimation> mutableScatterMap = this.ripples;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j12 = jArr[i11];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j12) < 128) {
                            int i14 = (i11 << 3) + i13;
                            ((RippleAnimation) objArr2[i14]).finish();
                        }
                        j12 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        RippleAnimation rippleAnimation = new RippleAnimation(getBounded() ? Offset.m2257boximpl(press.m548getPressPositionF1C5BW0()) : null, f11, getBounded(), null);
        this.ripples.set(press, rippleAnimation);
        c40.k.f(getCoroutineScope(), null, null, new CommonRippleNode$addRipple$2(rippleAnimation, this, press, null), 3, null);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void drawRipples(@k DrawScope drawScope) {
        float f11;
        int i11;
        int i12;
        int i13;
        float f12;
        float pressedAlpha = getRippleAlpha().invoke().getPressedAlpha();
        if (pressedAlpha == 0.0f) {
            return;
        }
        MutableScatterMap<PressInteraction.Press, RippleAnimation> mutableScatterMap = this.ripples;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            long j11 = jArr[i14];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i15 = 8;
                int i16 = 8 - ((~(i14 - length)) >>> 31);
                long j12 = j11;
                int i17 = 0;
                while (i17 < i16) {
                    if ((j12 & 255) < 128) {
                        int i18 = (i14 << 3) + i17;
                        i11 = i17;
                        i12 = i16;
                        i13 = i15;
                        f12 = pressedAlpha;
                        ((RippleAnimation) objArr2[i18]).m1869draw4WTKRHQ(drawScope, Color.m2508copywmQWz5c$default(m1877getRippleColor0d7_KjU(), pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
                    } else {
                        i11 = i17;
                        i12 = i16;
                        i13 = i15;
                        f12 = pressedAlpha;
                    }
                    j12 >>= i13;
                    i17 = i11 + 1;
                    pressedAlpha = f12;
                    i16 = i12;
                    i15 = i13;
                }
                int i19 = i16;
                f11 = pressedAlpha;
                if (i19 != i15) {
                    return;
                }
            } else {
                f11 = pressedAlpha;
            }
            if (i14 == length) {
                return;
            }
            i14++;
            pressedAlpha = f11;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.ripples.clear();
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public void removeRipple(@k PressInteraction.Press press) {
        RippleAnimation rippleAnimation = this.ripples.get(press);
        if (rippleAnimation != null) {
            rippleAnimation.finish();
        }
    }

    private CommonRippleNode(InteractionSource interactionSource, boolean z11, float f11, ColorProducer colorProducer, x00.a<RippleAlpha> aVar) {
        super(interactionSource, z11, f11, colorProducer, aVar, null);
        this.ripples = new MutableScatterMap<>(0, 1, null);
    }
}
