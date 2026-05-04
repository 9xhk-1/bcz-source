package com.huawei.hms.support.api.client;

import com.huawei.hms.common.api.OptionalPendingResult;
import com.huawei.hms.common.api.internal.OptionalPendingResultImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class PendingResultsCreator {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DiscardedPendingResult<R extends Result> extends EmptyPendingResult {
        public DiscardedPendingResult() {
        }

        @Override // com.huawei.hms.support.api.client.EmptyPendingResult, com.huawei.hms.support.api.client.PendingResult
        public boolean isCanceled() {
            return true;
        }

        public DiscardedPendingResult(R r11) {
            setResult(r11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class InstantPendingResult<R extends Result> extends EmptyPendingResult {
        public InstantPendingResult(R r11) {
            setResult(r11);
        }

        @Override // com.huawei.hms.support.api.client.EmptyPendingResult, com.huawei.hms.support.api.client.PendingResult
        public void cancel() {
            throw new IllegalStateException("cancel() is not available.");
        }

        @Override // com.huawei.hms.support.api.client.EmptyPendingResult, com.huawei.hms.support.api.client.PendingResult
        public void setResultCallback(ResultCallback resultCallback) {
            resultCallback.onResult(getResult());
        }
    }

    public static PendingResult<Status> discardedPendingResult() {
        return new DiscardedPendingResult();
    }

    public static PendingResult<Status> instantPendingResult(Status status) {
        return new InstantPendingResult(status);
    }

    public static <R extends Result> PendingResult<R> discardedPendingResult(R r11) {
        return new DiscardedPendingResult(r11);
    }

    public static <R extends Result> OptionalPendingResult<R> instantPendingResult(R r11) {
        return new OptionalPendingResultImpl(new InstantPendingResult(r11));
    }
}
