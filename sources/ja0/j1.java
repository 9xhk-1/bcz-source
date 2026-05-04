package ja0;

import ba0.g4;
import java.util.Collections;
import java.util.List;
import org.junit.platform.engine.support.hierarchical.ExclusiveResource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class j1 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final p1 f63967a = new j1();

    @Override // ja0.p1
    public boolean O0() {
        return false;
    }

    public String toString() {
        return new g4(this).toString();
    }

    @Override // ja0.p1
    public List<ExclusiveResource> v8() {
        return Collections.EMPTY_LIST;
    }

    @Override // ja0.p1
    public p1 acquire() {
        return this;
    }

    @Override // ja0.p1
    public void release() {
    }
}
