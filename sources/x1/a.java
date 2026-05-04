package x1;

import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a implements Comparable<a> {

    /* renamed from: c, reason: collision with root package name */
    public static final com.badlogic.gdx.utils.a<String> f97000c = new com.badlogic.gdx.utils.a<>();

    /* renamed from: d, reason: collision with root package name */
    public static final int f97001d = 64;

    /* renamed from: a, reason: collision with root package name */
    public final long f97002a;

    /* renamed from: b, reason: collision with root package name */
    public final int f97003b;

    public a(long j11) {
        this.f97002a = j11;
        this.f97003b = Long.numberOfTrailingZeros(j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        r7 = x1.a.f97000c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r0 >= r7.f13179b) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        return r7.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String c(long r7) {
        /*
            r0 = -1
        L1:
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 == 0) goto L17
            int r0 = r0 + 1
            r3 = 63
            if (r0 >= r3) goto L17
            long r3 = r7 >> r0
            r5 = 1
            long r3 = r3 & r5
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L17
            goto L1
        L17:
            if (r0 < 0) goto L26
            com.badlogic.gdx.utils.a<java.lang.String> r7 = x1.a.f97000c
            int r8 = r7.f13179b
            if (r0 >= r8) goto L26
            java.lang.Object r7 = r7.get(r0)
            java.lang.String r7 = (java.lang.String) r7
            return r7
        L26:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.a.c(long):java.lang.String");
    }

    public static final long d(String str) {
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<String> aVar = f97000c;
            if (i11 >= aVar.f13179b) {
                return 0L;
            }
            if (aVar.get(i11).compareTo(str) == 0) {
                return 1 << i11;
            }
            i11++;
        }
    }

    public static final long e(String str) {
        long d11 = d(str);
        if (d11 > 0) {
            return d11;
        }
        com.badlogic.gdx.utils.a<String> aVar = f97000c;
        if (aVar.f13179b < 64) {
            aVar.a(str);
            return 1 << (aVar.f13179b - 1);
        }
        throw new GdxRuntimeException("Cannot register " + str + ", maximum registered attribute count reached.");
    }

    public abstract a a();

    public boolean b(a aVar) {
        return aVar.hashCode() == hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f97002a != aVar.f97002a) {
            return false;
        }
        return b(aVar);
    }

    public int hashCode() {
        return this.f97003b * 7489;
    }

    public String toString() {
        return c(this.f97002a);
    }
}
