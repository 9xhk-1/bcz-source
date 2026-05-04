package p10;

import i30.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nInlineClassRepresentation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassRepresentation.kt\norg/jetbrains/kotlin/descriptors/InlineClassRepresentation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/* loaded from: classes8.dex */
public final class u<Type extends i30.h> extends h1<Type> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n20.f f78610a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Type f78611b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(@m80.k n20.f underlyingPropertyName, @m80.k Type underlyingType) {
        super(null);
        kotlin.jvm.internal.g0.p(underlyingPropertyName, "underlyingPropertyName");
        kotlin.jvm.internal.g0.p(underlyingType, "underlyingType");
        this.f78610a = underlyingPropertyName;
        this.f78611b = underlyingType;
    }

    @Override // p10.h1
    public boolean a(@m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return kotlin.jvm.internal.g0.g(this.f78610a, name);
    }

    @m80.k
    public final n20.f c() {
        return this.f78610a;
    }

    @m80.k
    public final Type d() {
        return this.f78611b;
    }

    @m80.k
    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f78610a + ", underlyingType=" + this.f78611b + ')';
    }
}
