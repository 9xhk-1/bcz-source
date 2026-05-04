package f0;

import f0.k0;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c0.a
/* loaded from: classes3.dex */
public final class a extends k0.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f50245a;

    public a(@m80.k String str) {
        this.f50245a = str;
    }

    @m80.k
    public final String a() {
        return u30.k0.P5(this.f50245a, '/', null, 2, null);
    }

    @m80.k
    public final String c() {
        return this.f50245a;
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Migrate to filePath as it supports assets inside subfolders.")
    public static /* synthetic */ void b() {
    }
}
