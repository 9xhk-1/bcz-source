package az;

import a00.h0;
import a00.l1;
import androidx.exifinterface.media.ExifInterface;
import az.e;
import h10.g;
import h10.r;
import io.ktor.utils.io.c0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDataConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataConversion.kt\nio/ktor/util/converters/DataConversion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* loaded from: classes8.dex */
public final class c implements az.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<h10.d<?>, az.a> f5564a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @c0
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Map<h10.d<?>, az.a> f5565a = new LinkedHashMap();

        public final void a(@k h10.d<?> type, @k az.a convertor) {
            g0.p(type, "type");
            g0.p(convertor, "convertor");
            this.f5565a.put(type, convertor);
        }

        public final <T> void b(@k r type, @k l<? super e.a<T>, g2> configure) {
            g0.p(type, "type");
            g0.p(configure, "configure");
            g m11 = type.m();
            g0.n(m11, "null cannot be cast to non-null type kotlin.reflect.KClass<T of io.ktor.util.converters.DataConversion.Configuration.convert>");
            h10.d<?> dVar = (h10.d) m11;
            e.a aVar = new e.a(dVar);
            configure.invoke(aVar);
            a(dVar, new e(dVar, aVar.c(), (l) x0.q(aVar.d(), 1)));
        }

        public final /* synthetic */ <T> void c(l<? super e.a<T>, g2> configure) {
            g0.p(configure, "configure");
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
            b(null, configure);
        }

        @k
        public final Map<h10.d<?>, az.a> d() {
            return this.f5565a;
        }
    }

    public c(@k a configuration) {
        g0.p(configuration, "configuration");
        this.f5564a = l1.D0(configuration.d());
    }

    @Override // az.a
    @m80.l
    public Object a(@k List<String> values, @k gz.a type) {
        g0.p(values, "values");
        g0.p(type, "type");
        if (values.isEmpty()) {
            return null;
        }
        az.a aVar = this.f5564a.get(type.b());
        if (aVar == null) {
            aVar = d.f5566a;
        }
        return aVar.a(values, type);
    }

    @Override // az.a
    @k
    public List<String> b(@m80.l Object obj) {
        if (obj == null) {
            return h0.J();
        }
        az.a aVar = this.f5564a.get(o0.d(obj.getClass()));
        if (aVar == null) {
            aVar = d.f5566a;
        }
        return aVar.b(obj);
    }
}
