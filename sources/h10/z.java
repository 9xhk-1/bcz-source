package h10;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.c
/* loaded from: classes8.dex */
public final class z implements WildcardType, v {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f57966c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final z f57967d = new z(null, null);

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Type f57968a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final Type f57969b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final z a() {
            return z.f57967d;
        }

        public a() {
        }
    }

    public z(@m80.l Type type, @m80.l Type type2) {
        this.f57968a = type;
        this.f57969b = type2;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        return Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds());
    }

    @Override // java.lang.reflect.WildcardType
    @m80.k
    public Type[] getLowerBounds() {
        Type type = this.f57969b;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type, h10.v
    @m80.k
    public String getTypeName() {
        String j11;
        String j12;
        if (this.f57969b != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("? super ");
            j12 = y.j(this.f57969b);
            sb2.append(j12);
            return sb2.toString();
        }
        Type type = this.f57968a;
        if (type == null || g0.g(type, Object.class)) {
            return "?";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("? extends ");
        j11 = y.j(this.f57968a);
        sb3.append(j11);
        return sb3.toString();
    }

    @Override // java.lang.reflect.WildcardType
    @m80.k
    public Type[] getUpperBounds() {
        Type type = this.f57968a;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @m80.k
    public String toString() {
        return getTypeName();
    }
}
