package com.huawei.hms.common;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public enum HmsCheckedState {
    UNCHECKED(0),
    NOT_NEED_UPDATE(1),
    NEED_UPDATE(2);


    /* renamed from: a, reason: collision with root package name */
    private final int f35488a;

    HmsCheckedState(int i11) {
        this.f35488a = i11;
    }

    public int getState() {
        return this.f35488a;
    }
}
