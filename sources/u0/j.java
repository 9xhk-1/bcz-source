package u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-Logs")
/* loaded from: classes3.dex */
public final class j {
    public static final void a(@m80.k w wVar, @m80.k String str, int i11, @m80.k x00.a<String> aVar) {
        if (wVar.getLevel() <= i11) {
            wVar.a(str, i11, aVar.invoke(), null);
        }
    }

    public static final void b(@m80.k w wVar, @m80.k String str, @m80.k Throwable th2) {
        if (wVar.getLevel() <= 6) {
            wVar.a(str, 6, null, th2);
        }
    }
}
