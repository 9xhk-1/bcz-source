package zx;

import io.ktor.server.application.InvalidBodyException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPluginExceptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginExceptions.kt\nio/ktor/server/application/PluginExceptionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
/* loaded from: classes8.dex */
public final class p0 {
    @m80.k
    public static final InvalidBodyException a(@m80.k String expectedTypeName, @m80.l Object obj) {
        String str;
        kotlin.jvm.internal.g0.p(expectedTypeName, "expectedTypeName");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        sb2.append(expectedTypeName);
        sb2.append(" type but ");
        if (obj == null || (str = kotlin.jvm.internal.o0.d(obj.getClass()).C()) == null) {
            str = "null";
        }
        sb2.append(str);
        sb2.append(" found");
        return new InvalidBodyException(sb2.toString());
    }
}
