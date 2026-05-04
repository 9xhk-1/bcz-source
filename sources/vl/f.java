package vl;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import vl.c;
import yz.c2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f implements Closeable, c {

    /* renamed from: a, reason: collision with root package name */
    public final int f94058a = 1179403647;

    /* renamed from: b, reason: collision with root package name */
    public final FileChannel f94059b;

    public f(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f94059b = new FileInputStream(file).getChannel();
    }

    public final long a(c.b bVar, long j11, long j12) throws IOException {
        for (long j13 = 0; j13 < j11; j13++) {
            c.AbstractC1267c b11 = bVar.b(j13);
            if (b11.f94051a == 1) {
                long j14 = b11.f94053c;
                if (j14 <= j12 && j12 <= b11.f94054d + j14) {
                    return (j12 - j14) + b11.f94052b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public c.b c() throws IOException {
        this.f94059b.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (r(allocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short i11 = i(allocate, 4L);
        boolean z11 = i(allocate, 5L) == 2;
        if (i11 == 1) {
            return new d(z11, this);
        }
        if (i11 == 2) {
            return new e(z11, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f94059b.close();
    }

    public List<String> e() throws IOException {
        long j11;
        long j12;
        this.f94059b.position(0L);
        ArrayList arrayList = new ArrayList();
        c.b c11 = c();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(c11.f94040a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j13 = c11.f94045f;
        int i11 = 0;
        if (j13 == j60.g.f63638t) {
            j13 = c11.c(0).f94055a;
        }
        long j14 = 0;
        while (true) {
            j11 = 1;
            if (j14 >= j13) {
                j12 = 0;
                break;
            }
            c.AbstractC1267c b11 = c11.b(j14);
            if (b11.f94051a == 2) {
                j12 = b11.f94052b;
                break;
            }
            j14++;
        }
        if (j12 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j15 = 0;
        while (true) {
            c.a a11 = c11.a(j12, i11);
            long j16 = j11;
            long j17 = a11.f94035a;
            if (j17 == j16) {
                arrayList2.add(Long.valueOf(a11.f94036b));
            } else if (j17 == 5) {
                j15 = a11.f94036b;
            }
            i11++;
            if (a11.f94035a == 0) {
                break;
            }
            j11 = j16;
            j13 = j13;
        }
        if (j15 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long a12 = a(c11, j13, j15);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(q(allocate, ((Long) it.next()).longValue() + a12));
        }
        return arrayList;
    }

    public void f(ByteBuffer byteBuffer, long j11, int i11) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i11);
        long j12 = 0;
        while (j12 < i11) {
            int read = this.f94059b.read(byteBuffer, j11 + j12);
            if (read == -1) {
                throw new EOFException();
            }
            j12 += read;
        }
        byteBuffer.position(0);
    }

    public short i(ByteBuffer byteBuffer, long j11) throws IOException {
        f(byteBuffer, j11, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int j(ByteBuffer byteBuffer, long j11) throws IOException {
        f(byteBuffer, j11, 2);
        return byteBuffer.getShort() & c2.f100412d;
    }

    public long k(ByteBuffer byteBuffer, long j11) throws IOException {
        f(byteBuffer, j11, 8);
        return byteBuffer.getLong();
    }

    public String q(ByteBuffer byteBuffer, long j11) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j12 = 1 + j11;
            short i11 = i(byteBuffer, j11);
            if (i11 == 0) {
                return sb2.toString();
            }
            sb2.append((char) i11);
            j11 = j12;
        }
    }

    public long r(ByteBuffer byteBuffer, long j11) throws IOException {
        f(byteBuffer, j11, 4);
        return byteBuffer.getInt() & 4294967295L;
    }
}
