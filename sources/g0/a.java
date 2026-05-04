package g0;

import android.os.StatFs;
import androidx.annotation.FloatRange;
import c40.h1;
import c40.m0;
import g10.u;
import java.io.Closeable;
import java.io.File;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import okio.f;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskCache.kt\ncoil/disk/DiskCache$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
    /* renamed from: g0.a$a, reason: collision with other inner class name */
    public static final class C0620a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public f f52431a;

        /* renamed from: f, reason: collision with root package name */
        public long f52436f;

        /* renamed from: b, reason: collision with root package name */
        @k
        public okio.b f52432b = okio.b.f77535b;

        /* renamed from: c, reason: collision with root package name */
        public double f52433c = 0.02d;

        /* renamed from: d, reason: collision with root package name */
        public long f52434d = 10485760;

        /* renamed from: e, reason: collision with root package name */
        public long f52435e = 262144000;

        /* renamed from: g, reason: collision with root package name */
        @k
        public m0 f52437g = h1.c();

        @k
        public final a a() {
            long j11;
            f fVar = this.f52431a;
            if (fVar == null) {
                throw new IllegalStateException("directory == null");
            }
            if (this.f52433c > 0.0d) {
                try {
                    File file = fVar.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    j11 = u.K((long) (this.f52433c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f52434d, this.f52435e);
                } catch (Exception unused) {
                    j11 = this.f52434d;
                }
            } else {
                j11 = this.f52436f;
            }
            return new d(j11, fVar, this.f52432b, this.f52437g);
        }

        @k
        public final C0620a b(@k m0 m0Var) {
            this.f52437g = m0Var;
            return this;
        }

        @k
        public final C0620a c(@k File file) {
            return d(f.a.g(f.f77539b, file, false, 1, null));
        }

        @k
        public final C0620a d(@k f fVar) {
            this.f52431a = fVar;
            return this;
        }

        @k
        public final C0620a e(@k okio.b bVar) {
            this.f52432b = bVar;
            return this;
        }

        @k
        public final C0620a f(long j11) {
            if (j11 <= 0) {
                throw new IllegalArgumentException("size must be > 0.");
            }
            this.f52433c = 0.0d;
            this.f52436f = j11;
            return this;
        }

        @k
        public final C0620a g(@FloatRange(from = 0.0d, to = 1.0d) double d11) {
            if (0.0d > d11 || d11 > 1.0d) {
                throw new IllegalArgumentException("size must be in the range [0.0, 1.0].");
            }
            this.f52436f = 0L;
            this.f52433c = d11;
            return this;
        }

        @k
        public final C0620a h(long j11) {
            if (j11 <= 0) {
                throw new IllegalArgumentException("size must be > 0.");
            }
            this.f52435e = j11;
            return this;
        }

        @k
        public final C0620a i(long j11) {
            if (j11 <= 0) {
                throw new IllegalArgumentException("size must be > 0.");
            }
            this.f52434d = j11;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @c0.a
    public interface b {
        @l
        c a();

        void abort();

        @l
        @n(message = "Renamed to 'commitAndOpenSnapshot'.", replaceWith = @w0(expression = "commitAndOpenSnapshot()", imports = {}))
        c b();

        void commit();

        @k
        f getData();

        @k
        f getMetadata();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @c0.a
    public interface c extends Closeable {
        @l
        b C7();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        @k
        f getData();

        @k
        f getMetadata();

        @l
        @n(message = "Renamed to 'closeAndOpenEditor'.", replaceWith = @w0(expression = "closeAndOpenEditor()", imports = {}))
        b m3();
    }

    long a();

    @c0.a
    void clear();

    @k
    f d();

    @l
    @c0.a
    b f(@k String str);

    @l
    @c0.a
    c g(@k String str);

    @l
    @c0.a
    @n(message = "Renamed to 'openSnapshot'.", replaceWith = @w0(expression = "openSnapshot(key)", imports = {}))
    c get(@k String str);

    @k
    okio.b getFileSystem();

    long getSize();

    @l
    @c0.a
    @n(message = "Renamed to 'openEditor'.", replaceWith = @w0(expression = "openEditor(key)", imports = {}))
    b h(@k String str);

    @c0.a
    boolean remove(@k String str);

    @c0.a
    static /* synthetic */ void b() {
    }

    @c0.a
    static /* synthetic */ void c() {
    }

    @c0.a
    static /* synthetic */ void e() {
    }

    @c0.a
    static /* synthetic */ void i() {
    }
}
