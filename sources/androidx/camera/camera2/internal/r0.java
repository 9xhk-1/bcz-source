package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final /* synthetic */ class r0 implements CameraCharacteristicsProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CameraCharacteristicsCompat f3423a;

    @Override // androidx.camera.camera2.internal.compat.workaround.CameraCharacteristicsProvider
    public final Object get(CameraCharacteristics.Key key) {
        return this.f3423a.get(key);
    }
}
