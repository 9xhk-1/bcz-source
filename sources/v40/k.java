package v40;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFormatterOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormatterOperation.kt\nkotlinx/datetime/internal/format/formatter/UnsignedIntFormatterStructure\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
/* loaded from: classes8.dex */
public final class k<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l<T, Integer> f92982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92983b;

    /* JADX WARN: Multi-variable type inference failed */
    public k(@m80.k l<? super T, Integer> number, int i11) {
        g0.p(number, "number");
        this.f92982a = number;
        this.f92983b = i11;
        if (i11 < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i11 + ") is negative").toString());
        }
        if (i11 <= 9) {
            return;
        }
        throw new IllegalArgumentException(("The minimum number of digits (" + i11 + ") exceeds the length of an Int").toString());
    }

    @Override // v40.e
    public void b(T t11, @m80.k Appendable builder, boolean z11) {
        g0.p(builder, "builder");
        String valueOf = String.valueOf(this.f92982a.invoke(t11).intValue());
        int length = this.f92983b - valueOf.length();
        for (int i11 = 0; i11 < length; i11++) {
            builder.append('0');
        }
        builder.append(valueOf);
    }
}
