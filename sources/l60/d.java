package l60;

import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.n(message = "changed in Okio 2.x")
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d f70390a = new d();

    @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @yz.w0(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    public final long a(@m80.k String string) {
        kotlin.jvm.internal.g0.p(string, "string");
        return k1.l(string, 0, 0, 3, null);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @yz.w0(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long b(@m80.k String string, int i11, int i12) {
        kotlin.jvm.internal.g0.p(string, "string");
        return k1.k(string, i11, i12);
    }
}
