package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class CameraBurstCaptureCallback extends CameraCaptureSession.CaptureCallback {
    CaptureSequenceCallback mCaptureSequenceCallback = null;
    final Map<CaptureRequest, List<CameraCaptureSession.CaptureCallback>> mCallbackMap = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface CaptureSequenceCallback {
        void onCaptureSequenceCompletedOrAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i11, boolean z11);
    }

    private List<CameraCaptureSession.CaptureCallback> getCallbacks(CaptureRequest captureRequest) {
        List<CameraCaptureSession.CaptureCallback> list = this.mCallbackMap.get(captureRequest);
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public void addCamera2Callbacks(CaptureRequest captureRequest, List<CameraCaptureSession.CaptureCallback> list) {
        List<CameraCaptureSession.CaptureCallback> list2 = this.mCallbackMap.get(captureRequest);
        if (list2 == null) {
            this.mCallbackMap.put(captureRequest, list);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        arrayList.addAll(list2);
        this.mCallbackMap.put(captureRequest, arrayList);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    @RequiresApi(api = 24)
    public void onCaptureBufferLost(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull Surface surface, long j11) {
        Iterator<CameraCaptureSession.CaptureCallback> it = getCallbacks(captureRequest).iterator();
        while (it.hasNext()) {
            ApiCompat.Api24Impl.onCaptureBufferLost(it.next(), cameraCaptureSession, captureRequest, surface, j11);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = getCallbacks(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
        Iterator<CameraCaptureSession.CaptureCallback> it = getCallbacks(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureResult captureResult) {
        Iterator<CameraCaptureSession.CaptureCallback> it = getCallbacks(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i11) {
        Iterator<List<CameraCaptureSession.CaptureCallback>> it = this.mCallbackMap.values().iterator();
        while (it.hasNext()) {
            Iterator<CameraCaptureSession.CaptureCallback> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().onCaptureSequenceAborted(cameraCaptureSession, i11);
            }
        }
        CaptureSequenceCallback captureSequenceCallback = this.mCaptureSequenceCallback;
        if (captureSequenceCallback != null) {
            captureSequenceCallback.onCaptureSequenceCompletedOrAborted(cameraCaptureSession, i11, true);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i11, long j11) {
        Iterator<List<CameraCaptureSession.CaptureCallback>> it = this.mCallbackMap.values().iterator();
        while (it.hasNext()) {
            Iterator<CameraCaptureSession.CaptureCallback> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().onCaptureSequenceCompleted(cameraCaptureSession, i11, j11);
            }
        }
        CaptureSequenceCallback captureSequenceCallback = this.mCaptureSequenceCallback;
        if (captureSequenceCallback != null) {
            captureSequenceCallback.onCaptureSequenceCompletedOrAborted(cameraCaptureSession, i11, false);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j11, long j12) {
        Iterator<CameraCaptureSession.CaptureCallback> it = getCallbacks(captureRequest).iterator();
        while (it.hasNext()) {
            it.next().onCaptureStarted(cameraCaptureSession, captureRequest, j11, j12);
        }
    }

    public void setCaptureSequenceCallback(@NonNull CaptureSequenceCallback captureSequenceCallback) {
        this.mCaptureSequenceCallback = captureSequenceCallback;
    }
}
