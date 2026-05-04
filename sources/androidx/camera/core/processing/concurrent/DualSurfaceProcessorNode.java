package androidx.camera.core.processing.concurrent;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.core.ProcessingException;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.Node;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.TargetUtils;
import androidx.camera.core.processing.util.OutConfig;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class DualSurfaceProcessorNode implements Node<In, Out> {
    private static final String TAG = "DualSurfaceProcessorNode";

    @Nullable
    private In mInput;

    @Nullable
    private Out mOutput;

    @NonNull
    final CameraInternal mPrimaryCameraInternal;

    @NonNull
    final CameraInternal mSecondaryCameraInternal;

    @NonNull
    final SurfaceProcessorInternal mSurfaceProcessor;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class In {
        @NonNull
        public static In of(@NonNull SurfaceEdge surfaceEdge, @NonNull SurfaceEdge surfaceEdge2, @NonNull List<DualOutConfig> list) {
            return new AutoValue_DualSurfaceProcessorNode_In(surfaceEdge, surfaceEdge2, list);
        }

        @NonNull
        public abstract List<DualOutConfig> getOutConfigs();

        @NonNull
        public abstract SurfaceEdge getPrimarySurfaceEdge();

        @NonNull
        public abstract SurfaceEdge getSecondarySurfaceEdge();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Out extends HashMap<DualOutConfig, SurfaceEdge> {
    }

    public DualSurfaceProcessorNode(@NonNull CameraInternal cameraInternal, @NonNull CameraInternal cameraInternal2, @NonNull SurfaceProcessorInternal surfaceProcessorInternal) {
        this.mPrimaryCameraInternal = cameraInternal;
        this.mSecondaryCameraInternal = cameraInternal2;
        this.mSurfaceProcessor = surfaceProcessorInternal;
    }

    public static /* synthetic */ void a(DualSurfaceProcessorNode dualSurfaceProcessorNode) {
        Out out = dualSurfaceProcessorNode.mOutput;
        if (out != null) {
            Iterator<SurfaceEdge> it = out.values().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createAndSendSurfaceOutput(@NonNull CameraInternal cameraInternal, @NonNull CameraInternal cameraInternal2, @NonNull SurfaceEdge surfaceEdge, @NonNull SurfaceEdge surfaceEdge2, Map.Entry<DualOutConfig, SurfaceEdge> entry) {
        final SurfaceEdge value = entry.getValue();
        Size resolution = surfaceEdge.getStreamSpec().getResolution();
        Rect cropRect = entry.getKey().getPrimaryOutConfig().getCropRect();
        if (!surfaceEdge.hasCameraTransform()) {
            cameraInternal = null;
        }
        SurfaceOutput.CameraInputInfo of2 = SurfaceOutput.CameraInputInfo.of(resolution, cropRect, cameraInternal, entry.getKey().getPrimaryOutConfig().getRotationDegrees(), entry.getKey().getPrimaryOutConfig().isMirroring());
        Size resolution2 = surfaceEdge2.getStreamSpec().getResolution();
        Rect cropRect2 = entry.getKey().getSecondaryOutConfig().getCropRect();
        if (!surfaceEdge2.hasCameraTransform()) {
            cameraInternal2 = null;
        }
        Futures.addCallback(value.createSurfaceOutputFuture(entry.getKey().getPrimaryOutConfig().getFormat(), of2, SurfaceOutput.CameraInputInfo.of(resolution2, cropRect2, cameraInternal2, entry.getKey().getSecondaryOutConfig().getRotationDegrees(), entry.getKey().getSecondaryOutConfig().isMirroring())), new FutureCallback<SurfaceOutput>() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th2) {
                if (value.getTargets() == 2 && (th2 instanceof CancellationException)) {
                    Logger.d(DualSurfaceProcessorNode.TAG, "Downstream VideoCapture failed to provide Surface.");
                    return;
                }
                Logger.w(DualSurfaceProcessorNode.TAG, "Downstream node failed to provide Surface. Target: " + TargetUtils.getHumanReadableName(value.getTargets()), th2);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable SurfaceOutput surfaceOutput) {
                Preconditions.checkNotNull(surfaceOutput);
                try {
                    DualSurfaceProcessorNode.this.mSurfaceProcessor.onOutputSurface(surfaceOutput);
                } catch (ProcessingException e11) {
                    Logger.e(DualSurfaceProcessorNode.TAG, "Failed to send SurfaceOutput to SurfaceProcessor.", e11);
                }
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    private void sendSurfaceOutputs(@NonNull CameraInternal cameraInternal, @NonNull CameraInternal cameraInternal2, @NonNull SurfaceEdge surfaceEdge, @NonNull SurfaceEdge surfaceEdge2, @NonNull Map<DualOutConfig, SurfaceEdge> map) {
        for (final Map.Entry<DualOutConfig, SurfaceEdge> entry : map.entrySet()) {
            final CameraInternal cameraInternal3 = cameraInternal;
            final CameraInternal cameraInternal4 = cameraInternal2;
            final SurfaceEdge surfaceEdge3 = surfaceEdge;
            final SurfaceEdge surfaceEdge4 = surfaceEdge2;
            createAndSendSurfaceOutput(cameraInternal3, cameraInternal4, surfaceEdge3, surfaceEdge4, entry);
            entry.getValue().addOnInvalidatedListener(new Runnable() { // from class: androidx.camera.core.processing.concurrent.l
                @Override // java.lang.Runnable
                public final void run() {
                    DualSurfaceProcessorNode.this.createAndSendSurfaceOutput(cameraInternal3, cameraInternal4, surfaceEdge3, surfaceEdge4, entry);
                }
            });
            cameraInternal = cameraInternal3;
            cameraInternal2 = cameraInternal4;
            surfaceEdge = surfaceEdge3;
            surfaceEdge2 = surfaceEdge4;
        }
    }

    private void sendSurfaceRequest(@NonNull CameraInternal cameraInternal, @NonNull SurfaceEdge surfaceEdge, @NonNull Map<DualOutConfig, SurfaceEdge> map, boolean z11) {
        try {
            this.mSurfaceProcessor.onInputSurface(surfaceEdge.createSurfaceRequest(cameraInternal, z11));
        } catch (ProcessingException e11) {
            Logger.e(TAG, "Failed to send SurfaceRequest to SurfaceProcessor.", e11);
        }
    }

    @NonNull
    private SurfaceEdge transformSingleOutput(@NonNull SurfaceEdge surfaceEdge, @NonNull OutConfig outConfig) {
        Rect cropRect = outConfig.getCropRect();
        int rotationDegrees = outConfig.getRotationDegrees();
        boolean isMirroring = outConfig.isMirroring();
        Matrix matrix = new Matrix();
        Preconditions.checkArgument(TransformUtils.isAspectRatioMatchingWithRoundingError(TransformUtils.getRotatedSize(cropRect, rotationDegrees), outConfig.getSize()));
        Rect sizeToRect = TransformUtils.sizeToRect(outConfig.getSize());
        return new SurfaceEdge(outConfig.getTargets(), outConfig.getFormat(), surfaceEdge.getStreamSpec().toBuilder().setResolution(outConfig.getSize()).build(), matrix, false, sizeToRect, surfaceEdge.getRotationDegrees() - rotationDegrees, -1, surfaceEdge.isMirroring() != isMirroring);
    }

    @Override // androidx.camera.core.processing.Node
    public void release() {
        this.mSurfaceProcessor.release();
        Threads.runOnMain(new Runnable() { // from class: androidx.camera.core.processing.concurrent.k
            @Override // java.lang.Runnable
            public final void run() {
                DualSurfaceProcessorNode.a(DualSurfaceProcessorNode.this);
            }
        });
    }

    @Override // androidx.camera.core.processing.Node
    @NonNull
    @MainThread
    public Out transform(@NonNull In in2) {
        Threads.checkMainThread();
        this.mInput = in2;
        this.mOutput = new Out();
        SurfaceEdge primarySurfaceEdge = this.mInput.getPrimarySurfaceEdge();
        SurfaceEdge secondarySurfaceEdge = this.mInput.getSecondarySurfaceEdge();
        for (DualOutConfig dualOutConfig : this.mInput.getOutConfigs()) {
            this.mOutput.put(dualOutConfig, transformSingleOutput(primarySurfaceEdge, dualOutConfig.getPrimaryOutConfig()));
        }
        sendSurfaceRequest(this.mPrimaryCameraInternal, primarySurfaceEdge, this.mOutput, true);
        sendSurfaceRequest(this.mSecondaryCameraInternal, secondarySurfaceEdge, this.mOutput, false);
        sendSurfaceOutputs(this.mPrimaryCameraInternal, this.mSecondaryCameraInternal, primarySurfaceEdge, secondarySurfaceEdge, this.mOutput);
        return this.mOutput;
    }
}
