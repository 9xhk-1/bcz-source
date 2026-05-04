package com.heytap.msp.push.callback;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface ICallBackResultService {
    void onError(int i11, String str);

    void onGetNotificationStatus(int i11, int i12);

    void onGetPushStatus(int i11, int i12);

    void onRegister(int i11, String str);

    void onSetPushTime(int i11, String str);

    void onUnRegister(int i11);
}
