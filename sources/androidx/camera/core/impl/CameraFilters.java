package androidx.camera.core.impl;

import androidx.camera.core.CameraFilter;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class CameraFilters {
    public static final CameraFilter ANY = new CameraFilter() { // from class: androidx.camera.core.impl.b
        @Override // androidx.camera.core.CameraFilter
        public final List filter(List list) {
            return CameraFilters.a(list);
        }
    };
    public static final CameraFilter NONE = new CameraFilter() { // from class: androidx.camera.core.impl.c
        @Override // androidx.camera.core.CameraFilter
        public final List filter(List list) {
            List list2;
            list2 = Collections.EMPTY_LIST;
            return list2;
        }
    };

    private CameraFilters() {
    }

    public static /* synthetic */ List a(List list) {
        return list;
    }
}
