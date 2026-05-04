package gk;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    public static final String f53885o = "journal";

    /* renamed from: p, reason: collision with root package name */
    public static final String f53886p = "journal.tmp";

    /* renamed from: q, reason: collision with root package name */
    public static final String f53887q = "journal.bkp";

    /* renamed from: r, reason: collision with root package name */
    public static final String f53888r = "libcore.io.DiskLruCache";

    /* renamed from: s, reason: collision with root package name */
    public static final String f53889s = "1";

    /* renamed from: t, reason: collision with root package name */
    public static final long f53890t = -1;

    /* renamed from: u, reason: collision with root package name */
    public static final String f53891u = "CLEAN";

    /* renamed from: v, reason: collision with root package name */
    public static final String f53892v = "DIRTY";

    /* renamed from: w, reason: collision with root package name */
    public static final String f53893w = "REMOVE";

    /* renamed from: x, reason: collision with root package name */
    public static final String f53894x = "READ";

    /* renamed from: a, reason: collision with root package name */
    public final File f53895a;

    /* renamed from: b, reason: collision with root package name */
    public final File f53896b;

    /* renamed from: c, reason: collision with root package name */
    public final File f53897c;

    /* renamed from: d, reason: collision with root package name */
    public final File f53898d;

    /* renamed from: e, reason: collision with root package name */
    public final int f53899e;

    /* renamed from: f, reason: collision with root package name */
    public long f53900f;

    /* renamed from: g, reason: collision with root package name */
    public final int f53901g;

    /* renamed from: i, reason: collision with root package name */
    public Writer f53903i;

    /* renamed from: k, reason: collision with root package name */
    public int f53905k;

    /* renamed from: h, reason: collision with root package name */
    public long f53902h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap<String, d> f53904j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    public long f53906l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final ThreadPoolExecutor f53907m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0637b(null));

    /* renamed from: n, reason: collision with root package name */
    public final Callable<Void> f53908n = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (b.this) {
                try {
                    if (b.this.f53903i == null) {
                        return null;
                    }
                    b.this.x0();
                    if (b.this.f0()) {
                        b.this.o0();
                        b.this.f53905k = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: gk.b$b, reason: collision with other inner class name */
    public static final class ThreadFactoryC0637b implements ThreadFactory {
        public ThreadFactoryC0637b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ ThreadFactoryC0637b(a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public final d f53910a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f53911b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f53912c;

        public /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        public void a() throws IOException {
            b.this.H(this, false);
        }

        public void b() {
            if (this.f53912c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            b.this.H(this, true);
            this.f53912c = true;
        }

        public File f(int i11) throws IOException {
            File k11;
            synchronized (b.this) {
                try {
                    if (this.f53910a.f53919f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f53910a.f53918e) {
                        this.f53911b[i11] = true;
                    }
                    k11 = this.f53910a.k(i11);
                    b.this.f53895a.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return k11;
        }

        public String g(int i11) throws IOException {
            InputStream h11 = h(i11);
            if (h11 != null) {
                return b.d0(h11);
            }
            return null;
        }

        public final InputStream h(int i11) throws IOException {
            synchronized (b.this) {
                if (this.f53910a.f53919f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f53910a.f53918e) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f53910a.j(i11));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public void i(int i11, String str) throws IOException {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(f(i11)), gk.e.f53936b);
                try {
                    outputStreamWriter2.write(str);
                    gk.e.a(outputStreamWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    gk.e.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public c(d dVar) {
            this.f53910a = dVar;
            this.f53911b = dVar.f53918e ? null : new boolean[b.this.f53901g];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f53914a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f53915b;

        /* renamed from: c, reason: collision with root package name */
        public File[] f53916c;

        /* renamed from: d, reason: collision with root package name */
        public File[] f53917d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f53918e;

        /* renamed from: f, reason: collision with root package name */
        public c f53919f;

        /* renamed from: g, reason: collision with root package name */
        public long f53920g;

        public /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        public File j(int i11) {
            return this.f53916c[i11];
        }

        public File k(int i11) {
            return this.f53917d[i11];
        }

        public String l() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j11 : this.f53915b) {
                sb2.append(' ');
                sb2.append(j11);
            }
            return sb2.toString();
        }

        public final IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) throws IOException {
            if (strArr.length != b.this.f53901g) {
                throw m(strArr);
            }
            for (int i11 = 0; i11 < strArr.length; i11++) {
                try {
                    this.f53915b[i11] = Long.parseLong(strArr[i11]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public d(String str) {
            this.f53914a = str;
            this.f53915b = new long[b.this.f53901g];
            this.f53916c = new File[b.this.f53901g];
            this.f53917d = new File[b.this.f53901g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < b.this.f53901g; i11++) {
                sb2.append(i11);
                this.f53916c[i11] = new File(b.this.f53895a, sb2.toString());
                sb2.append(".tmp");
                this.f53917d[i11] = new File(b.this.f53895a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f53922a;

        /* renamed from: b, reason: collision with root package name */
        public final long f53923b;

        /* renamed from: c, reason: collision with root package name */
        public final long[] f53924c;

        /* renamed from: d, reason: collision with root package name */
        public final File[] f53925d;

        public /* synthetic */ e(b bVar, String str, long j11, File[] fileArr, long[] jArr, a aVar) {
            this(str, j11, fileArr, jArr);
        }

        public c a() throws IOException {
            return b.this.U(this.f53922a, this.f53923b);
        }

        public File b(int i11) {
            return this.f53925d[i11];
        }

        public long c(int i11) {
            return this.f53924c[i11];
        }

        public String d(int i11) throws IOException {
            return b.d0(new FileInputStream(this.f53925d[i11]));
        }

        public e(String str, long j11, File[] fileArr, long[] jArr) {
            this.f53922a = str;
            this.f53923b = j11;
            this.f53925d = fileArr;
            this.f53924c = jArr;
        }
    }

    public b(File file, int i11, int i12, long j11) {
        this.f53895a = file;
        this.f53899e = i11;
        this.f53896b = new File(file, "journal");
        this.f53897c = new File(file, "journal.tmp");
        this.f53898d = new File(file, "journal.bkp");
        this.f53901g = i12;
        this.f53900f = j11;
    }

    @TargetApi(26)
    public static void E(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void L(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void V(Writer writer) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static String d0(InputStream inputStream) throws IOException {
        return gk.e.c(new InputStreamReader(inputStream, gk.e.f53936b));
    }

    public static b h0(File file, int i11, int i12, long j11) throws IOException {
        if (j11 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i12 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                v0(file2, file3, false);
            }
        }
        b bVar = new b(file, i11, i12, j11);
        if (bVar.f53896b.exists()) {
            try {
                bVar.k0();
                bVar.i0();
                return bVar;
            } catch (IOException e11) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e11.getMessage() + ", removing");
                bVar.I();
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, i11, i12, j11);
        bVar2.o0();
        return bVar2;
    }

    public static void v0(File file, File file2, boolean z11) throws IOException {
        if (z11) {
            L(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void C() {
        if (this.f53903i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void H(c cVar, boolean z11) throws IOException {
        d dVar = cVar.f53910a;
        if (dVar.f53919f != cVar) {
            throw new IllegalStateException();
        }
        if (z11 && !dVar.f53918e) {
            for (int i11 = 0; i11 < this.f53901g; i11++) {
                if (!cVar.f53911b[i11]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!dVar.k(i11).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i12 = 0; i12 < this.f53901g; i12++) {
            File k11 = dVar.k(i12);
            if (!z11) {
                L(k11);
            } else if (k11.exists()) {
                File j11 = dVar.j(i12);
                k11.renameTo(j11);
                long j12 = dVar.f53915b[i12];
                long length = j11.length();
                dVar.f53915b[i12] = length;
                this.f53902h = (this.f53902h - j12) + length;
            }
        }
        this.f53905k++;
        dVar.f53919f = null;
        if (dVar.f53918e || z11) {
            dVar.f53918e = true;
            this.f53903i.append((CharSequence) "CLEAN");
            this.f53903i.append(' ');
            this.f53903i.append((CharSequence) dVar.f53914a);
            this.f53903i.append((CharSequence) dVar.l());
            this.f53903i.append('\n');
            if (z11) {
                long j13 = this.f53906l;
                this.f53906l = 1 + j13;
                dVar.f53920g = j13;
            }
        } else {
            this.f53904j.remove(dVar.f53914a);
            this.f53903i.append((CharSequence) "REMOVE");
            this.f53903i.append(' ');
            this.f53903i.append((CharSequence) dVar.f53914a);
            this.f53903i.append('\n');
        }
        V(this.f53903i);
        if (this.f53902h > this.f53900f || f0()) {
            this.f53907m.submit(this.f53908n);
        }
    }

    public void I() throws IOException {
        close();
        gk.e.b(this.f53895a);
    }

    public c S(String str) throws IOException {
        return U(str, -1L);
    }

    public final synchronized c U(String str, long j11) throws IOException {
        C();
        d dVar = this.f53904j.get(str);
        a aVar = null;
        if (j11 != -1 && (dVar == null || dVar.f53920g != j11)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f53904j.put(str, dVar);
        } else if (dVar.f53919f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f53919f = cVar;
        this.f53903i.append((CharSequence) "DIRTY");
        this.f53903i.append(' ');
        this.f53903i.append((CharSequence) str);
        this.f53903i.append('\n');
        V(this.f53903i);
        return cVar;
    }

    public synchronized e Z(String str) throws IOException {
        Throwable th2;
        try {
            try {
                C();
                d dVar = this.f53904j.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f53918e) {
                    return null;
                }
                for (File file : dVar.f53916c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                this.f53905k++;
                this.f53903i.append((CharSequence) "READ");
                this.f53903i.append(' ');
                this.f53903i.append((CharSequence) str);
                this.f53903i.append('\n');
                if (f0()) {
                    this.f53907m.submit(this.f53908n);
                }
                return new e(this, str, dVar.f53920g, dVar.f53916c, dVar.f53915b, null);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public File a0() {
        return this.f53895a;
    }

    public synchronized long c0() {
        return this.f53900f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f53903i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f53904j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f53919f != null) {
                    dVar.f53919f.a();
                }
            }
            x0();
            E(this.f53903i);
            this.f53903i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean f0() {
        int i11 = this.f53905k;
        return i11 >= 2000 && i11 >= this.f53904j.size();
    }

    public synchronized void flush() throws IOException {
        C();
        x0();
        V(this.f53903i);
    }

    public final void i0() throws IOException {
        L(this.f53897c);
        Iterator<d> it = this.f53904j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i11 = 0;
            if (next.f53919f == null) {
                while (i11 < this.f53901g) {
                    this.f53902h += next.f53915b[i11];
                    i11++;
                }
            } else {
                next.f53919f = null;
                while (i11 < this.f53901g) {
                    L(next.j(i11));
                    L(next.k(i11));
                    i11++;
                }
                it.remove();
            }
        }
    }

    public synchronized boolean isClosed() {
        return this.f53903i == null;
    }

    public final void k0() throws IOException {
        gk.d dVar = new gk.d(new FileInputStream(this.f53896b), gk.e.f53935a);
        try {
            String f11 = dVar.f();
            String f12 = dVar.f();
            String f13 = dVar.f();
            String f14 = dVar.f();
            String f15 = dVar.f();
            if (!"libcore.io.DiskLruCache".equals(f11) || !"1".equals(f12) || !Integer.toString(this.f53899e).equals(f13) || !Integer.toString(this.f53901g).equals(f14) || !"".equals(f15)) {
                throw new IOException("unexpected journal header: [" + f11 + j2.O + f12 + j2.O + f14 + j2.O + f15 + "]");
            }
            int i11 = 0;
            while (true) {
                try {
                    m0(dVar.f());
                    i11++;
                } catch (EOFException unused) {
                    this.f53905k = i11 - this.f53904j.size();
                    if (dVar.e()) {
                        o0();
                    } else {
                        this.f53903i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f53896b, true), gk.e.f53935a));
                    }
                    gk.e.a(dVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            gk.e.a(dVar);
            throw th2;
        }
    }

    public final void m0(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i11 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i11);
        if (indexOf2 == -1) {
            substring = str.substring(i11);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.f53904j.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i11, indexOf2);
        }
        d dVar = this.f53904j.get(substring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, substring, aVar);
            this.f53904j.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.f53918e = true;
            dVar.f53919f = null;
            dVar.n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f53919f = new c(this, dVar, aVar);
            return;
        }
        if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void o0() throws IOException {
        try {
            Writer writer = this.f53903i;
            if (writer != null) {
                E(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f53897c), gk.e.f53935a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f53899e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f53901g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f53904j.values()) {
                    if (dVar.f53919f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f53914a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f53914a + dVar.l() + '\n');
                    }
                }
                E(bufferedWriter);
                if (this.f53896b.exists()) {
                    v0(this.f53896b, this.f53898d, true);
                }
                v0(this.f53897c, this.f53896b, false);
                this.f53898d.delete();
                this.f53903i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f53896b, true), gk.e.f53935a));
            } catch (Throwable th2) {
                E(bufferedWriter);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized boolean s0(String str) throws IOException {
        try {
            C();
            d dVar = this.f53904j.get(str);
            if (dVar != null && dVar.f53919f == null) {
                for (int i11 = 0; i11 < this.f53901g; i11++) {
                    File j11 = dVar.j(i11);
                    if (j11.exists() && !j11.delete()) {
                        throw new IOException("failed to delete " + j11);
                    }
                    this.f53902h -= dVar.f53915b[i11];
                    dVar.f53915b[i11] = 0;
                }
                this.f53905k++;
                this.f53903i.append((CharSequence) "REMOVE");
                this.f53903i.append(' ');
                this.f53903i.append((CharSequence) str);
                this.f53903i.append('\n');
                this.f53904j.remove(str);
                if (f0()) {
                    this.f53907m.submit(this.f53908n);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public synchronized long size() {
        return this.f53902h;
    }

    public synchronized void w0(long j11) {
        this.f53900f = j11;
        this.f53907m.submit(this.f53908n);
    }

    public final void x0() throws IOException {
        while (this.f53902h > this.f53900f) {
            s0(this.f53904j.entrySet().iterator().next().getKey());
        }
    }
}
