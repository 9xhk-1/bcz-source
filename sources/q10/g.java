package q10;

import a00.h0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface g extends Iterable<c>, y00.a {

    @m80.k
    public static final a A0 = a.f81416a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f81416a = new a();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final g f81417b = new C0999a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: q10.g$a$a, reason: collision with other inner class name */
        public static final class C0999a implements g {
            public Void a(n20.c fqName) {
                g0.p(fqName, "fqName");
                return null;
            }

            @Override // q10.g
            public boolean a0(n20.c cVar) {
                return b.b(this, cVar);
            }

            @Override // q10.g
            public /* bridge */ /* synthetic */ c i(n20.c cVar) {
                return (c) a(cVar);
            }

            @Override // q10.g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<c> iterator() {
                return h0.J().iterator();
            }

            public String toString() {
                return "EMPTY";
            }
        }

        @m80.k
        public final g a(@m80.k List<? extends c> annotations) {
            g0.p(annotations, "annotations");
            return annotations.isEmpty() ? f81417b : new h(annotations);
        }

        @m80.k
        public final g b() {
            return f81417b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/Annotations$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n295#2,2:124\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/Annotations$DefaultImpls\n*L\n29#1:124,2\n*E\n"})
    public static final class b {
        @m80.l
        public static c a(@m80.k g gVar, @m80.k n20.c fqName) {
            c cVar;
            g0.p(fqName, "fqName");
            Iterator<c> it = gVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                cVar = it.next();
                if (g0.g(cVar.d(), fqName)) {
                    break;
                }
            }
            return cVar;
        }

        public static boolean b(@m80.k g gVar, @m80.k n20.c fqName) {
            g0.p(fqName, "fqName");
            return gVar.i(fqName) != null;
        }
    }

    boolean a0(@m80.k n20.c cVar);

    @m80.l
    c i(@m80.k n20.c cVar);

    boolean isEmpty();
}
