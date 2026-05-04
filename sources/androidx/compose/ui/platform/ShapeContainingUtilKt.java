package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nShapeContainingUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShapeContainingUtil.kt\nandroidx/compose/ui/platform/ShapeContainingUtilKt\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,160:1\n48#2:161\n53#2:164\n48#2:167\n53#2:170\n48#2:173\n53#2:176\n53#2:179\n48#2:182\n48#2:185\n48#2:188\n53#2:191\n53#2:194\n48#2:197\n53#2:200\n60#3:162\n70#3:165\n60#3:168\n70#3:171\n60#3:174\n70#3:177\n70#3:180\n60#3:183\n60#3:186\n60#3:189\n70#3:192\n70#3:195\n60#3:198\n70#3:201\n22#4:163\n22#4:166\n22#4:169\n22#4:172\n22#4:175\n22#4:178\n22#4:181\n22#4:184\n22#4:187\n22#4:190\n22#4:193\n22#4:196\n22#4:199\n22#4:202\n*S KotlinDebug\n*F\n+ 1 ShapeContainingUtil.kt\nandroidx/compose/ui/platform/ShapeContainingUtilKt\n*L\n76#1:161\n77#1:164\n79#1:167\n80#1:170\n82#1:173\n83#1:176\n85#1:179\n86#1:182\n110#1:185\n111#1:188\n112#1:191\n113#1:194\n129#1:197\n130#1:200\n76#1:162\n77#1:165\n79#1:168\n80#1:171\n82#1:174\n83#1:177\n85#1:180\n86#1:183\n110#1:186\n111#1:189\n112#1:192\n113#1:195\n129#1:198\n130#1:201\n76#1:163\n77#1:166\n79#1:169\n80#1:172\n82#1:175\n83#1:178\n85#1:181\n86#1:184\n110#1:187\n111#1:190\n112#1:193\n113#1:196\n129#1:199\n130#1:202\n*E\n"})
/* loaded from: classes2.dex */
public final class ShapeContainingUtilKt {
    private static final boolean cornersFit(RoundRect roundRect) {
        return Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() >> 32)) + Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() >> 32)) <= roundRect.getWidth() && Float.intBitsToFloat((int) (roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() >> 32)) + Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() >> 32)) <= roundRect.getWidth() && Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() & 4294967295L)) + Float.intBitsToFloat((int) (roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() & 4294967295L)) <= roundRect.getHeight() && Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() & 4294967295L)) + Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() & 4294967295L)) <= roundRect.getHeight();
    }

    public static final boolean isInOutline(@m80.k Outline outline, float f11, float f12, @m80.l Path path, @m80.l Path path2) {
        if (outline instanceof Outline.Rectangle) {
            return isInRectangle(((Outline.Rectangle) outline).getRect(), f11, f12);
        }
        if (outline instanceof Outline.Rounded) {
            return isInRoundedRect((Outline.Rounded) outline, f11, f12, path, path2);
        }
        if (outline instanceof Outline.Generic) {
            return isInPath(((Outline.Generic) outline).getPath(), f11, f12, path, path2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean isInOutline$default(Outline outline, float f11, float f12, Path path, Path path2, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            path = null;
        }
        if ((i11 & 16) != 0) {
            path2 = null;
        }
        return isInOutline(outline, f11, f12, path, path2);
    }

    private static final boolean isInPath(Path path, float f11, float f12, Path path2, Path path3) {
        Rect rect = new Rect(f11 - 0.005f, f12 - 0.005f, f11 + 0.005f, f12 + 0.005f);
        if (path2 == null) {
            path2 = AndroidPath_androidKt.Path();
        }
        Path.addRect$default(path2, rect, null, 2, null);
        if (path3 == null) {
            path3 = AndroidPath_androidKt.Path();
        }
        path3.mo2401opN5in7k0(path, path2, PathOperation.Companion.m2802getIntersectb3I0S0c());
        boolean isEmpty = path3.isEmpty();
        path3.reset();
        path2.reset();
        return !isEmpty;
    }

    private static final boolean isInRectangle(Rect rect, float f11, float f12) {
        return rect.getLeft() <= f11 && f11 < rect.getRight() && rect.getTop() <= f12 && f12 < rect.getBottom();
    }

    private static final boolean isInRoundedRect(Outline.Rounded rounded, float f11, float f12, Path path, Path path2) {
        RoundRect roundRect = rounded.getRoundRect();
        if (f11 < roundRect.getLeft() || f11 >= roundRect.getRight() || f12 < roundRect.getTop() || f12 >= roundRect.getBottom()) {
            return false;
        }
        if (!cornersFit(roundRect)) {
            Path Path = path2 == null ? AndroidPath_androidKt.Path() : path2;
            Path.addRoundRect$default(Path, roundRect, null, 2, null);
            return isInPath(Path, f11, f12, path, path2);
        }
        float left = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() >> 32));
        float top = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() & 4294967295L));
        float right = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() >> 32));
        float top2 = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.m2319getTopRightCornerRadiuskKHJgLs() & 4294967295L));
        float right2 = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() >> 32));
        float bottom = roundRect.getBottom() - Float.intBitsToFloat((int) (roundRect.m2317getBottomRightCornerRadiuskKHJgLs() & 4294967295L));
        float bottom2 = roundRect.getBottom() - Float.intBitsToFloat((int) (4294967295L & roundRect.m2316getBottomLeftCornerRadiuskKHJgLs()));
        float left2 = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.m2316getBottomLeftCornerRadiuskKHJgLs() >> 32));
        if (f11 < left && f12 < top) {
            return m4300isWithinEllipseVE1yxkc(f11, f12, roundRect.m2318getTopLeftCornerRadiuskKHJgLs(), left, top);
        }
        if (f11 < left2 && f12 > bottom2) {
            return m4300isWithinEllipseVE1yxkc(f11, f12, roundRect.m2316getBottomLeftCornerRadiuskKHJgLs(), left2, bottom2);
        }
        if (f11 > right && f12 < top2) {
            return m4300isWithinEllipseVE1yxkc(f11, f12, roundRect.m2319getTopRightCornerRadiuskKHJgLs(), right, top2);
        }
        if (f11 <= right2 || f12 <= bottom) {
            return true;
        }
        return m4300isWithinEllipseVE1yxkc(f11, f12, roundRect.m2317getBottomRightCornerRadiuskKHJgLs(), right2, bottom);
    }

    /* renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m4300isWithinEllipseVE1yxkc(float f11, float f12, long j11, float f13, float f14) {
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float intBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        return ((f15 * f15) / (intBitsToFloat * intBitsToFloat)) + ((f16 * f16) / (intBitsToFloat2 * intBitsToFloat2)) <= 1.0f;
    }
}
