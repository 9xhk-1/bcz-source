package u40;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class e0<Target> implements l<Target> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final d0<Target> f91784a;

    /* renamed from: b, reason: collision with root package name */
    public final int f91785b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Integer f91786c;

    /* renamed from: d, reason: collision with root package name */
    public final int f91787d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<Target, Integer> {
        public a(Object obj) {
            super(1, obj, b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Target target) {
            return (Integer) ((b) this.receiver).c(target);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0(@m80.k d0<? super Target> field, int i11, @m80.l Integer num) {
        g0.p(field, "field");
        this.f91784a = field;
        this.f91785b = i11;
        this.f91786c = num;
        int d11 = field.d();
        this.f91787d = d11;
        if (i11 < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i11 + ") is negative").toString());
        }
        if (d11 < i11) {
            throw new IllegalArgumentException(("The maximum number of digits (" + d11 + ") is less than the minimum number of digits (" + i11 + ')').toString());
        }
        if (num == null || num.intValue() > i11) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i11 + ')').toString());
    }

    @Override // u40.l
    @m80.k
    public v40.e<Target> a() {
        v40.k kVar = new v40.k(new a(this.f91784a.a()), this.f91785b);
        Integer num = this.f91786c;
        return num != null ? new v40.i(kVar, num.intValue()) : kVar;
    }

    @Override // u40.l
    @m80.k
    public w40.t<Target> b() {
        return w40.s.h(Integer.valueOf(this.f91785b), Integer.valueOf(this.f91787d), this.f91786c, this.f91784a.a(), this.f91784a.getName(), false, 32, null);
    }

    @Override // u40.l
    public /* bridge */ /* synthetic */ n c() {
        return this.f91784a;
    }

    @m80.k
    public final d0<Target> e() {
        return this.f91784a;
    }
}
