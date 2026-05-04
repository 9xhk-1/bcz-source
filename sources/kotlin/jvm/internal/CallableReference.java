package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class CallableReference implements h10.c, Serializable {

    @yz.y0(version = "1.1")
    public static final Object NO_RECEIVER = a.f66960a;

    @yz.y0(version = "1.4")
    private final boolean isTopLevel;

    @yz.y0(version = "1.4")
    private final String name;

    @yz.y0(version = "1.4")
    private final Class owner;

    @yz.y0(version = "1.1")
    protected final Object receiver;
    private transient h10.c reflected;

    @yz.y0(version = "1.4")
    private final String signature;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.y0(version = "1.2")
    public static class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final a f66960a = new a();

        private Object readResolve() throws ObjectStreamException {
            return f66960a;
        }
    }

    public CallableReference() {
        this(NO_RECEIVER);
    }

    @Override // h10.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // h10.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @yz.y0(version = "1.1")
    public h10.c compute() {
        h10.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        h10.c computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    public abstract h10.c computeReflected();

    @Override // h10.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @yz.y0(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // h10.c
    public String getName() {
        return this.name;
    }

    public h10.h getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? o0.g(cls) : o0.d(cls);
    }

    @Override // h10.c
    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    @yz.y0(version = "1.1")
    public h10.c getReflected() {
        h10.c compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new KotlinReflectionNotSupportedError();
    }

    @Override // h10.c
    public h10.r getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // h10.c
    @yz.y0(version = "1.1")
    public List<h10.s> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // h10.c
    @yz.y0(version = "1.1")
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // h10.c
    @yz.y0(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // h10.c
    @yz.y0(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // h10.c
    @yz.y0(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // h10.c
    @yz.y0(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    @yz.y0(version = "1.1")
    public CallableReference(Object obj) {
        this(obj, null, null, null, false);
    }

    @yz.y0(version = "1.4")
    public CallableReference(Object obj, Class cls, String str, String str2, boolean z11) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z11;
    }
}
