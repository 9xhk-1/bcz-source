package o4;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f75710a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final String f75711b = "h5";

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f75712c = "index.html";

    @k
    public final String a(@k String appName, @k String path) {
        g0.p(appName, "appName");
        g0.p(path, "path");
        return "h5/" + appName + '/' + path;
    }

    @k
    public final String b(@k String path) {
        g0.p(path, "path");
        return "resource/" + path;
    }
}
