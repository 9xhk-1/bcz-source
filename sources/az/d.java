package az;

import a00.h0;
import a00.i0;
import a00.m0;
import a00.r0;
import h10.r;
import h10.t;
import io.ktor.util.converters.DataConversionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConversionService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversionService.kt\nio/ktor/util/converters/DefaultConversionService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1368#2:118\n1454#2,5:119\n1557#2:124\n1628#2,3:125\n*S KotlinDebug\n*F\n+ 1 ConversionService.kt\nio/ktor/util/converters/DefaultConversionService\n*L\n38#1:118\n38#1:119,5\n65#1:124\n65#1:125,3\n*E\n"})
/* loaded from: classes8.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f5566a = new d();

    @Override // az.a
    @l
    public Object a(@k List<String> values, @k gz.a type) {
        List<t> arguments;
        t tVar;
        r g11;
        g0.p(values, "values");
        g0.p(type, "type");
        if (values.isEmpty()) {
            return null;
        }
        if (g0.g(type.b(), o0.d(List.class)) || g0.g(type.b(), o0.d(List.class))) {
            r a11 = type.a();
            Object m11 = (a11 == null || (arguments = a11.getArguments()) == null || (tVar = (t) r0.m5(arguments)) == null || (g11 = tVar.g()) == null) ? null : g11.m();
            h10.d<?> dVar = m11 instanceof h10.d ? (h10.d) m11 : null;
            if (dVar != null) {
                List<String> list = values;
                ArrayList arrayList = new ArrayList(i0.d0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(f5566a.d((String) it.next(), dVar));
                }
                return arrayList;
            }
        }
        if (values.isEmpty()) {
            throw new DataConversionException("There are no values when trying to construct single value " + type);
        }
        if (values.size() <= 1) {
            return d((String) r0.m5(values), type.b());
        }
        throw new DataConversionException("There are multiple values when trying to construct single value " + type);
    }

    @Override // az.a
    @k
    public List<String> b(@l Object obj) {
        if (obj == null) {
            return h0.J();
        }
        List<String> c11 = b.c(obj);
        if (c11 != null) {
            return c11;
        }
        if (obj instanceof Iterable) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                m0.s0(arrayList, f5566a.b(it.next()));
            }
            return arrayList;
        }
        h10.d d11 = o0.d(obj.getClass());
        if (g0.g(d11, o0.d(Integer.TYPE)) || g0.g(d11, o0.d(Float.TYPE)) || g0.g(d11, o0.d(Double.TYPE)) || g0.g(d11, o0.d(Long.TYPE)) || g0.g(d11, o0.d(Short.TYPE)) || g0.g(d11, o0.d(Character.TYPE)) || g0.g(d11, o0.d(Boolean.TYPE)) || g0.g(d11, o0.d(String.class))) {
            return a00.g0.l(obj.toString());
        }
        throw new DataConversionException("Class " + d11 + " is not supported in default data conversion service");
    }

    public final Object c(h10.d<?> dVar, String str) {
        if (g0.g(dVar, o0.d(Integer.TYPE))) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (g0.g(dVar, o0.d(Float.TYPE))) {
            return Float.valueOf(Float.parseFloat(str));
        }
        if (g0.g(dVar, o0.d(Double.TYPE))) {
            return Double.valueOf(Double.parseDouble(str));
        }
        if (g0.g(dVar, o0.d(Long.TYPE))) {
            return Long.valueOf(Long.parseLong(str));
        }
        if (g0.g(dVar, o0.d(Short.TYPE))) {
            return Short.valueOf(Short.parseShort(str));
        }
        if (g0.g(dVar, o0.d(Character.TYPE))) {
            return Character.valueOf(u30.r0.k9(str));
        }
        if (g0.g(dVar, o0.d(Boolean.TYPE))) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }
        if (g0.g(dVar, o0.d(String.class))) {
            return str;
        }
        return null;
    }

    @k
    public final Object d(@k String value, @k h10.d<?> klass) {
        g0.p(value, "value");
        g0.p(klass, "klass");
        Object c11 = c(klass, value);
        if (c11 != null) {
            return c11;
        }
        Object b11 = b.b(value, klass);
        if (b11 != null) {
            return b11;
        }
        e(klass.toString());
        throw new KotlinNothingValueException();
    }

    public final Void e(String str) {
        throw new DataConversionException("Type " + str + " is not supported in default data conversion service");
    }
}
