package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface LayoutModifier extends Modifier.Element {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@k LayoutModifier layoutModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return LayoutModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@k LayoutModifier layoutModifier, @k l<? super Modifier.Element, Boolean> lVar) {
            return LayoutModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@k LayoutModifier layoutModifier, R r11, @k p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            return (R) LayoutModifier.super.foldIn(r11, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@k LayoutModifier layoutModifier, R r11, @k p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            return (R) LayoutModifier.super.foldOut(r11, pVar);
        }

        @Deprecated
        public static int maxIntrinsicHeight(@k LayoutModifier layoutModifier, @k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
            return LayoutModifier.super.maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i11);
        }

        @Deprecated
        public static int maxIntrinsicWidth(@k LayoutModifier layoutModifier, @k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
            return LayoutModifier.super.maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i11);
        }

        @Deprecated
        public static int minIntrinsicHeight(@k LayoutModifier layoutModifier, @k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
            return LayoutModifier.super.minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i11);
        }

        @Deprecated
        public static int minIntrinsicWidth(@k LayoutModifier layoutModifier, @k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
            return LayoutModifier.super.minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i11);
        }

        @Deprecated
        @k
        public static Modifier then(@k LayoutModifier layoutModifier, @k Modifier modifier) {
            return LayoutModifier.super.then(modifier);
        }
    }

    default int maxIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return MeasuringIntrinsics.INSTANCE.maxHeight(this, intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    default int maxIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return MeasuringIntrinsics.INSTANCE.maxWidth(this, intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    @k
    /* renamed from: measure-3p2s80s */
    MeasureResult mo646measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11);

    default int minIntrinsicHeight(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return MeasuringIntrinsics.INSTANCE.minHeight(this, intrinsicMeasureScope, intrinsicMeasurable, i11);
    }

    default int minIntrinsicWidth(@k IntrinsicMeasureScope intrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return MeasuringIntrinsics.INSTANCE.minWidth(this, intrinsicMeasureScope, intrinsicMeasurable, i11);
    }
}
