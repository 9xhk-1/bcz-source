package r00;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.io.AccessDeniedException;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h implements q30.m<File> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final File f82784a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final FileWalkDirection f82785b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final x00.l<File, Boolean> f82786c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final x00.l<File, g2> f82787d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final x00.p<File, IOException, g2> f82788e;

    /* renamed from: f, reason: collision with root package name */
    public final int f82789f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k File rootDir) {
            super(rootDir);
            g0.p(rootDir, "rootDir");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b extends a00.c<File> {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final ArrayDeque<c> f82790c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class a extends a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f82792b;

            /* renamed from: c, reason: collision with root package name */
            @m80.l
            public File[] f82793c;

            /* renamed from: d, reason: collision with root package name */
            public int f82794d;

            /* renamed from: e, reason: collision with root package name */
            public boolean f82795e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f82796f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@m80.k b bVar, File rootDir) {
                super(rootDir);
                g0.p(rootDir, "rootDir");
                this.f82796f = bVar;
            }

            @Override // r00.h.c
            @m80.l
            public File b() {
                if (!this.f82795e && this.f82793c == null) {
                    x00.l lVar = h.this.f82786c;
                    if (lVar != null && !((Boolean) lVar.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f82793c = listFiles;
                    if (listFiles == null) {
                        x00.p pVar = h.this.f82788e;
                        if (pVar != null) {
                            pVar.invoke(a(), new AccessDeniedException(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f82795e = true;
                    }
                }
                File[] fileArr = this.f82793c;
                if (fileArr != null) {
                    int i11 = this.f82794d;
                    g0.m(fileArr);
                    if (i11 < fileArr.length) {
                        File[] fileArr2 = this.f82793c;
                        g0.m(fileArr2);
                        int i12 = this.f82794d;
                        this.f82794d = i12 + 1;
                        return fileArr2[i12];
                    }
                }
                if (!this.f82792b) {
                    this.f82792b = true;
                    return a();
                }
                x00.l lVar2 = h.this.f82787d;
                if (lVar2 != null) {
                    lVar2.invoke(a());
                }
                return null;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        /* renamed from: r00.h$b$b, reason: collision with other inner class name */
        public final class C1025b extends c {

            /* renamed from: b, reason: collision with root package name */
            public boolean f82797b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f82798c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1025b(@m80.k b bVar, File rootFile) {
                super(rootFile);
                g0.p(rootFile, "rootFile");
                this.f82798c = bVar;
            }

            @Override // r00.h.c
            @m80.l
            public File b() {
                if (this.f82797b) {
                    return null;
                }
                this.f82797b = true;
                return a();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public boolean f82799b;

            /* renamed from: c, reason: collision with root package name */
            @m80.l
            public File[] f82800c;

            /* renamed from: d, reason: collision with root package name */
            public int f82801d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ b f82802e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@m80.k b bVar, File rootDir) {
                super(rootDir);
                g0.p(rootDir, "rootDir");
                this.f82802e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // r00.h.c
            @m80.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r9 = this;
                    boolean r0 = r9.f82799b
                    r1 = 0
                    if (r0 != 0) goto L28
                    r00.h$b r0 = r9.f82802e
                    r00.h r0 = r00.h.this
                    x00.l r0 = r00.h.e(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r9.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r9.f82799b = r0
                    java.io.File r0 = r9.a()
                    return r0
                L28:
                    java.io.File[] r0 = r9.f82800c
                    if (r0 == 0) goto L47
                    int r2 = r9.f82801d
                    kotlin.jvm.internal.g0.m(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    r00.h$b r0 = r9.f82802e
                    r00.h r0 = r00.h.this
                    x00.l r0 = r00.h.g(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r9.f82800c
                    if (r0 != 0) goto L92
                    java.io.File r0 = r9.a()
                    java.io.File[] r0 = r0.listFiles()
                    r9.f82800c = r0
                    if (r0 != 0) goto L76
                    r00.h$b r0 = r9.f82802e
                    r00.h r0 = r00.h.this
                    x00.p r0 = r00.h.f(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r9.a()
                    kotlin.io.AccessDeniedException r3 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r9.a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L76:
                    java.io.File[] r0 = r9.f82800c
                    if (r0 == 0) goto L80
                    kotlin.jvm.internal.g0.m(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    r00.h$b r0 = r9.f82802e
                    r00.h r0 = r00.h.this
                    x00.l r0 = r00.h.g(r0)
                    if (r0 == 0) goto L91
                    java.io.File r2 = r9.a()
                    r0.invoke(r2)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r9.f82800c
                    kotlin.jvm.internal.g0.m(r0)
                    int r1 = r9.f82801d
                    int r2 = r1 + 1
                    r9.f82801d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: r00.h.b.c.b():java.io.File");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f82803a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f82803a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.f82790c = arrayDeque;
            if (h.this.f82784a.isDirectory()) {
                arrayDeque.push(e(h.this.f82784a));
            } else if (h.this.f82784a.isFile()) {
                arrayDeque.push(new C1025b(this, h.this.f82784a));
            } else {
                b();
            }
        }

        @Override // a00.c
        public void a() {
            File f11 = f();
            if (f11 != null) {
                c(f11);
            } else {
                b();
            }
        }

        public final a e(File file) {
            int i11 = d.f82803a[h.this.f82785b.ordinal()];
            if (i11 == 1) {
                return new c(this, file);
            }
            if (i11 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final File f() {
            File b11;
            while (true) {
                c peek = this.f82790c.peek();
                if (peek == null) {
                    return null;
                }
                b11 = peek.b();
                if (b11 == null) {
                    this.f82790c.pop();
                } else {
                    if (g0.g(b11, peek.a()) || !b11.isDirectory() || this.f82790c.size() >= h.this.f82789f) {
                        break;
                    }
                    this.f82790c.push(e(b11));
                }
            }
            return b11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final File f82804a;

        public c(@m80.k File root) {
            g0.p(root, "root");
            this.f82804a = root;
        }

        @m80.k
        public final File a() {
            return this.f82804a;
        }

        @m80.l
        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(File file, FileWalkDirection fileWalkDirection, x00.l<? super File, Boolean> lVar, x00.l<? super File, g2> lVar2, x00.p<? super File, ? super IOException, g2> pVar, int i11) {
        this.f82784a = file;
        this.f82785b = fileWalkDirection;
        this.f82786c = lVar;
        this.f82787d = lVar2;
        this.f82788e = pVar;
        this.f82789f = i11;
    }

    @m80.k
    public final h i(int i11) {
        if (i11 > 0) {
            return new h(this.f82784a, this.f82785b, this.f82786c, this.f82787d, this.f82788e, i11);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i11 + '.');
    }

    @Override // q30.m
    @m80.k
    public Iterator<File> iterator() {
        return new b();
    }

    @m80.k
    public final h j(@m80.k x00.l<? super File, Boolean> function) {
        g0.p(function, "function");
        return new h(this.f82784a, this.f82785b, function, this.f82787d, this.f82788e, this.f82789f);
    }

    @m80.k
    public final h k(@m80.k x00.p<? super File, ? super IOException, g2> function) {
        g0.p(function, "function");
        return new h(this.f82784a, this.f82785b, this.f82786c, this.f82787d, function, this.f82789f);
    }

    @m80.k
    public final h l(@m80.k x00.l<? super File, g2> function) {
        g0.p(function, "function");
        return new h(this.f82784a, this.f82785b, this.f82786c, function, this.f82788e, this.f82789f);
    }

    public /* synthetic */ h(File file, FileWalkDirection fileWalkDirection, x00.l lVar, x00.l lVar2, x00.p pVar, int i11, int i12, v vVar) {
        this(file, (i12 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, lVar, lVar2, pVar, (i12 & 32) != 0 ? Integer.MAX_VALUE : i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(@m80.k File start, @m80.k FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        g0.p(start, "start");
        g0.p(direction, "direction");
    }

    public /* synthetic */ h(File file, FileWalkDirection fileWalkDirection, int i11, v vVar) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }
}
