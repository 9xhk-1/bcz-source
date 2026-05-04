package b50;

import java.io.File;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final File f6118a;

    public j(@m80.k File file) {
        g0.p(file, "file");
        this.f6118a = file;
    }

    @m80.k
    public final File a() {
        return this.f6118a;
    }

    @m80.k
    public final String b() {
        String name = this.f6118a.getName();
        g0.o(name, "getName(...)");
        return name;
    }

    @m80.l
    public final j c() {
        File parentFile = this.f6118a.getParentFile();
        if (parentFile == null) {
            return null;
        }
        return new j(parentFile);
    }

    public final boolean d() {
        return this.f6118a.isAbsolute();
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return g0.g(toString(), ((j) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @m80.k
    public String toString() {
        String file = this.f6118a.toString();
        g0.o(file, "toString(...)");
        return file;
    }
}
