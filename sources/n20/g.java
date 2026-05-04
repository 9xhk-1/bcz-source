package n20;

import kotlin.jvm.internal.g0;
import kotlin.text.Regex;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final g f74297a = new g();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Regex f74298b = new Regex("[^\\p{L}\\p{Digit}]");

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f74299c = "$context_receiver";

    @o
    @m80.k
    public static final f a(int i11) {
        f f11 = f.f(f74299c + '_' + i11);
        g0.o(f11, "identifier(...)");
        return f11;
    }

    @o
    @m80.k
    public static final String b(@m80.k String name) {
        g0.p(name, "name");
        return f74298b.replace(name, "_");
    }
}
