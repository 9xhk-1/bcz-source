package ya0;

import a00.h0;
import a00.r0;
import androidx.exifinterface.media.ExifInterface;
import h10.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.error.NoParameterFoundException;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@va0.b
@u0({"SMAP\nParametersHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n295#2,2:195\n1#3:197\n*S KotlinDebug\n*F\n+ 1 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n*L\n123#1:195,2\n*E\n"})
/* loaded from: classes9.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<Object> f99779a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Boolean f99780b;

    /* renamed from: c, reason: collision with root package name */
    public int f99781c;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @k
    public final a a(@k Object value) {
        g0.p(value, "value");
        this.f99779a.add(value);
        return this;
    }

    public final /* synthetic */ <T> T b() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) g(0, o0.d(Object.class));
    }

    public final /* synthetic */ <T> T c() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) g(1, o0.d(Object.class));
    }

    public final /* synthetic */ <T> T d() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) g(2, o0.d(Object.class));
    }

    public final /* synthetic */ <T> T e() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) g(3, o0.d(Object.class));
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(p(), aVar.p()) && g0.g(this.f99780b, aVar.f99780b);
    }

    public final /* synthetic */ <T> T f() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) g(4, o0.d(Object.class));
    }

    public <T> T g(int i11, @k d<?> clazz) {
        g0.p(clazz, "clazz");
        if (i11 < this.f99779a.size()) {
            return (T) this.f99779a.get(i11);
        }
        throw new NoParameterFoundException("Can't get injected parameter #" + i11 + " from " + this + " for type '" + fb0.b.a(clazz) + '\'');
    }

    public final /* synthetic */ <T> T h() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        T t11 = (T) n(o0.d(Object.class));
        if (t11 != null) {
            return t11;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("No value found for type '");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb2.append(fb0.b.a(o0.d(Object.class)));
        sb2.append('\'');
        throw new DefinitionParameterException(sb2.toString());
    }

    public int hashCode() {
        int hashCode = p().hashCode() * 31;
        Boolean bool = this.f99780b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final <T> T i(int i11) {
        return (T) this.f99779a.get(i11);
    }

    public final <T> T j(d<?> dVar) {
        T t11;
        Iterator<T> it = this.f99779a.iterator();
        while (true) {
            if (!it.hasNext()) {
                t11 = null;
                break;
            }
            t11 = it.next();
            if (dVar.B(t11)) {
                break;
            }
        }
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    public final int k() {
        return this.f99781c;
    }

    public final <T> T l(d<?> dVar) {
        Object obj = this.f99779a.get(this.f99781c);
        T t11 = null;
        if (!dVar.B(obj)) {
            obj = null;
        }
        if (obj != null) {
            t11 = (T) obj;
        }
        if (t11 != null) {
            s();
        }
        return t11;
    }

    public final /* synthetic */ <T> T m() {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) n(o0.d(Object.class));
    }

    @l
    public <T> T n(@k d<?> clazz) {
        g0.p(clazz, "clazz");
        if (this.f99779a.isEmpty()) {
            return null;
        }
        Boolean bool = this.f99780b;
        if (bool != null) {
            return g0.g(bool, Boolean.TRUE) ? (T) l(clazz) : (T) j(clazz);
        }
        T t11 = (T) l(clazz);
        return t11 == null ? (T) j(clazz) : t11;
    }

    @l
    public final Boolean o() {
        return this.f99780b;
    }

    @k
    public final List<Object> p() {
        return this.f99779a;
    }

    @k
    public final List<Object> q() {
        return this.f99779a;
    }

    @v0
    public final void s() {
        if (this.f99781c < h0.L(this.f99779a)) {
            this.f99781c++;
        }
    }

    @k
    public final a t(int i11, @k Object value) {
        g0.p(value, "value");
        this.f99779a.add(i11, value);
        return this;
    }

    @k
    public String toString() {
        return "DefinitionParameters" + r0.a6(this.f99779a);
    }

    public final boolean u() {
        return this.f99779a.isEmpty();
    }

    public final boolean v() {
        return !this.f99779a.isEmpty();
    }

    public final <T> void w(int i11, T t11) {
        List<Object> list = this.f99779a;
        g0.n(t11, "null cannot be cast to non-null type kotlin.Any");
        list.set(i11, t11);
    }

    public final void x(int i11) {
        this.f99781c = i11;
    }

    public final int y() {
        return this.f99779a.size();
    }

    public a(@k List<Object> _values, @l Boolean bool) {
        g0.p(_values, "_values");
        this.f99779a = _values;
        this.f99780b = bool;
    }

    public /* synthetic */ a(List list, Boolean bool, int i11, v vVar) {
        this((i11 & 1) != 0 ? new ArrayList() : list, (i11 & 2) != 0 ? null : bool);
    }

    @v0
    public static /* synthetic */ void r() {
    }
}
