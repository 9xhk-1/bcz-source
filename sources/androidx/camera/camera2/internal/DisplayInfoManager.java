package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Size;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.workaround.DisplaySizeCorrector;
import androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize;
import androidx.camera.core.internal.utils.SizeUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class DisplayInfoManager {
    private static volatile DisplayInfoManager sInstance;

    @NonNull
    private final DisplayManager mDisplayManager;
    private static final Size MAX_PREVIEW_SIZE = new Size(1920, pd.a.f80340j);
    private static final Size ABNORMAL_DISPLAY_SIZE_THRESHOLD = new Size(MediaSessionCompat.K, 240);
    private static final Size FALLBACK_DISPLAY_SIZE = new Size(640, 480);
    private static final Object INSTANCE_LOCK = new Object();
    private volatile Size mPreviewSize = null;
    private final MaxPreviewSize mMaxPreviewSize = new MaxPreviewSize();
    private final DisplaySizeCorrector mDisplaySizeCorrector = new DisplaySizeCorrector();

    private DisplayInfoManager(@NonNull Context context) {
        this.mDisplayManager = (DisplayManager) context.getSystemService(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL);
    }

    private Size calculatePreviewSize() {
        Size correctedDisplaySize = getCorrectedDisplaySize();
        int width = correctedDisplaySize.getWidth() * correctedDisplaySize.getHeight();
        Size size = MAX_PREVIEW_SIZE;
        if (width > size.getWidth() * size.getHeight()) {
            correctedDisplaySize = size;
        }
        return this.mMaxPreviewSize.getMaxPreviewResolution(correctedDisplaySize);
    }

    @NonNull
    private Size getCorrectedDisplaySize() {
        Point point = new Point();
        getMaxSizeDisplay(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        if (SizeUtil.isSmallerByArea(size, ABNORMAL_DISPLAY_SIZE_THRESHOLD) && (size = this.mDisplaySizeCorrector.getDisplaySize()) == null) {
            size = FALLBACK_DISPLAY_SIZE;
        }
        return size.getHeight() > size.getWidth() ? new Size(size.getHeight(), size.getWidth()) : size;
    }

    @NonNull
    public static DisplayInfoManager getInstance(@NonNull Context context) {
        if (sInstance == null) {
            synchronized (INSTANCE_LOCK) {
                try {
                    if (sInstance == null) {
                        sInstance = new DisplayInfoManager(context);
                    }
                } finally {
                }
            }
        }
        return sInstance;
    }

    @Nullable
    private Display getMaxSizeDisplayInternal(@NonNull Display[] displayArr, boolean z11) {
        Display display = null;
        int i11 = -1;
        for (Display display2 : displayArr) {
            if (!z11 || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i12 = point.x;
                int i13 = point.y;
                if (i12 * i13 > i11) {
                    display = display2;
                    i11 = i12 * i13;
                }
            }
        }
        return display;
    }

    @VisibleForTesting
    public static void releaseInstance() {
        sInstance = null;
    }

    @NonNull
    public Display getMaxSizeDisplay(boolean z11) {
        Display[] displays = this.mDisplayManager.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display maxSizeDisplayInternal = getMaxSizeDisplayInternal(displays, z11);
        if (maxSizeDisplayInternal == null && z11) {
            maxSizeDisplayInternal = getMaxSizeDisplayInternal(displays, false);
        }
        if (maxSizeDisplayInternal != null) {
            return maxSizeDisplayInternal;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    @NonNull
    public Size getPreviewSize() {
        if (this.mPreviewSize != null) {
            return this.mPreviewSize;
        }
        this.mPreviewSize = calculatePreviewSize();
        return this.mPreviewSize;
    }

    public void refresh() {
        this.mPreviewSize = calculatePreviewSize();
    }
}
