package kotlin.reflect.jvm.internal.calls;

import a00.h0;
import a00.q;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.calls.a;
import kotlin.reflect.jvm.internal.calls.b;
import l10.f;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class c implements kotlin.reflect.jvm.internal.calls.a<Method> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Method f67115a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<Type> f67116b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Type f67117c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends c implements f {

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Object f67118d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@k Method unboxMethod, @l Object obj) {
            super(unboxMethod, h0.J(), null);
            g0.p(unboxMethod, "unboxMethod");
            this.f67118d = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        @l
        public Object call(@k Object[] args) {
            g0.p(args, "args");
            d(args);
            return c(this.f67118d, args);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nInternalUnderlyingValOfInlineClass.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalUnderlyingValOfInlineClass.kt\nkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound\n+ 2 CallerImpl.kt\nkotlin/reflect/jvm/internal/calls/CallerImpl$Companion\n*L\n1#1,45:1\n254#2:46\n*S KotlinDebug\n*F\n+ 1 InternalUnderlyingValOfInlineClass.kt\nkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound\n*L\n31#1:46\n*E\n"})
    public static final class b extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@k Method unboxMethod) {
            super(unboxMethod, a00.g0.l(unboxMethod.getDeclaringClass()), null);
            g0.p(unboxMethod, "unboxMethod");
        }

        @Override // kotlin.reflect.jvm.internal.calls.a
        @l
        public Object call(@k Object[] args) {
            g0.p(args, "args");
            d(args);
            Object obj = args[0];
            b.d dVar = kotlin.reflect.jvm.internal.calls.b.f67101e;
            return c(obj, args.length <= 1 ? new Object[0] : q.l1(args, 1, args.length));
        }
    }

    public /* synthetic */ c(Method method, List list, v vVar) {
        this(method, list);
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    @k
    public final List<Type> a() {
        return this.f67116b;
    }

    @l
    public final Object c(@l Object obj, @k Object[] args) {
        g0.p(args, "args");
        return this.f67115a.invoke(obj, Arrays.copyOf(args, args.length));
    }

    public void d(@k Object[] objArr) {
        a.C0783a.a(this, objArr);
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    @l
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Method b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    @k
    public final Type getReturnType() {
        return this.f67117c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(Method method, List<? extends Type> list) {
        this.f67115a = method;
        this.f67116b = list;
        Class<?> returnType = method.getReturnType();
        g0.o(returnType, "getReturnType(...)");
        this.f67117c = returnType;
    }
}
