package u40;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFieldFormatDirective.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FieldFormatDirective.kt\nkotlinx/datetime/internal/format/SignedIntFieldFormatDirective\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n1#2:221\n*E\n"})
/* loaded from: classes8.dex */
public abstract class b0<Target> implements l<Target> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n<Target, Integer> f91767a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final Integer f91768b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Integer f91769c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final Integer f91770d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final Integer f91771e;

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
    public b0(@m80.k n<? super Target, Integer> field, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Integer num4) {
        g0.p(field, "field");
        this.f91767a = field;
        this.f91768b = num;
        this.f91769c = num2;
        this.f91770d = num3;
        this.f91771e = num4;
        if (num != null && num.intValue() < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + num + ") is negative").toString());
        }
        if (num2 == null || num == null || num2.intValue() >= num.intValue()) {
            return;
        }
        throw new IllegalArgumentException(("The maximum number of digits (" + num2 + ") is less than the minimum number of digits (" + num + ')').toString());
    }

    @Override // u40.l
    @m80.k
    public v40.e<Target> a() {
        a aVar = new a(this.f91767a.a());
        Integer num = this.f91768b;
        v40.h hVar = new v40.h(aVar, num != null ? num.intValue() : 0, this.f91771e);
        Integer num2 = this.f91770d;
        return num2 != null ? new v40.i(hVar, num2.intValue()) : hVar;
    }

    @Override // u40.l
    @m80.k
    public w40.t<Target> b() {
        return w40.s.c(this.f91768b, this.f91769c, this.f91770d, this.f91767a.a(), this.f91767a.getName(), this.f91771e);
    }

    @Override // u40.l
    @m80.k
    public final n<Target, Integer> c() {
        return this.f91767a;
    }
}
