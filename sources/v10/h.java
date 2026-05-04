package v10;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class h implements f20.b {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f92844b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final n20.f f92845a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final h a(@m80.k Object value, @m80.l n20.f fVar) {
            kotlin.jvm.internal.g0.p(value, "value");
            return f.l(value.getClass()) ? new v(fVar, (Enum) value) : value instanceof Annotation ? new i(fVar, (Annotation) value) : value instanceof Object[] ? new l(fVar, (Object[]) value) : value instanceof Class ? new r(fVar, (Class) value) : new x(fVar, value);
        }

        public a() {
        }
    }

    public /* synthetic */ h(n20.f fVar, kotlin.jvm.internal.v vVar) {
        this(fVar);
    }

    @Override // f20.b
    @m80.l
    public n20.f getName() {
        return this.f92845a;
    }

    public h(n20.f fVar) {
        this.f92845a = fVar;
    }
}
