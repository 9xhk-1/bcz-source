package j;

import java.lang.Enum;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEnumColumnAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumColumnAdapter.kt\napp/cash/sqldelight/EnumColumnAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,32:1\n1227#2,2:33\n*S KotlinDebug\n*F\n+ 1 EnumColumnAdapter.kt\napp/cash/sqldelight/EnumColumnAdapter\n*L\n22#1:33,2\n*E\n"})
/* loaded from: classes3.dex */
public final class e<T extends Enum<T>> implements d<T, String> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final T[] f63064a;

    @v0
    public e(@m80.k T[] enumValues) {
        g0.p(enumValues, "enumValues");
        this.f63064a = enumValues;
    }

    @Override // j.d
    @m80.k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T decode(@m80.k String databaseValue) {
        g0.p(databaseValue, "databaseValue");
        for (T t11 : this.f63064a) {
            if (g0.g(t11.name(), databaseValue)) {
                return t11;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // j.d
    @m80.k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String encode(@m80.k T value) {
        g0.p(value, "value");
        return value.name();
    }
}
