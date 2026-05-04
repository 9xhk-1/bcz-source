package x10;

import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f97054a = new a();

        @Override // x10.c
        public boolean a() {
            return false;
        }

        @Override // x10.c
        public void b(@k String filePath, @k Position position, @k String scopeFqName, @k ScopeKind scopeKind, @k String name) {
            g0.p(filePath, "filePath");
            g0.p(position, "position");
            g0.p(scopeFqName, "scopeFqName");
            g0.p(scopeKind, "scopeKind");
            g0.p(name, "name");
        }
    }

    boolean a();

    void b(@k String str, @k Position position, @k String str2, @k ScopeKind scopeKind, @k String str3);
}
