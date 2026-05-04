package com.mob.commons.a;

import com.mob.MobSDK;
import com.mob.commons.r;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DeviceHelper;
import com.mob.tools.utils.ReflectHelper;
import com.mob.tools.utils.ResHelper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes7.dex */
public class f extends c {

    /* renamed from: c, reason: collision with root package name */
    private long f40126c;

    public f() {
        super(com.mob.commons.j.a("0022cbRg"), 0L, com.mob.commons.j.a("0022cbRg"), 0L);
        this.f40126c = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.HashMap<java.lang.String, java.lang.Object> n() {
        /*
            r8 = this;
            android.content.Context r0 = com.mob.MobSDK.getContext()
            java.lang.String r1 = com.mob.commons.j.f40350d
            java.io.File r0 = com.mob.tools.utils.ResHelper.getDataCacheFile(r0, r1)
            if (r0 == 0) goto L18
            boolean r1 = r0.exists()
            if (r1 != 0) goto L18
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
        L18:
            r1 = 1
            r2 = 0
            r3 = 2
            r4 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3c
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L39
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r6 = r0.readObject()     // Catch: java.lang.Throwable -> L37
            java.util.HashMap r6 = (java.util.HashMap) r6     // Catch: java.lang.Throwable -> L37
            java.io.Closeable[] r3 = new java.io.Closeable[r3]
            r3[r2] = r0
            r3[r1] = r5
            com.mob.commons.r.a(r3)
            r4 = r6
            goto L4f
        L37:
            r6 = move-exception
            goto L3f
        L39:
            r6 = move-exception
            r0 = r4
            goto L3f
        L3c:
            r6 = move-exception
            r0 = r4
            r5 = r0
        L3f:
            com.mob.tools.log.NLog r7 = com.mob.tools.MobLog.getInstance()     // Catch: java.lang.Throwable -> L57
            r7.d(r6)     // Catch: java.lang.Throwable -> L57
            java.io.Closeable[] r3 = new java.io.Closeable[r3]
            r3[r2] = r0
            r3[r1] = r5
            com.mob.commons.r.a(r3)
        L4f:
            if (r4 != 0) goto L56
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L56:
            return r4
        L57:
            r4 = move-exception
            java.io.Closeable[] r3 = new java.io.Closeable[r3]
            r3[r2] = r0
            r3[r1] = r5
            com.mob.commons.r.a(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.a.f.n():java.util.HashMap");
    }

    @Override // com.mob.commons.a.c
    public void a() {
        if (k() > 0) {
            final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            DeviceHelper.getInstance(MobSDK.getContext()).getBatteryState(new ReflectHelper.a<HashMap<String, Object>, Void>() { // from class: com.mob.commons.a.f.1
                @Override // com.mob.tools.utils.ReflectHelper.a
                public Void a(HashMap<String, Object> hashMap) {
                    try {
                        linkedBlockingQueue.offer(hashMap);
                        return null;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
            try {
                this.f40126c = a((HashMap<String, Object>) linkedBlockingQueue.take()) / 1000;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.mob.commons.a.c
    public void b() {
        if (this.f40126c == 0) {
            this.f40126c = k();
        }
        a(this.f40126c);
    }

    @Override // com.mob.commons.a.c
    public void j() {
        this.f40126c = 0L;
    }

    private void b(HashMap<String, Object> hashMap) {
        File dataCacheFile = ResHelper.getDataCacheFile(MobSDK.getContext(), com.mob.commons.j.f40350d);
        if (dataCacheFile != null && (hashMap == null || hashMap.isEmpty())) {
            dataCacheFile.delete();
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(dataCacheFile));
            try {
                objectOutputStream2.writeObject(hashMap);
                objectOutputStream2.close();
                r.a(objectOutputStream2);
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                try {
                    MobLog.getInstance().d(th);
                    r.a(objectOutputStream);
                } catch (Throwable th3) {
                    r.a(objectOutputStream);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0101, code lost:
    
        if (r7.size() == r0) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc A[Catch: all -> 0x00c2, TryCatch #1 {all -> 0x00c2, blocks: (B:26:0x00bc, B:27:0x00c7, B:35:0x00d9, B:37:0x00df, B:39:0x00e5, B:41:0x00eb, B:43:0x00f1, B:45:0x00f7, B:47:0x00fd, B:49:0x0130, B:51:0x0315, B:52:0x0328, B:56:0x0334, B:59:0x033c, B:60:0x036f, B:68:0x0103, B:73:0x00b3), top: B:72:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0315 A[Catch: all -> 0x00c2, TryCatch #1 {all -> 0x00c2, blocks: (B:26:0x00bc, B:27:0x00c7, B:35:0x00d9, B:37:0x00df, B:39:0x00e5, B:41:0x00eb, B:43:0x00f1, B:45:0x00f7, B:47:0x00fd, B:49:0x0130, B:51:0x0315, B:52:0x0328, B:56:0x0334, B:59:0x033c, B:60:0x036f, B:68:0x0103, B:73:0x00b3), top: B:72:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x033c A[Catch: all -> 0x00c2, TryCatch #1 {all -> 0x00c2, blocks: (B:26:0x00bc, B:27:0x00c7, B:35:0x00d9, B:37:0x00df, B:39:0x00e5, B:41:0x00eb, B:43:0x00f1, B:45:0x00f7, B:47:0x00fd, B:49:0x0130, B:51:0x0315, B:52:0x0328, B:56:0x0334, B:59:0x033c, B:60:0x036f, B:68:0x0103, B:73:0x00b3), top: B:72:0x00b3 }] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.mob.commons.a.c, com.mob.commons.a.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long a(java.util.HashMap<java.lang.String, java.lang.Object> r19) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.a.f.a(java.util.HashMap):long");
    }
}
