package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,146:1\n113#2:147\n113#2:148\n113#2:149\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n65#1:147\n108#1:148\n104#1:149\n*E\n"})
/* loaded from: classes.dex */
public final class ShadowKt {
    @Stable
    @k
    /* renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m2143shadows4CzXII(@k Modifier modifier, float f11, @k Shape shape, boolean z11, long j11, long j12) {
        return (Dp.m5114compareTo0680j_4(f11, Dp.m5115constructorimpl((float) 0)) > 0 || z11) ? modifier.then(new ShadowGraphicsLayerElement(f11, shape, z11, j11, j12, null)) : modifier;
    }

    /* renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2144shadows4CzXII$default(Modifier modifier, float f11, Shape shape, boolean z11, long j11, long j12, int i11, Object obj) {
        boolean z12;
        Shape rectangleShape = (i11 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        if ((i11 & 4) != 0) {
            z12 = false;
            if (Dp.m5114compareTo0680j_4(f11, Dp.m5115constructorimpl(0)) > 0) {
                z12 = true;
            }
        } else {
            z12 = z11;
        }
        return m2143shadows4CzXII(modifier, f11, rectangleShape, z12, (i11 & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j11, (i11 & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j12);
    }

    @Stable
    @n(level = DeprecationLevel.HIDDEN, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @w0(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    /* renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m2145shadowziNgDLE(Modifier modifier, float f11, Shape shape, boolean z11) {
        return m2143shadows4CzXII(modifier, f11, shape, z11, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2146shadowziNgDLE$default(Modifier modifier, float f11, Shape shape, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i11 & 4) != 0) {
            z11 = false;
            if (Dp.m5114compareTo0680j_4(f11, Dp.m5115constructorimpl(0)) > 0) {
                z11 = true;
            }
        }
        return m2145shadowziNgDLE(modifier, f11, shape, z11);
    }
}
