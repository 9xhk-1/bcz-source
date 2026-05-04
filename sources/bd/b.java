package bd;

import com.baicizhan.learning_strategy.util.L;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends com.baicizhan.learning_strategy.util.d implements ad.b {
    public b() throws Exception {
        super(W());
    }

    public static NativeObject W() throws Exception {
        try {
            try {
                Object b11 = com.baicizhan.learning_strategy.util.c.b(zc.c.d().b(), zc.c.d().c(), "new ObjectCreator()");
                if (b11 instanceof NativeObject) {
                    return (NativeObject) b11;
                }
                Context.exit();
                return null;
            } catch (Exception e11) {
                L.log.error("create ObjectCreatorProxy error", e11);
                throw e11;
            }
        } finally {
            Context.exit();
        }
    }

    @Override // ad.b
    public List<yc.b> F(int i11) {
        NativeObject Q = Q("createProblem", null, new Object[0]);
        HashSet<Map.Entry> hashSet = new HashSet(Q.entrySet());
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            NativeObject nativeObject = new NativeObject();
            nativeObject.setPrototype(Q.getPrototype());
            for (Map.Entry entry : hashSet) {
                nativeObject.put(entry.getKey().toString(), nativeObject, entry.getValue());
            }
            arrayList.add(new yc.b(nativeObject));
        }
        return arrayList;
    }

    @Override // ad.b
    public yc.b j() {
        return new yc.b(Q("createProblem", null, new Object[0]));
    }
}
