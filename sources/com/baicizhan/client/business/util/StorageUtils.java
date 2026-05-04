package com.baicizhan.client.business.util;

import android.os.Environment;
import android.os.StatFs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class StorageUtils {
    private static final String TAG = "StorageUtils";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class StorageInfo {
        public final int display_number;
        public final boolean internal;
        public final String path;
        public final boolean readonly;

        public StorageInfo(String path, boolean internal, boolean readonly, int display_number) {
            this.path = path;
            this.internal = internal;
            this.readonly = readonly;
            this.display_number = display_number;
        }

        public String getDisplayName() {
            StringBuilder sb2 = new StringBuilder();
            if (this.internal) {
                sb2.append("Internal SD card");
            } else if (this.display_number > 1) {
                sb2.append("SD card " + this.display_number);
            } else {
                sb2.append("SD card");
            }
            if (this.readonly) {
                sb2.append(" (Read only)");
            }
            return sb2.toString();
        }

        public String toString() {
            return "StorageInfo{path='" + this.path + "', internal=" + this.internal + ", readonly=" + this.readonly + ", display_number=" + this.display_number + l50.b.f69928j;
        }
    }

    public static long getAvailableBytes(String path) throws IllegalArgumentException {
        return new StatFs(path).getAvailableBytes();
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x012d, code lost:
    
        if (r6 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0126, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0124, code lost:
    
        if (r6 == null) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.baicizhan.client.business.util.StorageUtils.StorageInfo> getStorageList() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.util.StorageUtils.getStorageList():java.util.List");
    }

    public static List<StorageInfo> getStorageListInternal() {
        ArrayList arrayList = new ArrayList();
        String path = Environment.getExternalStorageDirectory().getPath();
        boolean z11 = true;
        boolean z12 = !Environment.isExternalStorageRemovable();
        String externalStorageState = Environment.getExternalStorageState();
        if (!externalStorageState.equals("mounted") && !externalStorageState.equals("mounted_ro")) {
            z11 = false;
        }
        boolean equals = Environment.getExternalStorageState().equals("mounted_ro");
        if (z11) {
            arrayList.add(new StorageInfo(path, z12, equals, -1));
            return arrayList;
        }
        qb.c.d(TAG, "getStorageListInternal error, def_path_state = " + externalStorageState, new Object[0]);
        return arrayList;
    }
}
