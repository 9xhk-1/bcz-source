package o50;

import f50.b0;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import o50.a;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,245:1\n216#2,2:246\n216#2:248\n216#2:249\n217#2:251\n217#2:252\n216#2,2:253\n216#2,2:255\n78#3:250\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerialModuleImpl\n*L\n186#1:246,2\n196#1:248\n197#1:249\n197#1:251\n196#1:252\n206#1:253,2\n210#1:255,2\n201#1:250\n*E\n"})
/* loaded from: classes8.dex */
public final class d extends f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<h10.d<?>, a> f75923a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final Map<h10.d<?>, Map<h10.d<?>, f50.i<?>>> f75924b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Map<h10.d<?>, l<?, b0<?>>> f75925c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Map<h10.d<?>, Map<String, f50.i<?>>> f75926d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Map<h10.d<?>, l<String, f50.e<?>>> f75927e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f75928f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(@m80.k Map<h10.d<?>, ? extends a> class2ContextualFactory, @m80.k Map<h10.d<?>, ? extends Map<h10.d<?>, ? extends f50.i<?>>> polyBase2Serializers, @m80.k Map<h10.d<?>, ? extends l<?, ? extends b0<?>>> polyBase2DefaultSerializerProvider, @m80.k Map<h10.d<?>, ? extends Map<String, ? extends f50.i<?>>> polyBase2NamedSerializers, @m80.k Map<h10.d<?>, ? extends l<? super String, ? extends f50.e<?>>> polyBase2DefaultDeserializerProvider, boolean z11) {
        super(null);
        g0.p(class2ContextualFactory, "class2ContextualFactory");
        g0.p(polyBase2Serializers, "polyBase2Serializers");
        g0.p(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        g0.p(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        g0.p(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f75923a = class2ContextualFactory;
        this.f75924b = polyBase2Serializers;
        this.f75925c = polyBase2DefaultSerializerProvider;
        this.f75926d = polyBase2NamedSerializers;
        this.f75927e = polyBase2DefaultDeserializerProvider;
        this.f75928f = z11;
    }

    @Override // o50.f
    public void a(@m80.k j collector) {
        g0.p(collector, "collector");
        for (Map.Entry<h10.d<?>, a> entry : this.f75923a.entrySet()) {
            h10.d<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C0927a) {
                g0.n(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                f50.i<?> b11 = ((a.C0927a) value).b();
                g0.n(b11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.d(key, b11);
            } else {
                if (!(value instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                collector.g(key, ((a.b) value).b());
            }
        }
        for (Map.Entry<h10.d<?>, Map<h10.d<?>, f50.i<?>>> entry2 : this.f75924b.entrySet()) {
            h10.d<?> key2 = entry2.getKey();
            for (Map.Entry<h10.d<?>, f50.i<?>> entry3 : entry2.getValue().entrySet()) {
                h10.d<?> key3 = entry3.getKey();
                f50.i<?> value2 = entry3.getValue();
                g0.n(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                g0.n(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                g0.n(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.e(key2, key3, value2);
            }
        }
        for (Map.Entry<h10.d<?>, l<?, b0<?>>> entry4 : this.f75925c.entrySet()) {
            h10.d<?> key4 = entry4.getKey();
            l<?, b0<?>> value3 = entry4.getValue();
            g0.n(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            g0.n(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.c(key4, (l) x0.q(value3, 1));
        }
        for (Map.Entry<h10.d<?>, l<String, f50.e<?>>> entry5 : this.f75927e.entrySet()) {
            h10.d<?> key5 = entry5.getKey();
            l<String, f50.e<?>> value4 = entry5.getValue();
            g0.n(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            g0.n(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.b(key5, (l) x0.q(value4, 1));
        }
    }

    @Override // o50.f
    @m80.l
    public <T> f50.i<T> c(@m80.k h10.d<T> kClass, @m80.k List<? extends f50.i<?>> typeArgumentsSerializers) {
        g0.p(kClass, "kClass");
        g0.p(typeArgumentsSerializers, "typeArgumentsSerializers");
        a aVar = this.f75923a.get(kClass);
        f50.i<T> iVar = aVar != null ? (f50.i<T>) aVar.a(typeArgumentsSerializers) : null;
        if (iVar instanceof f50.i) {
            return iVar;
        }
        return null;
    }

    @Override // o50.f
    public boolean e() {
        return this.f75928f;
    }

    @Override // o50.f
    @m80.l
    public <T> f50.e<T> g(@m80.k h10.d<? super T> baseClass, @m80.l String str) {
        g0.p(baseClass, "baseClass");
        Map<String, f50.i<?>> map = this.f75926d.get(baseClass);
        f50.i<?> iVar = map != null ? map.get(str) : null;
        if (!(iVar instanceof f50.i)) {
            iVar = null;
        }
        if (iVar != null) {
            return iVar;
        }
        l<String, f50.e<?>> lVar = this.f75927e.get(baseClass);
        l<String, f50.e<?>> lVar2 = x0.B(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (f50.e) lVar2.invoke(str);
        }
        return null;
    }

    @Override // o50.f
    @m80.l
    public <T> b0<T> h(@m80.k h10.d<? super T> baseClass, @m80.k T value) {
        g0.p(baseClass, "baseClass");
        g0.p(value, "value");
        if (!baseClass.B(value)) {
            return null;
        }
        Map<h10.d<?>, f50.i<?>> map = this.f75924b.get(baseClass);
        f50.i<?> iVar = map != null ? map.get(o0.d(value.getClass())) : null;
        f50.i<?> iVar2 = iVar instanceof b0 ? iVar : null;
        if (iVar2 != null) {
            return iVar2;
        }
        l<?, b0<?>> lVar = this.f75925c.get(baseClass);
        l<?, b0<?>> lVar2 = x0.B(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (b0) lVar2.invoke(value);
        }
        return null;
    }
}
