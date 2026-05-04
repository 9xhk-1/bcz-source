package com.baicizhan.client.business.util;

import android.content.Context;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.StorageUtils;
import java.io.File;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class StoragePathDetector {
    static final String DATA_NAME = "baicizhan";
    public static final String TAG = "StoragePathDetector";
    private static String mBestFolder;
    private static String mLegacyFolder;
    private static List<StorageUtils.StorageInfo> mStorageList;

    public static String detect(Context context, dc0.c<FileUtils.DirCopyProgress> copyProgressPublish) {
        String doDetect = doDetect(context, copyProgressPublish);
        File file = new File(doDetect);
        if (!file.exists() && !file.mkdirs()) {
            String defaultRoot = getDefaultRoot(context);
            qb.c.b(TAG, "detect, getExternalFilesDir: " + defaultRoot, new Object[0]);
            if (defaultRoot != null) {
                return defaultRoot;
            }
        }
        return doDetect;
    }

    private static String doDetect(Context context, dc0.c<FileUtils.DirCopyProgress> copyProgressPublish) {
        File externalFilesDir = context.getExternalFilesDir(DATA_NAME);
        if (externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
        }
        if (externalFilesDir == null) {
            qb.c.d(TAG, "NOT FILE PATH available", new Object[0]);
        } else {
            mBestFolder = externalFilesDir.getAbsolutePath();
        }
        qb.c.i(TAG, "best folder %s", mBestFolder);
        return mBestFolder;
    }

    public static List<StorageUtils.StorageInfo> getAllStorageInfo() {
        if (mStorageList == null) {
            mStorageList = StorageUtils.getStorageList();
        }
        return mStorageList;
    }

    public static String getBestFolder() {
        return mBestFolder;
    }

    public static String getDefaultRoot(Context context) {
        File externalFilesDir = context.getExternalFilesDir(DATA_NAME);
        qb.c.b(TAG, "getDefaultRoot: " + externalFilesDir, new Object[0]);
        if (externalFilesDir != null) {
            return externalFilesDir.getAbsolutePath();
        }
        qb.c.d(TAG, "default root is null, maybe is not mounted.", new Object[0]);
        return null;
    }

    public static String getLegacyFolder() {
        return mLegacyFolder;
    }
}
