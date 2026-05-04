package q0;

import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g f81361a;

    public e(@m80.k g gVar) {
        this.f81361a = gVar;
    }

    @Override // q0.h
    @l
    public Object a(@m80.k j00.c<? super g> cVar) {
        return this.f81361a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && g0.g(this.f81361a, ((e) obj).f81361a);
    }

    public int hashCode() {
        return this.f81361a.hashCode();
    }
}
