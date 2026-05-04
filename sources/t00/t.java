package t00;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final t f89184a = new t();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final LinkOption[] f89185b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final LinkOption[] f89186c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Set<FileVisitOption> f89187d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final Set<FileVisitOption> f89188e;

    static {
        LinkOption linkOption;
        FileVisitOption fileVisitOption;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        f89185b = new LinkOption[]{linkOption};
        f89186c = new LinkOption[0];
        f89187d = a00.w1.k();
        fileVisitOption = FileVisitOption.FOLLOW_LINKS;
        f89188e = a00.v1.f(fileVisitOption);
    }

    @m80.k
    public final LinkOption[] a(boolean z11) {
        return z11 ? f89186c : f89185b;
    }

    @m80.k
    public final Set<FileVisitOption> b(boolean z11) {
        return z11 ? f89188e : f89187d;
    }
}
