package l40;

import c40.m3;
import java.util.Map;
import kotlin.coroutines.d;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.slf4j.MDC;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends kotlin.coroutines.a implements m3<Map<String, ? extends String>> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C0841a f69906b = new C0841a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Map<String, String> f69907a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: l40.a$a, reason: collision with other inner class name */
    public static final class C0841a implements d.c<a> {
        public /* synthetic */ C0841a(v vVar) {
            this();
        }

        public C0841a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void E(Map<String, String> map) {
        if (map == null) {
            MDC.clear();
        } else {
            MDC.setContextMap(map);
        }
    }

    @Override // c40.m3
    @l
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public Map<String, String> updateThreadContext(@k d dVar) {
        Map<String, String> copyOfContextMap = MDC.getCopyOfContextMap();
        E(this.f69907a);
        return copyOfContextMap;
    }

    @l
    public final Map<String, String> q() {
        return this.f69907a;
    }

    @Override // c40.m3
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void restoreThreadContext(@k d dVar, @l Map<String, String> map) {
        E(map);
    }

    public /* synthetic */ a(Map map, int i11, v vVar) {
        this((i11 & 1) != 0 ? MDC.getCopyOfContextMap() : map);
    }

    public a(@l Map<String, String> map) {
        super(f69906b);
        this.f69907a = map;
    }
}
