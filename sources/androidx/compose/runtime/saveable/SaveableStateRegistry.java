package androidx.compose.runtime.saveable;

import java.util.List;
import java.util.Map;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SaveableStateRegistry {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Entry {
        void unregister();
    }

    boolean canBeSaved(@k Object obj);

    @l
    Object consumeRestored(@k String str);

    @k
    Map<String, List<Object>> performSave();

    @k
    Entry registerProvider(@k String str, @k a<? extends Object> aVar);
}
