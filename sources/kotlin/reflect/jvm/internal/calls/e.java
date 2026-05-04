package kotlin.reflect.jvm.internal.calls;

import a00.a0;
import a00.h0;
import a00.i0;
import a00.m0;
import androidx.exifinterface.media.ExifInterface;
import e30.e2;
import e30.r0;
import g10.l;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k10.q2;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import l10.i;
import m80.k;
import p10.o0;
import u30.k0;
import v10.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1755#2,3:388\n1557#2:391\n1628#2,3:392\n1755#2,3:400\n1628#2,3:403\n37#3,2:395\n37#3,2:398\n37#3,2:406\n1#4:397\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller\n*L\n45#1:388,3\n48#1:391\n48#1:392,3\n161#1:400,3\n179#1:403,3\n48#1:395,2\n150#1:398,2\n187#1:406,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e<M extends Member> implements kotlin.reflect.jvm.internal.calls.a<M> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f67120a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final kotlin.reflect.jvm.internal.calls.a<M> f67121b;

    /* renamed from: c, reason: collision with root package name */
    public final M f67122c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f67123d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l[] f67124e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f67125f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final l f67126a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<Method>[] f67127b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public final Method f67128c;

        public a(@k l argumentRange, @k List<Method>[] unboxParameters, @m80.l Method method) {
            g0.p(argumentRange, "argumentRange");
            g0.p(unboxParameters, "unboxParameters");
            this.f67126a = argumentRange;
            this.f67127b = unboxParameters;
            this.f67128c = method;
        }

        @k
        public final l a() {
            return this.f67126a;
        }

        @m80.l
        public final Method b() {
            return this.f67128c;
        }

        @k
        public final List<Method>[] c() {
            return this.f67127b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,387:1\n1557#2:388\n1628#2,3:389\n1567#2:392\n1598#2,3:393\n1557#2:396\n1628#2,3:397\n1601#2:400\n1368#2:401\n1454#2,2:402\n1557#2:404\n1628#2,3:405\n1456#2,3:408\n37#3,2:411\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller\n*L\n219#1:388\n219#1:389,3\n227#1:392\n227#1:393,3\n229#1:396\n229#1:397,3\n227#1:400\n236#1:401\n236#1:402,2\n236#1:404\n236#1:405,3\n236#1:408,3\n236#1:411,2\n*E\n"})
    public static final class b implements kotlin.reflect.jvm.internal.calls.a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Method f67129a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Method f67130b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<List<Method>> f67131c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<List<Class<?>>> f67132d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<Type> f67133e;

        public b(@k kotlin.reflect.jvm.internal.impl.descriptors.e descriptor, @k KDeclarationContainerImpl container, @k String constructorDesc, @k List<? extends o0> originalParameters) {
            Collection l11;
            List p11;
            g0.p(descriptor, "descriptor");
            g0.p(container, "container");
            g0.p(constructorDesc, "constructorDesc");
            g0.p(originalParameters, "originalParameters");
            Method I = container.I("constructor-impl", constructorDesc);
            g0.m(I);
            this.f67129a = I;
            Method I2 = container.I("box-impl", k0.D4(constructorDesc, ExifInterface.GPS_MEASUREMENT_INTERRUPTED) + f.f(container.g()));
            g0.m(I2);
            this.f67130b = I2;
            List<? extends o0> list = originalParameters;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                r0 type = ((o0) it.next()).getType();
                g0.o(type, "getType(...)");
                p11 = i.p(e2.a(type), descriptor);
                arrayList.add(p11);
            }
            this.f67131c = arrayList;
            ArrayList arrayList2 = new ArrayList(i0.d0(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    h0.b0();
                }
                p10.d r11 = ((o0) obj).getType().I0().r();
                g0.n(r11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                p10.b bVar = (p10.b) r11;
                List<Method> list2 = this.f67131c.get(i11);
                if (list2 != null) {
                    List<Method> list3 = list2;
                    l11 = new ArrayList(i0.d0(list3, 10));
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        l11.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class<?> s11 = q2.s(bVar);
                    g0.m(s11);
                    l11 = a00.g0.l(s11);
                }
                arrayList2.add(l11);
                i11 = i12;
            }
            this.f67132d = arrayList2;
            this.f67133e = i0.f0(arrayList2);
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        @k
        public List<Type> a() {
            return this.f67133e;
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        public /* bridge */ /* synthetic */ Member b() {
            return (Member) c();
        }

        @m80.l
        public Void c() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        @m80.l
        public Object call(@k Object[] args) {
            Collection l11;
            g0.p(args, "args");
            List<Pair> UA = a0.UA(args, this.f67131c);
            ArrayList arrayList = new ArrayList();
            for (Pair pair : UA) {
                Object component1 = pair.component1();
                List list = (List) pair.component2();
                if (list != null) {
                    List list2 = list;
                    l11 = new ArrayList(i0.d0(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        l11.add(((Method) it.next()).invoke(component1, null));
                    }
                } else {
                    l11 = a00.g0.l(component1);
                }
                m0.s0(arrayList, l11);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.f67129a.invoke(null, Arrays.copyOf(array, array.length));
            return this.f67130b.invoke(null, Arrays.copyOf(array, array.length));
        }

        @k
        public final List<List<Class<?>>> d() {
            return this.f67132d;
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        @k
        public Type getReturnType() {
            Class<?> returnType = this.f67130b.getReturnType();
            g0.o(returnType, "getReturnType(...)");
            return returnType;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x00d6, code lost:
    
        r13 = l10.i.s(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0105, code lost:
    
        if ((r12 instanceof l10.f) != false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r11, @m80.k kotlin.reflect.jvm.internal.calls.a<? extends M> r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.e.<init>(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.calls.a, boolean):void");
    }

    public static final boolean d(p10.b makeKotlinParameterTypes) {
        g0.p(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
        return q20.i.g(makeKotlinParameterTypes);
    }

    public static final int e(r0 r0Var) {
        List<Method> n11 = i.n(e2.a(r0Var));
        if (n11 != null) {
            return n11.size();
        }
        return 1;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    @k
    public List<Type> a() {
        return this.f67121b.a();
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public M b() {
        return this.f67122c;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    @m80.l
    public Object call(@k Object[] args) {
        Object invoke;
        Object obj;
        Object g11;
        g0.p(args, "args");
        l a11 = this.f67123d.a();
        List<Method>[] c11 = this.f67123d.c();
        Method b11 = this.f67123d.b();
        if (!a11.isEmpty()) {
            if (this.f67125f) {
                List k11 = a00.g0.k(args.length);
                int d11 = a11.d();
                for (int i11 = 0; i11 < d11; i11++) {
                    k11.add(args[i11]);
                }
                int d12 = a11.d();
                int f11 = a11.f();
                if (d12 <= f11) {
                    while (true) {
                        List<Method> list = c11[d12];
                        Object obj2 = args[d12];
                        if (list != null) {
                            for (Method method : list) {
                                List list2 = k11;
                                if (obj2 != null) {
                                    g11 = method.invoke(obj2, null);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    g0.o(returnType, "getReturnType(...)");
                                    g11 = q2.g(returnType);
                                }
                                list2.add(g11);
                            }
                        } else {
                            k11.add(obj2);
                        }
                        if (d12 == f11) {
                            break;
                        }
                        d12++;
                    }
                }
                int f12 = a11.f() + 1;
                int Oe = a0.Oe(args);
                if (f12 <= Oe) {
                    while (true) {
                        k11.add(args[f12]);
                        if (f12 == Oe) {
                            break;
                        }
                        f12++;
                    }
                }
                args = a00.g0.b(k11).toArray(new Object[0]);
            } else {
                int length = args.length;
                Object[] objArr = new Object[length];
                for (int i12 = 0; i12 < length; i12++) {
                    int d13 = a11.d();
                    if (i12 > a11.f() || d13 > i12) {
                        obj = args[i12];
                    } else {
                        List<Method> list3 = c11[i12];
                        Method method2 = list3 != null ? (Method) a00.r0.m5(list3) : null;
                        obj = args[i12];
                        if (method2 != null) {
                            if (obj != null) {
                                obj = method2.invoke(obj, null);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                g0.o(returnType2, "getReturnType(...)");
                                obj = q2.g(returnType2);
                            }
                        }
                    }
                    objArr[i12] = obj;
                }
                args = objArr;
            }
        }
        Object call = this.f67121b.call(args);
        return (call == kotlin.coroutines.intrinsics.b.l() || b11 == null || (invoke = b11.invoke(null, call)) == null) ? call : invoke;
    }

    @k
    public final l f(int i11) {
        if (i11 >= 0) {
            l[] lVarArr = this.f67124e;
            if (i11 < lVarArr.length) {
                return lVarArr[i11];
            }
        }
        l[] lVarArr2 = this.f67124e;
        if (lVarArr2.length == 0) {
            return new l(i11, i11);
        }
        int length = (i11 - lVarArr2.length) + ((l) a0.Th(lVarArr2)).f() + 1;
        return new l(length, length);
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    @k
    public Type getReturnType() {
        return this.f67121b.getReturnType();
    }
}
