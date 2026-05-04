package l10;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import yz.c0;

/* loaded from: classes8.dex */
public class c implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final Class f69123a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f69124b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f69125c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f69126d;

    /* renamed from: e, reason: collision with root package name */
    public final List f69127e;

    public c(Class cls, Map map, c0 c0Var, c0 c0Var2, List list) {
        this.f69123a = cls;
        this.f69124b = map;
        this.f69125c = c0Var;
        this.f69126d = c0Var2;
        this.f69127e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object o11;
        o11 = e.o(this.f69123a, this.f69124b, this.f69125c, this.f69126d, this.f69127e, obj, method, objArr);
        return o11;
    }
}
