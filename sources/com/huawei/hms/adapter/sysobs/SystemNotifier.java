package com.huawei.hms.adapter.sysobs;

import android.content.Intent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface SystemNotifier {
    void notifyNoticeObservers(int i11);

    void notifyObservers(int i11);

    void notifyObservers(Intent intent, String str);

    void registerObserver(SystemObserver systemObserver);

    void unRegisterObserver(SystemObserver systemObserver);
}
