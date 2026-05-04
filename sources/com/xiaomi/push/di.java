package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class di implements LoggerInterface {

    /* renamed from: a, reason: collision with root package name */
    private static volatile di f45389a;

    /* renamed from: a, reason: collision with other field name */
    private Context f256a;

    /* renamed from: a, reason: collision with other field name */
    private Handler f257a;

    /* renamed from: b, reason: collision with root package name */
    private String f45390b;

    /* renamed from: c, reason: collision with root package name */
    private String f45391c = "";

    /* renamed from: a, reason: collision with other field name */
    private static final SimpleDateFormat f254a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aaa");

    /* renamed from: a, reason: collision with other field name */
    public static String f253a = "/MiPushLog";

    /* renamed from: a, reason: collision with other field name */
    private static List<Pair<String, Throwable>> f255a = Collections.synchronizedList(new ArrayList());

    private di(Context context) {
        this.f256a = context;
        if (context.getApplicationContext() != null) {
            this.f256a = context.getApplicationContext();
        }
        this.f45390b = this.f256a.getPackageName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Process.myPid();
        HandlerThread handlerThread = new HandlerThread("Log2FileHandlerThread");
        handlerThread.start();
        this.f257a = new Handler(handlerThread.getLooper());
    }

    public static di a(Context context) {
        if (f45389a == null) {
            synchronized (di.class) {
                try {
                    if (f45389a == null) {
                        f45389a = new di(context);
                    }
                } finally {
                }
            }
        }
        return f45389a;
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void log(String str) {
        log(str, null);
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void setTag(String str) {
        this.f45390b = str;
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public final void log(String str, Throwable th2) {
        this.f257a.post(new dj(this, str, th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: collision with other method in class */
    public void m5822a() {
        FileLock fileLock;
        RandomAccessFile randomAccessFile;
        File file;
        File externalFilesDir;
        BufferedWriter bufferedWriter = null;
        try {
            if (TextUtils.isEmpty(this.f45391c) && (externalFilesDir = this.f256a.getExternalFilesDir(null)) != null) {
                this.f45391c = externalFilesDir.getAbsolutePath() + "";
            }
            file = new File(this.f45391c + f253a);
        } catch (Exception e11) {
            e = e11;
            fileLock = null;
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
            fileLock = null;
            randomAccessFile = null;
        }
        if ((!file.exists() || !file.isDirectory()) && !file.mkdirs()) {
            Log.w(this.f45390b, "Create mipushlog directory fail.");
            return;
        }
        File file2 = new File(file, "log.lock");
        if (!file2.exists() || file2.isDirectory()) {
            file2.createNewFile();
        }
        randomAccessFile = new RandomAccessFile(file2, "rw");
        try {
            fileLock = randomAccessFile.getChannel().lock();
            try {
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(file, "log1.txt"), true)));
                    while (!f255a.isEmpty()) {
                        try {
                            Pair<String, Throwable> remove = f255a.remove(0);
                            String str = (String) remove.first;
                            if (remove.second != null) {
                                str = (str + "\n") + Log.getStackTraceString((Throwable) remove.second);
                            }
                            bufferedWriter2.write(str + "\n");
                        } catch (Exception e12) {
                            e = e12;
                            bufferedWriter = bufferedWriter2;
                            Log.e(this.f45390b, "", e);
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e13) {
                                    Log.e(this.f45390b, "", e13);
                                }
                            }
                            if (fileLock != null && fileLock.isValid()) {
                                try {
                                    fileLock.release();
                                } catch (IOException e14) {
                                    Log.e(this.f45390b, "", e14);
                                }
                            }
                            if (randomAccessFile == null) {
                                return;
                            }
                            randomAccessFile.close();
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedWriter = bufferedWriter2;
                            if (bufferedWriter != null) {
                                try {
                                    bufferedWriter.close();
                                } catch (IOException e15) {
                                    Log.e(this.f45390b, "", e15);
                                }
                            }
                            if (fileLock != null && fileLock.isValid()) {
                                try {
                                    fileLock.release();
                                } catch (IOException e16) {
                                    Log.e(this.f45390b, "", e16);
                                }
                            }
                            if (randomAccessFile == null) {
                                throw th;
                            }
                            try {
                                randomAccessFile.close();
                                throw th;
                            } catch (IOException e17) {
                                Log.e(this.f45390b, "", e17);
                                throw th;
                            }
                        }
                    }
                    bufferedWriter2.flush();
                    bufferedWriter2.close();
                    File file3 = new File(file, "log1.txt");
                    if (file3.length() >= 1048576) {
                        File file4 = new File(file, "log0.txt");
                        if (file4.exists() && file4.isFile()) {
                            file4.delete();
                        }
                        file3.renameTo(file4);
                    }
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException e18) {
                            Log.e(this.f45390b, "", e18);
                        }
                    }
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e21) {
            e = e21;
            fileLock = null;
        } catch (Throwable th5) {
            th = th5;
            fileLock = null;
        }
        try {
            randomAccessFile.close();
        } catch (IOException e22) {
            Log.e(this.f45390b, "", e22);
        }
    }
}
