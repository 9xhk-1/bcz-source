package e30;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p10.a1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class t extends b {

    /* renamed from: d, reason: collision with root package name */
    public final p10.b f48660d;

    /* renamed from: e, reason: collision with root package name */
    public final List<p10.c1> f48661e;

    /* renamed from: f, reason: collision with root package name */
    public final Collection<r0> f48662f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@m80.k p10.b bVar, @m80.k List<? extends p10.c1> list, @m80.k Collection<r0> collection, @m80.k d30.n nVar) {
        super(nVar);
        if (bVar == null) {
            I(0);
        }
        if (list == null) {
            I(1);
        }
        if (collection == null) {
            I(2);
        }
        if (nVar == null) {
            I(3);
        }
        this.f48660d = bVar;
        this.f48661e = Collections.unmodifiableList(new ArrayList(list));
        this.f48662f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void I(int i11) {
        String str = (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = PushConstants.PARAMS;
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i11 == 4) {
            objArr[1] = "getParameters";
        } else if (i11 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i11 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i11 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // e30.b, e30.u, e30.u1
    @m80.k
    /* renamed from: J */
    public p10.b r() {
        p10.b bVar = this.f48660d;
        if (bVar == null) {
            I(5);
        }
        return bVar;
    }

    @Override // e30.u1
    @m80.k
    public List<p10.c1> getParameters() {
        List<p10.c1> list = this.f48661e;
        if (list == null) {
            I(4);
        }
        return list;
    }

    @Override // e30.o
    @m80.k
    public Collection<r0> p() {
        Collection<r0> collection = this.f48662f;
        if (collection == null) {
            I(6);
        }
        return collection;
    }

    @Override // e30.u1
    public boolean s() {
        return true;
    }

    public String toString() {
        return q20.h.m(this.f48660d).b();
    }

    @Override // e30.o
    @m80.k
    public p10.a1 w() {
        a1.a aVar = a1.a.f78552a;
        if (aVar == null) {
            I(7);
        }
        return aVar;
    }
}
