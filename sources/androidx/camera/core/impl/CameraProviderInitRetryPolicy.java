package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.ExperimentalRetryPolicy;
import androidx.camera.core.Logger;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraValidator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalRetryPolicy
/* loaded from: classes.dex */
public final class CameraProviderInitRetryPolicy implements RetryPolicyInternal {
    private final RetryPolicy mDelegatePolicy;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Legacy implements RetryPolicyInternal {
        private final RetryPolicy mBasePolicy;

        public Legacy(long j11) {
            this.mBasePolicy = new CameraProviderInitRetryPolicy(j11);
        }

        @Override // androidx.camera.core.impl.RetryPolicyInternal
        @NonNull
        public RetryPolicy copy(long j11) {
            return new Legacy(j11);
        }

        @Override // androidx.camera.core.RetryPolicy
        public long getTimeoutInMillis() {
            return this.mBasePolicy.getTimeoutInMillis();
        }

        @Override // androidx.camera.core.RetryPolicy
        @NonNull
        public RetryPolicy.RetryConfig onRetryDecisionRequested(@NonNull RetryPolicy.ExecutionState executionState) {
            if (this.mBasePolicy.onRetryDecisionRequested(executionState).shouldRetry()) {
                return RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
            }
            Throwable cause = executionState.getCause();
            if (cause instanceof CameraValidator.CameraIdListIncorrectException) {
                Logger.e("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((CameraValidator.CameraIdListIncorrectException) cause).getAvailableCameraCount() > 0) {
                    return RetryPolicy.RetryConfig.COMPLETE_WITHOUT_FAILURE;
                }
            }
            return RetryPolicy.RetryConfig.NOT_RETRY;
        }
    }

    public CameraProviderInitRetryPolicy(final long j11) {
        this.mDelegatePolicy = new TimeoutRetryPolicy(j11, new RetryPolicy() { // from class: androidx.camera.core.impl.CameraProviderInitRetryPolicy.1
            @Override // androidx.camera.core.RetryPolicy
            public long getTimeoutInMillis() {
                return j11;
            }

            @Override // androidx.camera.core.RetryPolicy
            @NonNull
            public RetryPolicy.RetryConfig onRetryDecisionRequested(@NonNull RetryPolicy.ExecutionState executionState) {
                return executionState.getStatus() == 1 ? RetryPolicy.RetryConfig.NOT_RETRY : RetryPolicy.RetryConfig.DEFAULT_DELAY_RETRY;
            }
        });
    }

    @Override // androidx.camera.core.impl.RetryPolicyInternal
    @NonNull
    public RetryPolicy copy(long j11) {
        return new CameraProviderInitRetryPolicy(j11);
    }

    @Override // androidx.camera.core.RetryPolicy
    public long getTimeoutInMillis() {
        return this.mDelegatePolicy.getTimeoutInMillis();
    }

    @Override // androidx.camera.core.RetryPolicy
    @NonNull
    public RetryPolicy.RetryConfig onRetryDecisionRequested(@NonNull RetryPolicy.ExecutionState executionState) {
        return this.mDelegatePolicy.onRetryDecisionRequested(executionState);
    }
}
