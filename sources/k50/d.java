package k50;

import java.lang.annotation.Annotation;
import java.util.List;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@v0
/* loaded from: classes8.dex */
public final class d implements f50.i<b> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d f65914a = new d();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f65915b = a.f65916b;

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f65915b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public b e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        w.g(decoder);
        return new b((List) g50.a.i(v.f65976a).e(decoder));
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k b value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        w.h(encoder);
        g50.a.i(v.f65976a).b(encoder, value);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements h50.f {

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final a f65916b = new a();

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final String f65917c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h50.f f65918a = g50.a.i(v.f65976a).a();

        @Override // h50.f
        public boolean b() {
            return this.f65918a.b();
        }

        @Override // h50.f
        public int d(@m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            return this.f65918a.d(name);
        }

        @Override // h50.f
        @m80.k
        public h50.f e(int i11) {
            return this.f65918a.e(i11);
        }

        @Override // h50.f
        @m80.k
        public List<Annotation> getAnnotations() {
            return this.f65918a.getAnnotations();
        }

        @Override // h50.f
        @m80.k
        public h50.m getKind() {
            return this.f65918a.getKind();
        }

        @Override // h50.f
        public int h() {
            return this.f65918a.h();
        }

        @Override // h50.f
        @m80.k
        public String i(int i11) {
            return this.f65918a.i(i11);
        }

        @Override // h50.f
        public boolean isInline() {
            return this.f65918a.isInline();
        }

        @Override // h50.f
        @m80.k
        public List<Annotation> j(int i11) {
            return this.f65918a.j(i11);
        }

        @Override // h50.f
        @m80.k
        public String k() {
            return f65917c;
        }

        @Override // h50.f
        public boolean l(int i11) {
            return this.f65918a.l(i11);
        }

        @f50.f
        public static /* synthetic */ void a() {
        }
    }
}
