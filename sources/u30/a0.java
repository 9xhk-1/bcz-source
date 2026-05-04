package u30;

import java.util.Set;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a0 extends z {
    @o00.f
    public static final Regex A(String str, Set<? extends RegexOption> options) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(options, "options");
        return new Regex(str, options);
    }

    @o00.f
    public static final Regex B(String str, RegexOption option) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        kotlin.jvm.internal.g0.p(option, "option");
        return new Regex(str, option);
    }

    @o00.f
    public static final Regex z(String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        return new Regex(str);
    }
}
