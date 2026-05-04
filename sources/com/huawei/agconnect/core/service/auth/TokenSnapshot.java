package com.huawei.agconnect.core.service.auth;

/* loaded from: classes7.dex */
public interface TokenSnapshot {

    public enum State {
        SIGNED_IN,
        TOKEN_UPDATED,
        TOKEN_INVALID,
        SIGNED_OUT
    }

    String a();

    State getState();
}
