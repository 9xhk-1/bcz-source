package o50;

import a00.n1;
import f50.b0;
import j50.f2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import o50.a;
import x00.l;
import yz.n;
import yz.v0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSerializersModuleBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n382#2,7:264\n382#2,7:271\n1#3:278\n*S KotlinDebug\n*F\n+ 1 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuilder\n*L\n196#1:264,7\n197#1:271,7\n*E\n"})
/* loaded from: classes8.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<h10.d<?>, a> f75929a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Map<h10.d<?>, Map<h10.d<?>, f50.i<?>>> f75930b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Map<h10.d<?>, l<?, b0<?>>> f75931c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Map<h10.d<?>, Map<String, f50.i<?>>> f75932d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Map<h10.d<?>, l<String, f50.e<?>>> f75933e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f75934f;

    @v0
    public g() {
    }

    public static /* synthetic */ void p(g gVar, h10.d dVar, h10.d dVar2, f50.i iVar, boolean z11, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        gVar.o(dVar, dVar2, iVar, z11);
    }

    public static /* synthetic */ void r(g gVar, h10.d dVar, a aVar, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        gVar.q(dVar, aVar, z11);
    }

    @Override // o50.j
    public <Base> void b(@m80.k h10.d<Base> baseClass, @m80.k l<? super String, ? extends f50.e<? extends Base>> defaultDeserializerProvider) {
        g0.p(baseClass, "baseClass");
        g0.p(defaultDeserializerProvider, "defaultDeserializerProvider");
        m(baseClass, defaultDeserializerProvider, false);
    }

    @Override // o50.j
    public <Base> void c(@m80.k h10.d<Base> baseClass, @m80.k l<? super Base, ? extends b0<? super Base>> defaultSerializerProvider) {
        g0.p(baseClass, "baseClass");
        g0.p(defaultSerializerProvider, "defaultSerializerProvider");
        n(baseClass, defaultSerializerProvider, false);
    }

    @Override // o50.j
    public <T> void d(@m80.k h10.d<T> kClass, @m80.k f50.i<T> serializer) {
        g0.p(kClass, "kClass");
        g0.p(serializer, "serializer");
        r(this, kClass, new a.C0927a(serializer), false, 4, null);
    }

    @Override // o50.j
    public <Base, Sub extends Base> void e(@m80.k h10.d<Base> baseClass, @m80.k h10.d<Sub> actualClass, @m80.k f50.i<Sub> actualSerializer) {
        g0.p(baseClass, "baseClass");
        g0.p(actualClass, "actualClass");
        g0.p(actualSerializer, "actualSerializer");
        p(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    @Override // o50.j
    @n(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @w0(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    public <Base> void f(@m80.k h10.d<Base> dVar, @m80.k l<? super String, ? extends f50.e<? extends Base>> lVar) {
        super.f(dVar, lVar);
    }

    @Override // o50.j
    public <T> void g(@m80.k h10.d<T> kClass, @m80.k l<? super List<? extends f50.i<?>>, ? extends f50.i<?>> provider) {
        g0.p(kClass, "kClass");
        g0.p(provider, "provider");
        r(this, kClass, new a.b(provider), false, 4, null);
    }

    @v0
    @m80.k
    public final f k() {
        return new d(this.f75929a, this.f75930b, this.f75931c, this.f75932d, this.f75933e, this.f75934f);
    }

    public final void l(@m80.k f module) {
        g0.p(module, "module");
        module.a(this);
    }

    @w00.j(name = "registerDefaultPolymorphicDeserializer")
    public final <Base> void m(@m80.k h10.d<Base> baseClass, @m80.k l<? super String, ? extends f50.e<? extends Base>> defaultDeserializerProvider, boolean z11) {
        g0.p(baseClass, "baseClass");
        g0.p(defaultDeserializerProvider, "defaultDeserializerProvider");
        l<String, f50.e<?>> lVar = this.f75933e.get(baseClass);
        if (lVar == null || g0.g(lVar, defaultDeserializerProvider) || z11) {
            this.f75933e.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + lVar);
    }

    @w00.j(name = "registerDefaultPolymorphicSerializer")
    public final <Base> void n(@m80.k h10.d<Base> baseClass, @m80.k l<? super Base, ? extends b0<? super Base>> defaultSerializerProvider, boolean z11) {
        g0.p(baseClass, "baseClass");
        g0.p(defaultSerializerProvider, "defaultSerializerProvider");
        l<?, b0<?>> lVar = this.f75931c.get(baseClass);
        if (lVar == null || g0.g(lVar, defaultSerializerProvider) || z11) {
            this.f75931c.put(baseClass, defaultSerializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + lVar);
    }

    @w00.j(name = "registerPolymorphicSerializer")
    public final <Base, Sub extends Base> void o(@m80.k h10.d<Base> baseClass, @m80.k h10.d<Sub> concreteClass, @m80.k f50.i<Sub> concreteSerializer, boolean z11) {
        Object obj;
        h10.d dVar;
        g0.p(baseClass, "baseClass");
        g0.p(concreteClass, "concreteClass");
        g0.p(concreteSerializer, "concreteSerializer");
        String k11 = concreteSerializer.a().k();
        Map<h10.d<?>, Map<h10.d<?>, f50.i<?>>> map = this.f75930b;
        Map<h10.d<?>, f50.i<?>> map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new HashMap<>();
            map.put(baseClass, map2);
        }
        Map<h10.d<?>, f50.i<?>> map3 = map2;
        Map<h10.d<?>, Map<String, f50.i<?>>> map4 = this.f75932d;
        Map<String, f50.i<?>> map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new HashMap<>();
            map4.put(baseClass, map5);
        }
        Map<String, f50.i<?>> map6 = map5;
        f50.i<?> iVar = map3.get(concreteClass);
        if (iVar != null && !g0.g(iVar, concreteSerializer)) {
            if (!z11) {
                throw new e(baseClass, concreteClass);
            }
            map6.remove(iVar.a().k());
        }
        f50.i<?> iVar2 = map6.get(k11);
        if (iVar2 != null && !g0.g(iVar2, concreteSerializer)) {
            Iterator it = n1.T0(map3).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((Map.Entry) obj).getValue() == iVar2) {
                        break;
                    }
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null || (dVar = (h10.d) entry.getKey()) == null) {
                throw new IllegalStateException(("Name " + k11 + " is registered in the module but no Kotlin class is associated with it.").toString());
            }
            if (!z11) {
                throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + baseClass + "' have the same serial name '" + k11 + "': " + concreteSerializer + " for '" + concreteClass + "' and " + iVar2 + " for '" + dVar + '\'');
            }
            map3.remove(dVar);
        }
        map3.put(concreteClass, concreteSerializer);
        map6.put(k11, concreteSerializer);
    }

    @w00.j(name = "registerSerializer")
    public final <T> void q(@m80.k h10.d<T> forClass, @m80.k a provider, boolean z11) {
        a aVar;
        g0.p(forClass, "forClass");
        g0.p(provider, "provider");
        if (z11 || (aVar = this.f75929a.get(forClass)) == null || g0.g(aVar, provider)) {
            this.f75929a.put(forClass, provider);
            if (f2.n(forClass)) {
                this.f75934f = true;
                return;
            }
            return;
        }
        throw new e("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
    }
}
