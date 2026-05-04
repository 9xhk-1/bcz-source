package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/FlowLineInfo\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,594:1\n113#2:595\n113#2:596\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/FlowLineInfo\n*L\n577#1:595\n578#1:596\n*E\n"})
/* loaded from: classes.dex */
public final class FlowLineInfo {
    public static final int $stable = 8;
    private int lineIndex;
    private float maxCrossAxisSize;
    private float maxMainAxisSize;
    private int positionInLine;

    public /* synthetic */ FlowLineInfo(int i11, int i12, float f11, float f12, v vVar) {
        this(i11, i12, f11, f12);
    }

    public final int getLineIndex$foundation_layout_release() {
        return this.lineIndex;
    }

    /* renamed from: getMaxCrossAxisSize-D9Ej5fM$foundation_layout_release, reason: not valid java name */
    public final float m657getMaxCrossAxisSizeD9Ej5fM$foundation_layout_release() {
        return this.maxCrossAxisSize;
    }

    /* renamed from: getMaxMainAxisSize-D9Ej5fM$foundation_layout_release, reason: not valid java name */
    public final float m658getMaxMainAxisSizeD9Ej5fM$foundation_layout_release() {
        return this.maxMainAxisSize;
    }

    public final int getPositionInLine$foundation_layout_release() {
        return this.positionInLine;
    }

    public final void setLineIndex$foundation_layout_release(int i11) {
        this.lineIndex = i11;
    }

    /* renamed from: setMaxCrossAxisSize-0680j_4$foundation_layout_release, reason: not valid java name */
    public final void m659setMaxCrossAxisSize0680j_4$foundation_layout_release(float f11) {
        this.maxCrossAxisSize = f11;
    }

    /* renamed from: setMaxMainAxisSize-0680j_4$foundation_layout_release, reason: not valid java name */
    public final void m660setMaxMainAxisSize0680j_4$foundation_layout_release(float f11) {
        this.maxMainAxisSize = f11;
    }

    public final void setPositionInLine$foundation_layout_release(int i11) {
        this.positionInLine = i11;
    }

    /* renamed from: update-4j6BHR0$foundation_layout_release, reason: not valid java name */
    public final void m661update4j6BHR0$foundation_layout_release(int i11, int i12, float f11, float f12) {
        this.lineIndex = i11;
        this.positionInLine = i12;
        this.maxMainAxisSize = f11;
        this.maxCrossAxisSize = f12;
    }

    private FlowLineInfo(int i11, int i12, float f11, float f12) {
        this.lineIndex = i11;
        this.positionInLine = i12;
        this.maxMainAxisSize = f11;
        this.maxCrossAxisSize = f12;
    }

    public /* synthetic */ FlowLineInfo(int i11, int i12, float f11, float f12, int i13, v vVar) {
        this((i13 & 1) != 0 ? 0 : i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? Dp.m5115constructorimpl(0) : f11, (i13 & 8) != 0 ? Dp.m5115constructorimpl(0) : f12, null);
    }
}
