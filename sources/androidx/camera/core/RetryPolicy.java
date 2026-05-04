package androidx.camera.core;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraProviderInitRetryPolicy;
import androidx.camera.core.impl.RetryPolicyInternal;
import androidx.camera.core.impl.TimeoutRetryPolicy;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalRetryPolicy
/* loaded from: classes.dex */
public interface RetryPolicy {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final long DEFAULT_RETRY_TIMEOUT_IN_MILLIS = 6000;

    @NonNull
    public static final RetryPolicy NEVER = new RetryPolicy() { // from class: androidx.camera.core.g0
        @Override // androidx.camera.core.RetryPolicy
        public final RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
            RetryPolicy.RetryConfig retryConfig;
            retryConfig = RetryPolicy.RetryConfig.NOT_RETRY;
            return retryConfig;
        }
    };

    @NonNull
    public static final RetryPolicy DEFAULT = new CameraProviderInitRetryPolicy.Legacy(getDefaultRetryTimeoutInMillis());

    @NonNull
    public static final RetryPolicy RETRY_UNAVAILABLE_CAMERA = new CameraProviderInitRetryPolicy(getDefaultRetryTimeoutInMillis());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @ExperimentalRetryPolicy
    public static final class Builder {
        private final RetryPolicy mBasePolicy;
        private long mTimeoutInMillis;

        public Builder(@NonNull RetryPolicy retryPolicy) {
            this.mBasePolicy = retryPolicy;
            this.mTimeoutInMillis = retryPolicy.getTimeoutInMillis();
        }

        @NonNull
        public RetryPolicy build() {
            RetryPolicy retryPolicy = this.mBasePolicy;
            return retryPolicy instanceof RetryPolicyInternal ? ((RetryPolicyInternal) retryPolicy).copy(this.mTimeoutInMillis) : new TimeoutRetryPolicy(this.mTimeoutInMillis, this.mBasePolicy);
        }

        @NonNull
        public Builder setTimeoutInMillis(long j11) {
            this.mTimeoutInMillis = j11;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @ExperimentalRetryPolicy
    public interface ExecutionState {
        public static final int STATUS_CAMERA_UNAVAILABLE = 2;
        public static final int STATUS_CONFIGURATION_FAIL = 1;
        public static final int STATUS_UNKNOWN_ERROR = 0;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface Status {
        }

        @Nullable
        Throwable getCause();

        long getExecutedTimeInMillis();

        int getNumOfAttempts();

        int getStatus();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @ExperimentalRetryPolicy
    public static final class RetryConfig {
        private static final long DEFAULT_DELAY_MILLIS = 500;
        private static final long MINI_DELAY_MILLIS = 100;
        private final boolean mCompleteWithoutFailure;
        private final long mDelayInMillis;
        private final boolean mShouldRetry;

        @NonNull
        public static final RetryConfig NOT_RETRY = new RetryConfig(false, 0);

        @NonNull
        public static final RetryConfig DEFAULT_DELAY_RETRY = new RetryConfig(true);

        @NonNull
        public static final RetryConfig MINI_DELAY_RETRY = new RetryConfig(true, 100);

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static RetryConfig COMPLETE_WITHOUT_FAILURE = new RetryConfig(false, 0L, true);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @ExperimentalRetryPolicy
        public static final class Builder {
            private boolean mShouldRetry = true;
            private long mTimeoutInMillis = RetryConfig.getDefaultRetryDelayInMillis();

            @NonNull
            public RetryConfig build() {
                return new RetryConfig(this.mShouldRetry, this.mTimeoutInMillis);
            }

            @NonNull
            public Builder setRetryDelayInMillis(@IntRange(from = 100, to = 2000) long j11) {
                this.mTimeoutInMillis = j11;
                return this;
            }

            @NonNull
            public Builder setShouldRetry(boolean z11) {
                this.mShouldRetry = z11;
                return this;
            }
        }

        public static long getDefaultRetryDelayInMillis() {
            return 500L;
        }

        public long getRetryDelayInMillis() {
            return this.mDelayInMillis;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public boolean shouldCompleteWithoutFailure() {
            return this.mCompleteWithoutFailure;
        }

        public boolean shouldRetry() {
            return this.mShouldRetry;
        }

        private RetryConfig(boolean z11) {
            this(z11, getDefaultRetryDelayInMillis());
        }

        private RetryConfig(boolean z11, long j11) {
            this(z11, j11, false);
        }

        private RetryConfig(boolean z11, long j11, boolean z12) {
            this.mShouldRetry = z11;
            this.mDelayInMillis = j11;
            if (z12) {
                Preconditions.checkArgument(!z11, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.mCompleteWithoutFailure = z12;
        }
    }

    static long getDefaultRetryTimeoutInMillis() {
        return 6000L;
    }

    default long getTimeoutInMillis() {
        return 0L;
    }

    @NonNull
    RetryConfig onRetryDecisionRequested(@NonNull ExecutionState executionState);
}
