package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutStateKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n65#2:251\n65#2:254\n65#2:257\n69#2:260\n69#2:263\n69#2:266\n60#3:252\n60#3:255\n60#3:258\n70#3:261\n70#3:264\n70#3:267\n53#3,3:270\n22#4:253\n22#4:256\n22#4:259\n22#4:262\n22#4:265\n22#4:268\n30#5:269\n1#6:273\n*S KotlinDebug\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutStateKt\n*L\n200#1:251\n201#1:254\n202#1:257\n206#1:260\n207#1:263\n208#1:266\n200#1:252\n201#1:255\n202#1:258\n206#1:261\n207#1:264\n208#1:267\n210#1:270,3\n200#1:253\n201#1:256\n202#1:259\n206#1:262\n207#1:265\n208#1:268\n210#1:269\n*E\n"})
/* loaded from: classes.dex */
public final class TextLayoutStateKt {
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m1304coerceIn3MmeM6k(long j11, @m80.k Rect rect) {
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat(i11) < rect.getLeft() ? rect.getLeft() : Float.intBitsToFloat(i11) > rect.getRight() ? rect.getRight() : Float.intBitsToFloat(i11)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i12) < rect.getTop() ? rect.getTop() : Float.intBitsToFloat(i12) > rect.getBottom() ? rect.getBottom() : Float.intBitsToFloat(i12)) & 4294967295L));
    }

    /* renamed from: fromDecorationToTextLayout-Uv8p0NA, reason: not valid java name */
    public static final long m1305fromDecorationToTextLayoutUv8p0NA(@m80.k TextLayoutState textLayoutState, long j11) {
        Offset offset;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
            if (decoratorNodeCoordinates != null) {
                offset = Offset.m2257boximpl((textLayoutNodeCoordinates.isAttached() && decoratorNodeCoordinates.isAttached()) ? textLayoutNodeCoordinates.mo3866localPositionOfR5De75A(decoratorNodeCoordinates, j11) : j11);
            } else {
                offset = null;
            }
            if (offset != null) {
                return offset.m2278unboximpl();
            }
        }
        return j11;
    }

    /* renamed from: fromTextLayoutToCore-Uv8p0NA, reason: not valid java name */
    public static final long m1306fromTextLayoutToCoreUv8p0NA(@m80.k TextLayoutState textLayoutState, long j11) {
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            Offset offset = null;
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                LayoutCoordinates coreNodeCoordinates = textLayoutState.getCoreNodeCoordinates();
                if (coreNodeCoordinates != null) {
                    if (!coreNodeCoordinates.isAttached()) {
                        coreNodeCoordinates = null;
                    }
                    if (coreNodeCoordinates != null) {
                        offset = Offset.m2257boximpl(coreNodeCoordinates.mo3866localPositionOfR5De75A(textLayoutNodeCoordinates, j11));
                    }
                }
                if (offset != null) {
                    return offset.m2278unboximpl();
                }
            }
        }
        return j11;
    }

    /* renamed from: fromWindowToDecoration-Uv8p0NA, reason: not valid java name */
    public static final long m1307fromWindowToDecorationUv8p0NA(@m80.k TextLayoutState textLayoutState, long j11) {
        LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        return (decoratorNodeCoordinates == null || !decoratorNodeCoordinates.isAttached()) ? j11 : decoratorNodeCoordinates.mo3874windowToLocalMKHz9U(j11);
    }
}
