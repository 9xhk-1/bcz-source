package v5;

import f4.g2;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {
    @m80.k
    public static final g2 a(@m80.k t8.c cVar, long j11, long j12) {
        long j13;
        g0.p(cVar, "<this>");
        Integer num = cVar.f89998d;
        if (num != null) {
            j13 = num.intValue();
        } else {
            z6.b.f(z6.b.f101032b, n.f93106a, "topic_version is null for topic " + cVar.f89995a + ", using current time", null, 4, null);
            j13 = j12 / ((long) 1000);
        }
        return new g2(j11, cVar.f89995a, j12, cVar.f89996b, j13);
    }
}
