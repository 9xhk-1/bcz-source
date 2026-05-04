package com.huawei.hms.update.download;

import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class RandomFileOutputStream extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    private RandomAccessFile f36451a;

    public RandomFileOutputStream(File file, int i11) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            this.f36451a = randomAccessFile;
            randomAccessFile.setLength(i11);
        } catch (FileNotFoundException unused) {
            HMSLog.e("RandomFileOutputStream", "create  file stream failed");
        } catch (IOException unused2) {
            IOUtils.closeQuietly(this.f36451a);
            HMSLog.e("RandomFileOutputStream", "create  file stream failed");
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        RandomAccessFile randomAccessFile = this.f36451a;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    public void seek(long j11) throws IOException {
        RandomAccessFile randomAccessFile = this.f36451a;
        if (randomAccessFile != null) {
            randomAccessFile.seek(j11);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) throws IOException {
        RandomAccessFile randomAccessFile = this.f36451a;
        if (randomAccessFile != null) {
            randomAccessFile.write(bArr, i11, i12);
        }
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        write(new byte[]{(byte) i11}, 0, 1);
    }
}
