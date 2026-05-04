package t;

import android.hardware.Camera;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f89089a = "OpenCameraInterface";

    public static Camera a() {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            qb.c.q(f89089a, "No cameras!", new Object[0]);
            return null;
        }
        int i11 = 0;
        while (i11 < numberOfCameras) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i11, cameraInfo);
            if (cameraInfo.facing == 0) {
                break;
            }
            i11++;
        }
        if (i11 >= numberOfCameras) {
            qb.c.i(f89089a, "No camera facing back; returning camera #0", new Object[0]);
            return Camera.open(0);
        }
        qb.c.i(f89089a, "Opening camera #" + i11, new Object[0]);
        return Camera.open(i11);
    }
}
