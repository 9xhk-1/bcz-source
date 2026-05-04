package ku;

import com.typesafe.config.ConfigException;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class z1 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public ju.d f68889a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        ju.p a(String str, ju.o oVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final ju.c f68891a;

        public c(ju.c cVar) {
            this.f68891a = cVar;
        }

        @Override // ku.z1.a
        public ju.p a(String str, ju.o oVar) {
            ju.p a11 = this.f68891a.a(str);
            if (a11 != null) {
                return a11;
            }
            return r0.o(str, "include was not found: '" + str + "'", oVar);
        }
    }

    public z1(ju.d dVar) {
        this.f68889a = dVar;
    }

    public static ju.o f(ju.o oVar) {
        return oVar.m(null).l(null).i(true);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:7|(10:53|54|55|(3:47|48|49)|(4:42|43|19|(2:(1:40)|41)(4:22|(1:24)|25|(5:27|(2:30|28)|31|32|33)(2:35|36)))|18|19|(0)|(2:38|40)|41)|11|(1:13)|47|48|49|(1:16)|42|43|19|(0)|(0)|41) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c4, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c5, code lost:
    
        r2.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a3, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
    
        r2.add(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ju.l g(ku.z1.a r9, java.lang.String r10, ju.o r11) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ku.z1.g(ku.z1$a, java.lang.String, ju.o):ju.l");
    }

    public static ju.l h(ju.c cVar, File file) {
        return com.typesafe.config.a.L(file, cVar.b()).root();
    }

    public static ju.l i(ju.c cVar, String str) {
        return com.typesafe.config.a.d0(str, cVar.b()).root();
    }

    public static ju.l j(ju.c cVar, URL url) {
        return com.typesafe.config.a.h0(url, cVar.b()).root();
    }

    public static ju.l k(ju.c cVar, String str) {
        URL url;
        try {
            url = new URL(str);
        } catch (MalformedURLException unused) {
            url = null;
        }
        return url != null ? j(cVar, url) : g(new c(cVar), str, cVar.b());
    }

    public static n0 l(ju.d dVar) {
        return dVar instanceof n0 ? (n0) dVar : new b(dVar);
    }

    @Override // ju.f
    public ju.l a(ju.c cVar, File file) {
        ju.l h11 = h(cVar, file);
        ju.d dVar = this.f68889a;
        return (dVar == null || !(dVar instanceof ju.f)) ? h11 : h11.a((ju.k) ((ju.f) dVar).a(cVar, file));
    }

    @Override // ju.g
    public ju.l b(ju.c cVar, URL url) {
        ju.l j11 = j(cVar, url);
        ju.d dVar = this.f68889a;
        return (dVar == null || !(dVar instanceof ju.g)) ? j11 : j11.a((ju.k) ((ju.g) dVar).b(cVar, url));
    }

    @Override // ju.e
    public ju.l c(ju.c cVar, String str) {
        ju.l i11 = i(cVar, str);
        ju.d dVar = this.f68889a;
        return (dVar == null || !(dVar instanceof ju.e)) ? i11 : i11.a((ju.k) ((ju.e) dVar).c(cVar, str));
    }

    @Override // ju.d
    public ju.d d(ju.d dVar) {
        if (this == dVar) {
            throw new ConfigException.BugOrBroken("trying to create includer cycle");
        }
        ju.d dVar2 = this.f68889a;
        return dVar2 == dVar ? this : dVar2 != null ? new z1(dVar2.d(dVar)) : new z1(dVar);
    }

    @Override // ju.d
    public ju.l e(ju.c cVar, String str) {
        ju.l k11 = k(cVar, str);
        ju.d dVar = this.f68889a;
        return dVar != null ? k11.a((ju.k) dVar.e(cVar, str)) : k11;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements n0 {

        /* renamed from: a, reason: collision with root package name */
        public final ju.d f68890a;

        public b(ju.d dVar) {
            this.f68890a = dVar;
        }

        @Override // ju.f
        public ju.l a(ju.c cVar, File file) {
            ju.d dVar = this.f68890a;
            return dVar instanceof ju.f ? ((ju.f) dVar).a(cVar, file) : z1.h(cVar, file);
        }

        @Override // ju.g
        public ju.l b(ju.c cVar, URL url) {
            ju.d dVar = this.f68890a;
            return dVar instanceof ju.g ? ((ju.g) dVar).b(cVar, url) : z1.j(cVar, url);
        }

        @Override // ju.e
        public ju.l c(ju.c cVar, String str) {
            ju.d dVar = this.f68890a;
            return dVar instanceof ju.e ? ((ju.e) dVar).c(cVar, str) : z1.i(cVar, str);
        }

        @Override // ju.d
        public ju.l e(ju.c cVar, String str) {
            return this.f68890a.e(cVar, str);
        }

        @Override // ju.d
        public ju.d d(ju.d dVar) {
            return this;
        }
    }
}
