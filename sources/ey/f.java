package ey;

import a00.i0;
import a00.r0;
import io.ktor.server.config.ApplicationConfigurationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ju.t;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHoconApplicationConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HoconApplicationConfig.kt\nio/ktor/server/config/HoconApplicationConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1557#2:95\n1628#2,3:96\n1557#2:99\n1628#2,3:100\n*S KotlinDebug\n*F\n+ 1 HoconApplicationConfig.kt\nio/ktor/server/config/HoconApplicationConfig\n*L\n59#1:95\n59#1:96,3\n65#1:99\n65#1:100,3\n*E\n"})
/* loaded from: classes8.dex */
public class f implements ey.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ju.a f50231a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final ju.a f50232a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f50233b;

        public a(@m80.k ju.a config, @m80.k String path) {
            g0.p(config, "config");
            g0.p(path, "path");
            this.f50232a = config;
            this.f50233b = path;
        }

        @Override // ey.c
        @m80.k
        public List<String> a() {
            List<String> s11 = this.f50232a.s(this.f50233b);
            g0.o(s11, "getStringList(...)");
            return s11;
        }

        @m80.k
        public final ju.a b() {
            return this.f50232a;
        }

        @m80.k
        public final String c() {
            return this.f50233b;
        }

        @Override // ey.c
        @m80.k
        public String getString() {
            String string = this.f50232a.getString(this.f50233b);
            g0.o(string, "getString(...)");
            return string;
        }
    }

    public f(@m80.k ju.a config) {
        g0.p(config, "config");
        this.f50231a = config;
    }

    @Override // ey.a
    @m80.k
    public List<ey.a> a(@m80.k String path) {
        g0.p(path, "path");
        List<? extends ju.a> y11 = this.f50231a.y(path);
        g0.o(y11, "getConfigList(...)");
        List<? extends ju.a> list = y11;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        for (ju.a aVar : list) {
            g0.m(aVar);
            arrayList.add(new f(aVar));
        }
        return arrayList;
    }

    @Override // ey.a
    @m80.k
    public ey.a b(@m80.k String path) {
        g0.p(path, "path");
        ju.a O = this.f50231a.O(path);
        g0.o(O, "getConfig(...)");
        return new f(O);
    }

    @Override // ey.a
    @m80.k
    public Map<String, Object> c() {
        Map<String, Object> c11 = this.f50231a.root().c();
        g0.o(c11, "unwrapped(...)");
        return c11;
    }

    @Override // ey.a
    @m80.l
    public c d(@m80.k String path) {
        g0.p(path, "path");
        if (this.f50231a.m(path)) {
            return new a(this.f50231a, path);
        }
        return null;
    }

    @Override // ey.a
    @m80.k
    public c e(@m80.k String path) {
        g0.p(path, "path");
        if (this.f50231a.m(path)) {
            return new a(this.f50231a, path);
        }
        throw new ApplicationConfigurationException("Property " + path + " not found.");
    }

    @Override // ey.a
    @m80.k
    public Set<String> keys() {
        Set<Map.Entry<String, t>> entrySet = this.f50231a.entrySet();
        g0.o(entrySet, "entrySet(...)");
        Set<Map.Entry<String, t>> set = entrySet;
        ArrayList arrayList = new ArrayList(i0.d0(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return r0.f6(arrayList);
    }
}
