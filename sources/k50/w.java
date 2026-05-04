package k50;

import java.lang.annotation.Annotation;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class w {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements h50.f {

        /* renamed from: a, reason: collision with root package name */
        public final yz.c0 f65978a;

        public a(x00.a<? extends h50.f> aVar) {
            this.f65978a = yz.e0.c(aVar);
        }

        public final h50.f a() {
            return (h50.f) this.f65978a.getValue();
        }

        @Override // h50.f
        public boolean b() {
            return super.b();
        }

        @Override // h50.f
        public int d(String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            return a().d(name);
        }

        @Override // h50.f
        public h50.f e(int i11) {
            return a().e(i11);
        }

        @Override // h50.f
        public List<Annotation> getAnnotations() {
            return super.getAnnotations();
        }

        @Override // h50.f
        public h50.m getKind() {
            return a().getKind();
        }

        @Override // h50.f
        public int h() {
            return a().h();
        }

        @Override // h50.f
        public String i(int i11) {
            return a().i(i11);
        }

        @Override // h50.f
        public boolean isInline() {
            return super.isInline();
        }

        @Override // h50.f
        public List<Annotation> j(int i11) {
            return a().j(i11);
        }

        @Override // h50.f
        public String k() {
            return a().k();
        }

        @Override // h50.f
        public boolean l(int i11) {
            return a().l(i11);
        }
    }

    @m80.k
    public static final i d(@m80.k i50.f fVar) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        i iVar = fVar instanceof i ? (i) fVar : null;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + kotlin.jvm.internal.o0.d(fVar.getClass()));
    }

    @m80.k
    public static final x e(@m80.k i50.h hVar) {
        kotlin.jvm.internal.g0.p(hVar, "<this>");
        x xVar = hVar instanceof x ? (x) hVar : null;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + kotlin.jvm.internal.o0.d(hVar.getClass()));
    }

    public static final h50.f f(x00.a<? extends h50.f> aVar) {
        return new a(aVar);
    }

    public static final void g(i50.f fVar) {
        d(fVar);
    }

    public static final void h(i50.h hVar) {
        e(hVar);
    }
}
