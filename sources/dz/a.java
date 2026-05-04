package dz;

import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends kotlin.coroutines.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C0579a f48245b = new C0579a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f48246a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dz.a$a, reason: collision with other inner class name */
    public static final class C0579a implements d.c<a> {
        public /* synthetic */ C0579a(v vVar) {
            this();
        }

        public C0579a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@k String pluginName) {
        super(f48245b);
        g0.p(pluginName, "pluginName");
        this.f48246a = pluginName;
    }

    public static /* synthetic */ a E(a aVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f48246a;
        }
        return aVar.w(str);
    }

    @k
    public final String H() {
        return this.f48246a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && g0.g(this.f48246a, ((a) obj).f48246a);
    }

    public int hashCode() {
        return this.f48246a.hashCode();
    }

    @k
    public final String q() {
        return this.f48246a;
    }

    @k
    public String toString() {
        return "PluginName(" + this.f48246a + ')';
    }

    @k
    public final a w(@k String pluginName) {
        g0.p(pluginName, "pluginName");
        return new a(pluginName);
    }
}
