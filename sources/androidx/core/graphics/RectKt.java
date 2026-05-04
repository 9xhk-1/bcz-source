package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,365:1\n344#1,3:366\n344#1,3:369\n257#1,6:372\n122#1,3:378\n132#1,3:381\n344#1,3:384\n344#1,3:387\n344#1,3:390\n1#2:393\n*S KotlinDebug\n*F\n+ 1 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n191#1:366,3\n192#1:369,3\n251#1:372,6\n268#1:378,3\n273#1:381,3\n313#1:384,3\n314#1:387,3\n358#1:390,3\n*E\n"})
/* loaded from: classes2.dex */
public final class RectKt {
    @SuppressLint({"CheckResult"})
    @m80.k
    public static final Rect and(@m80.k Rect rect, @m80.k Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        return rect3;
    }

    public static final int component1(@m80.k Rect rect) {
        return rect.left;
    }

    public static final int component2(@m80.k Rect rect) {
        return rect.top;
    }

    public static final int component3(@m80.k Rect rect) {
        return rect.right;
    }

    public static final int component4(@m80.k Rect rect) {
        return rect.bottom;
    }

    public static final boolean contains(@m80.k Rect rect, @m80.k Point point) {
        return rect.contains(point.x, point.y);
    }

    @m80.k
    public static final Region minus(@m80.k Rect rect, @m80.k Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @m80.k
    public static final Rect or(@m80.k Rect rect, @m80.k Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @m80.k
    public static final Rect plus(@m80.k Rect rect, @m80.k Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.union(rect2);
        return rect3;
    }

    @m80.k
    public static final Rect times(@m80.k Rect rect, int i11) {
        Rect rect2 = new Rect(rect);
        rect2.top *= i11;
        rect2.left *= i11;
        rect2.right *= i11;
        rect2.bottom *= i11;
        return rect2;
    }

    @m80.k
    public static final Rect toRect(@m80.k RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return rect;
    }

    @m80.k
    public static final RectF toRectF(@m80.k Rect rect) {
        return new RectF(rect);
    }

    @m80.k
    public static final Region toRegion(@m80.k Rect rect) {
        return new Region(rect);
    }

    @m80.k
    public static final RectF transform(@m80.k RectF rectF, @m80.k Matrix matrix) {
        matrix.mapRect(rectF);
        return rectF;
    }

    @m80.k
    public static final Region xor(@m80.k Rect rect, @m80.k Rect rect2) {
        Region region = new Region(rect);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    public static final float component1(@m80.k RectF rectF) {
        return rectF.left;
    }

    public static final float component2(@m80.k RectF rectF) {
        return rectF.top;
    }

    public static final float component3(@m80.k RectF rectF) {
        return rectF.right;
    }

    public static final float component4(@m80.k RectF rectF) {
        return rectF.bottom;
    }

    public static final boolean contains(@m80.k RectF rectF, @m80.k PointF pointF) {
        return rectF.contains(pointF.x, pointF.y);
    }

    @m80.k
    public static final Region toRegion(@m80.k RectF rectF) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        return new Region(rect);
    }

    @SuppressLint({"CheckResult"})
    @m80.k
    public static final RectF and(@m80.k RectF rectF, @m80.k RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.intersect(rectF2);
        return rectF3;
    }

    @m80.k
    public static final Region minus(@m80.k RectF rectF, @m80.k RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.DIFFERENCE);
        return region;
    }

    @m80.k
    public static final RectF or(@m80.k RectF rectF, @m80.k RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @m80.k
    public static final RectF plus(@m80.k RectF rectF, @m80.k RectF rectF2) {
        RectF rectF3 = new RectF(rectF);
        rectF3.union(rectF2);
        return rectF3;
    }

    @m80.k
    public static final Region xor(@m80.k RectF rectF, @m80.k RectF rectF2) {
        Rect rect = new Rect();
        rectF.roundOut(rect);
        Region region = new Region(rect);
        Rect rect2 = new Rect();
        rectF2.roundOut(rect2);
        region.op(rect2, Region.Op.XOR);
        return region;
    }

    @m80.k
    public static final Rect plus(@m80.k Rect rect, int i11) {
        Rect rect2 = new Rect(rect);
        rect2.offset(i11, i11);
        return rect2;
    }

    @m80.k
    public static final RectF times(@m80.k RectF rectF, float f11) {
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f11;
        rectF2.left *= f11;
        rectF2.right *= f11;
        rectF2.bottom *= f11;
        return rectF2;
    }

    @m80.k
    public static final RectF plus(@m80.k RectF rectF, float f11) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(f11, f11);
        return rectF2;
    }

    @m80.k
    public static final Rect plus(@m80.k Rect rect, @m80.k Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(point.x, point.y);
        return rect2;
    }

    @m80.k
    public static final Rect minus(@m80.k Rect rect, int i11) {
        Rect rect2 = new Rect(rect);
        int i12 = -i11;
        rect2.offset(i12, i12);
        return rect2;
    }

    @m80.k
    public static final RectF plus(@m80.k RectF rectF, @m80.k PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(pointF.x, pointF.y);
        return rectF2;
    }

    @m80.k
    public static final RectF times(@m80.k RectF rectF, int i11) {
        float f11 = i11;
        RectF rectF2 = new RectF(rectF);
        rectF2.top *= f11;
        rectF2.left *= f11;
        rectF2.right *= f11;
        rectF2.bottom *= f11;
        return rectF2;
    }

    @m80.k
    public static final RectF minus(@m80.k RectF rectF, float f11) {
        RectF rectF2 = new RectF(rectF);
        float f12 = -f11;
        rectF2.offset(f12, f12);
        return rectF2;
    }

    @m80.k
    public static final Rect minus(@m80.k Rect rect, @m80.k Point point) {
        Rect rect2 = new Rect(rect);
        rect2.offset(-point.x, -point.y);
        return rect2;
    }

    @m80.k
    public static final RectF minus(@m80.k RectF rectF, @m80.k PointF pointF) {
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-pointF.x, -pointF.y);
        return rectF2;
    }
}
