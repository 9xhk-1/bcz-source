package f90;

import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class h {
    public static d a(Object item) {
        return item instanceof d ? (d) item : ReflectionUtils.a1(item) ? d.c(item) : item instanceof Object[] ? d.c((Object[]) item) : d.c(item);
    }
}
