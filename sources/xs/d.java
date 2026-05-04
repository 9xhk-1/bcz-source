package xs;

import java.io.IOException;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import w00.g;
import ws.h;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class d<T> {

    @g
    public final byte callTypeId;

    @l
    @g
    public final e<T> callback;

    @g
    @k
    public final String name;

    public d(@k String name, byte b11, @l e<T> eVar) {
        g0.p(name, "name");
        this.name = name;
        this.callTypeId = b11;
        this.callback = eVar;
        if (b11 == 1 || b11 == 4) {
            if (eVar == null && b11 != 4) {
                throw new IllegalArgumentException("callback is required");
            }
        } else {
            throw new IllegalArgumentException(("Unexpected call type: " + ((int) b11)).toString());
        }
    }

    public abstract T receive(@k i iVar, @k h hVar) throws Exception;

    public abstract void send(@k i iVar) throws IOException;
}
