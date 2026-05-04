package org.apache.thrift;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ShortStack {
    private int top = -1;
    private short[] vector;

    public ShortStack(int i11) {
        this.vector = new short[i11];
    }

    private void grow() {
        short[] sArr = this.vector;
        short[] sArr2 = new short[sArr.length * 2];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.vector = sArr2;
    }

    public void clear() {
        this.top = -1;
    }

    public short peek() {
        return this.vector[this.top];
    }

    public short pop() {
        short[] sArr = this.vector;
        int i11 = this.top;
        this.top = i11 - 1;
        return sArr[i11];
    }

    public void push(short s11) {
        if (this.vector.length == this.top + 1) {
            grow();
        }
        short[] sArr = this.vector;
        int i11 = this.top + 1;
        this.top = i11;
        sArr[i11] = s11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<ShortStack vector:[");
        for (int i11 = 0; i11 < this.vector.length; i11++) {
            if (i11 != 0) {
                sb2.append(" ");
            }
            if (i11 == this.top) {
                sb2.append(">>");
            }
            sb2.append((int) this.vector[i11]);
            if (i11 == this.top) {
                sb2.append("<<");
            }
        }
        sb2.append("]>");
        return sb2.toString();
    }
}
