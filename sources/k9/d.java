package k9;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public String f66077a;

    /* renamed from: b, reason: collision with root package name */
    public String f66078b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f66079c = null;

    public d(String database) {
        this.f66077a = database;
    }

    public static d b(String database) {
        return new d(database);
    }

    public d a(String sql, String... bindArgs) {
        this.f66078b = sql;
        this.f66079c = bindArgs;
        return this;
    }

    public void c(Context context) {
        context.getContentResolver().delete(com.baicizhan.client.business.dataset.provider.a.b(this.f66077a, this.f66078b), null, this.f66079c);
    }
}
