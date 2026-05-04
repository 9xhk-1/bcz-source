package ga0;

import org.apiguardian.api.API;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.UniqueId;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class h extends c {
    public h(UniqueId uniqueId, String displayName) {
        super(uniqueId, displayName);
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public TestDescriptor.Type getType() {
        return TestDescriptor.Type.CONTAINER;
    }
}
