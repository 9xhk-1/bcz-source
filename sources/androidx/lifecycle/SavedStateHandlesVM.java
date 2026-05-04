package androidx.lifecycle;

import java.util.LinkedHashMap;
import java.util.Map;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SavedStateHandlesVM extends ViewModel {

    @k
    private final Map<String, SavedStateHandle> handles = new LinkedHashMap();

    @k
    public final Map<String, SavedStateHandle> getHandles() {
        return this.handles;
    }
}
