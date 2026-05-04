package a3;

import a3.x0;
import java.io.DataOutputStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m extends o {

    /* renamed from: a, reason: collision with root package name */
    public final x0.a f1576a;

    public m() {
        this(32);
    }

    public byte[] e() {
        return this.f1576a.a();
    }

    public byte[] f() {
        return this.f1576a.toByteArray();
    }

    public m(int i11) {
        super(new x0.a(i11));
        this.f1576a = (x0.a) ((DataOutputStream) this).out;
    }
}
