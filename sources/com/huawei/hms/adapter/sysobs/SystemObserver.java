package com.huawei.hms.adapter.sysobs;

import android.content.Intent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface SystemObserver {
    boolean onNoticeResult(int i11);

    boolean onSolutionResult(Intent intent, String str);

    boolean onUpdateResult(int i11);
}
