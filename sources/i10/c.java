package i10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.KParameter;
import m80.l;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "KCallables")
@u0({"SMAP\nKCallables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallables.kt\nkotlin/reflect/full/KCallables\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n669#2,11:83\n669#2,11:94\n774#2:105\n865#2,2:106\n669#2,11:108\n1#3:119\n*S KotlinDebug\n*F\n+ 1 KCallables.kt\nkotlin/reflect/full/KCallables\n*L\n23#1:83,11\n31#1:94,11\n38#1:105\n38#1:106,2\n45#1:108,11\n*E\n"})
/* loaded from: classes8.dex */
public final class c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<R> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60099a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60100b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f60101c;

        /* renamed from: d, reason: collision with root package name */
        public int f60102d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60101c = obj;
            this.f60102d |= Integer.MIN_VALUE;
            return c.a(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<R> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60103a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60104b;

        /* renamed from: c, reason: collision with root package name */
        public Object f60105c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f60106d;

        /* renamed from: e, reason: collision with root package name */
        public int f60107e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60106d = obj;
            this.f60107e |= Integer.MIN_VALUE;
            return c.b(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    @yz.y0(version = "1.3")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object a(@m80.k h10.c<? extends R> r4, @m80.k java.lang.Object[] r5, @m80.k j00.c<? super R> r6) {
        /*
            boolean r0 = r6 instanceof i10.c.a
            if (r0 == 0) goto L13
            r0 = r6
            i10.c$a r0 = (i10.c.a) r0
            int r1 = r0.f60102d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60102d = r1
            goto L18
        L13:
            i10.c$a r0 = new i10.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f60101c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f60102d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f60100b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r4 = r0.f60099a
            h10.c r4 = (h10.c) r4
            kotlin.e.n(r6)
            goto L7c
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.e.n(r6)
            boolean r6 = r4.isSuspend()
            if (r6 != 0) goto L4c
            int r6 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            java.lang.Object r4 = r4.call(r5)
            return r4
        L4c:
            boolean r6 = r4 instanceof h10.i
            if (r6 == 0) goto La0
            r0.f60099a = r4
            r0.f60100b = r5
            r0.f60102d = r3
            kotlin.jvm.internal.v0 r6 = new kotlin.jvm.internal.v0
            r2 = 2
            r6.<init>(r2)
            r6.b(r5)
            r6.a(r0)
            int r5 = r6.c()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object[] r5 = r6.d(r5)
            java.lang.Object r6 = r4.call(r5)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.b.l()
            if (r6 != r5) goto L79
            l00.f.c(r0)
        L79:
            if (r6 != r1) goto L7c
            return r1
        L7c:
            h10.i r4 = (h10.i) r4
            h10.r r5 = r4.getReturnType()
            h10.g r5 = r5.m()
            java.lang.Class<yz.g2> r0 = yz.g2.class
            h10.d r0 = kotlin.jvm.internal.o0.d(r0)
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r0)
            if (r5 == 0) goto L9f
            h10.r r4 = r4.getReturnType()
            boolean r4 = r4.e()
            if (r4 != 0) goto L9f
            yz.g2 r4 = yz.g2.f100423a
            return r4
        L9f:
            return r6
        La0:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Cannot callSuspend on a property "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = ": suspend properties are not supported yet"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i10.c.a(h10.c, java.lang.Object[], j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    @yz.y0(version = "1.3")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <R> java.lang.Object b(@m80.k h10.c<? extends R> r4, @m80.k java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> r5, @m80.k j00.c<? super R> r6) {
        /*
            boolean r0 = r6 instanceof i10.c.b
            if (r0 == 0) goto L13
            r0 = r6
            i10.c$b r0 = (i10.c.b) r0
            int r1 = r0.f60107e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60107e = r1
            goto L18
        L13:
            i10.c$b r0 = new i10.c$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f60106d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f60107e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r4 = r0.f60105c
            kotlin.reflect.jvm.internal.e r4 = (kotlin.reflect.jvm.internal.e) r4
            java.lang.Object r4 = r0.f60104b
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r4 = r0.f60103a
            h10.c r4 = (h10.c) r4
            kotlin.e.n(r6)
            goto L6d
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.e.n(r6)
            boolean r6 = r4.isSuspend()
            if (r6 != 0) goto L4b
            java.lang.Object r4 = r4.callBy(r5)
            return r4
        L4b:
            boolean r6 = r4 instanceof h10.i
            if (r6 == 0) goto La8
            kotlin.reflect.jvm.internal.e r6 = k10.q2.b(r4)
            if (r6 == 0) goto L91
            r0.f60103a = r4
            r0.f60104b = r5
            r0.f60105c = r6
            r0.f60107e = r3
            java.lang.Object r6 = r6.Q(r5, r0)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.b.l()
            if (r6 != r5) goto L6a
            l00.f.c(r0)
        L6a:
            if (r6 != r1) goto L6d
            return r1
        L6d:
            h10.i r4 = (h10.i) r4
            h10.r r5 = r4.getReturnType()
            h10.g r5 = r5.m()
            java.lang.Class<yz.g2> r0 = yz.g2.class
            h10.d r0 = kotlin.jvm.internal.o0.d(r0)
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r0)
            if (r5 == 0) goto L90
            h10.r r4 = r4.getReturnType()
            boolean r4 = r4.e()
            if (r4 != 0) goto L90
            yz.g2 r4 = yz.g2.f100423a
            return r4
        L90:
            return r6
        L91:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r5 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "This callable does not support a default call: "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        La8:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Cannot callSuspendBy on a property "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r4 = ": suspend properties are not supported yet"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i10.c.b(h10.c, java.util.Map, j00.c):java.lang.Object");
    }

    @l
    @y0(version = "1.1")
    public static final KParameter c(@m80.k h10.c<?> cVar, @m80.k String name) {
        g0.p(cVar, "<this>");
        g0.p(name, "name");
        Iterator<T> it = cVar.getParameters().iterator();
        Object obj = null;
        boolean z11 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (g0.g(((KParameter) next).getName(), name)) {
                    if (z11) {
                        break;
                    }
                    z11 = true;
                    obj2 = next;
                }
            } else if (z11) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    @l
    public static final KParameter d(@m80.k h10.c<?> cVar) {
        g0.p(cVar, "<this>");
        Iterator<T> it = cVar.getParameters().iterator();
        Object obj = null;
        boolean z11 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((KParameter) next).getKind() == KParameter.Kind.EXTENSION_RECEIVER) {
                    if (z11) {
                        break;
                    }
                    z11 = true;
                    obj2 = next;
                }
            } else if (z11) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    @l
    public static final KParameter f(@m80.k h10.c<?> cVar) {
        g0.p(cVar, "<this>");
        Iterator<T> it = cVar.getParameters().iterator();
        Object obj = null;
        boolean z11 = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((KParameter) next).getKind() == KParameter.Kind.INSTANCE) {
                    if (z11) {
                        break;
                    }
                    z11 = true;
                    obj2 = next;
                }
            } else if (z11) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    @m80.k
    public static final List<KParameter> h(@m80.k h10.c<?> cVar) {
        g0.p(cVar, "<this>");
        List<KParameter> parameters = cVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((KParameter) obj).getKind() == KParameter.Kind.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @y0(version = "1.1")
    public static /* synthetic */ void e(h10.c cVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void g(h10.c cVar) {
    }

    @y0(version = "1.1")
    public static /* synthetic */ void i(h10.c cVar) {
    }
}
