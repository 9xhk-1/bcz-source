package com.meizu.cloud.pushsdk.d.b.a;

import com.meizu.cloud.pushsdk.c.c.i;
import com.meizu.cloud.pushsdk.d.b.a;
import com.meizu.cloud.pushsdk.d.b.f;
import com.meizu.cloud.pushsdk.d.b.g;
import com.meizu.cloud.pushsdk.d.d.c;
import com.meizu.cloud.pushsdk.d.d.d;
import com.meizu.cloud.pushsdk.d.f.e;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
public class a extends com.meizu.cloud.pushsdk.d.b.a {

    /* renamed from: h, reason: collision with root package name */
    private final String f39700h;

    /* renamed from: i, reason: collision with root package name */
    private d f39701i;

    /* renamed from: j, reason: collision with root package name */
    private int f39702j;

    public a(a.C0476a c0476a) {
        super(c0476a);
        String simpleName = a.class.getSimpleName();
        this.f39700h = simpleName;
        com.meizu.cloud.pushsdk.d.d.a aVar = new com.meizu.cloud.pushsdk.d.d.a(this.f39681a, this.f39685e);
        this.f39701i = aVar;
        if (aVar.a()) {
            return;
        }
        this.f39701i = new c(this.f39685e);
        com.meizu.cloud.pushsdk.d.f.c.a(simpleName, "init memory store", new Object[0]);
    }

    private LinkedList<Boolean> b(LinkedList<Long> linkedList) {
        boolean z11;
        LinkedList<Boolean> linkedList2 = new LinkedList<>();
        LinkedList linkedList3 = new LinkedList();
        Iterator<Long> it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList3.add(b.a(a(it.next())));
        }
        com.meizu.cloud.pushsdk.d.f.c.b(this.f39700h, "Removal Futures: %s", Integer.valueOf(linkedList3.size()));
        for (int i11 = 0; i11 < linkedList3.size(); i11++) {
            try {
                z11 = ((Boolean) ((Future) linkedList3.get(i11)).get(5L, TimeUnit.SECONDS)).booleanValue();
            } catch (InterruptedException e11) {
                com.meizu.cloud.pushsdk.d.f.c.a(this.f39700h, "Removal Future was interrupted: %s", e11.getMessage());
                z11 = false;
                linkedList2.add(Boolean.valueOf(z11));
            } catch (ExecutionException e12) {
                com.meizu.cloud.pushsdk.d.f.c.a(this.f39700h, "Removal Future failed: %s", e12.getMessage());
                z11 = false;
                linkedList2.add(Boolean.valueOf(z11));
            } catch (TimeoutException e13) {
                com.meizu.cloud.pushsdk.d.f.c.a(this.f39700h, "Removal Future had a timeout: %s", e13.getMessage());
                z11 = false;
                linkedList2.add(Boolean.valueOf(z11));
            }
            linkedList2.add(Boolean.valueOf(z11));
        }
        return linkedList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.LinkedList<com.meizu.cloud.pushsdk.d.b.g> a(java.util.LinkedList<com.meizu.cloud.pushsdk.d.b.e> r8) {
        /*
            r7 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.Iterator r2 = r8.iterator()
        Le:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r2.next()
            com.meizu.cloud.pushsdk.d.b.e r3 = (com.meizu.cloud.pushsdk.d.b.e) r3
            com.meizu.cloud.pushsdk.c.c.i r3 = r3.a()
            java.util.concurrent.Callable r3 = r7.b(r3)
            java.util.concurrent.Future r3 = com.meizu.cloud.pushsdk.d.b.a.b.a(r3)
            r1.add(r3)
            goto Le
        L2a:
            java.lang.String r2 = r7.f39700h
            int r3 = r1.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "Request Futures: %s"
            com.meizu.cloud.pushsdk.d.f.c.b(r2, r4, r3)
            r2 = 0
        L3e:
            int r3 = r1.size()
            if (r2 >= r3) goto Lc9
            java.lang.Object r3 = r1.get(r2)     // Catch: java.util.concurrent.TimeoutException -> L59 java.util.concurrent.ExecutionException -> L5b java.lang.InterruptedException -> L5d
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3     // Catch: java.util.concurrent.TimeoutException -> L59 java.util.concurrent.ExecutionException -> L5b java.lang.InterruptedException -> L5d
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L59 java.util.concurrent.ExecutionException -> L5b java.lang.InterruptedException -> L5d
            r5 = 5
            java.lang.Object r3 = r3.get(r5, r4)     // Catch: java.util.concurrent.TimeoutException -> L59 java.util.concurrent.ExecutionException -> L5b java.lang.InterruptedException -> L5d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.util.concurrent.TimeoutException -> L59 java.util.concurrent.ExecutionException -> L5b java.lang.InterruptedException -> L5d
            int r3 = r3.intValue()     // Catch: java.util.concurrent.TimeoutException -> L59 java.util.concurrent.ExecutionException -> L5b java.lang.InterruptedException -> L5d
            goto L8f
        L59:
            r3 = move-exception
            goto L5f
        L5b:
            r3 = move-exception
            goto L6f
        L5d:
            r3 = move-exception
            goto L7f
        L5f:
            java.lang.String r4 = r7.f39700h
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r5 = "Request Future had a timeout: %s"
            com.meizu.cloud.pushsdk.d.f.c.a(r4, r5, r3)
            goto L8e
        L6f:
            java.lang.String r4 = r7.f39700h
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r5 = "Request Future failed: %s"
            com.meizu.cloud.pushsdk.d.f.c.a(r4, r5, r3)
            goto L8e
        L7f:
            java.lang.String r4 = r7.f39700h
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r5 = "Request Future was interrupted: %s"
            com.meizu.cloud.pushsdk.d.f.c.a(r4, r5, r3)
        L8e:
            r3 = -1
        L8f:
            java.lang.Object r4 = r8.get(r2)
            com.meizu.cloud.pushsdk.d.b.e r4 = (com.meizu.cloud.pushsdk.d.b.e) r4
            boolean r4 = r4.c()
            if (r4 == 0) goto Laf
            com.meizu.cloud.pushsdk.d.b.g r3 = new com.meizu.cloud.pushsdk.d.b.g
            java.lang.Object r4 = r8.get(r2)
            com.meizu.cloud.pushsdk.d.b.e r4 = (com.meizu.cloud.pushsdk.d.b.e) r4
            java.util.LinkedList r4 = r4.b()
            r5 = 1
            r3.<init>(r5, r4)
            r0.add(r3)
            goto Lc5
        Laf:
            com.meizu.cloud.pushsdk.d.b.g r4 = new com.meizu.cloud.pushsdk.d.b.g
            boolean r3 = r7.a(r3)
            java.lang.Object r5 = r8.get(r2)
            com.meizu.cloud.pushsdk.d.b.e r5 = (com.meizu.cloud.pushsdk.d.b.e) r5
            java.util.LinkedList r5 = r5.b()
            r4.<init>(r3, r5)
            r0.add(r4)
        Lc5:
            int r2 = r2 + 1
            goto L3e
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.d.b.a.a.a(java.util.LinkedList):java.util.LinkedList");
    }

    private Callable<Integer> b(final i iVar) {
        return new Callable<Integer>() { // from class: com.meizu.cloud.pushsdk.d.b.a.a.2
            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer call() {
                return Integer.valueOf(a.this.a(iVar));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (!e.a(this.f39681a)) {
            com.meizu.cloud.pushsdk.d.f.c.a(this.f39700h, "Emitter loop stopping: emitter offline.", new Object[0]);
        } else {
            if (this.f39701i.c() <= 0) {
                int i11 = this.f39702j;
                if (i11 >= this.f39684d) {
                    com.meizu.cloud.pushsdk.d.f.c.a(this.f39700h, "Emitter loop stopping: empty limit reached.", new Object[0]);
                    this.f39687g.compareAndSet(true, false);
                    f fVar = this.f39682b;
                    if (fVar != null) {
                        fVar.a(true);
                        return;
                    }
                    return;
                }
                this.f39702j = i11 + 1;
                com.meizu.cloud.pushsdk.d.f.c.a(this.f39700h, "Emitter database empty: " + this.f39702j, new Object[0]);
                try {
                    this.f39686f.sleep(this.f39683c);
                } catch (InterruptedException e11) {
                    com.meizu.cloud.pushsdk.d.f.c.a(this.f39700h, "Emitter thread sleep interrupted: " + e11.toString(), new Object[0]);
                }
                c();
                return;
            }
            this.f39702j = 0;
            LinkedList<g> a11 = a(a(this.f39701i.d()));
            com.meizu.cloud.pushsdk.d.f.c.c(this.f39700h, "Processing emitter results.", new Object[0]);
            LinkedList<Long> linkedList = new LinkedList<>();
            Iterator<g> it = a11.iterator();
            int i12 = 0;
            int i13 = 0;
            while (it.hasNext()) {
                g next = it.next();
                if (next.a()) {
                    linkedList.addAll(next.b());
                    i12 += next.b().size();
                } else {
                    i13 += next.b().size();
                    com.meizu.cloud.pushsdk.d.f.c.a(this.f39700h, "Request sending failed but we will retry later.", new Object[0]);
                }
            }
            b(linkedList);
            com.meizu.cloud.pushsdk.d.f.c.b(this.f39700h, "Success Count: %s", Integer.valueOf(i12));
            com.meizu.cloud.pushsdk.d.f.c.b(this.f39700h, "Failure Count: %s", Integer.valueOf(i13));
            f fVar2 = this.f39682b;
            if (fVar2 != null) {
                if (i13 != 0) {
                    fVar2.a(i12, i13);
                } else {
                    fVar2.a(i12);
                }
            }
            if (i13 <= 0 || i12 != 0) {
                c();
                return;
            } else {
                if (e.a(this.f39681a)) {
                    com.meizu.cloud.pushsdk.d.f.c.a(this.f39700h, "Ensure collector path is valid: %s", b());
                }
                com.meizu.cloud.pushsdk.d.f.c.a(this.f39700h, "Emitter loop stopping: failures.", new Object[0]);
            }
        }
        this.f39687g.compareAndSet(true, false);
    }

    private Callable<Boolean> a(final Long l11) {
        return new Callable<Boolean>() { // from class: com.meizu.cloud.pushsdk.d.b.a.a.3
            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean call() {
                return Boolean.valueOf(a.this.f39701i.a(l11.longValue()));
            }
        };
    }

    @Override // com.meizu.cloud.pushsdk.d.b.a
    public void a() {
        b.a(new Runnable() { // from class: com.meizu.cloud.pushsdk.d.b.a.a.1
            @Override // java.lang.Runnable
            public void run() {
                if (((com.meizu.cloud.pushsdk.d.b.a) a.this).f39687g.compareAndSet(false, true)) {
                    a.this.c();
                }
            }
        });
    }

    @Override // com.meizu.cloud.pushsdk.d.b.a
    public void a(com.meizu.cloud.pushsdk.d.a.a aVar, boolean z11) {
        this.f39701i.a(aVar);
        com.meizu.cloud.pushsdk.d.f.c.a(this.f39700h, "isRunning " + this.f39687g + " attemptEmit " + z11, new Object[0]);
        if (!z11) {
            try {
                this.f39686f.sleep(1L);
            } catch (InterruptedException e11) {
                com.meizu.cloud.pushsdk.d.f.c.a(this.f39700h, "Emitter add thread sleep interrupted: " + e11.toString(), new Object[0]);
            }
        }
        if (this.f39687g.compareAndSet(false, true)) {
            c();
        }
    }
}
