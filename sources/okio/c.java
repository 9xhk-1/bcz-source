package okio;

import a00.l0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.e0;
import l60.e1;
import l60.g1;
import l60.r;
import l60.r0;
import l60.s;
import l60.s0;
import m80.k;
import m80.l;
import okio.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJvmSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n11896#2,3:159\n*S KotlinDebug\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n*L\n77#1:159,3\n*E\n"})
/* loaded from: classes8.dex */
public class c extends b {
    private final List<f> G0(f fVar, boolean z11) {
        File file = fVar.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                g0.m(str);
                arrayList.add(fVar.v(str));
            }
            l0.o0(arrayList);
            return arrayList;
        }
        if (!z11) {
            return null;
        }
        if (file.exists()) {
            throw new IOException("failed to list " + fVar);
        }
        throw new FileNotFoundException("no such file: " + fVar);
    }

    @Override // okio.b
    @k
    public e1 D0(@k f file, boolean z11) {
        g0.p(file, "file");
        if (z11) {
            H0(file);
        }
        return s0.o(file.toFile(), false, 1, null);
    }

    @Override // okio.b
    @k
    public g1 F0(@k f file) {
        g0.p(file, "file");
        return r0.u(file.toFile());
    }

    public final void H0(f fVar) {
        if (f0(fVar)) {
            throw new IOException(fVar + " already exists.");
        }
    }

    @Override // okio.b
    public void I(@k f dir, boolean z11) {
        g0.p(dir, "dir");
        if (dir.toFile().mkdir()) {
            return;
        }
        s w02 = w0(dir);
        if (w02 == null || !w02.j()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z11) {
            throw new IOException(dir + " already exists.");
        }
    }

    public final void K0(f fVar) {
        if (f0(fVar)) {
            return;
        }
        throw new IOException(fVar + " doesn't exist.");
    }

    @Override // okio.b
    public void S(@k f source, @k f target) {
        g0.p(source, "source");
        g0.p(target, "target");
        throw new IOException("unsupported");
    }

    @Override // okio.b
    public void V(@k f path, boolean z11) {
        g0.p(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = path.toFile();
        if (file.delete()) {
            return;
        }
        if (file.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z11) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    @Override // okio.b
    @k
    public e1 i(@k f file, boolean z11) {
        g0.p(file, "file");
        if (z11) {
            K0(file);
        }
        return r0.o(file.toFile(), true);
    }

    @Override // okio.b
    @k
    public List<f> i0(@k f dir) {
        g0.p(dir, "dir");
        List<f> G0 = G0(dir, true);
        g0.m(G0);
        return G0;
    }

    @Override // okio.b
    public void k(@k f source, @k f target) {
        g0.p(source, "source");
        g0.p(target, "target");
        if (source.toFile().renameTo(target.toFile())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // okio.b
    @l
    public List<f> k0(@k f dir) {
        g0.p(dir, "dir");
        return G0(dir, false);
    }

    @Override // okio.b
    @k
    public f q(@k f path) {
        g0.p(path, "path");
        File canonicalFile = path.toFile().getCanonicalFile();
        if (!canonicalFile.exists()) {
            throw new FileNotFoundException("no such file");
        }
        f.a aVar = f.f77539b;
        g0.m(canonicalFile);
        return f.a.g(aVar, canonicalFile, false, 1, null);
    }

    @k
    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // okio.b
    @l
    public s w0(@k f path) {
        g0.p(path, "path");
        File file = path.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new s(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
    }

    @Override // okio.b
    @k
    public r x0(@k f file) {
        g0.p(file, "file");
        return new e0(false, new RandomAccessFile(file.toFile(), en.r.f50027a));
    }

    @Override // okio.b
    @k
    public r z0(@k f file, boolean z11, boolean z12) {
        g0.p(file, "file");
        if (z11 && z12) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (z11) {
            H0(file);
        }
        if (z12) {
            K0(file);
        }
        return new e0(true, new RandomAccessFile(file.toFile(), "rw"));
    }
}
