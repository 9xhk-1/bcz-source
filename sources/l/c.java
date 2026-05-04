package l;

import kotlin.jvm.internal.g0;
import m80.k;
import w00.h;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface c<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f69104a = b.f69106a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @h
    public static final class a<T> implements c<T> {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final l<j00.c<? super T>, Object> f69105b;

        public /* synthetic */ a(l lVar) {
            this.f69105b = lVar;
        }

        @m80.l
        public static Object a(l<? super j00.c<? super T>, ? extends Object> lVar, @k j00.c<? super T> cVar) {
            return lVar.invoke(cVar);
        }

        public static final /* synthetic */ a b(l lVar) {
            return new a(lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @k
        public static <T> l<j00.c<? super T>, Object> c(@k l<? super j00.c<? super T>, ? extends Object> getter) {
            g0.p(getter, "getter");
            return getter;
        }

        public static boolean d(l<? super j00.c<? super T>, ? extends Object> lVar, Object obj) {
            return (obj instanceof a) && g0.g(lVar, ((a) obj).j());
        }

        public static final boolean e(l<? super j00.c<Object>, ? extends Object> lVar, l<? super j00.c<Object>, ? extends Object> lVar2) {
            return g0.g(lVar, lVar2);
        }

        public static T f(l<? super j00.c<? super T>, ? extends Object> lVar) {
            return (T) b(lVar).getValue();
        }

        public static int g(l<? super j00.c<? super T>, ? extends Object> lVar) {
            return lVar.hashCode();
        }

        public static String h(l<? super j00.c<? super T>, ? extends Object> lVar) {
            return "AsyncValue(getter=" + lVar + ')';
        }

        public boolean equals(Object obj) {
            return d(this.f69105b, obj);
        }

        @Override // l.c
        public /* bridge */ T getValue() {
            return (T) C0832c.a(this);
        }

        public int hashCode() {
            return g(this.f69105b);
        }

        @Override // l.c
        @m80.l
        public Object i(@k j00.c<? super T> cVar) {
            return a(this.f69105b, cVar);
        }

        public final /* synthetic */ l j() {
            return this.f69105b;
        }

        public String toString() {
            return h(this.f69105b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f69106a = new b();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Object f69107b = d.c(g2.f100423a);

        @k
        public final Object a() {
            return f69107b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: l.c$c, reason: collision with other inner class name */
    public static final class C0832c {
        public static <T> T a(@k c<T> cVar) {
            throw new IllegalStateException("The driver used with SQLDelight is asynchronous, so SQLDelight should be configured for\nasynchronous usage:\n\nsqldelight {\n  databases {\n    MyDatabase {\n      generateAsync = true\n    }\n  }\n}");
        }
    }

    T getValue();

    @m80.l
    Object i(@k j00.c<? super T> cVar);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @h
    public static final class d<T> implements c<T> {

        /* renamed from: b, reason: collision with root package name */
        public final T f69108b;

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ d(Object obj) {
            this.f69108b = obj;
        }

        public static final /* synthetic */ d b(Object obj) {
            return new d(obj);
        }

        public static boolean d(Object obj, Object obj2) {
            return (obj2 instanceof d) && g0.g(obj, ((d) obj2).h());
        }

        public static final boolean e(Object obj, Object obj2) {
            return g0.g(obj, obj2);
        }

        public static int f(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static String g(Object obj) {
            return "Value(value=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return d(this.f69108b, obj);
        }

        @Override // l.c
        public T getValue() {
            return this.f69108b;
        }

        public final /* synthetic */ Object h() {
            return this.f69108b;
        }

        public int hashCode() {
            return f(this.f69108b);
        }

        @Override // l.c
        @m80.l
        public Object i(@k j00.c<? super T> cVar) {
            return a(this.f69108b, cVar);
        }

        public String toString() {
            return g(this.f69108b);
        }

        @k
        public static <T> Object c(T t11) {
            return t11;
        }

        @m80.l
        public static Object a(Object obj, @k j00.c<? super T> cVar) {
            return obj;
        }
    }
}
