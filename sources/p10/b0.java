package p10;

import i30.h;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMultiFieldValueClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiFieldValueClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/MultiFieldValueClassRepresentation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n1#2:25\n*E\n"})
/* loaded from: classes8.dex */
public final class b0<Type extends i30.h> extends h1<Type> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<Pair<n20.f, Type>> f78553a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Map<n20.f, Type> f78554b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(@m80.k List<? extends Pair<n20.f, ? extends Type>> underlyingPropertyNamesToTypes) {
        super(null);
        kotlin.jvm.internal.g0.p(underlyingPropertyNamesToTypes, "underlyingPropertyNamesToTypes");
        this.f78553a = underlyingPropertyNamesToTypes;
        Map<n20.f, Type> B0 = a00.l1.B0(c());
        if (B0.size() != c().size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.f78554b = B0;
    }

    @Override // p10.h1
    public boolean a(@m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return this.f78554b.containsKey(name);
    }

    @m80.k
    public List<Pair<n20.f, Type>> c() {
        return this.f78553a;
    }

    @m80.k
    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + c() + ')';
    }
}
