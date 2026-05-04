package k10;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference2;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference2;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class i2 extends kotlin.jvm.internal.p0 {
    public static void u() {
        h.k();
        h2.a();
    }

    public static KDeclarationContainerImpl v(CallableReference callableReference) {
        h10.h owner = callableReference.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : kotlin.reflect.jvm.internal.a.f67085d;
    }

    @Override // kotlin.jvm.internal.p0
    public h10.d a(Class cls) {
        return new kotlin.reflect.jvm.internal.f(cls);
    }

    @Override // kotlin.jvm.internal.p0
    public h10.d b(Class cls, String str) {
        return new kotlin.reflect.jvm.internal.f(cls);
    }

    @Override // kotlin.jvm.internal.p0
    public h10.i c(FunctionReference functionReference) {
        return new kotlin.reflect.jvm.internal.g(v(functionReference), functionReference.getName(), functionReference.getSignature(), functionReference.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.p0
    public h10.d d(Class cls) {
        return h.n(cls);
    }

    @Override // kotlin.jvm.internal.p0
    public h10.d e(Class cls, String str) {
        return h.n(cls);
    }

    @Override // kotlin.jvm.internal.p0
    public h10.h f(Class cls, String str) {
        return h.o(cls);
    }

    @Override // kotlin.jvm.internal.p0
    public h10.r g(h10.r rVar) {
        return o2.a(rVar);
    }

    @Override // kotlin.jvm.internal.p0
    public h10.k h(MutablePropertyReference0 mutablePropertyReference0) {
        return new kotlin.reflect.jvm.internal.h(v(mutablePropertyReference0), mutablePropertyReference0.getName(), mutablePropertyReference0.getSignature(), mutablePropertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.p0
    public h10.l i(MutablePropertyReference1 mutablePropertyReference1) {
        return new kotlin.reflect.jvm.internal.i(v(mutablePropertyReference1), mutablePropertyReference1.getName(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.p0
    public h10.m j(MutablePropertyReference2 mutablePropertyReference2) {
        return new kotlin.reflect.jvm.internal.j(v(mutablePropertyReference2), mutablePropertyReference2.getName(), mutablePropertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.p0
    public h10.r k(h10.r rVar) {
        return o2.b(rVar);
    }

    @Override // kotlin.jvm.internal.p0
    public h10.r l(h10.r rVar, h10.r rVar2) {
        return o2.c(rVar, rVar2);
    }

    @Override // kotlin.jvm.internal.p0
    public h10.o m(PropertyReference0 propertyReference0) {
        return new kotlin.reflect.jvm.internal.m(v(propertyReference0), propertyReference0.getName(), propertyReference0.getSignature(), propertyReference0.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.p0
    public h10.p n(PropertyReference1 propertyReference1) {
        return new kotlin.reflect.jvm.internal.n(v(propertyReference1), propertyReference1.getName(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.p0
    public h10.q o(PropertyReference2 propertyReference2) {
        return new kotlin.reflect.jvm.internal.o(v(propertyReference2), propertyReference2.getName(), propertyReference2.getSignature());
    }

    @Override // kotlin.jvm.internal.p0
    public String p(kotlin.jvm.internal.c0 c0Var) {
        kotlin.reflect.jvm.internal.g c11;
        h10.i a11 = j10.f.a(c0Var);
        return (a11 == null || (c11 = q2.c(a11)) == null) ? super.p(c0Var) : l2.f64961a.h(c11.c0());
    }

    @Override // kotlin.jvm.internal.p0
    public String q(Lambda lambda) {
        return p(lambda);
    }

    @Override // kotlin.jvm.internal.p0
    public h10.r s(h10.g gVar, List<h10.t> list, boolean z11) {
        return gVar instanceof kotlin.jvm.internal.s ? h.l(((kotlin.jvm.internal.s) gVar).g(), list, z11) : i10.i.b(gVar, list, z11, Collections.EMPTY_LIST);
    }

    @Override // kotlin.jvm.internal.p0
    public h10.s t(Object obj, String str, KVariance kVariance, boolean z11) {
        List<h10.s> typeParameters;
        if (obj instanceof h10.d) {
            typeParameters = ((h10.d) obj).getTypeParameters();
        } else {
            if (!(obj instanceof h10.c)) {
                throw new IllegalArgumentException("Type parameter container must be a class or a callable: " + obj);
            }
            typeParameters = ((h10.c) obj).getTypeParameters();
        }
        for (h10.s sVar : typeParameters) {
            if (sVar.getName().equals(str)) {
                return sVar;
            }
        }
        throw new IllegalArgumentException("Type parameter " + str + " is not found in container: " + obj);
    }

    @Override // kotlin.jvm.internal.p0
    public void r(h10.s sVar, List<h10.r> list) {
    }
}
