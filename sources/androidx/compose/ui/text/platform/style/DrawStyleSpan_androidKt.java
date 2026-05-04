package androidx.compose.ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class DrawStyleSpan_androidKt {
    @k
    /* renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    public static final Paint.Cap m4845toAndroidCapBeK7IIE(int i11) {
        StrokeCap.Companion companion = StrokeCap.Companion;
        return StrokeCap.m2858equalsimpl0(i11, companion.m2862getButtKaPHkGw()) ? Paint.Cap.BUTT : StrokeCap.m2858equalsimpl0(i11, companion.m2863getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m2858equalsimpl0(i11, companion.m2864getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    @k
    /* renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    public static final Paint.Join m4846toAndroidJoinWw9F2mQ(int i11) {
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        return StrokeJoin.m2868equalsimpl0(i11, companion.m2873getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m2868equalsimpl0(i11, companion.m2874getRoundLxFBmk8()) ? Paint.Join.ROUND : StrokeJoin.m2868equalsimpl0(i11, companion.m2872getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
