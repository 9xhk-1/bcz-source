package com.mob.commons.cc;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.File;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    static final HashMap<String, Class<?>> f40252a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<p> f40253b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<Object> f40254c;

    public l(ArrayList<p> arrayList, ArrayList<Object> arrayList2) {
        this.f40253b = arrayList;
        this.f40254c = arrayList2;
    }

    public void a(HashMap<String, Object> hashMap) throws Throwable {
        j jVar = new j(hashMap);
        a(jVar);
        a(0, this.f40253b.size(), jVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x001e, code lost:
    
        r0.f40284d = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r4, int r5, com.mob.commons.cc.j r6, java.util.List<java.lang.Object> r7) throws java.lang.Throwable {
        /*
            r3 = this;
            com.mob.commons.cc.p$a r0 = new com.mob.commons.cc.p$a
            r0.<init>()
            r0.f40281a = r4
            r0.f40282b = r6
            r0.f40283c = r7
            java.util.ArrayList<com.mob.commons.cc.p> r4 = r3.f40253b
            r0.f40286f = r4
            java.util.ArrayList<java.lang.Object> r4 = r3.f40254c
            r0.f40287g = r4
        L13:
            int r4 = r0.f40281a     // Catch: java.lang.Throwable -> L21
            if (r4 >= r5) goto L3b
            boolean r4 = r6.f()     // Catch: java.lang.Throwable -> L21
            r1 = 1
            if (r4 == 0) goto L23
            r0.f40284d = r1     // Catch: java.lang.Throwable -> L21
            goto L3b
        L21:
            r4 = move-exception
            goto L4f
        L23:
            java.util.ArrayList<com.mob.commons.cc.p> r4 = r3.f40253b     // Catch: java.lang.Throwable -> L21
            int r2 = r0.f40281a     // Catch: java.lang.Throwable -> L21
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L21
            com.mob.commons.cc.p r4 = (com.mob.commons.cc.p) r4     // Catch: java.lang.Throwable -> L21
            r4.a(r0)     // Catch: java.lang.Throwable -> L21
            boolean r4 = r0.f40285e     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L35
            goto L3b
        L35:
            int r4 = r0.f40281a     // Catch: java.lang.Throwable -> L21
            int r4 = r4 + r1
            r0.f40281a = r4     // Catch: java.lang.Throwable -> L21
            goto L13
        L3b:
            boolean r4 = r0.f40284d
            if (r4 != 0) goto L4e
            int r4 = r6.d()
            if (r4 <= 0) goto L4e
            if (r7 == 0) goto L4e
            java.lang.Object r4 = r6.a()     // Catch: java.lang.Throwable -> L4e
            r7.add(r4)     // Catch: java.lang.Throwable -> L4e
        L4e:
            return
        L4f:
            boolean r5 = r4 instanceof com.mob.commons.cc.m
            if (r5 != 0) goto L9d
            java.lang.String r5 = r4.getMessage()
            if (r5 == 0) goto L77
            com.mob.commons.cc.m r5 = new com.mob.commons.cc.m
            java.util.ArrayList<com.mob.commons.cc.p> r6 = r3.f40253b
            int r7 = r0.f40281a
            java.lang.Object r6 = r6.get(r7)
            com.mob.commons.cc.p r6 = (com.mob.commons.cc.p) r6
            java.lang.String r6 = r6.f40265b
            java.util.ArrayList<com.mob.commons.cc.p> r7 = r3.f40253b
            int r0 = r0.f40281a
            java.lang.Object r7 = r7.get(r0)
            com.mob.commons.cc.p r7 = (com.mob.commons.cc.p) r7
            int r7 = r7.f40266c
            r5.<init>(r4, r6, r7)
            throw r5
        L77:
            com.mob.commons.cc.m r5 = new com.mob.commons.cc.m
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.util.ArrayList<com.mob.commons.cc.p> r6 = r3.f40253b
            int r7 = r0.f40281a
            java.lang.Object r6 = r6.get(r7)
            com.mob.commons.cc.p r6 = (com.mob.commons.cc.p) r6
            java.lang.String r6 = r6.f40265b
            java.util.ArrayList<com.mob.commons.cc.p> r7 = r3.f40253b
            int r0 = r0.f40281a
            java.lang.Object r7 = r7.get(r0)
            com.mob.commons.cc.p r7 = (com.mob.commons.cc.p) r7
            int r7 = r7.f40266c
            r5.<init>(r4, r6, r7)
            throw r5
        L9d:
            com.mob.commons.cc.m r5 = new com.mob.commons.cc.m
            com.mob.commons.cc.m r4 = (com.mob.commons.cc.m) r4
            java.util.ArrayList<com.mob.commons.cc.p> r6 = r3.f40253b
            int r7 = r0.f40281a
            java.lang.Object r6 = r6.get(r7)
            com.mob.commons.cc.p r6 = (com.mob.commons.cc.p) r6
            java.lang.String r6 = r6.f40265b
            java.util.ArrayList<com.mob.commons.cc.p> r7 = r3.f40253b
            int r0 = r0.f40281a
            java.lang.Object r7 = r7.get(r0)
            com.mob.commons.cc.p r7 = (com.mob.commons.cc.p) r7
            int r7 = r7.f40266c
            r5.<init>(r4, r6, r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mob.commons.cc.l.a(int, int, com.mob.commons.cc.j, java.util.List):void");
    }

    private void a(j jVar) {
        jVar.a("Object", Object.class);
        jVar.a("Class", Class.class);
        jVar.a("String", String.class);
        jVar.a("Thread", Thread.class);
        jVar.a("Runnable", Runnable.class);
        jVar.a("System", System.class);
        jVar.a("File", File.class);
        jVar.a("URL", URL.class);
        jVar.a("Double", Double.class);
        jVar.a("Float", Float.class);
        jVar.a("Long", Long.class);
        jVar.a("Integer", Integer.class);
        jVar.a("Short", Short.class);
        jVar.a("Byte", Byte.class);
        jVar.a("Number", Number.class);
        jVar.a("Character", Character.class);
        jVar.a("Boolean", Boolean.class);
        jVar.a("double", Double.TYPE);
        jVar.a(TypedValues.Custom.S_FLOAT, Float.TYPE);
        jVar.a("long", Long.TYPE);
        jVar.a("int", Integer.TYPE);
        jVar.a("short", Short.TYPE);
        jVar.a("byte", Byte.TYPE);
        jVar.a("char", Character.TYPE);
        jVar.a(TypedValues.Custom.S_BOOLEAN, Boolean.TYPE);
        jVar.a("bigInt", BigInteger.class);
        jVar.a("BigInteger", BigInteger.class);
        jVar.a("bigDec", BigDecimal.class);
        jVar.a("BigDecimal", BigDecimal.class);
        jVar.a("List", List.class);
        jVar.a("Map", Map.class);
        jVar.a("Method", q.class);
        jVar.a("Function", q.class);
        jVar.a("fun", q.class);
        jVar.a("Range", r.class);
        jVar.a("Array", Array.class);
        jVar.a("Suba", n.class);
        for (Map.Entry<String, Class<?>> entry : f40252a.entrySet()) {
            jVar.a(entry.getKey(), entry.getValue());
        }
    }

    public ArrayList<p> a() {
        return this.f40253b;
    }
}
