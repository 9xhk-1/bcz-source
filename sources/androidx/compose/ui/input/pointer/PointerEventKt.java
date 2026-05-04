package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPointerEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.kt\nandroidx/compose/ui/input/pointer/PointerEventKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1054:1\n1053#1:1065\n65#2:1055\n69#2:1058\n65#2:1066\n69#2:1069\n60#3:1056\n70#3:1059\n85#3:1062\n90#3:1064\n60#3:1067\n70#3:1070\n60#3:1073\n85#3:1076\n70#3:1078\n90#3:1081\n22#4:1057\n22#4:1060\n22#4:1068\n22#4:1071\n22#4:1074\n22#4:1079\n54#5:1061\n59#5:1063\n54#5:1075\n59#5:1080\n57#6:1072\n61#6:1077\n*S KotlinDebug\n*F\n+ 1 PointerEvent.kt\nandroidx/compose/ui/input/pointer/PointerEventKt\n*L\n1035#1:1065\n1017#1:1055\n1018#1:1058\n1038#1:1066\n1039#1:1069\n1017#1:1056\n1018#1:1059\n1019#1:1062\n1020#1:1064\n1038#1:1067\n1039#1:1070\n1042#1:1073\n1043#1:1076\n1046#1:1078\n1047#1:1081\n1017#1:1057\n1018#1:1060\n1038#1:1068\n1039#1:1071\n1042#1:1074\n1046#1:1079\n1019#1:1061\n1020#1:1063\n1043#1:1075\n1047#1:1080\n1042#1:1072\n1046#1:1077\n*E\n"})
/* loaded from: classes.dex */
public final class PointerEventKt {
    @n(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @w0(expression = "isConsumed", imports = {}))
    public static final boolean anyChangeConsumed(@k PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final boolean changedToDown(@k PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(@k PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(@k PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(@k PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    @n(message = "Use consume() instead", replaceWith = @w0(expression = "consume()", imports = {}))
    public static final void consumeAllChanges(@k PointerInputChange pointerInputChange) {
        pointerInputChange.consume();
    }

    @n(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @w0(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void consumeDownChange(@k PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    @n(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @w0(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void consumePositionChange(@k PointerInputChange pointerInputChange) {
        if (Offset.m2265equalsimpl0(positionChange(pointerInputChange), Offset.Companion.m2284getZeroF1C5BW0())) {
            return;
        }
        pointerInputChange.consume();
    }

    @n(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @w0(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    /* renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m3676isOutOfBoundsO0kMr_c(@k PointerInputChange pointerInputChange, long j11) {
        long m3732getPositionF1C5BW0 = pointerInputChange.m3732getPositionF1C5BW0();
        float intBitsToFloat = Float.intBitsToFloat((int) (m3732getPositionF1C5BW0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m3732getPositionF1C5BW0 & 4294967295L));
        int i11 = (int) (j11 >> 32);
        int i12 = (int) (j11 & 4294967295L);
        return (intBitsToFloat > ((float) i11)) | (intBitsToFloat < 0.0f) | (intBitsToFloat2 < 0.0f) | (intBitsToFloat2 > ((float) i12));
    }

    /* renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m3677isOutOfBoundsjwHxaWs(@k PointerInputChange pointerInputChange, long j11, long j12) {
        boolean m3803equalsimpl0 = PointerType.m3803equalsimpl0(pointerInputChange.m3735getTypeT8wyACA(), PointerType.Companion.m3810getTouchT8wyACA());
        long m3732getPositionF1C5BW0 = pointerInputChange.m3732getPositionF1C5BW0();
        float intBitsToFloat = Float.intBitsToFloat((int) (m3732getPositionF1C5BW0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m3732getPositionF1C5BW0 & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j12 >> 32));
        float f11 = m3803equalsimpl0 ? 1.0f : 0.0f;
        float f12 = intBitsToFloat3 * f11;
        float f13 = ((int) (j11 >> 32)) + f12;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j12 & 4294967295L)) * f11;
        return (intBitsToFloat > f13) | (intBitsToFloat < (-f12)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j11 & 4294967295L)) + intBitsToFloat4);
    }

    public static final long positionChange(@k PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, false);
    }

    @n(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @w0(expression = "isConsumed", imports = {}))
    public static final boolean positionChangeConsumed(@k PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(@k PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z11) {
        return (z11 || !pointerInputChange.isConsumed()) ? Offset.m2272minusMKHz9U(pointerInputChange.m3732getPositionF1C5BW0(), pointerInputChange.m3733getPreviousPositionF1C5BW0()) : Offset.Companion.m2284getZeroF1C5BW0();
    }

    public static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return positionChangeInternal(pointerInputChange, z11);
    }

    public static final boolean positionChanged(@k PointerInputChange pointerInputChange) {
        return !Offset.m2265equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.Companion.m2284getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(@k PointerInputChange pointerInputChange) {
        return !Offset.m2265equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.Companion.m2284getZeroF1C5BW0());
    }

    private static final int toInt(boolean z11) {
        return z11 ? 1 : 0;
    }
}
