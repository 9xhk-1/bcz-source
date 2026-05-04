package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Path;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(30)
@u0({"SMAP\nAndroidGraphicsLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/OutlineVerificationHelper\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,1018:1\n36#2,5:1019\n*S KotlinDebug\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/OutlineVerificationHelper\n*L\n1015#1:1019,5\n*E\n"})
/* loaded from: classes.dex */
public final class OutlineVerificationHelper {

    @m80.k
    public static final OutlineVerificationHelper INSTANCE = new OutlineVerificationHelper();

    private OutlineVerificationHelper() {
    }

    public final void setPath(@m80.k Outline outline, @m80.k Path path) {
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((AndroidPath) path).getInternalPath());
    }
}
