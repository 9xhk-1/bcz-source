package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 8 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 9 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 10 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 11 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 12 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,322:1\n1#2:323\n65#3:324\n69#3:327\n65#3:329\n69#3:332\n65#3:335\n69#3:339\n65#3:347\n69#3:350\n65#3:353\n69#3:357\n65#3:404\n69#3:407\n65#3:410\n69#3:414\n60#4:325\n70#4:328\n60#4:330\n70#4:333\n60#4:336\n70#4:340\n53#4,3:344\n60#4:348\n70#4:351\n60#4:354\n70#4:358\n60#4:362\n70#4:365\n53#4,3:367\n53#4,3:377\n60#4:385\n53#4,3:388\n53#4,3:392\n60#4:405\n70#4:408\n60#4:411\n70#4:415\n60#4:419\n22#5:326\n22#5:331\n22#5:334\n22#5:337\n22#5:341\n22#5:349\n22#5:352\n22#5:355\n22#5:359\n22#5:363\n26#5:380\n26#5:381\n26#5:382\n26#5:383\n22#5:386\n26#5:395\n26#5:396\n26#5:397\n26#5:398\n22#5:406\n22#5:409\n22#5:412\n22#5:416\n22#5:420\n57#6:338\n61#6:342\n57#6:356\n61#6:360\n57#6:361\n61#6:364\n57#6:413\n61#6:417\n33#7:343\n30#8:366\n30#8:387\n56#9,6:370\n33#10:376\n33#10:391\n48#11:384\n48#11:418\n36#12,5:399\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineResolver\n*L\n166#1:324\n166#1:327\n194#1:329\n195#1:332\n196#1:335\n197#1:339\n213#1:347\n214#1:350\n215#1:353\n216#1:357\n306#1:404\n307#1:407\n308#1:410\n309#1:414\n166#1:325\n166#1:328\n194#1:330\n195#1:333\n196#1:336\n197#1:340\n198#1:344,3\n213#1:348\n214#1:351\n215#1:354\n216#1:358\n231#1:362\n231#1:365\n249#1:367,3\n250#1:377,3\n260#1:385\n261#1:388,3\n262#1:392,3\n306#1:405\n307#1:408\n308#1:411\n309#1:415\n310#1:419\n166#1:326\n194#1:331\n195#1:334\n196#1:337\n197#1:341\n213#1:349\n214#1:352\n215#1:355\n216#1:359\n231#1:363\n252#1:380\n253#1:381\n254#1:382\n255#1:383\n260#1:386\n265#1:395\n266#1:396\n267#1:397\n268#1:398\n306#1:406\n307#1:409\n308#1:412\n309#1:416\n310#1:420\n196#1:338\n197#1:342\n215#1:356\n216#1:360\n231#1:361\n231#1:364\n308#1:413\n309#1:417\n198#1:343\n249#1:366\n261#1:387\n250#1:370,6\n250#1:376\n262#1:391\n260#1:384\n310#1:418\n286#1:399,5\n*E\n"})
/* loaded from: classes2.dex */
public final class OutlineResolver {
    public static final int $stable = 8;
    private boolean cacheIsDirty;

    @m80.k
    private final Outline cachedOutline;

    @m80.l
    private Path cachedRrectPath;
    private boolean isSupportedOutline = true;

    @m80.l
    private androidx.compose.ui.graphics.Outline outline;
    private boolean outlineNeeded;

    @m80.l
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;

    @m80.l
    private Path tmpOpPath;

    @m80.l
    private Path tmpPath;

    @m80.l
    private RoundRect tmpRoundRect;

    @m80.l
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.rectTopLeft = Offset.Companion.m2284getZeroF1C5BW0();
        this.rectSize = Size.Companion.m2346getZeroNHjbRc();
    }

    /* renamed from: isSameBounds-4L21HEs, reason: not valid java name */
    private final boolean m4296isSameBounds4L21HEs(RoundRect roundRect, long j11, long j12, float f11) {
        if (roundRect != null && RoundRectKt.isSimple(roundRect)) {
            int i11 = (int) (j11 >> 32);
            if (roundRect.getLeft() == Float.intBitsToFloat(i11)) {
                int i12 = (int) (j11 & 4294967295L);
                if (roundRect.getTop() == Float.intBitsToFloat(i12) && roundRect.getRight() == Float.intBitsToFloat(i11) + Float.intBitsToFloat((int) (j12 >> 32)) && roundRect.getBottom() == Float.intBitsToFloat(i12) + Float.intBitsToFloat((int) (j12 & 4294967295L)) && Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() >> 32)) == f11) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.Companion.m2284getZeroF1C5BW0();
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            androidx.compose.ui.graphics.Outline outline = this.outline;
            if (outline == null || !this.outlineNeeded || Float.intBitsToFloat((int) (this.rectSize >> 32)) <= 0.0f || Float.intBitsToFloat((int) (this.rectSize & 4294967295L)) <= 0.0f) {
                this.cachedOutline.setEmpty();
                return;
            }
            this.isSupportedOutline = true;
            if (outline instanceof Outline.Rectangle) {
                updateCacheWithRect(((Outline.Rectangle) outline).getRect());
            } else if (outline instanceof Outline.Rounded) {
                updateCacheWithRoundRect(((Outline.Rounded) outline).getRoundRect());
            } else if (outline instanceof Outline.Generic) {
                updateCacheWithPath(((Outline.Generic) outline).getPath());
            }
        }
    }

    private final void updateCacheWithPath(Path path) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 > 28 || path.isConvex()) {
            if (i11 >= 30) {
                OutlineVerificationHelper.INSTANCE.setPath(this.cachedOutline, path);
            } else {
                android.graphics.Outline outline = this.cachedOutline;
                if (!(path instanceof AndroidPath)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outline.setConvexPath(((AndroidPath) path).getInternalPath());
            }
            this.usePathForClip = !this.cachedOutline.canClip();
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = path;
    }

    private final void updateCacheWithRect(Rect rect) {
        float left = rect.getLeft();
        float top = rect.getTop();
        this.rectTopLeft = Offset.m2260constructorimpl((Float.floatToRawIntBits(top) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
        float right = rect.getRight() - rect.getLeft();
        float bottom = rect.getBottom() - rect.getTop();
        this.rectSize = Size.m2328constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
        this.cachedOutline.setRect(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.getRight()), Math.round(rect.getBottom()));
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        float intBitsToFloat = Float.intBitsToFloat((int) (roundRect.m2318getTopLeftCornerRadiuskKHJgLs() >> 32));
        float left = roundRect.getLeft();
        float top = roundRect.getTop();
        this.rectTopLeft = Offset.m2260constructorimpl((Float.floatToRawIntBits(top) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
        float width = roundRect.getWidth();
        float height = roundRect.getHeight();
        this.rectSize = Size.m2328constructorimpl((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        if (RoundRectKt.isSimple(roundRect)) {
            this.cachedOutline.setRoundRect(Math.round(roundRect.getLeft()), Math.round(roundRect.getTop()), Math.round(roundRect.getRight()), Math.round(roundRect.getBottom()), intBitsToFloat);
            this.roundedCornerRadius = intBitsToFloat;
            return;
        }
        Path path = this.cachedRrectPath;
        if (path == null) {
            path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = path;
        }
        path.reset();
        Path.addRoundRect$default(path, roundRect, null, 2, null);
        updateCacheWithPath(path);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (m4296isSameBounds4L21HEs(r1, r18.rectTopLeft, r18.rectSize, r6) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void clipToOutline(@m80.k androidx.compose.ui.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.OutlineResolver.clipToOutline(androidx.compose.ui.graphics.Canvas):void");
    }

    @m80.l
    public final android.graphics.Outline getAndroidOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getCacheIsDirty$ui_release() {
        return this.cacheIsDirty;
    }

    @m80.l
    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    /* renamed from: isInOutline-k-4lQ0M, reason: not valid java name */
    public final boolean m4297isInOutlinek4lQ0M(long j11) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.outline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    /* renamed from: update-S_szKao, reason: not valid java name */
    public final boolean m4298updateS_szKao(@m80.l androidx.compose.ui.graphics.Outline outline, float f11, boolean z11, float f12, long j11) {
        this.cachedOutline.setAlpha(f11);
        boolean g11 = kotlin.jvm.internal.g0.g(this.outline, outline);
        boolean z12 = !g11;
        if (!g11) {
            this.outline = outline;
            this.cacheIsDirty = true;
        }
        this.rectSize = j11;
        boolean z13 = outline != null && (z11 || f12 > 0.0f);
        if (this.outlineNeeded != z13) {
            this.outlineNeeded = z13;
            this.cacheIsDirty = true;
        }
        return z12;
    }
}
