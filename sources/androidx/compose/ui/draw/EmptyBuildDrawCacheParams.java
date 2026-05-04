package androidx.compose.ui.draw;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class EmptyBuildDrawCacheParams implements BuildDrawCacheParams {

    @k
    public static final EmptyBuildDrawCacheParams INSTANCE = new EmptyBuildDrawCacheParams();
    private static final long size = Size.Companion.m2345getUnspecifiedNHjbRc();

    @k
    private static final LayoutDirection layoutDirection = LayoutDirection.Ltr;

    @k
    private static final Density density = DensityKt.Density(1.0f, 1.0f);

    private EmptyBuildDrawCacheParams() {
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @k
    public Density getDensity() {
        return density;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    @k
    public LayoutDirection getLayoutDirection() {
        return layoutDirection;
    }

    @Override // androidx.compose.ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo2127getSizeNHjbRc() {
        return size;
    }
}
