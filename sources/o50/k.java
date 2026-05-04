package o50;

import a00.l1;
import f50.b0;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import o50.a;
import x00.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSerializersModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerializersModuleKt\n+ 2 SerializersModuleBuilders.kt\nkotlinx/serialization/modules/SerializersModuleBuildersKt\n*L\n1#1,245:1\n31#2,3:246\n31#2,3:249\n*S KotlinDebug\n*F\n+ 1 SerializersModule.kt\nkotlinx/serialization/modules/SerializersModuleKt\n*L\n97#1:246,3\n109#1:249,3\n*E\n"})
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f f75937a = new d(l1.z(), l1.z(), l1.z(), l1.z(), l1.z(), false);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f75938a;

        public a(g gVar) {
            this.f75938a = gVar;
        }

        @Override // o50.j
        public <Base> void b(h10.d<Base> baseClass, l<? super String, ? extends f50.e<? extends Base>> defaultDeserializerProvider) {
            g0.p(baseClass, "baseClass");
            g0.p(defaultDeserializerProvider, "defaultDeserializerProvider");
            this.f75938a.m(baseClass, defaultDeserializerProvider, true);
        }

        @Override // o50.j
        public <Base> void c(h10.d<Base> baseClass, l<? super Base, ? extends b0<? super Base>> defaultSerializerProvider) {
            g0.p(baseClass, "baseClass");
            g0.p(defaultSerializerProvider, "defaultSerializerProvider");
            this.f75938a.n(baseClass, defaultSerializerProvider, true);
        }

        @Override // o50.j
        public <T> void d(h10.d<T> kClass, f50.i<T> serializer) {
            g0.p(kClass, "kClass");
            g0.p(serializer, "serializer");
            this.f75938a.q(kClass, new a.C0927a(serializer), true);
        }

        @Override // o50.j
        public <Base, Sub extends Base> void e(h10.d<Base> baseClass, h10.d<Sub> actualClass, f50.i<Sub> actualSerializer) {
            g0.p(baseClass, "baseClass");
            g0.p(actualClass, "actualClass");
            g0.p(actualSerializer, "actualSerializer");
            this.f75938a.o(baseClass, actualClass, actualSerializer, true);
        }

        @Override // o50.j
        @n(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @w0(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
        public <Base> void f(h10.d<Base> dVar, l<? super String, ? extends f50.e<? extends Base>> lVar) {
            super.f(dVar, lVar);
        }

        @Override // o50.j
        public <T> void g(h10.d<T> kClass, l<? super List<? extends f50.i<?>>, ? extends f50.i<?>> provider) {
            g0.p(kClass, "kClass");
            g0.p(provider, "provider");
            this.f75938a.q(kClass, new a.b(provider), true);
        }
    }

    @m80.k
    public static final f a() {
        return f75937a;
    }

    @m80.k
    public static final f c(@m80.k f fVar, @m80.k f other) {
        g0.p(fVar, "<this>");
        g0.p(other, "other");
        g gVar = new g();
        gVar.l(fVar);
        other.a(new a(gVar));
        return gVar.k();
    }

    @m80.k
    public static final f d(@m80.k f fVar, @m80.k f other) {
        g0.p(fVar, "<this>");
        g0.p(other, "other");
        g gVar = new g();
        gVar.l(fVar);
        gVar.l(other);
        return gVar.k();
    }

    @n(level = DeprecationLevel.WARNING, message = "Deprecated in the favour of 'EmptySerializersModule()'", replaceWith = @w0(expression = "EmptySerializersModule()", imports = {}))
    public static /* synthetic */ void b() {
    }
}
