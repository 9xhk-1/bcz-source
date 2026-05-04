package kotlin.reflect.jvm.internal.calls;

import a00.i0;
import a00.l1;
import a00.r0;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.calls.a;
import m80.k;
import m80.l;
import v10.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnnotationConstructorCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,181:1\n1557#2:182\n1628#2,3:183\n1557#2:186\n1628#2,2:187\n1630#2:190\n1557#2:191\n1628#2,3:192\n1557#2:195\n1628#2,3:196\n1#3:189\n11255#4:199\n11366#4,4:200\n*S KotlinDebug\n*F\n+ 1 AnnotationConstructorCaller.kt\nkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller\n*L\n28#1:182\n28#1:183,3\n35#1:186\n35#1:187,2\n35#1:190\n37#1:191\n37#1:192,3\n20#1:195\n20#1:196,3\n53#1:199\n53#1:200,4\n*E\n"})
/* loaded from: classes8.dex */
public final class AnnotationConstructorCaller implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Class<?> f67094a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f67095b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CallMode f67096c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Method> f67097d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<Type> f67098e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<Class<?>> f67099f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<Object> f67100g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CallMode {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ CallMode[] $VALUES;
        public static final CallMode CALL_BY_NAME = new CallMode("CALL_BY_NAME", 0);
        public static final CallMode POSITIONAL_CALL = new CallMode("POSITIONAL_CALL", 1);

        private static final /* synthetic */ CallMode[] $values() {
            return new CallMode[]{CALL_BY_NAME, POSITIONAL_CALL};
        }

        static {
            CallMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private CallMode(String str, int i11) {
        }

        public static CallMode valueOf(String str) {
            return (CallMode) Enum.valueOf(CallMode.class, str);
        }

        public static CallMode[] values() {
            return (CallMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Origin {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Origin[] $VALUES;
        public static final Origin JAVA = new Origin("JAVA", 0);
        public static final Origin KOTLIN = new Origin("KOTLIN", 1);

        private static final /* synthetic */ Origin[] $values() {
            return new Origin[]{JAVA, KOTLIN};
        }

        static {
            Origin[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private Origin(String str, int i11) {
        }

        public static Origin valueOf(String str) {
            return (Origin) Enum.valueOf(Origin.class, str);
        }

        public static Origin[] values() {
            return (Origin[]) $VALUES.clone();
        }
    }

    public AnnotationConstructorCaller(@k Class<?> jClass, @k List<String> parameterNames, @k CallMode callMode, @k Origin origin, @k List<Method> methods) {
        g0.p(jClass, "jClass");
        g0.p(parameterNames, "parameterNames");
        g0.p(callMode, "callMode");
        g0.p(origin, "origin");
        g0.p(methods, "methods");
        this.f67094a = jClass;
        this.f67095b = parameterNames;
        this.f67096c = callMode;
        this.f67097d = methods;
        List<Method> list = methods;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f67098e = arrayList;
        List<Method> list2 = this.f67097d;
        ArrayList arrayList2 = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            g0.m(returnType);
            Class<?> k11 = f.k(returnType);
            if (k11 != null) {
                returnType = k11;
            }
            arrayList2.add(returnType);
        }
        this.f67099f = arrayList2;
        List<Method> list3 = this.f67097d;
        ArrayList arrayList3 = new ArrayList(i0.d0(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.f67100g = arrayList3;
        if (this.f67096c == CallMode.POSITIONAL_CALL && origin == Origin.JAVA && !r0.v4(this.f67095b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    @k
    public List<Type> a() {
        return this.f67098e;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) d();
    }

    public void c(@k Object[] objArr) {
        a.C0783a.a(this, objArr);
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    @l
    public Object call(@k Object[] args) {
        g0.p(args, "args");
        c(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            Object obj = args[i11];
            int i13 = i12 + 1;
            Object q11 = (obj == null && this.f67096c == CallMode.CALL_BY_NAME) ? this.f67100g.get(i12) : l10.e.q(obj, this.f67099f.get(i12));
            if (q11 == null) {
                l10.e.p(i12, this.f67095b.get(i12), this.f67099f.get(i12));
                throw null;
            }
            arrayList.add(q11);
            i11++;
            i12 = i13;
        }
        return l10.e.g(this.f67094a, l1.B0(r0.o6(this.f67095b, arrayList)), this.f67097d);
    }

    @l
    public Void d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    @k
    public Type getReturnType() {
        return this.f67094a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AnnotationConstructorCaller(java.lang.Class r7, java.util.List r8, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode r9, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin r10, java.util.List r11, int r12, kotlin.jvm.internal.v r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L32
            r11 = r8
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = a00.i0.d0(r11, r13)
            r12.<init>(r13)
            java.util.Iterator r11 = r11.iterator()
        L16:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L2b
            java.lang.Object r13 = r11.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r12.add(r13)
            goto L16
        L2b:
            r5 = r12
        L2c:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            goto L34
        L32:
            r5 = r11
            goto L2c
        L34:
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.<init>(java.lang.Class, java.util.List, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin, java.util.List, int, kotlin.jvm.internal.v):void");
    }
}
