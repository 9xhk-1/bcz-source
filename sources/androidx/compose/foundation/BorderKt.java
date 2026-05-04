package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadius\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n1#1,468:1\n1#2:469\n48#3:470\n53#3:473\n60#4:471\n70#4:474\n53#4,3:476\n22#5:472\n33#6:475\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n*L\n467#1:470\n467#1:473\n467#1:471\n467#1:474\n467#1:476,3\n467#1:472\n467#1:475\n*E\n"})
/* loaded from: classes.dex */
public final class BorderKt {
    @Stable
    @m80.k
    public static final Modifier border(@m80.k Modifier modifier, @m80.k BorderStroke borderStroke, @m80.k Shape shape) {
        return m248borderziNgDLE(modifier, borderStroke.m261getWidthD9Ej5fM(), borderStroke.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    @Stable
    @m80.k
    /* renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m246borderxT4_qwU(@m80.k Modifier modifier, float f11, long j11, @m80.k Shape shape) {
        return m248borderziNgDLE(modifier, f11, new SolidColor(j11, null), shape);
    }

    /* renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m247borderxT4_qwU$default(Modifier modifier, float f11, long j11, Shape shape, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m246borderxT4_qwU(modifier, f11, j11, shape);
    }

    @Stable
    @m80.k
    /* renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m248borderziNgDLE(@m80.k Modifier modifier, float f11, @m80.k Brush brush, @m80.k Shape shape) {
        return modifier.then(new BorderModifierNodeElement(f11, brush, shape, null));
    }

    private static final RoundRect createInsetRoundedRect(float f11, RoundRect roundRect) {
        return new RoundRect(f11, f11, roundRect.getWidth() - f11, roundRect.getHeight() - f11, m250shrinkKibmq7A(roundRect.m2318getTopLeftCornerRadiuskKHJgLs(), f11), m250shrinkKibmq7A(roundRect.m2319getTopRightCornerRadiuskKHJgLs(), f11), m250shrinkKibmq7A(roundRect.m2317getBottomRightCornerRadiuskKHJgLs(), f11), m250shrinkKibmq7A(roundRect.m2316getBottomLeftCornerRadiuskKHJgLs(), f11), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path createRoundRectPath(Path path, RoundRect roundRect, float f11, boolean z11) {
        path.reset();
        Path.addRoundRect$default(path, roundRect, null, 2, null);
        if (!z11) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect$default(Path, createInsetRoundedRect(f11, roundRect), null, 2, null);
            path.mo2401opN5in7k0(path, Path, PathOperation.Companion.m2801getDifferenceb3I0S0c());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new l<ContentDrawScope, g2>() { // from class: androidx.compose.foundation.BorderKt$drawContentWithoutBorder$1
            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final DrawResult m249drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j11, long j12, boolean z11, float f11) {
        final long m2284getZeroF1C5BW0 = z11 ? Offset.Companion.m2284getZeroF1C5BW0() : j11;
        final long m2129getSizeNHjbRc = z11 ? cacheDrawScope.m2129getSizeNHjbRc() : j12;
        final DrawStyle stroke = z11 ? Fill.INSTANCE : new Stroke(f11, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new l<ContentDrawScope, g2>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m3053drawRectAsUm42w$default(contentDrawScope, Brush.this, m2284getZeroF1C5BW0, m2129getSizeNHjbRc, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m250shrinkKibmq7A(long j11, float f11) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j11 >> 32)) - f11);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j11 & 4294967295L)) - f11);
        return CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L));
    }
}
