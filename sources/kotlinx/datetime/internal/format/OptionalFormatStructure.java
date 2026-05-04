package kotlinx.datetime.internal.format;

import a00.h0;
import a00.i0;
import a00.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.datetime.internal.format.OptionalFormatStructure;
import m80.k;
import org.junit.jupiter.api.j2;
import u40.c0;
import u40.g;
import u40.j;
import u40.n;
import u40.o;
import u40.p;
import u40.t;
import u40.w;
import v40.c;
import v40.e;
import w40.e0;
import x00.l;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFormatStructure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormatStructure.kt\nkotlinx/datetime/internal/format/OptionalFormatStructure\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 FormatStructure.kt\nkotlinx/datetime/internal/format/OptionalFormatStructure$PropertyWithDefault\n*L\n1#1,271:1\n1563#2:272\n1634#2,3:273\n1563#2:276\n1634#2,2:277\n1636#2:280\n218#3:279\n215#3,2:281\n*S KotlinDebug\n*F\n+ 1 FormatStructure.kt\nkotlinx/datetime/internal/format/OptionalFormatStructure\n*L\n152#1:272\n152#1:273,3\n187#1:276\n187#1:277,2\n187#1:280\n187#1:279\n174#1:281,2\n*E\n"})
/* loaded from: classes8.dex */
public final class OptionalFormatStructure<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f68512a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o<T> f68513b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<PropertyWithDefault<T, ? extends Object>> f68514c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PropertyWithDefault<T, E> {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f68515c = new a(null);

        /* renamed from: a, reason: collision with root package name */
        @k
        public final u40.b<T, E> f68516a;

        /* renamed from: b, reason: collision with root package name */
        public final E f68517b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
            public /* synthetic */ a(v vVar) {
                this();
            }

            @k
            public final <T, E> PropertyWithDefault<T, E> a(@k n<? super T, E> field) {
                g0.p(field, "field");
                E defaultValue = field.getDefaultValue();
                if (defaultValue != null) {
                    return new PropertyWithDefault<>(field.a(), defaultValue, null);
                }
                throw new IllegalArgumentException(("The field '" + field.getName() + "' does not define a default value").toString());
            }

            public a() {
            }
        }

        public /* synthetic */ PropertyWithDefault(u40.b bVar, Object obj, v vVar) {
            this(bVar, obj);
        }

        public final void c(T t11) {
            this.f68516a.d(t11, this.f68517b);
        }

        @k
        public final g<T, E> d() {
            return new g<>(this.f68517b, new OptionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1(this.f68516a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PropertyWithDefault(u40.b<? super T, E> bVar, E e11) {
            this.f68516a = bVar;
            this.f68517b = e11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements l<T, Boolean> {
        public a(Object obj) {
            super(1, obj, u40.v.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t11) {
            return Boolean.valueOf(((u40.v) this.receiver).test(t11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReferenceImpl implements l<Object, Boolean> {
        public b(Object obj) {
            super(1, obj, c0.class, "test", "test(Ljava/lang/Object;)Z", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((c0) this.receiver).test(obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionalFormatStructure(@k String onZero, @k o<? super T> format) {
        List b11;
        g0.p(onZero, "onZero");
        g0.p(format, "format");
        this.f68512a = onZero;
        this.f68513b = format;
        b11 = p.b(format);
        List list = b11;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((u40.l) it.next()).c());
        }
        List e22 = r0.e2(arrayList);
        ArrayList arrayList2 = new ArrayList(i0.d0(e22, 10));
        Iterator<T> it2 = e22.iterator();
        while (it2.hasNext()) {
            arrayList2.add(PropertyWithDefault.f68515c.a((n) it2.next()));
        }
        this.f68514c = arrayList2;
    }

    public static final g2 f(OptionalFormatStructure optionalFormatStructure, Object obj) {
        for (PropertyWithDefault<T, ? extends Object> propertyWithDefault : optionalFormatStructure.f68514c) {
            propertyWithDefault.f68516a.d(obj, propertyWithDefault.f68517b);
        }
        return g2.f100423a;
    }

    @Override // u40.o
    @k
    public e<T> a() {
        e<T> a11 = this.f68513b.a();
        List<PropertyWithDefault<T, ? extends Object>> list = this.f68514c;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            PropertyWithDefault propertyWithDefault = (PropertyWithDefault) it.next();
            arrayList.add(new g(propertyWithDefault.f68517b, new OptionalFormatStructure$PropertyWithDefault$isDefaultComparisonPredicate$1(propertyWithDefault.f68516a)));
        }
        u40.v a12 = w.a(arrayList);
        return a12 instanceof c0 ? new c(this.f68512a) : new v40.b(h0.Q(h1.a(new a(a12), new c(this.f68512a)), h1.a(new b(c0.f91774a), a11)));
    }

    @Override // u40.o
    @k
    public w40.t<T> b() {
        return new w40.t<>(h0.J(), h0.Q(this.f68513b.b(), w40.p.c(h0.Q(new j(this.f68512a).b(), new w40.t(this.f68514c.isEmpty() ? h0.J() : a00.g0.l(new e0(new l() { // from class: u40.u
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f11;
                f11 = OptionalFormatStructure.f(OptionalFormatStructure.this, obj);
                return f11;
            }
        })), h0.J())))));
    }

    @k
    public final o<T> d() {
        return this.f68513b;
    }

    @k
    public final String e() {
        return this.f68512a;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof OptionalFormatStructure)) {
            return false;
        }
        OptionalFormatStructure optionalFormatStructure = (OptionalFormatStructure) obj;
        return g0.g(this.f68512a, optionalFormatStructure.f68512a) && g0.g(this.f68513b, optionalFormatStructure.f68513b);
    }

    public int hashCode() {
        return (this.f68512a.hashCode() * 31) + this.f68513b.hashCode();
    }

    @k
    public String toString() {
        return "Optional(" + this.f68512a + j2.O + this.f68513b + ')';
    }
}
