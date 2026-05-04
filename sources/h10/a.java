package h10;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.c
/* loaded from: classes8.dex */
public final class a implements GenericArrayType, v {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Type f57953a;

    public a(@m80.k Type elementType) {
        g0.p(elementType, "elementType");
        this.f57953a = elementType;
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof GenericArrayType) && g0.g(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @m80.k
    public Type getGenericComponentType() {
        return this.f57953a;
    }

    @Override // java.lang.reflect.Type, h10.v
    @m80.k
    public String getTypeName() {
        String j11;
        StringBuilder sb2 = new StringBuilder();
        j11 = y.j(this.f57953a);
        sb2.append(j11);
        sb2.append(okhttp3.i.f77289p);
        return sb2.toString();
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @m80.k
    public String toString() {
        return getTypeName();
    }
}
