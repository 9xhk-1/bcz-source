package androidx.camera.video.internal.compat.quirk;

import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.video.internal.encoder.VideoEncoderInfo;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class SizeCannotEncodeVideoQuirk implements Quirk {
    @NonNull
    private static Set<Size> getProblematicSizes() {
        return isMotoC() ? new HashSet(Collections.singletonList(new Size(720, 1280))) : Collections.EMPTY_SET;
    }

    private static boolean isMotoC() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto c".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isMotoC();
    }

    @NonNull
    public Rect adjustCropRectForProblematicEncodeSize(@NonNull Rect rect, int i11, @Nullable VideoEncoderInfo videoEncoderInfo) {
        Size rotateSize = TransformUtils.rotateSize(TransformUtils.rectToSize(rect), i11);
        if (!isProblematicEncodeSize(rotateSize)) {
            return rect;
        }
        int heightAlignment = videoEncoderInfo != null ? videoEncoderInfo.getHeightAlignment() / 2 : 8;
        Rect rect2 = new Rect(rect);
        if (rect.width() == rotateSize.getHeight()) {
            rect2.left += heightAlignment;
            rect2.right -= heightAlignment;
            return rect2;
        }
        rect2.top += heightAlignment;
        rect2.bottom -= heightAlignment;
        return rect2;
    }

    public boolean isProblematicEncodeSize(@NonNull Size size) {
        return getProblematicSizes().contains(size);
    }
}
