package com.getui.gtc.base.log.b;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.getui.gtc.base.crypt.CryptTools;
import com.getui.gtc.base.log.ILogDestination;
import com.getui.gtc.base.util.CommonUtil;
import com.igexin.push.g.e;
import com.xiaomi.mipush.sdk.Constants;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes6.dex */
public class a implements ILogDestination {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<File, HandlerC0347a> f29807a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f29808b;

    /* renamed from: c, reason: collision with root package name */
    private File f29809c;

    /* renamed from: com.getui.gtc.base.log.b.a$a, reason: collision with other inner class name */
    public static class HandlerC0347a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        final SecretKey f29810a;

        /* renamed from: b, reason: collision with root package name */
        final IvParameterSpec f29811b;

        /* renamed from: c, reason: collision with root package name */
        final File f29812c;

        public HandlerC0347a(Looper looper, File file, SecretKey secretKey, IvParameterSpec ivParameterSpec) {
            super(looper);
            this.f29812c = file;
            this.f29810a = secretKey;
            this.f29811b = ivParameterSpec;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            RandomAccessFile randomAccessFile;
            FileLock fileLock;
            FileLock fileLock2;
            RandomAccessFile randomAccessFile2;
            int i11 = message.what;
            DataOutputStream dataOutputStream = null;
            if (i11 == 1) {
                File file = this.f29812c;
                try {
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        fileLock = randomAccessFile.getChannel().lock();
                        if (fileLock != null) {
                            try {
                                if (fileLock.isValid()) {
                                    DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(file, true));
                                    try {
                                        byte[] encrypt = CryptTools.encrypt("RSA/ECB/OAEPWithSHA1AndMGF1Padding", CryptTools.parsePublicKey("RSA", e.f38634a), this.f29810a.getEncoded());
                                        int length = encrypt.length;
                                        dataOutputStream2.write(0);
                                        dataOutputStream2.write(this.f29811b.getIV());
                                        dataOutputStream2.writeInt(length);
                                        dataOutputStream2.write(encrypt);
                                        dataOutputStream = dataOutputStream2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        dataOutputStream = dataOutputStream2;
                                        try {
                                            System.out.println("gtc-base fileLog writeKeyBlock failed: " + th.getMessage());
                                            th.printStackTrace();
                                            if (dataOutputStream != null) {
                                                try {
                                                    dataOutputStream.flush();
                                                    dataOutputStream.close();
                                                } catch (IOException unused) {
                                                }
                                            }
                                            if (fileLock != null && fileLock.isValid()) {
                                                try {
                                                    fileLock.release();
                                                } catch (IOException unused2) {
                                                }
                                            }
                                            if (randomAccessFile != null) {
                                                try {
                                                    randomAccessFile.close();
                                                    return;
                                                } catch (IOException unused3) {
                                                    return;
                                                }
                                            }
                                            return;
                                        } finally {
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.flush();
                                dataOutputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException unused5) {
                            }
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused6) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileLock = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    randomAccessFile = null;
                    fileLock = null;
                }
            } else {
                if (i11 != 2) {
                    return;
                }
                String str = (String) message.obj;
                File file2 = this.f29812c;
                try {
                    randomAccessFile2 = new RandomAccessFile(file2, "rw");
                    try {
                        fileLock2 = randomAccessFile2.getChannel().lock();
                        if (fileLock2 != null) {
                            try {
                                if (fileLock2.isValid()) {
                                    DataOutputStream dataOutputStream3 = new DataOutputStream(new FileOutputStream(file2, true));
                                    try {
                                        byte[] digest = CryptTools.digest("SHA1", this.f29810a.getEncoded());
                                        byte[] encrypt2 = CryptTools.encrypt("AES/CBC/PKCS5Padding", this.f29810a, this.f29811b, str.getBytes());
                                        int length2 = encrypt2.length;
                                        dataOutputStream3.write(112);
                                        dataOutputStream3.write(digest);
                                        dataOutputStream3.writeInt(length2);
                                        dataOutputStream3.write(encrypt2);
                                        dataOutputStream = dataOutputStream3;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        dataOutputStream = dataOutputStream3;
                                        try {
                                            System.out.println("gtc-base fileLog writeMessageBlock failed: ".concat(String.valueOf(str)));
                                            th.printStackTrace();
                                            if (dataOutputStream != null) {
                                                try {
                                                    dataOutputStream.flush();
                                                    dataOutputStream.close();
                                                } catch (IOException unused7) {
                                                }
                                            }
                                            if (fileLock != null && fileLock.isValid()) {
                                                try {
                                                    fileLock.release();
                                                } catch (IOException unused8) {
                                                }
                                            }
                                            if (randomAccessFile != null) {
                                                try {
                                                    randomAccessFile.close();
                                                    return;
                                                } catch (IOException unused9) {
                                                    return;
                                                }
                                            }
                                            return;
                                        } finally {
                                        }
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        }
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.flush();
                                dataOutputStream.close();
                            } catch (IOException unused10) {
                            }
                        }
                        if (fileLock2 != null && fileLock2.isValid()) {
                            try {
                                fileLock2.release();
                            } catch (IOException unused11) {
                            }
                        }
                        try {
                            randomAccessFile2.close();
                        } catch (IOException unused12) {
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        fileLock2 = null;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    fileLock2 = null;
                    randomAccessFile2 = null;
                }
            }
        }
    }

    public a(Context context) {
        this.f29808b = context;
        a(null);
    }

    public final void a(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f29808b.getPackageName());
        String str2 = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        if (str != null) {
            str2 = Constants.ACCEPT_TIME_SEPARATOR_SERVER + str + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        sb2.append(str2);
        sb2.append(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date()));
        sb2.append(".log");
        this.f29809c = new File(CommonUtil.getExternalFilesDir(this.f29808b), sb2.toString());
    }

    @Override // com.getui.gtc.base.log.ILogDestination
    public void log(int i11, String str, String str2) {
        HandlerC0347a handlerC0347a = f29807a.get(this.f29809c);
        if (!this.f29809c.exists()) {
            try {
                this.f29809c.getParentFile().mkdirs();
                this.f29809c.createNewFile();
            } catch (Throwable unused) {
            }
            if (handlerC0347a != null) {
                handlerC0347a.obtainMessage(1).sendToTarget();
            }
        }
        if (handlerC0347a == null) {
            synchronized (a.class) {
                Map<File, HandlerC0347a> map = f29807a;
                HandlerC0347a handlerC0347a2 = map.get(this.f29809c);
                if (handlerC0347a2 == null) {
                    try {
                        SecretKey generateKey = CryptTools.generateKey("AES", 128);
                        HandlerThread handlerThread = new HandlerThread("File-Log-Thread");
                        handlerThread.start();
                        byte[] generateSeed = new SecureRandom().generateSeed(16);
                        File file = this.f29809c;
                        HandlerC0347a handlerC0347a3 = new HandlerC0347a(handlerThread.getLooper(), this.f29809c, generateKey, new IvParameterSpec(generateSeed));
                        map.put(file, handlerC0347a3);
                        handlerC0347a = handlerC0347a3;
                    } catch (NoSuchAlgorithmException e11) {
                        e11.printStackTrace();
                        return;
                    }
                } else {
                    handlerC0347a = handlerC0347a2;
                }
            }
            handlerC0347a.obtainMessage(1).sendToTarget();
        }
        handlerC0347a.obtainMessage(2, str2).sendToTarget();
    }
}
