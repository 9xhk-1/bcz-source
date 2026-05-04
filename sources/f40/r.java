package f40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r implements l00.c {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final l00.c f50963a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final StackTraceElement f50964b;

    public r(@m80.l l00.c cVar, @m80.k StackTraceElement stackTraceElement) {
        this.f50963a = cVar;
        this.f50964b = stackTraceElement;
    }

    @Override // l00.c
    @m80.l
    public l00.c getCallerFrame() {
        return this.f50963a;
    }

    @Override // l00.c
    @m80.k
    public StackTraceElement getStackTraceElement() {
        return this.f50964b;
    }
}
