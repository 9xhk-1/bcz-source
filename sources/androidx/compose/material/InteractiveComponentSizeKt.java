package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,177:1\n149#2:178\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/InteractiveComponentSizeKt\n*L\n176#1:178\n*E\n"})
/* loaded from: classes.dex */
public final class InteractiveComponentSizeKt {

    @k
    private static final ProvidableCompositionLocal<Boolean> LocalMinimumInteractiveComponentEnforcement;

    @k
    private static final ProvidableCompositionLocal<Boolean> LocalMinimumTouchTargetEnforcement;
    private static final long minimumInteractiveComponentSize;

    static {
        ProvidableCompositionLocal<Boolean> staticCompositionLocalOf = CompositionLocalKt.staticCompositionLocalOf(new a<Boolean>() { // from class: androidx.compose.material.InteractiveComponentSizeKt$LocalMinimumInteractiveComponentEnforcement$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        });
        LocalMinimumInteractiveComponentEnforcement = staticCompositionLocalOf;
        LocalMinimumTouchTargetEnforcement = staticCompositionLocalOf;
        float f11 = 48;
        minimumInteractiveComponentSize = DpKt.m5137DpSizeYgX7TsA(Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11));
    }

    @ExperimentalMaterialApi
    @k
    public static final ProvidableCompositionLocal<Boolean> getLocalMinimumInteractiveComponentEnforcement() {
        return LocalMinimumInteractiveComponentEnforcement;
    }

    @ExperimentalMaterialApi
    @k
    public static final ProvidableCompositionLocal<Boolean> getLocalMinimumTouchTargetEnforcement() {
        return LocalMinimumTouchTargetEnforcement;
    }

    @k
    public static final Modifier minimumInteractiveComponentSize(@k Modifier modifier) {
        return modifier.then(MinimumInteractiveModifier.INSTANCE);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getLocalMinimumInteractiveComponentEnforcement$annotations() {
    }

    @n(level = DeprecationLevel.WARNING, message = "Use LocalMinimumInteractiveComponentEnforcement instead.", replaceWith = @w0(expression = "LocalMinimumInteractiveComponentEnforcement", imports = {}))
    @ExperimentalMaterialApi
    public static /* synthetic */ void getLocalMinimumTouchTargetEnforcement$annotations() {
    }
}
