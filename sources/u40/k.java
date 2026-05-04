package u40;

import a00.h0;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class k<Target> implements l<Target> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n<Target, t40.c> f91795a;

    /* renamed from: b, reason: collision with root package name */
    public final int f91796b;

    /* renamed from: c, reason: collision with root package name */
    public final int f91797c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<Integer> f91798d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReferenceImpl implements x00.l<Target, t40.c> {
        public a(Object obj) {
            super(1, obj, b.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t40.c invoke(Target target) {
            return (t40.c) ((b) this.receiver).c(target);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@m80.k n<? super Target, t40.c> field, int i11, int i12, @m80.k List<Integer> zerosToAdd) {
        g0.p(field, "field");
        g0.p(zerosToAdd, "zerosToAdd");
        this.f91795a = field;
        this.f91796b = i11;
        this.f91797c = i12;
        this.f91798d = zerosToAdd;
    }

    @Override // u40.l
    @m80.k
    public v40.e<Target> a() {
        return new v40.d(new a(this.f91795a.a()), this.f91796b, this.f91797c, this.f91798d);
    }

    @Override // u40.l
    @m80.k
    public w40.t<Target> b() {
        return new w40.t<>(a00.g0.l(new w40.k(a00.g0.l(new w40.d(this.f91796b, this.f91797c, this.f91795a.a(), this.f91795a.getName())))), h0.J());
    }

    @Override // u40.l
    @m80.k
    public final n<Target, t40.c> c() {
        return this.f91795a;
    }
}
