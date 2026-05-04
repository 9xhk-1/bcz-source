package y20;

import e30.r0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class d extends a implements g {

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.descriptors.a f99220c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.a aVar, @m80.k r0 r0Var, @l h hVar) {
        super(r0Var, hVar);
        if (aVar == null) {
            c(0);
        }
        if (r0Var == null) {
            c(1);
        }
        this.f99220c = aVar;
    }

    public static /* synthetic */ void c(int i11) {
        String str = i11 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 2 ? 3 : 2];
        if (i11 == 1) {
            objArr[0] = "receiverType";
        } else if (i11 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i11 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i11 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i11 != 2) {
            if (i11 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i11 == 2) {
            throw new IllegalStateException(format);
        }
    }

    public String toString() {
        return getType() + ": Ext {" + this.f99220c + com.alipay.sdk.m.u.i.f11099d;
    }
}
