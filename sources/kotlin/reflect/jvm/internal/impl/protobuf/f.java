package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f67564b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final f f67565c = new f(true);

    /* renamed from: a, reason: collision with root package name */
    public final Map<a, GeneratedMessageLite.f<?, ?>> f67566a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f67567a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67568b;

        public a(Object obj, int i11) {
            this.f67567a = obj;
            this.f67568b = i11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f67567a == aVar.f67567a && this.f67568b == aVar.f67568b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f67567a) * 65535) + this.f67568b;
        }
    }

    public f() {
        this.f67566a = new HashMap();
    }

    public static f c() {
        return f67565c;
    }

    public static f d() {
        return new f();
    }

    public final void a(GeneratedMessageLite.f<?, ?> fVar) {
        this.f67566a.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public <ContainingType extends n> GeneratedMessageLite.f<ContainingType, ?> b(ContainingType containingtype, int i11) {
        return (GeneratedMessageLite.f) this.f67566a.get(new a(containingtype, i11));
    }

    public f(boolean z11) {
        this.f67566a = Collections.EMPTY_MAP;
    }
}
