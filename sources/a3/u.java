package a3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class u<K, V> extends com.badlogic.gdx.utils.l<K, V> {
    public u() {
    }

    @Override // com.badlogic.gdx.utils.l
    public int hashCode() {
        int i11 = this.f13380a;
        K[] kArr = this.f13381b;
        V[] vArr = this.f13382c;
        int length = kArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            K k11 = kArr[i12];
            if (k11 != null) {
                i11 += System.identityHashCode(k11);
                V v11 = vArr[i12];
                if (v11 != null) {
                    i11 += v11.hashCode();
                }
            }
        }
        return i11;
    }

    @Override // com.badlogic.gdx.utils.l
    public int o(K k11) {
        if (k11 == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        K[] kArr = this.f13381b;
        int q11 = q(k11);
        while (true) {
            K k12 = kArr[q11];
            if (k12 == null) {
                return -(q11 + 1);
            }
            if (k12 == k11) {
                return q11;
            }
            q11 = (q11 + 1) & this.f13386g;
        }
    }

    @Override // com.badlogic.gdx.utils.l
    public int q(K k11) {
        return (int) ((System.identityHashCode(k11) * (-7046029254386353131L)) >>> this.f13385f);
    }

    public u(int i11) {
        super(i11);
    }

    public u(int i11, float f11) {
        super(i11, f11);
    }

    public u(u<K, V> uVar) {
        super(uVar);
    }
}
