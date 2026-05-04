package y20;

import e30.r0;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b extends a implements f {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final p10.b f99216c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final n20.f f99217d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@m80.k p10.b classDescriptor, @m80.k r0 receiverType, @l n20.f fVar, @l h hVar) {
        super(receiverType, hVar);
        g0.p(classDescriptor, "classDescriptor");
        g0.p(receiverType, "receiverType");
        this.f99216c = classDescriptor;
        this.f99217d = fVar;
    }

    @Override // y20.f
    @l
    public n20.f a() {
        return this.f99217d;
    }

    @m80.k
    public String toString() {
        return getType() + ": Ctx { " + this.f99216c + " }";
    }
}
