package q0;

import androidx.annotation.Px;
import kotlin.jvm.internal.g0;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-Sizes")
/* loaded from: classes3.dex */
public final class b {
    @m80.k
    public static final g a(@Px int i11, @Px int i12) {
        return new g(a.a(i11), a.a(i12));
    }

    @m80.k
    public static final g b(@Px int i11, @m80.k c cVar) {
        return new g(a.a(i11), cVar);
    }

    @m80.k
    public static final g c(@m80.k c cVar, @Px int i11) {
        return new g(cVar, a.a(i11));
    }

    @m80.k
    public static final g d() {
        return g.f81365d;
    }

    public static final boolean f(@m80.k g gVar) {
        return g0.g(gVar, g.f81365d);
    }

    @n(message = "Migrate to 'coil.size.Size.ORIGINAL'.", replaceWith = @w0(expression = "Size.ORIGINAL", imports = {"coil.size.Size"}))
    public static /* synthetic */ void e() {
    }
}
