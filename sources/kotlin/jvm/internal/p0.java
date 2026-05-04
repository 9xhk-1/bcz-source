package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KVariance;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f67017a = "kotlin.jvm.functions.";

    public h10.d a(Class cls) {
        return new t(cls);
    }

    public h10.d b(Class cls, String str) {
        return new t(cls);
    }

    public h10.d d(Class cls) {
        return new t(cls);
    }

    public h10.d e(Class cls, String str) {
        return new t(cls);
    }

    public h10.h f(Class cls, String str) {
        return new m0(cls, str);
    }

    @yz.y0(version = "1.6")
    public h10.r g(h10.r rVar) {
        a1 a1Var = (a1) rVar;
        return new a1(rVar.m(), rVar.getArguments(), a1Var.r(), a1Var.n() | 2);
    }

    @yz.y0(version = "1.6")
    public h10.r k(h10.r rVar) {
        a1 a1Var = (a1) rVar;
        return new a1(rVar.m(), rVar.getArguments(), a1Var.r(), a1Var.n() | 4);
    }

    @yz.y0(version = "1.6")
    public h10.r l(h10.r rVar, h10.r rVar2) {
        return new a1(rVar.m(), rVar.getArguments(), rVar2, ((a1) rVar).n());
    }

    @yz.y0(version = "1.3")
    public String p(c0 c0Var) {
        String obj = c0Var.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith(f67017a) ? obj.substring(21) : obj;
    }

    @yz.y0(version = "1.1")
    public String q(Lambda lambda) {
        return p(lambda);
    }

    @yz.y0(version = "1.4")
    public void r(h10.s sVar, List<h10.r> list) {
        ((y0) sVar).b(list);
    }

    @yz.y0(version = "1.4")
    public h10.r s(h10.g gVar, List<h10.t> list, boolean z11) {
        return new a1(gVar, list, z11);
    }

    @yz.y0(version = "1.4")
    public h10.s t(Object obj, String str, KVariance kVariance, boolean z11) {
        return new y0(obj, str, kVariance, z11);
    }

    public h10.i c(FunctionReference functionReference) {
        return functionReference;
    }

    public h10.k h(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public h10.l i(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public h10.m j(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public h10.o m(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public h10.p n(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public h10.q o(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }
}
