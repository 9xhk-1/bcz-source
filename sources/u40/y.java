package u40;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class y<Target> implements l<Target> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n<Target, Integer> f91815a;

    /* renamed from: b, reason: collision with root package name */
    public final int f91816b;

    /* renamed from: c, reason: collision with root package name */
    public final int f91817c;

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
    public y(@m80.k n<? super Target, Integer> field, int i11, int i12) {
        g0.p(field, "field");
        this.f91815a = field;
        this.f91816b = i11;
        this.f91817c = i12;
    }

    @Override // u40.l
    @m80.k
    public v40.e<Target> a() {
        return new v40.f(new a(this.f91815a.a()), this.f91816b, this.f91817c);
    }

    @Override // u40.l
    @m80.k
    public w40.t<Target> b() {
        return w40.s.b(this.f91816b, this.f91817c, this.f91815a.a(), this.f91815a.getName());
    }

    @Override // u40.l
    @m80.k
    public final n<Target, Integer> c() {
        return this.f91815a;
    }
}
