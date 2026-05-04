package com.huawei.hms.update.download.api;

import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface IUpdateCallback {
    void onCheckUpdate(int i11, UpdateInfo updateInfo);

    void onDownloadPackage(int i11, int i12, int i13, File file);
}
