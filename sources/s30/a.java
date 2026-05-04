package s30;

import o00.f;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "ProcessKt")
/* loaded from: classes8.dex */
public final class a {
    @f
    public static final Void a(int i11) {
        System.exit(i11);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
