package tz;

/* loaded from: classes8.dex */
public class q implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final v f91356a;

    /* renamed from: b, reason: collision with root package name */
    public final u f91357b;

    public q(u uVar, v vVar) {
        this.f91356a = vVar;
        this.f91357b = uVar;
    }

    public v a() {
        return this.f91356a;
    }

    public void b(byte[] bArr) {
        u uVar = this.f91357b;
        if (uVar != null) {
            uVar.c(bArr);
        } else {
            this.f91356a.c(bArr);
        }
    }

    public u c() {
        return this.f91357b;
    }

    public byte[] d() {
        u uVar = this.f91357b;
        return uVar != null ? uVar.h() : this.f91356a.f91385g;
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public q clone() {
        u uVar = this.f91357b;
        return new q(uVar == null ? null : uVar.clone(), this.f91356a.clone());
    }

    public q(v vVar) {
        this(null, vVar);
    }
}
