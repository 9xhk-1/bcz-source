package ku;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigSyntax;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class h0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68723a;

        static {
            int[] iArr = new int[r.values().length];
            f68723a = iArr;
            try {
                iArr[r.URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68723a[r.FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68723a[r.CLASSPATH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68723a[r.HEURISTIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public final c0 f68725b;

        /* renamed from: c, reason: collision with root package name */
        public final n0 f68726c;

        /* renamed from: d, reason: collision with root package name */
        public final ju.c f68727d;

        /* renamed from: e, reason: collision with root package name */
        public final ConfigSyntax f68728e;

        /* renamed from: f, reason: collision with root package name */
        public final ju.m f68729f;

        /* renamed from: a, reason: collision with root package name */
        public int f68724a = 1;

        /* renamed from: g, reason: collision with root package name */
        public final LinkedList<s0> f68730g = new LinkedList<>();

        /* renamed from: h, reason: collision with root package name */
        public int f68731h = 0;

        public b(ConfigSyntax configSyntax, ju.m mVar, c0 c0Var, n0 n0Var, ju.c cVar) {
            this.f68725b = c0Var;
            this.f68728e = configSyntax;
            this.f68729f = mVar;
            this.f68726c = n0Var;
            this.f68727d = cVar;
        }

        public static c a(s0 s0Var, d dVar) {
            ArrayList arrayList = new ArrayList();
            String b11 = s0Var.b();
            s0 j11 = s0Var.j();
            while (b11 != null) {
                arrayList.add(b11);
                if (j11 == null) {
                    break;
                }
                b11 = j11.b();
                j11 = j11.j();
            }
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            w1 w1Var = new w1(dVar.g().e(null), Collections.singletonMap((String) listIterator.previous(), dVar));
            while (listIterator.hasPrevious()) {
                w1Var = new w1(dVar.g().e(null), Collections.singletonMap(listIterator.previous(), w1Var));
            }
            return w1Var;
        }

        public final s0 b() {
            if (this.f68730g.isEmpty()) {
                throw new ConfigException.BugOrBroken("Bug in parser; tried to get current path when at root");
            }
            return new s0(this.f68730g.descendingIterator());
        }

        public final x1 c() {
            return ((x1) this.f68729f).f(this.f68724a);
        }

        public d d() {
            ArrayList arrayList = new ArrayList();
            d dVar = null;
            while (true) {
                boolean z11 = false;
                for (ku.a aVar : this.f68725b.c()) {
                    if (aVar instanceof v) {
                        arrayList.add(((v) aVar).d());
                    } else if (aVar instanceof e0) {
                        if (e2.l(((e0) aVar).c())) {
                            this.f68724a++;
                            if (z11 && dVar == null) {
                                arrayList.clear();
                            } else if (dVar != null) {
                                d e11 = dVar.e(dVar.g().i(new ArrayList<>(arrayList)));
                                arrayList.clear();
                                return e11;
                            }
                            z11 = true;
                        } else {
                            continue;
                        }
                    } else if (aVar instanceof w) {
                        dVar = k((w) aVar, arrayList);
                    }
                }
                return dVar;
            }
        }

        public final v1 e(u uVar) {
            this.f68731h++;
            x1 c11 = c();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z11 = false;
            d dVar = null;
            for (ku.a aVar : uVar.c()) {
                if (aVar instanceof v) {
                    arrayList2.add(((v) aVar).d());
                } else if ((aVar instanceof e0) && e2.l(((e0) aVar).c())) {
                    this.f68724a++;
                    if (z11 && dVar == null) {
                        arrayList2.clear();
                    } else if (dVar != null) {
                        arrayList.add(dVar.e(dVar.g().i(new ArrayList(arrayList2))));
                        arrayList2.clear();
                        dVar = null;
                    }
                    z11 = true;
                } else if (aVar instanceof ku.b) {
                    if (dVar != null) {
                        arrayList.add(dVar.e(dVar.g().i(new ArrayList(arrayList2))));
                        arrayList2.clear();
                    }
                    dVar = k((ku.b) aVar, arrayList2);
                }
                z11 = false;
            }
            if (dVar != null) {
                arrayList.add(dVar.e(dVar.g().i(new ArrayList(arrayList2))));
            }
            this.f68731h--;
            return new v1(c11, arrayList);
        }

        public final d f(x xVar) {
            if (this.f68728e == ConfigSyntax.JSON) {
                throw new ConfigException.BugOrBroken("Found a concatenation node in JSON");
            }
            ArrayList arrayList = new ArrayList(xVar.c().size());
            for (ku.a aVar : xVar.c()) {
                if (aVar instanceof ku.b) {
                    arrayList.add(k((ku.b) aVar, null));
                }
            }
            return i.U0(arrayList);
        }

        public final ConfigException g(String str) {
            return h(str, null);
        }

        public final ConfigException h(String str, Throwable th2) {
            return new ConfigException.Parse(c(), str, th2);
        }

        public final void i(Map<String, d> map, z zVar) {
            c cVar;
            boolean d11 = zVar.d();
            ju.c cVar2 = this.f68727d;
            ju.c c11 = cVar2.c(cVar2.b().i(!d11));
            int i11 = a.f68723a[zVar.e().ordinal()];
            if (i11 == 1) {
                try {
                    cVar = (c) this.f68726c.b(c11, new URL(zVar.f()));
                } catch (MalformedURLException e11) {
                    throw h("include url() specifies an invalid URL: " + zVar.f(), e11);
                }
            } else if (i11 == 2) {
                cVar = (c) this.f68726c.a(c11, new File(zVar.f()));
            } else if (i11 == 3) {
                cVar = (c) this.f68726c.c(c11, zVar.f());
            } else {
                if (i11 != 4) {
                    throw new ConfigException.BugOrBroken("should not be reached");
                }
                cVar = (c) this.f68726c.e(c11, zVar.f());
            }
            if (this.f68731h > 0 && cVar.N0() != b1.RESOLVED) {
                throw g("Due to current limitations of the config parser, when an include statement is nested inside a list value, ${} substitutions inside the included file cannot be resolved correctly. Either move the include outside of the list value or remove the ${} statements from the included file.");
            }
            if (!this.f68730g.isEmpty()) {
                cVar = cVar.I0(b());
            }
            for (String str : cVar.keySet()) {
                d dVar = cVar.get(str);
                d dVar2 = map.get(str);
                if (dVar2 != null) {
                    map.put(str, dVar.a(dVar2));
                } else {
                    map.put(str, dVar);
                }
            }
        }

        public final c j(a0 a0Var) {
            Map<String, d> hashMap = new HashMap<>();
            x1 c11 = c();
            ArrayList arrayList = new ArrayList(a0Var.c());
            List<String> arrayList2 = new ArrayList<>();
            int i11 = 0;
            boolean z11 = false;
            while (i11 < arrayList.size()) {
                ku.a aVar = (ku.a) arrayList.get(i11);
                if (aVar instanceof v) {
                    arrayList2.add(((v) aVar).d());
                } else {
                    if ((aVar instanceof e0) && e2.l(((e0) aVar).c())) {
                        this.f68724a++;
                        if (z11) {
                            arrayList2.clear();
                        }
                        z11 = true;
                    } else if (this.f68728e != ConfigSyntax.JSON && (aVar instanceof z)) {
                        i(hashMap, (z) aVar);
                    } else if (aVar instanceof y) {
                        y yVar = (y) aVar;
                        s0 e11 = yVar.d().e();
                        arrayList2.addAll(yVar.c());
                        this.f68730g.push(e11);
                        b2 f11 = yVar.f();
                        b2 b2Var = e2.f68710j;
                        if (f11 == b2Var) {
                            int i12 = this.f68731h;
                            if (i12 > 0) {
                                throw g("Due to current limitations of the config parser, += does not work nested inside a list. += expands to a ${} substitution and the path in ${} cannot currently refer to list elements. You might be able to move the += outside of the list and then refer to it from inside the list with ${}.");
                            }
                            this.f68731h = i12 + 1;
                        }
                        d k11 = k(yVar.g(), arrayList2);
                        if (yVar.f() == b2Var) {
                            this.f68731h--;
                            ArrayList arrayList3 = new ArrayList(2);
                            i0 i0Var = new i0(k11.g(), new a2(b(), true));
                            v1 v1Var = new v1(k11.g(), Collections.singletonList(k11));
                            arrayList3.add(i0Var);
                            arrayList3.add(v1Var);
                            k11 = i.U0(arrayList3);
                        }
                        if (i11 < arrayList.size() - 1) {
                            while (true) {
                                i11++;
                                if (i11 < arrayList.size()) {
                                    if (!(arrayList.get(i11) instanceof v)) {
                                        if (!(arrayList.get(i11) instanceof e0)) {
                                            break;
                                        }
                                        e0 e0Var = (e0) arrayList.get(i11);
                                        if (e0Var.c() != e2.f68703c && !e2.k(e0Var.c())) {
                                            break;
                                        }
                                    } else {
                                        k11 = k11.e(k11.g().i(Collections.singletonList(((v) arrayList.get(i11)).d())));
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i11--;
                        }
                        this.f68730g.pop();
                        String b11 = e11.b();
                        s0 j11 = e11.j();
                        if (j11 == null) {
                            d dVar = hashMap.get(b11);
                            if (dVar != null) {
                                if (this.f68728e == ConfigSyntax.JSON) {
                                    throw g("JSON does not allow duplicate fields: '" + b11 + "' was already seen at " + dVar.g().description());
                                }
                                k11 = k11.a(dVar);
                            }
                            hashMap.put(b11, k11);
                        } else {
                            if (this.f68728e == ConfigSyntax.JSON) {
                                throw new ConfigException.BugOrBroken("somehow got multi-element path in JSON mode");
                            }
                            d a11 = a(j11, k11);
                            d dVar2 = hashMap.get(b11);
                            if (dVar2 != null) {
                                a11 = a11.R0(dVar2);
                            }
                            hashMap.put(b11, a11);
                        }
                    } else {
                        continue;
                    }
                    i11++;
                }
                z11 = false;
                i11++;
            }
            return new w1(c11, hashMap);
        }

        public final d k(ku.b bVar, List<String> list) {
            d f11;
            int i11 = this.f68731h;
            if (bVar instanceof d0) {
                f11 = ((d0) bVar).d();
            } else if (bVar instanceof a0) {
                f11 = j((a0) bVar);
            } else if (bVar instanceof u) {
                f11 = e((u) bVar);
            } else {
                if (!(bVar instanceof x)) {
                    throw g("Expecting a value but got wrong node type: " + bVar.getClass());
                }
                f11 = f((x) bVar);
            }
            if (list != null && !list.isEmpty()) {
                f11 = f11.e(f11.g().z(new ArrayList(list)));
                list.clear();
            }
            if (this.f68731h == i11) {
                return f11;
            }
            throw new ConfigException.BugOrBroken("Bug in config parser: unbalanced array count");
        }
    }

    public static d a(c0 c0Var, ju.m mVar, ju.o oVar, ju.c cVar) {
        return new b(oVar.g(), mVar, c0Var, z1.l(oVar.e()), cVar).d();
    }
}
