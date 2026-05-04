package androidx.compose.foundation;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/GlowOverscrollNode\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n*L\n1#1,1073:1\n61#2:1074\n57#2:1085\n57#2:1092\n61#2:1095\n70#3:1075\n53#3,3:1078\n53#3,3:1082\n60#3:1086\n53#3,3:1089\n60#3:1093\n70#3:1096\n53#3,3:1098\n60#3:1102\n70#3:1105\n22#4:1076\n22#4:1087\n22#4:1094\n22#4:1103\n30#5:1077\n30#5:1081\n30#5:1088\n30#5:1097\n65#6:1101\n69#6:1104\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/GlowOverscrollNode\n*L\n461#1:1074\n481#1:1085\n494#1:1092\n494#1:1095\n461#1:1075\n461#1:1078,3\n471#1:1082,3\n481#1:1086\n483#1:1089,3\n494#1:1093\n494#1:1096\n494#1:1098,3\n511#1:1102\n511#1:1105\n461#1:1076\n481#1:1087\n494#1:1094\n511#1:1103\n461#1:1077\n471#1:1081\n483#1:1088\n494#1:1097\n511#1:1101\n511#1:1104\n*E\n"})
/* loaded from: classes.dex */
final class GlowOverscrollNode extends DelegatingNode implements DrawModifierNode {

    @m80.k
    private final EdgeEffectWrapper edgeEffectWrapper;

    @m80.k
    private final PaddingValues glowDrawPadding;

    @m80.k
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    public GlowOverscrollNode(@m80.k DelegatableNode delegatableNode, @m80.k AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, @m80.k EdgeEffectWrapper edgeEffectWrapper, @m80.k PaddingValues paddingValues) {
        this.overscrollEffect = androidEdgeEffectOverscrollEffect;
        this.edgeEffectWrapper = edgeEffectWrapper;
        this.glowDrawPadding = paddingValues;
        delegate(delegatableNode);
    }

    private final boolean drawBottomGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float mo377toPx0680j_4 = drawScope.mo377toPx0680j_4(this.glowDrawPadding.mo675calculateBottomPaddingD9Ej5fM());
        float f11 = -Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() >> 32));
        float f12 = (-Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() & 4294967295L))) + mo377toPx0680j_4;
        return m290drawWithRotationAndOffsetubNVwUQ(180.0f, Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L)), edgeEffect, canvas);
    }

    private final boolean drawLeftGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float f11 = -Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() & 4294967295L));
        float mo377toPx0680j_4 = drawScope.mo377toPx0680j_4(this.glowDrawPadding.mo676calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection()));
        return m290drawWithRotationAndOffsetubNVwUQ(270.0f, Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) << 32) | (4294967295L & Float.floatToRawIntBits(mo377toPx0680j_4))), edgeEffect, canvas);
    }

    private final boolean drawRightGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float mo377toPx0680j_4 = (-c10.d.L0(Float.intBitsToFloat((int) (drawScope.mo3060getSizeNHjbRc() >> 32)))) + drawScope.mo377toPx0680j_4(this.glowDrawPadding.mo677calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection()));
        return m290drawWithRotationAndOffsetubNVwUQ(90.0f, Offset.m2260constructorimpl((Float.floatToRawIntBits(mo377toPx0680j_4) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), edgeEffect, canvas);
    }

    private final boolean drawTopGlow(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        float mo377toPx0680j_4 = drawScope.mo377toPx0680j_4(this.glowDrawPadding.mo678calculateTopPaddingD9Ej5fM());
        return m290drawWithRotationAndOffsetubNVwUQ(0.0f, Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(mo377toPx0680j_4) & 4294967295L)), edgeEffect, canvas);
    }

    /* renamed from: drawWithRotationAndOffset-ubNVwUQ, reason: not valid java name */
    private final boolean m290drawWithRotationAndOffsetubNVwUQ(float f11, long j11, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f11);
        canvas.translate(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@m80.k ContentDrawScope contentDrawScope) {
        this.overscrollEffect.m216updateSizeuvyYCjk$foundation_release(contentDrawScope.mo3060getSizeNHjbRc());
        if (Size.m2339isEmptyimpl(contentDrawScope.mo3060getSizeNHjbRc())) {
            contentDrawScope.drawContent();
            return;
        }
        contentDrawScope.drawContent();
        this.overscrollEffect.getRedrawSignal$foundation_release().getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        EdgeEffectWrapper edgeEffectWrapper = this.edgeEffectWrapper;
        boolean drawLeftGlow = edgeEffectWrapper.isLeftAnimating() ? drawLeftGlow(contentDrawScope, edgeEffectWrapper.getOrCreateLeftEffect(), nativeCanvas) : false;
        if (edgeEffectWrapper.isTopAnimating()) {
            drawLeftGlow = drawTopGlow(contentDrawScope, edgeEffectWrapper.getOrCreateTopEffect(), nativeCanvas) || drawLeftGlow;
        }
        if (edgeEffectWrapper.isRightAnimating()) {
            drawLeftGlow = drawRightGlow(contentDrawScope, edgeEffectWrapper.getOrCreateRightEffect(), nativeCanvas) || drawLeftGlow;
        }
        if (edgeEffectWrapper.isBottomAnimating()) {
            drawLeftGlow = drawBottomGlow(contentDrawScope, edgeEffectWrapper.getOrCreateBottomEffect(), nativeCanvas) || drawLeftGlow;
        }
        if (drawLeftGlow) {
            this.overscrollEffect.invalidateOverscroll$foundation_release();
        }
    }
}
