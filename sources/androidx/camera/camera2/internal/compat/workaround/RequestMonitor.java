package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.internal.Camera2CaptureCallbacks;
import androidx.camera.camera2.internal.compat.workaround.RequestMonitor;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class RequestMonitor {
    private static final String TAG = "RequestMonitor";
    private final boolean mQuirkEnabled;
    private final List<p1<Void>> mRequestTasks = Collections.synchronizedList(new ArrayList());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class RequestCompleteListener extends CameraCaptureSession.CaptureCallback {
        CallbackToFutureAdapter.Completer<Void> mStartRequestCompleter;

        @NonNull
        final p1<Void> mStartRequestFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.compat.workaround.d
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return RequestMonitor.RequestCompleteListener.a(RequestMonitor.RequestCompleteListener.this, completer);
            }
        });

        public static /* synthetic */ Object a(RequestCompleteListener requestCompleteListener, CallbackToFutureAdapter.Completer completer) {
            requestCompleteListener.mStartRequestCompleter = completer;
            return "RequestCompleteListener[" + requestCompleteListener + "]";
        }

        private void completeFuture() {
            CallbackToFutureAdapter.Completer<Void> completer = this.mStartRequestCompleter;
            if (completer != null) {
                completer.set(null);
                this.mStartRequestCompleter = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull TotalCaptureResult totalCaptureResult) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, @NonNull CaptureFailure captureFailure) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i11) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(@NonNull CameraCaptureSession cameraCaptureSession, int i11, long j11) {
            completeFuture();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j11, long j12) {
            completeFuture();
        }
    }

    public RequestMonitor(boolean z11) {
        this.mQuirkEnabled = z11;
    }

    public static /* synthetic */ void a(RequestMonitor requestMonitor, RequestCompleteListener requestCompleteListener, p1 p1Var) {
        requestMonitor.getClass();
        Log.d(TAG, "RequestListener " + requestCompleteListener + " done " + requestMonitor);
        requestMonitor.mRequestTasks.remove(p1Var);
    }

    public static /* synthetic */ Void b(List list) {
        return null;
    }

    @NonNull
    public CameraCaptureSession.CaptureCallback createMonitorListener(@NonNull CameraCaptureSession.CaptureCallback captureCallback) {
        return shouldMonitorRequest() ? Camera2CaptureCallbacks.createComboCallback(createMonitorListener(), captureCallback) : captureCallback;
    }

    @NonNull
    public p1<Void> getRequestsProcessedFuture() {
        return this.mRequestTasks.isEmpty() ? Futures.immediateFuture(null) : Futures.nonCancellationPropagating(Futures.transform(Futures.successfulAsList(new ArrayList(this.mRequestTasks)), new Function() { // from class: androidx.camera.camera2.internal.compat.workaround.c
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return RequestMonitor.b((List) obj);
            }
        }, CameraXExecutors.directExecutor()));
    }

    public boolean shouldMonitorRequest() {
        return this.mQuirkEnabled;
    }

    public void stop() {
        LinkedList linkedList = new LinkedList(this.mRequestTasks);
        while (!linkedList.isEmpty()) {
            p1 p1Var = (p1) linkedList.poll();
            Objects.requireNonNull(p1Var);
            p1Var.cancel(true);
        }
    }

    private CameraCaptureSession.CaptureCallback createMonitorListener() {
        final RequestCompleteListener requestCompleteListener = new RequestCompleteListener();
        final p1<Void> p1Var = requestCompleteListener.mStartRequestFuture;
        this.mRequestTasks.add(p1Var);
        Log.d(TAG, "RequestListener " + requestCompleteListener + " monitoring " + this);
        p1Var.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.compat.workaround.b
            @Override // java.lang.Runnable
            public final void run() {
                RequestMonitor.a(RequestMonitor.this, requestCompleteListener, p1Var);
            }
        }, CameraXExecutors.directExecutor());
        return requestCompleteListener;
    }
}
