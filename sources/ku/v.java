package ku;

import com.typesafe.config.ConfigException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class v extends e0 {
    public v(b2 b2Var) {
        super(b2Var);
        if (!e2.j(this.f68700a)) {
            throw new ConfigException.BugOrBroken("Tried to create a ConfigNodeComment from a non-comment token");
        }
    }

    public String d() {
        return e2.a(this.f68700a);
    }
}
