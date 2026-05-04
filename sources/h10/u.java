package h10;

import a00.a0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.c
@u0({"SMAP\nTypesJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,230:1\n37#2,2:231\n*S KotlinDebug\n*F\n+ 1 TypesJVM.kt\nkotlin/reflect/ParameterizedTypeImpl\n*L\n190#1:231,2\n*E\n"})
/* loaded from: classes8.dex */
public final class u implements ParameterizedType, v {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Class<?> f57959a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final Type f57960b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Type[] f57961c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<Type, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f57962a = new a();

        public a() {
            super(1, y.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(Type p02) {
            String j11;
            g0.p(p02, "p0");
            j11 = y.j(p02);
            return j11;
        }
    }

    public u(@m80.k Class<?> rawType, @m80.l Type type, @m80.k List<? extends Type> typeArguments) {
        g0.p(rawType, "rawType");
        g0.p(typeArguments, "typeArguments");
        this.f57959a = rawType;
        this.f57960b = type;
        this.f57961c = (Type[]) typeArguments.toArray(new Type[0]);
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return g0.g(this.f57959a, parameterizedType.getRawType()) && g0.g(this.f57960b, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    @m80.k
    public Type[] getActualTypeArguments() {
        return this.f57961c;
    }

    @Override // java.lang.reflect.ParameterizedType
    @m80.l
    public Type getOwnerType() {
        return this.f57960b;
    }

    @Override // java.lang.reflect.ParameterizedType
    @m80.k
    public Type getRawType() {
        return this.f57959a;
    }

    @Override // java.lang.reflect.Type, h10.v
    @m80.k
    public String getTypeName() {
        String j11;
        String j12;
        StringBuilder sb2 = new StringBuilder();
        Type type = this.f57960b;
        if (type != null) {
            j12 = y.j(type);
            sb2.append(j12);
            sb2.append("$");
            sb2.append(this.f57959a.getSimpleName());
        } else {
            j11 = y.j(this.f57959a);
            sb2.append(j11);
        }
        Type[] typeArr = this.f57961c;
        if (!(typeArr.length == 0)) {
            a0.dh(typeArr, sb2, (r14 & 2) != 0 ? j2.O : null, (r14 & 4) != 0 ? "" : "<", (r14 & 8) == 0 ? ">" : "", (r14 & 16) != 0 ? -1 : 0, (r14 & 32) != 0 ? "..." : null, (r14 & 64) != 0 ? null : a.f57962a);
        }
        return sb2.toString();
    }

    public int hashCode() {
        int hashCode = this.f57959a.hashCode();
        Type type = this.f57960b;
        return (hashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    @m80.k
    public String toString() {
        return getTypeName();
    }
}
