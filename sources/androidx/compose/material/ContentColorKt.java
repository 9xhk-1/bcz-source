package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ContentColorKt {

    @k
    private static final ProvidableCompositionLocal<Color> LocalContentColor = CompositionLocalKt.compositionLocalOf$default(null, new a<Color>() { // from class: androidx.compose.material.ContentColorKt$LocalContentColor$1
        @Override // x00.a
        public /* bridge */ /* synthetic */ Color invoke() {
            return Color.m2499boximpl(m1640invoke0d7_KjU());
        }

        /* renamed from: invoke-0d7_KjU, reason: not valid java name */
        public final long m1640invoke0d7_KjU() {
            return Color.Companion.m2535getBlack0d7_KjU();
        }
    }, 1, null);

    @k
    public static final ProvidableCompositionLocal<Color> getLocalContentColor() {
        return LocalContentColor;
    }
}
