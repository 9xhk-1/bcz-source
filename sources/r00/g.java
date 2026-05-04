package r00;

import a00.r0;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final File f82782a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<File> f82783b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@m80.k File root, @m80.k List<? extends File> segments) {
        g0.p(root, "root");
        g0.p(segments, "segments");
        this.f82782a = root;
        this.f82783b = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g d(g gVar, File file, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            file = gVar.f82782a;
        }
        if ((i11 & 2) != 0) {
            list = gVar.f82783b;
        }
        return gVar.c(file, list);
    }

    @m80.k
    public final File a() {
        return this.f82782a;
    }

    @m80.k
    public final List<File> b() {
        return this.f82783b;
    }

    @m80.k
    public final g c(@m80.k File root, @m80.k List<? extends File> segments) {
        g0.p(root, "root");
        g0.p(segments, "segments");
        return new g(root, segments);
    }

    @m80.k
    public final File e() {
        return this.f82782a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return g0.g(this.f82782a, gVar.f82782a) && g0.g(this.f82783b, gVar.f82783b);
    }

    @m80.k
    public final String f() {
        String path = this.f82782a.getPath();
        g0.o(path, "getPath(...)");
        return path;
    }

    @m80.k
    public final List<File> g() {
        return this.f82783b;
    }

    public final int h() {
        return this.f82783b.size();
    }

    public int hashCode() {
        return (this.f82782a.hashCode() * 31) + this.f82783b.hashCode();
    }

    public final boolean i() {
        String path = this.f82782a.getPath();
        g0.o(path, "getPath(...)");
        return path.length() > 0;
    }

    @m80.k
    public final File j(int i11, int i12) {
        if (i11 < 0 || i11 > i12 || i12 > h()) {
            throw new IllegalArgumentException();
        }
        List<File> subList = this.f82783b.subList(i11, i12);
        String separator = File.separator;
        g0.o(separator, "separator");
        return new File(r0.r3(subList, separator, null, null, 0, null, null, 62, null));
    }

    @m80.k
    public String toString() {
        return "FilePathComponents(root=" + this.f82782a + ", segments=" + this.f82783b + ')';
    }
}
