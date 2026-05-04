package ho;

import ho.d;
import java.util.BitSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.c
/* loaded from: classes7.dex */
public final class l0 extends d.v {

    /* renamed from: f, reason: collision with root package name */
    public static final int f59643f = 1023;

    /* renamed from: g, reason: collision with root package name */
    public static final int f59644g = -862048943;

    /* renamed from: h, reason: collision with root package name */
    public static final int f59645h = 461845907;

    /* renamed from: i, reason: collision with root package name */
    public static final double f59646i = 0.5d;

    /* renamed from: c, reason: collision with root package name */
    public final char[] f59647c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f59648d;

    /* renamed from: e, reason: collision with root package name */
    public final long f59649e;

    public l0(char[] table, long filter, boolean containsZero, String description) {
        super(description);
        this.f59647c = table;
        this.f59649e = filter;
        this.f59648d = containsZero;
    }

    @go.e
    public static int Z(int setSize) {
        if (setSize == 1) {
            return 2;
        }
        int highestOneBit = Integer.highestOneBit(setSize - 1) << 1;
        while (highestOneBit * 0.5d < setSize) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static d a0(BitSet chars, String description) {
        int i11;
        int cardinality = chars.cardinality();
        boolean z11 = chars.get(0);
        int Z = Z(cardinality);
        char[] cArr = new char[Z];
        int i12 = Z - 1;
        int nextSetBit = chars.nextSetBit(0);
        long j11 = 0;
        while (nextSetBit != -1) {
            long j12 = (1 << nextSetBit) | j11;
            int b02 = b0(nextSetBit);
            while (true) {
                i11 = b02 & i12;
                if (cArr[i11] == 0) {
                    break;
                }
                b02 = i11 + 1;
            }
            cArr[i11] = (char) nextSetBit;
            nextSetBit = chars.nextSetBit(nextSetBit + 1);
            j11 = j12;
        }
        return new l0(cArr, j11, z11, description);
    }

    public static int b0(int hashCode) {
        return Integer.rotateLeft(hashCode * (-862048943), 15) * 461845907;
    }

    @Override // ho.d
    public boolean B(char c11) {
        if (c11 == 0) {
            return this.f59648d;
        }
        if (!Y(c11)) {
            return false;
        }
        int length = this.f59647c.length - 1;
        int b02 = b0(c11) & length;
        int i11 = b02;
        do {
            char c12 = this.f59647c[i11];
            if (c12 == 0) {
                return false;
            }
            if (c12 == c11) {
                return true;
            }
            i11 = (i11 + 1) & length;
        } while (i11 != b02);
        return false;
    }

    @Override // ho.d
    public void Q(BitSet table) {
        if (this.f59648d) {
            table.set(0);
        }
        for (char c11 : this.f59647c) {
            if (c11 != 0) {
                table.set(c11);
            }
        }
    }

    public final boolean Y(int c11) {
        return 1 == ((this.f59649e >> c11) & 1);
    }
}
