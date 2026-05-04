package androidx.camera.extensions;

import android.content.Context;
import android.util.Range;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.extensions.impl.InitializerImpl;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.Version;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.p1;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ExtensionsManager {
    private static final Object EXTENSIONS_LOCK = new Object();
    private static final String TAG = "ExtensionsManager";

    @GuardedBy("EXTENSIONS_LOCK")
    private static p1<Void> sDeinitializeFuture;

    @GuardedBy("EXTENSIONS_LOCK")
    private static ExtensionsManager sExtensionsManager;

    @GuardedBy("EXTENSIONS_LOCK")
    private static p1<ExtensionsManager> sInitializeFuture;
    private final ExtensionsAvailability mExtensionsAvailability;
    private final ExtensionsInfo mExtensionsInfo;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    private ExtensionsManager(@NonNull ExtensionsAvailability extensionsAvailability, @NonNull CameraProvider cameraProvider) {
        this.mExtensionsAvailability = extensionsAvailability;
        this.mExtensionsInfo = new ExtensionsInfo(cameraProvider);
    }

    @NonNull
    public static p1<ExtensionsManager> getInstanceAsync(@NonNull Context context, @NonNull CameraProvider cameraProvider) {
        return getInstanceAsync(context, cameraProvider, ClientVersion.getCurrentVersion());
    }

    public static ExtensionsManager getOrCreateExtensionsManager(@NonNull ExtensionsAvailability extensionsAvailability, @NonNull CameraProvider cameraProvider) {
        synchronized (EXTENSIONS_LOCK) {
            try {
                ExtensionsManager extensionsManager = sExtensionsManager;
                if (extensionsManager != null) {
                    return extensionsManager;
                }
                ExtensionsManager extensionsManager2 = new ExtensionsManager(extensionsAvailability, cameraProvider);
                sExtensionsManager = extensionsManager2;
                return extensionsManager2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getInstanceAsync$0(ClientVersion clientVersion, Context context, final CameraProvider cameraProvider, final CallbackToFutureAdapter.Completer completer) throws Exception {
        try {
            InitializerImpl.init(clientVersion.toVersionString(), ContextUtil.getApplicationContext(context), new InitializerImpl.OnExtensionsInitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.1
                public void onFailure(int i11) {
                    Logger.e(ExtensionsManager.TAG, "Failed to initialize extensions");
                    CallbackToFutureAdapter.Completer.this.set(ExtensionsManager.getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cameraProvider));
                }

                public void onSuccess() {
                    Logger.d(ExtensionsManager.TAG, "Successfully initialized extensions");
                    CallbackToFutureAdapter.Completer.this.set(ExtensionsManager.getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_AVAILABLE, cameraProvider));
                }
            }, CameraXExecutors.directExecutor());
            return "Initialize extensions";
        } catch (AbstractMethodError e11) {
            e = e11;
            Logger.e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            completer.set(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider));
            return "Initialize extensions";
        } catch (NoClassDefFoundError e12) {
            e = e12;
            Logger.e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            completer.set(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider));
            return "Initialize extensions";
        } catch (NoSuchMethodError e13) {
            e = e13;
            Logger.e(TAG, "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            completer.set(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, cameraProvider));
            return "Initialize extensions";
        } catch (RuntimeException e14) {
            Logger.e(TAG, "Failed to initialize extensions. Something wents wrong when initializing the vendor library. " + e14);
            completer.set(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, cameraProvider));
            return "Initialize extensions";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$shutdown$1(final CallbackToFutureAdapter.Completer completer) throws Exception {
        try {
            InitializerImpl.deinit(new InitializerImpl.OnExtensionsDeinitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager.2
                public void onFailure(int i11) {
                    completer.setException(new Exception("Failed to deinitialize extensions."));
                }

                public void onSuccess() {
                    completer.set(null);
                }
            }, CameraXExecutors.directExecutor());
            return null;
        } catch (NoClassDefFoundError | NoSuchMethodError e11) {
            completer.setException(e11);
            return null;
        }
    }

    @Nullable
    public CameraExtensionsControl getCameraExtensionsControl(@NonNull CameraControl cameraControl) {
        return CameraExtensionsControls.from(cameraControl);
    }

    @NonNull
    public CameraExtensionsInfo getCameraExtensionsInfo(@NonNull CameraInfo cameraInfo) {
        return CameraExtensionsInfos.from(cameraInfo);
    }

    @Nullable
    public Range<Long> getEstimatedCaptureLatencyRange(@NonNull CameraSelector cameraSelector, int i11) {
        if (i11 == 0 || this.mExtensionsAvailability != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return null;
        }
        return this.mExtensionsInfo.getEstimatedCaptureLatencyRange(cameraSelector, i11, null);
    }

    @NonNull
    public CameraSelector getExtensionEnabledCameraSelector(@NonNull CameraSelector cameraSelector, int i11) {
        if (i11 == 0) {
            return cameraSelector;
        }
        if (this.mExtensionsAvailability == ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return this.mExtensionsInfo.getExtensionCameraSelectorAndInjectCameraConfig(cameraSelector, i11);
        }
        throw new IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
    }

    @NonNull
    @VisibleForTesting
    public ExtensionsAvailability getExtensionsAvailability() {
        return this.mExtensionsAvailability;
    }

    public boolean isExtensionAvailable(@NonNull CameraSelector cameraSelector, int i11) {
        if (i11 == 0) {
            return true;
        }
        if (this.mExtensionsAvailability != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.mExtensionsInfo.isExtensionAvailable(cameraSelector, i11);
    }

    public boolean isImageAnalysisSupported(@NonNull CameraSelector cameraSelector, int i11) {
        if (i11 == 0) {
            return true;
        }
        if (this.mExtensionsAvailability != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.mExtensionsInfo.isImageAnalysisSupported(cameraSelector, i11);
    }

    @VisibleForTesting
    public void setVendorExtenderFactory(VendorExtenderFactory vendorExtenderFactory) {
        this.mExtensionsInfo.setVendorExtenderFactory(vendorExtenderFactory);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public p1<Void> shutdown() {
        synchronized (EXTENSIONS_LOCK) {
            try {
                if (ExtensionVersion.getRuntimeVersion() == null) {
                    sInitializeFuture = null;
                    sExtensionsManager = null;
                    ExtensionVersion.injectInstance(null);
                    return Futures.immediateFuture(null);
                }
                ExtensionVersion.injectInstance(null);
                p1<ExtensionsManager> p1Var = sInitializeFuture;
                if (p1Var == null) {
                    return Futures.immediateFuture(null);
                }
                p1<Void> p1Var2 = sDeinitializeFuture;
                if (p1Var2 != null) {
                    return p1Var2;
                }
                try {
                    p1Var.get();
                    sInitializeFuture = null;
                    ExtensionsAvailability extensionsAvailability = sExtensionsManager.mExtensionsAvailability;
                    sExtensionsManager = null;
                    if (extensionsAvailability == ExtensionsAvailability.LIBRARY_AVAILABLE) {
                        ExtendedCameraConfigProviderStore.clear();
                        sDeinitializeFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.extensions.c
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                Object lambda$shutdown$1;
                                lambda$shutdown$1 = ExtensionsManager.this.lambda$shutdown$1(completer);
                                return lambda$shutdown$1;
                            }
                        });
                    } else {
                        sDeinitializeFuture = Futures.immediateFuture(null);
                    }
                    return sDeinitializeFuture;
                } catch (InterruptedException e11) {
                    e = e11;
                    p1<Void> immediateFailedFuture = Futures.immediateFailedFuture(e);
                    sDeinitializeFuture = immediateFailedFuture;
                    return immediateFailedFuture;
                } catch (ExecutionException e12) {
                    e = e12;
                    p1<Void> immediateFailedFuture2 = Futures.immediateFailedFuture(e);
                    sDeinitializeFuture = immediateFailedFuture2;
                    return immediateFailedFuture2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public static p1<ExtensionsManager> getInstanceAsync(@NonNull Context context, @NonNull CameraProvider cameraProvider, @NonNull String str) {
        ClientVersion clientVersion = new ClientVersion(str);
        ClientVersion.setCurrentVersion(clientVersion);
        return getInstanceAsync(context, cameraProvider, clientVersion);
    }

    @NonNull
    public static p1<ExtensionsManager> getInstanceAsync(@NonNull final Context context, @NonNull final CameraProvider cameraProvider, @NonNull final ClientVersion clientVersion) {
        synchronized (EXTENSIONS_LOCK) {
            try {
                p1<Void> p1Var = sDeinitializeFuture;
                if (p1Var != null && !p1Var.isDone()) {
                    throw new IllegalStateException("Not yet done deinitializing extensions");
                }
                sDeinitializeFuture = null;
                if (ExtensionVersion.getRuntimeVersion() == null) {
                    return Futures.immediateFuture(getOrCreateExtensionsManager(ExtensionsAvailability.NONE, cameraProvider));
                }
                Version version = Version.VERSION_1_0;
                if (!ClientVersion.isMaximumCompatibleVersion(version) && !ExtensionVersion.isMaximumCompatibleVersion(version)) {
                    if (sInitializeFuture == null) {
                        sInitializeFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.extensions.d
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                Object lambda$getInstanceAsync$0;
                                lambda$getInstanceAsync$0 = ExtensionsManager.lambda$getInstanceAsync$0(ClientVersion.this, context, cameraProvider, completer);
                                return lambda$getInstanceAsync$0;
                            }
                        });
                    }
                    return sInitializeFuture;
                }
                return Futures.immediateFuture(getOrCreateExtensionsManager(ExtensionsAvailability.LIBRARY_AVAILABLE, cameraProvider));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
