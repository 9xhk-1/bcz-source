package com.tencent.open.log;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class f implements Iterable<String> {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentLinkedQueue<String> f44560a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicInteger f44561b;

    public f() {
        this.f44560a = null;
        this.f44561b = null;
        this.f44560a = new ConcurrentLinkedQueue<>();
        this.f44561b = new AtomicInteger(0);
    }

    public int a(String str) {
        int length = str.length();
        this.f44560a.add(str);
        return this.f44561b.addAndGet(length);
    }

    public void b() {
        this.f44560a.clear();
        this.f44561b.set(0);
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this.f44560a.iterator();
    }

    public void a(Writer[] writerArr, char[] cArr) throws IOException {
        if (writerArr == null || cArr == null || cArr.length == 0 || writerArr.length < 2) {
            return;
        }
        Writer writer = writerArr[0];
        Writer writer2 = writerArr[1];
        int length = cArr.length;
        Iterator<String> it = iterator();
        int i11 = 0;
        int i12 = length;
        while (it.hasNext()) {
            String next = it.next();
            int length2 = next.length();
            int i13 = 0;
            while (length2 > 0) {
                int i14 = i12 > length2 ? length2 : i12;
                int i15 = i13 + i14;
                next.getChars(i13, i15, cArr, i11);
                i12 -= i14;
                i11 += i14;
                length2 -= i14;
                if (i12 == 0) {
                    if (writer != null) {
                        try {
                            writer.write(cArr, 0, length);
                        } catch (Exception unused) {
                        }
                    }
                    if (writer2 != null) {
                        try {
                            writer2.write(cArr, 0, length);
                        } catch (Exception unused2) {
                        }
                    }
                    i11 = 0;
                    i12 = length;
                }
                i13 = i15;
            }
        }
        if (i11 > 0) {
            if (writer != null) {
                try {
                    writer.write(cArr, 0, i11);
                } catch (Exception unused3) {
                }
            }
            if (writer2 != null) {
                try {
                    writer2.write(cArr, 0, i11);
                } catch (Exception unused4) {
                }
            }
        }
        if (writer != null) {
            try {
                writer.flush();
            } catch (Exception unused5) {
            }
        }
        if (writer2 != null) {
            try {
                writer2.flush();
            } catch (Exception unused6) {
            }
        }
    }

    public int a() {
        return this.f44561b.get();
    }
}
