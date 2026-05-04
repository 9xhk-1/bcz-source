package kotlin.jvm.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class FunctionReference extends CallableReference implements c0, h10.i {
    private final int arity;

    @yz.y0(version = "1.4")
    private final int flags;

    public FunctionReference(int i11) {
        this(i11, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @yz.y0(version = "1.1")
    public h10.c computeReflected() {
        return o0.c(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && g0.g(getBoundReceiver(), functionReference.getBoundReceiver()) && g0.g(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof h10.i) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.c0
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // h10.i
    @yz.y0(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // h10.i
    @yz.y0(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // h10.i
    @yz.y0(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // h10.i
    @yz.y0(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, h10.c
    @yz.y0(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        h10.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + o0.f67014b;
    }

    @yz.y0(version = "1.1")
    public FunctionReference(int i11, Object obj) {
        this(i11, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @yz.y0(version = "1.1")
    public h10.i getReflected() {
        return (h10.i) super.getReflected();
    }

    @yz.y0(version = "1.4")
    public FunctionReference(int i11, Object obj, Class cls, String str, String str2, int i12) {
        super(obj, cls, str, str2, (i12 & 1) == 1);
        this.arity = i11;
        this.flags = i12 >> 1;
    }
}
