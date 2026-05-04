package w40;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import w40.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNumberConsumer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NumberConsumer.kt\nkotlinx/datetime/internal/format/parser/UnsignedIntConsumer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
/* loaded from: classes8.dex */
public final class f0<Receiver> extends e<Receiver> {

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Integer f95252c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final Integer f95253d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final a<Receiver, Integer> f95254e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95255f;

    public /* synthetic */ f0(Integer num, Integer num2, a aVar, String str, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this(num, num2, aVar, str, (i11 & 16) != 0 ? false : z11);
    }

    @Override // w40.e
    @m80.l
    public g a(Receiver receiver, @m80.k CharSequence input, int i11, int i12) {
        Integer e11;
        g f11;
        g0.p(input, "input");
        Integer num = this.f95253d;
        if (num != null && i12 - i11 > num.intValue()) {
            return new g.d(this.f95253d.intValue());
        }
        Integer num2 = this.f95252c;
        if (num2 != null && i12 - i11 < num2.intValue()) {
            return new g.c(this.f95252c.intValue());
        }
        e11 = f.e(input, i11, i12);
        if (e11 == null) {
            return g.b.f95257a;
        }
        a<Receiver, Integer> aVar = this.f95254e;
        boolean z11 = this.f95255f;
        int intValue = e11.intValue();
        if (z11) {
            intValue = -intValue;
        }
        f11 = f.f(aVar, receiver, Integer.valueOf(intValue));
        return f11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(@m80.l Integer num, @m80.l Integer num2, @m80.k a<? super Receiver, Integer> setter, @m80.k String name, boolean z11) {
        super(g0.g(num, num2) ? num : null, name, null);
        g0.p(setter, "setter");
        g0.p(name, "name");
        this.f95252c = num;
        this.f95253d = num2;
        this.f95254e = setter;
        this.f95255f = z11;
        if (b() == null || new g10.l(1, 9).k(b().intValue())) {
            return;
        }
        throw new IllegalArgumentException(("Invalid length for field " + c() + ": " + b()).toString());
    }
}
