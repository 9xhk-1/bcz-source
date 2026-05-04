package androidx.compose.ui.spatial;

import a00.g0;
import a00.h0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRelativeLayoutBounds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RelativeLayoutBounds.kt\nandroidx/compose/ui/spatial/RelativeLayoutBounds\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 RectList.kt\nandroidx/compose/ui/spatial/RectList\n*L\n1#1,179:1\n837#2:180\n839#2:181\n837#2:184\n839#2:185\n837#2:188\n837#2:189\n839#2:190\n839#2:191\n837#2:192\n839#2:193\n837#2:194\n839#2:195\n837#2:196\n839#2:197\n837#2:198\n839#2:199\n837#2:200\n839#2:201\n837#2:202\n839#2:203\n860#2,2:220\n837#2:224\n839#2:226\n837#2:228\n839#2:230\n810#2:232\n32#3:182\n32#3:186\n80#4:183\n80#4:187\n529#5,16:204\n545#5,2:222\n547#5:225\n548#5:227\n549#5:229\n550#5:231\n553#5,3:233\n*S KotlinDebug\n*F\n+ 1 RelativeLayoutBounds.kt\nandroidx/compose/ui/spatial/RelativeLayoutBounds\n*L\n55#1:180\n56#1:181\n65#1:184\n66#1:185\n73#1:188\n74#1:189\n81#1:190\n82#1:191\n91#1:192\n92#1:193\n93#1:194\n94#1:195\n101#1:196\n102#1:197\n103#1:198\n104#1:199\n131#1:200\n132#1:201\n133#1:202\n134#1:203\n171#1:220,2\n171#1:224\n171#1:226\n171#1:228\n171#1:230\n171#1:232\n57#1:182\n67#1:186\n57#1:183\n67#1:187\n171#1:204,16\n171#1:222,2\n171#1:225\n171#1:227\n171#1:229\n171#1:231\n171#1:233,3\n*E\n"})
/* loaded from: classes2.dex */
public final class RelativeLayoutBounds {
    public static final int $stable = 8;
    private final long bottomRight;

    @k
    private final DelegatableNode node;
    private final long screenOffset;
    private final long topLeft;

    @l
    private final float[] viewToWindowMatrix;
    private final long windowOffset;

    public /* synthetic */ RelativeLayoutBounds(long j11, long j12, long j13, long j14, float[] fArr, DelegatableNode delegatableNode, v vVar) {
        this(j11, j12, j13, j14, fArr, delegatableNode);
    }

    @k
    public final List<IntRect> calculateOcclusions() {
        int i11;
        int i12;
        RectManager rectManager = DelegatableNodeKt.requireOwner(this.node).getRectManager();
        int semanticsId = DelegatableNodeKt.requireLayoutNode(this.node).getSemanticsId();
        RectList rects = rectManager.getRects();
        int indexOf = rects.indexOf(semanticsId);
        if (indexOf < 0) {
            return h0.J();
        }
        List j11 = g0.j();
        long[] jArr = rects.items;
        int i13 = rects.itemsSize;
        long j12 = jArr[indexOf];
        long j13 = jArr[indexOf + 1];
        int i14 = 0;
        while (i14 < jArr.length - 2 && i14 < i13) {
            if (i14 == indexOf) {
                i14 += 3;
            } else {
                long j14 = jArr[i14];
                long j15 = jArr[i14 + 1];
                if (((((j13 - j14) - InlineClassHelperKt.Uint64Low32) | ((j15 - j12) - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    i11 = i13;
                    i12 = indexOf;
                    int i15 = (int) (j14 >> 32);
                    int i16 = (int) j14;
                    int i17 = (int) (j15 >> 32);
                    int i18 = (int) j15;
                    if (rectManager.isTargetDrawnFirst$ui_release(semanticsId, ((int) jArr[i14 + 2]) & RectListKt.Lower26Bits)) {
                        j11.add(new IntRect(i15, i16, i17, i18));
                    }
                } else {
                    i11 = i13;
                    i12 = indexOf;
                }
                i14 += 3;
                indexOf = i12;
                i13 = i11;
            }
        }
        return g0.b(j11);
    }

    @k
    public final IntRect getBoundsInRoot() {
        long j11 = this.topLeft;
        long j12 = this.bottomRight;
        return new IntRect((int) (j11 >> 32), (int) j11, (int) (j12 >> 32), (int) j12);
    }

    @k
    public final IntRect getBoundsInScreen() {
        if (this.viewToWindowMatrix != null) {
            IntRect boundsInWindow = getBoundsInWindow();
            long j11 = this.windowOffset;
            return new IntRect(boundsInWindow.getLeft() + IntOffset.m5243getXimpl(j11), boundsInWindow.getTop() + IntOffset.m5244getYimpl(j11), boundsInWindow.getRight() + IntOffset.m5243getXimpl(j11), boundsInWindow.getBottom() + IntOffset.m5244getYimpl(j11));
        }
        long j12 = this.topLeft;
        int i11 = (int) (j12 >> 32);
        long j13 = this.bottomRight;
        int i12 = (int) (j13 >> 32);
        int i13 = (int) j13;
        int m5243getXimpl = IntOffset.m5243getXimpl(this.screenOffset);
        int m5244getYimpl = IntOffset.m5244getYimpl(this.screenOffset);
        return new IntRect(i11 + m5243getXimpl, ((int) j12) + m5244getYimpl, i12 + m5243getXimpl, i13 + m5244getYimpl);
    }

    @k
    public final IntRect getBoundsInWindow() {
        long j11 = this.topLeft;
        int i11 = (int) (j11 >> 32);
        int i12 = (int) j11;
        long j12 = this.bottomRight;
        int i13 = (int) (j12 >> 32);
        int i14 = (int) j12;
        float[] fArr = this.viewToWindowMatrix;
        if (fArr != null) {
            return IntRectKt.roundToIntRect(Matrix.m2746mapimpl(fArr, new Rect(i11, i12, i13, i14)));
        }
        int m5243getXimpl = IntOffset.m5243getXimpl(this.screenOffset) - IntOffset.m5243getXimpl(this.windowOffset);
        int m5244getYimpl = IntOffset.m5244getYimpl(this.screenOffset) - IntOffset.m5244getYimpl(this.windowOffset);
        return new IntRect(i11 + m5243getXimpl, i12 + m5244getYimpl, i13 + m5243getXimpl, i14 + m5244getYimpl);
    }

    public final int getHeight() {
        return ((int) this.bottomRight) - ((int) this.topLeft);
    }

    /* renamed from: getPositionInRoot-nOcc-ac, reason: not valid java name */
    public final long m4353getPositionInRootnOccac() {
        return IntOffset.m5237constructorimpl(this.topLeft);
    }

    /* renamed from: getPositionInScreen-nOcc-ac, reason: not valid java name */
    public final long m4354getPositionInScreennOccac() {
        int m5243getXimpl = IntOffset.m5243getXimpl(this.screenOffset);
        int m5244getYimpl = IntOffset.m5244getYimpl(this.screenOffset);
        long j11 = this.topLeft;
        return IntOffset.m5237constructorimpl(((((int) (j11 >> 32)) + m5243getXimpl) << 32) | ((((int) j11) + m5244getYimpl) & 4294967295L));
    }

    /* renamed from: getPositionInWindow-nOcc-ac, reason: not valid java name */
    public final long m4355getPositionInWindownOccac() {
        int m5243getXimpl = IntOffset.m5243getXimpl(this.screenOffset) - IntOffset.m5243getXimpl(this.windowOffset);
        int m5244getYimpl = IntOffset.m5244getYimpl(this.screenOffset) - IntOffset.m5244getYimpl(this.windowOffset);
        long j11 = this.topLeft;
        return IntOffset.m5237constructorimpl(((((int) (j11 >> 32)) + m5243getXimpl) << 32) | ((((int) j11) + m5244getYimpl) & 4294967295L));
    }

    public final int getWidth() {
        return ((int) (this.bottomRight >> 32)) - ((int) (this.topLeft >> 32));
    }

    private RelativeLayoutBounds(long j11, long j12, long j13, long j14, float[] fArr, DelegatableNode delegatableNode) {
        this.topLeft = j11;
        this.bottomRight = j12;
        this.windowOffset = j13;
        this.screenOffset = j14;
        this.viewToWindowMatrix = fArr;
        this.node = delegatableNode;
    }
}
