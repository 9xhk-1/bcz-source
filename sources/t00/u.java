package t00;

import java.nio.file.Path;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Path f89189a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final Object f89190b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final u f89191c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public Iterator<u> f89192d;

    public u(@m80.k Path path, @m80.l Object obj, @m80.l u uVar) {
        kotlin.jvm.internal.g0.p(path, "path");
        this.f89189a = path;
        this.f89190b = obj;
        this.f89191c = uVar;
    }

    @m80.l
    public final Iterator<u> a() {
        return this.f89192d;
    }

    @m80.l
    public final Object b() {
        return this.f89190b;
    }

    @m80.l
    public final u c() {
        return this.f89191c;
    }

    @m80.k
    public final Path d() {
        return this.f89189a;
    }

    public final void e(@m80.l Iterator<u> it) {
        this.f89192d = it;
    }
}
