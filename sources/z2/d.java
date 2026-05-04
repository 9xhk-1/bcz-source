package z2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class d implements x2.c {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends x2.b {
    }

    @Override // x2.c
    public boolean a(x2.b bVar) {
        if (!(bVar instanceof a)) {
            return false;
        }
        b((a) bVar, bVar.e());
        return false;
    }

    public abstract void b(a aVar, com.badlogic.gdx.scenes.scene2d.a aVar2);
}
