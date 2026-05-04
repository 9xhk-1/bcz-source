package com.huawei.hms.common.api;

import com.huawei.hms.common.Feature;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature feature;

    public UnsupportedApiCallException(Feature feature) {
        this.feature = feature;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.feature + " is unsupported";
    }
}
