package su;

import android.content.Context;
import gv.f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Set;
import javax.inject.Qualifier;
import nu.h;
import pu.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
    @Qualifier
    /* renamed from: su.a$a, reason: collision with other inner class name */
    public @interface InterfaceC1164a {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @e({fv.a.class})
    @pu.b
    public interface b {
        @InterfaceC1164a
        Set<Boolean> j();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @e({fv.a.class})
    @h
    public static abstract class c {
        @InterfaceC1164a
        @vv.h
        public abstract Set<Boolean> a();
    }

    public static boolean a(Context context) {
        Set<Boolean> j11 = ((b) qu.e.d(context, b.class)).j();
        f.d(j11.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (j11.isEmpty()) {
            return true;
        }
        return j11.iterator().next().booleanValue();
    }
}
