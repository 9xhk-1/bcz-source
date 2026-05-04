package com.mob.tools.network;

import com.mob.tools.proguard.PublicMemberKeeper;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class MultiPartInputStream extends InputStream implements PublicMemberKeeper {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<InputStream> f41319a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private int f41320b;

    private boolean a() {
        ArrayList<InputStream> arrayList = this.f41319a;
        return arrayList == null || arrayList.size() <= 0;
    }

    public void addInputStream(InputStream inputStream) throws Throwable {
        this.f41319a.add(inputStream);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (a()) {
            return 0;
        }
        return this.f41319a.get(this.f41320b).available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Iterator<InputStream> it = this.f41319a.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (a()) {
            return -1;
        }
        int read = this.f41319a.get(this.f41320b).read();
        while (read < 0) {
            int i11 = this.f41320b + 1;
            this.f41320b = i11;
            if (i11 >= this.f41319a.size()) {
                break;
            }
            read = this.f41319a.get(this.f41320b).read();
        }
        return read;
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        throw new IOException();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (a()) {
            return -1;
        }
        int read = this.f41319a.get(this.f41320b).read(bArr, i11, i12);
        while (read < 0) {
            int i13 = this.f41320b + 1;
            this.f41320b = i13;
            if (i13 >= this.f41319a.size()) {
                break;
            }
            read = this.f41319a.get(this.f41320b).read(bArr, i11, i12);
        }
        return read;
    }
}
