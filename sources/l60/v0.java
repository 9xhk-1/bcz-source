package l60;

import java.util.List;
import java.util.RandomAccess;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v0 extends a00.d<ByteString> implements RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f70499c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ByteString[] f70500a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final int[] f70501b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,238:1\n1#2:239\n13870#3,3:240\n73#4:243\n73#4:244\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n48#1:240,3\n153#1:243\n210#1:244\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static /* synthetic */ void b(a aVar, long j11, k kVar, int i11, List list, int i12, int i13, List list2, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                j11 = 0;
            }
            aVar.a(j11, kVar, (i14 & 4) != 0 ? 0 : i11, list, (i14 & 16) != 0 ? 0 : i12, (i14 & 32) != 0 ? list.size() : i13, list2);
        }

        public final void a(long j11, k kVar, int i11, List<? extends ByteString> list, int i12, int i13, List<Integer> list2) {
            int i14;
            int i15;
            int i16;
            long j12;
            int i17 = i11;
            if (i12 >= i13) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i18 = i12; i18 < i13; i18++) {
                if (list.get(i18).size() < i17) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = list.get(i12);
            ByteString byteString2 = list.get(i13 - 1);
            if (i17 == byteString.size()) {
                int intValue = list2.get(i12).intValue();
                int i19 = i12 + 1;
                ByteString byteString3 = list.get(i19);
                i14 = i19;
                i15 = intValue;
                byteString = byteString3;
            } else {
                i14 = i12;
                i15 = -1;
            }
            if (byteString.getByte(i17) == byteString2.getByte(i17)) {
                int min = Math.min(byteString.size(), byteString2.size());
                int i21 = 0;
                for (int i22 = i17; i22 < min && byteString.getByte(i22) == byteString2.getByte(i22); i22++) {
                    i21++;
                }
                long c11 = j11 + c(kVar) + 2 + i21 + 1;
                kVar.writeInt(-i21);
                kVar.writeInt(i15);
                int i23 = i17 + i21;
                while (i17 < i23) {
                    kVar.writeInt(byteString.getByte(i17) & 255);
                    i17++;
                }
                if (i14 + 1 == i13) {
                    if (i23 != list.get(i14).size()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    kVar.writeInt(list2.get(i14).intValue());
                    return;
                } else {
                    k kVar2 = new k();
                    kVar.writeInt(((int) (c(kVar2) + c11)) * (-1));
                    a(c11, kVar2, i23, list, i14, i13, list2);
                    kVar.V2(kVar2);
                    return;
                }
            }
            int i24 = 1;
            for (int i25 = i14 + 1; i25 < i13; i25++) {
                if (list.get(i25 - 1).getByte(i17) != list.get(i25).getByte(i17)) {
                    i24++;
                }
            }
            long c12 = j11 + c(kVar) + 2 + (i24 * 2);
            kVar.writeInt(i24);
            kVar.writeInt(i15);
            for (int i26 = i14; i26 < i13; i26++) {
                byte b11 = list.get(i26).getByte(i17);
                if (i26 == i14 || b11 != list.get(i26 - 1).getByte(i17)) {
                    kVar.writeInt(b11 & 255);
                }
            }
            k kVar3 = new k();
            while (i14 < i13) {
                byte b12 = list.get(i14).getByte(i17);
                int i27 = i14 + 1;
                int i28 = i27;
                while (true) {
                    if (i28 >= i13) {
                        i16 = i13;
                        break;
                    } else {
                        if (b12 != list.get(i28).getByte(i17)) {
                            i16 = i28;
                            break;
                        }
                        i28++;
                    }
                }
                if (i27 == i16 && i17 + 1 == list.get(i14).size()) {
                    kVar.writeInt(list2.get(i14).intValue());
                    j12 = c12;
                } else {
                    kVar.writeInt(((int) (c(kVar3) + c12)) * (-1));
                    j12 = c12;
                    a(j12, kVar3, i17 + 1, list, i14, i16, list2);
                }
                c12 = j12;
                i14 = i16;
            }
            kVar.V2(kVar3);
        }

        public final long c(k kVar) {
            return kVar.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
        
            continue;
         */
        @w00.o
        @m80.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final l60.v0 d(@m80.k okio.ByteString... r17) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: l60.v0.a.d(okio.ByteString[]):l60.v0");
        }

        public a() {
        }
    }

    public /* synthetic */ v0(ByteString[] byteStringArr, int[] iArr, kotlin.jvm.internal.v vVar) {
        this(byteStringArr, iArr);
    }

    @w00.o
    @m80.k
    public static final v0 l(@m80.k ByteString... byteStringArr) {
        return f70499c.d(byteStringArr);
    }

    @Override // a00.b, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return d((ByteString) obj);
        }
        return false;
    }

    public /* bridge */ boolean d(ByteString byteString) {
        return super.contains(byteString);
    }

    @Override // a00.d, java.util.List
    @m80.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ByteString get(int i11) {
        return this.f70500a[i11];
    }

    @m80.k
    public final ByteString[] g() {
        return this.f70500a;
    }

    @Override // a00.d, a00.b
    public int getSize() {
        return this.f70500a.length;
    }

    @m80.k
    public final int[] h() {
        return this.f70501b;
    }

    @Override // a00.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return j((ByteString) obj);
        }
        return -1;
    }

    public /* bridge */ int j(ByteString byteString) {
        return super.indexOf(byteString);
    }

    public /* bridge */ int k(ByteString byteString) {
        return super.lastIndexOf(byteString);
    }

    @Override // a00.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return k((ByteString) obj);
        }
        return -1;
    }

    public v0(ByteString[] byteStringArr, int[] iArr) {
        this.f70500a = byteStringArr;
        this.f70501b = iArr;
    }
}
