package com.baicizhan.client.business.webview.sdk;

import com.baicizhan.client.business.util.PathUtil;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class H5FileCache {
    public static final int MAX_DISK_CACHE = 104857600;
    public static final int MAX_DISK_FILE_COUNT = 2000;
    private static final String SAVE_HOME;
    public static final String SAVE_HOME_NAME = "webview/h5files";
    public static final String TAG = "H5FileCache";
    private static volatile H5FileCache msInstance;
    private volatile vb.a mResourceLibrary = null;

    static {
        File baicizhanFile = PathUtil.getBaicizhanFile(SAVE_HOME_NAME);
        if (baicizhanFile == null) {
            SAVE_HOME = null;
        } else {
            SAVE_HOME = baicizhanFile.getAbsolutePath();
        }
    }

    private vb.a createResourceLib() {
        return new vb.a(SAVE_HOME, gi.e.f53744c, 2000);
    }

    public static H5FileCache inst() {
        if (msInstance == null) {
            synchronized (H5FileCache.class) {
                try {
                    if (msInstance == null) {
                        msInstance = new H5FileCache();
                    }
                } finally {
                }
            }
        }
        return msInstance;
    }

    private void openResourceLib() throws RuntimeException {
        if (this.mResourceLibrary == null) {
            synchronized (this) {
                if (this.mResourceLibrary == null) {
                    vb.a createResourceLib = createResourceLib();
                    try {
                        if (createResourceLib.q(true)) {
                            this.mResourceLibrary = createResourceLib;
                        }
                    } catch (Exception e11) {
                        qb.c.c(TAG, "", e11);
                    }
                }
            }
        }
        if (this.mResourceLibrary == null) {
            throw new RuntimeException("openResourceLib failed");
        }
    }

    public boolean exists(String key) throws RuntimeException {
        openResourceLib();
        return this.mResourceLibrary.g(key);
    }

    public File getFile(String key) throws RuntimeException {
        openResourceLib();
        return this.mResourceLibrary.j(key);
    }

    public boolean save(String key, File file) throws RuntimeException {
        openResourceLib();
        return this.mResourceLibrary.r(key, file, true);
    }
}
