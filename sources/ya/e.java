package ya;

import en.r;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.zip.InflaterInputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: j, reason: collision with root package name */
    public static final int f99733j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f99734k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final Charset f99735l = Charset.forName("utf8");

    /* renamed from: m, reason: collision with root package name */
    public static final int f99736m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f99737n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f99738o = 1024;

    /* renamed from: p, reason: collision with root package name */
    public static final int f99739p = 2048;

    /* renamed from: q, reason: collision with root package name */
    public static final int f99740q = 1262571610;

    /* renamed from: r, reason: collision with root package name */
    public static final int f99741r = 808465200;

    /* renamed from: s, reason: collision with root package name */
    public static final int f99742s = 128;

    /* renamed from: t, reason: collision with root package name */
    public static final int f99743t = 48;

    /* renamed from: u, reason: collision with root package name */
    public static final int f99744u = 4096;

    /* renamed from: v, reason: collision with root package name */
    public static final int f99745v = 131;

    /* renamed from: a, reason: collision with root package name */
    public int f99746a;

    /* renamed from: b, reason: collision with root package name */
    public String f99747b;

    /* renamed from: c, reason: collision with root package name */
    public RandomAccessFile f99748c;

    /* renamed from: g, reason: collision with root package name */
    public long f99752g;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f99754i;

    /* renamed from: d, reason: collision with root package name */
    public b f99749d = new b();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<a> f99750e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public Hashtable<String, a> f99751f = new Hashtable<>();

    /* renamed from: h, reason: collision with root package name */
    public boolean f99753h = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public String f99755a;

        /* renamed from: b, reason: collision with root package name */
        public long f99756b;

        /* renamed from: c, reason: collision with root package name */
        public long f99757c;

        /* renamed from: d, reason: collision with root package name */
        public int f99758d;

        /* renamed from: e, reason: collision with root package name */
        public int f99759e;

        /* renamed from: f, reason: collision with root package name */
        public int f99760f;

        /* renamed from: g, reason: collision with root package name */
        public int f99761g;

        /* renamed from: h, reason: collision with root package name */
        public long f99762h;

        /* renamed from: i, reason: collision with root package name */
        public int f99763i;

        /* renamed from: j, reason: collision with root package name */
        public int f99764j;

        public a() {
            super();
        }

        @Override // ya.e.c
        public void a(InputStream is2) throws IOException {
            this.f99756b = ya.b.c(is2);
            this.f99757c = ya.b.c(is2);
            this.f99758d = ya.b.b(is2);
            this.f99759e = ya.b.b(is2);
            this.f99760f = ya.b.b(is2);
            this.f99761g = ya.b.b(is2);
            this.f99762h = ya.b.c(is2);
            this.f99763i = ya.b.b(is2);
            this.f99764j = ya.b.b(is2);
        }

        @Override // ya.e.c
        public void c(OutputStream os2) throws IOException {
            ya.b.g(os2, this.f99756b);
            ya.b.g(os2, this.f99757c);
            ya.b.f(os2, this.f99758d);
            ya.b.f(os2, this.f99759e);
            ya.b.f(os2, this.f99760f);
            ya.b.f(os2, this.f99761g);
            ya.b.g(os2, this.f99762h);
            ya.b.f(os2, this.f99763i);
            ya.b.f(os2, this.f99764j);
        }

        public int e() {
            return this.f99763i;
        }

        public long f() {
            return this.f99756b;
        }

        public String g() {
            return this.f99755a;
        }

        public String toString() {
            return "FileEntry [filename=" + this.f99755a + ", byteOffset=" + this.f99756b + ", nameHash=" + this.f99757c + ", packSize=" + this.f99758d + ", originSize=" + this.f99759e + ", flag=" + this.f99760f + ", chunkSize=" + this.f99761g + ", contentHash=" + this.f99762h + ", availableSize=" + this.f99763i + ", reserved=" + this.f99764j + "]";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends c {

        /* renamed from: n, reason: collision with root package name */
        public static final int f99765n = 18;

        /* renamed from: a, reason: collision with root package name */
        public int f99766a;

        /* renamed from: b, reason: collision with root package name */
        public int f99767b;

        /* renamed from: c, reason: collision with root package name */
        public int f99768c;

        /* renamed from: d, reason: collision with root package name */
        public int f99769d;

        /* renamed from: e, reason: collision with root package name */
        public long f99770e;

        /* renamed from: f, reason: collision with root package name */
        public long f99771f;

        /* renamed from: g, reason: collision with root package name */
        public int f99772g;

        /* renamed from: h, reason: collision with root package name */
        public int f99773h;

        /* renamed from: i, reason: collision with root package name */
        public int f99774i;

        /* renamed from: j, reason: collision with root package name */
        public int f99775j;

        /* renamed from: k, reason: collision with root package name */
        public int f99776k;

        /* renamed from: l, reason: collision with root package name */
        public int f99777l;

        /* renamed from: m, reason: collision with root package name */
        public int[] f99778m;

        @Override // ya.e.c
        public void a(InputStream is2) throws IOException {
            this.f99766a = ya.b.b(is2);
            this.f99767b = ya.b.b(is2);
            this.f99768c = ya.b.b(is2);
            this.f99769d = ya.b.b(is2);
            this.f99770e = ya.b.c(is2);
            this.f99771f = ya.b.c(is2);
            this.f99772g = ya.b.b(is2);
            this.f99773h = ya.b.b(is2);
            this.f99774i = ya.b.b(is2);
            this.f99775j = ya.b.b(is2);
            this.f99776k = ya.b.b(is2);
            this.f99777l = ya.b.b(is2);
            for (int i11 = 0; i11 < 18; i11++) {
                this.f99778m[i11] = ya.b.b(is2);
            }
        }

        @Override // ya.e.c
        public void c(OutputStream os2) throws IOException {
            ya.b.f(os2, this.f99766a);
            ya.b.f(os2, this.f99767b);
            ya.b.f(os2, this.f99768c);
            ya.b.f(os2, this.f99769d);
            ya.b.g(os2, this.f99770e);
            ya.b.g(os2, this.f99771f);
            ya.b.f(os2, this.f99772g);
            ya.b.f(os2, this.f99773h);
            ya.b.f(os2, this.f99774i);
            ya.b.f(os2, this.f99775j);
            ya.b.f(os2, this.f99776k);
            ya.b.f(os2, this.f99777l);
            for (int i11 = 0; i11 < 18; i11++) {
                ya.b.f(os2, this.f99778m[i11]);
            }
        }

        public String toString() {
            return "PackageHeader [sign=" + this.f99766a + ", version=" + this.f99767b + ", headerSize=" + this.f99768c + ", fileCount=" + this.f99769d + ", fileEntryOffset=" + this.f99770e + ", filenameOffset=" + this.f99771f + ", allFileEntrySize=" + this.f99772g + ", allFilenameSize=" + this.f99773h + ", originFilenamesSize=" + this.f99774i + ", chunkSize=" + this.f99775j + ", flag=" + this.f99776k + ", fileEntrySize=" + this.f99777l + ", reserved=" + Arrays.toString(this.f99778m) + "]";
        }

        public b() {
            super();
            this.f99778m = new int[18];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c {
        public abstract void a(InputStream is2) throws IOException;

        public void b(byte[] buffer) throws IOException {
            a(new ByteArrayInputStream(buffer));
        }

        public abstract void c(OutputStream os2) throws IOException;

        public byte[] d() throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(48);
            c(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }

        public c() {
        }
    }

    public e(String filename, int mode) throws IOException {
        this.f99746a = 1;
        this.f99747b = filename;
        this.f99746a = mode;
        try {
            if ((mode & 1) > 0) {
                this.f99748c = new RandomAccessFile(filename, r.f50027a);
            } else if ((mode & 4) > 0) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(filename, "rw");
                this.f99748c = randomAccessFile;
                if (randomAccessFile.length() == 0) {
                    b bVar = this.f99749d;
                    bVar.f99766a = f99740q;
                    bVar.f99767b = f99741r;
                    bVar.f99768c = 128;
                    bVar.f99769d = 0;
                    bVar.f99777l = 48;
                    bVar.f99770e = 128L;
                    bVar.f99772g = 0;
                    bVar.f99771f = 128L;
                    bVar.f99773h = 0;
                    bVar.f99775j = 4096;
                    this.f99754i = new byte[4096];
                    return;
                }
            }
            A();
            y();
            z();
            c();
            b bVar2 = this.f99749d;
            this.f99752g = bVar2.f99771f + bVar2.f99773h;
            if ((mode & 4) > 0) {
                this.f99754i = new byte[bVar2.f99775j];
            }
        } catch (IOException e11) {
            this.f99748c = null;
            throw e11;
        }
    }

    public static long E(String str, int seed) {
        long j11 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\\') {
                charAt = '/';
            }
            j11 = (j11 * seed) + Character.toLowerCase(charAt);
        }
        return j11;
    }

    public final synchronized void A() throws IOException {
        try {
            try {
                long length = this.f99748c.length();
                byte[] bArr = new byte[128];
                x(0L, bArr, 0, 128);
                this.f99749d.b(bArr);
                b bVar = this.f99749d;
                if (bVar.f99766a == 1262571610) {
                    long j11 = bVar.f99770e;
                    if (j11 >= bVar.f99768c) {
                        int i11 = bVar.f99772g;
                        if (i11 + j11 <= length) {
                            long j12 = bVar.f99771f;
                            if (j12 >= j11 + i11 && j12 + bVar.f99773h <= length) {
                                return;
                            }
                        }
                    }
                }
                throw new IOException("Package Header Error");
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized void B(String filename) {
        if ((this.f99746a & 1) > 0) {
            return;
        }
        int n11 = n(filename);
        if (n11 < 0) {
            return;
        }
        C(n11);
        this.f99753h = true;
    }

    public final synchronized void C(int index) {
        this.f99753h = true;
        a remove = this.f99750e.remove(index);
        this.f99749d.f99769d--;
        this.f99751f.remove(Long.valueOf(remove.f99757c));
    }

    public synchronized boolean D(a entry, int size) {
        entry.f99763i = size;
        this.f99753h = true;
        return true;
    }

    public synchronized void F(long offset, int b11) throws IOException {
        try {
            if (this.f99748c.getFilePointer() != offset) {
                this.f99748c.seek(offset);
            }
            this.f99748c.write(b11);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void G(long offset, byte[] buffer) throws IOException {
        try {
            try {
                H(offset, buffer, 0, buffer.length);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized void H(long offset, byte[] buffer, int byteOffset, int byteCount) throws IOException {
        try {
            if (this.f99748c.getFilePointer() != offset) {
                this.f99748c.seek(offset);
            }
            this.f99748c.write(buffer, byteOffset, byteCount);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void I() throws IOException {
        G(0L, this.f99749d.d());
    }

    public final synchronized void J(a entry, InputStream is2) throws IOException {
        this.f99748c.seek(entry.f99756b);
        int i11 = entry.f99759e;
        while (i11 > 0) {
            int i12 = this.f99749d.f99775j;
            if (i11 <= i12) {
                i12 = i11;
            }
            is2.read(this.f99754i, 0, i12);
            this.f99748c.write(this.f99754i, 0, i12);
            i11 -= i12;
        }
    }

    public final synchronized void K(boolean avoidOverwrite) throws IOException {
        if (this.f99749d.f99769d != this.f99750e.size()) {
            qb.c.d("ZPackage", "fileCount not match size", new Object[0]);
            return;
        }
        if (this.f99750e.isEmpty()) {
            b bVar = this.f99749d;
            bVar.f99769d = 0;
            bVar.f99772g = 0;
            bVar.f99773h = 0;
            bVar.f99770e = 128L;
            bVar.f99771f = 128L;
            bVar.f99774i = 0;
            return;
        }
        int size = this.f99750e.size() * 48;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(size);
        for (int i11 = 0; i11 < this.f99750e.size(); i11++) {
            this.f99750e.get(i11).c(byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < this.f99750e.size(); i12++) {
            sb2.append(this.f99750e.get(i12).f99755a);
            sb2.append("\n");
        }
        byte[] bytes = sb2.toString().getBytes(f99735l);
        int length = bytes.length;
        long j11 = l(this.f99750e.size() - 1).f99756b + r4.f99758d;
        if (avoidOverwrite) {
            b bVar2 = this.f99749d;
            long j12 = bVar2.f99771f;
            int i13 = bVar2.f99773h;
            if (j11 < i13 + j12 && size + j11 + length > bVar2.f99770e) {
                bVar2.f99770e = j12 + i13;
            }
            bVar2.f99770e = j11;
        } else {
            this.f99749d.f99770e = j11;
        }
        this.f99748c.seek(this.f99749d.f99770e);
        this.f99748c.write(byteArray);
        this.f99748c.write(bytes);
        b bVar3 = this.f99749d;
        bVar3.f99772g = size;
        long j13 = bVar3.f99770e + size;
        bVar3.f99771f = j13;
        bVar3.f99773h = length;
        bVar3.f99774i = length;
        this.f99752g = j13 + length;
        I();
    }

    public synchronized void a(String filename, String externalFilename) throws IOException {
        BufferedInputStream bufferedInputStream;
        if ((this.f99746a & 1) > 0) {
            throw new IOException("add file to read-only package");
        }
        int i11 = this.f99749d.f99775j;
        File file = new File(externalFilename);
        if (!file.exists()) {
            throw new IOException("file not exists: " + filename);
        }
        int length = (int) file.length();
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(externalFilename));
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                int n11 = n(filename);
                if (n11 >= 0) {
                    C(n11);
                }
                a aVar = new a();
                aVar.f99755a = filename;
                aVar.f99757c = E(filename, 131);
                aVar.f99758d = length;
                aVar.f99759e = length;
                aVar.f99760f = 0;
                aVar.f99761g = i11;
                aVar.f99762h = 0L;
                aVar.f99763i = length;
                aVar.f99764j = 0;
                this.f99753h = true;
                r(aVar);
                if (length == 0) {
                    aVar.f99760f &= -3;
                } else {
                    if ((aVar.f99760f & 2) != 0) {
                        throw new IOException("Compressed mode not supported");
                    }
                    J(aVar, bufferedInputStream);
                }
                bufferedInputStream.close();
            } catch (IOException e11) {
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream2 = bufferedInputStream;
                if (bufferedInputStream2 != null) {
                    bufferedInputStream2.close();
                }
                throw th;
            }
        } catch (IOException e12) {
            throw e12;
        }
    }

    public final synchronized int b(int index, a entry) {
        this.f99753h = true;
        this.f99750e.add(index, entry);
        this.f99749d.f99769d++;
        this.f99751f.put(entry.f99755a, entry);
        return index;
    }

    public final void c() {
        if ((this.f99746a & 1) > 0) {
            return;
        }
        Iterator<a> it = this.f99750e.iterator();
        while (it.hasNext()) {
            if ((it.next().f99760f & 1) > 0) {
                it.remove();
                this.f99753h = true;
            }
        }
        this.f99749d.f99769d = this.f99750e.size();
    }

    public void d() {
        if (this.f99748c != null) {
            try {
                h();
                this.f99748c.close();
            } catch (IOException unused) {
            } finally {
                this.f99748c = null;
            }
        }
    }

    public synchronized OutputStream e(String filename, int packSize) throws IOException {
        try {
            if ((this.f99746a & 1) > 0) {
                return null;
            }
            this.f99753h = true;
            int n11 = n(filename);
            if (n11 >= 0) {
                C(n11);
            }
            a aVar = new a();
            aVar.f99755a = filename;
            aVar.f99757c = E(filename, 131);
            aVar.f99760f = 0;
            aVar.f99758d = packSize;
            aVar.f99759e = 0;
            aVar.f99762h = 0L;
            aVar.f99763i = 0;
            aVar.f99764j = 0;
            aVar.f99761g = this.f99749d.f99775j;
            if (r(aVar) < 0) {
                return null;
            }
            return new d(this, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final byte[] f(InputStream is2) throws IOException {
        InflaterInputStream inflaterInputStream = new InflaterInputStream(is2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inflaterInputStream.read(bArr);
            if (read <= 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public final byte[] g(byte[] data) throws IOException {
        return f(new ByteArrayInputStream(data));
    }

    public synchronized void h() throws IOException {
        try {
            if ((this.f99746a & 1) <= 0 && this.f99753h) {
                K(false);
                b bVar = this.f99749d;
                long j11 = bVar.f99771f;
                int i11 = bVar.f99773h;
                if (i11 + j11 > this.f99752g) {
                    this.f99752g = j11 + i11;
                }
                this.f99753h = false;
            }
        } finally {
        }
    }

    public synchronized FileChannel i() {
        return this.f99748c.getChannel();
    }

    public synchronized FileDescriptor j() throws IOException {
        return this.f99748c.getFD();
    }

    public int k() {
        return this.f99749d.f99769d;
    }

    public synchronized a l(int index) {
        return this.f99750e.get(index);
    }

    public synchronized a m(String filename) {
        int n11 = n(filename);
        if (n11 < 0) {
            return null;
        }
        return l(n11);
    }

    public final int n(String filename) {
        a aVar = this.f99751f.get(filename);
        if (aVar == null) {
            return -1;
        }
        return this.f99750e.indexOf(aVar);
    }

    public String o() {
        return this.f99747b;
    }

    public synchronized boolean p(String filename) {
        return n(filename) >= 0;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x002e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final synchronized void q(long r12, int r14, int r15) throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            if (r14 <= 0) goto L35
            if (r15 <= 0) goto L35
            long r0 = (long) r15
            long r0 = r12 - r0
            r3 = r12
        L9:
            if (r14 <= 0) goto L35
            ya.e$b r12 = r11.f99749d     // Catch: java.lang.Throwable -> L30
            int r12 = r12.f99775j     // Catch: java.lang.Throwable -> L30
            if (r14 <= r12) goto L13
            r7 = r12
            goto L14
        L13:
            r7 = r14
        L14:
            byte[] r5 = r11.f99754i     // Catch: java.lang.Throwable -> L30
            r6 = 0
            r2 = r11
            r2.x(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L2e
            byte[] r8 = r2.f99754i     // Catch: java.lang.Throwable -> L2e
            r9 = 0
            r5 = r2
            r10 = r7
            r6 = r0
            r5.H(r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L2a
            long r12 = (long) r10
            long r3 = r3 + r12
            long r0 = r6 + r12
            int r14 = r14 - r10
            goto L9
        L2a:
            r0 = move-exception
            r2 = r5
        L2c:
            r12 = r0
            goto L33
        L2e:
            r0 = move-exception
            goto L2c
        L30:
            r0 = move-exception
            r2 = r11
            goto L2c
        L33:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L2e
            throw r12
        L35:
            r2 = r11
            monitor-exit(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.e.q(long, int, int):void");
    }

    public final synchronized int r(a entry) {
        try {
            int size = this.f99750e.size();
            long j11 = this.f99749d.f99768c;
            for (int i11 = 0; i11 < size; i11++) {
                long j12 = this.f99750e.get(i11).f99756b;
                int i12 = entry.f99758d;
                if (j12 >= i12 + j11) {
                    long j13 = i12 + j11;
                    b bVar = this.f99749d;
                    if (j13 > bVar.f99770e && j11 < bVar.f99771f + bVar.f99773h) {
                    }
                    entry.f99756b = j11;
                    return b(i11, entry);
                }
                j11 = r4.f99758d + j12;
            }
            if (size != 0) {
                long j14 = this.f99749d.f99770e;
                int i13 = entry.f99758d;
                if (j14 <= i13 + j11) {
                    long j15 = this.f99752g;
                    entry.f99756b = j15;
                    this.f99752g = j15 + i13;
                    return b(this.f99750e.size(), entry);
                }
            }
            entry.f99756b = j11;
            int i14 = entry.f99758d;
            if (i14 + j11 > this.f99752g) {
                this.f99752g = j11 + i14;
            }
            return b(this.f99750e.size(), entry);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean s() {
        return this.f99748c != null;
    }

    public synchronized InputStream t(String filename) throws IOException {
        a l11;
        int n11 = n(filename);
        if (n11 < 0) {
            throw new IOException("file not exists " + filename);
        }
        l11 = l(n11);
        if ((l11.f99760f & 2) != 0) {
            throw new IOException("Compressed mode not supported");
        }
        return new ya.c(this, l11.f99756b, l11.f99763i);
    }

    public synchronized OutputStream u(String filename) {
        if ((this.f99746a & 1) > 0) {
            return null;
        }
        int n11 = n(filename);
        if (n11 < 0) {
            return null;
        }
        return new d(this, l(n11));
    }

    public synchronized int v(long offset) throws IOException {
        try {
            if (this.f99748c.getFilePointer() != offset) {
                this.f99748c.seek(offset);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f99748c.read();
    }

    public synchronized int w(long offset, byte[] buffer) throws IOException {
        try {
            try {
                return x(offset, buffer, 0, buffer.length);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized int x(long offset, byte[] buffer, int byteOffset, int byteCount) throws IOException {
        try {
            if (this.f99748c.getFilePointer() != offset) {
                this.f99748c.seek(offset);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f99748c.read(buffer, byteOffset, byteCount);
    }

    public final synchronized void y() throws IOException {
        try {
            this.f99750e.clear();
            b bVar = this.f99749d;
            if (bVar.f99769d == 0) {
                return;
            }
            byte[] bArr = new byte[bVar.f99772g];
            w(bVar.f99770e, bArr);
            b bVar2 = this.f99749d;
            ByteArrayInputStream byteArrayInputStream = bVar2.f99772g == bVar2.f99777l * bVar2.f99769d ? new ByteArrayInputStream(bArr) : new ByteArrayInputStream(g(bArr));
            for (int i11 = 0; i11 < this.f99749d.f99769d; i11++) {
                a aVar = new a();
                aVar.a(byteArrayInputStream);
                this.f99750e.add(aVar);
            }
            byteArrayInputStream.close();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void z() throws IOException {
        try {
            b bVar = this.f99749d;
            if (bVar.f99769d == 0) {
                return;
            }
            byte[] bArr = new byte[bVar.f99773h];
            w(bVar.f99771f, bArr);
            b bVar2 = this.f99749d;
            BufferedReader bufferedReader = bVar2.f99773h == bVar2.f99774i ? new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), f99735l)) : new BufferedReader(new InputStreamReader(new ByteArrayInputStream(g(bArr)), f99735l));
            for (int i11 = 0; i11 < this.f99749d.f99769d; i11++) {
                String readLine = bufferedReader.readLine();
                long E = E(readLine, 131);
                a aVar = this.f99750e.get(i11);
                aVar.f99755a = readLine;
                aVar.f99757c = E;
                this.f99751f.put(readLine, aVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
