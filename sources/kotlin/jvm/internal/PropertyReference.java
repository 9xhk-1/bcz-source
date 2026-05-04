package kotlin.jvm.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class PropertyReference extends CallableReference implements h10.n {
    private final boolean syntheticJavaProperty;

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.CallableReference
    public h10.c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && g0.g(getBoundReceiver(), propertyReference.getBoundReceiver());
        }
        if (obj instanceof h10.n) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // h10.n
    @yz.y0(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // h10.n
    @yz.y0(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        h10.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + o0.f67014b;
    }

    @Override // kotlin.jvm.internal.CallableReference
    @yz.y0(version = "1.1")
    public h10.n getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (h10.n) super.getReflected();
    }

    @yz.y0(version = "1.1")
    public PropertyReference(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    @yz.y0(version = "1.4")
    public PropertyReference(Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.syntheticJavaProperty = (i11 & 2) == 2;
    }
}
