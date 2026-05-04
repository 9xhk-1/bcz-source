package androidx.camera.core.resolutionselector;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ResolutionFilter {
    @NonNull
    List<Size> filter(@NonNull List<Size> list, int i11);
}
