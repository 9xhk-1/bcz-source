package v40;

import java.util.List;
import kotlin.jvm.internal.g0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l<T, t40.c> f92966a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92967b;

    /* renamed from: c, reason: collision with root package name */
    public final int f92968c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<Integer> f92969d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@m80.k l<? super T, t40.c> number, int i11, int i12, @m80.k List<Integer> zerosToAdd) {
        g0.p(number, "number");
        g0.p(zerosToAdd, "zerosToAdd");
        this.f92966a = number;
        this.f92967b = i11;
        this.f92968c = i12;
        this.f92969d = zerosToAdd;
        if (1 > i11 || i11 >= 10) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i11 + ") is not in range 1..9").toString());
        }
        if (i11 > i12 || i12 >= 10) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i12 + ") is not in range " + i11 + "..9").toString());
        }
    }

    @Override // v40.e
    public void b(T t11, @m80.k Appendable builder, boolean z11) {
        g0.p(builder, "builder");
        int b11 = this.f92966a.invoke(t11).b(this.f92968c);
        int i11 = 0;
        while (this.f92968c > this.f92967b + i11) {
            int i12 = i11 + 1;
            if (b11 % t40.f.c()[i12] != 0) {
                break;
            } else {
                i11 = i12;
            }
        }
        int intValue = this.f92969d.get((this.f92968c - i11) - 1).intValue();
        if (i11 >= intValue) {
            i11 -= intValue;
        }
        String substring = String.valueOf((b11 / t40.f.c()[i11]) + t40.f.c()[this.f92968c - i11]).substring(1);
        g0.o(substring, "substring(...)");
        builder.append(substring);
    }
}
