package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ShapesKt {

    @k
    private static final ProvidableCompositionLocal<Shapes> LocalShapes = CompositionLocalKt.staticCompositionLocalOf(new a<Shapes>() { // from class: androidx.compose.material.ShapesKt$LocalShapes$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Shapes invoke() {
            return new Shapes(null, null, null, 7, null);
        }
    });

    @k
    public static final ProvidableCompositionLocal<Shapes> getLocalShapes() {
        return LocalShapes;
    }
}
