package androidx.compose.ui.platform;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class InspectionModeKt {

    @m80.k
    private static final ProvidableCompositionLocal<Boolean> LocalInspectionMode = CompositionLocalKt.staticCompositionLocalOf(new x00.a<Boolean>() { // from class: androidx.compose.ui.platform.InspectionModeKt$LocalInspectionMode$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    @m80.k
    public static final ProvidableCompositionLocal<Boolean> getLocalInspectionMode() {
        return LocalInspectionMode;
    }
}
