package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.ImageProxy;
import com.google.common.util.concurrent.p1;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ImageProxyBundle {
    @NonNull
    List<Integer> getCaptureIds();

    @NonNull
    p1<ImageProxy> getImageProxy(int i11);
}
