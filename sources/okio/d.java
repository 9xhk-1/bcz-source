package okio;

import a00.l0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import l60.e1;
import l60.f0;
import l60.g1;
import l60.r;
import l60.r0;
import l60.s;
import m80.k;
import m80.l;
import okio.f;
import t00.w2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNioFileSystemWrappingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,196:1\n1634#2,3:197\n1#3:200\n37#4,2:201\n37#4,2:203\n37#4,2:205\n*S KotlinDebug\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n*L\n77#1:197,3\n104#1:201,2\n125#1:203,2\n138#1:205,2\n*E\n"})
/* loaded from: classes8.dex */
public final class d extends e {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final FileSystem f77538e;

    public d(@k FileSystem nioFileSystem) {
        g0.p(nioFileSystem, "nioFileSystem");
        this.f77538e = nioFileSystem;
    }

    @Override // okio.c, okio.b
    @k
    public e1 D0(@k f file, boolean z11) {
        OutputStream newOutputStream;
        StandardOpenOption standardOpenOption;
        g0.p(file, "file");
        List j11 = a00.g0.j();
        if (z11) {
            standardOpenOption = StandardOpenOption.CREATE_NEW;
            j11.add(standardOpenOption);
        }
        List b11 = a00.g0.b(j11);
        try {
            Path P0 = P0(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) b11.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            newOutputStream = Files.newOutputStream(P0, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            g0.o(newOutputStream, "newOutputStream(...)");
            return r0.p(newOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.c, okio.b
    @k
    public g1 F0(@k f file) {
        InputStream newInputStream;
        g0.p(file, "file");
        try {
            newInputStream = Files.newInputStream(P0(file), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            g0.o(newInputStream, "newInputStream(...)");
            return r0.v(newInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    public final List<f> G0(f fVar, boolean z11) {
        boolean exists;
        Path P0 = P0(fVar);
        try {
            List u12 = w2.u1(P0, null, 1, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = u12.iterator();
            while (it.hasNext()) {
                arrayList.add(f.a.i(f.f77539b, io.ktor.server.engine.u0.a(it.next()), false, 1, null));
            }
            l0.o0(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (!z11) {
                return null;
            }
            exists = Files.exists(P0, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
            if (exists) {
                throw new IOException("failed to list " + fVar);
            }
            throw new FileNotFoundException("no such file: " + fVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.j() == true) goto L8;
     */
    @Override // okio.c, okio.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I(@m80.k okio.f r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.g0.p(r4, r0)
            l60.s r0 = r3.w0(r4)
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.j()
            r2 = 1
            if (r0 != r2) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 == 0) goto L31
            if (r5 != 0) goto L1a
            goto L31
        L1a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " already exists."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L31:
            java.nio.file.Path r5 = r3.P0(r4)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L47
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0     // Catch: java.io.IOException -> L47
            java.nio.file.Path r5 = t00.h2.a(r5, r0)     // Catch: java.io.IOException -> L47
            java.lang.String r0 = "createDirectory(...)"
            kotlin.jvm.internal.g0.o(r5, r0)     // Catch: java.io.IOException -> L47
            return
        L47:
            r5 = move-exception
            if (r2 == 0) goto L4b
            return
        L4b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed to create directory: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.d.I(okio.f, boolean):void");
    }

    public final Path P0(f fVar) {
        Path path;
        path = this.f77538e.getPath(fVar.toString(), new String[0]);
        g0.o(path, "getPath(...)");
        return path;
    }

    @Override // okio.e, okio.c, okio.b
    public void S(@k f source, @k f target) {
        Path createSymbolicLink;
        g0.p(source, "source");
        g0.p(target, "target");
        createSymbolicLink = Files.createSymbolicLink(P0(source), P0(target), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0));
        g0.o(createSymbolicLink, "createSymbolicLink(...)");
    }

    @Override // okio.c, okio.b
    public void V(@k f path, boolean z11) {
        boolean exists;
        g0.p(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        Path P0 = P0(path);
        try {
            Files.delete(P0);
        } catch (NoSuchFileException unused) {
            if (z11) {
                throw new FileNotFoundException("no such file: " + path);
            }
        } catch (IOException unused2) {
            exists = Files.exists(P0, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
            if (exists) {
                throw new IOException("failed to delete " + path);
            }
        }
    }

    @Override // okio.b, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f77538e.close();
    }

    @Override // okio.c, okio.b
    @k
    public e1 i(@k f file, boolean z11) {
        StandardOpenOption standardOpenOption;
        OutputStream newOutputStream;
        StandardOpenOption standardOpenOption2;
        g0.p(file, "file");
        List j11 = a00.g0.j();
        standardOpenOption = StandardOpenOption.APPEND;
        j11.add(standardOpenOption);
        if (!z11) {
            standardOpenOption2 = StandardOpenOption.CREATE;
            j11.add(standardOpenOption2);
        }
        List b11 = a00.g0.b(j11);
        Path P0 = P0(file);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) b11.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        newOutputStream = Files.newOutputStream(P0, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        g0.o(newOutputStream, "newOutputStream(...)");
        return r0.p(newOutputStream);
    }

    @Override // okio.c, okio.b
    @k
    public List<f> i0(@k f dir) {
        g0.p(dir, "dir");
        List<f> G0 = G0(dir, true);
        g0.m(G0);
        return G0;
    }

    @Override // okio.e, okio.c, okio.b
    public void k(@k f source, @k f target) {
        String message;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        Path move;
        g0.p(source, "source");
        g0.p(target, "target");
        try {
            Path P0 = P0(source);
            Path P02 = P0(target);
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            move = Files.move(P0, P02, (CopyOption[]) Arrays.copyOf(new CopyOption[]{standardCopyOption, standardCopyOption2}, 2));
            g0.o(move, "move(...)");
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e11) {
            message = e11.getMessage();
            throw new FileNotFoundException(message);
        }
    }

    @Override // okio.c, okio.b
    @l
    public List<f> k0(@k f dir) {
        g0.p(dir, "dir");
        return G0(dir, false);
    }

    @Override // okio.c, okio.b
    @k
    public f q(@k f path) {
        Path realPath;
        g0.p(path, "path");
        try {
            f.a aVar = f.f77539b;
            realPath = P0(path).toRealPath(new LinkOption[0]);
            g0.o(realPath, "toRealPath(...)");
            return f.a.i(aVar, realPath, false, 1, null);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // okio.e, okio.c
    @k
    public String toString() {
        String C = o0.d(this.f77538e.getClass()).C();
        g0.m(C);
        return C;
    }

    @Override // okio.e, okio.c, okio.b
    @l
    public s w0(@k f path) {
        g0.p(path, "path");
        return L0(P0(path));
    }

    @Override // okio.c, okio.b
    @k
    public r x0(@k f file) {
        StandardOpenOption standardOpenOption;
        FileChannel open;
        g0.p(file, "file");
        try {
            Path P0 = P0(file);
            standardOpenOption = StandardOpenOption.READ;
            open = FileChannel.open(P0, standardOpenOption);
            g0.m(open);
            return new f0(false, open);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.c, okio.b
    @k
    public r z0(@k f file, boolean z11, boolean z12) {
        StandardOpenOption standardOpenOption;
        StandardOpenOption standardOpenOption2;
        StandardOpenOption standardOpenOption3;
        FileChannel open;
        StandardOpenOption standardOpenOption4;
        g0.p(file, "file");
        if (z11 && z12) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        List j11 = a00.g0.j();
        standardOpenOption = StandardOpenOption.READ;
        j11.add(standardOpenOption);
        standardOpenOption2 = StandardOpenOption.WRITE;
        j11.add(standardOpenOption2);
        if (z11) {
            standardOpenOption4 = StandardOpenOption.CREATE_NEW;
            j11.add(standardOpenOption4);
        } else if (!z12) {
            standardOpenOption3 = StandardOpenOption.CREATE;
            j11.add(standardOpenOption3);
        }
        List b11 = a00.g0.b(j11);
        try {
            Path P0 = P0(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) b11.toArray(new StandardOpenOption[0]);
            open = FileChannel.open(P0, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            g0.m(open);
            return new f0(true, open);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }
}
