package com.tencent.bugly.proguard;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private StringBuilder f42608a;

    /* renamed from: b, reason: collision with root package name */
    private int f42609b;

    public i(StringBuilder sb2, int i11) {
        this.f42608a = sb2;
        this.f42609b = i11;
    }

    private void a(String str) {
        for (int i11 = 0; i11 < this.f42609b; i11++) {
            this.f42608a.append('\t');
        }
        if (str != null) {
            StringBuilder sb2 = this.f42608a;
            sb2.append(str);
            sb2.append(": ");
        }
    }

    public final i a(boolean z11, String str) {
        a(str);
        StringBuilder sb2 = this.f42608a;
        sb2.append(z11 ? 'T' : 'F');
        sb2.append('\n');
        return this;
    }

    public final i a(byte b11, String str) {
        a(str);
        StringBuilder sb2 = this.f42608a;
        sb2.append((int) b11);
        sb2.append('\n');
        return this;
    }

    private i a(char c11, String str) {
        a(str);
        StringBuilder sb2 = this.f42608a;
        sb2.append(c11);
        sb2.append('\n');
        return this;
    }

    public final i a(short s11, String str) {
        a(str);
        StringBuilder sb2 = this.f42608a;
        sb2.append((int) s11);
        sb2.append('\n');
        return this;
    }

    public final i a(int i11, String str) {
        a(str);
        StringBuilder sb2 = this.f42608a;
        sb2.append(i11);
        sb2.append('\n');
        return this;
    }

    public final i a(long j11, String str) {
        a(str);
        StringBuilder sb2 = this.f42608a;
        sb2.append(j11);
        sb2.append('\n');
        return this;
    }

    private i a(float f11, String str) {
        a(str);
        StringBuilder sb2 = this.f42608a;
        sb2.append(f11);
        sb2.append('\n');
        return this;
    }

    private i a(double d11, String str) {
        a(str);
        StringBuilder sb2 = this.f42608a;
        sb2.append(d11);
        sb2.append('\n');
        return this;
    }

    public final i a(String str, String str2) {
        a(str2);
        if (str == null) {
            this.f42608a.append("null\n");
            return this;
        }
        StringBuilder sb2 = this.f42608a;
        sb2.append(str);
        sb2.append('\n');
        return this;
    }

    public final i a(byte[] bArr, String str) {
        a(str);
        if (bArr == null) {
            this.f42608a.append("null\n");
            return this;
        }
        if (bArr.length == 0) {
            StringBuilder sb2 = this.f42608a;
            sb2.append(bArr.length);
            sb2.append(", []\n");
            return this;
        }
        StringBuilder sb3 = this.f42608a;
        sb3.append(bArr.length);
        sb3.append(", [\n");
        i iVar = new i(this.f42608a, this.f42609b + 1);
        for (byte b11 : bArr) {
            iVar.a(b11, (String) null);
        }
        a(l50.b.f69930l, (String) null);
        return this;
    }

    private i a(short[] sArr, String str) {
        a(str);
        if (sArr == null) {
            this.f42608a.append("null\n");
            return this;
        }
        if (sArr.length == 0) {
            StringBuilder sb2 = this.f42608a;
            sb2.append(sArr.length);
            sb2.append(", []\n");
            return this;
        }
        StringBuilder sb3 = this.f42608a;
        sb3.append(sArr.length);
        sb3.append(", [\n");
        i iVar = new i(this.f42608a, this.f42609b + 1);
        for (short s11 : sArr) {
            iVar.a(s11, (String) null);
        }
        a(l50.b.f69930l, (String) null);
        return this;
    }

    private i a(int[] iArr, String str) {
        a(str);
        if (iArr == null) {
            this.f42608a.append("null\n");
            return this;
        }
        if (iArr.length == 0) {
            StringBuilder sb2 = this.f42608a;
            sb2.append(iArr.length);
            sb2.append(", []\n");
            return this;
        }
        StringBuilder sb3 = this.f42608a;
        sb3.append(iArr.length);
        sb3.append(", [\n");
        i iVar = new i(this.f42608a, this.f42609b + 1);
        for (int i11 : iArr) {
            iVar.a(i11, (String) null);
        }
        a(l50.b.f69930l, (String) null);
        return this;
    }

    private i a(long[] jArr, String str) {
        a(str);
        if (jArr == null) {
            this.f42608a.append("null\n");
            return this;
        }
        if (jArr.length == 0) {
            StringBuilder sb2 = this.f42608a;
            sb2.append(jArr.length);
            sb2.append(", []\n");
            return this;
        }
        StringBuilder sb3 = this.f42608a;
        sb3.append(jArr.length);
        sb3.append(", [\n");
        i iVar = new i(this.f42608a, this.f42609b + 1);
        for (long j11 : jArr) {
            iVar.a(j11, (String) null);
        }
        a(l50.b.f69930l, (String) null);
        return this;
    }

    private i a(float[] fArr, String str) {
        a(str);
        if (fArr == null) {
            this.f42608a.append("null\n");
            return this;
        }
        if (fArr.length == 0) {
            StringBuilder sb2 = this.f42608a;
            sb2.append(fArr.length);
            sb2.append(", []\n");
            return this;
        }
        StringBuilder sb3 = this.f42608a;
        sb3.append(fArr.length);
        sb3.append(", [\n");
        i iVar = new i(this.f42608a, this.f42609b + 1);
        for (float f11 : fArr) {
            iVar.a(f11, (String) null);
        }
        a(l50.b.f69930l, (String) null);
        return this;
    }

    private i a(double[] dArr, String str) {
        a(str);
        if (dArr == null) {
            this.f42608a.append("null\n");
            return this;
        }
        if (dArr.length == 0) {
            StringBuilder sb2 = this.f42608a;
            sb2.append(dArr.length);
            sb2.append(", []\n");
            return this;
        }
        StringBuilder sb3 = this.f42608a;
        sb3.append(dArr.length);
        sb3.append(", [\n");
        i iVar = new i(this.f42608a, this.f42609b + 1);
        for (double d11 : dArr) {
            iVar.a(d11, (String) null);
        }
        a(l50.b.f69930l, (String) null);
        return this;
    }

    public final <K, V> i a(Map<K, V> map, String str) {
        a(str);
        if (map == null) {
            this.f42608a.append("null\n");
            return this;
        }
        if (map.isEmpty()) {
            StringBuilder sb2 = this.f42608a;
            sb2.append(map.size());
            sb2.append(", {}\n");
            return this;
        }
        StringBuilder sb3 = this.f42608a;
        sb3.append(map.size());
        sb3.append(", {\n");
        i iVar = new i(this.f42608a, this.f42609b + 1);
        i iVar2 = new i(this.f42608a, this.f42609b + 2);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iVar.a('(', (String) null);
            iVar2.a((i) entry.getKey(), (String) null);
            iVar2.a((i) entry.getValue(), (String) null);
            iVar.a(')', (String) null);
        }
        a(l50.b.f69928j, (String) null);
        return this;
    }

    private <T> i a(T[] tArr, String str) {
        a(str);
        if (tArr == null) {
            this.f42608a.append("null\n");
            return this;
        }
        if (tArr.length == 0) {
            StringBuilder sb2 = this.f42608a;
            sb2.append(tArr.length);
            sb2.append(", []\n");
            return this;
        }
        StringBuilder sb3 = this.f42608a;
        sb3.append(tArr.length);
        sb3.append(", [\n");
        i iVar = new i(this.f42608a, this.f42609b + 1);
        for (T t11 : tArr) {
            iVar.a((i) t11, (String) null);
        }
        a(l50.b.f69930l, (String) null);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> i a(Collection<T> collection, String str) {
        if (collection == null) {
            a(str);
            this.f42608a.append("null\t");
            return this;
        }
        return a(collection.toArray(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> i a(T t11, String str) {
        if (t11 == 0) {
            this.f42608a.append("null\n");
            return this;
        }
        if (t11 instanceof Byte) {
            a(((Byte) t11).byteValue(), str);
            return this;
        }
        if (t11 instanceof Boolean) {
            a(((Boolean) t11).booleanValue(), str);
            return this;
        }
        if (t11 instanceof Short) {
            a(((Short) t11).shortValue(), str);
            return this;
        }
        if (t11 instanceof Integer) {
            a(((Integer) t11).intValue(), str);
            return this;
        }
        if (t11 instanceof Long) {
            a(((Long) t11).longValue(), str);
            return this;
        }
        if (t11 instanceof Float) {
            a(((Float) t11).floatValue(), str);
            return this;
        }
        if (t11 instanceof Double) {
            a(((Double) t11).doubleValue(), str);
            return this;
        }
        if (t11 instanceof String) {
            a((String) t11, str);
            return this;
        }
        if (t11 instanceof Map) {
            a((Map) t11, str);
            return this;
        }
        if (t11 instanceof List) {
            a((Collection) t11, str);
            return this;
        }
        if (t11 instanceof m) {
            a((m) t11, str);
            return this;
        }
        if (t11 instanceof byte[]) {
            a((byte[]) t11, str);
            return this;
        }
        if (t11 instanceof boolean[]) {
            a((i) t11, str);
            return this;
        }
        if (t11 instanceof short[]) {
            a((short[]) t11, str);
            return this;
        }
        if (t11 instanceof int[]) {
            a((int[]) t11, str);
            return this;
        }
        if (t11 instanceof long[]) {
            a((long[]) t11, str);
            return this;
        }
        if (t11 instanceof float[]) {
            a((float[]) t11, str);
            return this;
        }
        if (t11 instanceof double[]) {
            a((double[]) t11, str);
            return this;
        }
        if (t11.getClass().isArray()) {
            a((Object[]) t11, str);
            return this;
        }
        throw new j("write object error: unsupport type.");
    }

    public final i a(m mVar, String str) {
        a(l50.b.f69927i, str);
        if (mVar == null) {
            StringBuilder sb2 = this.f42608a;
            sb2.append('\t');
            sb2.append("null");
        } else {
            mVar.a(this.f42608a, this.f42609b + 1);
        }
        a(l50.b.f69928j, (String) null);
        return this;
    }
}
