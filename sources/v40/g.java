package v40;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Formatter.kt\nkotlinx/datetime/internal/format/formatter/SignedFormatter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/* loaded from: classes8.dex */
public final class g<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e<T> f92973a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l<T, Boolean> f92974b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f92975c;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@m80.k e<? super T> formatter, @m80.k l<? super T, Boolean> allSubFormatsNegative, boolean z11) {
        g0.p(formatter, "formatter");
        g0.p(allSubFormatsNegative, "allSubFormatsNegative");
        this.f92973a = formatter;
        this.f92974b = allSubFormatsNegative;
        this.f92975c = z11;
    }

    @Override // v40.e
    public void b(T t11, @m80.k Appendable builder, boolean z11) {
        g0.p(builder, "builder");
        Character ch2 = (z11 || !this.f92974b.invoke(t11).booleanValue()) ? this.f92975c ? '+' : null : '-';
        if (ch2 != null) {
            builder.append(ch2.charValue());
        }
        this.f92973a.b(t11, builder, z11 || (ch2 != null && ch2.charValue() == '-'));
    }
}
