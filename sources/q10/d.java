package q10;

import e30.r0;
import java.util.Map;
import p10.x0;
import q10.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f81407a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<n20.f, s20.g<?>> f81408b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f81409c;

    public d(@m80.k r0 r0Var, @m80.k Map<n20.f, s20.g<?>> map, @m80.k x0 x0Var) {
        if (r0Var == null) {
            b(0);
        }
        if (map == null) {
            b(1);
        }
        if (x0Var == null) {
            b(2);
        }
        this.f81407a = r0Var;
        this.f81408b = map;
        this.f81409c = x0Var;
    }

    public static /* synthetic */ void b(int i11) {
        String str = (i11 == 3 || i11 == 4 || i11 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 3 || i11 == 4 || i11 == 5) ? 2 : 3];
        if (i11 == 1) {
            objArr[0] = "valueArguments";
        } else if (i11 == 2) {
            objArr[0] = "source";
        } else if (i11 == 3 || i11 == 4 || i11 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i11 == 3) {
            objArr[1] = "getType";
        } else if (i11 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i11 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // q10.c
    @m80.k
    public Map<n20.f, s20.g<?>> a() {
        Map<n20.f, s20.g<?>> map = this.f81408b;
        if (map == null) {
            b(4);
        }
        return map;
    }

    @Override // q10.c
    @m80.l
    public n20.c d() {
        return c.a.a(this);
    }

    @Override // q10.c
    @m80.k
    public x0 getSource() {
        x0 x0Var = this.f81409c;
        if (x0Var == null) {
            b(5);
        }
        return x0Var;
    }

    @Override // q10.c
    @m80.k
    public r0 getType() {
        r0 r0Var = this.f81407a;
        if (r0Var == null) {
            b(3);
        }
        return r0Var;
    }

    public String toString() {
        return p20.m.f78747h.R(this, null);
    }
}
