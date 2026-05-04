package w40;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNumberConsumer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NumberConsumer.kt\nkotlinx/datetime/internal/format/parser/ReducedIntConsumer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
/* loaded from: classes8.dex */
public final class x<Receiver> extends e<Receiver> {

    /* renamed from: c, reason: collision with root package name */
    public final int f95291c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final a<Receiver, Integer> f95292d;

    /* renamed from: e, reason: collision with root package name */
    public final int f95293e;

    /* renamed from: f, reason: collision with root package name */
    public final int f95294f;

    /* renamed from: g, reason: collision with root package name */
    public final int f95295g;

    /* renamed from: h, reason: collision with root package name */
    public final int f95296h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(int i11, @m80.k a<? super Receiver, Integer> setter, @m80.k String name, int i12) {
        super(Integer.valueOf(i11), name, null);
        g0.p(setter, "setter");
        g0.p(name, "name");
        this.f95291c = i11;
        this.f95292d = setter;
        this.f95293e = i12;
        int i13 = t40.f.c()[b().intValue()];
        this.f95294f = i13;
        int i14 = i12 % i13;
        this.f95295g = i14;
        this.f95296h = i12 - i14;
        int intValue = b().intValue();
        if (1 > intValue || intValue >= 10) {
            throw new IllegalArgumentException(("Invalid length for field " + c() + ": " + b().intValue()).toString());
        }
    }

    @Override // w40.e
    @m80.l
    public g a(Receiver receiver, @m80.k CharSequence input, int i11, int i12) {
        int d11;
        g f11;
        g0.p(input, "input");
        d11 = f.d(input, i11, i12);
        f11 = f.f(this.f95292d, receiver, Integer.valueOf((d11 >= this.f95295g ? this.f95296h : this.f95296h + this.f95294f) + d11));
        return f11;
    }

    @Override // w40.e
    @m80.k
    public Integer b() {
        return Integer.valueOf(this.f95291c);
    }

    public final int d() {
        return this.f95293e;
    }
}
