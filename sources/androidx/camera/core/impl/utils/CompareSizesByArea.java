package androidx.camera.core.impl.utils;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CompareSizesByArea implements Comparator<Size> {
    private boolean mReverse;

    public CompareSizesByArea() {
        this(false);
    }

    public CompareSizesByArea(boolean z11) {
        this.mReverse = z11;
    }

    @Override // java.util.Comparator
    public int compare(@NonNull Size size, @NonNull Size size2) {
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.mReverse ? signum * (-1) : signum;
    }
}
