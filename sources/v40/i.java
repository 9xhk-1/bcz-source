package v40;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFormatter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Formatter.kt\nkotlinx/datetime/internal/format/formatter/SpacePaddedFormatter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/* loaded from: classes8.dex */
public final class i<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e<T> f92979a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92980b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@m80.k e<? super T> formatter, int i11) {
        g0.p(formatter, "formatter");
        this.f92979a = formatter;
        this.f92980b = i11;
    }

    @Override // v40.e
    public void b(T t11, @m80.k Appendable builder, boolean z11) {
        g0.p(builder, "builder");
        StringBuilder sb2 = new StringBuilder();
        this.f92979a.b(t11, sb2, z11);
        String sb3 = sb2.toString();
        g0.o(sb3, "let(...)");
        int length = this.f92980b - sb3.length();
        for (int i11 = 0; i11 < length; i11++) {
            builder.append(' ');
        }
        builder.append(sb3);
    }
}
