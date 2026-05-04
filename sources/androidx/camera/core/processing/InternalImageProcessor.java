package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraEffect;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessor;
import androidx.camera.core.ProcessingException;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class InternalImageProcessor {

    @NonNull
    private final Consumer<Throwable> mErrorListener;

    @NonNull
    private final Executor mExecutor;

    @NonNull
    private final ImageProcessor mImageProcessor;

    public InternalImageProcessor(@NonNull CameraEffect cameraEffect) {
        Preconditions.checkArgument(cameraEffect.getTargets() == 4);
        this.mExecutor = cameraEffect.getExecutor();
        ImageProcessor imageProcessor = cameraEffect.getImageProcessor();
        Objects.requireNonNull(imageProcessor);
        this.mImageProcessor = imageProcessor;
        this.mErrorListener = cameraEffect.getErrorListener();
    }

    public static /* synthetic */ Object a(final InternalImageProcessor internalImageProcessor, final ImageProcessor.Request request, final CallbackToFutureAdapter.Completer completer) {
        internalImageProcessor.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.processing.q
            @Override // java.lang.Runnable
            public final void run() {
                InternalImageProcessor.b(InternalImageProcessor.this, request, completer);
            }
        });
        return "InternalImageProcessor#process " + request.hashCode();
    }

    public static /* synthetic */ void b(InternalImageProcessor internalImageProcessor, ImageProcessor.Request request, CallbackToFutureAdapter.Completer completer) {
        internalImageProcessor.getClass();
        try {
            completer.set(internalImageProcessor.mImageProcessor.process(request));
        } catch (ProcessingException e11) {
            internalImageProcessor.mErrorListener.accept(e11);
            completer.setException(e11);
        }
    }

    @NonNull
    public ImageProcessor.Response safeProcess(@NonNull final ImageProcessor.Request request) throws ImageCaptureException {
        try {
            return (ImageProcessor.Response) CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.r
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return InternalImageProcessor.a(InternalImageProcessor.this, request, completer);
                }
            }).get();
        } catch (Exception e11) {
            e = e11;
            if (e.getCause() != null) {
                e = e.getCause();
            }
            throw new ImageCaptureException(0, "Failed to invoke ImageProcessor.", e);
        }
    }
}
