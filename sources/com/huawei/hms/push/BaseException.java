package com.huawei.hms.push;

import com.huawei.hms.aaid.constant.ErrorEnum;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class BaseException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f36126a;

    /* renamed from: b, reason: collision with root package name */
    public final ErrorEnum f36127b;

    public BaseException(int i11) {
        ErrorEnum fromCode = ErrorEnum.fromCode(i11);
        this.f36127b = fromCode;
        this.f36126a = fromCode.getExternalCode();
    }

    public int getErrorCode() {
        return this.f36126a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f36127b.getMessage();
    }
}
