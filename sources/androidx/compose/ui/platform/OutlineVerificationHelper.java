package androidx.compose.ui.platform;

import android.graphics.Outline;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Path;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(30)
@kotlin.jvm.internal.u0({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineVerificationHelper\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,322:1\n36#2,5:323\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineVerificationHelper\n*L\n319#1:323,5\n*E\n"})
/* loaded from: classes2.dex */
public final class OutlineVerificationHelper {
    public static final int $stable = 0;

    @m80.k
    public static final OutlineVerificationHelper INSTANCE = new OutlineVerificationHelper();

    private OutlineVerificationHelper() {
    }

    @DoNotInline
    public final void setPath(@m80.k Outline outline, @m80.k Path path) {
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((AndroidPath) path).getInternalPath());
    }
}
