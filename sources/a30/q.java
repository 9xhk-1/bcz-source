package a30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class q extends s10.h0 {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final d30.n f1848g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@m80.k n20.c fqName, @m80.k d30.n storageManager, @m80.k p10.a0 module) {
        super(module, fqName);
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(module, "module");
        this.f1848g = storageManager;
    }

    @m80.k
    public abstract i E0();

    public boolean F0(@m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        x20.k r11 = r();
        return (r11 instanceof c30.w) && ((c30.w) r11).u().contains(name);
    }

    public abstract void G0(@m80.k m mVar);
}
