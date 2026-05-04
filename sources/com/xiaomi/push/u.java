package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f46416a = Collections.synchronizedSet(new HashSet());

    /* renamed from: a, reason: collision with other field name */
    private Context f1044a;

    /* renamed from: a, reason: collision with other field name */
    private RandomAccessFile f1045a;

    /* renamed from: a, reason: collision with other field name */
    private String f1046a;

    /* renamed from: a, reason: collision with other field name */
    private FileLock f1047a;

    private u(Context context) {
        this.f1044a = context;
    }

    public static u a(Context context, File file) {
        com.xiaomi.channel.commonutils.logger.b.c("Locking: " + file.getAbsolutePath());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        Set<String> set = f46416a;
        if (!set.add(str)) {
            throw new IOException("abtain lock failure");
        }
        u uVar = new u(context);
        uVar.f1046a = str;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            uVar.f1045a = randomAccessFile;
            uVar.f1047a = randomAccessFile.getChannel().lock();
            com.xiaomi.channel.commonutils.logger.b.c("Locked: " + str + " :" + uVar.f1047a);
            if (uVar.f1047a == null) {
                RandomAccessFile randomAccessFile2 = uVar.f1045a;
                if (randomAccessFile2 != null) {
                    y.a(randomAccessFile2);
                }
                set.remove(uVar.f1046a);
            }
            return uVar;
        } catch (Throwable th2) {
            if (uVar.f1047a == null) {
                RandomAccessFile randomAccessFile3 = uVar.f1045a;
                if (randomAccessFile3 != null) {
                    y.a(randomAccessFile3);
                }
                f46416a.remove(uVar.f1046a);
            }
            throw th2;
        }
    }

    public void a() {
        com.xiaomi.channel.commonutils.logger.b.c("unLock: " + this.f1047a);
        FileLock fileLock = this.f1047a;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f1047a.release();
            } catch (IOException unused) {
            }
            this.f1047a = null;
        }
        RandomAccessFile randomAccessFile = this.f1045a;
        if (randomAccessFile != null) {
            y.a(randomAccessFile);
        }
        f46416a.remove(this.f1046a);
    }
}
