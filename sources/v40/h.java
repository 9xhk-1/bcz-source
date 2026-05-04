package v40;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFormatterOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormatterOperation.kt\nkotlinx/datetime/internal/format/formatter/SignedIntFormatterStructure\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
/* loaded from: classes8.dex */
public final class h<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l<T, Integer> f92976a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92977b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Integer f92978c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@m80.k l<? super T, Integer> number, int i11, @m80.l Integer num) {
        g0.p(number, "number");
        this.f92976a = number;
        this.f92977b = i11;
        this.f92978c = num;
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
        StringBuilder sb2 = new StringBuilder();
        int intValue = this.f92976a.invoke(t11).intValue();
        if (z11 && intValue < 0) {
            intValue = -intValue;
        }
        if (this.f92978c != null && intValue >= t40.f.c()[this.f92978c.intValue()]) {
            sb2.append('+');
        }
        if (Math.abs(intValue) >= t40.f.c()[this.f92977b - 1]) {
            sb2.append(intValue);
        } else if (intValue >= 0) {
            sb2.append(intValue + t40.f.c()[this.f92977b]);
            g0.o(sb2, "append(...)");
            g0.o(sb2.deleteCharAt(0), "deleteCharAt(...)");
        } else {
            sb2.append(intValue - t40.f.c()[this.f92977b]);
            g0.o(sb2, "append(...)");
            g0.o(sb2.deleteCharAt(1), "deleteCharAt(...)");
        }
        builder.append(sb2);
    }
}
