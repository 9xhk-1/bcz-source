package io.ktor.server.testing;

import ix.p1;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements p1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p1 f61943d;

        public a(p1 p1Var) {
            this.f61943d = p1Var;
        }

        @Override // xy.u1
        public List<String> a(String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            return this.f61943d.a(name);
        }

        @Override // xy.u1
        public boolean b() {
            return this.f61943d.b();
        }

        @Override // xy.u1
        public boolean c(String str, String str2) {
            return p1.b.b(this, str, str2);
        }

        @Override // xy.u1
        public boolean contains(String str) {
            return p1.b.a(this, str);
        }

        @Override // xy.u1
        public void d(x00.p<? super String, ? super List<String>, g2> pVar) {
            p1.b.c(this, pVar);
        }

        @Override // xy.u1
        public Set<Map.Entry<String, List<String>>> entries() {
            return this.f61943d.entries();
        }

        @Override // xy.u1
        public String get(String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            List<String> a11 = a(name);
            if (a11 == null) {
                return null;
            }
            return a11.isEmpty() ? "" : (String) a00.r0.G2(a11);
        }

        @Override // xy.u1
        public boolean isEmpty() {
            return this.f61943d.isEmpty();
        }

        @Override // xy.u1
        public Set<String> names() {
            return this.f61943d.names();
        }
    }

    public static final p1 b(p1 p1Var) {
        return new a(p1Var);
    }
}
