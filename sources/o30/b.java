package o30;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class b {

    /* JADX INFO: Add missing generic type declarations: [N] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<N> extends AbstractC0924b<N, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f75682a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean[] f75683b;

        public a(x00.l lVar, boolean[] zArr) {
            this.f75682a = lVar;
            this.f75683b = zArr;
        }

        @Override // o30.b.AbstractC0924b, o30.b.e
        public boolean b(N n11) {
            if (((Boolean) this.f75682a.invoke(n11)).booleanValue()) {
                this.f75683b[0] = true;
            }
            return !this.f75683b[0];
        }

        @Override // o30.b.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.valueOf(this.f75683b[0]);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c<N, R, C extends Iterable<R>> extends AbstractC0924b<N, C> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final C f75684a;

        public c(@m80.k C c11) {
            if (c11 == null) {
                d(0);
            }
            this.f75684a = c11;
        }

        public static /* synthetic */ void d(int i11) {
            String str = i11 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i11 != 1 ? 3 : 2];
            if (i11 != 1) {
                objArr[0] = "result";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            }
            if (i11 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS$CollectingNodeHandler";
            } else {
                objArr[1] = "result";
            }
            if (i11 != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i11 == 1) {
                throw new IllegalStateException(format);
            }
        }

        @Override // o30.b.e
        @m80.k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C a() {
            C c11 = this.f75684a;
            if (c11 == null) {
                d(1);
            }
            return c11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d<N> {
        @m80.k
        Iterable<? extends N> a(N n11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e<N, R> {
        R a();

        boolean b(N n11);

        void c(N n11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f<N, R> extends c<N, R, LinkedList<R>> {
        public f() {
            super(new LinkedList());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g<N> {
        boolean a(N n11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h<N> implements g<N> {

        /* renamed from: a, reason: collision with root package name */
        public final Set<N> f75685a;

        public h() {
            this(new HashSet());
        }

        public static /* synthetic */ void b(int i11) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // o30.b.g
        public boolean a(N n11) {
            return this.f75685a.add(n11);
        }

        public h(@m80.k Set<N> set) {
            if (set == null) {
                b(0);
            }
            this.f75685a = set;
        }
    }

    public static /* synthetic */ void a(int i11) {
        Object[] objArr = new Object[3];
        switch (i11) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i11) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static <N, R> R b(@m80.k Collection<N> collection, @m80.k d<N> dVar, @m80.k e<N, R> eVar) {
        if (collection == null) {
            a(4);
        }
        if (dVar == null) {
            a(5);
        }
        if (eVar == null) {
            a(6);
        }
        return (R) c(collection, dVar, new h(), eVar);
    }

    public static <N, R> R c(@m80.k Collection<N> collection, @m80.k d<N> dVar, @m80.k g<N> gVar, @m80.k e<N, R> eVar) {
        if (collection == null) {
            a(0);
        }
        if (dVar == null) {
            a(1);
        }
        if (gVar == null) {
            a(2);
        }
        if (eVar == null) {
            a(3);
        }
        Iterator<N> it = collection.iterator();
        while (it.hasNext()) {
            d(it.next(), dVar, gVar, eVar);
        }
        return eVar.a();
    }

    public static <N> void d(@m80.k N n11, @m80.k d<N> dVar, @m80.k g<N> gVar, @m80.k e<N, ?> eVar) {
        if (n11 == null) {
            a(22);
        }
        if (dVar == null) {
            a(23);
        }
        if (gVar == null) {
            a(24);
        }
        if (eVar == null) {
            a(25);
        }
        if (gVar.a(n11) && eVar.b(n11)) {
            Iterator<? extends N> it = dVar.a(n11).iterator();
            while (it.hasNext()) {
                d(it.next(), dVar, gVar, eVar);
            }
            eVar.c(n11);
        }
    }

    public static <N> Boolean e(@m80.k Collection<N> collection, @m80.k d<N> dVar, @m80.k x00.l<N, Boolean> lVar) {
        if (collection == null) {
            a(7);
        }
        if (dVar == null) {
            a(8);
        }
        if (lVar == null) {
            a(9);
        }
        return (Boolean) b(collection, dVar, new a(lVar, new boolean[1]));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: o30.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0924b<N, R> implements e<N, R> {
        @Override // o30.b.e
        public boolean b(N n11) {
            return true;
        }

        @Override // o30.b.e
        public void c(N n11) {
        }
    }
}
