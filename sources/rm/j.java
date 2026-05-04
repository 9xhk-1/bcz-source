package rm;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class j extends i {
    public j(l lVar) {
        super(lVar);
    }

    @Override // rm.i
    public void p(boolean z11) {
        this.f84277b.reset();
        if (!z11) {
            this.f84277b.postTranslate(this.f84278c.P(), this.f84278c.n() - this.f84278c.O());
        } else {
            this.f84277b.setTranslate(-(this.f84278c.o() - this.f84278c.Q()), this.f84278c.n() - this.f84278c.O());
            this.f84277b.postScale(-1.0f, 1.0f);
        }
    }
}
