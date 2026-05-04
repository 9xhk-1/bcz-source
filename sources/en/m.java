package en;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.ColorInt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final short f49927a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final short f49928b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final short f49929c = 512;

    /* renamed from: d, reason: collision with root package name */
    public static final short f49930d = 513;

    /* renamed from: e, reason: collision with root package name */
    public static final short f49931e = 514;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f49932f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f49933g = Byte.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public static final String f49934h = "color";

    /* renamed from: i, reason: collision with root package name */
    public static byte f49935i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f49936j = new d(1, "android");

    /* renamed from: k, reason: collision with root package name */
    public static final Comparator<b> f49937k = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Comparator<b> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.f49940c - bVar2.f49940c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte f49938a;

        /* renamed from: b, reason: collision with root package name */
        public final byte f49939b;

        /* renamed from: c, reason: collision with root package name */
        public final short f49940c;

        /* renamed from: d, reason: collision with root package name */
        public final String f49941d;

        /* renamed from: e, reason: collision with root package name */
        @ColorInt
        public final int f49942e;

        public b(int i11, String str, int i12) {
            this.f49941d = str;
            this.f49942e = i12;
            this.f49940c = (short) (65535 & i11);
            this.f49939b = (byte) ((i11 >> 16) & 255);
            this.f49938a = (byte) ((i11 >> 24) & 255);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: f, reason: collision with root package name */
        public static final short f49943f = 288;

        /* renamed from: g, reason: collision with root package name */
        public static final int f49944g = 128;

        /* renamed from: a, reason: collision with root package name */
        public final e f49945a;

        /* renamed from: b, reason: collision with root package name */
        public final d f49946b;

        /* renamed from: c, reason: collision with root package name */
        public final h f49947c = new h(false, "?1", "?2", "?3", "?4", "?5", "color");

        /* renamed from: d, reason: collision with root package name */
        public final h f49948d;

        /* renamed from: e, reason: collision with root package name */
        public final k f49949e;

        public c(d dVar, List<b> list) {
            this.f49946b = dVar;
            String[] strArr = new String[list.size()];
            for (int i11 = 0; i11 < list.size(); i11++) {
                strArr[i11] = list.get(i11).f49941d;
            }
            this.f49948d = new h(true, strArr);
            this.f49949e = new k(list);
            this.f49945a = new e(m.f49929c, f49943f, a());
        }

        public int a() {
            return this.f49947c.a() + 288 + this.f49948d.a() + this.f49949e.b();
        }

        public void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f49945a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(m.j(this.f49946b.f49950a));
            char[] charArray = this.f49946b.f49951b.toCharArray();
            for (int i11 = 0; i11 < 128; i11++) {
                if (i11 < charArray.length) {
                    byteArrayOutputStream.write(m.h(charArray[i11]));
                } else {
                    byteArrayOutputStream.write(m.h((char) 0));
                }
            }
            byteArrayOutputStream.write(m.j(288));
            byteArrayOutputStream.write(m.j(0));
            byteArrayOutputStream.write(m.j(this.f49947c.a() + 288));
            byteArrayOutputStream.write(m.j(0));
            byteArrayOutputStream.write(m.j(0));
            this.f49947c.c(byteArrayOutputStream);
            this.f49948d.c(byteArrayOutputStream);
            this.f49949e.c(byteArrayOutputStream);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f49950a;

        /* renamed from: b, reason: collision with root package name */
        public final String f49951b;

        public d(int i11, String str) {
            this.f49950a = i11;
            this.f49951b = str;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final short f49952a;

        /* renamed from: b, reason: collision with root package name */
        public final short f49953b;

        /* renamed from: c, reason: collision with root package name */
        public final int f49954c;

        public e(short s11, short s12, int i11) {
            this.f49952a = s11;
            this.f49953b = s12;
            this.f49954c = i11;
        }

        public void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(m.k(this.f49952a));
            byteArrayOutputStream.write(m.k(this.f49953b));
            byteArrayOutputStream.write(m.j(this.f49954c));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: c, reason: collision with root package name */
        public static final short f49955c = 8;

        /* renamed from: d, reason: collision with root package name */
        public static final short f49956d = 2;

        /* renamed from: e, reason: collision with root package name */
        public static final short f49957e = 8;

        /* renamed from: f, reason: collision with root package name */
        public static final byte f49958f = 28;

        /* renamed from: g, reason: collision with root package name */
        public static final int f49959g = 16;

        /* renamed from: a, reason: collision with root package name */
        public final int f49960a;

        /* renamed from: b, reason: collision with root package name */
        public final int f49961b;

        public f(int i11, @ColorInt int i12) {
            this.f49960a = i11;
            this.f49961b = i12;
        }

        public void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(m.k((short) 8));
            byteArrayOutputStream.write(m.k((short) 2));
            byteArrayOutputStream.write(m.j(this.f49960a));
            byteArrayOutputStream.write(m.k((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(m.j(this.f49961b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g {

        /* renamed from: e, reason: collision with root package name */
        public static final short f49962e = 12;

        /* renamed from: a, reason: collision with root package name */
        public final e f49963a;

        /* renamed from: b, reason: collision with root package name */
        public final int f49964b;

        /* renamed from: d, reason: collision with root package name */
        public final List<c> f49966d = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final h f49965c = new h(new String[0]);

        public g(Map<d, List<b>> map) {
            this.f49964b = map.size();
            for (Map.Entry<d, List<b>> entry : map.entrySet()) {
                List<b> value = entry.getValue();
                Collections.sort(value, m.f49937k);
                this.f49966d.add(new c(entry.getKey(), value));
            }
            this.f49963a = new e((short) 2, (short) 12, a());
        }

        public final int a() {
            Iterator<c> it = this.f49966d.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                i11 += it.next().a();
            }
            return this.f49965c.a() + 12 + i11;
        }

        public void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f49963a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(m.j(this.f49964b));
            this.f49965c.c(byteArrayOutputStream);
            Iterator<c> it = this.f49966d.iterator();
            while (it.hasNext()) {
                it.next().b(byteArrayOutputStream);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h {

        /* renamed from: m, reason: collision with root package name */
        public static final short f49967m = 28;

        /* renamed from: n, reason: collision with root package name */
        public static final int f49968n = 256;

        /* renamed from: o, reason: collision with root package name */
        public static final int f49969o = -1;

        /* renamed from: a, reason: collision with root package name */
        public final e f49970a;

        /* renamed from: b, reason: collision with root package name */
        public final int f49971b;

        /* renamed from: c, reason: collision with root package name */
        public final int f49972c;

        /* renamed from: d, reason: collision with root package name */
        public final int f49973d;

        /* renamed from: e, reason: collision with root package name */
        public final int f49974e;

        /* renamed from: f, reason: collision with root package name */
        public final List<Integer> f49975f;

        /* renamed from: g, reason: collision with root package name */
        public final List<Integer> f49976g;

        /* renamed from: h, reason: collision with root package name */
        public final List<byte[]> f49977h;

        /* renamed from: i, reason: collision with root package name */
        public final List<List<i>> f49978i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f49979j;

        /* renamed from: k, reason: collision with root package name */
        public final int f49980k;

        /* renamed from: l, reason: collision with root package name */
        public final int f49981l;

        public h(String... strArr) {
            this(false, strArr);
        }

        public int a() {
            return this.f49981l;
        }

        public final Pair<byte[], List<i>> b(String str) {
            return new Pair<>(this.f49979j ? m.m(str) : m.l(str), Collections.EMPTY_LIST);
        }

        public void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f49970a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(m.j(this.f49971b));
            byteArrayOutputStream.write(m.j(this.f49972c));
            byteArrayOutputStream.write(m.j(this.f49979j ? 256 : 0));
            byteArrayOutputStream.write(m.j(this.f49973d));
            byteArrayOutputStream.write(m.j(this.f49974e));
            Iterator<Integer> it = this.f49975f.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write(m.j(it.next().intValue()));
            }
            Iterator<Integer> it2 = this.f49976g.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(m.j(it2.next().intValue()));
            }
            Iterator<byte[]> it3 = this.f49977h.iterator();
            while (it3.hasNext()) {
                byteArrayOutputStream.write(it3.next());
            }
            int i11 = this.f49980k;
            if (i11 > 0) {
                byteArrayOutputStream.write(new byte[i11]);
            }
            Iterator<List<i>> it4 = this.f49978i.iterator();
            while (it4.hasNext()) {
                Iterator<i> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    it5.next().b(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(m.j(-1));
            }
        }

        public h(boolean z11, String... strArr) {
            this.f49975f = new ArrayList();
            this.f49976g = new ArrayList();
            this.f49977h = new ArrayList();
            this.f49978i = new ArrayList();
            this.f49979j = z11;
            int i11 = 0;
            for (String str : strArr) {
                Pair<byte[], List<i>> b11 = b(str);
                this.f49975f.add(Integer.valueOf(i11));
                Object obj = b11.first;
                i11 += ((byte[]) obj).length;
                this.f49977h.add((byte[]) obj);
                this.f49978i.add((List) b11.second);
            }
            int i12 = 0;
            for (List<i> list : this.f49978i) {
                for (i iVar : list) {
                    this.f49975f.add(Integer.valueOf(i11));
                    i11 += iVar.f49982a.length;
                    this.f49977h.add(iVar.f49982a);
                }
                this.f49976g.add(Integer.valueOf(i12));
                i12 += (list.size() * 12) + 4;
            }
            int i13 = i11 % 4;
            int i14 = i13 == 0 ? 0 : 4 - i13;
            this.f49980k = i14;
            int size = this.f49977h.size();
            this.f49971b = size;
            this.f49972c = this.f49977h.size() - strArr.length;
            boolean z12 = this.f49977h.size() - strArr.length > 0;
            if (!z12) {
                this.f49976g.clear();
                this.f49978i.clear();
            }
            int size2 = (size * 4) + 28 + (this.f49976g.size() * 4);
            this.f49973d = size2;
            int i15 = i11 + i14;
            this.f49974e = z12 ? size2 + i15 : 0;
            int i16 = size2 + i15 + (z12 ? i12 : 0);
            this.f49981l = i16;
            this.f49970a = new e((short) 1, (short) 28, i16);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f49982a;

        /* renamed from: b, reason: collision with root package name */
        public int f49983b;

        /* renamed from: c, reason: collision with root package name */
        public int f49984c;

        /* renamed from: d, reason: collision with root package name */
        public int f49985d;

        public void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(m.j(this.f49983b));
            byteArrayOutputStream.write(m.j(this.f49984c));
            byteArrayOutputStream.write(m.j(this.f49985d));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j {

        /* renamed from: f, reason: collision with root package name */
        public static final int f49986f = -1;

        /* renamed from: g, reason: collision with root package name */
        public static final short f49987g = 84;

        /* renamed from: h, reason: collision with root package name */
        public static final byte f49988h = 64;

        /* renamed from: a, reason: collision with root package name */
        public final e f49989a;

        /* renamed from: b, reason: collision with root package name */
        public final int f49990b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f49991c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f49992d;

        /* renamed from: e, reason: collision with root package name */
        public final f[] f49993e;

        public j(List<b> list, Set<Short> set, int i11) {
            byte[] bArr = new byte[64];
            this.f49991c = bArr;
            this.f49990b = i11;
            bArr[0] = 64;
            this.f49993e = new f[list.size()];
            for (int i12 = 0; i12 < list.size(); i12++) {
                this.f49993e[i12] = new f(i12, list.get(i12).f49942e);
            }
            this.f49992d = new int[i11];
            int i13 = 0;
            for (short s11 = 0; s11 < i11; s11 = (short) (s11 + 1)) {
                if (set.contains(Short.valueOf(s11))) {
                    this.f49992d[s11] = i13;
                    i13 += 16;
                } else {
                    this.f49992d[s11] = -1;
                }
            }
            this.f49989a = new e(m.f49930d, (short) 84, a());
        }

        public int a() {
            return b() + (this.f49993e.length * 16);
        }

        public final int b() {
            return c() + 84;
        }

        public final int c() {
            return this.f49992d.length * 4;
        }

        public void d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f49989a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{m.f49935i, 0, 0, 0});
            byteArrayOutputStream.write(m.j(this.f49990b));
            byteArrayOutputStream.write(m.j(b()));
            byteArrayOutputStream.write(this.f49991c);
            for (int i11 : this.f49992d) {
                byteArrayOutputStream.write(m.j(i11));
            }
            for (f fVar : this.f49993e) {
                fVar.a(byteArrayOutputStream);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k {

        /* renamed from: e, reason: collision with root package name */
        public static final short f49994e = 16;

        /* renamed from: f, reason: collision with root package name */
        public static final int f49995f = 1073741824;

        /* renamed from: a, reason: collision with root package name */
        public final e f49996a;

        /* renamed from: b, reason: collision with root package name */
        public final int f49997b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f49998c;

        /* renamed from: d, reason: collision with root package name */
        public final j f49999d;

        public k(List<b> list) {
            this.f49997b = list.get(list.size() - 1).f49940c + 1;
            HashSet hashSet = new HashSet();
            Iterator<b> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Short.valueOf(it.next().f49940c));
            }
            this.f49998c = new int[this.f49997b];
            for (short s11 = 0; s11 < this.f49997b; s11 = (short) (s11 + 1)) {
                if (hashSet.contains(Short.valueOf(s11))) {
                    this.f49998c[s11] = 1073741824;
                }
            }
            this.f49996a = new e(m.f49931e, (short) 16, a());
            this.f49999d = new j(list, hashSet, this.f49997b);
        }

        public final int a() {
            return (this.f49997b * 4) + 16;
        }

        public int b() {
            return a() + this.f49999d.a();
        }

        public void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f49996a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{m.f49935i, 0, 0, 0});
            byteArrayOutputStream.write(m.j(this.f49997b));
            for (int i11 : this.f49998c) {
                byteArrayOutputStream.write(m.j(i11));
            }
            this.f49999d.d(byteArrayOutputStream);
        }
    }

    public static byte[] h(char c11) {
        return new byte[]{(byte) (c11 & 255), (byte) ((c11 >> '\b') & 255)};
    }

    public static byte[] i(Context context, Map<Integer, Integer> map) throws IOException {
        d dVar;
        if (map.entrySet().isEmpty()) {
            throw new IllegalArgumentException("No color resources provided for harmonization.");
        }
        d dVar2 = new d(127, context.getPackageName());
        HashMap hashMap = new HashMap();
        b bVar = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            b bVar2 = new b(entry.getKey().intValue(), context.getResources().getResourceName(entry.getKey().intValue()), entry.getValue().intValue());
            if (!context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                throw new IllegalArgumentException("Non color resource found: name=" + bVar2.f49941d + ", typeId=" + Integer.toHexString(bVar2.f49939b & 255));
            }
            if (bVar2.f49938a == 1) {
                dVar = f49936j;
            } else {
                if (bVar2.f49938a != Byte.MAX_VALUE) {
                    throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) bVar2.f49938a));
                }
                dVar = dVar2;
            }
            if (!hashMap.containsKey(dVar)) {
                hashMap.put(dVar, new ArrayList());
            }
            ((List) hashMap.get(dVar)).add(bVar2);
            bVar = bVar2;
        }
        byte b11 = bVar.f49939b;
        f49935i = b11;
        if (b11 == 0) {
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new g(hashMap).b(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] j(int i11) {
        return new byte[]{(byte) (i11 & 255), (byte) ((i11 >> 8) & 255), (byte) ((i11 >> 16) & 255), (byte) ((i11 >> 24) & 255)};
    }

    public static byte[] k(short s11) {
        return new byte[]{(byte) (s11 & 255), (byte) ((s11 >> 8) & 255)};
    }

    public static byte[] l(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length * 2;
        byte[] bArr = new byte[length + 4];
        byte[] k11 = k((short) charArray.length);
        bArr[0] = k11[0];
        bArr[1] = k11[1];
        for (int i11 = 0; i11 < charArray.length; i11++) {
            byte[] h11 = h(charArray[i11]);
            int i12 = i11 * 2;
            bArr[i12 + 2] = h11[0];
            bArr[i12 + 3] = h11[1];
        }
        bArr[length + 2] = 0;
        bArr[length + 3] = 0;
        return bArr;
    }

    public static byte[] m(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length;
        byte[] bArr = new byte[length2 + 3];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 + 2] = 0;
        return bArr;
    }
}
