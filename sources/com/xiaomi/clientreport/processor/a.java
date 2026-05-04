package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.cache.CacheDataSink;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.push.ac;
import com.xiaomi.push.bo;
import com.xiaomi.push.bs;
import com.xiaomi.push.h;
import com.xiaomi.push.y;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes6.dex */
public class a implements IEventProcessor {

    /* renamed from: a, reason: collision with root package name */
    protected Context f45158a;

    /* renamed from: a, reason: collision with other field name */
    private HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> f60a;

    public a(Context context) {
        a(context);
    }

    public static String a(com.xiaomi.clientreport.data.a aVar) {
        return String.valueOf(aVar.production);
    }

    private String b(com.xiaomi.clientreport.data.a aVar) {
        File externalFilesDir = this.f45158a.getExternalFilesDir(NotificationCompat.CATEGORY_EVENT);
        String a11 = a(aVar);
        if (externalFilesDir == null) {
            return null;
        }
        String str = externalFilesDir.getAbsolutePath() + File.separator + a11;
        for (int i11 = 0; i11 < 100; i11++) {
            String str2 = str + i11;
            if (bs.m5761a(this.f45158a, str2)) {
                return str2;
            }
        }
        return null;
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public String bytesToString(byte[] bArr) {
        byte[] a11;
        if (bArr != null && bArr.length >= 1) {
            if (!com.xiaomi.clientreport.manager.a.a(this.f45158a).m5644a().isEventEncrypted()) {
                return bo.b(bArr);
            }
            String a12 = bs.a(this.f45158a);
            if (!TextUtils.isEmpty(a12) && (a11 = bs.a(a12)) != null && a11.length > 0) {
                try {
                    return bo.b(Base64.decode(h.a(a11, bArr), 2));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e11) {
                    com.xiaomi.channel.commonutils.logger.b.a(e11);
                }
            }
        }
        return null;
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public void setEventMap(HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> hashMap) {
        this.f60a = hashMap;
    }

    @Override // com.xiaomi.clientreport.processor.IEventProcessor
    public byte[] stringToBytes(String str) {
        byte[] a11;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!com.xiaomi.clientreport.manager.a.a(this.f45158a).m5644a().isEventEncrypted()) {
            return bo.m5758a(str);
        }
        String a12 = bs.a(this.f45158a);
        byte[] m5758a = bo.m5758a(str);
        if (!TextUtils.isEmpty(a12) && m5758a != null && m5758a.length > 1 && (a11 = bs.a(a12)) != null) {
            try {
                if (a11.length > 1) {
                    return h.b(a11, Base64.encode(m5758a, 2));
                }
            } catch (Exception e11) {
                com.xiaomi.channel.commonutils.logger.b.a(e11);
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
    
        com.xiaomi.channel.commonutils.logger.b.d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
    
        r9 = "eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<java.lang.String> a(java.lang.String r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 4
            byte[] r2 = new byte[r1]
            byte[] r3 = new byte[r1]
            r4 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L71
        L15:
            int r9 = r5.read(r2)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            r4 = -1
            if (r9 != r4) goto L1d
            goto L6b
        L1d:
            java.lang.String r6 = "eventData read from cache file failed because magicNumber error"
            if (r9 == r1) goto L2b
        L21:
            com.xiaomi.channel.commonutils.logger.b.d(r6)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            goto L6b
        L25:
            r9 = move-exception
            r4 = r5
            goto L79
        L28:
            r9 = move-exception
            r4 = r5
            goto L72
        L2b:
            int r9 = com.xiaomi.push.ac.a(r2)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            r7 = -573785174(0xffffffffddccbbaa, float:-1.84407149E18)
            if (r9 == r7) goto L35
            goto L21
        L35:
            int r9 = r5.read(r3)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            if (r9 != r4) goto L3c
            goto L6b
        L3c:
            if (r9 == r1) goto L41
            java.lang.String r9 = "eventData read from cache file failed cause lengthBuffer error"
            goto L68
        L41:
            int r9 = com.xiaomi.push.ac.a(r3)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            r4 = 1
            if (r9 < r4) goto L66
            r4 = 4096(0x1000, float:5.74E-42)
            if (r9 <= r4) goto L4d
            goto L66
        L4d:
            byte[] r4 = new byte[r9]     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            int r6 = r5.read(r4)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            if (r6 == r9) goto L58
            java.lang.String r9 = "eventData read from cache file failed cause buffer size not equal length"
            goto L68
        L58:
            java.lang.String r9 = r8.bytesToString(r4)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            boolean r4 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            if (r4 != 0) goto L15
            r0.add(r9)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
            goto L15
        L66:
            java.lang.String r9 = "eventData read from cache file failed cause lengthBuffer < 1 || lengthBuffer > 4K"
        L68:
            com.xiaomi.channel.commonutils.logger.b.d(r9)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L28
        L6b:
            com.xiaomi.push.y.a(r5)
            return r0
        L6f:
            r9 = move-exception
            goto L79
        L71:
            r9 = move-exception
        L72:
            com.xiaomi.channel.commonutils.logger.b.a(r9)     // Catch: java.lang.Throwable -> L6f
            com.xiaomi.push.y.a(r4)
            return r0
        L79:
            com.xiaomi.push.y.a(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.a.a(java.lang.String):java.util.List");
    }

    @Override // com.xiaomi.clientreport.processor.d
    public void b() {
        HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> hashMap = this.f60a;
        if (hashMap == null) {
            return;
        }
        if (hashMap.size() > 0) {
            Iterator<String> it = this.f60a.keySet().iterator();
            while (it.hasNext()) {
                ArrayList<com.xiaomi.clientreport.data.a> arrayList = this.f60a.get(it.next());
                if (arrayList != null && arrayList.size() > 0) {
                    com.xiaomi.clientreport.data.a[] aVarArr = new com.xiaomi.clientreport.data.a[arrayList.size()];
                    arrayList.toArray(aVarArr);
                    m5648a(aVarArr);
                }
            }
        }
        this.f60a.clear();
    }

    @Override // com.xiaomi.clientreport.processor.c
    public void a() {
        int i11;
        RandomAccessFile randomAccessFile;
        bs.a(this.f45158a, NotificationCompat.CATEGORY_EVENT, "eventUploading");
        File[] m5762a = bs.m5762a(this.f45158a, "eventUploading");
        if (m5762a == null || m5762a.length <= 0) {
            return;
        }
        FileLock fileLock = null;
        File file = null;
        RandomAccessFile randomAccessFile2 = null;
        for (File file2 : m5762a) {
            if (file2 == null) {
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException e11) {
                        com.xiaomi.channel.commonutils.logger.b.a(e11);
                    }
                }
                y.a(randomAccessFile2);
                i11 = file == null ? i11 + 1 : 0;
                file.delete();
            } else {
                try {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
                if (file2.length() > CacheDataSink.DEFAULT_FRAGMENT_SIZE) {
                    com.xiaomi.channel.commonutils.logger.b.d("eventData read from cache file failed because " + file2.getName() + " is too big, length " + file2.length());
                    a(file2.getName(), Formatter.formatFileSize(this.f45158a, file2.length()));
                    file2.delete();
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException e13) {
                            com.xiaomi.channel.commonutils.logger.b.a(e13);
                        }
                    }
                    y.a(randomAccessFile2);
                    if (file == null) {
                    }
                    file.delete();
                } else {
                    String absolutePath = file2.getAbsolutePath();
                    File file3 = new File(absolutePath + ".lock");
                    try {
                        y.m6304a(file3);
                        randomAccessFile = new RandomAccessFile(file3, "rw");
                    } catch (Exception e14) {
                        e = e14;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        fileLock = randomAccessFile.getChannel().lock();
                        a(a(absolutePath));
                        file2.delete();
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e15) {
                                com.xiaomi.channel.commonutils.logger.b.a(e15);
                            }
                        }
                        y.a(randomAccessFile);
                        file3.delete();
                        randomAccessFile2 = randomAccessFile;
                        file = file3;
                    } catch (Exception e16) {
                        e = e16;
                        randomAccessFile2 = randomAccessFile;
                        file = file3;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e17) {
                                com.xiaomi.channel.commonutils.logger.b.a(e17);
                            }
                        }
                        y.a(randomAccessFile2);
                        if (file == null) {
                        }
                        file.delete();
                    } catch (Throwable th4) {
                        th = th4;
                        randomAccessFile2 = randomAccessFile;
                        file = file3;
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e18) {
                                com.xiaomi.channel.commonutils.logger.b.a(e18);
                            }
                        }
                        y.a(randomAccessFile2);
                        if (file == null) {
                            throw th;
                        }
                        file.delete();
                        throw th;
                    }
                }
            }
        }
    }

    public void a(Context context) {
        this.f45158a = context;
    }

    @Override // com.xiaomi.clientreport.processor.d
    /* renamed from: a, reason: collision with other method in class */
    public void mo5647a(com.xiaomi.clientreport.data.a aVar) {
        if ((aVar instanceof EventClientReport) && this.f60a != null) {
            EventClientReport eventClientReport = (EventClientReport) aVar;
            String a11 = a((com.xiaomi.clientreport.data.a) eventClientReport);
            ArrayList<com.xiaomi.clientreport.data.a> arrayList = this.f60a.get(a11);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(eventClientReport);
            this.f60a.put(a11, arrayList);
        }
    }

    private void a(RandomAccessFile randomAccessFile, FileLock fileLock) {
        if (fileLock != null && fileLock.isValid()) {
            try {
                fileLock.release();
            } catch (IOException e11) {
                com.xiaomi.channel.commonutils.logger.b.a(e11);
            }
        }
        y.a(randomAccessFile);
    }

    private void a(String str, String str2) {
        EventClientReport a11 = com.xiaomi.clientreport.manager.a.a(this.f45158a).a(PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED, "24:" + str + "," + str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(a11.toJsonString());
        a(arrayList);
    }

    public void a(List<String> list) {
        bs.a(this.f45158a, list);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m5648a(com.xiaomi.clientreport.data.a[] aVarArr) {
        if (aVarArr == null || aVarArr.length == 0 || aVarArr[0] == null) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("event data write to cache file failed because data null");
            return;
        }
        do {
            aVarArr = a(aVarArr);
            if (aVarArr == null || aVarArr.length <= 0) {
                return;
            }
        } while (aVarArr[0] != null);
    }

    private com.xiaomi.clientreport.data.a[] a(com.xiaomi.clientreport.data.a[] aVarArr) {
        FileLock fileLock;
        RandomAccessFile randomAccessFile;
        BufferedOutputStream bufferedOutputStream;
        String b11 = b(aVarArr[0]);
        BufferedOutputStream bufferedOutputStream2 = null;
        if (TextUtils.isEmpty(b11)) {
            return null;
        }
        try {
            File file = new File(b11 + ".lock");
            y.m6304a(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                fileLock = randomAccessFile.getChannel().lock();
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(b11), true));
                    try {
                        try {
                            int i11 = 0;
                            for (com.xiaomi.clientreport.data.a aVar : aVarArr) {
                                if (aVar != null) {
                                    byte[] stringToBytes = stringToBytes(aVar.toJsonString());
                                    if (stringToBytes != null && stringToBytes.length >= 1 && stringToBytes.length <= 4096) {
                                        if (!bs.m5761a(this.f45158a, b11)) {
                                            int length = aVarArr.length - i11;
                                            com.xiaomi.clientreport.data.a[] aVarArr2 = new com.xiaomi.clientreport.data.a[length];
                                            System.arraycopy(aVarArr, i11, aVarArr2, 0, length);
                                            y.a(bufferedOutputStream);
                                            a(randomAccessFile, fileLock);
                                            return aVarArr2;
                                        }
                                        bufferedOutputStream.write(ac.a(-573785174));
                                        bufferedOutputStream.write(ac.a(stringToBytes.length));
                                        bufferedOutputStream.write(stringToBytes);
                                        bufferedOutputStream.flush();
                                        i11++;
                                    }
                                    com.xiaomi.channel.commonutils.logger.b.d("event data throw a invalid item ");
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            com.xiaomi.channel.commonutils.logger.b.a("event data write to cache file failed cause exception", e);
                            y.a(bufferedOutputStream);
                            a(randomAccessFile, fileLock);
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream2 = bufferedOutputStream;
                        y.a(bufferedOutputStream2);
                        a(randomAccessFile, fileLock);
                        throw th;
                    }
                } catch (Exception e12) {
                    e = e12;
                    bufferedOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    y.a(bufferedOutputStream2);
                    a(randomAccessFile, fileLock);
                    throw th;
                }
            } catch (Exception e13) {
                e = e13;
                fileLock = null;
                bufferedOutputStream = null;
            } catch (Throwable th4) {
                th = th4;
                fileLock = null;
            }
        } catch (Exception e14) {
            e = e14;
            fileLock = null;
            randomAccessFile = null;
            bufferedOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileLock = null;
            randomAccessFile = null;
        }
        y.a(bufferedOutputStream);
        a(randomAccessFile, fileLock);
        return null;
    }
}
