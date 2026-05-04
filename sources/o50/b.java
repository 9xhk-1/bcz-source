package o50;

import f50.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.l;
import yz.h1;
import yz.n;
import yz.v0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPolymorphicModuleBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PolymorphicModuleBuilder.kt\nkotlinx/serialization/modules/PolymorphicModuleBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,119:1\n1869#2:120\n1870#2:122\n78#3:121\n*S KotlinDebug\n*F\n+ 1 PolymorphicModuleBuilder.kt\nkotlinx/serialization/modules/PolymorphicModuleBuilder\n*L\n88#1:120\n88#1:122\n92#1:121\n*E\n"})
/* loaded from: classes8.dex */
public final class b<Base> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h10.d<Base> f75918a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final f50.i<Base> f75919b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Pair<h10.d<? extends Base>, f50.i<? extends Base>>> f75920c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public x00.l<? super Base, ? extends b0<? super Base>> f75921d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public x00.l<? super String, ? extends f50.e<? extends Base>> f75922e;

    @v0
    public b(@m80.k h10.d<Base> baseClass, @l f50.i<Base> iVar) {
        g0.p(baseClass, "baseClass");
        this.f75918a = baseClass;
        this.f75919b = iVar;
        this.f75920c = new ArrayList();
    }

    @v0
    public final void a(@m80.k g builder) {
        g0.p(builder, "builder");
        f50.i<Base> iVar = this.f75919b;
        if (iVar != null) {
            h10.d<Base> dVar = this.f75918a;
            g.p(builder, dVar, dVar, iVar, false, 8, null);
        }
        Iterator<T> it = this.f75920c.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            h10.d dVar2 = (h10.d) pair.component1();
            f50.i iVar2 = (f50.i) pair.component2();
            h10.d<Base> dVar3 = this.f75918a;
            g0.n(dVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            g0.n(iVar2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            g.p(builder, dVar3, dVar2, iVar2, false, 8, null);
        }
        x00.l<? super Base, ? extends b0<? super Base>> lVar = this.f75921d;
        if (lVar != null) {
            builder.n(this.f75918a, lVar, false);
        }
        x00.l<? super String, ? extends f50.e<? extends Base>> lVar2 = this.f75922e;
        if (lVar2 != null) {
            builder.m(this.f75918a, lVar2, false);
        }
    }

    @n(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: defaultDeserializer", replaceWith = @w0(expression = "defaultDeserializer(defaultSerializerProvider)", imports = {}))
    public final void b(@m80.k x00.l<? super String, ? extends f50.e<? extends Base>> defaultSerializerProvider) {
        g0.p(defaultSerializerProvider, "defaultSerializerProvider");
        c(defaultSerializerProvider);
    }

    public final void c(@m80.k x00.l<? super String, ? extends f50.e<? extends Base>> defaultDeserializerProvider) {
        g0.p(defaultDeserializerProvider, "defaultDeserializerProvider");
        if (this.f75922e == null) {
            this.f75922e = defaultDeserializerProvider;
            return;
        }
        throw new IllegalArgumentException(("Default deserializer provider is already registered for class " + this.f75918a + ": " + this.f75922e).toString());
    }

    public final <T extends Base> void d(@m80.k h10.d<T> subclass, @m80.k f50.i<T> serializer) {
        g0.p(subclass, "subclass");
        g0.p(serializer, "serializer");
        this.f75920c.add(h1.a(subclass, serializer));
    }

    public /* synthetic */ b(h10.d dVar, f50.i iVar, int i11, v vVar) {
        this(dVar, (i11 & 2) != 0 ? null : iVar);
    }
}
