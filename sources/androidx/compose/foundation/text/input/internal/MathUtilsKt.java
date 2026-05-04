package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathUtils.kt\nandroidx/compose/foundation/text/input/internal/MathUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
/* loaded from: classes.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i11, int i12, @m80.k x00.a<Integer> aVar) {
        int i13 = i11 + i12;
        return ((i11 ^ i13) & (i12 ^ i13)) < 0 ? aVar.invoke().intValue() : i13;
    }

    /* renamed from: distanceSquaredToClosestCornerFromOutside-3MmeM6k, reason: not valid java name */
    private static final float m1258distanceSquaredToClosestCornerFromOutside3MmeM6k(long j11, Rect rect) {
        if (SelectionManagerKt.m1485containsInclusiveUv8p0NA(rect, j11)) {
            return 0.0f;
        }
        float m2267getDistanceSquaredimpl = Offset.m2267getDistanceSquaredimpl(Offset.m2272minusMKHz9U(rect.m2303getTopLeftF1C5BW0(), j11));
        if (m2267getDistanceSquaredimpl >= Float.MAX_VALUE) {
            m2267getDistanceSquaredimpl = Float.MAX_VALUE;
        }
        float m2267getDistanceSquaredimpl2 = Offset.m2267getDistanceSquaredimpl(Offset.m2272minusMKHz9U(rect.m2304getTopRightF1C5BW0(), j11));
        if (m2267getDistanceSquaredimpl2 < m2267getDistanceSquaredimpl) {
            m2267getDistanceSquaredimpl = m2267getDistanceSquaredimpl2;
        }
        float m2267getDistanceSquaredimpl3 = Offset.m2267getDistanceSquaredimpl(Offset.m2272minusMKHz9U(rect.m2296getBottomLeftF1C5BW0(), j11));
        if (m2267getDistanceSquaredimpl3 < m2267getDistanceSquaredimpl) {
            m2267getDistanceSquaredimpl = m2267getDistanceSquaredimpl3;
        }
        float m2267getDistanceSquaredimpl4 = Offset.m2267getDistanceSquaredimpl(Offset.m2272minusMKHz9U(rect.m2297getBottomRightF1C5BW0(), j11));
        return m2267getDistanceSquaredimpl4 < m2267getDistanceSquaredimpl ? m2267getDistanceSquaredimpl4 : m2267getDistanceSquaredimpl;
    }

    /* renamed from: findClosestRect-9KIMszo, reason: not valid java name */
    public static final int m1259findClosestRect9KIMszo(long j11, @m80.k Rect rect, @m80.k Rect rect2) {
        float m1258distanceSquaredToClosestCornerFromOutside3MmeM6k = m1258distanceSquaredToClosestCornerFromOutside3MmeM6k(j11, rect);
        float m1258distanceSquaredToClosestCornerFromOutside3MmeM6k2 = m1258distanceSquaredToClosestCornerFromOutside3MmeM6k(j11, rect2);
        if (m1258distanceSquaredToClosestCornerFromOutside3MmeM6k == m1258distanceSquaredToClosestCornerFromOutside3MmeM6k2) {
            return 0;
        }
        return m1258distanceSquaredToClosestCornerFromOutside3MmeM6k < m1258distanceSquaredToClosestCornerFromOutside3MmeM6k2 ? -1 : 1;
    }

    public static final int subtractExactOrElse(int i11, int i12, @m80.k x00.a<Integer> aVar) {
        int i13 = i11 - i12;
        return ((i11 ^ i13) & (i12 ^ i11)) < 0 ? aVar.invoke().intValue() : i13;
    }
}
