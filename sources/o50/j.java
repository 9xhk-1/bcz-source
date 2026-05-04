package o50;

import f50.b0;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import x00.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.f
/* loaded from: classes8.dex */
public interface j {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        public static <T> void a(@m80.k j jVar, @m80.k h10.d<T> kClass, @m80.k f50.i<T> serializer) {
            g0.p(kClass, "kClass");
            g0.p(serializer, "serializer");
            j.super.d(kClass, serializer);
        }

        @n(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @w0(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
        @Deprecated
        public static <Base> void b(@m80.k j jVar, @m80.k h10.d<Base> baseClass, @m80.k l<? super String, ? extends f50.e<? extends Base>> defaultDeserializerProvider) {
            g0.p(baseClass, "baseClass");
            g0.p(defaultDeserializerProvider, "defaultDeserializerProvider");
            j.super.f(baseClass, defaultDeserializerProvider);
        }
    }

    static f50.i h(f50.i iVar, List it) {
        g0.p(it, "it");
        return iVar;
    }

    <Base> void b(@m80.k h10.d<Base> dVar, @m80.k l<? super String, ? extends f50.e<? extends Base>> lVar);

    <Base> void c(@m80.k h10.d<Base> dVar, @m80.k l<? super Base, ? extends b0<? super Base>> lVar);

    default <T> void d(@m80.k h10.d<T> kClass, @m80.k final f50.i<T> serializer) {
        g0.p(kClass, "kClass");
        g0.p(serializer, "serializer");
        g(kClass, new l() { // from class: o50.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                f50.i h11;
                h11 = j.h(f50.i.this, (List) obj);
                return h11;
            }
        });
    }

    <Base, Sub extends Base> void e(@m80.k h10.d<Base> dVar, @m80.k h10.d<Sub> dVar2, @m80.k f50.i<Sub> iVar);

    @n(level = DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @w0(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    default <Base> void f(@m80.k h10.d<Base> baseClass, @m80.k l<? super String, ? extends f50.e<? extends Base>> defaultDeserializerProvider) {
        g0.p(baseClass, "baseClass");
        g0.p(defaultDeserializerProvider, "defaultDeserializerProvider");
        b(baseClass, defaultDeserializerProvider);
    }

    <T> void g(@m80.k h10.d<T> dVar, @m80.k l<? super List<? extends f50.i<?>>, ? extends f50.i<?>> lVar);
}
