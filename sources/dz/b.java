package dz;

import a00.r0;
import io.ktor.util.debug.plugins.PluginTraceElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b extends kotlin.coroutines.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f48247b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<PluginTraceElement> f48248a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements d.c<b> {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b E(b bVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = bVar.f48248a;
        }
        return bVar.w(list);
    }

    @k
    public final List<PluginTraceElement> H() {
        return this.f48248a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && g0.g(this.f48248a, ((b) obj).f48248a);
    }

    public int hashCode() {
        return this.f48248a.hashCode();
    }

    @k
    public final List<PluginTraceElement> q() {
        return this.f48248a;
    }

    @k
    public String toString() {
        return "PluginsTrace(" + r0.r3(this.f48248a, null, null, null, 0, null, null, 63, null) + ')';
    }

    @k
    public final b w(@k List<PluginTraceElement> eventOrder) {
        g0.p(eventOrder, "eventOrder");
        return new b(eventOrder);
    }

    public /* synthetic */ b(List list, int i11, v vVar) {
        this((i11 & 1) != 0 ? new ArrayList() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@k List<PluginTraceElement> eventOrder) {
        super(f48247b);
        g0.p(eventOrder, "eventOrder");
        this.f48248a = eventOrder;
    }
}
