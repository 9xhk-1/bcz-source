package u0;

import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-FileSystems")
/* loaded from: classes3.dex */
public final class e {
    public static final void a(@m80.k okio.b bVar, @m80.k okio.f fVar) {
        if (bVar.f0(fVar)) {
            return;
        }
        l.f(bVar.C0(fVar));
    }

    public static final void b(@m80.k okio.b bVar, @m80.k okio.f fVar) {
        try {
            IOException iOException = null;
            for (okio.f fVar2 : bVar.i0(fVar)) {
                try {
                    if (bVar.v0(fVar2).j()) {
                        b(bVar, fVar2);
                    }
                    bVar.U(fVar2);
                } catch (IOException e11) {
                    if (iOException == null) {
                        iOException = e11;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
