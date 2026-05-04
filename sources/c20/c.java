package c20;

import a00.w1;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f7527a = new a();

        @Override // c20.c
        @m80.k
        public Set<n20.f> a() {
            return w1.k();
        }

        @Override // c20.c
        @m80.l
        public f20.w b(@m80.k n20.f name) {
            kotlin.jvm.internal.g0.p(name, "name");
            return null;
        }

        @Override // c20.c
        @m80.k
        public Set<n20.f> c() {
            return w1.k();
        }

        @Override // c20.c
        @m80.l
        public f20.n d(@m80.k n20.f name) {
            kotlin.jvm.internal.g0.p(name, "name");
            return null;
        }

        @Override // c20.c
        @m80.k
        public Set<n20.f> e() {
            return w1.k();
        }

        @Override // c20.c
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public List<f20.r> f(@m80.k n20.f name) {
            kotlin.jvm.internal.g0.p(name, "name");
            return a00.h0.J();
        }
    }

    @m80.k
    Set<n20.f> a();

    @m80.l
    f20.w b(@m80.k n20.f fVar);

    @m80.k
    Set<n20.f> c();

    @m80.l
    f20.n d(@m80.k n20.f fVar);

    @m80.k
    Set<n20.f> e();

    @m80.k
    Collection<f20.r> f(@m80.k n20.f fVar);
}
