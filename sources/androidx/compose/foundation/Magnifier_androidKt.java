package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Magnifier_androidKt {

    @m80.k
    private static final SemanticsPropertyKey<x00.a<Offset>> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    public static final boolean equalsIncludingNaN(float f11, float f12) {
        return (Float.isNaN(f11) && Float.isNaN(f12)) || f11 == f12;
    }

    @m80.k
    public static final SemanticsPropertyKey<x00.a<Offset>> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isPlatformMagnifierSupported(int i11) {
        return i11 >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i11);
    }

    @m80.k
    /* renamed from: magnifier-UpNRX3w, reason: not valid java name */
    public static final Modifier m303magnifierUpNRX3w(@m80.k Modifier modifier, @m80.k l<? super Density, Offset> lVar, @m80.l l<? super Density, Offset> lVar2, @m80.l l<? super DpSize, g2> lVar3, float f11, long j11, float f12, float f13, boolean z11) {
        return m306magnifierjPUL71Q$default(modifier, lVar, lVar2, lVar3, f11, false, j11, f12, f13, z11, null, 512, null);
    }

    /* renamed from: magnifier-UpNRX3w$default, reason: not valid java name */
    public static /* synthetic */ Modifier m304magnifierUpNRX3w$default(Modifier modifier, l lVar, l lVar2, l lVar3, float f11, long j11, float f12, float f13, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar2 = null;
        }
        if ((i11 & 4) != 0) {
            lVar3 = null;
        }
        if ((i11 & 8) != 0) {
            f11 = Float.NaN;
        }
        if ((i11 & 16) != 0) {
            j11 = DpSize.Companion.m5222getUnspecifiedMYxV2XQ();
        }
        if ((i11 & 32) != 0) {
            f12 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 64) != 0) {
            f13 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 128) != 0) {
            z11 = true;
        }
        return m303magnifierUpNRX3w(modifier, lVar, lVar2, lVar3, f11, j11, f12, f13, z11);
    }

    @m80.k
    /* renamed from: magnifier-jPUL71Q, reason: not valid java name */
    public static final Modifier m305magnifierjPUL71Q(@m80.k Modifier modifier, @m80.k l<? super Density, Offset> lVar, @m80.l l<? super Density, Offset> lVar2, @m80.l l<? super DpSize, g2> lVar3, float f11, boolean z11, long j11, float f12, float f13, boolean z12, @m80.l PlatformMagnifierFactory platformMagnifierFactory) {
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            return modifier.then(new MagnifierElement(lVar, lVar2, lVar3, f11, z11, j11, f12, f13, z12, platformMagnifierFactory == null ? PlatformMagnifierFactory.Companion.getForCurrentPlatform() : platformMagnifierFactory, null));
        }
        return modifier;
    }

    /* renamed from: magnifier-jPUL71Q$default, reason: not valid java name */
    public static /* synthetic */ Modifier m306magnifierjPUL71Q$default(Modifier modifier, l lVar, l lVar2, l lVar3, float f11, boolean z11, long j11, float f12, float f13, boolean z12, PlatformMagnifierFactory platformMagnifierFactory, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar2 = null;
        }
        if ((i11 & 4) != 0) {
            lVar3 = null;
        }
        if ((i11 & 8) != 0) {
            f11 = Float.NaN;
        }
        if ((i11 & 16) != 0) {
            z11 = false;
        }
        if ((i11 & 32) != 0) {
            j11 = DpSize.Companion.m5222getUnspecifiedMYxV2XQ();
        }
        if ((i11 & 64) != 0) {
            f12 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 128) != 0) {
            f13 = Dp.Companion.m5135getUnspecifiedD9Ej5fM();
        }
        if ((i11 & 256) != 0) {
            z12 = true;
        }
        if ((i11 & 512) != 0) {
            platformMagnifierFactory = null;
        }
        return m305magnifierjPUL71Q(modifier, lVar, lVar2, lVar3, f11, z11, j11, f12, f13, z12, platformMagnifierFactory);
    }
}
