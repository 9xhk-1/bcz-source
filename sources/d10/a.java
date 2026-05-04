package d10;

import h10.n;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f47010a = new a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n*L\n1#1,73:1\n*E\n"})
    /* renamed from: d10.a$a, reason: collision with other inner class name */
    public static final class C0545a<T> extends c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q<n<?>, T, T, g2> f47011a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0545a(T t11, q<? super n<?>, ? super T, ? super T, g2> qVar) {
            super(t11);
            this.f47011a = qVar;
        }

        @Override // d10.c
        public void afterChange(n<?> property, T t11, T t12) {
            g0.p(property, "property");
            this.f47011a.invoke(property, t11, t12);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$vetoable$1\n*L\n1#1,73:1\n*E\n"})
    public static final class b<T> extends c<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q<n<?>, T, T, Boolean> f47012a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(T t11, q<? super n<?>, ? super T, ? super T, Boolean> qVar) {
            super(t11);
            this.f47012a = qVar;
        }

        @Override // d10.c
        public boolean beforeChange(n<?> property, T t11, T t12) {
            g0.p(property, "property");
            return this.f47012a.invoke(property, t11, t12).booleanValue();
        }
    }

    @k
    public final <T> f<Object, T> a() {
        return new d10.b();
    }

    @k
    public final <T> f<Object, T> b(T t11, @k q<? super n<?>, ? super T, ? super T, g2> onChange) {
        g0.p(onChange, "onChange");
        return new C0545a(t11, onChange);
    }

    @k
    public final <T> f<Object, T> c(T t11, @k q<? super n<?>, ? super T, ? super T, Boolean> onChange) {
        g0.p(onChange, "onChange");
        return new b(t11, onChange);
    }
}
