package com.meizu.cloud.pushsdk.d.d;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes7.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f39775a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f39776b = new AtomicLong(0);

    /* renamed from: c, reason: collision with root package name */
    private final Map<Long, byte[]> f39777c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final List<Long> f39778d = new CopyOnWriteArrayList();

    public c(int i11) {
        this.f39775a = i11;
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public void a(com.meizu.cloud.pushsdk.d.a.a aVar) {
        b(aVar);
    }

    public long b(com.meizu.cloud.pushsdk.d.a.a aVar) {
        byte[] a11 = a.a((Map<String, String>) aVar.a());
        long andIncrement = this.f39776b.getAndIncrement();
        this.f39778d.add(Long.valueOf(andIncrement));
        this.f39777c.put(Long.valueOf(andIncrement), a11);
        return andIncrement;
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public long c() {
        return this.f39778d.size();
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public com.meizu.cloud.pushsdk.d.b.c d() {
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = new ArrayList();
        int c11 = (int) c();
        int i11 = this.f39775a;
        if (c11 > i11) {
            c11 = i11;
        }
        for (int i12 = 0; i12 < c11; i12++) {
            Long l11 = this.f39778d.get(i12);
            if (l11 != null) {
                com.meizu.cloud.pushsdk.d.a.c cVar = new com.meizu.cloud.pushsdk.d.a.c();
                cVar.a(a.a(this.f39777c.get(l11)));
                com.meizu.cloud.pushsdk.d.f.c.c("MemoryStore", " current key " + l11 + " payload " + cVar, new Object[0]);
                linkedList.add(l11);
                arrayList.add(cVar);
            }
        }
        return new com.meizu.cloud.pushsdk.d.b.c(arrayList, linkedList);
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public boolean a() {
        return true;
    }

    @Override // com.meizu.cloud.pushsdk.d.d.d
    public boolean a(long j11) {
        return this.f39778d.remove(Long.valueOf(j11)) && this.f39777c.remove(Long.valueOf(j11)) != null;
    }
}
