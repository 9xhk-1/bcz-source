package l7;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public Integer f70550a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public Long f70551b;

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @m80.l
    public final Integer a() {
        return this.f70550a;
    }

    @m80.l
    public final Long b() {
        return this.f70551b;
    }

    public final void c(@m80.l Integer num) {
        this.f70550a = num;
    }

    public final void d(@m80.l Long l11) {
        this.f70551b = l11;
    }

    public e(@m80.l Integer num, @m80.l Long l11) {
        this.f70550a = num;
        this.f70551b = l11;
    }

    public /* synthetic */ e(Integer num, Long l11, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : l11);
    }
}
