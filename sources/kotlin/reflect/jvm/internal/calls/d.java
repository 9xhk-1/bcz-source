package kotlin.reflect.jvm.internal.calls;

import a00.h0;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f67119a = new d();

    @Override // kotlin.reflect.jvm.internal.calls.a
    @k
    public List<Type> a() {
        return h0.J();
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) c();
    }

    @l
    public Void c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    @l
    public Object call(@k Object[] args) {
        g0.p(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // kotlin.reflect.jvm.internal.calls.a
    @k
    public Type getReturnType() {
        Class TYPE = Void.TYPE;
        g0.o(TYPE, "TYPE");
        return TYPE;
    }
}
