package p20;

import a00.n0;
import java.util.ArrayList;
import kotlin.jvm.internal.g0;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: p20.a$a, reason: collision with other inner class name */
    public static final class C0969a implements a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final C0969a f78726a = new C0969a();

        @Override // p20.a
        @m80.k
        public String a(@m80.k p10.d classifier, @m80.k m renderer) {
            g0.p(classifier, "classifier");
            g0.p(renderer, "renderer");
            if (classifier instanceof c1) {
                n20.f name = ((c1) classifier).getName();
                g0.o(name, "getName(...)");
                return renderer.V(name, false);
            }
            n20.d m11 = q20.h.m(classifier);
            g0.o(m11, "getFqName(...)");
            return renderer.U(m11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f78727a = new b();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, p10.d] */
        /* JADX WARN: Type inference failed for: r2v1, types: [p10.c0, p10.h] */
        /* JADX WARN: Type inference failed for: r2v2, types: [p10.h] */
        @Override // p20.a
        @m80.k
        public String a(@m80.k p10.d classifier, @m80.k m renderer) {
            g0.p(classifier, "classifier");
            g0.p(renderer, "renderer");
            if (classifier instanceof c1) {
                n20.f name = ((c1) classifier).getName();
                g0.o(name, "getName(...)");
                return renderer.V(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.b();
            } while (classifier instanceof p10.b);
            return a0.c(n0.d1(arrayList));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final c f78728a = new c();

        @Override // p20.a
        @m80.k
        public String a(@m80.k p10.d classifier, @m80.k m renderer) {
            g0.p(classifier, "classifier");
            g0.p(renderer, "renderer");
            return b(classifier);
        }

        public final String b(p10.d dVar) {
            n20.f name = dVar.getName();
            g0.o(name, "getName(...)");
            String b11 = a0.b(name);
            if (dVar instanceof c1) {
                return b11;
            }
            p10.h b12 = dVar.b();
            g0.o(b12, "getContainingDeclaration(...)");
            String c11 = c(b12);
            if (c11 == null || g0.g(c11, "")) {
                return b11;
            }
            return c11 + '.' + b11;
        }

        public final String c(p10.h hVar) {
            if (hVar instanceof p10.b) {
                return b((p10.d) hVar);
            }
            if (!(hVar instanceof p10.g0)) {
                return null;
            }
            n20.d j11 = ((p10.g0) hVar).d().j();
            g0.o(j11, "toUnsafe(...)");
            return a0.a(j11);
        }
    }

    @m80.k
    String a(@m80.k p10.d dVar, @m80.k m mVar);
}
