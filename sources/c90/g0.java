package c90;

import ba0.e4;
import c90.g0;
import com.huawei.hms.framework.common.ContainerUtils;
import f90.d;
import java.text.FieldPosition;
import java.text.Format;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.extension.ExtensionConfigurationException;
import org.junit.jupiter.api.j2;
import org.junit.jupiter.api.t2;
import org.junit.platform.commons.JUnitException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final e[] f8388a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f8389a;

        /* renamed from: b, reason: collision with root package name */
        public final f90.d f8390b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f8391c;

        public b(int invocationIndex, f90.d arguments, Object[] consumedArguments) {
            this.f8389a = invocationIndex;
            this.f8390b = arguments;
            this.f8391c = consumedArguments;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements e {

        /* renamed from: c, reason: collision with root package name */
        public final ConcurrentMap<Integer, e> f8392c = new ConcurrentHashMap(1);

        /* renamed from: d, reason: collision with root package name */
        public final Function<Integer, e> f8393d;

        public c(Function<Integer, e> factory) {
            this.f8393d = factory;
        }

        @Override // c90.g0.e
        public void b(b context, StringBuffer result) {
            this.f8392c.computeIfAbsent(Integer.valueOf(context.f8391c.length), this.f8393d).b(context, result);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements e {

        /* renamed from: e, reason: collision with root package name */
        public static final char f8394e = 8230;

        /* renamed from: c, reason: collision with root package name */
        public final MessageFormat f8395c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8396d;

        public d(String pattern, int argumentMaxLength) {
            this.f8395c = new MessageFormat(pattern);
            this.f8396d = argumentMaxLength;
        }

        @Override // c90.g0.e
        public synchronized void b(b context, StringBuffer result) {
            this.f8395c.format(d(context.f8391c), result, new FieldPosition(0));
        }

        public final Object[] d(Object[] arguments) {
            Format[] formatsByArgumentIndex = this.f8395c.getFormatsByArgumentIndex();
            Object[] copyOf = Arrays.copyOf(arguments, Math.min(arguments.length, formatsByArgumentIndex.length), Object[].class);
            for (int i11 = 0; i11 < copyOf.length; i11++) {
                if (formatsByArgumentIndex[i11] == null) {
                    copyOf[i11] = e(e4.i(arguments[i11]));
                }
            }
            return copyOf;
        }

        public final String e(String argument) {
            if (argument == null || argument.length() <= this.f8396d) {
                return argument;
            }
            return argument.substring(0, this.f8396d - 1) + (char) 8230;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f8397a = new e() { // from class: c90.h0
            @Override // c90.g0.e
            public final void b(g0.b bVar, StringBuffer stringBuffer) {
                stringBuffer.append(bVar.f8389a);
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public static final e f8398b = new e() { // from class: c90.i0
            @Override // c90.g0.e
            public final void b(g0.b bVar, StringBuffer stringBuffer) {
                g0.e.c(bVar, stringBuffer);
            }
        };

        static /* synthetic */ void c(b bVar, StringBuffer stringBuffer) {
            if (!(bVar.f8390b instanceof d.b)) {
                throw new ExtensionConfigurationException(String.format("When the display name pattern for a @ParameterizedTest contains %s, the arguments must be supplied as an ArgumentSet.", c90.a.f8378e));
            }
            stringBuffer.append(((d.b) bVar.f8390b).d());
        }

        void b(b context, StringBuffer result);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, e> f8399a;

        /* renamed from: b, reason: collision with root package name */
        public int f8400b;

        public f() {
            this.f8399a = new LinkedHashMap();
            this.f8400b = Integer.MAX_VALUE;
        }

        public e b(String placeholder) {
            return this.f8399a.get(placeholder);
        }

        public Set<String> c() {
            return this.f8399a.keySet();
        }

        public void d(String placeholder, e formatter) {
            this.f8399a.put(placeholder, formatter);
            int length = placeholder.length();
            if (length < this.f8400b) {
                this.f8400b = length;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f8401a;

        /* renamed from: b, reason: collision with root package name */
        public final String f8402b;

        public g(int index, String placeholder) {
            this.f8401a = index;
            this.f8402b = placeholder;
        }
    }

    public g0(String pattern, String displayName, o methodContext, int argumentMaxLength) {
        try {
            this.f8388a = r(pattern, displayName, methodContext, argumentMaxLength);
        } catch (Exception e11) {
            throw new JUnitException("The display name pattern defined for the parameterized test is invalid. See nested exception for further details.", e11);
        }
    }

    public static /* synthetic */ String a(o oVar, int i11) {
        return ((String) oVar.c(i11).map(new Function() { // from class: c90.e0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return g0.c((String) obj);
            }
        }).orElse("")) + "{" + i11 + com.alipay.sdk.m.u.i.f11099d;
    }

    public static /* synthetic */ String c(String str) {
        return str + ContainerUtils.KEY_VALUE_DELIMITER;
    }

    public static /* synthetic */ e e(o oVar, int i11, Integer num) {
        return new d(k(num.intValue(), oVar), i11);
    }

    public static /* synthetic */ void f(e eVar, b bVar, StringBuffer stringBuffer) {
        if (bVar.f8390b instanceof d.b) {
            eVar = e.f8398b;
        }
        eVar.b(bVar, stringBuffer);
    }

    public static /* synthetic */ e g(int i11, Integer num) {
        return new d(j(num.intValue()), i11);
    }

    public static /* synthetic */ String h(int i11) {
        return "{" + i11 + com.alipay.sdk.m.u.i.f11099d;
    }

    public static /* synthetic */ Object i(Object obj) {
        return obj instanceof t2 ? ((t2) obj).getName() : obj;
    }

    public static String j(int length) {
        return (String) IntStream.range(0, length).mapToObj(new IntFunction() { // from class: c90.d0
            @Override // java.util.function.IntFunction
            public final Object apply(int i11) {
                return g0.h(i11);
            }
        }).collect(Collectors.joining(j2.O));
    }

    public static String k(int length, final o methodContext) {
        return (String) IntStream.range(0, length).mapToObj(new IntFunction() { // from class: c90.y
            @Override // java.util.function.IntFunction
            public final Object apply(int i11) {
                return g0.a(o.this, i11);
            }
        }).collect(Collectors.joining(j2.O));
    }

    public static e m(final String segment, int argumentMaxLength) {
        return segment.contains("{") ? new d(segment, argumentMaxLength) : new e() { // from class: c90.x
            @Override // c90.g0.e
            public final void b(g0.b bVar, StringBuffer stringBuffer) {
                stringBuffer.append(segment);
            }
        };
    }

    public static g o(f formatters, String segment) {
        g gVar = null;
        if (segment.length() < formatters.f8400b) {
            return null;
        }
        for (String str : formatters.c()) {
            int indexOf = segment.indexOf(str);
            if (indexOf >= 0) {
                if (indexOf < formatters.f8400b) {
                    return new g(indexOf, str);
                }
                if (gVar == null || indexOf < gVar.f8401a) {
                    gVar = new g(indexOf, str);
                }
            }
        }
        return gVar;
    }

    public final f l(final String displayName, final o methodContext, final int argumentMaxLength) {
        final c cVar = new c(new Function() { // from class: c90.z
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return g0.e(o.this, argumentMaxLength, (Integer) obj);
            }
        });
        f fVar = new f();
        fVar.d(c90.a.f8375b, e.f8397a);
        fVar.d("{displayName}", new e() { // from class: c90.a0
            @Override // c90.g0.e
            public final void b(g0.b bVar, StringBuffer stringBuffer) {
                stringBuffer.append(displayName);
            }
        });
        fVar.d(c90.a.f8378e, e.f8398b);
        fVar.d(c90.a.f8377d, cVar);
        fVar.d(c90.a.f8376c, new c(new Function() { // from class: c90.b0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return g0.g(argumentMaxLength, (Integer) obj);
            }
        }));
        fVar.d(c90.a.f8379f, new e() { // from class: c90.c0
            @Override // c90.g0.e
            public final void b(g0.b bVar, StringBuffer stringBuffer) {
                g0.f(g0.e.this, bVar, stringBuffer);
            }
        });
        return fVar;
    }

    public final Object[] n(Object[] arguments) {
        return Arrays.stream(arguments).map(new Function() { // from class: c90.f0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return g0.i(obj);
            }
        }).toArray();
    }

    public String p(int invocationIndex, f90.d arguments, Object[] consumedArguments) {
        try {
            return q(invocationIndex, arguments, consumedArguments);
        } catch (Exception e11) {
            throw new JUnitException("Failed to format display name for parameterized test. See nested exception for further details.", e11);
        }
    }

    public final String q(int invocationIndex, f90.d arguments, Object[] consumedArguments) {
        b bVar = new b(invocationIndex, arguments, n(consumedArguments));
        StringBuffer stringBuffer = new StringBuffer();
        for (e eVar : this.f8388a) {
            eVar.b(bVar, stringBuffer);
        }
        return stringBuffer.toString();
    }

    public final e[] r(String pattern, String displayName, o methodContext, int argumentMaxLength) {
        ArrayList arrayList = new ArrayList();
        f l11 = l(displayName, methodContext, argumentMaxLength);
        while (true) {
            if (!e4.h(pattern)) {
                break;
            }
            g o11 = o(l11, pattern);
            if (o11 == null) {
                arrayList.add(m(pattern, argumentMaxLength));
                break;
            }
            int i11 = o11.f8401a;
            if (i11 > 0) {
                arrayList.add(m(pattern.substring(0, i11), argumentMaxLength));
            }
            arrayList.add(l11.b(o11.f8402b));
            pattern = pattern.substring(o11.f8401a + o11.f8402b.length());
        }
        return (e[]) arrayList.toArray(new e[0]);
    }
}
