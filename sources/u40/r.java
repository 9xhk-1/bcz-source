package u40;

import a00.h0;
import a00.i0;
import a00.k1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFieldFormatDirective.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldFormatDirective.kt\nkotlinx/datetime/internal/format/NamedEnumIntFieldFormatDirective\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n1193#2,2:221\n1267#2,4:223\n*S KotlinDebug\n*F\n+ 1 FieldFormatDirective.kt\nkotlinx/datetime/internal/format/NamedEnumIntFieldFormatDirective\n*L\n125#1:221,2\n125#1:223,4\n*E\n"})
/* loaded from: classes8.dex */
public abstract class r<Target, Type> implements l<Target> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n<Target, Type> f91803a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Map<Type, String> f91804b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f91805c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Map<String, Type> f91806d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nFieldFormatDirective.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldFormatDirective.kt\nkotlinx/datetime/internal/format/NamedEnumIntFieldFormatDirective$AssignableString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n1#2:221\n*E\n"})
    public final class a implements w40.a<Target, String> {
        public a() {
        }

        @Override // w40.a
        @m80.l
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String d(Target target, @m80.k String newValue) {
            g0.p(newValue, "newValue");
            u40.b<Target, Type> a11 = r.this.c().a();
            Object obj = r.this.f91806d.get(newValue);
            g0.m(obj);
            Type d11 = a11.d(target, obj);
            if (d11 != null) {
                return (String) r.this.f91804b.get(d11);
            }
            return null;
        }

        @Override // w40.a
        @m80.k
        public String getName() {
            return r.this.f91805c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReferenceImpl implements x00.l<Target, String> {
        public b(Object obj) {
            super(1, obj, r.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Target target) {
            return ((r) this.receiver).i(target);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(@m80.k n<? super Target, Type> field, @m80.k Map<Type, String> mapping, @m80.k String name) {
        g0.p(field, "field");
        g0.p(mapping, "mapping");
        g0.p(name, "name");
        this.f91803a = field;
        this.f91804b = mapping;
        this.f91805c = name;
        Set<Map.Entry<Type, String>> entrySet = mapping.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(i0.d0(entrySet, 10)), 16));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair a11 = h1.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(a11.getFirst(), a11.getSecond());
        }
        this.f91806d = linkedHashMap;
    }

    @Override // u40.l
    @m80.k
    public v40.e<Target> a() {
        return new v40.j(new b(this));
    }

    @Override // u40.l
    @m80.k
    public w40.t<Target> b() {
        return new w40.t<>(a00.g0.l(new w40.b0(this.f91804b.values(), new a(), "one of " + this.f91804b.values() + " for " + this.f91805c)), h0.J());
    }

    @Override // u40.l
    @m80.k
    public final n<Target, Type> c() {
        return this.f91803a;
    }

    public final String i(Target target) {
        Type c11 = this.f91803a.a().c(target);
        String str = this.f91804b.get(this.f91803a.a().c(target));
        if (str != null) {
            return str;
        }
        return "The value " + c11 + " of " + this.f91803a.getName() + " does not have a corresponding string representation";
    }
}
