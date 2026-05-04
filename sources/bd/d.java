package bd;

import org.mozilla.javascript.NativeObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends com.baicizhan.learning_strategy.util.d implements ad.d {
    public d(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // ad.d
    public yc.c C(yc.b bVar) {
        NativeObject Q = Q("getType", null, bVar.U());
        if (Q == null) {
            return null;
        }
        return new yc.c(Q);
    }
}
