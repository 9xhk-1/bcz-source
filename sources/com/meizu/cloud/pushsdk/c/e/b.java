package com.meizu.cloud.pushsdk.c.e;

import com.meizu.cloud.pushsdk.c.c.g;
import com.meizu.cloud.pushsdk.c.c.j;
import com.meizu.cloud.pushsdk.c.g.f;
import com.meizu.cloud.pushsdk.c.g.l;
import java.io.IOException;

/* loaded from: classes7.dex */
public class b extends j {

    /* renamed from: a, reason: collision with root package name */
    private final j f39628a;

    /* renamed from: b, reason: collision with root package name */
    private com.meizu.cloud.pushsdk.c.g.c f39629b;

    /* renamed from: c, reason: collision with root package name */
    private d f39630c;

    public b(j jVar, com.meizu.cloud.pushsdk.c.d.a aVar) {
        this.f39628a = jVar;
        if (aVar != null) {
            this.f39630c = new d(aVar);
        }
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public g a() {
        return this.f39628a.a();
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public long b() throws IOException {
        return this.f39628a.b();
    }

    private l a(l lVar) {
        return new f(lVar) { // from class: com.meizu.cloud.pushsdk.c.e.b.1

            /* renamed from: a, reason: collision with root package name */
            long f39631a = 0;

            /* renamed from: b, reason: collision with root package name */
            long f39632b = 0;

            @Override // com.meizu.cloud.pushsdk.c.g.f, com.meizu.cloud.pushsdk.c.g.l
            public void a(com.meizu.cloud.pushsdk.c.g.b bVar, long j11) throws IOException {
                super.a(bVar, j11);
                if (this.f39632b == 0) {
                    this.f39632b = b.this.b();
                }
                this.f39631a += j11;
                if (b.this.f39630c != null) {
                    b.this.f39630c.obtainMessage(1, new com.meizu.cloud.pushsdk.c.f.a(this.f39631a, this.f39632b)).sendToTarget();
                }
            }
        };
    }

    @Override // com.meizu.cloud.pushsdk.c.c.j
    public void a(com.meizu.cloud.pushsdk.c.g.c cVar) throws IOException {
        if (this.f39629b == null) {
            this.f39629b = com.meizu.cloud.pushsdk.c.g.g.a(a((l) cVar));
        }
        this.f39628a.a(this.f39629b);
        this.f39629b.flush();
    }
}
